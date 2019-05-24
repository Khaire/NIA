package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimMemberAttributesEntity;
import com.aqm.staf.library.databin.RiskDetailsMCEntity;


public class ClaimInsuredItemMemberAttributesClaimInsuredProperty extends BasePage
{
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
	private PageElement memberSerialNoLabel;
	private PageElement memberCodeLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;			
	private PageElement applicableEventCodeDropdown;
	private PageElement proceedButton;
	private PageElement viewButton;
	private PageElement backButton;
	//navigations
	private PageElement claimHomePageTitle;
	private PageElement claimMemberPageTitle;
	private PageElement claimDocumentPageTitle;
	private PageElement claimPartiesPageTitle;
	private PageElement claimReservePageTitle;
	private PageElement claimPaymentPageTitle;
	private PageElement claimAttributesPageTitle;
	private PageElement claimMemberDetailsPageTitle;
	private PageElement healthProductPageTitle;
	private PageElement claimMemberPropertyPageTitle;
	private PageElement forwardButton;

	public ClaimInsuredItemMemberAttributesClaimInsuredProperty(WebDriver driver, String pageName) 
	{
		super(driver, pageName);
		claimInsuredPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimTitle = new PageElement(By.xpath("//a[@title='Claim']"),"Claim Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberDetailsTitle = new PageElement(By.linkText("Details"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memeberAttributesTitle = new PageElement(By.xpath("//a[@title='Insured Properties']"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Member Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Member Code")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Insured Serial No")), "Insured Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredItemCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0190","Insured Item Code")), "Insured Item Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableEventCodeDropdown=new PageElement(By.name("pEventCode"), "Select Application Event Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		viewButton=new PageElement(By.name("View"), "View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//navigations
		claimHomePageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"),"Claim Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimMemberPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"),"Claim Member Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimDocumentPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"),"Claim Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimPartiesPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"),"Claim Parties Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimReservePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"),"Claim Reserve Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"),"Claim Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim MemberDamage Detail')]"),"Claim Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		healthProductPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'T1-CLR for Health Products')]"),"Health Product Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		claimMemberPropertyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Claim Member Property')]"),"Claim Member Property Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
	}

	public void fillClaimMemberAttributes(ClaimMemberAttributesEntity claimMemberAttributesEntity, CustomAssert assertReference)throws InterruptedException
	{
		if(claimMemberAttributesEntity.getAction().equalsIgnoreCase("add") || claimMemberAttributesEntity.getAction().equalsIgnoreCase("edit"))
		{
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigApplicableEventCode"))
			{
				selectValueFromList(applicableEventCodeDropdown, claimMemberAttributesEntity.getStringValueForField("ApplicableEventCode"));
			}
		}
		else if(claimMemberAttributesEntity.getAction().equalsIgnoreCase("verify")){
			
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("ClaimNumber"),fetchValueFromTextFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("PolicyNumber"),fetchValueFromTextFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("ClaimDate"),fetchValueFromTextFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("ClaimStatus"),fetchValueFromTextFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("ProductCode"),fetchValueFromTextFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("CauseOfLoss"),fetchValueFromTextFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("MemberSerialNo"),fetchValueFromTextFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("MemberCode"),fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (claimMemberAttributesEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimMemberAttributesEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeDropdown), AssertionType.WARNING);
			}
		}
	}
	public void navigateToClaimHomePage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimHomePageTitle);
			
		}
	}
	public void navigateToMemberPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberPageTitle);
			
		}
	}
	public void navigateToDocumentPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentPageTitle);
			
		}
	}
	public void navigateToPartiesPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPartiesPageTitle);
		}
	}
	public void navigateToReservePage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReservePageTitle);
		}
	}
	public void navigateToPaymentPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentPageTitle);
		}
	}
	public void navigateToAttributesPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAttributesPageTitle);
		}
	}
	public void navigateToMemberDetailsPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigMemberDetails")) {
			click(memberDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDetailsPageTitle);
		}
	}
	public void navigateToMemberAttributesPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memeberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimInsuredPropertyTitle);
		}
	}
	public void proceedToCLRForHealthProducts(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(proceedButton);
			switchToFrame("display");
			healthProductPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMemberAttributesEntity.getStringValueForField("ClaimMemberAttributesTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			if(claimMemberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("AT")||claimMemberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("OP")) {
				clickOnForwardButton(claimMemberAttributesEntity);
				}
			}
		}
	public void clickOnForwardButton(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			/* claimRiskDtls2Title= new PageElement(By.xpath("//div//b[contains(text(),'"+riskDetDeclNoMCEntity.getStringValueForField("Claim Risk Dtls-2")+"')]"), " Claim Risk Dtls-2 Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimRiskDtls2Title);*/
		}
	}
	public void viewButtonClaimMemberAttributesPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigViewButton")) {
			click(viewButton);
			switchToFrame("display");
			isElementDisplayed(claimMemberPropertyPageTitle);
		}
	}
	public void backButtonClaimMemberAttributesPage(ClaimMemberAttributesEntity claimMemberAttributesEntity){
		if (claimMemberAttributesEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(claimMemberDetailsPageTitle);
		}
	}

	public void fillAndSubmitClaimMemberAttributeDetails(ClaimMemberAttributesEntity claimMemberAttributesEntity, CustomAssert assertReference)throws InterruptedException{
			switchToFrame("display");
			fillClaimMemberAttributes(claimMemberAttributesEntity, assertReference);
			proceedToCLRForHealthProducts(claimMemberAttributesEntity);
			navigateToMemberPage(claimMemberAttributesEntity);
			navigateToMemberAttributesPage(claimMemberAttributesEntity);
			navigateToClaimHomePage(claimMemberAttributesEntity);
			navigateToDocumentPage(claimMemberAttributesEntity);
			navigateToPartiesPage(claimMemberAttributesEntity);
			navigateToReservePage(claimMemberAttributesEntity);
			navigateToPaymentPage(claimMemberAttributesEntity);
			navigateToAttributesPage(claimMemberAttributesEntity);
			navigateToMemberDetailsPage(claimMemberAttributesEntity);
			viewButtonClaimMemberAttributesPage(claimMemberAttributesEntity);
			//backButtonClaimMemberAttributesPage(claimMemberAttributesEntity);
	}
		
}
