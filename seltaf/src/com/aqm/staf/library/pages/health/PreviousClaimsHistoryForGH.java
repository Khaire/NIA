package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimMemberAttributesEntity;
import com.aqm.staf.library.databin.PrevClaimHistoryForGHEntity;

public class PreviousClaimsHistoryForGH extends BasePage {


	private PageElement claimInsuredPropertyTitle ;
	private PageElement claimTitle;
	private PageElement memberTitle;
	private PageElement insuredItemTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement memberDetailsTitle;
	private PageElement memeberAttributesTitle;

	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel; 
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;			
	private PageElement applicableEventCodeLabel;
	private PageElement proceedButton;
	private PageElement backButton;
	
	private PageElement claimFallsUnderExclusion1Dropdown;
	private PageElement claimFallsUnderExclusion2Dropdown;
	private PageElement claimFallsUnderExclusion3Dropdown;
	
	//navigations
	private PageElement claimHomePageTitle;
	private PageElement claimMemberPageTitle;
	private PageElement claimDocumentPageTitle;
	private PageElement claimPartiesPageTitle;
	private PageElement claimReservePageTitle;
	private PageElement claimPaymentPageTitle;
	private PageElement claimAttributesPageTitle;
	private PageElement claimMemberDetailsPageTitle;
	private PageElement nextPageTitle;
	private PageElement claimMemberPropertyPageTitle;
	
	public PreviousClaimsHistoryForGH(WebDriver driver, String pageName) 
	{
		super(driver, pageName);
		
		claimTitle = new PageElement(By.xpath("//a[@title='Claim']"),"Claim Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberDetailsTitle = new PageElement(By.linkText("Details"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memeberAttributesTitle = new PageElement(By.xpath("//a[@title='Insured Properties']//b"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		claimHomePageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Claim Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimMemberPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'InterestDamage')]"),"Claim Member Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimDocumentPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"),"Claim Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimPartiesPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"),"Claim Parties Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimReservePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"),"Claim Reserve Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"),"Claim Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'InterestDamage Detail')]"),"Claim Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimMemberPropertyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Property')]"),"Claim Member Property Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );

		
		
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Insured Serial No")), "Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201","Insured Item Code")), "Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableEventCodeLabel=new PageElement(By.xpath("//td//b[contains(text(),'Applicable Event Code')]/following::td"), "Applicable Event Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Next1"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		claimFallsUnderExclusion1Dropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the claim falls under the exclusion 4.1", "select")), "claim Falls Under Exclusion1 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimFallsUnderExclusion2Dropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the claim falls under the exclusion 4.2", "select")), "claim Falls Under Exclusion2 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		claimFallsUnderExclusion3Dropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the claim falls under the exclusion 4.3", "select")), "claim Falls Under Exclusion3 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	
	
	public void fillPreviousClaimsHistoryForGH(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity, CustomAssert assertReference)throws InterruptedException{
		if(prevClaimHistoryForGHEntity.getAction().equalsIgnoreCase("add") || prevClaimHistoryForGHEntity.getAction().equalsIgnoreCase("edit")){
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimFallsUnderExclusion1")) {
				selectValueFromList(claimFallsUnderExclusion1Dropdown, prevClaimHistoryForGHEntity.getStringValueForField("ClaimFallsUnderExclusion1"));
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimFallsUnderExclusion2")) {
				selectValueFromList(claimFallsUnderExclusion2Dropdown, prevClaimHistoryForGHEntity.getStringValueForField("ClaimFallsUnderExclusion2"));
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimFallsUnderExclusion3")) {
				selectValueFromList(claimFallsUnderExclusion3Dropdown, prevClaimHistoryForGHEntity.getStringValueForField("ClaimFallsUnderExclusion3"));
			}
		}
		else if(prevClaimHistoryForGHEntity.getAction().equalsIgnoreCase("verify")){
			
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ClaimStatus"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromTextFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("InsuredItemCode"),fetchValueFromTextFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimFallsUnderExclusion1")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ClaimFallsUnderExclusion1"),fetchValueFromTextFields(claimFallsUnderExclusion1Dropdown), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimFallsUnderExclusion2")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ClaimFallsUnderExclusion2"),fetchValueFromTextFields(claimFallsUnderExclusion2Dropdown), AssertionType.WARNING);
			}
			if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimFallsUnderExclusion3")) {
				assertReference.assertEquals(prevClaimHistoryForGHEntity.getStringValueForField("ClaimFallsUnderExclusion3"),fetchValueFromTextFields(claimFallsUnderExclusion3Dropdown), AssertionType.WARNING);
			}
		}
	}
	
	public void navigateToClaimHomePage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimHomePageTitle);
			
		}
	}
	public void navigateToMemberPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberPageTitle);
			
		}
	}
	public void navigateToDocumentPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentPageTitle);
			
		}
	}
	public void navigateToPartiesPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPartiesPageTitle);
		}
	}
	public void navigateToReservePage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReservePageTitle);
		}
	}
	public void navigateToPaymentPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentPageTitle);
		}
	}
	public void navigateToAttributesPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAttributesPageTitle);
		}
	}
	public void navigateToMemberDetailsPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigMemberDetails")) {
			click(memberDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDetailsPageTitle);
		}
	}
	public void navigateToMemberAttributesPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memeberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimInsuredPropertyTitle);
		}
	}
	public void proceedToNextPage(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity){
		if (prevClaimHistoryForGHEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+prevClaimHistoryForGHEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	
	
	public void fillAndSubmitPreviousClaimsHistoryForGH(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntity, CustomAssert assertReference)throws InterruptedException{
		if (isConfigTrue(prevClaimHistoryForGHEntity.getConfigExecute())){
			switchToFrame("display");
			fillPreviousClaimsHistoryForGH(prevClaimHistoryForGHEntity, assertReference);
			proceedToNextPage(prevClaimHistoryForGHEntity);
			navigateToMemberPage(prevClaimHistoryForGHEntity);
			navigateToMemberAttributesPage(prevClaimHistoryForGHEntity);
			navigateToClaimHomePage(prevClaimHistoryForGHEntity);
			navigateToDocumentPage(prevClaimHistoryForGHEntity);
			navigateToPartiesPage(prevClaimHistoryForGHEntity);
			navigateToReservePage(prevClaimHistoryForGHEntity);
			navigateToPaymentPage(prevClaimHistoryForGHEntity);
			navigateToAttributesPage(prevClaimHistoryForGHEntity);
			navigateToMemberDetailsPage(prevClaimHistoryForGHEntity);
			
		}
	}

}
