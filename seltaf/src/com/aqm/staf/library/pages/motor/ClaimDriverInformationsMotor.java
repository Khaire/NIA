package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.DriverInformationsEntity;

public class ClaimDriverInformationsMotor extends BasePage {
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;

	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement claim_risk_propertyTitle;
	//PC-Yogesh
	private PageElement relationshipOfTheDriverWithTheInsuredDropDown;
	private PageElement driverNameTextField;	 
	private PageElement ageOfDriverTextField;	 
	private PageElement addressOfTheDriverTextarea;	 
	private PageElement dateOfIssueOfLicenseTextField;	  
	private PageElement drivingLicenseNumberTextField;	 
	private PageElement licenseIssuingAuthorityTextField; 
	private PageElement typeOfLicenseDropDown;	
	private PageElement licenseExpiryDateTextField;	  
	private PageElement detailsOfEndorsementSuspensionOfDrivingLicenseTextarea;	 
	private PageElement wasTheDriverInvolvedInAnyAccidentBeforeDropDown;	
	private PageElement hasHeBeenChargedByThePoliceDropDown;
	private PageElement ifChargedThenWhyTextField;

	public ClaimDriverInformationsMotor(WebDriver driver, String pageName,int rowCounts) {
		super(driver, pageName);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);	

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//PC-Yogesh
		relationshipOfTheDriverWithTheInsuredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Relationship of the Driver with the Insured')]/following::select"), "Relationship of the Driver with the Insured DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		driverNameTextField= new PageElement(By.xpath("//td//div[contains(text(),'Driver Name')]/following::input"), "Driver Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		ageOfDriverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Age of driver')]/following::input"), "Age of driver TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		addressOfTheDriverTextarea= new PageElement(By.xpath("//td//div[contains(text(),'Address of the driver')]/following::textarea"), "Address of the driver Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dateOfIssueOfLicenseTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Issue of License')]/following::input"), "Date of Issue of License TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		drivingLicenseNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Driving License Number')]/following::input"), "Driving License Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		licenseIssuingAuthorityTextField= new PageElement(By.xpath("//td//div[contains(text(),'License Issuing Authority')]/following::input"), "License Issuing Authority TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		typeOfLicenseDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of License')]/following::select"), "Type of License DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseExpiryDateTextField= new PageElement(By.xpath("//td//div[contains(text(),'License Expiry Date ')]/following::input"), "License Expiry Date  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		detailsOfEndorsementSuspensionOfDrivingLicenseTextarea= new PageElement(By.xpath("//td//div[contains(text(),'Details of endorsement/Suspension of Driving license ')]/following::textarea"), "Details of endorsement/Suspension of Driving license Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		wasTheDriverInvolvedInAnyAccidentBeforeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Was the driver involved in any accident before ')]/following::select"), "Was the driver involved in any accident before  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hasHeBeenChargedByThePoliceDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Has he been charged by the police ')]/following::select"), "Has he been charged by the police  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ifChargedThenWhyTextField= new PageElement(By.xpath("//td//div[contains(text(),'If charged then Why ')]/following::input"), "If charged then Why  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
	}
	public void ClaimDriverInformationsMotor(DriverInformationsEntity driverInformationsEntity, CustomAssert assertReference) throws InterruptedException{
		if(driverInformationsEntity.getAction().equalsIgnoreCase("add") || driverInformationsEntity.getAction().equalsIgnoreCase("edit")){
			//PC
			if (driverInformationsEntity.getBooleanValueForField("ConfigRelationshipOfTheDriverWithTheInsured")) {
				selectValueFromList(relationshipOfTheDriverWithTheInsuredDropDown,driverInformationsEntity.getStringValueForField("RelationshipOfTheDriverWithTheInsured"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDriverName")) {
				clearAndSendKeys(driverNameTextField, driverInformationsEntity.getStringValueForField("DriverName"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigAgeOfDriver")) {
				clearAndSendKeys(ageOfDriverTextField, driverInformationsEntity.getStringValueForField("AgeOfDriver"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigAddressOfTheDriver")) {
				clearAndSendKeys(addressOfTheDriverTextarea, driverInformationsEntity.getStringValueForField("AddressOfTheDriver"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDateOfIssueOfLicense")){
				String dateOfIssueOfLicense=RandomCodeGenerator.dateGenerator(driverInformationsEntity.getStringValueForField("DateOfIssueOfLicense"));
				clearAndEnterDate(dateOfIssueOfLicenseTextField, dateOfIssueOfLicense);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDrivingLicenseNumber")) {
				clearAndSendKeys(drivingLicenseNumberTextField, driverInformationsEntity.getStringValueForField("DrivingLicenseNumber"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigLicenseIssuingAuthority")) {
				clearAndSendKeys(licenseIssuingAuthorityTextField, driverInformationsEntity.getStringValueForField("LicenseIssuingAuthority"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigTypeOfLicense")) {
				selectValueFromList(typeOfLicenseDropDown,driverInformationsEntity.getStringValueForField("TypeOfLicense"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigLicenseExpiryDate")){
				String licenseExpiryDate=RandomCodeGenerator.dateGenerator(driverInformationsEntity.getStringValueForField("LicenseExpiryDate"));
				clearAndEnterDate(licenseExpiryDateTextField, licenseExpiryDate);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDetailsOfEndorsementSuspensionOfDrivingLicense")) {
				clearAndSendKeys(detailsOfEndorsementSuspensionOfDrivingLicenseTextarea, driverInformationsEntity.getStringValueForField("DetailsOfEndorsementSuspensionOfDrivingLicense"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigWasTheDriverInvolvedInAnyAccidentBefore")) {
				selectValueFromList(wasTheDriverInvolvedInAnyAccidentBeforeDropDown,driverInformationsEntity.getStringValueForField("WasTheDriverInvolvedInAnyAccidentBefore"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigHasHeBeenChargedByThePolice")) {
				selectValueFromList(hasHeBeenChargedByThePoliceDropDown,driverInformationsEntity.getStringValueForField("HasHeBeenChargedByThePolice"));
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigIfChargedThenWhy")) {
				clearAndSendKeys(ifChargedThenWhyTextField, driverInformationsEntity.getStringValueForField("IfChargedThenWhy"));
			}
		}
		else if(driverInformationsEntity.getAction().equalsIgnoreCase("verify")){
			if (driverInformationsEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			//PC
			if (driverInformationsEntity.getBooleanValueForField("ConfigRelationshipOfTheDriverWithTheInsured")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("RelationshipOfTheDriverWithTheInsured"), fetchValueFromList(relationshipOfTheDriverWithTheInsuredDropDown), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDriverName")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("DriverName"), fetchValueFromTextFields(driverNameTextField), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigAgeOfDriver")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("AgeOfDriver"), fetchValueFromTextFields(ageOfDriverTextField), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigAddressOfTheDriver")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("AddressOfTheDriver"), fetchValueFromTextFields(addressOfTheDriverTextarea), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDateOfIssueOfLicense")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(driverInformationsEntity.getStringValueForField("DateOfIssueOfLicense")) ,fetchValueFromTextFields(dateOfIssueOfLicenseTextField),AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDrivingLicenseNumber")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("DrivingLicenseNumber"), fetchValueFromTextFields(drivingLicenseNumberTextField), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigLicenseIssuingAuthority")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("LicenseIssuingAuthority"), fetchValueFromTextFields(licenseIssuingAuthorityTextField), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigTypeOfLicense")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("TypeOfLicense"), fetchValueFromList(typeOfLicenseDropDown), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigLicenseExpiryDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(driverInformationsEntity.getStringValueForField("LicenseExpiryDate")) ,fetchValueFromTextFields(licenseExpiryDateTextField),AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigDetailsOfEndorsementSuspensionOfDrivingLicense")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("DetailsOfEndorsementSuspensionOfDrivingLicense"), fetchValueFromTextFields(detailsOfEndorsementSuspensionOfDrivingLicenseTextarea), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigWhetherVehicleIsUsedForDrivingTuition")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("WasTheDriverInvolvedInAnyAccidentBefore"), fetchValueFromList(wasTheDriverInvolvedInAnyAccidentBeforeDropDown), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigHasHeBeenChargedByThePolice")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("HasHeBeenChargedByThePolice"), fetchValueFromList(hasHeBeenChargedByThePoliceDropDown), AssertionType.WARNING);
			}
			if (driverInformationsEntity.getBooleanValueForField("ConfigIfChargedThenWhy")) {
				assertReference.assertEquals(driverInformationsEntity.getStringValueForField("IfChargedThenWhy"), fetchValueFromTextFields(ifChargedThenWhyTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToMainAttributePage(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}
	public void navigateToInsuredItem(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPayment(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttribute(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(DriverInformationsEntity driverInformationsEntity){
		if (driverInformationsEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			claim_risk_propertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+driverInformationsEntity.getStringValueForField("Claim_risk_propertyTitle")+"')]"), "claim_risk_propertyTitle  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claim_risk_propertyTitle);
		}
	}
	public void fillandSubmitClaimDriverInformationsMotor(DriverInformationsEntity driverInformationsEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(driverInformationsEntity.getConfigExecute())){
			switchToFrame("display");
			ClaimDriverInformationsMotor(driverInformationsEntity, assertReference);
			navigateToMainAttributePage(driverInformationsEntity);
			navigateToclaimHomePage(driverInformationsEntity);
			navigateToInsuredItem(driverInformationsEntity);
			navigateToDocument(driverInformationsEntity);
			navigateToParties(driverInformationsEntity);
			navigateToReserve(driverInformationsEntity);
			navigateToPayment(driverInformationsEntity);
			navigateToAttribute(driverInformationsEntity);
			navigateToInsuredItemDetails(driverInformationsEntity);
			navigateTInsuredItemAttribute(driverInformationsEntity);
			clickOnForwardButton(driverInformationsEntity);
		}
	}
}
