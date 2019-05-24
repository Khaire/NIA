package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.ClaimRiskProMotorEntity;

public class ClaimRiskPropertyMotor extends BasePage{

	private PageElement claimRiskPropertyTitle;
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
	private PageElement applicableEventCodeLabel;

	private PageElement forwardButton;
	private PageElement backButton;

	//Mayur_Product Name= CV			
	private PageElement insuredNameTextField;
	private PageElement registrationNoTextField;
	private PageElement makeDropDown;
	private PageElement modelTextField;
	private PageElement chassisNoTextField;
	private PageElement typeOfVehicleInsuredDropDown;
	private PageElement engineNoTextField;
	private PageElement trailerOptedOrNotTextField; 
	private PageElement registeredLadenWeightTextField;
	private PageElement unladenWeightTextField;
	private PageElement weightOfGoodsCarriedTextField;
	private PageElement natureOfPermitTextField;
	private PageElement natureOfGoodsCarriedTextField;
	private PageElement vehiclePlyingForHireDropDown;
	private PageElement numberOfPassengersCarriedTextField;
	private PageElement numberOfPassengerAsPerPermitTextField;
	private PageElement numberOfPersonsDeadTextField;
	private PageElement numberOfPersonsInjuredTextField;
	private PageElement numberOfPersonsForTPPDTextField;
	private PageElement totalNoOfClaimForSameClaimEventTextField;
	private PageElement totalNoOfCasesOfThirdPartyClaimTextField;
	private PageElement nameOfWitnessTextField;
	private PageElement addressOfWitnessTextField;
	private PageElement vehicleRoadworthyConditionDropDown;
	private PageElement purposeOfUsingVehicleTextField;
	private PageElement anyTpClaimOccuredInThisPolicyDropDown;
	
	private PageElement closeWindowButton;

	public ClaimRiskPropertyMotor(WebDriver driver, String pageName) {
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
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		forwardButton=new PageElement(By.xpath("//input[@name=('Next1')]"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredNameTextField= new PageElement(By.xpath("//td//div[contains(text(),'Insured Name')]/following::input"), "Insured Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Registration No')]/following::input"), "Registration No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		makeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Make')]/following::select"), "Make Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modelTextField= new PageElement(By.xpath("//td//div[contains(text(),'Model')]/following::input"), "Model TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chassisNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Chassis No')]/following::input"), "Chassis No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfVehicleInsuredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Vehicle Insured')]/following::select"), "Type of Vehicle Insured dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Engine No')]/following::input"), "Engine No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		trailerOptedOrNotTextField= new PageElement(By.xpath("//td//div[contains(text(),'Trailer Opted or Not ')]/following::input"), "Trailer Opted or Not  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registeredLadenWeightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Registered Laden weight')]/following::input"), "Registered Laden weight TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		unladenWeightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Unladen Weight')]/following::input"), "Unladen Weight TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		weightOfGoodsCarriedTextField= new PageElement(By.xpath("//td//div[contains(text(),'Weight of Goods Carried')]/following::input"), "Weight of Goods Carried TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfPermitTextField= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Permit')]/following::select[1]"), "Nature of Permit  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfGoodsCarriedTextField= new PageElement(By.xpath("//td//div[contains(text(),'Nature of goods carried ')]/following::input"), "Nature of goods carried  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehiclePlyingForHireDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Plying for Hire')]/following::select"), "Vehicle Plying for Hire Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfPassengersCarriedTextField= new PageElement(By.xpath("//div[contains(text(),'Number of passengers carried')]//following::input[1]"), "Number of passengers carried TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfPassengerAsPerPermitTextField= new PageElement(By.xpath("//div[contains(text(),'Number of Passenger as per Permit')]//following::input[1]"), "Number of passengers as permit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfPersonsDeadTextField= new PageElement(By.xpath("//td//div[contains(text(),'Number of Persons Dead')]/following::input"), "Number of Persons Dead TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfPersonsInjuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Number of Persons Injured')]/following::input"), "Number of Persons Injured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfPersonsForTPPDTextField= new PageElement(By.xpath("//td//div[contains(text(),'Number of Persons for TPPD')]/following::input"), "Number of Persons for TPPD TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNoOfClaimForSameClaimEventTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total No of Claim for Same Claim Event')]/following::input"), "Total No of Claim for Same Claim Event TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNoOfCasesOfThirdPartyClaimTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total No. of Cases of Third Party Claim')]/following::input"), "Total No. of Cases of Third Party Claim TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfWitnessTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of witness')]/following::input"), "Name of witness TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfWitnessTextField= new PageElement(By.xpath("//td//div[contains(text(),'Address of witness')]/following::input"), "Address of witness TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleRoadworthyConditionDropDown=new PageElement(By.xpath("//div[contains(text(),'Was the Vehicle in roadworthy condition at the time of Loss')]//following::select[1]"), "Vehicle Roadworthy Condition", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUsingVehicleTextField=new PageElement(By.xpath("//div[contains(text(),'Was the Vehicle in roadworthy condition at the time of Loss')]//following::textarea[1]"), "Purposing Of Using Vehicle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyTpClaimOccuredInThisPolicyDropDown=new PageElement(By.xpath("//div[contains(text(),'Any TP claim occurred in this policy?')]//following::select[1]"), "TP Claim Occured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	
		closeWindowButton = new PageElement(By.xpath("//input[@name=('  Close  ')]"),"Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	
	}

	public void fillClaimRiskPropertyMotor(ClaimRiskProMotorEntity claimRiskProMotorEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskProMotorEntity.getAction().equalsIgnoreCase("add") || claimRiskProMotorEntity.getAction().equalsIgnoreCase("edit")){
			if(claimRiskProMotorEntity.getBooleanValueForField("ConfigMake")){
				selectValueFromList(makeDropDown,claimRiskProMotorEntity.getStringValueForField("Make"));
			}
			if(claimRiskProMotorEntity.getBooleanValueForField("ConfigTypeOfVehicleInsured")){
				selectValueFromList(typeOfVehicleInsuredDropDown,claimRiskProMotorEntity.getStringValueForField("TypeOfVehicleInsured"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigRegisteredLadenWeight")) {
				clearAndSendKeys(registeredLadenWeightTextField, claimRiskProMotorEntity.getStringValueForField("RegisteredLadenWeight"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigUnladenWeight")) {
				clearAndSendKeys(unladenWeightTextField, claimRiskProMotorEntity.getStringValueForField("UnladenWeight"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigWeightOfGoodsCarried")) {
				clearAndSendKeys(weightOfGoodsCarriedTextField, claimRiskProMotorEntity.getStringValueForField("WeightOfGoodsCarried"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNatureOfPermit")) {
				selectValueFromList(natureOfPermitTextField, claimRiskProMotorEntity.getStringValueForField("NatureOfPermit"));
			//	clearAndSendKeys(natureOfPermitTextField, claimRiskProMotorEntity.getStringValueForField("NatureOfPermit"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNatureOfGoodsCarried")) {
				clearAndSendKeys(natureOfGoodsCarriedTextField, claimRiskProMotorEntity.getStringValueForField("NatureOfGoodsCarried"));
			}
			if(claimRiskProMotorEntity.getBooleanValueForField("ConfigVehiclePlyingForHire")){
				selectValueFromList(vehiclePlyingForHireDropDown,claimRiskProMotorEntity.getStringValueForField("VehiclePlyingForHire"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPassengersCarried")) {
				clearAndSendKeys(numberOfPassengersCarriedTextField, claimRiskProMotorEntity.getStringValueForField("NumberOfPassengersCarried"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPassengerAsPerPermit")) {
				clearAndSendKeys(numberOfPassengerAsPerPermitTextField, claimRiskProMotorEntity.getStringValueForField("NumberOfPassengerAsPerPermit"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPersonsDead")) {
				clearAndSendKeys(numberOfPersonsDeadTextField, claimRiskProMotorEntity.getStringValueForField("NumberOfPersonsDead"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPersonsInjured")) {
				clearAndSendKeys(numberOfPersonsInjuredTextField, claimRiskProMotorEntity.getStringValueForField("NumberOfPersonsInjured"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPersonsForTPPD")) {
				clearAndSendKeys(numberOfPersonsForTPPDTextField, claimRiskProMotorEntity.getStringValueForField("NumberOfPersonsForTPPD"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigTotalNoOfClaimForSameClaimEvent")) {
				clearAndSendKeys(totalNoOfClaimForSameClaimEventTextField, claimRiskProMotorEntity.getStringValueForField("TotalNoOfClaimForSameClaimEvent"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNameOfWitness")) {
				clearAndSendKeys(nameOfWitnessTextField, claimRiskProMotorEntity.getStringValueForField("NameOfWitness"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
				clearAndSendKeys(addressOfWitnessTextField, claimRiskProMotorEntity.getStringValueForField("AddressOfWitness"));
			}	
			if(claimRiskProMotorEntity.getBooleanValueForField("ConfigVehicleRoadworthyCondition")){
				selectValueFromList(vehicleRoadworthyConditionDropDown,claimRiskProMotorEntity.getStringValueForField("VehicleRoadworthyCondition"));
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigPurposeOfUsingVehicle")) {
				clearAndSendKeys(purposeOfUsingVehicleTextField, claimRiskProMotorEntity.getStringValueForField("PurposeOfUsingVehicle"));
			}
		}
		else if(claimRiskProMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}

			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigInsuredName")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigRegistrationNo")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("RegistrationNo"), fetchValueFromTextFields(registrationNoTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigMake")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("Make"), fetchValueFromList(makeDropDown), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigModel")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("Model"), fetchValueFromTextFields(modelTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigChassisNo")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("ChassisNo"), fetchValueFromTextFields(chassisNoTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigTypeOfVehicleInsured")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("TypeOfVehicleInsured"), fetchValueFromList(typeOfVehicleInsuredDropDown), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigEngineNo")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("EngineNo"), fetchValueFromTextFields(engineNoTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigTrailerOptedOrNot")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("TrailerOptedOrNot"), fetchValueFromTextFields(trailerOptedOrNotTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigRegisteredLadenWeight")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("RegisteredLadenWeight"), fetchValueFromTextFields(registeredLadenWeightTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigUnladenWeight")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("UnladenWeight"), fetchValueFromTextFields(unladenWeightTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigWeightOfGoodsCarried")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("WeightOfGoodsCarried"), fetchValueFromTextFields(weightOfGoodsCarriedTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNatureOfPermit")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NatureOfPermit"), fetchValueFromTextFields(natureOfPermitTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNatureOfGoodsCarried")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NatureOfGoodsCarried"), fetchValueFromTextFields(natureOfGoodsCarriedTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigVehiclePlyingForHire")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("VehiclePlyingForHire"), fetchValueFromList(vehiclePlyingForHireDropDown), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPassengersCarried")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NumberOfPassengersCarried"), fetchValueFromTextFields(numberOfPassengersCarriedTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPassengerAsPerPermit")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NumberOfPassengerAsPerPermit"), fetchValueFromTextFields(numberOfPassengerAsPerPermitTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPersonsDead")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NumberOfPersonsDead"), fetchValueFromTextFields(numberOfPersonsDeadTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPersonsInjured")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NumberOfPersonsInjured"), fetchValueFromTextFields(numberOfPersonsInjuredTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNumberOfPersonsForTPPD")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NumberOfPersonsForTPPD"), fetchValueFromTextFields(numberOfPersonsForTPPDTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigTotalNoOfClaimForSameClaimEvent")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("TotalNoOfClaimForSameClaimEvent"), fetchValueFromTextFields(totalNoOfClaimForSameClaimEventTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigTotalNoOfCasesOfThirdPartyClaim")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("TotalNoOfCasesOfThirdPartyClaim"), fetchValueFromTextFields(totalNoOfCasesOfThirdPartyClaimTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigNameOfWitness")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("NameOfWitness"), fetchValueFromTextFields(nameOfWitnessTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("AddressOfWitness"), fetchValueFromTextFields(addressOfWitnessTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigPurposeOfUsingVehicle")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("PurposeOfUsingVehicle"),fetchValueFromTextFields(purposeOfUsingVehicleTextField), AssertionType.WARNING);
			}
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigVehicleRoadworthyCondition")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("VehicleRoadworthyCondition"), fetchValueFromList(vehicleRoadworthyConditionDropDown), AssertionType.WARNING);
			}
		}
	}



	public void navigateToMainAttributePage(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			claimRiskPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskProMotorEntity.getStringValueForField("ClaimRiskPropertyTitle")+"')]"), " Claim Risk Property ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimRiskPropertyTitle);
		}
	}
	public void clickOnClaimRiskForwardButton(ClaimRiskProMotorEntity claimRiskProMotorEntity){
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigClaimRiskForward")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}

	public void fillTPClaimRiskPropertyMotorDetails(ClaimRiskProMotorEntity claimRiskProMotorEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskProMotorEntity.getAction().equalsIgnoreCase("add") || claimRiskProMotorEntity.getAction().equalsIgnoreCase("edit")){
			if(claimRiskProMotorEntity.getBooleanValueForField("ConfigAnyTpClaimOccured")){
				selectValueFromList(anyTpClaimOccuredInThisPolicyDropDown,claimRiskProMotorEntity.getStringValueForField("AnyTpClaimOccured"));
			}
		}
		else if(claimRiskProMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskProMotorEntity.getBooleanValueForField("ConfigAnyTpClaimOccured")) {
				assertReference.assertEquals(claimRiskProMotorEntity.getStringValueForField("AnyTpClaimOccured"), fetchValueFromList(anyTpClaimOccuredInThisPolicyDropDown), AssertionType.WARNING);
			}
		}
	}
	public void clickOnTPClaimRiskPropertyMotorForwardButton(ClaimRiskProMotorEntity claimRiskProMotorEntity) throws InterruptedException{
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigTPClaimRiskForward")){		
			click(forwardButton);
			switchToWindow("Message Window");
			try{
				afterClickOnSaveButtonHandlePopup(claimRiskProMotorEntity);
			}catch(Exception e){}
			switchToFrame("display");
		}
	}
	public void afterClickOnSaveButtonHandlePopup(ClaimRiskProMotorEntity claimRiskProMotorEntity) throws InterruptedException {
		switchToWindow("Message Window");
		if (claimRiskProMotorEntity.getBooleanValueForField("ConfigCloseWindowButton")) {
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		//	isElementDisplayed(pageTitleAfterCreateReserve);
		}
	}

	public void fillandSubmitClaimRiskPropertyMotor(ClaimRiskProMotorEntity claimRiskProMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProMotorEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskPropertyMotor(claimRiskProMotorEntity, assertReference);
			navigateToMainAttributePage(claimRiskProMotorEntity);
			navigateToclaimHomePage(claimRiskProMotorEntity);
			navigateToInsuredItem(claimRiskProMotorEntity);
			navigateToDocument(claimRiskProMotorEntity);
			navigateToParties(claimRiskProMotorEntity);
			navigateToReserve(claimRiskProMotorEntity);
			navigateToPayment(claimRiskProMotorEntity);
			navigateToAttribute(claimRiskProMotorEntity);
			navigateToInsuredItemDetails(claimRiskProMotorEntity);
			navigateTInsuredItemAttribute(claimRiskProMotorEntity);
			clickOnForwardButton(claimRiskProMotorEntity);
			clickOnClaimRiskForwardButton(claimRiskProMotorEntity);
			fillTPClaimRiskPropertyMotorDetails(claimRiskProMotorEntity, assertReference);
			clickOnTPClaimRiskPropertyMotorForwardButton(claimRiskProMotorEntity);

		}
	}
}	
