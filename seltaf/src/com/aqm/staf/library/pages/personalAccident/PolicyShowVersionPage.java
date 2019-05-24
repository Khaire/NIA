package com.aqm.staf.library.pages.personalAccident;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimPolPropertyTCLMEntity;
import com.aqm.staf.library.databin.ClaimPolPropertyTCLMEntity;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyShowVersionPageEntity;
import com.aqm.staf.library.pages.common.PolicyDetailsCreateEditPage;

public class PolicyShowVersionPage extends BasePage {
	private PageElement policyShowVersionPageTitle;
	
	
	private PageElement policyNumberLabel;
	private PageElement policyStatusLabel;
	private PageElement policyHolderLabel;
	private PageElement productCodeLabel;
	private PageElement serialNoLink;
	private PageElement policyVersionEffectiveDateLabel;
	private PageElement policyVersionLatestEventLabel;
	private PageElement policyVersionReferenceNumberLabel;
	private PageElement policyVersionTransactionAmountLabel;
	private PageElement policyVersionRemarksLabel;
		
	private PageElement backButton;
	
	public PolicyShowVersionPage(WebDriver driver,String pageName) {
		super(driver, pageName);
		
		policyShowVersionPageTitle=new PageElement(By.xpath("//div//b//b[contains(text(),'Version Search')]"), "INDIVIDUAL Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath("//form[@name='S000']//td//b[contains(text(),'No.')]/following::font"), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyStatusLabel = new PageElement(By.xpath("//form[@name='S000']//td//b[contains(text(),'Status')]/following::font"), "Policy Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel = new PageElement(By.xpath("//form[@name='S000']//td//b[contains(text(),'Policyholder')]/following::font"), "Policy Holder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath("//form[@name='S000']//td//b[contains(text(),'Product')]/following::font"), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		
		backButton = new PageElement(By.name("btnBack"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
	}
	//SERVICES//

	public void fillPolicyShowVersionPage(PolicyShowVersionPageEntity policyShowVersionPageEntity,CustomAssert assertReference) throws InterruptedException{
		//if(policyShowVersionPageEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(policyShowVersionPageEntity.getAction().equalsIgnoreCase("verify") ){
					
				
				if (policyShowVersionPageEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(policyShowVersionPageEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (policyShowVersionPageEntity.getBooleanValueForField("ConfigPolicyStatus")) {
					assertReference.assertEquals(policyShowVersionPageEntity.getStringValueForField("Status"),fetchValueFromFields(policyStatusLabel), AssertionType.WARNING);
				}
				if (policyShowVersionPageEntity.getBooleanValueForField("ConfigPolicyHolder")) {
					assertReference.assertEquals(policyShowVersionPageEntity.getStringValueForField("PolicyHolder"),fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (policyShowVersionPageEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(policyShowVersionPageEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (policyShowVersionPageEntity.getBooleanValueForField("ConfigSerialNo")){					
					String row=policyShowVersionPageEntity.getStringValueForField("SerialNo");
					serialNoLink= new PageElement(By.xpath("//form[@name='S000']//td//div//a//font[contains(text(),'"+row+"')]"), "Serial No Link",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
					click(serialNoLink);
					Thread.sleep(2000);
					switchToWindow("Policy/Quote Detail");
					//switchToFrame("display");
				}				
			}
		
	  /*List<PolicyEntity> policyEntityList =testdata.getPolicyRecords();
		
		for(PolicyEntity policyEntityData:policyEntityList){
			if(policyEntityData.getAction().equalsIgnoreCase("verify")&&policyEntityData.getStepGroup().equalsIgnoreCase(stepGroup) ){
				PolicyDetailsCreateEditPage policyDetailsCreatePage;
			
				policyDetailsCreatePage.fillandSubmitPolicyDetails(policyEntity, assertReference);
			}
			}
}*/
			//}
	}



	
	
	
}
