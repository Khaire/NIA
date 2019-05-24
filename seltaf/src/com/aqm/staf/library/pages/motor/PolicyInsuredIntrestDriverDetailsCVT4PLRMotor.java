package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.DriverDetCVT4PLRMotorEntity;

public class PolicyInsuredIntrestDriverDetailsCVT4PLRMotor extends BasePage {

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;		
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	//Title
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestDocumentsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestDocumentsTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement insuredInterestScheduleTitle;
	//----------------------------------------------------------
	//Motor Page 4
	//Mayur_Product name= CV-G
	private PageElement whetherEligibleForSpecialDiscountTextField; 
	private PageElement superficialAreaInSqMetersTextField;
	//Mayur_Product name= CV-E
	private PageElement anyOfTheDriverEverConvictedOrAnyProsecutionPendingDropDown;
	private PageElement detailsOfConvictionTextArea;
	private PageElement inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossTextField;
	private PageElement whetherEligibleForSpecialDiscountDropDown;
	private PageElement doYouHoldAValidLicenseNoDropDown;
	private PageElement licenseTypeOfOwnerDriverDropDown;
	private PageElement ageofOwnerDriverTextField;
	private PageElement ownerDriverDrivingLicenseNoTextField;
	private PageElement ownerDriverLicenseIssueDateTextField;
	private PageElement ownerDriverLicenseExpiryDateTextField;
	private PageElement licenseIssuingAuthorityForOwnerDriverTextField;
	private PageElement nameOfNomineeTextArea;
	private PageElement ageOfNomineeTextField;
	private PageElement relationshipWithTheInsuredTextField;
	private PageElement genderOfTheNomineeDropDown;
	private PageElement driverTypeTextField;
	private PageElement driverNameTextField;
	private PageElement doYouHaveAValidDrivingLicenseTextField;
	private PageElement dateOfBirthTextField;
	private PageElement ageTextField;
	private PageElement sexDropDown;
	private PageElement experienceTextField;
	private PageElement addressTextArea;
	private PageElement nameOfTheAppointeeIfNomineeIsAMinorTextField;
	private PageElement relationshipToTheNomineeTextField;



	//*******CV-A(CHINTAN)INURED INTREST 4thPAGE

	private PageElement seatingCapacityIncludingDriverTextField;
	private PageElement grossVehicleWeightGVWTextField;
	private PageElement	insuredsDeclaredValueIDVTextField;

	//CV-B Yogesh
	//private PageElement grossVehicleWeightGVWTextField;
	private PageElement isTheVehicleFittedWithAntiTheftDeviceDropDown;
	private PageElement vehicleUseIsLimitedToOwnPremisesDropDown;
	private PageElement whetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurposeDropDown;
	private PageElement nCBApplicablePercentageDropDown; 
	private PageElement nameOfPreviousInsurerTextField;
	private PageElement previousPolicyNoTextField;
	private PageElement addressOfThePreviousInsurerTextarea;
	private PageElement doYouHaveAnyotherDriverDropDown;
	private PageElement vehiclePermitDetailsDropDown;;
	private PageElement expirydateofpreviousPolicyTextField;
	//CV-C
	private PageElement carryingCapacityIncludingDriverTextField;
	private PageElement cubicCapacityTextField;
	private PageElement whetherVehicleIsUsedForDrivingTuitionDropDown;
	private PageElement whetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallengedDropDown;
	private PageElement saveButton;


	public PolicyInsuredIntrestDriverDetailsCVT4PLRMotor(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Title
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")),"Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No.")),"Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/font/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDocumentsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestScheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Mayur_Product name= CV-G
		whetherEligibleForSpecialDiscountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Whether eligible for special discount')]/following::input"), "Whether eligible for special discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		superficialAreaInSqMetersTextField= new PageElement(By.name("propValues3"), "Superficial Area (in sq. meters) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product name= CV-E
		anyOfTheDriverEverConvictedOrAnyProsecutionPendingDropDown= new PageElement(By.xpath("//td//div[@id='Any of the driver ever convicted or any prosecution pending']/following::select"), "Any of the driver ever convicted or any prosecution pending DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfConvictionTextArea= new PageElement(By.xpath("//td//div[@id='Details of Conviction']/following::textarea"), "Details of Conviction Teaxtarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossTextField= new PageElement(By.xpath("//td//div[@id='Age of Owner Driver']/following::input"), "Age of Owner Driver TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherEligibleForSpecialDiscountDropDown= new PageElement(By.xpath("//td//div[@id='Whether eligible for special discount']/following::select"), "Whether eligible for special discount DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doYouHoldAValidLicenseNoDropDown= new PageElement(By.xpath("//td//div[@id='Do you hold a valid license No.']/following::select"), "Do you hold a valid license No. DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseTypeOfOwnerDriverDropDown= new PageElement(By.xpath("//td//div[@id='License Type of Owner Driver']/following::select"), "License Type of Owner Driver DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ageofOwnerDriverTextField= new PageElement(By.xpath("//td//div[@id='Age of Owner Driver']/following::input"), "Age of Owner Driver TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerDriverDrivingLicenseNoTextField= new PageElement(By.xpath("//td//div[@id='Owner Driver Driving License No']/following::input"), "Owner Driver Driving License No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerDriverLicenseIssueDateTextField= new PageElement(By.xpath("//td//div[@id='Owner Driver License Issue Date']/following::input"), "Owner Driver License Issue Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerDriverLicenseExpiryDateTextField= new PageElement(By.xpath("//td//div[@id='Owner Driver License Expiry Date']/following::input"), "Owner Driver License Expiry Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		licenseIssuingAuthorityForOwnerDriverTextField= new PageElement(By.xpath("//td//div[@id='License Issuing Authority for Owner Driver']/following::input"), "License Issuing Authority for Owner Driver TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfNomineeTextArea= new PageElement(By.xpath("//td//div[@id='Name of Nominee']/following::textarea"), "Name of Nominee Teaxtarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfNomineeTextField= new PageElement(By.xpath("//td//div[@id='Age of Nominee']/following::input"), "Age of Nominee TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithTheInsuredTextField= new PageElement(By.xpath("//td//div[@id='Relationship with the Insured']/following::input"), "Relationship with the Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		genderOfTheNomineeDropDown= new PageElement(By.xpath("//td//div[@id='Gender of the Nominee']/following::select"), "Gender of the Nominee DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		driverTypeTextField= new PageElement(By.xpath("//td//div[@id='Driver Type']/following::input"), "Driver TypeTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		driverNameTextField= new PageElement(By.xpath("//td//div[@id='Driver Name']/following::input"), "Driver Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouHaveAValidDrivingLicenseTextField= new PageElement(By.xpath("//td//div[@id='Do you have a valid driving license']/following::input"), "Do you have a valid driving license TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField= new PageElement(By.xpath("//td//div[@id='Date of birth']/following::input"), "Date of birth TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageTextField= new PageElement(By.xpath("//td//div[@id='Age']/following::input"), "Age TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown= new PageElement(By.xpath("//td//div[@id='Sex']/following::select"), "Sex DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		experienceTextField= new PageElement(By.xpath("//td//div[@id='Experience']/following::input"), "Experience TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressTextArea= new PageElement(By.xpath("//td//div[@id='Address']/following::textarea"), "Address Teaxtarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheAppointeeIfNomineeIsAMinorTextField= new PageElement(By.xpath("//td//div[@id='Name of the Appointee (if Nominee is a minor)']/following::input"), "Name of the Appointee (if Nominee is a minor) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipToTheNomineeTextField= new PageElement(By.xpath("//td//div[@id='Relationship to the Nominee']/following::input"), "Relationship to the Nominee TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//**************CV-A(CHINTAN) INSURED INTREST 4th PAGE**********
		seatingCapacityIncludingDriverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Seating Capacity(including driver)')]/following::input"), "Seating Capacity(including driver)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossVehicleWeightGVWTextField=new PageElement(By.xpath("//td//div[contains(text(),'Gross Vehicle Weight(GVW)')]/following::input"), "Gross Vehicle Weight(GVW)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredsDeclaredValueIDVTextField=new PageElement(By.xpath("//div[contains(text(),'Insureds declared Value (IDV)')]//following::input[1]"), "Insureds declared Value (IDV)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//CV-B yogesh
		//grossVehicleWeightGVWTextField=new PageElement(By.xpath("//td/div[contains(text(),'Gross Vehicle Weight(GVW)')]/following::input"),"Gross Vehicle Weight(GVW) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTheVehicleFittedWithAntiTheftDeviceDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is the vehicle fitted with Anti-theft device')]/following::select"),"Is the vehicle fitted with Anti-theft device DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleUseIsLimitedToOwnPremisesDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle use is limited to own premises')]/following::select"),"Vehicle use is limited to own premises DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurposeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether Vehicle designed as commercial vehicle and used for commercial and private purpose')]/following::select"),"Whether Vehicle designed as commercial vehicle and used for commercial and private purpose DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nCBApplicablePercentageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'NCB Applicable Percentage')]/following::select"),"NCB Applicable Percentage DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfPreviousInsurerTextField=new PageElement(By.xpath("//select[@name=('propValues15')]"),"Name of Previous Insurer TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyNoTextField=new PageElement(By.xpath("//td/div[contains(text(),'Previous Policy No')]/following::input"),"Previous Policy No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfThePreviousInsurerTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Address of the Previous Insurer')]/following::textarea"),"Address of the Previous Insurer Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouHaveAnyotherDriverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Do you Have Any other Driver')]/following::select[1]"),"Do you Have Any other Driver DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehiclePermitDetailsDropDown=new PageElement(By.xpath("//div[contains(text(),'Vehicle Permit Details')]//following::select[1]"),"Vehicle Permit Details DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		expirydateofpreviousPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Expiry date of previous Policy')]/following::input"),"Expiry date of previous Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CV-C
		carryingCapacityIncludingDriverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Carrying Capacity(including driver)')]/following::input"),"Carrying Capacity(including driver) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cubicCapacityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cubic Capacity')]/following::input"),"Cubic Capacity TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherVehicleIsUsedForDrivingTuitionDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether vehicle is used for driving tuition')]/following::select"),"Whether vehicle is used for driving tuition DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallengedDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether vehicle designed/modified for visually impaired /physically challenged')]/following::select"),"Whether vehicle designed/modified for visually impaired /physically challenged DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton= new PageElement(By.xpath("//input[@name=('btnSave')]"), "Save", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillPolicyInsuredIntrestDriverDetailsCVT4PLRMotor(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(driverDetCVT4PLRMotorEntity.getAction().equalsIgnoreCase("add") || driverDetCVT4PLRMotorEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name= CV-G
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCVGWhetherEligibleForSpecialDiscount")) {
				clearAndSendKeys(whetherEligibleForSpecialDiscountTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("CVGWhetherEligibleForSpecialDiscount"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigSuperficialAreaInSqMeters")) {
				clearAndSendKeys(superficialAreaInSqMetersTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("SuperficialAreaInSqMeters"));
			}
			//Mayur_Product name= CV-E
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAnyOfTheDriverEverConvictedOrAnyProsecutionPending")) {
				selectValueFromList(anyOfTheDriverEverConvictedOrAnyProsecutionPendingDropDown, driverDetCVT4PLRMotorEntity.getStringValueForField("AnyOfTheDriverEverConvictedOrAnyProsecutionPending"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDetailsOfConviction")) {
				clearAndSendKeys(detailsOfConvictionTextArea, driverDetCVT4PLRMotorEntity.getStringValueForField("DetailsOfConviction"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss")) {
				clearAndSendKeys(inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("InLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherEligibleForSpecialDiscount")) {
				selectValueFromList(whetherEligibleForSpecialDiscountDropDown, driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherEligibleForSpecialDiscount"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDoYouHoldAValidLicenseNo")) {
				selectValueFromList(doYouHoldAValidLicenseNoDropDown, driverDetCVT4PLRMotorEntity.getStringValueForField("DoYouHoldAValidLicenseNo"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigLicenseTypeOfOwnerDriver")) {
				selectValueFromList(licenseTypeOfOwnerDriverDropDown, driverDetCVT4PLRMotorEntity.getStringValueForField("LicenseTypeOfOwnerDriver"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAgeofOwnerDriver")) {
				clearAndSendKeys(ageofOwnerDriverTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("AgeofOwnerDriver"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigOwnerDriverDrivingLicenseNo")) {
				clearAndSendKeys(ownerDriverDrivingLicenseNoTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("OwnerDriverDrivingLicenseNo"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseIssueDate")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(driverDetCVT4PLRMotorEntity.getStringValueForField("OwnerDriverLicenseIssueDate"));
				clearAndEnterDate(ownerDriverLicenseIssueDateTextField, dateofIntimation);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseExpiryDate")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(driverDetCVT4PLRMotorEntity.getStringValueForField("OwnerDriverLicenseExpiryDate"));
				clearAndEnterDate(ownerDriverLicenseExpiryDateTextField, dateofIntimation);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigLicenseIssuingAuthorityForOwnerDriver")) {
				clearAndSendKeys(licenseIssuingAuthorityForOwnerDriverTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("LicenseIssuingAuthorityForOwnerDriver"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNameOfNominee")) {
				clearAndSendKeys(nameOfNomineeTextArea, driverDetCVT4PLRMotorEntity.getStringValueForField("NameOfNominee"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCVEAgeOfNominee")) {
				clearAndSendKeys(ageOfNomineeTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("CVEAgeOfNominee"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigRelationshipWithTheInsured")) {
				clearAndSendKeys(relationshipWithTheInsuredTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("RelationshipWithTheInsured"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigGenderOfTheNominee")) {
				selectValueFromList(genderOfTheNomineeDropDown, driverDetCVT4PLRMotorEntity.getStringValueForField("GenderOfTheNominee"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDriverType")) {
				clearAndSendKeys(driverTypeTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("DriverType"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDriverName")) {
				clearAndSendKeys(driverNameTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("DriverName"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDoYouHaveAValidDrivingLicense")) {
				clearAndSendKeys(doYouHaveAValidDrivingLicenseTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("DoYouHaveAValidDrivingLicense"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
				clearAndSendKeys(ageOfNomineeTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("AgeOfNominee"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAge")) {
				clearAndSendKeys(ageTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("Age"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDateOfBirth")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(driverDetCVT4PLRMotorEntity.getStringValueForField("DateOfBirth"));
				clearAndEnterDate(dateOfBirthTextField, dateofIntimation);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigExperience")) {
				clearAndSendKeys(experienceTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("Experience"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAddress")) {
				clearAndSendKeys(addressTextArea, driverDetCVT4PLRMotorEntity.getStringValueForField("Address"));
			}

			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNameOfTheAppointeeIfNomineeIsAMinor")) {
				clearAndSendKeys(nameOfTheAppointeeIfNomineeIsAMinorTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("NameOfTheAppointeeIfNomineeIsAMinor"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigRelationshipToTheNominee")) {
				clearAndSendKeys(relationshipToTheNomineeTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("RelationshipToTheNominee"));
			}
			//**************CV-A(CHINTAN) INSURED INTREST 4th PAGE**********
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigSeatingCapacityIncluding")) {
				clearAndSendKeys(seatingCapacityIncludingDriverTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("SeatingCapacityIncluding"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCVAGrossVehicleWeightGVW")) {
				clearAndSendKeys(grossVehicleWeightGVWTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("CVAGrossVehicleWeightGVW"));
			}

			//CV-B Yogesh
			/*if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigGrossVehicleWeightGVW")) {
				clearAndSendKeys(grossVehicleWeightGVWTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("GrossVehicleWeightGVW"));
			}*/
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigIsTheVehicleFittedWithAntiTheftDevice")) {
				selectValueFromList(isTheVehicleFittedWithAntiTheftDeviceDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("IsTheVehicleFittedWithAntiTheftDevice"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigVehicleUseIsLimitedToOwnPremises")) {
				selectValueFromList(vehicleUseIsLimitedToOwnPremisesDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("VehicleUseIsLimitedToOwnPremises"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurpose")) {
				selectValueFromList(whetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurposeDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurpose"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNCBApplicablePercentage")) {
				selectValueFromList(nCBApplicablePercentageDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("NCBApplicablePercentage"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNameOfPreviousInsurer")) {
				selectValueFromList(nameOfPreviousInsurerTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("NameOfPreviousInsurer"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigPreviousPolicyNo")) {
				clearAndSendKeys(previousPolicyNoTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("PreviousPolicyNo"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAddressOfThePreviousInsurer")) {
				clearAndSendKeys(addressOfThePreviousInsurerTextarea, driverDetCVT4PLRMotorEntity.getStringValueForField("AddressOfThePreviousInsurer"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDoYouHaveAnyotherDriver")) {
				selectValueFromList(doYouHaveAnyotherDriverDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("DoYouHaveAnyotherDriver"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigVehiclePermitDetails")) {
				selectValueFromList(vehiclePermitDetailsDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("VehiclePermitDetails"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigExpirydateofpreviousPolicy")){
				String expirydateofpreviousPolicy=RandomCodeGenerator.dateGenerator(driverDetCVT4PLRMotorEntity.getStringValueForField("ExpirydateofpreviousPolicy"));
				clearAndEnterDate(expirydateofpreviousPolicyTextField, expirydateofpreviousPolicy);
			}
			//CV-C
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCarryingCapacityIncludingDriver")) {
				clearAndSendKeys(carryingCapacityIncludingDriverTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("CarryingCapacityIncludingDriver"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCubicCapacity")) {
				clearAndSendKeys(cubicCapacityTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("CubicCapacity"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsUsedForDrivingTuition")) {
				selectValueFromList(whetherVehicleIsUsedForDrivingTuitionDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherVehicleIsUsedForDrivingTuition"));
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallenged")) {
				selectValueFromList(whetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallengedDropDown,driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallenged"));
			}
		}

		else if(driverDetCVT4PLRMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Mayur_Product name= CV-G
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCVGWhetherEligibleForSpecialDiscount")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("CVGWhetherEligibleForSpecialDiscount"), fetchValueFromTextFields(whetherEligibleForSpecialDiscountTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigSuperficialAreaInSqMetersTextField")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("SuperficialAreaInSqMeters"), fetchValueFromTextFields(superficialAreaInSqMetersTextField), AssertionType.WARNING);
			}

			//Mayur_Product name= CV-E
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAnyOfTheDriverEverConvictedOrAnyProsecutionPending")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("AnyOfTheDriverEverConvictedOrAnyProsecutionPending"), fetchValueFromList(anyOfTheDriverEverConvictedOrAnyProsecutionPendingDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDetailsOfConviction")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DetailsOfConviction"), fetchValueFromTextFields(detailsOfConvictionTextArea), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("InLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss"), fetchValueFromTextFields(inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherEligibleForSpecialDiscount")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherEligibleForSpecialDiscount"), fetchValueFromList(whetherEligibleForSpecialDiscountDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDoYouHoldAValidLicenseNo")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DoYouHoldAValidLicenseNo"), fetchValueFromList(doYouHoldAValidLicenseNoDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigLicenseTypeOfOwnerDriver")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("LicenseTypeOfOwnerDriver"), fetchValueFromList(licenseTypeOfOwnerDriverDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAgeofOwnerDriver")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("AgeofOwnerDriver"), fetchValueFromTextFields(ageofOwnerDriverTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigOwnerDriverDrivingLicenseNo")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("OwnerDriverDrivingLicenseNo"), fetchValueFromTextFields(ownerDriverDrivingLicenseNoTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseIssueDate")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("OwnerDriverLicenseIssueDate"), fetchValueFromTextFields(ownerDriverLicenseIssueDateTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseExpiryDate")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("OwnerDriverLicenseExpiryDate"), fetchValueFromTextFields(ownerDriverLicenseExpiryDateTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigLicenseIssuingAuthorityForOwnerDriver")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("LicenseIssuingAuthorityForOwnerDriver"), fetchValueFromTextFields(licenseIssuingAuthorityForOwnerDriverTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfignameOfNominee")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("NameOfNominee"), fetchValueFromTextFields(nameOfNomineeTextArea), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCVEAgeOfNominee")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("CVEAgeOfNominee"), fetchValueFromTextFields(ageOfNomineeTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigRelationshipWithTheInsured")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("RelationshipWithTheInsured"), fetchValueFromTextFields(relationshipWithTheInsuredTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigGenderOfTheNominee")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("GenderOfTheNominee"), fetchValueFromList(genderOfTheNomineeDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDriverType")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DriverType"), fetchValueFromTextFields(driverTypeTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDriverName")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DriverName"), fetchValueFromTextFields(driverNameTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDoYouHaveAValidDrivingLicense")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DoYouHaveAValidDrivingLicense"), fetchValueFromTextFields(doYouHaveAValidDrivingLicenseTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDateOfBirth")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DateOfBirth"), fetchValueFromTextFields(dateOfBirthTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAge")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("Age"), fetchValueFromTextFields(ageTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigSexDropDown")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigExperience")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("Experience"), fetchValueFromTextFields(experienceTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAddress")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("Address"), fetchValueFromTextFields(addressTextArea), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNameOfTheAppointeeIfNomineeIsAMinor")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("NameOfTheAppointeeIfNomineeIsAMinor"), fetchValueFromTextFields(nameOfTheAppointeeIfNomineeIsAMinorTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigRelationshipToTheNominee")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("RelationshipToTheNominee"), fetchValueFromTextFields(relationshipToTheNomineeTextField), AssertionType.WARNING);
			}
			//**************CV-A(CHINTAN) INSURED INTREST 4th PAGE**********
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigSeatingCapacityIncluding")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("SeatingCapacityIncluding"), fetchValueFromTextFields(seatingCapacityIncludingDriverTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCVAGrossVehicleWeightGVW")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("CVAGrossVehicleWeightGVW"), fetchValueFromTextFields(grossVehicleWeightGVWTextField), AssertionType.WARNING);
			}
			/*if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInsuredsDeclaredValueIDV")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("InsuredsDeclaredValueIDV"), fetchValueFromTextFields(insuredsDeclaredValueIDVTextField), AssertionType.WARNING);
			}*/
			//CV-B Yogesh
			/*if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigGrossVehicleWeightGVW")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("GrossVehicleWeightGVW"), fetchValueFromTextFields(grossVehicleWeightGVWTextField), AssertionType.WARNING);
			}*/
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigIsTheVehicleFittedWithAntiTheftDevice")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("IsTheVehicleFittedWithAntiTheftDevice"), fetchValueFromList(isTheVehicleFittedWithAntiTheftDeviceDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigVehicleUseIsLimitedToOwnPremises")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("VehicleUseIsLimitedToOwnPremises"), fetchValueFromList(vehicleUseIsLimitedToOwnPremisesDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurpose")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurpose"), fetchValueFromList(whetherVehicleDesignedAsCommercialVehicleAndUsedForCommercialAndPrivatePurposeDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNCBApplicablePercentage")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("NCBApplicablePercentage"), fetchValueFromList(nCBApplicablePercentageDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigNameOfPreviousInsurer")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("NameOfPreviousInsurer"), fetchValueFromList(nameOfPreviousInsurerTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigPreviousPolicyNo")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("PreviousPolicyNo"), fetchValueFromTextFields(previousPolicyNoTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAddressOfThePreviousInsurer")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("AddressOfThePreviousInsurer"), fetchValueFromTextFields(addressOfThePreviousInsurerTextarea), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDoYouHaveAnyotherDriver")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("DoYouHaveAnyotherDriver"), fetchValueFromList(doYouHaveAnyotherDriverDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigVehiclePermitDetails")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("vehiclePermitDetails"), fetchValueFromList(vehiclePermitDetailsDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigExpirydateofpreviousPolicy")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(driverDetCVT4PLRMotorEntity.getStringValueForField("ExpirydateofpreviousPolicy")) ,fetchValueFromTextFields(expirydateofpreviousPolicyTextField),AssertionType.WARNING);
			}
			//CV-C
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCarryingCapacityIncludingDriver")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("CarryingCapacityIncludingDriver"), fetchValueFromTextFields(carryingCapacityIncludingDriverTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCubicCapacity")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("CubicCapacity"), fetchValueFromTextFields(cubicCapacityTextField), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsUsedForDrivingTuition")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherVehicleIsUsedForDrivingTuition"), fetchValueFromList(whetherVehicleIsUsedForDrivingTuitionDropDown), AssertionType.WARNING);
			}
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigWhetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallenged")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("WhetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallenged"), fetchValueFromList(whetherVehicleDesignedModifiedForVisuallyImpairedPhysicallyChallengedDropDown), AssertionType.WARNING);

			}
		}
	}
	//Shwetha(18/06/2018)
	public void fillInsuredDeclaredValue(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(driverDetCVT4PLRMotorEntity.getAction().equalsIgnoreCase("add") || driverDetCVT4PLRMotorEntity.getAction().equalsIgnoreCase("edit")){
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInsuredsDeclaredValueIDV")) {
				if(driverDetCVT4PLRMotorEntity.getStringValueForField("Product").equalsIgnoreCase("CV")) {
					click(forwardButton);
					clearAndSendKeys(insuredsDeclaredValueIDVTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("InsuredsDeclaredValueIDV"));
				}

				else if(driverDetCVT4PLRMotorEntity.getStringValueForField("Product").equalsIgnoreCase("TW")||driverDetCVT4PLRMotorEntity.getStringValueForField("Product").equalsIgnoreCase("PC")) {
					clearAndSendKeys(insuredsDeclaredValueIDVTextField, driverDetCVT4PLRMotorEntity.getStringValueForField("InsuredsDeclaredValueIDV"));
				}
			}
		}
		else if(driverDetCVT4PLRMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInsuredsDeclaredValueIDV")) {
				assertReference.assertEquals(driverDetCVT4PLRMotorEntity.getStringValueForField("InsuredsDeclaredValueIDV"), fetchValueFromTextFields(insuredsDeclaredValueIDVTextField), AssertionType.WARNING);
			}	
		}
	}
	public void navigateToPolicy(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity ){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberDocuments")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigMemberSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnForwardButton(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity) throws InterruptedException{
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			Thread.sleep(3000);
			click(forwardButton);
			switchToFrame("display");
			return;
		}
	}

	public void clickOnSaveButton(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity) throws InterruptedException{
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnVerifyForwardButton(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity) throws InterruptedException{
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigVerifyForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnBackButton(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity){
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnForwardNonNilEndorseButton(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity) throws InterruptedException{
		if (driverDetCVT4PLRMotorEntity.getBooleanValueForField("ConfigForwardNonNilEndorseButton")){
			click(forwardButton);
			Thread.sleep(3000);
			switchToFrame("display");
			return;
		}
	}

	public void fillandSubmitPolicyInsuredIntrestDriverDetailsCVT4PLRMotor(DriverDetCVT4PLRMotorEntity driverDetCVT4PLRMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(driverDetCVT4PLRMotorEntity.getConfigExecute())){
			fillPolicyInsuredIntrestDriverDetailsCVT4PLRMotor(driverDetCVT4PLRMotorEntity, assertReference);
			fillInsuredDeclaredValue(driverDetCVT4PLRMotorEntity, assertReference);
			clickOnForwardButton(driverDetCVT4PLRMotorEntity );
			clickOnSaveButton(driverDetCVT4PLRMotorEntity);
			clickOnForwardNonNilEndorseButton(driverDetCVT4PLRMotorEntity );
			clickOnVerifyForwardButton(driverDetCVT4PLRMotorEntity );
			navigateToPolicy(driverDetCVT4PLRMotorEntity );
			navigateToAttribute(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterest(driverDetCVT4PLRMotorEntity );
			navigateToCoverage(driverDetCVT4PLRMotorEntity );
			navigateToLoan(driverDetCVT4PLRMotorEntity );
			navigateToClientDetails(driverDetCVT4PLRMotorEntity );
			navigateToRelation(driverDetCVT4PLRMotorEntity );
			navigateToPayment(driverDetCVT4PLRMotorEntity );
			navigateToFollowup(driverDetCVT4PLRMotorEntity );
			navigateToDocument(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterestDetails(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterestAttributes(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterestAttachCoverages(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterestRelations(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterestDocuments(driverDetCVT4PLRMotorEntity);
			navigateToInsuredInterestPayments(driverDetCVT4PLRMotorEntity );
			navigateToInsuredInterestSchedule(driverDetCVT4PLRMotorEntity);

		}
	}
}
