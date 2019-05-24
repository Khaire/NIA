package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MoreCommeVehiDMotorEntity;

public class PolicyInsuredIntrestMoreCommercialVehicleDetailMotor extends BasePage {
	//CV-B
	//	private PageElement typeOfCommercialVehiclesDropDown;
	private PageElement typeOfTrailerDropDown;
	private PageElement typeOfBodyOthersDropDown;
	private PageElement isVehicleACTextField;
	//private PageElement basicColorOfVehicleDropDown;
	//private PageElement currentOwnershipDropDown;
	//private PageElement newVehicleDropDown;
	//private PageElement yearOfManufactureDropDown;
	private PageElement dateOfFirstPurchaseOfNewVehicleByOriginalPurchaserTextField;

	private PageElement registrationDateTextField;
	//	private PageElement vehicleInRoadworthyConditionAndFreeFromDamageDropDown;
	private PageElement loadingAmountForNotRoadworthyConditionTextField;

	private PageElement vehicleAgeInMonthsTextField;
	//	private PageElement registrationValidityDateTextField;
	private PageElement iDVAfterDepreciationTextField;

	//CV-C
	private PageElement typeOfPassengerCarryingDropDown;
	private PageElement typeOfBodyPassengerCarryingDropDown;
	private PageElement colorAsPerRCBookTextarea;
	private PageElement vehicleZoneForCVDropDown;
	private PageElement vehicleZoneForCVC1C4DropDown;
	private PageElement purposeOfUsingPassengerVehicleC1DropDown;
	private PageElement purposeOfUsingPassengerVehicleC2C3C4DropDown;
	private PageElement otherPurposeOfUsingVehicleTextarea;
	//CV-D
	private PageElement typeOfMiscSpecialTypeDropDown;
	private PageElement inclusionOfOverturningDropDown;
	private PageElement typeOfBodyMiscSpecialTypeDropDown;

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
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement insuredInterestDocumentsTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;

	private PageElement typeOfRoadRiskDropDown;
	private PageElement trailersDetailsButton;

	/*	private PageElement registrationNo1TextField;
	private PageElement registrationNo2TextField;
	private PageElement registrationNo3TextField;
	private PageElement registrationNo4TextField;*/
	//private PageElement chassisNoTextField;
	private PageElement dateOfSaleTextField;
	//	private PageElement vehicleInvoiceValueTextField;
	private PageElement iDVOfTheTrailerTextField;
	private PageElement deleteWindowButton;
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;

	//*************PC(CHINTAN)INURED INTREST**********
	private PageElement typeOfPrivatCarDropDown;
	private PageElement	currentOwnershipDropDown;	
	private PageElement	newVehicleDropDown;	
	private PageElement	yearOfManufactureDropDown;	
	private PageElement	dateOfFirstPurchaseOfNewVehicleTextField;
	private PageElement	registrationNo1TextField;
	private PageElement	registrationNo2TextField;
	private PageElement	registrationNo3TextField;
	private PageElement	registrationNo4TextField;
	private PageElement	dateOfRegistrationTextField;
	private PageElement	basicColorOfVehicleDropDown;
	private PageElement	colorAsPerRCBookTextArea;	
	private PageElement	engineNoTextField;	
	private PageElement	chassisNoTextField;	
	private PageElement	makeDropDown;
	private PageElement	modelDropDown;
	private PageElement	typeOfBodyTextField;	
	private PageElement	variantTextField;
	private PageElement	vehicleZoneForPrivateCarDropDown;
	private PageElement	typeOfFuelDropDown;
	private PageElement	whetherVehicleIsUsedForDrivingTuitionDropDown;
	private PageElement	vehicleUseIsLimiteToOwnPremisesDropDown;
	private PageElement	whetherVehicleBelongsToForeignEmbassyDropDown;
	private PageElement	whetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClubDropDown;
	private PageElement	vehicleDesignedForBlindHandicappedMentallyChallengedDropDown;
	private PageElement	fibreGlassTankFittedDropDown;
	private PageElement	valueOfFibreGlassFuelTanksTextField;
	private PageElement	areYouAMemberOfAutomobileAssociationOfIndiaDropDown;
	private PageElement	nameOfAssociationTextField;
	private PageElement	membershipNoTextField;
	private PageElement	isLifeMemberDropDown;
	private PageElement	dateOfMembershipExpiryTextField;
	private PageElement	carInRoadworthyConditionAndFreeFromDamageDropDown;
	private PageElement	detailsOfVehicleConditionTextField;
	private PageElement	isTheVehicleFittedWithAntitheftDeviceDropDown;
	private PageElement	obsoleteVehicleDropDown;
	private PageElement	discretionToRODropDown;
	private PageElement	approvalNoTextField;
	private PageElement	approvalDateTextField;
	private PageElement	extensionofGeographicalArearequiredDropDown;
	private PageElement	extensionofGeographicalAreatoBangladeshDropDown;
	private PageElement	extensionofGeographicalAreatoBhutanDropDown;
	private PageElement	extensionofGeographicalAreatoNepalDropDown;
	private PageElement	extensionofGeographicalAreatoPakistanDropDown;
	private PageElement	extensionofGeographicalAreatoSriLankaDropDown;
	private PageElement	extensionofGeographicalAreatoMaldivesDropDown;
	private PageElement	whetherVehiclebelongtoEmbassiesorimportedwithoutCustomDutyDropDown;
	private PageElement	vehicleRequisitionedbyGovernmentDropDown;
	private PageElement	registrationValidityDateTextField;
	private PageElement	noofdaysforRallyTextField;
	private PageElement	whetherRallyextensionrequiredforMotorRacingSpeedTestDropDown;
	//***********TW(CHINTAN)INSURED INTREST***********
	private PageElement typeOfTwoWheelerDropDown;
	private PageElement twoWheelersTypeOfBodyDropDown;
	private PageElement vehicleZoneForTwoWheelerDropDown;
	private PageElement	otherMakeDetailTextField;
	private PageElement vehicleInRoadworthyConditionAndFreeFromDamageDropDown;
	private PageElement vehicleInvoiceValueTextField;
	private PageElement	biFuelSystemValueTextField;
	private PageElement inBuiltBiFuelSystemFittedDropDown;
	private PageElement twColorAsPerRCBookTextField;
	private PageElement twYearOfManufactureDropDown;
	private PageElement twDateofFirstPurchaseOfNewVehicle;
	private PageElement twEngineNoTextField;
	private PageElement twChassisNoTextField;
	private PageElement twMakeDropDown;
	private PageElement twvehicleInvoiceValueTextField;


	//***********CV-A(CHINTAN)INSURED INTREST***********
	private PageElement	typeOfCommercialVehiclesDropDown;
	private PageElement	typeOfGoodsCarryingDropDown;
	private PageElement	goodsCarryingVehicleDescriptionTextField;
	private PageElement whetherVehicleIsImportedDropDown;
	private PageElement typeofBodyGoodsCarryingDropDown;

	private PageElement makeModelFindButton;
	private PageElement makeModelCodeLink;

	//TW
	private PageElement twMakeModelFindButton;
	private PageElement twMakeModelCodeLink;
	private PageElement dateOfRegistrationPCTextField;
	//*cvb for trailer detail
	private PageElement registrationNo1TextFieldCvb;
	private PageElement registrationNo2TextFieldCvb;
	private PageElement	registrationNo3TextFieldCvb;
	private PageElement	registrationNo4TextFieldCvb;
	private PageElement	chassisNoTextFieldCvb;	
	private PageElement	dateofsellCvb;	
	private PageElement	VehicleInvoiceValueCvb;	
	private PageElement	newVehicleDropDownCvb;

	private PageElement vehicleInvoiceLabel;


	public PolicyInsuredIntrestMoreCommercialVehicleDetailMotor(WebDriver driver, String pageName) {
		super(driver, pageName);
		//CV-B
		typeOfCommercialVehiclesDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Commercial Vehicles')]/following::select"),"Type of Commercial Vehicles DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfTrailerDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Trailer')]/following::select"),"Type of Trailer DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBodyOthersDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Body ( Others )')]/following::select"),"Type of Body ( Others ) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isVehicleACTextField=new PageElement(By.xpath("//td/div[contains(text(),'Is Vehicle AC?')]/following::input"),"Is Vehicle AC? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//basicColorOfVehicleDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Basic color of vehicle')]/following::select"),"Basic color of vehicle DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//currentOwnershipDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Current Ownership')]/following::select"),"Current Ownership DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//newVehicleDropDown=new PageElement(By.xpath("//td/div[contains(text(),'New Vehicle')]/following::select"),"New Vehicle DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//yearOfManufactureDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Year of Manufacture')]/following::select"),"Year of Manufacture DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfFirstPurchaseOfNewVehicleByOriginalPurchaserTextField=new PageElement(By.xpath("//td/div[contains(text(),'Date of First Purchase of New vehicle by Original')]/following::input"),"Date of First Purchase of New vehicle by Original Purchaser TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*registrationNo1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Registration No (1)')]/following::input"),"Registration No (1) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Registration No (2)')]/following::input"),"Registration No (2) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Registration No (3)')]/following::input"),"Registration No (3) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo4TextField=new PageElement(By.xpath("//td/div[contains(text(),'Registration No (4)')]/following::input"),"Registration No (4) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Registration Date')]/following::input"),"Registration Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);*/
		//vehicleInRoadworthyConditionAndFreeFromDamageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle in roadworthy condition and free from damage')]/following::select"),"Vehicle in roadworthy condition and free from damage DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingAmountForNotRoadworthyConditionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Loading amount for not Roadworthy Condition')]/following::input"),"Loading amount for not Roadworthy Condition TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleInvoiceValueTextField=new PageElement(By.xpath("//input[@name='propValues32']"),"Vehicle Invoice Value TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleAgeInMonthsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle Age in Months')]/following::input"),"Vehicle Age in Months TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//new PageElement(By.xpath("//td/div[contains(text(),'Registration Validity Date')]/following::input"),"Registration Validity Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iDVAfterDepreciationTextField=new PageElement(By.xpath("//td/div[contains(text(),'IDV after Depreciation')]/following::input"),"IDV after Depreciation TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CV-C
		typeOfPassengerCarryingDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Passenger Carrying')]/following::select"),"Type of Passenger Carrying DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBodyPassengerCarryingDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Body ( Passenger Carrying )')]/following::select"),"Type of Body ( Passenger Carrying ) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		colorAsPerRCBookTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Color as per RC book')]/following::textarea"),"Color as per RC book TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleZoneForCVDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle Zone for CV')]/following::select"),"Vehicle Zone for CV DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleZoneForCVC1C4DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle zone for CV(C1-C4)')]/following::select"),"Vehicle zone for CV(C1-C4) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUsingPassengerVehicleC1DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Purpose of Using Passenger Vehicle(C1)')]/following::select"),"Purpose of Using Passenger Vehicle(C1) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		purposeOfUsingPassengerVehicleC2C3C4DropDown=new PageElement(By.xpath("//td/div[contains(text(),'Purpose of Using Passenger Vehicle(C2,C3,C4)')]/following::select"),"Purpose of Using Passenger Vehicle(C2,C3,C4) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherPurposeOfUsingVehicleTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Other Purpose of Using Vehicle')]/following::textarea"),"Other Purpose of Using Vehicle TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CV-D
		typeOfMiscSpecialTypeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Misc & Special Type')]/following::select"),"Type of Misc & Special Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		inclusionOfOverturningDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Inclusion of overturning')]/following::select"),"Inclusion of overturning DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBodyMiscSpecialTypeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Body ( Misc & Special Type )')]/following::select"),"Type of Body ( Misc & Special Type ) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

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
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Documents Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfRoadRiskDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Road Risk')]/following::select"), "Type of Road Risk DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		trailersDetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Trailers Details')]/following::input"), "Trailers Details Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//registrationNo1TextField= new PageElement(By.name("Data_190707613122007_0"), " Registration No (1) TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//registrationNo2TextField= new PageElement(By.name("Data_195604831122007_0"), " Registration No (2) TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//registrationNo3TextField= new PageElement(By.name("Data_195560029122007_0"), " Registration No (3) TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//registrationNo4TextField= new PageElement(By.name("Data_195560129122007_0"), " Registration No (4) TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chassisNoTextField= new PageElement(By.name("Data_890310042001_0"), " Chassis No TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfSaleTextField= new PageElement(By.name("Data_890310042001_0"), " Date of Sale TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//vehicleInvoiceValueTextField= new PageElement(By.name("Data_191360513122007_0"), " Vehicle Invoice Value TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iDVOfTheTrailerTextField= new PageElement(By.name("Data_267084024062009_0"), " IDV of the Trailer TextField in Open Button Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deleteWindowButton= new PageElement(By.name("btnDel"), "Delete button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addWindowButton= new PageElement(By.name("btnAdd"), "Add button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton= new PageElement(By.name("btnSave"), "Save button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton= new PageElement(By.name("btnClose"), "Close button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//*************PC(CHINTAN)INURED INTREST**********

		//typeOfPrivatCarDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Private Car')]/following::select"),"Type of Private Car", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		currentOwnershipDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Current Ownership')]/following::select"),"Current Ownership", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//newVehicleDropDown=new PageElement(By.xpath("//td//div[contains(text(),'New Vehicle')]/following::select"),"New Vehicle", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfManufactureDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Year of Manufacture')]/following::select"),"Year of Manufacture", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfFirstPurchaseOfNewVehicleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of First Purchase of New vehicle by Original Purchase')]/following::input"),"Date of First Purchase of New vehicle by Original Purchase", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo1TextField=new PageElement(By.xpath("//td//div[contains(text(),'Registration No (1)')]/following::input"),"Registration No (1)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo2TextField=new PageElement(By.xpath("//td//div[contains(text(),'Registration No (2)')]/following::input"),"Registration No (2)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo3TextField=new PageElement(By.xpath("//td//div[contains(text(),'Registration No (3)')]/following::input"),"Registration No (3)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo4TextField=new PageElement(By.xpath("//td//div[contains(text(),'Registration No (4)')]/following::input"),"Registration No (4)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//	dateOfRegistrationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Registration')]/following::input"),"Date of Registration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicColorOfVehicleDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basic color of vehicle')]/following::select"),"Basic color of vehicle", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//colorAsPerRCBookTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Color as per RC book')]/following::input"),"Color as per RC book", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		engineNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Engine No')]/following::input"),"Engine No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chassisNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Chassis No')]/following::input"),"Chassis No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		makeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Make')]/following::select"),"Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modelDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Model')]/following::select"),"Model", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBodyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type of Body')]/following::select"),"Type of Body", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		variantTextField=new PageElement(By.xpath("//td//div[contains(text(),'Variant')]/following::textarea"),"Variant", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleZoneForPrivateCarDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Zone for Private Car')]/following::select"),"Vehicle Zone for Private Car", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfFuelDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Fuel')]/following::select"),"Type of Fuel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherVehicleIsUsedForDrivingTuitionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether vehicle is used for driving tuition')]/following::select[1]"),"Whether vehicle is used for driving tuition", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleUseIsLimiteToOwnPremisesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle use is limited to own premises')]/following::select[1]"),"Vehicle use is limited to own premises", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherVehicleBelongsToForeignEmbassyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether vehicle belongs to foreign embassy or consulate')]/following::select[1]"),"Whether vehicle belongs to foreign embassy or consulate", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClubDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether vehicle is certified as Vintage car by Vintage and Classic Car Club')]/following::select[1]"),"Whether vehicle is certified as Vintage car by Vintage and Classic Car Club", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleDesignedForBlindHandicappedMentallyChallengedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle designed for Blind/Handicapped/Mentally Challenged persons and endorsed by RTA')]/following::select[1]"),"Vehicle designed for Blind/Handicapped/Mentally Challenged persons and endorsed by RTA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fibreGlassTankFittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Fibre Glass Tank Fitted')]/following::select[1]"),"Fibre Glass Tank Fitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valueOfFibreGlassFuelTanksTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value of Fibre glass fuel tanks')]/following::input"),"Value of Fibre glass fuel tanks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areYouAMemberOfAutomobileAssociationOfIndiaDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Are you a member of Automobile Association of India')]/following::select[1]"),"Are you a member of Automobile Association of India", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfAssociationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of Association')]/following::input"),"Name of Association", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		membershipNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Membership No')]/following::input"),"Membership No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isLifeMemberDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Life Member')]/following::select"),"Is Life Member", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfMembershipExpiryTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Membership Expiry')]/following::input"),"Date of Membership Expiry", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		carInRoadworthyConditionAndFreeFromDamageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Car in roadworthy condition and free from damage')]/following::select[1]"),"Car in roadworthy condition and free from damage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfVehicleConditionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Details of Vehicle Condition')]/following::textarea"),"Details of Vehicle Condition", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTheVehicleFittedWithAntitheftDeviceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is the vehicle fitted with Anti-theft device')]/following::select[1]"),"Is the vehicle fitted with Anti-theft device", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		obsoleteVehicleDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Obsolete Vehicle')]/following::select[1]"),"Obsolete Vehicle", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		discretionToRODropDown=new PageElement(By.xpath("//td//div[contains(text(),'Discretion to RO')]/following::select"),"Discretion to RO", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approvalNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approval No')]/following::select"),"Approval No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		approvalDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approval Date')]/following::select"),"Approval Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionofGeographicalArearequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area required')]/following::select[1]"),"Extension of Geographical Area required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoBangladeshDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Bangladesh')]/following::select"),"Extension of Geographical Area to Bangladesh", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoBhutanDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Bhutan')]/following::select"),"Extension of Geographical Area to Bhutan", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoNepalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Nepal')]/following::select"),"Extension of Geographical Area to Nepal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoPakistanDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Pakistan')]/following::select"),"Extension of Geographical Area to Pakistan", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoSriLankaDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Sri Lanka')]/following::select"),"Extension of Geographical Area to Sri Lanka", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoMaldivesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Maldives')]/following::select"),"Extension of Geographical Area to Maldives", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherVehiclebelongtoEmbassiesorimportedwithoutCustomDutyDropDown=new PageElement(By.xpath("//div[@id='Whether Vehicle belong to Embassies  or imported without Custom Duty']/following::select[1]"),"Whether Vehicle belong to Embassies or imported without Custom Duty", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleRequisitionedbyGovernmentDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Requisitioned by Government')]/following::select[1]"),"Vehicle Requisitioned by Government", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		registrationValidityDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Registration Validity Date')]/following::input"),"Registration Validity Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noofdaysforRallyTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of days for Rally')]/following::input"),"No of days for Rally", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherRallyextensionrequiredforMotorRacingSpeedTestDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Rally extension required for Motor Racing / Speed Test')]/following::select"),"Whether Rally extension required for Motor Racing / Speed Test", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//***********TW(CHINTAN)INSURED INTREST***********
		typeOfTwoWheelerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Two Wheeler","select")),"Type of Two Wheeler", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		twoWheelersTypeOfBodyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Two Wheelers Type Of Body')]/following::select"),"Two Wheelers Type Of Body", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleZoneForTwoWheelerDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Zone For Two Wheeler')]/following::select"),"Vehicle Zone For Two Wheeler", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherMakeDetailTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other Make Detail')]/following::textarea"),"Other Make Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleInRoadworthyConditionAndFreeFromDamageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle in roadworthy condition and free from damage')]/following::select"),"Vehicle in roadworthy condition and free from damage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		twColorAsPerRCBookTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Color as per RC book","textarea")),"Color As Per RC Book", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		twYearOfManufactureDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of Manufacture","select")),"Year of Manufacture", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		twDateofFirstPurchaseOfNewVehicle=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Sale","input")),"Date of first purchase of new vehicle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		twEngineNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Engine No","input")),"Engine Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		twChassisNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Chassis No","input")),"Chassis Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		twMakeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Make","select")),"Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		twvehicleInvoiceValueTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Vehicle Invoice Value","input")),"Vehicle Invoice Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//vehicleInvoiceValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Invoice Value')]/following::select"),"Vehicle Invoice Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		biFuelSystemValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bi-fuel System Value')]/following::input"),"Bi-fuel System Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		inBuiltBiFuelSystemFittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'In Built Bi-fuel System fitted')]/following::select"),"In Built Bi-fuel System fitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//***********CV-A(CHINTAN)INSURED INTREST***********
		typeOfCommercialVehiclesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Commercial Vehicles')]/following::select"),"Type of Commercial Vehicles", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfGoodsCarryingDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Goods Carrying')]/following::select"),"Type of Goods Carrying", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		goodsCarryingVehicleDescriptionTextField=new PageElement(By.xpath("//td//div[contains(text(),'Goods Carrying vehicle description')]/following::textarea"),"Goods Carrying vehicle description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherVehicleIsImportedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether vehicle is imported')]/following::select"),"Whether vehicle is imported", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofBodyGoodsCarryingDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Body ( Goods carrying )')]/following::select"),"typeofBodyGoodsCarryingDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		registrationDateTextField=new PageElement(By.xpath("//input[@name='propValues26']"),"Registration Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		makeModelFindButton= new PageElement(By.xpath("//input[@name=('propValues10')]//following::img[2]"), "Find", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		makeModelCodeLink = new PageElement(By.xpath("//div[contains(text(),'Make & Model List')]//following::a[1]"), "Make Model", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		twMakeModelFindButton=new PageElement(By.xpath("//input[@name='propValues17']/following::img[1]"), "Find", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		twMakeModelCodeLink=new PageElement(By.xpath("//div[contains(text(),'Make & Model List')]//following::a[1]"), "Make Model", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		typeOfPrivatCarDropDown=new PageElement(By.xpath("//select[@name='propValues1']"),"Type of Private Car", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//	newVehicleDropDown=new PageElement(By.xpath("//select[@name='propValues19']"),"New Vehicle", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		newVehicleDropDown=new PageElement(By.xpath("//div[contains(text(),'New Vehicle')]//following::select[1]"),"New Vehicle", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfRegistrationPCTextField=new PageElement(By.xpath("//div[contains(text(),'Date of Registration')]/following::input[1]"),"Registration DatePC TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);    
		colorAsPerRCBookTextArea=new PageElement(By.xpath("//div[contains(text(),'Color as per RC book')]/following::textarea[1]"),"Color RC Book TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//field for cvb
		registrationNo1TextFieldCvb=new PageElement(By.xpath("//input[@name=('Data_190707613122007_0')]"), "Registration1 DatePC TextFieldCvb",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo2TextFieldCvb=new PageElement(By.xpath("//input[@name=('Data_195604831122007_0')]"), "Registration2 DatePC TextFieldCvb",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo3TextFieldCvb=new PageElement(By.xpath("//input[@name=('Data_195560029122007_0')]"), "Registration3 DatePC TextFieldCvb", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationNo4TextFieldCvb=new PageElement(By.xpath("//input[@name=('Data_195560129122007_0')]"), "Registration4 DatePC TextFieldCvb", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chassisNoTextFieldCvb=new PageElement(By.xpath("//input[@name=('Data_890310042001_0')]"), "Registration4 DatePC TextFieldCvb", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofsellCvb=new PageElement(By.xpath("//input[@name=('Data_196016704012008_0')]"), "date of sellCvb", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		VehicleInvoiceValueCvb=new PageElement(By.xpath("//input[@name=('Data_191360513122007_0')]"), "date of sellCvb", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		newVehicleDropDownCvb=new PageElement(By.xpath("//*[@id=\"19\"]/td[2]/div/select"), "new vahcle drop down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		vehicleInvoiceLabel=new PageElement(By.xpath("//td//input[@name='slNo0']/preceding::td[3]"),"Registration DatePC TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


	}
	public void fillPolicyInsuredIntrestMoreCommercialVehicleDetailMotor(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntity, CustomAssert assertReference) throws InterruptedException{

		if(moreCommeVehiDMotorEntity.getAction().equalsIgnoreCase("add") || moreCommeVehiDMotorEntity.getAction().equalsIgnoreCase("edit")){
			//CV-B
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBTypeOfCommercialVehicles")) {
				selectValueFromList(typeOfCommercialVehiclesDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CVBTypeOfCommercialVehicles"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfTrailer")) {
				selectValueFromList(typeOfTrailerDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfTrailer"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBodyOthersDropdwon")) {
				selectValueFromList(typeOfBodyOthersDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBodyOthers"));
			}

			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNewVehicle")){
				selectValueFromList(newVehicleDropDown,moreCommeVehiDMotorEntity.getStringValueForField("NewVehicle"));
			}
			//*[@id="32"]/td[2]/div/input



			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIsVehicleAC")) {
				clearAndSendKeys(isVehicleACTextField, moreCommeVehiDMotorEntity.getStringValueForField("IsVehicleAC"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBBasicColorOfVehicle")) {
				selectValueFromList(basicColorOfVehicleDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CVBBasicColorOfVehicle"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBCurrentOwnership")) {
				selectValueFromList(currentOwnershipDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CVBCurrentOwnership"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBNewVehicle")) {
				selectValueFromList(newVehicleDropDownCvb,moreCommeVehiDMotorEntity.getStringValueForField("CVBNewVehicle"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBYearOfManufacture")) {
				selectValueFromList(yearOfManufactureDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CVBYearOfManufacture"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfFirstPurchaseOfNewVehicleByOriginalPurchaser")){
				String dateOfFirstPurchaseOfNewVehicleByOriginalPurchaser=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfFirstPurchaseOfNewVehicleByOriginalPurchaser"));
				clearAndEnterDate(dateOfFirstPurchaseOfNewVehicleByOriginalPurchaserTextField, dateOfFirstPurchaseOfNewVehicleByOriginalPurchaser);
			} 
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo1")) {
				clearAndSendKeys(registrationNo1TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1TextField"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo2")) {
				clearAndSendKeys(registrationNo2TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo2TextField"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo3TextField")) {
				clearAndSendKeys(registrationNo3TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo3TextField"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo4TextField")) {
				clearAndSendKeys(registrationNo4TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo4TextField"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationDate")){
				String RegistrationDate=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationDate"));
				clearAndEnterDate(registrationDateTextField, RegistrationDate);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBVehicleInRoadworthyConditionAndFreeFromDamage")) {
				selectValueFromList(vehicleInRoadworthyConditionAndFreeFromDamageDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CVBVehicleInRoadworthyConditionAndFreeFromDamage"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigLoadingAmountForNotRoadworthyCondition")) {
				clearAndSendKeys(loadingAmountForNotRoadworthyConditionTextField, moreCommeVehiDMotorEntity.getStringValueForField("LoadingAmountForNotRoadworthyCondition"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBVehicleInvoiceValue")) {
				//clearAndSendKeys(vehicleInvoiceValueTextField, moreCommeVehiDMotorEntity.getStringValueForField("CVBVehicleInvoiceValue"));
				SelectValueAndTypeForTextField(vehicleInvoiceValueTextField, moreCommeVehiDMotorEntity.getStringValueForField("CVBVehicleInvoiceValue"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBRegistrationValidityDate")){
				String registrationValidityDate=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("CVBRegistrationValidityDate"));
				clearAndEnterDate(registrationValidityDateTextField, registrationValidityDate);
			}
			//CV-C
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfPassengerCarrying")) {
				selectValueFromList(typeOfPassengerCarryingDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfPassengerCarrying"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBodyPassengerCarrying")) {
				selectValueFromList(typeOfBodyPassengerCarryingDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBodyPassengerCarrying"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVCColorAsPerRCBook")) {
				clearAndSendKeys(colorAsPerRCBookTextarea, moreCommeVehiDMotorEntity.getStringValueForField("CVCColorAsPerRCBook"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForCV")) {
				selectValueFromList(vehicleZoneForCVDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForCV"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForCVC1C4")) {
				selectValueFromList(vehicleZoneForCVC1C4DropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForCVC1C4"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPurposeOfUsingPassengerVehicleC1")) {
				selectValueFromList(purposeOfUsingPassengerVehicleC1DropDown,moreCommeVehiDMotorEntity.getStringValueForField("PurposeOfUsingPassengerVehicleC1"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPurposeOfUsingPassengerVehicleC2C3C4")) {
				selectValueFromList(purposeOfUsingPassengerVehicleC2C3C4DropDown,moreCommeVehiDMotorEntity.getStringValueForField("PurposeOfUsingPassengerVehicleC2C3C4"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigOtherPurposeOfUsingVehicle")) {
				clearAndSendKeys(otherPurposeOfUsingVehicleTextarea, moreCommeVehiDMotorEntity.getStringValueForField("OtherPurposeOfUsingVehicle"));
			}
			//CV-D
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfMiscSpecialType")) {
				selectValueFromList(typeOfMiscSpecialTypeDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfMiscSpecial"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInclusionOfOverturning")) {
				selectValueFromList(inclusionOfOverturningDropDown,moreCommeVehiDMotorEntity.getStringValueForField("InclusionOfOverturning"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBodyMiscSpecialType")) {
				selectValueFromList(typeOfBodyMiscSpecialTypeDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBodyMiscSpecialType"));
			}
			//CV-F
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfCommercialVehicles")) {
				selectValueFromList(typeOfCommercialVehiclesDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfCommercialVehicles"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfRoadRisk")) {
				selectValueFromList(typeOfRoadRiskDropDown, moreCommeVehiDMotorEntity.getStringValueForField("TypeOfRoadRisk"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInstallementPercentageList")) {
				fillParameterListForTrailersDetails(moreCommeVehiDMotorEntity);
			}
			//PC
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfPrivatCar")){
				selectValueFromList(typeOfPrivatCarDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfPrivatCar"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCurrentOwnership")){
				selectValueFromList(currentOwnershipDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CurrentOwnership"));
			}


			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigYearOfManufacture")){
				selectValueFromList(yearOfManufactureDropDown,moreCommeVehiDMotorEntity.getStringValueForField("YearOfManufacture"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfFirstPurchaseOfNewVehicle")){
				String datepurchase=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfFirstPurchaseOfNewVehicle"));
				clearAndEnterDate(dateOfFirstPurchaseOfNewVehicleTextField, datepurchase);
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPcRegistrationNo1")){
				clearAndSendKeys(registrationNo1TextField,moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1TextField"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPcRegistrationNo2")){
				clearAndSendKeys(registrationNo2TextField,moreCommeVehiDMotorEntity.getStringValueForField("PcRegistrationNo2"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfiPcgRegistrationNo3")){
				clearAndSendKeys(registrationNo3TextField,moreCommeVehiDMotorEntity.getStringValueForField("PcRegistrationNo3"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPcRegistrationNo4")){
				clearAndSendKeys(registrationNo4TextField,moreCommeVehiDMotorEntity.getStringValueForField("PcRegistrationNo4"));
			}

			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfRegistration")){
				String dateregistration=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfRegistration"));
				clearAndEnterDate(dateOfRegistrationTextField, dateregistration);
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfRegistrationPC")){
				String dateregistration=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfRegistrationPC"));
				clearAndEnterDate(dateOfRegistrationPCTextField, dateregistration);
			}

			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPCBasicColorOfVehicle")){
				selectValueFromList(basicColorOfVehicleDropDown,moreCommeVehiDMotorEntity.getStringValueForField("PCBasicColorOfVehicle"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigColorAsPerRCBook")){
				clearAndSendKeys(colorAsPerRCBookTextArea,moreCommeVehiDMotorEntity.getStringValueForField("ColorAsPerRCBook"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigEngineNo")){
				clearAndSendKeys(engineNoTextField,moreCommeVehiDMotorEntity.getStringValueForField("EngineNo"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPCChassisNo")){
				clearAndSendKeys(chassisNoTextField,moreCommeVehiDMotorEntity.getStringValueForField("PCChassisNo"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigMake")){
				selectValueFromList(makeDropDown,moreCommeVehiDMotorEntity.getStringValueForField("make"));
			}
			/*if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigModel")){
				selectValueFromList(modelDropDown,moreCommeVehiDMotorEntity.getStringValueForField("Model"));
			}*/
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigModel")) {
				//clearAndSendKeys(modelDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("Model"));
				//Thread.sleep(10000);
				click(makeModelFindButton);
				Thread.sleep(2000);
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				switchToWindow("Make & Model List");
				//Thread.sleep(2000);
				click(makeModelCodeLink);
				switchToWindow("Integrated Insurance Management System");
				//   switchToDefaultFrame();

				switchToFrame("display");


			}

			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBody")){
				selectValueFromList(typeOfBodyTextField,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBody"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVariant")){
				clearAndSendKeys(variantTextField,moreCommeVehiDMotorEntity.getStringValueForField("Variant"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForPrivateCar")){
				selectValueFromList(vehicleZoneForPrivateCarDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForPrivateCar"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfFuel")){
				selectValueFromList(typeOfFuelDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfFuel"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsUsedForDrivingTuition")){
				selectValueFromList(whetherVehicleIsUsedForDrivingTuitionDropDown,moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleIsUsedForDrivingTuition"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleUseIsLimiteToOwnPremises")){
				selectValueFromList(vehicleUseIsLimiteToOwnPremisesDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleUseIsLimiteToOwnPremises"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleBelongsToForeignEmbassy")){
				selectValueFromList(whetherVehicleBelongsToForeignEmbassyDropDown,moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleBelongsToForeignEmbassy"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClub")){
				selectValueFromList(whetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClubDropDown,moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClub"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleDesignedForBlindHandicappedMentallyChallenged")){
				selectValueFromList(vehicleDesignedForBlindHandicappedMentallyChallengedDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleDesignedForBlindHandicappedMentallyChallenged"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigFibreGlassTankFitted")){
				selectValueFromList(fibreGlassTankFittedDropDown,moreCommeVehiDMotorEntity.getStringValueForField("FibreGlassTankFitted"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigValueOfFibreGlassFuelTanks")){
				clearAndSendKeys(valueOfFibreGlassFuelTanksTextField,moreCommeVehiDMotorEntity.getStringValueForField("ValueOfFibreGlassFuelTanks"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigAreYouAMemberOfAutomobileAssociationOfIndia")){
				selectValueFromList(areYouAMemberOfAutomobileAssociationOfIndiaDropDown,moreCommeVehiDMotorEntity.getStringValueForField("AreYouAMemberOfAutomobileAssociationOfIndia"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNameOfAssociation")){
				clearAndSendKeys(nameOfAssociationTextField,moreCommeVehiDMotorEntity.getStringValueForField("NameOfAssociation"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigMembershipNo")){
				clearAndSendKeys(membershipNoTextField,moreCommeVehiDMotorEntity.getStringValueForField("MembershipNo"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIsLifeMember")){
				selectValueFromList(isLifeMemberDropDown,moreCommeVehiDMotorEntity.getStringValueForField("IsLifeMember"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfMembershipExpiry")){
				String datemembexpiry=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfMembershipExpiry"));
				clearAndEnterDate(dateOfMembershipExpiryTextField, datemembexpiry);
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCarInRoadworthyConditionAndFreeFromDamage")){
				selectValueFromList(carInRoadworthyConditionAndFreeFromDamageDropDown,moreCommeVehiDMotorEntity.getStringValueForField("CarInRoadworthyConditionAndFreeFromDamage"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDetailsOfVehicleCondition")){
				clearAndSendKeys(detailsOfVehicleConditionTextField,moreCommeVehiDMotorEntity.getStringValueForField("DetailsOfVehicleCondition"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIsTheVehicleFittedWithAntitheftDevice")){
				selectValueFromList(isTheVehicleFittedWithAntitheftDeviceDropDown,moreCommeVehiDMotorEntity.getStringValueForField("IsTheVehicleFittedWithAntitheftDevice"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigObsoleteVehicle")){
				selectValueFromList(obsoleteVehicleDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ObsoleteVehicle"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDiscretionTo")){
				selectValueFromList(discretionToRODropDown,moreCommeVehiDMotorEntity.getStringValueForField("DiscretionTo"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigApprovalNo")){
				clearAndSendKeys(approvalNoTextField,moreCommeVehiDMotorEntity.getStringValueForField("ApprovalNo"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigApprovalDate")){
				String approvaldate=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("ApprovalDate"));
				clearAndEnterDate(approvalDateTextField, approvaldate);
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalArearequired")){
				selectValueFromList(extensionofGeographicalArearequiredDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalArearequired"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBangladesh")){
				selectValueFromList(extensionofGeographicalAreatoBangladeshDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBangladesh"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBhutan")){
				selectValueFromList(extensionofGeographicalAreatoBhutanDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBhutan"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoNepal")){
				selectValueFromList(extensionofGeographicalAreatoNepalDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoNepal"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoPakistan")){
				selectValueFromList(extensionofGeographicalAreatoPakistanDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoPakistan"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoSriLanka")){
				selectValueFromList(extensionofGeographicalAreatoSriLankaDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoSriLanka"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoMaldives")){
				selectValueFromList(extensionofGeographicalAreatoMaldivesDropDown,moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoMaldives"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehiclebelongtoEmbassiesorimportedwithoutCustomDuty")){
				selectValueFromList(whetherVehiclebelongtoEmbassiesorimportedwithoutCustomDutyDropDown,moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehiclebelongtoEmbassiesorimportedwithoutCustomDuty"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleRequisitionedbyGovernment")){
				selectValueFromList(vehicleRequisitionedbyGovernmentDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleRequisitionedbyGovernment"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationValidityDate")){
				String registrationdate=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationValidityDate"));
				clearAndEnterDate(registrationValidityDateTextField, registrationdate);
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNoofdaysforRally")){
				clearAndSendKeys(noofdaysforRallyTextField,moreCommeVehiDMotorEntity.getStringValueForField("NoofdaysforRally"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherRallyextensionrequiredforMotorRacingSpeedTest")){
				selectValueFromList(whetherRallyextensionrequiredforMotorRacingSpeedTestDropDown,moreCommeVehiDMotorEntity.getStringValueForField("WhetherRallyextensionrequiredforMotorRacingSpeedTest"));
			}
			//********TW(CHINTAN) INSURED INTREST***************
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfTwoWheelerDropDown")){
				selectValueFromList(typeOfTwoWheelerDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfTwoWheeler"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwoWheelersTypeOfBody")){
				selectValueFromList(twoWheelersTypeOfBodyDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TwoWheelersTypeOfBody"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForTwoWheeler")){
				selectValueFromList(vehicleZoneForTwoWheelerDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForTwoWheeler"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigOtherMakeDetail")){
				selectValueFromList(otherMakeDetailTextField,moreCommeVehiDMotorEntity.getStringValueForField("OtherMakeDetail"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleInRoadworthyConditionAndFreeFromDamage")){
				selectValueFromList(vehicleInRoadworthyConditionAndFreeFromDamageDropDown,moreCommeVehiDMotorEntity.getStringValueForField("VehicleInRoadworthyConditionAndFreeFromDamage"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTWVehicleInvoiceValue")){
				clearAndSendKeys(twvehicleInvoiceValueTextField,moreCommeVehiDMotorEntity.getStringValueForField("TWVehicleInvoiceValue"));
			}                    
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigBiFuelSystemValue")){
				clearAndSendKeys(biFuelSystemValueTextField,moreCommeVehiDMotorEntity.getStringValueForField("BiFuelSystemValue"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInBuiltBiFuelSystemFitted")){
				clearAndSendKeys(inBuiltBiFuelSystemFittedDropDown,moreCommeVehiDMotorEntity.getStringValueForField("InBuiltBiFuelSystemFitted"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTWColorAsPerRCBook")){
				clearAndSendKeys(twColorAsPerRCBookTextField,moreCommeVehiDMotorEntity.getStringValueForField("TWColorAsPerRCBook"));
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwYearOfManufacture")){
				selectValueFromList(twYearOfManufactureDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TwYearOfManufacture"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwDateofFirstPurchaseOfNewVehicle")){
				String TwDateofFirstPurchaseOfNewVehicle=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("TwDateofFirstPurchaseOfNewVehicle"));
				clearAndEnterDate(twDateofFirstPurchaseOfNewVehicle, TwDateofFirstPurchaseOfNewVehicle);
			} 
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwEngineNo")){
				clearAndSendKeys(twEngineNoTextField,moreCommeVehiDMotorEntity.getStringValueForField("TwEngineNo"));
			}

			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwChassisNo")){
				clearAndSendKeys(twChassisNoTextField,moreCommeVehiDMotorEntity.getStringValueForField("TwChassisNo"));	
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwMake")){
				selectValueFromList(twMakeDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TwMake"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTWModel")) {
				//clearAndSendKeys(modelDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("Model"));
				//Thread.sleep(10000);
				click(twMakeModelFindButton);
				Thread.sleep(2000);
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				switchToWindow("Make & Model List");
				//Thread.sleep(2000);
				click(twMakeModelCodeLink);
				switchToWindow("Integrated Insurance Management System");
				//switchToDefaultFrame();
				switchToFrame("display");
			}

			//********CV-A(CHINTAN) INSURED INTREST***************

			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfGoodsCarrying")) {
				selectValueFromList(typeOfGoodsCarryingDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeOfGoodsCarrying"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigGoodsCarryingVehicleDescription")) {
				clearAndSendKeys(goodsCarryingVehicleDescriptionTextField,moreCommeVehiDMotorEntity.getStringValueForField("GoodsCarryingVehicleDescription"));
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeofBodyGoodsCarrying")) {
				selectValueFromList(typeofBodyGoodsCarryingDropDown,moreCommeVehiDMotorEntity.getStringValueForField("TypeofBodyGoodsCarrying"));
			}

			// CV- B Trailer Details
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTrailerDetails")) {
				fillParameterListForCVBTrailersDetails(moreCommeVehiDMotorEntity);
			}
		}
		else if(moreCommeVehiDMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBTypeOfCommercialVehicles")) { // shwetha(18/06/2018)
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("CVBTypeOfCommercialVehicles"), fetchValueFromFields(typeOfCommercialVehiclesDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//CV-B
			/*if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfCommercialVehicles")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfCommercialVehicles"), fetchValueFromList(typeOfCommercialVehiclesDropDown), AssertionType.WARNING);
			}*/
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfTrailer")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfTrailer"), fetchValueFromList(typeOfTrailerDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBodyOthers")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBodyOthers"), fetchValueFromList(typeOfBodyOthersDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIsVehicleAC")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("IsVehicleAC"), fetchValueFromTextFields(isVehicleACTextField), AssertionType.WARNING);
			}
			/*if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBBasicColorOfVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("BasicCVBColorOfVehicle"), fetchValueFromList(basicColorOfVehicleDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCurrentOwnership")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("CurrentOwnership"), fetchValueFromList(currentOwnershipDropDown), AssertionType.WARNING);
			}/*
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNewVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("NewVehicle"), fetchValueFromList(newVehicleDropDown), AssertionType.WARNING);
			}
			/*
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigYearOfManufacture")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("YearOfManufacture"), fetchValueFromList(yearOfManufactureDropDown), AssertionType.WARNING);
			}*/
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfFirstPurchaseOfNewVehicleByOriginalPurchaser")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfFirstPurchaseOfNewVehicleByOriginalPurchaser")) ,fetchValueFromTextFields(dateOfFirstPurchaseOfNewVehicleByOriginalPurchaserTextField),AssertionType.WARNING);
			}
			/*if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo1TextField")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1TextField"), fetchValueFromTextFields(registrationNo1TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo2TextField")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo2TextField"), fetchValueFromTextFields(registrationNo2TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo3TextField")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo3TextField"), fetchValueFromTextFields(registrationNo3TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo4TextField")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo4TextField"), fetchValueFromTextFields(registrationNo4TextField), AssertionType.WARNING);
			}*/
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationDate")) ,fetchValueFromTextFields(registrationDateTextField),AssertionType.WARNING);
			}
			/*if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBVehicleInRoadworthyConditionAndFreeFromDamage")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleInRoadworthyConditionAndFreeFromDamage"), fetchValueFromList(CVBVehicleInRoadworthyConditionAndFreeFromDamageDropDown), AssertionType.WARNING);
			}*/
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigLoadingAmountForNotRoadworthyCondition")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("LoadingAmountForNotRoadworthyCondition"), fetchValueFromTextFields(loadingAmountForNotRoadworthyConditionTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBVehicleInvoiceValue")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("CVBVehicleInvoiceValue"), fetchValueFromTextFields(vehicleInvoiceValueTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleAgeInMonths")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleAgeInMonths"), fetchValueFromTextFields(vehicleAgeInMonthsTextField), AssertionType.WARNING);
			}
			/*if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVBRegistrationValidityDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("CVBRegistrationValidityDate")) ,fetchValueFromTextFields(registrationValidityDateTextField),AssertionType.WARNING);
			}*/
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIDVAfterDepreciation")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("IDVAfterDepreciation"), fetchValueFromTextFields(iDVAfterDepreciationTextField), AssertionType.WARNING);
			}
			//CV-C			
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfPassengerCarrying")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfPassengerCarrying"), fetchValueFromList(typeOfPassengerCarryingDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBodyPassengerCarrying")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBodyPassengerCarrying"), fetchValueFromList(typeOfBodyPassengerCarryingDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCVCColorAsPerRCBook")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("CVCColorAsPerRCBook"), fetchValueFromTextFields(colorAsPerRCBookTextarea), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForCV")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForCV"), fetchValueFromList(vehicleZoneForCVDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForCVC1C4")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForCVC1C4"), fetchValueFromList(vehicleZoneForCVC1C4DropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPurposeOfUsingPassengerVehicleC1")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("PurposeOfUsingPassengerVehicleC1"), fetchValueFromList(purposeOfUsingPassengerVehicleC1DropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPurposeOfUsingPassengerVehicleC2C3C4")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("PurposeOfUsingPassengerVehicleC2C3C4"), fetchValueFromList(purposeOfUsingPassengerVehicleC2C3C4DropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigOtherPurposeOfUsingVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("OtherPurposeOfUsingVehicle"), fetchValueFromTextFields(otherPurposeOfUsingVehicleTextarea), AssertionType.WARNING);
			}
			//CV-D
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfMiscSpecialType")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfMiscSpecialType"), fetchValueFromList(typeOfMiscSpecialTypeDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInclusionOfOverturning")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("InclusionOfOverturning"), fetchValueFromList(inclusionOfOverturningDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBodyMiscSpecialType")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBodyMiscSpecialType"), fetchValueFromList(typeOfBodyMiscSpecialTypeDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfRoadRisk")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfRoadRisk"), fetchValueFromList(typeOfRoadRiskDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInstallementPercentageList")) {
				verifyParameterListForTrailersDetails(moreCommeVehiDMotorEntity, assertReference);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfPrivatCar")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfPrivatCar"), fetchValueFromList(typeOfPrivatCarDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCurrentOwnership")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("CurrentOwnership"), fetchValueFromList(currentOwnershipDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNewVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("NewVehicle"), fetchValueFromList(newVehicleDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigYearOfManufacture")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("YearOfManufacture"), fetchValueFromList(yearOfManufactureDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfFirstPurchaseOfNewVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("DateOfFirstPurchaseOfNewVehicle"), fetchValueFromTextFields(dateOfFirstPurchaseOfNewVehicleTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo1")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1TextField"), fetchValueFromTextFields(registrationNo1TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo2")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo2TextField"), fetchValueFromTextFields(registrationNo2TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo3")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo3TextField"), fetchValueFromTextFields(registrationNo3TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo4TextField")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo4TextField"), fetchValueFromTextFields(registrationNo4TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfRegistration")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("DateOfRegistration"), fetchValueFromTextFields(dateOfRegistrationTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPCBasicColorOfVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("PCBasicColorOfVehicle"), fetchValueFromList(basicColorOfVehicleDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigColorAsPerRCBook")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ColorAsPerRCBook"), fetchValueFromTextFields(colorAsPerRCBookTextArea), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigEngineNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("EngineNo"), fetchValueFromTextFields(engineNoTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigPCChassisNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("PCChassisNo"), fetchValueFromTextFields(chassisNoTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigMake")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("make"), fetchValueFromList(makeDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigModel")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("Model"), fetchValueFromList(modelDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfBody")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfBody"), fetchValueFromTextFields(typeOfBodyTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVariant")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("Variant"), fetchValueFromTextFields(variantTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForPrivateCar")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForPrivateCar"), fetchValueFromList(vehicleZoneForPrivateCarDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfFuel")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfFuel"), fetchValueFromList(typeOfFuelDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsUsedForDrivingTuition")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleIsUsedForDrivingTuition"), fetchValueFromList(whetherVehicleIsUsedForDrivingTuitionDropDown), AssertionType.WARNING);
			}					
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleUseIsLimiteToOwnPremises")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleUseIsLimiteToOwnPremises"), fetchValueFromList(vehicleUseIsLimiteToOwnPremisesDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleBelongsToForeignEmbassy")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleBelongsToForeignEmbassy"), fetchValueFromList(whetherVehicleBelongsToForeignEmbassyDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClub")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClub"), fetchValueFromList(whetherVehicleIsCertifiedAsVintageCarByVintageAndClassicCarClubDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleDesignedForBlindHandicappedMentallyChallenged")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleDesignedForBlindHandicappedMentallyChallenged"), fetchValueFromList(vehicleDesignedForBlindHandicappedMentallyChallengedDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigFibreGlassTankFitted")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("FibreGlassTankFitted"), fetchValueFromList(fibreGlassTankFittedDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigValueOfFibreGlassFuelTanks")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ValueOfFibreGlassFuelTanks"), fetchValueFromList(valueOfFibreGlassFuelTanksTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigAreYouAMemberOfAutomobileAssociationOfIndia")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("AreYouAMemberOfAutomobileAssociationOfIndia"), fetchValueFromList(areYouAMemberOfAutomobileAssociationOfIndiaDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNameOfAssociation")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("NameOfAssociation"), fetchValueFromList(nameOfAssociationTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigMembershipNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("MembershipNo"), fetchValueFromList(membershipNoTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIsLifeMember")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("IsLifeMember"), fetchValueFromList(isLifeMemberDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfMembershipExpiry")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("DateOfMembershipExpiry"),fetchValueFromTextFields(dateOfMembershipExpiryTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCarInRoadworthyConditionAndFreeFromDamage")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("CarInRoadworthyConditionAndFreeFromDamage"), fetchValueFromList(carInRoadworthyConditionAndFreeFromDamageDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDetailsOfVehicleCondition")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("DetailsOfVehicleCondition"), fetchValueFromTextFields(detailsOfVehicleConditionTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIsTheVehicleFittedWithAntitheftDevice")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("IsTheVehicleFittedWithAntitheftDevice"), fetchValueFromList(isTheVehicleFittedWithAntitheftDeviceDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigObsoleteVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ObsoleteVehicle"), fetchValueFromList(obsoleteVehicleDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDiscretionTo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("DiscretionTo"), fetchValueFromList(discretionToRODropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigApprovalNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ApprovalNo"), fetchValueFromTextFields(approvalNoTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigApprovalDate")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ApprovalDate"), fetchValueFromTextFields(approvalDateTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalArearequired")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalArearequired"), fetchValueFromList(extensionofGeographicalArearequiredDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBangladesh")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBangladesh"), fetchValueFromList(extensionofGeographicalAreatoBangladeshDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBhutan")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBhutan"), fetchValueFromList(extensionofGeographicalAreatoBhutanDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoNepal")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoNepal"), fetchValueFromList(extensionofGeographicalAreatoNepalDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoPakistan")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoPakistan"), fetchValueFromList(extensionofGeographicalAreatoPakistanDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoSriLanka")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoSriLanka"), fetchValueFromList(extensionofGeographicalAreatoSriLankaDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoMaldives")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoMaldives"), fetchValueFromList(extensionofGeographicalAreatoMaldivesDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehiclebelongtoEmbassiesorimportedwithoutCustomDuty")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehiclebelongtoEmbassiesorimportedwithoutCustomDuty"), fetchValueFromList(whetherVehiclebelongtoEmbassiesorimportedwithoutCustomDutyDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleRequisitionedbyGovernment")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleRequisitionedbyGovernment"), fetchValueFromList(vehicleRequisitionedbyGovernmentDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationValidityDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationValidityDate")) ,fetchValueFromTextFields(registrationValidityDateTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigNoofdaysforRally")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("NoofdaysforRally"), fetchValueFromTextFields(noofdaysforRallyTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherRallyextensionrequiredforMotorRacingSpeedTest")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherRallyextensionrequiredforMotorRacingSpeedTest"), fetchValueFromList(whetherRallyextensionrequiredforMotorRacingSpeedTestDropDown), AssertionType.WARNING);
			}
			//********TW(CHINTAN) INSURED INTREST***************
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfTwoWheeler")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfTwoWheeler"), fetchValueFromList(typeOfTwoWheelerDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwoWheelersTypeOfBody")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TwoWheelersTypeOfBody"), fetchValueFromList(twoWheelersTypeOfBodyDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleZoneForTwoWheeler")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleZoneForTwoWheeler"), fetchValueFromList(vehicleZoneForTwoWheelerDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigOtherMakeDetail")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleInRoadworthyConditionAndFreeFromDamage"), fetchValueFromTextFields(otherMakeDetailTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleInRoadworthyConditionAndFreeFromDamage")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleInvoiceValue"), fetchValueFromList(vehicleInRoadworthyConditionAndFreeFromDamageDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTWVehicleInvoiceValue")) {											   
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TWVehicleInvoiceValue"), fetchValueFromTextFields(vehicleInvoiceValueTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigBiFuelSystemValue")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("BiFuelSystemValue"), fetchValueFromTextFields(biFuelSystemValueTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigInBuiltBiFuelSystemFitted")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("InBuiltBiFuelSystemFitted"), fetchValueFromTextFields(inBuiltBiFuelSystemFittedDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTWColorAsPerRCBook")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TWColorAsPerRCBook"), fetchValueFromTextFields(twColorAsPerRCBookTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwYearOfManufacture")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TwYearOfManufacture"), fetchValueFromTextFields(twYearOfManufactureDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwDateofFirstPurchaseOfNewVehicle")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TwDateofFirstPurchaseOfNewVehicle"), fetchValueFromTextFields(twDateofFirstPurchaseOfNewVehicle), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwEngineNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TwEngineNo"), fetchValueFromTextFields(twEngineNoTextField), AssertionType.WARNING);
			}

			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwChassisNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TwChassisNo"), fetchValueFromTextFields(twChassisNoTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTwMake")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TwMake"), fetchValueFromTextFields(twMakeDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTWVehicleInvoiceValue")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TWVehicleInvoiceValue"), fetchValueFromTextFields(twvehicleInvoiceValueTextField), AssertionType.WARNING);
			}
			//********CV-A(CHINTAN) INSURED INTREST***************
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfCommercialVehicles")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfCommercialVehicles"), fetchValueFromTextFields(typeOfCommercialVehiclesDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTypeOfGoodsCarrying")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("TypeOfGoodsCarrying"), fetchValueFromTextFields(typeOfGoodsCarryingDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigGoodsCarryingVehicleDescription")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("GoodsCarryingVehicleDescription"), fetchValueFromTextFields(goodsCarryingVehicleDescriptionTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsImported")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleIsImported"), fetchValueFromTextFields(whetherVehicleIsImportedDropDown), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigWhetherVehicleIsImported")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("WhetherVehicleIsImported"), fetchValueFromTextFields(whetherVehicleIsImportedDropDown), AssertionType.WARNING);
			}
		}

	}
	public void navigateToPolicy(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			//if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}
	public void clickOnBackButton(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity){
		if (moreCommeVehiDetMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}

	public void clickOnOpenButton(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntity) throws InterruptedException{
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigTrailersDetailsButton")){
			click(trailersDetailsButton);
			switchToWindow("'Trailers Details' Details");
		}
	}
	public void fillParameterListForTrailersDetails(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntity) throws InterruptedException{
		clickOnOpenButton(moreCommeVehiDMotorEntity);
		Thread.sleep(3000);
		click(addWindowButton);
		// for inserting new code
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo1NewWindow")) {
			clearAndSendKeys(registrationNo1TextFieldCvb, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo2NewWindow")) {
			clearAndSendKeys(registrationNo2TextFieldCvb, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo2NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo3NewWindow")) {
			clearAndSendKeys(registrationNo3TextFieldCvb, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo3NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo4NewWindow")) {
			clearAndSendKeys(registrationNo4TextFieldCvb, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo4NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigChassisNo")) {
			clearAndSendKeys(chassisNoTextFieldCvb, moreCommeVehiDMotorEntity.getStringValueForField("ChassisNoTextField"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfSale")) {
			String dateofIntimation=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfSaleTextField"));
			clearAndEnterDate(dateofsellCvb, dateofIntimation);
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleInvoiceValue")) {
			clearAndSendKeys(VehicleInvoiceValueCvb, moreCommeVehiDMotorEntity.getStringValueForField("VehicleInvoiceValue"));
			Thread.sleep(5000);
			/*  Actions actions=new Actions(driver);
	    actions.moveToElement(getWebElement(iDVOfTheTrailerTextField)).build().perform();

	    actions.sendKeys(Key)
	    actions.click(getWebElement(iDVOfTheTrailerTextField));
			 */
			clickTabButton(VehicleInvoiceValueCvb);	
			Thread.sleep(2000);

		}


		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIDVOfTheTrailer")) {
			selectValueFromList(iDVOfTheTrailerTextField, moreCommeVehiDMotorEntity.getStringValueForField("IDVOfTheTrailer"));
		}

		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			//switchToFrame("display");
		}
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCloseWindow")){
			click(closeWindowButton);

			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	private void ClickAndHoldAction(PageElement vehicleInvoiceLabel2) {
		// TODO Auto-generated method stub

	}
	// CV-B Trailer Details
	public void fillParameterListForCVBTrailersDetails(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntity) throws InterruptedException{
		clickOnOpenButton(moreCommeVehiDMotorEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo1NewWindow")) {
			clearAndSendKeys(registrationNo1TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo2NewWindow")) {
			clearAndSendKeys(registrationNo2TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo2NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo3NewWindow")) {
			clearAndSendKeys(registrationNo3TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo3NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo4NewWindow")) {
			clearAndSendKeys(registrationNo4TextField, moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo4NewWindow"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigChassisNo")) {
			clearAndSendKeys(chassisNoTextField, moreCommeVehiDMotorEntity.getStringValueForField("ChassisNoTextField"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfSale")) {
			String dateofIntimation=RandomCodeGenerator.dateGenerator(moreCommeVehiDMotorEntity.getStringValueForField("DateOfSaleTextField"));
			clearAndEnterDate(dateOfSaleTextField, dateofIntimation);
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleInvoiceValue")) {
			clearAndEnterDate(vehicleInvoiceValueTextField, moreCommeVehiDMotorEntity.getStringValueForField("VehicleInvoiceValue"));
		}
		if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIDVOfTheTrailer")) {
			clearAndEnterDate(iDVOfTheTrailerTextField, moreCommeVehiDMotorEntity.getStringValueForField("IDVOfTheTrailer"));
		}

		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCloseWindow")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	public void verifyParameterListForTrailersDetails(MoreCommeVehiDMotorEntity moreCommeVehiDMotorEntity ,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(moreCommeVehiDMotorEntity);

		if(moreCommeVehiDMotorEntity.getAction().equalsIgnoreCase("verify")){

			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo1NewWindow")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo1NewWindow"), fetchValueFromTextFields(registrationNo1TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo2NewWindow")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo2NewWindow"), fetchValueFromTextFields(registrationNo2TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo3NewWindow")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo3NewWindow"), fetchValueFromTextFields(registrationNo3TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigRegistrationNo4NewWindow")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("RegistrationNo4NewWindow"), fetchValueFromTextFields(registrationNo4TextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigChassisNo")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("ChassisNo"), fetchValueFromTextFields(chassisNoTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigDateOfSale")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("DateOfSale"), fetchValueFromTextFields(dateOfSaleTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigVehicleInvoiceValue")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("VehicleInvoiceValue"), fetchValueFromTextFields(vehicleInvoiceValueTextField), AssertionType.WARNING);
			}
			if (moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigIDVOfTheTrailer")) {
				assertReference.assertEquals(moreCommeVehiDMotorEntity.getStringValueForField("IDVOfTheTrailer"), fetchValueFromTextFields(iDVOfTheTrailerTextField), AssertionType.WARNING);
			}

			if(moreCommeVehiDMotorEntity.getBooleanValueForField("ConfigCloseWindowButton")){
				click(closeWindowButton);
				
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}

	public void fillandSubmitPolicyInsuredIntrestMoreCommercialVehicleDetailMotor(MoreCommeVehiDMotorEntity moreCommeVehiDetMotorEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(moreCommeVehiDetMotorEntity .getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestMoreCommercialVehicleDetailMotor(moreCommeVehiDetMotorEntity ,assertReference);	
			clickOnForwardButton(moreCommeVehiDetMotorEntity );
			navigateToPolicy(moreCommeVehiDetMotorEntity );
			navigateToAttribute(moreCommeVehiDetMotorEntity );
			navigateToInsuredInterest(moreCommeVehiDetMotorEntity );
			navigateToCoverage(moreCommeVehiDetMotorEntity );
			navigateToLoan(moreCommeVehiDetMotorEntity );
			navigateToClientDetails(moreCommeVehiDetMotorEntity );
			navigateToRelation(moreCommeVehiDetMotorEntity );
			navigateToPayment(moreCommeVehiDetMotorEntity );
			navigateToFollowup(moreCommeVehiDetMotorEntity );
			navigateToDocument(moreCommeVehiDetMotorEntity );
			navigateToInsuredInterestDetails(moreCommeVehiDetMotorEntity );
			navigateToInsuredInterestAttributes(moreCommeVehiDetMotorEntity );
			navigateToInsuredInterestAttachCoverages(moreCommeVehiDetMotorEntity );
			navigateToInsuredInterestRelations(moreCommeVehiDetMotorEntity );
			navigateToInsuredInterestPayments(moreCommeVehiDetMotorEntity );
		}
	}
}
