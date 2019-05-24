package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimDocumentEntity;
import com.aqm.staf.library.databin.ClaimPartyDetailsEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolicyDocumentEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class ClaimPartiesClaimPartyDetails extends BasePage {

	private PageElement claimPartyDetailsTitle ;
	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement saveButton;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement partyCodeLabel;
	private PageElement partyNameLabel;
	private PageElement stakeDropdown;
	private PageElement claimPartyCodeTextField;
	private PageElement claimPartyNameTextField;
	private PageElement attributeButton;
	private PageElement backButton;
	private PageElement DateofAppointment;

	//navigate tab pages
	private PageElement claimDetailsTitle;
	private PageElement claimMemberDamageTitle;
	private PageElement claimDocumentsTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement claimReserveTitle;
	private PageElement claimPaymentsTitle;
	private PageElement claimPropertyTitle;

	//Attribue bttn next page
	private PageElement claimPartyFinancialSummary;
	//After save party detail popup.
	private PageElement closeButton;
	private PageElement claimPartyCodeFindButton;
	private PageElement claimPartySearchButton;

	private PageElement barCouncilEnrollmentNoTextField;

	private PageElement dateOfAppointmentFindButton;
	private PageElement dateOfAppointmentTextField;
	private PageElement typeOfSurveyDropdown;
	private PageElement partyCodeLabelTU;
	public ClaimPartiesClaimPartyDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPartyDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'PartyDetails')]"), "Claim Party Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10 );
		insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","number")), "Claim number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Policy")), "Policy number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Date")), "Claim Date number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Product Code")), "Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0200","Cause Of Loss")), "Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeLabel = new PageElement(By.xpath(genericLocatorforLabelparty("S0670","Party Code")), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyNameLabel = new PageElement(By.xpath(genericLocatorforLabelparty("S0670","Party Name")), "Party Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
        stakeDropdown = new PageElement(By.name("pClaimStake"),"Stake Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		claimPartyCodeTextField = new PageElement(By.name("pPartyCode"),"Claim Party Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimPartyNameTextField = new PageElement(By.name("pPartyName"),"Claim Party Name Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		DateofAppointment = new PageElement(By.id("pDateApp1"), "Date of Appointment", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributeButton = new PageElement(By.name("Attribute"),"Attribute Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeButton = new PageElement(By.name("CloseWin"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageTitle = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDocumentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Documents Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssociatedPartiesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Associated Parties')]"), "Claim Associated Parties Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReserveTitle = new PageElement(By.xpath("//div//b[contains(text(),'//div//b[contains(text(),'Reserve')]')]"), "Claim Reserve Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim  Payments Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Claim Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPartyFinancialSummary = new PageElement(By.xpath("//div//b[contains(text(),'Party Financial Summary')]"), "Claim Party Financial Summary Title", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		claimPartyCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Party')]/following::input/following::a[@name='firstFocus']"), "Claim Party code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimPartySearchButton=new PageElement(By.name("Search"), "Claim Party Code Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		barCouncilEnrollmentNoTextField=new PageElement(By.xpath("//div//b[contains(text(),'Bar council')]/following::input"), "bar Council Enrollment No TextField", false , WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAppointmentTextField = new PageElement(By.id("pDateApp1"),"Close Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfAppointmentFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Date of Appointment')]/following::input/following::a[@name='firstFocus']"), "Claim Party code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfSurveyDropdown= new PageElement(By.xpath("//select[@id='slTypeofSurv1']"), "Type of Survey", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		partyCodeLabelTU = new PageElement(By.xpath(genericLocatorforLabel("S0670","Party Code")), "Party Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillClaimPartyDetails(ClaimPartyDetailsEntity claimPartyDetailsEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimPartyDetailsEntity.getAction().equalsIgnoreCase("add") || claimPartyDetailsEntity.getAction().equalsIgnoreCase("edit")){

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigStake")) {
				selectValueFromList(stakeDropdown, claimPartyDetailsEntity.getStringValueForField("Stake"));
			}
			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigTypeOfSurvey")) {
				selectValueFromList(typeOfSurveyDropdown, claimPartyDetailsEntity.getStringValueForField("TypeOfSurvey"));
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimPartyCode")) {
				fillClaimPartyCodeSearch(claimPartyDetailsEntity);
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimPartyName")) {
				clearAndSendKeys(claimPartyNameTextField, claimPartyDetailsEntity.getStringValueForField("ClaimPartyName"));
			}


			if(claimPartyDetailsEntity.getBooleanValueForField("ConfigDateofAppointment")) {
				String AppointmentDate = RandomCodeGenerator.dateGenerator(claimPartyDetailsEntity.getStringValueForField("DateofAppointment"));
				clearAndEnterDate(DateofAppointment, AppointmentDate);
			}

		}


		else if(claimPartyDetailsEntity.getAction().equalsIgnoreCase("verify")){

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPartyDetailsEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}

			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigTypeOfSurvey")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("TypeOfSurvey"),fetchValueFromTextFields(typeOfSurveyDropdown), AssertionType.WARNING);
			}
			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigStake")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("Stake"),fetchValueFromTextFields(stakeDropdown), AssertionType.WARNING);
			}
			
			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimPartyCode")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("ClaimPartyCode"),fetchValueFromTextFields(claimPartyCodeTextField), AssertionType.WARNING);
			}
			
			if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimPartyName")) {
				assertReference.assertEquals(claimPartyDetailsEntity.getStringValueForField("ClaimPartyName").trim(),fetchValueFromFieldsforClaimParty(partyNameLabel).trim(), AssertionType.WARNING);
			}
		}
	}


	//TODO Claim Party Code Search For Parties//
	public void clickOnClaimPartyCodeFindButton(ClaimPartyDetailsEntity claimPartyDetailsEntity) throws InterruptedException {
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimPartyCodeFindButton")){
			click(claimPartyCodeFindButton);
			switchToWindow("Party Maintenance");

		}
	}
	public void fillClaimPartyCodeSearch(ClaimPartyDetailsEntity claimPartyDetailsEntity)throws InterruptedException{
		clickOnClaimPartyCodeFindButton(claimPartyDetailsEntity);

		if(claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimPartyCode")){
			clearAndSendKeys(claimPartyCodeTextField, claimPartyDetailsEntity.getStringValueForField("ClaimPartyCode"));
		}
		click(claimPartySearchButton);	
		selectSearchClaimPartyCode(claimPartyDetailsEntity);
	}
	public void selectSearchClaimPartyCode(ClaimPartyDetailsEntity claimPartyDetailsEntity) throws InterruptedException{
		String	claimPartyCode=claimPartyDetailsEntity.getStringValueForField("ClaimPartyCode");
		PageElement claimPartyCodeLinkTextField=new PageElement(By.linkText(claimPartyCode), "Claim Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(claimPartyCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}

	public void clickAttribute(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigAttributeButton")) {
			click(attributeButton);
			switchToFrame("display");
			isElementDisplayed(claimPartyFinancialSummary);
		}
	}
	public void submitClaimPartyDetails(ClaimPartyDetailsEntity claimPartyDetailsEntity) throws InterruptedException {
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			if(!(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation"))
					||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))){
				if(!claimPartyDetailsEntity.getStringValueForField("Stake").equalsIgnoreCase("FINANCIER")) {
					try {
					driver.switchTo().alert().accept();
					}catch (Exception e) {
						// TODO: handle exception
					}
					if(claimPartyDetailsEntity.getStringValueForField("Browser").equalsIgnoreCase("IE") && (!claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineCargo")) && (!claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire"))) {
						{
							try{
								handleAlert();
							}catch(Exception e) {
								handleAlert();
							}
						}
					}
					else {
						try {
							driver.switchTo().alert().accept();
							}catch (Exception e) {
								// TODO: handle exception
							}
					}
				}
				if(!((claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")) || (claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull")))) {
					if(!((claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation"))||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineHull"))||((claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")) && (!claimPartyDetailsEntity.getStringValueForField("Stake").equalsIgnoreCase("FINANCIER")))||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")))){
						if(!(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")))){
							afterClickOnSaveButtonHandlePopup(claimPartyDetailsEntity);
						}
						switchToFrame("display");
					}
				}
				//Shwetha(30/06/2018)
				if((claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))
						||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural"))
						||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance"))
						||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))
						||(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineCargo"))){
					if(claimPartyDetailsEntity.getBooleanValueForField("ConfigBarCouncilEnrollNo")){
						clearAndSendKeys(barCouncilEnrollmentNoTextField, claimPartyDetailsEntity.getStringValueForField("BarCouncilEnrollNo"));
						click(saveButton);
						if(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")
								||claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("MarineCargo")
								||claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
								{
							driver.switchTo().alert().accept();
							driver.switchTo().alert().accept();
						}
					}
				}
			}
			}
			
			
		}
	}



	public void backFromPartyDetails(ClaimPartyDetailsEntity claimPartyDetailsEntity) {
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void navigateToClaimTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigClaimTab")) {
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
		}
	}
	public void navigateToMemberTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
		}
	}
	public void navigateToDocumentTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitle);
		}
	}
	public void navigateToPartiesTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigPartiesTab")) {
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigReserveTab")) {
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigPaymentTab")) {
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitle);
		}
	}
	public void navigateToAttributeTab(ClaimPartyDetailsEntity claimPartyDetailsEntity){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigAttributesTab")) {
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
		}
	}
	public void afterClickOnSaveButtonHandlePopup(ClaimPartyDetailsEntity claimPartyDetailsEntity) throws InterruptedException {
		switchToWindow("Error Window");
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);			
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			isElementDisplayed(claimPartyDetailsTitle);
			switchToWindow();
		}
	}
	public void clickOnSaveButtonForICProduct(ClaimPartyDetailsEntity claimPartyDetailsEntity) throws InterruptedException{
		if(claimPartyDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")){
		if (claimPartyDetailsEntity.getBooleanValueForField("ConfigSaveButtonForIC")) {
			click(saveButton);
			switchToWindow("Error Window");
			
		}
		}
	}

	public void fillAndSubmitClaimPartyDetails(ClaimPartyDetailsEntity claimPartyDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(claimPartyDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimPartyDetails(claimPartyDetailsEntity, assertReference);
			submitClaimPartyDetails(claimPartyDetailsEntity);
			clickOnSaveButtonForICProduct(claimPartyDetailsEntity);
			navigateToClaimTab(claimPartyDetailsEntity);
			navigateToMemberTab(claimPartyDetailsEntity);
			navigateToDocumentTab(claimPartyDetailsEntity);
			navigateToPartiesTab(claimPartyDetailsEntity);
			navigateToReserveTab(claimPartyDetailsEntity);
			navigateToPaymentTab(claimPartyDetailsEntity);
			navigateToAttributeTab(claimPartyDetailsEntity);
			clickAttribute(claimPartyDetailsEntity);
			//backFromPartyDetails(claimPartyDetailsEntity);
		}
	}
}
