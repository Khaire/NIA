package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntVehVaDetMotorEntity;

public class PolicyInsuredIntrestVehicleValueDetailsMotor extends BasePage {

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
	//Motor Page 3
	//Mayur_Product name= CV-G
	private PageElement doYouHaveAreaOfOpenCarParksDropDown;
	//Mayur_Product name= CV-E
	private PageElement gatePassNoTextField;
	private PageElement invoiceNoTextField;
	private PageElement transitFromTextArea;
	private PageElement transitToTextArea;
	private PageElement distanceCoveredTextField;

	//CV-D
	private PageElement nameAndAddressOfRegistrationAuthorityTextarea;
	private PageElement extraElectricalElectronicFittingsDropDown;
	private PageElement valueOfMusicSystemTextField;
	private PageElement valueOfACFanTextField;
	private PageElement valueOfLightsTextField;
	private PageElement valueOfOtherFittingsTextField;
	private PageElement totalValueOfExtraElectricalElectronicFittingsTextField;
	private PageElement nonElectricalElectronicFittingsTextarea;
	private PageElement valueOfNonElectricalElectronicFittingsTextField;
	private PageElement fibreGlassFuelTanksDropDown;
	private PageElement isSideCarAttachedWithATwoWheelerDropDown;
	/*private PageElement additionalTowingCoverageRequiredDropDown;
	private PageElement tionalTowingCoverageAmountTextField;*/
	private PageElement isIMT23ToBeDeletedDropDown;
	private PageElement numberOfTrailersTextField;
	private PageElement totalIDVOfTheTrailerAttachedTextField;
	//CV-C
	//***********PC(CHINTAN) iNSURED INTREST 3RD PAGE**************
	private PageElement nameAndAddressOfRegistrationAuthorityTextField;
	private PageElement	seatingCapacityIncludingdriverTextField;
	private PageElement cubicCapacityTextField;
	private PageElement vehicleInvoiceValueTextField;
	private PageElement	vehicleAgeinMonthsTextField;
	private PageElement	doYouHoldValidDrivingLicenseDropDown;
	private PageElement	licenseTypeofOwnerDriverDropDown;

	private PageElement	ageofOwnerDriverTextField;
	private PageElement	ownerDriverDrivingLicenseNoTextField;
	private PageElement	ownerDriverLicenseIssueDateTextField;
	private PageElement	ownerDriverLicenseExpiryDateTextField;
	private PageElement	licenseIssuingAuthorityforOwnerDriverTextField;
	private PageElement	nameOfNomineeTextField;
	private PageElement	ageOfNomineeTextField;

	private PageElement	relationshipWithTheInsuredTextField;
	private PageElement	genderOfTheNomineeDropDown;
	private PageElement	doyouHaveAnyotherDriverDropDown;
	private PageElement	insuredsdeclaredValueTextField;
	private PageElement	iDVofAccessoriesTextField;
	private PageElement	rOADTAXAMOUNTTextField;
	private PageElement	totalIDVTextField;

	private PageElement	nCBApplicablePercentageDropDown;
	private PageElement	nameOfPreviousInsurerTextField;
	private PageElement	previousPolicyNumberTextField;
	private PageElement	addressOfThePreviousInsurerTextField;
	private PageElement	expirydateOfPreviousPolicyTextField;
	private PageElement	nameOftheAppointeeTextField;
	private PageElement	relationshipToTheNomineeTextField;

	//***********TW(CHINTAN) INSURED INTREST 3RD PAGE**************
	private PageElement	doyouwantLossofAccessoriesCoverDropDown;
	private PageElement	additionalTowingCoverageRequiredDropDown;	
	private PageElement	additionalTowingCoverageAmountTextField;
	private PageElement	driverNameTextField;
	private PageElement	issueDateTextField;  
	private PageElement	expiryDateTextField;	  
	private PageElement	dateOfBirthTextField;  
	private PageElement	ageOfDriverTextField; 
	private PageElement	sexDropDown;
	private PageElement	experienceTextField;	 
	private PageElement	addressTextField;	
	private PageElement	anyOfTheDrivereverConvicteDorAnyProsecutionpendingDropDown;	
	private PageElement	detailsOfConvictionTextField;	 
	private PageElement	inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossDropDown;
	private PageElement twNameOfPreviousInsurerDropDown;
	private PageElement twPreviousPolicyNumberTextField;
	private PageElement twAddressOfThePreviousInsurerTextField;	
	private PageElement twInsuredDeclaredValueTextField;

	//CV-C
	private PageElement indemnityToHirersDropDown;

	private PageElement engineNoTextField;
	private PageElement chassisNoTextField;
	private PageElement makeDropDown;
	private PageElement modelDropDown;
	private PageElement makeModelFindButton;
	private PageElement makeModelCodeLink;
	private PageElement valueOfFibreGlassFuelTankTextField;

	private PageElement addressOfThePreviousInsurerTextArea;
	public PolicyInsuredIntrestVehicleValueDetailsMotor(WebDriver driver, String pageName) {
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
		//	forwardButton=new PageElement(By.xpath("//input[@value='-->']"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);



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
		doYouHaveAreaOfOpenCarParksDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you have Area of open car parks')]/following::select"), "Do you have Area of open car parks DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Mayur_Product name= CV-E
		gatePassNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Gate Pass No')]/following::input"), "Gate Pass No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invoiceNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Invoice No.')]/following::input"), "Invoice No. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitFromTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Transit From')]/following::textarea"), "Transit From TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitToTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Transit To')]/following::textarea"), "Transit To TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceCoveredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Distance Covered')]/following::input"), "Distance Covered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CV-D
		nameAndAddressOfRegistrationAuthorityTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Name and Address of Registration Authority')]/following::textarea"),"Name and Address of Registration Authority TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extraElectricalElectronicFittingsDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Extra Electrical/ Electronic fittings')]/following::select"),"Extra Electrical/ Electronic fittings DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valueOfMusicSystemTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of Music System')]/following::input"),"Value of Music System TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfACFanTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of AC/Fan')]/following::input"),"Value of AC/Fan TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfLightsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of Lights')]/following::input"),"Value of Lights TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfOtherFittingsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of Other Fittings')]/following::input"),"Value of Other Fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalValueOfExtraElectricalElectronicFittingsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Value of Extra Electrical/ Electronic fittings')]/following::input"),"Total Value of Extra Electrical/ Electronic fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nonElectricalElectronicFittingsTextarea=new PageElement(By.xpath("//td/div[contains(text(),'Non-Electrical/ Electronic fittings')]/following::textarea"),"Non-Electrical/ Electronic fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueOfNonElectricalElectronicFittingsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Value of Non- Electrical/ Electronic fittings')]/following::input"),"Value of Non- Electrical/ Electronic fittings TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fibreGlassFuelTanksDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Fibre glass fuel tanks')]/following::select"),"Fibre glass fuel tanks DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSideCarAttachedWithATwoWheelerDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is side car attached with a two wheeler')]/following::select"),"Is side car attached with a two wheeler DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		/*additionalTowingCoverageRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Additional Towing Coverage Required')]/following::select"),"Additional Towing Coverage Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalTowingCoverageAmountTextField=new PageElement(By.xpath("//td/div[contains(text(),'Additional Towing Coverage Amount')]/following::input"),"Additional Towing Coverage Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);*/
		isIMT23ToBeDeletedDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is IMT 23 to be deleted')]/following::select"),"Is IMT 23 to be deleted DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		numberOfTrailersTextField=new PageElement(By.xpath("//td/div[contains(text(),'Number of Trailers')]/following::input"),"Number of Trailers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalIDVOfTheTrailerAttachedTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total IDV of the Trailer Attached')]/following::input"),"Total IDV of the Trailer Attached TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CV-C
		indemnityToHirersDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Indemnity to Hirers')]/following::select"),"Indemnity to Hirers DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//***********PC(CHINTAN) iNSURED INTREST 3RD PAGE**************
		nameAndAddressOfRegistrationAuthorityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name and Address of Registration Authority')]/following::textarea"),"Name and Address of Registration Authority", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		seatingCapacityIncludingdriverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Seating Capacity(including driver)')]/following::input"),"Seating Capacity(including driver)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cubicCapacityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cubic Capacity')]/following::input"),"Cubic Capacity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleInvoiceValueTextField=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle Invoice Value')]/following::input"),"Vehicle Invoice Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleAgeinMonthsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Vehicle Age in Months')]/following::input"),"Vehicle Age in Months", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouHoldValidDrivingLicenseDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Do You Hold Valid Driving License')]/following::select"),"Do You Hold Valid Driving License", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		licenseTypeofOwnerDriverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'License Type of Owner Driver')]/following::select"),"License Type of Owner Driver", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ageofOwnerDriverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Age of Owner Driver')]/following::input"),"Age of Owner Driver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerDriverDrivingLicenseNoTextField=new PageElement(By.xpath("//td/div[contains(text(),'Owner Driver Driving License No')]/following::input"),"Owner Driver Driving License No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerDriverLicenseIssueDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Owner Driver License Issue Date')]/following::input"),"Owner Driver License Issue Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownerDriverLicenseExpiryDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Owner Driver License Expiry Date')]/following::input"),"Owner Driver License Expiry Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		licenseIssuingAuthorityforOwnerDriverTextField=new PageElement(By.xpath("//td/div[contains(text(),'License Issuing Authority for Owner Driver')]/following::input"),"License Issuing Authority for Owner Driver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfNomineeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of Nominee')]/following::textarea"),"Name of Nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfNomineeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Age of Nominee')]/following::input"),"Age of Nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipWithTheInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Relationship with the Insured')]/following::input"),"Relationship with the Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		genderOfTheNomineeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Gender of the Nominee')]/following::select"),"Gender of the Nominee", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		doyouHaveAnyotherDriverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Do you Have Any other Driver')]/following::select"),"Do you Have Any other Driver", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		insuredsdeclaredValueTextField=new PageElement(By.xpath("//td/div[contains(text(),'Insureds declared Value (IDV)')]/following::input"),"Insureds declared Value (IDV)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iDVofAccessoriesTextField=new PageElement(By.xpath("//td/div[contains(text(),'IDV of Accessories')]/following::input"),"IDV of Accessories", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rOADTAXAMOUNTTextField=new PageElement(By.xpath("//td/div[contains(text(),'ROAD TAX AMOUNT')]/following::input"),"ROAD TAX AMOUNT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalIDVTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total IDV')]/following::input"),"Total IDV", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nCBApplicablePercentageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'NCB Applicable Percentage')]/following::select[1]"),"NCB Applicable Percentage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//	nameOfPreviousInsurerTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of Previous Insurer')]/following::input"),"Name of Previous Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumberTextField=new PageElement(By.xpath("//td/div[contains(text(),'Previous Policy Number')]/following::input"),"Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfThePreviousInsurerTextField=new PageElement(By.xpath("//td/div[contains(text(),'Address of the Previous Insure')]/following::textarea"),"Address of the Previous Insure", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expirydateOfPreviousPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Expiry date of previous Policy')]/following::input"),"Expiry date of previous Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOftheAppointeeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of the Appointee (if Nominee is a minor)')]/following::input"),"Name of the Appointee (if Nominee is a minor)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipToTheNomineeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Relationship to the Nominee')]/following::input"),"Relationship to the Nominee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//***********TW(CHINTAN) iNSURED INTREST 3RD PAGE**************
		doyouwantLossofAccessoriesCoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Do you want Loss of Accessories Cover')]/following::select"),"Do you want Loss of Accessories Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalTowingCoverageRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Additional Towing Coverage Required')]/following::select"),"Additional Towing Coverage Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalTowingCoverageAmountTextField=new PageElement(By.xpath("//td/div[contains(text(),'Additional Towing Coverage Amount')]/following::input"),"Additional Towing Coverage Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		driverNameTextField=new PageElement(By.xpath("//td/div[contains(text(),'Driver Name')]/following::input"),"Driver Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		issueDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Issue Date')]/following::input"),"Issue Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expiryDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Expiry Date')]/following::input"),"Expiry Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField=new PageElement(By.xpath("//td/div[contains(text(),'Date of birth')]/following::input"),"Date of birth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageOfDriverTextField=new PageElement(By.xpath("//td/div[contains(text(),'Age of driver')]/following::input"),"Age of driver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Sex')]/following::select"),"Sex", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		experienceTextField=new PageElement(By.xpath("//td/div[contains(text(),'Experience')]/following::input"),"Experience", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressTextField=new PageElement(By.xpath("//td/div[contains(text(),'Address')]/following::input"),"Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyOfTheDrivereverConvicteDorAnyProsecutionpendingDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Any of the driver ever convicted or any prosecution pending')]/following::select"),"Any of the driver ever convicted or any prosecution pending", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfConvictionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Details of Conviction')]/following::textarea"),"Details of Conviction", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossDropDown=new PageElement(By.xpath("//td/div[contains(text(),'In last 3 years any driver involved in any accident or loss')]/following::select"),"In last 3 years any driver involved in any accident or loss", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		twNameOfPreviousInsurerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of Previous Insurer","select")),"Name of Previous Insurer.", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		twPreviousPolicyNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy No","input")),"Previous Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		twAddressOfThePreviousInsurerTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of the Previous Insurer","textarea")),"Address of the Previous Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		twInsuredDeclaredValueTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Insureds declared Value (IDV)","input")),"Insured Declared Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//CV-C
		indemnityToHirersDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Indemnity to Hirers')]/following::select"),"Indemnity to Hirers DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		engineNoTextField=new PageElement(By.xpath("//input[@name=('propValues3')]"),"Engine No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chassisNoTextField=new PageElement(By.xpath("//input[@name=('propValues4')]"),"Chassis No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		makeDropDown=new PageElement(By.xpath("//select[@name=('propValues9')]"),"Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modelDropDown=new PageElement(By.xpath("//input[@name=('propValues10')]"),"Model", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		makeModelFindButton= new PageElement(By.xpath("//input[@name=('propValues10')]//following::img[1]"), "Find", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		makeModelCodeLink = new PageElement(By.xpath("//div[contains(text(),'Make & Model List')]//following::a[1]"), "Make Model", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		addressOfThePreviousInsurerTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Address of the Previous Insurer')]/following::textarea[1]"),"Address of the Previous Insure", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nameOfPreviousInsurerTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of Previous Insurer')]/following::select[1]"),"Name of Previous Insurer TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valueOfFibreGlassFuelTankTextField= new PageElement(By.xpath("//div[contains(text(),'Value of Fibre glass fuel tanks')]//following::input[1]"), "Value Of Fibre glass fuel tank", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyInsuredIntrestVehicleValueDetailsMotor(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVehVaDetMotorEntity.getAction().equalsIgnoreCase("add") || polInsIntVehVaDetMotorEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name= CV-G
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoYouHaveAreaOfOpenCarParks")) {
				selectValueFromList(doYouHaveAreaOfOpenCarParksDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("DoYouHaveAreaOfOpenCarPark"));
			}
			//Mayur_Product name= CV-E
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigGatePassNo")) {
				clearAndSendKeys(gatePassNoTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("GatePassNo"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInvoiceNo")) {
				clearAndSendKeys(invoiceNoTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("InvoiceNo"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTransitFrom")) {
				clearAndSendKeys(transitFromTextArea, polInsIntVehVaDetMotorEntity.getStringValueForField("TransitFrom"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTransitTo")) {
				clearAndSendKeys(transitToTextArea, polInsIntVehVaDetMotorEntity.getStringValueForField("TransitTo"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDistanceCovered")) {
				clearAndSendKeys(distanceCoveredTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("DistanceCovered"));
			}
			//CV-D
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCVDNameAndAddressOfRegistrationAuthority")) {
				clearAndSendKeys(nameAndAddressOfRegistrationAuthorityTextarea, polInsIntVehVaDetMotorEntity.getStringValueForField("CVDNameAndAddressOfRegistrationAuthority"));
			}

			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfMusicSystem")) {
				clearAndSendKeys(valueOfMusicSystemTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfMusicSystem"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfACFan")) {
				clearAndSendKeys(valueOfACFanTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfACFan"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfLights")) {
				clearAndSendKeys(valueOfLightsTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfLights"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfOtherFittings")) {
				clearAndSendKeys(valueOfOtherFittingsTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfOtherFittings"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTotalValueOfExtraElectricalElectronicFittings")) {
				clearAndSendKeys(totalValueOfExtraElectricalElectronicFittingsTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("TotalValueOfExtraElectricalElectronicFittings"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNonElectricalElectronicFittings")) {
				clearAndSendKeys(nonElectricalElectronicFittingsTextarea, polInsIntVehVaDetMotorEntity.getStringValueForField("NonElectricalElectronicFittings"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfNonElectricalElectronicFittings")) {
				clearAndSendKeys(valueOfNonElectricalElectronicFittingsTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfNonElectricalElectronicFittings"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigFibreGlassFuelTanks")) {
				selectValueFromList(fibreGlassFuelTanksDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("FibreGlassFuelTanks"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfFibreGlassFuelTank")) {
				clearAndSendKeys(valueOfFibreGlassFuelTankTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfFibreGlassFuelTank"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIsSideCarAttachedWithATwoWheeler")) {
				selectValueFromList(isSideCarAttachedWithATwoWheelerDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("IsSideCarAttachedWithATwoWheeler"));
			}
			/*if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCVDAdditionalTowingCoverageRequired")) {
				selectValueFromList(additionalTowingCoverageRequiredDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("CVDAdditionalTowingCoverageRequired"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCVDAdditionalTowingCoverageAmount")) {
				clearAndSendKeys(additionalTowingCoverageAmountTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("CVDAdditionalTowingCoverageAmount"));
			}*/
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIsIMT23ToBeDeleted")) {
				selectValueFromList(isIMT23ToBeDeletedDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("IsIMT23ToBeDeleted"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNumberOfTrailers")) {
				clearAndSendKeys(numberOfTrailersTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("NumberOfTrailers"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTotalIDVOfTheTrailerAttachedd")) {
				clearAndSendKeys(totalIDVOfTheTrailerAttachedTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("TotalIDVOfTheTrailerAttached"));
			}
			//CV-C
			//*********PC(CHINTAN) INURED INTREST 3RD PAGE*************
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameAndAddressOfRegistrationAuthority")) {
				clearAndSendKeys(nameAndAddressOfRegistrationAuthorityTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("NameAndAddressOfRegistrationAuthority"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigSeatingCapacityIncludingdriver")) {
				clearAndSendKeys(seatingCapacityIncludingdriverTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("seatingCapacityIncludingdriver"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCubicCapacity")) {
				clearAndSendKeys(cubicCapacityTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("CubicCapacity"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigVehicleInvoiceValue")) {
				SelectValueAndTypeForTextField(vehicleInvoiceValueTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("VehicleInvoiceValue"));
				//	clearAndSendKeys(vehicleInvoiceValueTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("VehicleInvoiceValue"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigVehicleAgeinMonths")) {
				clearAndSendKeys(vehicleAgeinMonthsTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("VehicleAgeinMonths"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoYouHoldValidDrivingLicense")) {
				selectValueFromList(doYouHoldValidDrivingLicenseDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("DoYouHoldValidDrivingLicense"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigLicenseTypeofOwnerDriver")) {
				selectValueFromList(licenseTypeofOwnerDriverDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("LicenseTypeofOwnerDriver"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAgeofOwnerDriver")) {
				clearAndSendKeys(ageofOwnerDriverTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("AgeofOwnerDriver"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigOwnerDriverDrivingLicenseNo")) {
				clearAndSendKeys(ownerDriverDrivingLicenseNoTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("OwnerDriverDrivingLicenseNo"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseIssueDate")) {
				String dateissue=RandomCodeGenerator.dateGenerator(polInsIntVehVaDetMotorEntity.getStringValueForField("OwnerDriverLicenseIssueDate"));
				clearAndEnterDate(ownerDriverLicenseIssueDateTextField, dateissue);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseExpiryDate")) {
				String dateexpiry=RandomCodeGenerator.dateGenerator(polInsIntVehVaDetMotorEntity.getStringValueForField("OwnerDriverLicenseExpiryDate"));
				clearAndEnterDate(ownerDriverLicenseExpiryDateTextField, dateexpiry);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigLicenseIssuingAuthorityforOwnerDriver")) {
				clearAndSendKeys(licenseIssuingAuthorityforOwnerDriverTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("LicenseIssuingAuthorityforOwnerDriver"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameOfNominee")) {
				clearAndSendKeys(nameOfNomineeTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("NameOfNominee"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
				clearAndSendKeys(ageOfNomineeTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("AgeOfNominee"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigRelationshipWithTheInsured")) {
				clearAndSendKeys(relationshipWithTheInsuredTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("RelationshipWithTheInsured"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigGenderOfTheNominee")) {
				selectValueFromList(genderOfTheNomineeDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("GenderOfTheNominee"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoyouHaveAnyotherDriver")) {
				selectValueFromList(doyouHaveAnyotherDriverDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("DoyouHaveAnyotherDriver"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInsuredsdeclaredValue")) {
				clearAndSendKeys(insuredsdeclaredValueTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("InsuredsdeclaredValue"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIDVofAccessories")) {
				clearAndSendKeys(iDVofAccessoriesTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("IDVofAccessories"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigROADTAXAMOUNT")) {
				clearAndSendKeys(rOADTAXAMOUNTTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("ROADTAXAMOUNT"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTotalIDV")) {
				clearAndSendKeys(totalIDVTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("TotalIDV"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNCBApplicablePercentage")) {
				selectValueFromList(nCBApplicablePercentageDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("NCBApplicablePercentage"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameOfPreviousInsurer")) {
				selectValueFromList(nameOfPreviousInsurerTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("NameOfPreviousInsurer"));
				//	clearAndSendKeys(nameOfPreviousInsurerTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("NameOfPreviousInsurer"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAddressOfThePreviousInsurer")) {
				clearAndSendKeys(addressOfThePreviousInsurerTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("AddressOfThePreviousInsurer"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAddressOfThePreviousInsurerPC")) {
				clearAndSendKeys(addressOfThePreviousInsurerTextArea, polInsIntVehVaDetMotorEntity.getStringValueForField("AddressOfThePreviousInsurerPC"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExpirydateOfPreviousPolicy")) {
				String datepreviouspolicy=RandomCodeGenerator.dateGenerator(polInsIntVehVaDetMotorEntity.getStringValueForField("ExpirydateOfPreviousPolicy"));
				clearAndEnterDate(expirydateOfPreviousPolicyTextField, datepreviouspolicy);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameOftheAppointee")) {
				clearAndSendKeys(nameOftheAppointeeTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("NameOftheAppointee"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigRelationshipToTheNominee")) {
				clearAndSendKeys(relationshipToTheNomineeTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("RelationshipToTheNominee"));
			}
			//*******************TW(CHINTAN) INSURED INTREST 3RD PAGE***************
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoyouwantLossofAccessoriesCover")) {
				selectValueFromList(doyouwantLossofAccessoriesCoverDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("DoyouwantLossofAccessoriesCover"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAdditionalTowingCoverageRequired")) {
				selectValueFromList(additionalTowingCoverageRequiredDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("AdditionalTowingCoverageRequired"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAdditionalTowingCoverageAmount")) {
				clearAndSendKeys(additionalTowingCoverageAmountTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("AdditionalTowingCoverageAmount"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDriverName")) {
				clearAndSendKeys(driverNameTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("DriverName"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIssueDate")) {
				String dateissue=RandomCodeGenerator.dateGenerator(polInsIntVehVaDetMotorEntity.getStringValueForField("IssueDate"));
				clearAndEnterDate(issueDateTextField, dateissue);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExpiryDate")) {
				String dateexp=RandomCodeGenerator.dateGenerator(polInsIntVehVaDetMotorEntity.getStringValueForField("ExpiryDate"));
				clearAndEnterDate(expiryDateTextField, dateexp);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDateOfBirth")) {
				String datebirth=RandomCodeGenerator.dateGenerator(polInsIntVehVaDetMotorEntity.getStringValueForField("DateOfBirth"));
				clearAndEnterDate(dateOfBirthTextField, datebirth);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAgeOfDriver")) {
				clearAndSendKeys(ageOfDriverTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("AgeOfDriver"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("Sex"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExperience")) {
				clearAndSendKeys(experienceTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("Experience"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAddress")) {
				clearAndSendKeys(addressTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("Address"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAnyOfTheDrivereverConvicteDorAnyProsecutionpending")) {
				selectValueFromList(anyOfTheDrivereverConvicteDorAnyProsecutionpendingDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("AnyOfTheDrivereverConvicteDorAnyProsecutionpending"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDetailsOfConviction")) {
				clearAndSendKeys(detailsOfConvictionTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("DetailsOfConviction"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss")) {
				selectValueFromList(inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("InLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTwNameOfPreviousInsurer")) {
				selectValueFromList(twNameOfPreviousInsurerDropDown, polInsIntVehVaDetMotorEntity.getStringValueForField("TwNameOfPreviousInsurer"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTwPreviousPolicyNumber")) {
				clearAndSendKeys(twPreviousPolicyNumberTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("TwPreviousPolicyNumber"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTwAddressOfThePreviousInsurer")) {
				clearAndSendKeys(twAddressOfThePreviousInsurerTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("TwAddressOfThePreviousInsurer"));
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTwInsuredDeclaredValue")) {
				clearAndSendKeys(twInsuredDeclaredValueTextField, polInsIntVehVaDetMotorEntity.getStringValueForField("TwInsuredDeclaredValue"));
			}

			//CV-C
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIndemnityToHirers")) {
				selectValueFromList(indemnityToHirersDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("IndemnityToHirers"));
			}
			//CV-D
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigEngineNo")){
				clearAndSendKeys(engineNoTextField,polInsIntVehVaDetMotorEntity.getStringValueForField("EngineNo"));
			}
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPCChassisNo")){
				clearAndSendKeys(chassisNoTextField,polInsIntVehVaDetMotorEntity.getStringValueForField("PCChassisNo"));
			}
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMake")){
				selectValueFromList(makeDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("make"));
			}
			/*if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigModel")){
				selectValueFromList(modelDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("Model"));
			}*/
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigModel")) {
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
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExtraElectricalElectronicFittings")) {
				selectValueFromList(extraElectricalElectronicFittingsDropDown,polInsIntVehVaDetMotorEntity.getStringValueForField("ExtraElectricalElectronicFittings"));
			}


		}
		else if(polInsIntVehVaDetMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Mayur_Product name= CV-G
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoYouHaveAreaOfOpenCarParks")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DoYouHaveAreaOfOpenCarParks"), fetchValueFromList(doYouHaveAreaOfOpenCarParksDropDown), AssertionType.WARNING);
			}
			//Mayur_Product name= CV-E
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigGatePassNo")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("GatePassNo"), fetchValueFromTextFields(gatePassNoTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInvoiceNo")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("InvoiceNo"), fetchValueFromTextFields(invoiceNoTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTransitFrom")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("TransitFrom"), fetchValueFromTextFields(transitFromTextArea), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTransitToTextArea")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("TransitTo"), fetchValueFromTextFields(transitToTextArea), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDistanceCovered")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DistanceCovered"), fetchValueFromTextFields(distanceCoveredTextField), AssertionType.WARNING);
			}
			//CV-D
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCVDNameAndAddressOfRegistrationAuthority")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("CVDNameAndAddressOfRegistrationAuthority"), fetchValueFromTextFields(nameAndAddressOfRegistrationAuthorityTextarea), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExtraElectricalElectronicFittings")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ExtraElectricalElectronicFittings"), fetchValueFromList(extraElectricalElectronicFittingsDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfMusicSystem")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfMusicSystem"), fetchValueFromTextFields(valueOfMusicSystemTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfACFan")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfACFan"), fetchValueFromTextFields(valueOfACFanTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfLights")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfLights"), fetchValueFromTextFields(valueOfLightsTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfOtherFittings")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfOtherFittings"), fetchValueFromTextFields(valueOfOtherFittingsTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTotalValueOfExtraElectricalElectronicFittings")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("TotalValueOfExtraElectricalElectronicFittings"), fetchValueFromTextFields(totalValueOfExtraElectricalElectronicFittingsTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNonElectricalElectronicFittings")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NonElectricalElectronicFittings"), fetchValueFromTextFields(nonElectricalElectronicFittingsTextarea), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfNonElectricalElectronicFittings")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfNonElectricalElectronicFittings"), fetchValueFromTextFields(valueOfNonElectricalElectronicFittingsTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigFibreGlassFuelTanks")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("FibreGlassFuelTanks"), fetchValueFromList(fibreGlassFuelTanksDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigValueOfFibreGlassFuelTank")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ValueOfFibreGlassFuelTank"), fetchValueFromTextFields(valueOfFibreGlassFuelTankTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIsSideCarAttachedWithATwoWheeler")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("IsSideCarAttachedWithATwoWheeler"), fetchValueFromList(isSideCarAttachedWithATwoWheelerDropDown), AssertionType.WARNING);
			}
			/*if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCVDAdditionalTowingCoverageRequired")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("CVDAdditionalTowingCoverageRequired"), fetchValueFromList(additionalTowingCoverageRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCVDAdditionalTowingCoverageAmount")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("CVDAdditionalTowingCoverageAmount"), fetchValueFromTextFields(additionalTowingCoverageAmountTextField), AssertionType.WARNING);
			}*/
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIsIMT23ToBeDeleted")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("IsIMT23ToBeDeleted"), fetchValueFromList(isIMT23ToBeDeletedDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNumberOfTrailers")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NumberOfTrailers"), fetchValueFromTextFields(numberOfTrailersTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTotalIDVOfTheTrailerAttached")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("TotalIDVOfTheTrailerAttachedT"), fetchValueFromTextFields(totalIDVOfTheTrailerAttachedTextField), AssertionType.WARNING);
			}
			//****************PC(CHINTAN) INURED INTREST 3RD PAGE********************************
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameAndAddressOfRegistrationAuthority")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NameAndAddressOfRegistrationAuthority"), fetchValueFromTextFields(nameAndAddressOfRegistrationAuthorityTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigSeatingCapacityIncludingdriver")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("SeatingCapacityIncludingdriver"), fetchValueFromTextFields(seatingCapacityIncludingdriverTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCubicCapacity")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("CubicCapacity"), fetchValueFromTextFields(cubicCapacityTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigVehicleInvoiceValue")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("VehicleInvoiceValue"), fetchValueFromTextFields(vehicleInvoiceValueTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigVehicleAgeinMonths")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("VehicleAgeinMonths"), fetchValueFromTextFields(vehicleAgeinMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoYouHoldValidDrivingLicense")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DoYouHoldValidDrivingLicense"), fetchValueFromList(doYouHoldValidDrivingLicenseDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigLicenseTypeofOwnerDriver")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("LicenseTypeofOwnerDriver"), fetchValueFromList(licenseTypeofOwnerDriverDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAgeofOwnerDriver")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AgeofOwnerDriver"), fetchValueFromTextFields(ageofOwnerDriverTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigOwnerDriverDrivingLicenseNo")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("OwnerDriverDrivingLicenseNo"), fetchValueFromTextFields(ownerDriverDrivingLicenseNoTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseIssueDate")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("OwnerDriverLicenseIssueDate"), fetchValueFromTextFields(ownerDriverLicenseIssueDateTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigOwnerDriverLicenseExpiryDate")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("OwnerDriverLicenseExpiryDate"), fetchValueFromTextFields(ownerDriverLicenseExpiryDateTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigLicenseIssuingAuthorityforOwnerDriver")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("LicenseIssuingAuthorityforOwnerDriver"), fetchValueFromTextFields(licenseIssuingAuthorityforOwnerDriverTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameOfNominee")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NameOfNominee"), fetchValueFromTextFields(nameOfNomineeTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAgeOfNominee")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AgeOfNominee"), fetchValueFromTextFields(ageOfNomineeTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigRelationshipWithTheInsured")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("RelationshipWithTheInsured"), fetchValueFromTextFields(relationshipWithTheInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigGenderOfTheNominee")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("GenderOfTheNominee"), fetchValueFromList(genderOfTheNomineeDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoyouHaveAnyotherDriver")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DoyouHaveAnyotherDriver"), fetchValueFromList(doyouHaveAnyotherDriverDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInsuredsdeclaredValue")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("InsuredsdeclaredValue"), fetchValueFromTextFields(insuredsdeclaredValueTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIDVofAccessories")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("IDVofAccessories"), fetchValueFromTextFields(iDVofAccessoriesTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigROADTAXAMOUNT")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ROADTAXAMOUNT"), fetchValueFromTextFields(rOADTAXAMOUNTTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTotalIDV")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("TotalIDV"), fetchValueFromTextFields(totalIDVTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNCBApplicablePercentage")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NCBApplicablePercentage"), fetchValueFromList(nCBApplicablePercentageDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameOfPreviousInsurer")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NameOfPreviousInsurer"), fetchValueFromTextFields(nameOfPreviousInsurerTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("PreviousPolicyNumber"), fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAddressOfThePreviousInsurer")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AddressOfThePreviousInsure"), fetchValueFromTextFields(addressOfThePreviousInsurerTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExpirydateOfPreviousPolicy")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ExpirydateOfPreviousPolicy"), fetchValueFromTextFields(expirydateOfPreviousPolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigNameOftheAppointee")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("NameOftheAppointee"), fetchValueFromTextFields(nameOftheAppointeeTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigRelationshipToTheNominee")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("RelationshipToTheNominee"), fetchValueFromTextFields(relationshipToTheNomineeTextField), AssertionType.WARNING);
			}
			//***********TW(CHINTAN) INSURED INTREST 3RD PAGE***************
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDoyouwantLossofAccessoriesCover")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DoyouwantLossofAccessoriesCover"), fetchValueFromList(doyouwantLossofAccessoriesCoverDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAdditionalTowingCoverageRequired")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AdditionalTowingCoverageRequired"), fetchValueFromList(additionalTowingCoverageRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAdditionalTowingCoverageAmount")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AdditionalTowingCoverageAmount"), fetchValueFromTextFields(additionalTowingCoverageAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDriverName")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DriverName"), fetchValueFromTextFields(driverNameTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIssueDate")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("IssueDate"), fetchValueFromTextFields(issueDateTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExpiryDate")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("ExpiryDate"), fetchValueFromTextFields(expiryDateTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDateOfBirth")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DateOfBirth"), fetchValueFromTextFields(dateOfBirthTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAgeOfDriver")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AgeOfDrive"), fetchValueFromTextFields(ageOfDriverTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigSex")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigExperience")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("Experience"), fetchValueFromTextFields(experienceTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAddress")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("Address"), fetchValueFromTextFields(addressTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAnyOfTheDrivereverConvicteDorAnyProsecutionpending")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("AnyOfTheDrivereverConvicteDorAnyProsecutionpending"), fetchValueFromList(anyOfTheDrivereverConvicteDorAnyProsecutionpendingDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDetailsOfConviction")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("DetailsOfConviction"), fetchValueFromTextFields(detailsOfConvictionTextField), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("InLast3YearsAnyDriverInvolvedInAnyAccidentOrLoss"), fetchValueFromList(inLast3YearsAnyDriverInvolvedInAnyAccidentOrLossDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigTwInsuredDeclaredValue")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("TwInsuredDeclaredValue"), fetchValueFromTextFields(twInsuredDeclaredValueTextField), AssertionType.WARNING);
			}


			//CV-C
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigIndemnityToHirers")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("IndemnityToHirers"), fetchValueFromList(indemnityToHirersDropDown), AssertionType.WARNING);
			}
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigEngineNo")){
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("EngineNo"), fetchValueFromTextFields(engineNoTextField), AssertionType.WARNING);
			}
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPCChassisNo")){
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("PCChassisNo"), fetchValueFromTextFields(chassisNoTextField), AssertionType.WARNING);
			}
			if(polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMake")){
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("make"), fetchValueFromList(makeDropDown), AssertionType.WARNING);
			}
			if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigModel")) {
				assertReference.assertEquals(polInsIntVehVaDetMotorEntity.getStringValueForField("Model"), fetchValueFromTextFields(modelDropDown), AssertionType.WARNING);
			}

		}
	}
	public void navigateToPolicy(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity ){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberDocument")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigMemberSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity) throws InterruptedException{	
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			Thread.sleep(1000);
			//driver.switchTo().defaultContent();
			//	driver.switchTo().frame("display");
			click(forwardButton);

			return;
		}
	}
	public void clickOnBackButton(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity){
		if (polInsIntVehVaDetMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void fillandSubmitPolicyInsuredIntrestVehicleValueDetailsMotor(PolInsIntVehVaDetMotorEntity polInsIntVehVaDetMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntVehVaDetMotorEntity.getConfigExecute())){
			//	switchToFrame("display");
			fillPolicyInsuredIntrestVehicleValueDetailsMotor(polInsIntVehVaDetMotorEntity, assertReference);
			clickOnForwardButton(polInsIntVehVaDetMotorEntity );
			navigateToPolicy(polInsIntVehVaDetMotorEntity );
			navigateToAttribute(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterest(polInsIntVehVaDetMotorEntity );
			navigateToCoverage(polInsIntVehVaDetMotorEntity );
			navigateToLoan(polInsIntVehVaDetMotorEntity );
			navigateToClientDetails(polInsIntVehVaDetMotorEntity );
			navigateToRelation(polInsIntVehVaDetMotorEntity );
			navigateToPayment(polInsIntVehVaDetMotorEntity );
			navigateToFollowup(polInsIntVehVaDetMotorEntity );
			navigateToDocument(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterestDetails(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterestAttributes(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterestAttachCoverages(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterestRelations(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterestDocuments(polInsIntVehVaDetMotorEntity);
			navigateToInsuredInterestPayments(polInsIntVehVaDetMotorEntity );
			navigateToInsuredInterestSchedule(polInsIntVehVaDetMotorEntity);

		}
	}
}
