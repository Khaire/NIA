package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimLossFireEntity;
public class ClaimLossFire extends BasePage{
	//digvijay AR
	private PageElement lossPaidForBuildingTextField;
	private PageElement lossPaidForPandMTextField;
	private PageElement lossPaidForStocksTextField;	
	//Naviagtion	
	private PageElement claimTab;
	private PageElement memberTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement memberDetailsTab;
	private PageElement memberAttributeTab;
	private PageElement claimTabTitle;
	private PageElement memberTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement memberDetailsTabTitle;
	private PageElement memberAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement nextPageTitle;	
	private PageElement insuredItemTab;	
	

	//digvijay fd
	private PageElement lossPaidForOthersTextField;
	private PageElement amountOfUnderInsuranceTextField;
	private PageElement claimHeadDropDown;
	private PageElement claimSettlmentAmtDueToRedInTOverTextField;
	private PageElement claimSettlementAmtDueToIncCostOfWorkTextField;
	private PageElement claimSettlementAmtDueToAuditorsFeeTextField;
	private PageElement claimSettlementAmtDueSolicAndProfMensFeeTextField;
	private PageElement contributionFromOtherPolicyTextField;


	public ClaimLossFire(WebDriver driver, String pageName){
		super(driver, pageName);
		//Navigation-->Rajkumar
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberDetailsTab = new PageElement(By.xpath("//a//b[contains(text(),'Details')]"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Member Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "MemberDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		

		//digvijay AR
		lossPaidForBuildingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss paid for Building')]/following::input"), "Loss paid for Building", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossPaidForPandMTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss paid for P and M')]/following::input"), "Loss paid for P and M", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lossPaidForStocksTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss paid for Stocks')]/following::input"), "Loss paid for Stocks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay fd
		lossPaidForOthersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loss Paid for others')]/following::input"), "Loss Paid for others", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfUnderInsuranceTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount of Under Insurance')]/following::input"), "Amount of Under Insurance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimHeadDropDown=new PageElement(By.xpath("//td//div[contains(text(),'claim Head')]/following::select"), "claim Head", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimSettlmentAmtDueToRedInTOverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlment amount due to reduction in turn over')]/following::input"), "Claim settlment amount due to reduction in turn over", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmtDueToIncCostOfWorkTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlement amount due to increased cost of working')]/following::input"), "Claim settlement amount due to increased cost of working", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmtDueToAuditorsFeeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim settlement amount due to Auditors fee')]/following::input"), "Claim settlement amount due to Auditors fee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmtDueSolicAndProfMensFeeTextField=new PageElement(By.xpath("//td//div[contains(text(),'solicitors and professional mens fee')]/following::input"), "solicitors and professional mens fee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contributionFromOtherPolicyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Contribution from Other Policy')]/following::input"), "Contribution from Other Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillClaimLossFire(ClaimLossFireEntity claimLossFireEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimLossFireEntity.getAction().equalsIgnoreCase("add") || claimLossFireEntity.getAction().equalsIgnoreCase("edit")){
			//digvijay AR

			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForBuilding")) {
				clearAndSendKeys(lossPaidForBuildingTextField, claimLossFireEntity.getStringValueForField("LossPaidForBuilding"));
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForPandM")) {
				clearAndSendKeys(lossPaidForPandMTextField, claimLossFireEntity.getStringValueForField("LossPaidForPandM"));
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForStocks")) {
				clearAndSendKeys(lossPaidForStocksTextField, claimLossFireEntity.getStringValueForField("LossPaidForStocks"));
			}
			//digvijay fd

			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForOthers")) {
				clearAndSendKeys(lossPaidForOthersTextField, claimLossFireEntity.getStringValueForField("LossPaidForOthers"));
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigAmountOfUnderInsurance")) {
				clearAndSendKeys(amountOfUnderInsuranceTextField, claimLossFireEntity.getStringValueForField("AmountOfUnderInsurance"));
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimHead")) {
				selectValueFromList(claimHeadDropDown, claimLossFireEntity.getStringValueForField("ClaimHead"));
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlmentAmtDueToRedInTOver")) {
				clearAndSendKeys(claimSettlmentAmtDueToRedInTOverTextField, claimLossFireEntity.getStringValueForField("ClaimSettlmentAmtDueToRedInTOver"));
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlementAmtDueToIncCostOfWork")) {
				clearAndSendKeys(claimSettlementAmtDueToIncCostOfWorkTextField, claimLossFireEntity.getStringValueForField("ClaimSettlementAmtDueToIncCostOfWork"));
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlementAmtDueToAuditorsFee")) {
				clearAndSendKeys(claimSettlementAmtDueToAuditorsFeeTextField, claimLossFireEntity.getStringValueForField("ClaimSettlementAmtDueToAuditorsFee"));
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlementAmtDueSolicAndProfMensFee")) {
				clearAndSendKeys(claimSettlementAmtDueSolicAndProfMensFeeTextField, claimLossFireEntity.getStringValueForField("ClaimSettlementAmtDueSolicAndProfMensFee"));
			}


			if (claimLossFireEntity.getBooleanValueForField("ConfigContributionFromOtherPolicy")) {
				clearAndSendKeys(contributionFromOtherPolicyTextField, claimLossFireEntity.getStringValueForField("ContributionFromOtherPolicy"));
			}
		}
		else if(claimLossFireEntity.getAction().equalsIgnoreCase("verify")){
		
			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//digvijay AR

			//
			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForBuilding")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("LossPaidForBuilding"), fetchValueFromTextFields(lossPaidForBuildingTextField), AssertionType.WARNING);
			}
			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForPandM")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("LossPaidForPandM"), fetchValueFromTextFields(lossPaidForPandMTextField), AssertionType.WARNING);
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForStocks")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("LossPaidForStocks"), fetchValueFromTextFields(lossPaidForStocksTextField), AssertionType.WARNING);
			}
			//digvijay fd

			if (claimLossFireEntity.getBooleanValueForField("ConfigLossPaidForOthers")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("LossPaidForOthers"), fetchValueFromTextFields(lossPaidForOthersTextField), AssertionType.WARNING);
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigAmountOfUnderInsurance")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("AmountOfUnderInsurance"), fetchValueFromTextFields(amountOfUnderInsuranceTextField), AssertionType.WARNING);
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimHead")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimHead"), fetchValueFromList(claimHeadDropDown), AssertionType.WARNING);
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlmentAmtDueToRedInTOver")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimSettlmentAmtDueToRedInTOver"), fetchValueFromTextFields(claimSettlmentAmtDueToRedInTOverTextField), AssertionType.WARNING);
			}


			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlementAmtDueToIncCostOfWork")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimSettlementAmtDueToIncCostOfWork"), fetchValueFromTextFields(claimSettlementAmtDueToIncCostOfWorkTextField), AssertionType.WARNING);
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlementAmtDueToAuditorsFee")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimSettlementAmtDueToAuditorsFee"), fetchValueFromTextFields(claimSettlementAmtDueToAuditorsFeeTextField), AssertionType.WARNING);
			}

			if (claimLossFireEntity.getBooleanValueForField("ConfigClaimSettlementAmtDueSolicAndProfMensFee")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ClaimSettlementAmtDueSolicAndProfMensFee"), fetchValueFromTextFields(claimSettlementAmtDueSolicAndProfMensFeeTextField), AssertionType.WARNING);
			}


			if (claimLossFireEntity.getBooleanValueForField("ConfigContributionFromOtherPolicy")) {
				assertReference.assertEquals(claimLossFireEntity.getStringValueForField("ContributionFromOtherPolicy"), fetchValueFromTextFields(contributionFromOtherPolicyTextField), AssertionType.WARNING);
			}
		}		
	}

	//Navigation-->Rajkumar
	public void proceedToT2CLRForHealthProducts(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimLossFireEntity.getStringValueForField("ClaimLossFireTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToMember(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}//insuredItemTab
	
	public void navigateToinsuredItem(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(memberTabTitle);
		}
	}
	public void navigateToDocument(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToMemberDetails(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigMemberDetailsTab")){		
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailsTabTitle);
		}
	}
	public void navigateToMemberAttribute(ClaimLossFireEntity claimLossFireEntity){
		if (claimLossFireEntity.getBooleanValueForField("ConfigMemberAttributeTab")){		
			click(memberAttributeTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimMemberT1CLRAttibutesHealth(ClaimLossFireEntity claimLossFireEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimLossFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimLossFire(claimLossFireEntity, assertReference);
			proceedToT2CLRForHealthProducts(claimLossFireEntity);
			navigateToMainAttributePage(claimLossFireEntity);
			navigateToclaimHomePage(claimLossFireEntity);
			navigateToMember(claimLossFireEntity);
			navigateToDocument(claimLossFireEntity);
			navigateToParties(claimLossFireEntity);
			navigateToReserve(claimLossFireEntity);
			navigateToPayment(claimLossFireEntity);
			navigateToAttribute(claimLossFireEntity);
			navigateToMemberDetails(claimLossFireEntity);
			navigateToMemberAttribute(claimLossFireEntity);
			navigateToinsuredItem(claimLossFireEntity);
		}
	}
}
