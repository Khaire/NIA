package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClientDetailsEntity;
import com.aqm.staf.library.databin.ClonePolicySchemeEntity;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyLocationEntity;

public class ClonePolicyScheme extends BasePage{
	private PageElement clonePolicySchemeTitle;
	private PageElement refrencePolicySchemeNoTextField;
	private PageElement refrenceQuoteNoTextField;
	private PageElement quoteIntimationDateTextField;
	private PageElement clonedQuoteNoLabel;
	private PageElement cloneButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsTitle;
	private PageElement clonePolicyLink;
	//
	String clonedQuoteNo;

	public ClonePolicyScheme(WebDriver driver, String pageName) {
		super(driver, pageName);
		clonePolicySchemeTitle=new PageElement(By.xpath("//div//b[contains(text(),'Clone Policy/Scheme')]"),"ClonePolicySchemeTitle",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refrencePolicySchemeNoTextField= new PageElement(By.name("pPolicyNo"),"Refrence Policy Scheme No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		refrenceQuoteNoTextField= new PageElement(By.name("pProposalNo"),"Refrence Quote No TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		quoteIntimationDateTextField= new PageElement(By.name("pProposalIntimationDate"),"Quote Intimation Date TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		clonedQuoteNoLabel=new PageElement(By.xpath("//td//b[contains(text(),'Quote No.')]/following::td//a"),"Cloned Quote No Label",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cloneButton=new PageElement(By.name("Clone"),"Clone Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton=new PageElement(By.name("Back"),"Back Button ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clonePolicyLink = new PageElement(By.xpath("//a//b[contains(text(),'Clone Policy')]"),"Clone Policy Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}
	public void fillClonePolicySchemeDetails(ClonePolicySchemeEntity clonePolicySchemeEntity){
		if(clonePolicySchemeEntity.getAction().equalsIgnoreCase("add")||clonePolicySchemeEntity.getAction().equalsIgnoreCase("edit")){

			//ClonePolicySchemeEntity actualClonePolicySchemeEntity = new ClonePolicySchemeEntity();


			if (clonePolicySchemeEntity.getBooleanValueForField("ConfigReferencePolicySchemeNo")) {
				clearAndSendKeys(refrencePolicySchemeNoTextField, clonePolicySchemeEntity.getStringValueForField("ReferencePolicySchemeNo"));
			}

			if (clonePolicySchemeEntity.getBooleanValueForField("ConfigReferenceQuoteno")) {
				clearAndSendKeys(refrenceQuoteNoTextField, clonePolicySchemeEntity.getStringValueForField("ReferenceQuoteno"));
			}

			if (clonePolicySchemeEntity.getBooleanValueForField("ConfigQuoteIntimationDate")) {
				String quoteIntimationDate=RandomCodeGenerator.dateGenerator(clonePolicySchemeEntity.getStringValueForField("QuoteIntimationDate"));
				clearAndEnterDate(quoteIntimationDateTextField, quoteIntimationDate);
			}
		}
	}
	public void clickCloneButton(ClonePolicySchemeEntity clonePolicySchemeEntity){
		if((clonePolicySchemeEntity.getBooleanValueForField("ConfigCloneButton"))){
			click(cloneButton);
			fetchClonedQuoteNo(clonePolicySchemeEntity);
		}
	}
	
	public void backPolicyDetails(ClonePolicySchemeEntity clonePolicySchemeEntity) {
		if (clonePolicySchemeEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}
	public void clickClone() {
		click(cloneButton);
	}
	public void navigateToPolicyQuoteDetails(ClonePolicySchemeEntity clonePolicySchemeEntity){
		switchToFrame("display");
		isElementDisplayed(policyQuoteDetailsTitle);
	}
	public void fetchClonedQuoteNo(ClonePolicySchemeEntity clonePolicySchemeEntity){
		if(clonePolicySchemeEntity.getBooleanValueForField("ConfigClonedQuoteNo")){
			clonePolicySchemeEntity.setStringValueForField("ClonedQuoteNo", fetchValueFromFields(clonedQuoteNoLabel));

		}
	}

	public void fillandSearchClonePolicySchemeDetails(ClonePolicySchemeEntity clonePolicySchemeEntity)  {
		fillClonePolicySchemeDetails(clonePolicySchemeEntity );
		clickCloneButton(clonePolicySchemeEntity);
		backPolicyDetails(clonePolicySchemeEntity);
		fetchClonedQuoteNo(clonePolicySchemeEntity);
	}
	public void navigateToClonePolicyPage() {
	 {
			switchToFrame("Control");
			click(clonePolicyLink);
			switchToFrame("display");
			isElementDisplayed(clonePolicySchemeTitle);
		}
	}
	
	
}





