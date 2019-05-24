package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimDamageDetailsEntity;
import com.aqm.staf.library.databin.ClaimDocumentEntity;
import com.aqm.staf.library.databin.ClaimPartyDetailsEntity;
import com.aqm.staf.library.databin.ClaimPaymentEntity;
import com.aqm.staf.library.databin.ClaimEntity;

public class ClaimInsuredInterestMemberDamageDetail extends BasePage
{
	private PageElement claimInsuredInterestDamageDetailTitle ;
	private PageElement claimMemberDamageDetailTitle ;


	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement insuredItemMemDetailsTitle;
	private PageElement insuredItemMemAttributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredInterestMemberCodeTextField;
	private PageElement serialNoTextField;
	private PageElement descriptionTextArea;
	private PageElement previousClaimHistoryButton;	
	private PageElement saveButton;
	private PageElement backButton;

	//navigate tab pages
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	private PageElement claimDocumentsTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;
	private PageElement claimPaymentsTitle;
	private PageElement claimPropertyTitle;

	//navgate to attribute tab page
	private PageElement claimInsuredPropertyTitle;

	//navigate to histroy page from button
	private PageElement previousClaimHistory;
	private String memberCode;
	private PageElement memberCodeLinkText;


	public ClaimInsuredInterestMemberDamageDetail(WebDriver driver, String pageName) 
	{
		super(driver, pageName);
		claimInsuredInterestDamageDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Detail')]"), "Claim Insured InterestDamage Detail Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Detail')]"), "Claim MemberDamage Detail Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemMemDetailsTitle = new PageElement(By.linkText("Details"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredItemMemAttributesTitle = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0560","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0560","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0560","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0560","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0560","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0560","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestMemberCodeTextField = new PageElement(By.name("pPolicyRiskCode"),"Policy Risk Code Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		serialNoTextField = new PageElement(By.name("pDamage"),"Damage Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextArea = new PageElement(By.name("pDescription"),"Description Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		previousClaimHistoryButton = new PageElement(By.xpath("//td//input[@name='Previous Claim History']"), "History Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		claimDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageTitle = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Claim Associated Parties Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim  Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Claim Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimInsuredPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Claim Insured Property')]"), "Claim Insured Property Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		previousClaimHistory = new PageElement(By.xpath("//b//font[contains(text(),'Previous Claim History')]"), " Previous Claim History Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillDamageDetails(ClaimDamageDetailsEntity claimDamageDetailsEntity, CustomAssert assertReference){
		if(claimDamageDetailsEntity.getAction().equalsIgnoreCase("add") || claimDamageDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextArea, claimDamageDetailsEntity.getStringValueForField("Description"));
			}
		}

		else if(claimDamageDetailsEntity.getAction().equalsIgnoreCase("verify")){

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("MemberCode"),fetchValueFromTextFields(insuredInterestMemberCodeTextField), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("SerialNo"),fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}

			if (claimDamageDetailsEntity.getBooleanValueForField("ConfigDescription")) {
				assertReference.assertEquals(claimDamageDetailsEntity.getStringValueForField("Description"),fetchValueFromTextFields(descriptionTextArea), AssertionType.WARNING);
			}

		}
	}

	public void submitMemberDamageDetails(ClaimDamageDetailsEntity claimDamageDetailsEntity) {
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void backFromDetailPage(ClaimDamageDetailsEntity claimDamageDetailsEntity) {
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void selectSearchMemberCode(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigSearchClaimNumber")){
			memberCode=claimDamageDetailsEntity.getStringValueForField("MemberCode");
			memberCodeLinkText=new PageElement(By.linkText(memberCode), "Claim Number in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(memberCodeLinkText);
		}
	}



	public void navigateToHistoryPage(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigPrevHistoryButton")){
			click(previousClaimHistoryButton);
			isElementDisplayed(previousClaimHistory);
		}
	}
	public void navigateToClaimTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);

		}
	}
	public void navigateToMemberTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
			
		}
	}
	public void navigateToDocumentTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitle);
		}
	}
	public void navigateToPartiesTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);

		}
	}
	public void navigateToReserveTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);

		}
	}
	public void navigateToPaymentTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitle);

		}
	}
	public void navigateToAttributeTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
	
		}
	}
	public void navigateToDetailSubTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigDetailSubTab")){
			click(insuredItemMemDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageDetailTitle);
		
		}
	}
	public void navigateToAttributeSubTab(ClaimDamageDetailsEntity claimDamageDetailsEntity){
		if (claimDamageDetailsEntity.getBooleanValueForField("ConfigAttributeSubTab")){
			click(insuredItemMemAttributesTitle);
			switchToFrame("display");
			/*claimInsuredPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimDamageDetailsEntity.getStringValueForField("ClaimDamageDetailsTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimInsuredPropertyTitle);*/

		}
	}

	public void fillandSubmitDamageDetail(ClaimDamageDetailsEntity claimDamageDetailsEntity, CustomAssert assertReference) {
		
			switchToFrame("display");
			fillDamageDetails(claimDamageDetailsEntity, assertReference);
			submitMemberDamageDetails(claimDamageDetailsEntity);
			navigateToClaimTab(claimDamageDetailsEntity);
			navigateToMemberTab(claimDamageDetailsEntity);
			navigateToDocumentTab(claimDamageDetailsEntity);
			navigateToPartiesTab(claimDamageDetailsEntity);
			navigateToReserveTab(claimDamageDetailsEntity);
			navigateToPaymentTab(claimDamageDetailsEntity);
			navigateToAttributeTab(claimDamageDetailsEntity);
			navigateToDetailSubTab(claimDamageDetailsEntity);
			navigateToAttributeSubTab(claimDamageDetailsEntity);
			navigateToHistoryPage(claimDamageDetailsEntity);
			//backFromDetailPage(claimDamageDetailsEntity);
		

	}
}
