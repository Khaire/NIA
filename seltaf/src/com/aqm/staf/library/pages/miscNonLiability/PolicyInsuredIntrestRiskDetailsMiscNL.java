package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.JryDiscMNLEntity;
import com.aqm.staf.library.databin.PolInsIntRiskDPTEntity;
import com.aqm.staf.library.databin.PolInsIntRiskDetMNLEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;
import com.aqm.staf.library.databin.SpeCondForMiscNLEntity;

//YOGESH
public class PolicyInsuredIntrestRiskDetailsMiscNL extends BasePage {
	//Tab
	private PageElement policyTab;
	private PageElement attributeTab;
	private PageElement memebrTab;
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
	private PageElement memebrTabTitle;
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
	//Buttons
	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;

	//BA-Yogesh

	private PageElement sumInsuredForNamedFloatingTextField;
	private PageElement limitPerPersonTextField;
	private PageElement geographicalJurisdictionForBaggageDropDown;
	private PageElement journeyDescriptionTextField;

	private PageElement openbutton;
	private PageElement serialno;
	private PageElement nameoftheperson;
	private PageElement designationforname;
	private PageElement baggagedetails;
	private PageElement deletebutton;
	private PageElement addbutton;
	private PageElement saveButton;
	private PageElement closebutton;
	//BS-Yogesh
	private PageElement excessTextField;
	private PageElement dGmRmDiscretionaryDiscountTextField;
	private PageElement adverseClaimExperienceLoadingInTextField;
	private PageElement otherLoadingInTextField;
	private PageElement giveReasonForOtherLoadingTextArea;
	private PageElement specialConditionsTextArea;
	//FS-Yogesh(Repeated)
	//MI-Yogesh
	private PageElement totalEstimatedTurnoverForAllTheLocationsTextField;
	private PageElement carryingLimitPerLocationTextField;
	private PageElement moneyInTillDuringBusinessHoursTextField;
	private PageElement moneyInSafeAfterBusinessHoursTextField;
	private PageElement whatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKmTextField;
	private PageElement distanceFromTextArea;
	private PageElement distanceToTextArea;
	private PageElement floaterExtraTextField;

	private PageElement serialNoDisabled1TextField;
	private PageElement addressOfLocation1TextArea;
	private PageElement pinCode1TextField;
	private PageElement deleteNewWindow1Button;
	private PageElement addNewWindow1Button;
	private PageElement saveNewWindow1Button;
	private PageElement closeNewWindow1Button;
	private PageElement openbuttonMI;

	//OS-Yogesh(only 1 page after proceed)
	//PB-Yogesh
	private PageElement nameOfTheEmployerTextField;
	private PageElement relationshipOfSponsorTextField;
	private PageElement countryOfVisitTextArea;
	private PageElement addressInCountryOfVisitTextArea;
	private PageElement nameOfWorkplaceTextField;
	private PageElement addressOfTheWorkplaceTextArea;
	private PageElement telephoneNoOfSchoolWorkplaceTextField;
	private PageElement detailsOfNatureOfEmploymentIncludingPeriodFromAndToTextArea;
	private PageElement areYouFreeFromPhysicalDefectOrInfirmityDropDown;
	private PageElement detailsOfPhysicalDefectTextArea;

	//HH-Yogesh
	private PageElement excessForSEC1TextField;

	//*****************BI(CHINTAN)************************
	//private PageElement	quoteNoLabel;
	//private PageElement	policyNoLabel;
	//private PageElement statusLabel;
	private PageElement policyholderLabel;
	//private PageElement productLabel;
	//private PageElement insuredInterestCodeLabel;
	//private PageElement insuredInterestSerialNoLabel;	
	//private PageElement policyTabTitle;	
	//private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement limitoftheLocationTextField;
	private PageElement pinCodeForStandAloneTextField;
	//private PageElement open;
	private PageElement openbuttonBi;
	private PageElement addressOfLocationBi;
	private PageElement pinCodeBi;
	//**************EV(CHINTAN)********************
	private PageElement	dGMRMDiscretionarydiscountTextField;
	private PageElement adverseClaimExperienceLoadingTextField;
	//py DIGVIJAY

	private PageElement basisOfCalculationDropDown;
	private PageElement premiumTextField;
	private PageElement sumInsuredTextField;

	//SK Digvijay
	private PageElement specialConditions1TextArea;
	private PageElement specialConditions2TextArea;

	//JBI Digvijay

	private PageElement stockInPremisesTextField;
	private PageElement stockAtDisplayWindowInThePremisesTextField;
	private PageElement stockInLockedSafeInThePremisesTextField;
	private PageElement elseWhereWithinThePremisesTextField;
	private PageElement cashAndCurrencyNotesTextField;
	private PageElement propertyInBankLockersTextField;
	private PageElement addressOfTheBranchOfTheBankTextArea;
	private PageElement privateLockersTextField;
	private PageElement addressOfThePrivateLockerTextArea;
	private PageElement totalSumInsuredTextField;
	private PageElement rateUpto1CrTextField;
	private PageElement rateUpto5CrTextField;
	private PageElement rateUpto10CrTextField;
	private PageElement rateExceed10CrTextField;
	private PageElement otherLoadingTextField;
	private PageElement giveReasonforOtherLoadingTextField;
	private PageElement specialConditionsTextField;
	//**************EV AND EX SAME(CHINTAN)********************

	//******************FI(CHINTAN)**************************
	private PageElement openbuttonFi;
	private PageElement guaranteeAmountForNamedFloatingTextField;
	//private PageElement nameoftheperson;
	private PageElement cardeTextField;
	private PageElement nameofthepersonTextField;
	private PageElement guaranteeAmountTextField;
	//private PageElement unnamedCadreDetailsforFidelityButton;
	private PageElement numberOfPersonInCardeTextField;
	private PageElement limitPerPersonIntheCadreTextField;
	private PageElement guaranteedAmountperCadreTextField;
	private PageElement designationsforUnnamedFloatingButton;
	private PageElement rateInPercentageTextField;
	private PageElement perCapitaLoadingTextField;

	//****************NI(CHINTAN)***************
	private PageElement limitperlocationTextField;

	//**************************PQ(CHINTAN)**********************
	private PageElement otherLoadinginPercentageTextField;
	private PageElement whichJurisdictionDropDown;
	private PageElement ratePercentageForJurisdictionTextField;
	private PageElement storeDealerCodeTextField;
	private PageElement storeDealerNameTextField;
	private PageElement invoiceNumberTextField;
	private PageElement invoiceDateTextField;

	// PT - Rajkumar --Floating DropDown
	private PageElement policyTypeForPlateGlassDropDown;
	private PageElement limitPerLocationTextField;
	private PageElement rateInPercentTextField;
	private PageElement openNewWindowButton;
	private PageElement serialNoDisabledTextField;
	private PageElement addressOfLocationTextArea;
	private PageElement pinCodeTextField;
	private PageElement plateGlassDescriptionTextArea;
	private PageElement deleteNewWindowButton;
	private PageElement addNewWindowButton;
	private PageElement saveNewWindowButton;
	private PageElement closeNewWindowButton;
	private PageElement riskDetails;
	//PT - Rajkumar Multiple Occupancy DropDown
	private PageElement dimensionofPlateGlassTextField;
	private PageElement pinCodeForMultipleOccupancyTextField;
	private PageElement plateGlassDescriptionForMultipleOccupancyTextArea;
	//PT - Rajkumar StandAlone DropDown
	private PageElement dimensionofPlateGlassForStandAloneTextField;
	private PageElement addressOfLocationforStandAloneTextArea;
	private PageElement insuredForStandAloneTextField;

	//SH-Rajkumar
	private PageElement totalSumInsuredForFireContentDisabledTextField;
	private PageElement rateForFireContentsTextField;
	//SY-Rajkumar
	private PageElement ratePerStudentTextField;
	//BB-Rajkumar
	private PageElement retroactiveDateoneCalenderDate;
	private PageElement basicSumInsuredTextField;
	private PageElement geographicalJurisdictionOneDropDown;
	private PageElement deductibleTypeOneDropDown;
	private PageElement deductibleForIndiaOneTextField;
	private PageElement retroactiveDateTwoCalenderDateTextField;
	private PageElement retroactiveDateThreeCalenderDateTextField;

	private PageElement proceedButton;
	//*****************BI(CHINTAN)************************
	private PageElement	policyNoLabel;

	private PageElement excessForSEC2TextField;
	private PageElement excessForSEC3TextField;
	private PageElement excessForSEC6TextField;
	private PageElement insuredInterestTab;	

	private PageElement occupancyDetailsDropDown;
	//BI
	private PageElement addressOfLocationBITextArea;
	private PageElement pinCodeForSingleLocationDropDown;

	//SH Endorse
	private PageElement sumInsuredPedalCyclesTextField;
	private PageElement sumInsuredPlateTextField;
	private PageElement sumInsuredsec7and9TextField;


	private PageElement sumInsuredBATextField;
	private PageElement designationforNamedTextField;
	private PageElement nameofthePersonBATextField;
	private PageElement baggageDetailsBATextField;


	private PageElement cadreTextFieldBA;
	private PageElement numberofpersonstheDesignationTextFieldBA;
	private PageElement limitperpersoninthecadreTextFieldBA;

	private PageElement designationUnamedFloatingBATextFiled;
	private PageElement  limitperPersonTextField;
	private PageElement  totalSumInsuredUnnamedFloatingTextField;
	private PageElement numberofPersonsCoveredTextField;
	private PageElement openUnnamedbutton;
	//SE
	private PageElement compensationLimitPerAccidentTextField;
	private PageElement designationorUnnamedFloatingTextField;
	private PageElement designationforNamedIndividualSumInsuredTextField;
	private PageElement sumInsuredForMiscNonLiabilityTextField;
	private PageElement NameofthePersonForNonLiabilityTextField;
	
	
	public PolicyInsuredIntrestRiskDetailsMiscNL(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		//Tab
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment DropDown')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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

		//BA-Yogesh
		sumInsuredForNamedFloatingTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Named(Floating)')]/following::input"),"Sum Insured For Named Floating TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerPersonTextField=new PageElement(By.xpath("//td/div[contains(text(),'Limit per Person')]/following::input"),"Limit Per Person TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalJurisdictionForBaggageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Geographical Jurisdiction for Baggage')]/following::select"),"Geographical Jurisdiction For Baggage DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		journeyDescriptionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Journey Description')]/following::input"),"Journey Description TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialno=new PageElement(By.name("name=slNo"+rowcount+""),"Serial no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameoftheperson=new PageElement(By.name("Data_188273330092005_"+rowcount+""),"Name of the person", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		designationforname=new PageElement(By.name("Data_258237204032011_"+rowcount+""),"Designation for Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		baggagedetails=new PageElement(By.name("Data_258237304032011_"+rowcount+""),"Baggage details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Buttons(2 windows)
		deletebutton=new PageElement(By.name("btnDel"),"Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addbutton=new PageElement(By.name("btnAdd"),"Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closebutton=new PageElement(By.name("btnClose"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openbutton = new PageElement(By.xpath("//td/div[contains(text(),'Named(Floating) details for Baggage')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		//BS-Yogesh
		excessTextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess')]/following::input"),"Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dGmRmDiscretionaryDiscountTextField=new PageElement(By.xpath("//td/div[contains(text(),'DGM / RM Discretionary discount(%)')]/following::input"),"DGM RM Discretionary Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingInTextField=new PageElement(By.xpath("//td/div[contains(text(),'Adverse Claim Experience Loading (in %)')]/following::input"),"Adverse Claim Experience Loading In TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//otherLoadingInTextField=new PageElement(By.xpath("//td/div[contains(text(),'Journey Description')]/following::input"),"Other Loading In TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingInTextField=new PageElement(By.xpath("//div[@id='Other Loading (in %)']/following::input[1]"),"Other Loading In TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonForOtherLoadingTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Give Reason for Other Loading')]/following::TextArea"),"Give Reason For Other Loading TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions')]/following::TextArea"),"Special Conditions TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MI
		totalEstimatedTurnoverForAllTheLocationsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Estimated Turnover for all the locations')]/following::input"),"Total Estimated Turnover For All The Locations TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		carryingLimitPerLocationTextField=new PageElement(By.xpath("//td/div[contains(text(),'Carrying Limit per location')]/following::input"),"Carrying Limit Per Location TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyInTillDuringBusinessHoursTextField=new PageElement(By.xpath("//td/div[contains(text(),'Money in Till during business hours')]/following::input"),"Money In Till During Business Hours TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		moneyInSafeAfterBusinessHoursTextField=new PageElement(By.xpath("//tr[6]//td[1]//div[contains(text(),'Money in safe after')]/following::input"),"Money In Safe After Business Hours TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKmTextField=new PageElement(By.xpath("//td/div[contains(text(),'What is the maximum distance over which the money will be carried (in Km)')]/following::input"),"What Is The Maximum Distance Over Which The Money Will Be Carried In Km TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceFromTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Distance from')]/following::TextArea"),"Distance From TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceToTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Distance to')]/following::TextArea"),"Distance To TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		floaterExtraTextField=new PageElement(By.xpath("//td/div[contains(text(),'Floater Extra (%)')]/following::input"),"Floater Extra TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		addressOfLocation1TextArea=new PageElement(By.name("Data_258205404032011_"+rowcount+""), "Address Of Location1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCode1TextField=new PageElement(By.name("Data_232317627082010_"+rowcount+""), "PinCode1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoDisabled1TextField= new PageElement(By.name("slNo_"+rowcount+""), "Serial No Disabled1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deleteNewWindow1Button=new PageElement(By.name("btnDel"), "Delete New Window 1Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addNewWindow1Button=new PageElement(By.name("btnAdd"), "Add New Window 1Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveNewWindow1Button=new PageElement(By.name("btnSave"), "Save New Window 1Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeNewWindow1Button=new PageElement(By.name("btnClose"), "Close New Window1 Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openbuttonMI = new PageElement(By.xpath("//td/div[contains(text(),'Floating location details for Money')]/following::input"), "Floating location details for Money Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//PB-Yogesh
		nameOfTheEmployerTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of the employer')]/following::TextArea"),"Name Of The Employer TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipOfSponsorTextField=new PageElement(By.xpath("//td/div[contains(text(),'Relationship of Sponsor')]/following::input"),"Relationship Of Sponsor TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countryOfVisitTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Country of Visit')]/following::TextArea"),"Country Of Visit TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressInCountryOfVisitTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Address in country of visit')]/following::TextArea"),"Address In Country Of Visit TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfWorkplaceTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of workplace')]/following::input"),"Name Of Workplace TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfTheWorkplaceTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Address of the workplace')]/following::TextArea"),"Address Of The Workplace TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		telephoneNoOfSchoolWorkplaceTextField=new PageElement(By.xpath("//td/div[contains(text(),'Telephone No of School/workplace')]/following::input"),"Telephone No Of School Workplace TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfNatureOfEmploymentIncludingPeriodFromAndToTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Details of Nature of Employment (Including period From and To)')]/following::TextArea"),"Details Of Nature Of Employment Including Period From And To TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		areYouFreeFromPhysicalDefectOrInfirmityDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Are you free from physical defect or infirmity?')]/following::select"),"Are You Free From Physical Defect Or Infirmity DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfPhysicalDefectTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Details of Physical defect')]/following::TextArea"),"Details Of Physical Defect TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//py DIGVIJAY
		basisOfCalculationDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Basis of calculation')]/following::select"), "Basis of calculation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium')]/following::input"), "Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//***********BI(CHINTAN)***************
		limitoftheLocationTextField=new PageElement(By.xpath("//td/div[contains(text(),'Limit of the Location')]/following::input"), "Limit of the Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openbuttonBi=new PageElement(By.xpath("//td/div[contains(text(),'Floating Location dtls for BI')]/following::input"),"Floating Location dtls for BI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfLocationBi=new PageElement(By.name("Data_258205404032011_0"+rowcount+""),"addressOfLocation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeBi=new PageElement(By.name("Data_232317627082010_0"+rowcount+""),"Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeForStandAloneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pin code')]/following::input"), "Pin Code For Stand Alone TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//************EV(CHINTAN)**************
		dGMRMDiscretionarydiscountTextField=new PageElement(By.xpath("//td/div[contains(text(),'DGM / RM Discretionary discount(%)')]/following::input"), "DGM / RM Discretionary discount(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		adverseClaimExperienceLoadingTextField=new PageElement(By.xpath("//td/div[contains(text(),'Adverse Claim Experience Loading (in %)')]/following::input"), "Adverse Claim Experience Loading (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherLoadingTextField=new PageElement(By.xpath("//td/div[contains(text(),'Other Loading (in %)')]/following::input"), "Other Loading (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		giveReasonforOtherLoadingTextField=new PageElement(By.xpath("//div[@id='Give Reason for Other Loading']/following::textarea[1]"), "Give Reason for Other Loading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions')]/following::TextArea"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//*************************FI(CHINTAN)*********************

		openbuttonFi=new PageElement(By.xpath("//div[contains(text(),'Fidelity')]/following::input"), "Named(Floating) details for Fidelity", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		guaranteeAmountForNamedFloatingTextField=new PageElement(By.xpath("//td/div[contains(text(),'Guarantee amount for Named(Floating)')]/following::input"), "Guarantee amount for Named(Floating)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofthepersonTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of the Person')]/following::TextArea"), "Name of the Person", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cardeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cadre')]/following::TextArea"), "CardeTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		guaranteeAmountTextField=new PageElement(By.xpath("//td/div[contains(text(),'Guarantee amount')]/following::input"), "Guarantee amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//unnamedCadreDetailsforFidelityButton=new PageElement(By.xpath("//td/div[contains(text(),'Unnamed Cadre Details for Fidelity')]/following::input"), "Unnamed Cadre Details for Fidelity", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		numberOfPersonInCardeTextField=new PageElement(By.name("name=Data_258222604032011_0"),"Number Of Person In Carde ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerPersonIntheCadreTextField=new PageElement(By.name("name=Data_258222704032011_0"),"limit Per Person In The Cadre", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		guaranteedAmountperCadreTextField=new PageElement(By.name("name=Data_258304504032011_0"),"Guaranteed Amount per Cadre", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		designationsforUnnamedFloatingButton=new PageElement(By.xpath("//td/div[contains(text(),'Designations for Unnamed (Floating)')]/following::input"), "Designations for Unnamed (Floating)", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rateInPercentageTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate (in percent)')]/following::input"), "Rate in Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		perCapitaLoadingTextField=new PageElement(By.xpath("//td/div[contains(text(),'Per Capita Loading')]/following::input"), "Per Capita Loading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  

		//***************************NI(CHINTAN)******************
		limitperlocationTextField=new PageElement(By.xpath("//td/div[contains(text(),'Limit Per Location')]/following::input"), "Limit Per Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  

		//**************************PQ(CHINTAN)**********************
		otherLoadinginPercentageTextField=new PageElement(By.xpath("//td/div[contains(text(),'Other Loading (in %)')]/following::input"), "Other Loading (in %)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
		whichJurisdictionDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Which Jurisdiction')]/following::select"), "Which Jurisdiction", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);  
		ratePercentageForJurisdictionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate (%) for Jurisdiction')]/following::input"), "Rate (%) for Jurisdiction", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
		storeDealerCodeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Store/Dealer Code')]/following::input"), "Store/Dealer Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
		storeDealerNameTextField=new PageElement(By.xpath("//td/div[contains(text(),'Store/Dealer Name')]/following::TextArea"), "Store/Dealer Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
		invoiceNumberTextField=new PageElement(By.xpath("//td/div[contains(text(),'Invoice Number')]/following::input"), "Invoice Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
		invoiceDateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Invoice Date')]/following::input"), "Invoice Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  

		//SK Digvijay
		specialConditions1TextArea=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions1')]/following::TextArea"), "Special Conditions1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions2TextArea=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions2')]/following::TextArea"), "Special Conditions2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		//HH-Yogesh
		excessForSEC1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess for SEC-1')]/following::input"),"Excess For SEC1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//JI
		stockInPremisesTextField=new PageElement(By.xpath("//td/div[contains(text(),'Stock in premises')]/following::input"), "Stock in premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stockAtDisplayWindowInThePremisesTextField=new PageElement(By.xpath("//td/div[contains(text(),'Stock at display window in the premises')]/following::input"), "Stock at display window in the premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		stockInLockedSafeInThePremisesTextField=new PageElement(By.xpath("//td/div[contains(text(),'Stock in locked safe in the premises')]/following::input"), "Stock in locked safe in the premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		elseWhereWithinThePremisesTextField=new PageElement(By.xpath("//td/div[contains(text(),'Else where within the premises')]/following::input"), "Else where within the premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cashAndCurrencyNotesTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cash and Currency notes')]/following::input"), "Cash and Currency notes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		propertyInBankLockersTextField=new PageElement(By.xpath("//td/div[contains(text(),'Property in Bank lockers')]/following::input"), "Property in Bank lockers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		privateLockersTextField=new PageElement(By.xpath("//td/div[contains(text(),'Private lockers')]/following::input"), "Private lockers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfThePrivateLockerTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Address of the Private locker')]/following::TextArea"), "Address of the Private locker", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total sum insured')]/following::input"), "Total sum insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateUpto1CrTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate upto 1 Cr.')]/following::input"), "Rate upto 1 Cr", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateUpto5CrTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate upto 5 Cr.')]/following::input"), "Rate upto 5 Cr", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateUpto10CrTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate upto 10 Cr.')]/following::input"), "Rate upto 10 Cr", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateExceed10CrTextField=new PageElement(By.xpath("//td/div[contains(text(),'Rate exceed 10 Cr')]/following::input"), "Rate exceed 10 Cr", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfTheBranchOfTheBankTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Address of the Branch of the Bank')]/following::TextArea"), "Address of the Branch of the Bank", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PT - Rajkumar Multiple Occupancy DropDown
		dimensionofPlateGlassTextField= new PageElement(By.xpath("//td//div[contains(text(),'Dimension of Plate Glass')]/following::input"), "Dimension of PlateGlass TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured')]/following::input"), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate (in percent)')]/following::input"), "Rate In Percent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		plateGlassDescriptionForMultipleOccupancyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Plate Glass description')]/following::TextArea"), "Plate Glass Description For Multiple Occupancy TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pinCodeForStandAloneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Pin code')]/following::input"), "Pin Code For Stand Alone TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//PT - Rajkumar StandAlone DropDown		

		addressOfLocationforStandAloneTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Address of location')]/following::textarea"), "Address Of Location TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredForStandAloneTextField= new PageElement(By.name("Data_37050905042005_"+rowcount+""), "Sum Insured For StandAlone TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dimensionofPlateGlassForStandAloneTextField= new PageElement(By.name("Data_258340304032011_"+rowcount+""), "Sum dimension of PlateGlass For StandAlone TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SH-Rajkumar

		totalSumInsuredForFireContentDisabledTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured for Fire Content')]/following::input"), "Total Sum Insured For Fire Content Disabled TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForFireContentsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Rate (%o) for Fire Contents')]/following::input"), "Rate For Fire Contents TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SY-Rajkumar

		ratePerStudentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Rate (%) per Student')]/following::input"), "Rate Rer Student TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BB-Rajkumar

		retroactiveDateoneCalenderDate=new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 1')]/following::input"), "Retroactive Date one Calender Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basicSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Basic Sum Insured')]/following::input"), "Basic Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalJurisdictionOneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Geographical')]/following::select"), "Basic Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);				
		deductibleTypeOneDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Deductible   Type1')]/following::select"), "Deductible Type One DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		deductibleForIndiaOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible for India1')]/following::input"), "Deductible For India One TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		retroactiveDateTwoCalenderDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 2')]/following::input"), "Retroactive Date Two Calender Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		retroactiveDateThreeCalenderDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Retroactive Date 3')]/following::input"), "Retroactive Date Three Calender Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		addNewWindowButton=new PageElement(By.name("btnAdd"),"Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		plateGlassDescriptionTextArea=new PageElement(By.name("Data_258340204032011_"+rowcount+""),"Plate Glass Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTypeForPlateGlassDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Policy Type For Plate Glass')]/following::select"), "Policy Type For Plate Glass Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		openNewWindowButton= new PageElement(By.xpath("//td//div[contains(text(),'Plate Glass Details for Stand Alone')]/following::input"), "Policy Type For Plate Glass Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton= new PageElement(By.name("Proceed"),"Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		excessForSEC2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess for SEC-2')]/following::input"),"Excess For SEC2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessForSEC3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess for SEC-3')]/following::input"),"Excess For SEC3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"),"Insured Interest Tab",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//BI
		occupancyDetailsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupancy Details","select")), "Occupancy Details Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addressOfLocationBITextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Address of location","textarea")), "Address of location Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		pinCodeForSingleLocationDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pin Code","select")), "Pin Code Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//SH Endorse
		sumInsuredPedalCyclesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured (Pedal Cycles)","input")), "Sum Insured (Pedal Cycles) Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessForSEC6TextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess for SEC-6')]/following::input"),"Excess For SEC3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredBATextField=new PageElement(By.xpath("//div[@id='Sum Insured']/following::input"), "sumInsuredBATextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		designationforNamedTextField=new PageElement(By.xpath("//div[@id='Designation for Named (Individual Sum Insured)']/following::input"), "designationforNamedTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofthePersonBATextField=new PageElement(By.xpath("//div[@id='Name of the Person']/following::textarea"), "nameofthePersonBATextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		baggageDetailsBATextField=new PageElement(By.xpath("//div[@id='Baggage Details']/following::textarea"), "baggageDetailsBATextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPlateTextField=new PageElement(By.name("propValues1"),"sum insured for plate glass", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredsec7and9TextField=new PageElement(By.name("propValues2"),"sum insured for sec 7 and 9", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);



		cadreTextFieldBA=new PageElement(By.xpath("//div[@id='Cadre']/following::textarea"), "cadreTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofpersonstheDesignationTextFieldBA=new PageElement(By.xpath("//div[@id='Number of persons in the Designation']/following::input"), "numberofpersonstheDesignationTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitperpersoninthecadreTextFieldBA=new PageElement(By.xpath("//div[@id='Limit per person in the  cadre']/following::input"), "limitperpersoninthecadreTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		designationUnamedFloatingBATextFiled=new PageElement(By.name("Data_258238004032011_"+rowcount+""),"designationUnamedFloatingBA", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		limitperPersonTextField=new PageElement(By.xpath("//div[@id='Limit per Person']/following::input"), "limitperPersonTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredUnnamedFloatingTextField=new PageElement(By.xpath("//div[@id='Total Sum Insured for Unnamed(Floating)']/following::input"), "totalSumInsuredUnnamedFloatingTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofPersonsCoveredTextField=new PageElement(By.xpath("//div[@id='Number of Persons Covered']/following::input"), "numberofPersonsCoveredTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		openUnnamedbutton=new PageElement(By.xpath("//td/div[contains(text(),'Designations for Unnamed (Floating)')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//SE
		compensationLimitPerAccidentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compensation Limit per accident", "input")), "Compensation Limit per accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		designationorUnnamedFloatingTextField=new PageElement(By.name("Data_258238004032011_0"), "Designationor Unnamed (Floating)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	    designationforNamedIndividualSumInsuredTextField=new PageElement(By.name("propValues2"), "Designation for Named (Individual Sum Insured)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForMiscNonLiabilityTextField=new PageElement(By.name("propValues4"), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NameofthePersonForNonLiabilityTextField=new PageElement(By.name("propValues1"), "Name of the Person", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyInsuredIntrestRiskDetailsMiscNLDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity, CustomAssert assertReference) throws Exception{

		if(polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("add") || polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("edit")){
			//BA-YOgesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigParameterListforNameddetailsforBaggageDetails")) {
				fillParameterListforNameddetailsforBaggageDetails(polInsIntRiskDetMNLEntity);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigParameterListforDesignationorUnnamedFloating")) {
				fillParameterListforDesignationorUnnamedFloatingDetails(polInsIntRiskDetMNLEntity);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredForNamedFloating")) {
				clearAndSendKeys(sumInsuredForNamedFloatingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredForNamedFloating"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGeographicalJurisdictionForBaggage")) {
				selectValueFromList(geographicalJurisdictionForBaggageDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("GeographicalJurisdictionForBaggage"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigJourneyDescription")) {
				clearAndSendKeys(journeyDescriptionTextField, polInsIntRiskDetMNLEntity.getStringValueForField("JourneyDescription"));
			}
			//BS-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, polInsIntRiskDetMNLEntity.getStringValueForField("Excess"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDGmRmDiscretionaryDiscount")) {
				clearAndSendKeys(dGmRmDiscretionaryDiscountTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DGmRmDiscretionaryDiscount"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingIn")) {
				clearAndSendKeys(adverseClaimExperienceLoadingInTextField, polInsIntRiskDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingIn"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingIn")) {
				clearAndSendKeys(otherLoadingInTextField, polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoadingIn"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				clearAndSendKeys(giveReasonForOtherLoadingTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions"));
			}
			//MI-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTotalEstimatedTurnoverForAllTheLocations")) {
				clearAndSendKeys(totalEstimatedTurnoverForAllTheLocationsTextField, polInsIntRiskDetMNLEntity.getStringValueForField("TotalEstimatedTurnoverForAllTheLocations"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCarryingLimitPerLocation")) {
				clearAndSendKeys(carryingLimitPerLocationTextField, polInsIntRiskDetMNLEntity.getStringValueForField("CarryingLimitPerLocation"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigMoneyInTillDuringBusinessHours")) {
				clearAndSendKeys(moneyInTillDuringBusinessHoursTextField, polInsIntRiskDetMNLEntity.getStringValueForField("MoneyInTillDuringBusinessHours"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigMoneyInSafeAfterBusinessHours")) {
				clearAndSendKeys(moneyInSafeAfterBusinessHoursTextField, polInsIntRiskDetMNLEntity.getStringValueForField("MoneyInSafeAfterBusinessHours"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigWhatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKm")) {
				clearAndSendKeys(whatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKmTextField, polInsIntRiskDetMNLEntity.getStringValueForField("WhatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKm"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDistanceFrom")) {
				clearAndSendKeys(distanceFromTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("DistanceFrom"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDistanceTo")) {
				clearAndSendKeys(distanceToTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("DistanceTo"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDetailsforFloating")){
				fillParameterListForFloatingLocationDetailsForMoney(polInsIntRiskDetMNLEntity);
			}
			//***************BI(CHINTAN)**************
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeForStandAlone")){
				clearAndSendKeys(pinCodeForStandAloneTextField, polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeForStandAlone"));
			}
			//HH-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigExcessForSEC1")) {
				clearAndSendKeys(excessForSEC1TextField, polInsIntRiskDetMNLEntity.getStringValueForField("ExcessForSEC1"));
			}
			//PB-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfTheEmployer")) {
				clearAndSendKeys(nameOfTheEmployerTextField, polInsIntRiskDetMNLEntity.getStringValueForField("NameOfTheEmployer"));
			}


			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigFloaterExtra")) {
				clearAndSendKeys(floaterExtraTextField, polInsIntRiskDetMNLEntity.getStringValueForField("FloaterExtra"));
			}

			//***************EV(CHINTAN)**************
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDGMRMDiscretionaryDiscount")) {
				clearAndSendKeys(dGMRMDiscretionarydiscountTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DGMRMDiscretionaryDiscount"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoading")) {
				clearAndSendKeys(adverseClaimExperienceLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoading")) {
				clearAndSendKeys(otherLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				clearAndSendKeys(giveReasonforOtherLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions"));
			}	
			//*********************************FI(CHINTAN)******************************

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRelationshipOfSponsor")) {
				clearAndSendKeys(relationshipOfSponsorTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RelationshipOfSponsor"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCountryOfVisit")) {
				clearAndSendKeys(countryOfVisitTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("CountryOfVisit"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressInCountryOfVisit")) {
				clearAndSendKeys(addressInCountryOfVisitTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressInCountryOfVisit"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfWorkplace")) {
				clearAndSendKeys(nameOfWorkplaceTextField, polInsIntRiskDetMNLEntity.getStringValueForField("NameOfWorkplace"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfTheWorkplace")) {
				clearAndSendKeys(addressOfTheWorkplaceTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfTheWorkplace"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTelephoneNoOfSchoolWorkplace")) {
				clearAndSendKeys(telephoneNoOfSchoolWorkplaceTextField, polInsIntRiskDetMNLEntity.getStringValueForField("TelephoneNoOfSchoolWorkplace"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDetailsOfNatureOfEmploymentIncludingPeriodFromAndTo")) {
				clearAndSendKeys(detailsOfNatureOfEmploymentIncludingPeriodFromAndToTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("DetailsOfNatureOfEmploymentIncludingPeriodFromAndTo"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAreYouFreeFromPhysicalDefectOrInfirmity")) {
				selectValueFromList(areYouFreeFromPhysicalDefectOrInfirmityDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("AreYouFreeFromPhysicalDefectOrInfirmity"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDetailsOfPhysicalDefect")) {
				clearAndSendKeys(detailsOfPhysicalDefectTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("DetailsOfPhysicalDefect"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGuaranteeAmountForNamedFloating")) {
				clearAndSendKeys(guaranteeAmountForNamedFloatingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("GuaranteeAmountForNamedFloating"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCarde")) {
				clearAndSendKeys(cardeTextField, polInsIntRiskDetMNLEntity.getStringValueForField("Carde"));
			}
			/* if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfThePerson")) {
				clearAndSendKeys(nameofthepersonTextField, polInsIntRiskDetMNLEntity.getStringValueForField("NameOfThePerson"));
			}*/
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGuaranteeAmount")) {
				clearAndSendKeys(guaranteeAmountTextField, polInsIntRiskDetMNLEntity.getStringValueForField("GuaranteeAmount"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateInPercentage")) {
				clearAndSendKeys(rateInPercentageTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateInPercentage"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPerCapitaLoading")) {
				clearAndSendKeys(perCapitaLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("CapitaLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigParameterListNamedFloatingdetailsforFidelityDetails")) {
				fillParameterListNamedFloatingdetailsforFidelityDetails(polInsIntRiskDetMNLEntity);			
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigVerifyListNamedFloatingdetailsforFidelityDetails")) {
				verifyListNamedFloatingdetailsforFidelityDetails(polInsIntRiskDetMNLEntity,assertReference);			
			}
			//******************************NI(CHINTAN)***********************

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerlocation")) {
				clearAndSendKeys(limitperlocationTextField, polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerlocation"));
			}
			//**************************************PQ(CHINTAN)****************************

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoadinginPercentage")) {
				clearAndSendKeys(otherLoadinginPercentageTextField, polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoadinginPercentage"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigWhichJurisdiction")) {
				selectValueFromList(whichJurisdictionDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("WhichJurisdiction"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRatePercentageForJurisdiction")) {
				clearAndSendKeys(ratePercentageForJurisdictionTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RatePercentageForJurisdiction"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStoreDealerCode")) {
				clearAndSendKeys(storeDealerCodeTextField, polInsIntRiskDetMNLEntity.getStringValueForField("StoreDealerCode"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStoreDealerName")) {
				clearAndSendKeys(storeDealerNameTextField, polInsIntRiskDetMNLEntity.getStringValueForField("StoreDealerName"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
				clearAndSendKeys(invoiceNumberTextField, polInsIntRiskDetMNLEntity.getStringValueForField("InvoiceNumber"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInvoiceDate")) {
				String invoiceDate=RandomCodeGenerator.dateGenerator(polInsIntRiskDetMNLEntity.getStringValueForField("InvoiceDate"));
				clearAndEnterDate(invoiceDateTextField, invoiceDate);
			}

			// digvijay prod-py

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigFillRiskDetailsforPY")) {
				if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBasisOfCalculation")) {
					selectValueFromList(basisOfCalculationDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("BasisOfCalculation"));
				}
				if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPremium")) {
					clearAndSendKeys(premiumTextField, polInsIntRiskDetMNLEntity.getStringValueForField("Premium"));
				}
				if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
					clearAndSendKeys(sumInsuredTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsured"));
				}
				if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateInPercentagePY")){
					clearAndSendKeys(rateInPercentTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateInPercent"));
				}
			}
			// digvijay prod-sk
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				clearAndSendKeys(specialConditions1TextArea, polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions1"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				clearAndSendKeys(specialConditions2TextArea, polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions2"));
			}
			// digvijay prod-JBI
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStockInPremises")) {
				clearAndSendKeys(stockInPremisesTextField, polInsIntRiskDetMNLEntity.getStringValueForField("StockInPremises"));
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCashAndCurrencyNotes")) {
				clearAndSendKeys(cashAndCurrencyNotesTextField, polInsIntRiskDetMNLEntity.getStringValueForField("CashAndCurrencyNotes"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPropertyInBankLockers")) {
				clearAndSendKeys(propertyInBankLockersTextField, polInsIntRiskDetMNLEntity.getStringValueForField("PropertyInBankLockers"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfTheBranchOfTheBank")) {
				clearAndSendKeys(addressOfTheBranchOfTheBankTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfTheBranchOfTheBank"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPrivateLockers")) {
				clearAndSendKeys(privateLockersTextField, polInsIntRiskDetMNLEntity.getStringValueForField("PrivateLockers"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfThePrivateLocker")) {
				clearAndSendKeys(addressOfThePrivateLockerTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfThePrivateLocker"));
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateUpto1Cr")) {
				clearAndSendKeys(rateUpto1CrTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateUpto1Cr"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateUpto5Cr")) {
				clearAndSendKeys(rateUpto5CrTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateUpto5Cr"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateUpto10Cr")) {
				clearAndSendKeys(rateUpto10CrTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateUpto10Cr"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateExceed10Cr")) {
				clearAndSendKeys(rateExceed10CrTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateExceed10Cr"));
			}
			//PT - Rajkumar Floating DropDown
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyTypeForPlateGlass")){
				selectValueFromList(policyTypeForPlateGlassDropDown,polInsIntRiskDetMNLEntity.getStringValueForField("PolicyTypeForPlateGlass"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerLocation")){
				clearAndSendKeys(limitPerLocationTextField, polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerLocation"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTotalSumInsured")){
				clearAndSendKeys(totalSumInsuredTextField, polInsIntRiskDetMNLEntity.getStringValueForField("TotalSumInsured"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateInPercent")){
				clearAndSendKeys(rateInPercentTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateInPercent"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDetailsforFloating")){
				fillParameterListForPlateGlassDetailsForFloating(polInsIntRiskDetMNLEntity);
				//PT - Rajkumar Multiple Occupancy DropDown
				switchToWindow("Integrated Insurance Management System");
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDimensionofPlateGlass")){
				clearAndSendKeys(dimensionofPlateGlassTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DimensionofPlateGlass"));
			}
			 if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsured")){
				clearAndSendKeys(sumInsuredTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsured"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeForMultipleOccupancy")){
				clearAndSendKeys(pinCodeForMultipleOccupancyTextField, polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeForMultipleOccupancy"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigplateGlassDescriptionForMultipleOccupancy")){
				clearAndSendKeys(plateGlassDescriptionForMultipleOccupancyTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("PlateGlassDescriptionForMultipleOccupancy"));
			}
			//***************BI(CHINTAN)**************
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitOfTheLocation")) {
				clearAndSendKeys(limitoftheLocationTextField, polInsIntRiskDetMNLEntity.getStringValueForField("LimitOfTheLocation"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigFloatingLocationdtlsforBI")) {
				fillFloatingLocationdtlsforBIDetails(polInsIntRiskDetMNLEntity);
			}
			//***************EV(CHINTAN)**************
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDGMRMDiscretionaryDiscount")) {
				clearAndSendKeys(dGMRMDiscretionarydiscountTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DGMRMDiscretionaryDiscount"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoading")) {
				clearAndSendKeys(adverseClaimExperienceLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoading")) {
				clearAndSendKeys(otherLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				clearAndSendKeys(giveReasonforOtherLoadingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions"));
			}	
			//PT - Rajkumar StandAlone
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocationforStandAlone")){
				switchToFrame("display");
				clearAndSendKeys(addressOfLocationforStandAloneTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocationforStandAlone"));
			}
			//SH-Rajkumar
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateForFireContents")){
				clearAndSendKeys(rateForFireContentsTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RateForFireContents"));
			}	
			//SY-Rajkumar
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRatePerStudent")){
				clearAndSendKeys(ratePerStudentTextField, polInsIntRiskDetMNLEntity.getStringValueForField("RatePerStudent"));
			}
			//BB-Rajkumar

			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRetroactiveDateoneCalenderDate")){
				String dateoneCalenderDates=RandomCodeGenerator.dateGenerator(polInsIntRiskDetMNLEntity.getStringValueForField("retroactiveDateoneCalenderDate"));
				clearAndEnterDate(retroactiveDateoneCalenderDate, dateoneCalenderDates);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBasicSumInsured")){
				clearAndSendKeys(basicSumInsuredTextField, polInsIntRiskDetMNLEntity.getStringValueForField("BasicSumInsured"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGeographicalJurisdictionOneList")){
				selectValueFromList(geographicalJurisdictionOneDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("GeographicalJurisdictionOneList"));
			}	

			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeductibleTypeOneList")){
				selectValueFromList(deductibleTypeOneDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("DeductibleTypeOneList"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeductibleForIndiaOne")){
				clearAndSendKeys(deductibleForIndiaOneTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DeductibleForIndiaOne"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDetroactiveDateTwoCalenderDate")){
				String twoCalenderDate=RandomCodeGenerator.dateGenerator(polInsIntRiskDetMNLEntity.getStringValueForField("DetroactiveDateTwoCalenderDate"));
				clearAndEnterDate(retroactiveDateTwoCalenderDateTextField, twoCalenderDate);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeductibleForIndiaThreeCalenderDate")){
				String indiaThreeCalenderDate=RandomCodeGenerator.dateGenerator(polInsIntRiskDetMNLEntity.getStringValueForField("DeductibleForIndiaThreeCalenderDate"));
				clearAndEnterDate(retroactiveDateThreeCalenderDateTextField, indiaThreeCalenderDate);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerPerson")) {
				clearAndSendKeys(limitPerPersonTextField, polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerPerson"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigExcessForSEC2")) {
				clearAndSendKeys(excessForSEC2TextField, polInsIntRiskDetMNLEntity.getStringValueForField("ExcessForSEC2"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigExcessForSEC3")) {
				clearAndSendKeys(excessForSEC3TextField, polInsIntRiskDetMNLEntity.getStringValueForField("ExcessForSEC3"));
			}
			//BI
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOccupancyDetails")) {
				selectValueFromList(occupancyDetailsDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("OccupancyDetails"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocation")){
				clearAndSendKeys(addressOfLocationBITextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocation"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeForSingleLocation")) {
				selectValueFromList(pinCodeForSingleLocationDropDown, polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeForSingleLocation"));
			}
			//BA
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredBA")) {
				clearAndSendKeys(sumInsuredBATextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredBA"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationForNamedBA")) {
				clearAndSendKeys(designationforNamedTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DesignationForNamedBA"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameofthePersonBA")) {
				clearAndSendKeys(nameofthePersonBATextField, polInsIntRiskDetMNLEntity.getStringValueForField("NameOfThePersonBA"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBaggageDetailsBA")) {
				clearAndSendKeys(baggageDetailsBATextField, polInsIntRiskDetMNLEntity.getStringValueForField("BaggageDetailsBA"));
			}
			//BA
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCadreBA")) {
				clearAndSendKeys(cadreTextFieldBA, polInsIntRiskDetMNLEntity.getStringValueForField("CadreBA"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNoofpersonstheDesignationBA")) {
				clearAndSendKeys(numberofpersonstheDesignationTextFieldBA, polInsIntRiskDetMNLEntity.getStringValueForField("NoofpersonstheDesignationBA"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitperpersoninthecadreBA")) {
				clearAndSendKeys(limitperpersoninthecadreTextFieldBA, polInsIntRiskDetMNLEntity.getStringValueForField("LimitperpersoninthecadreBA"));
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationsUnnamedFloating")) {
				fillDesignationUnnamedFloating(polInsIntRiskDetMNLEntity);
			}
			
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerPersonBA")) {
				clearAndSendKeys(limitperPersonTextField, polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerPersonBA"));
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTotSumInsuredUnnamedFloatingBA")) {
				clearAndSendKeys(totalSumInsuredUnnamedFloatingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("TotSumInsuredUnnamedFloatingBA"));
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNumberofPersonsCoveredBA")) {
				clearAndSendKeys(numberofPersonsCoveredTextField, polInsIntRiskDetMNLEntity.getStringValueForField("NumberofPersonsCoveredBA"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigExcessForSEC6")) {
				clearAndSendKeys(excessForSEC6TextField, polInsIntRiskDetMNLEntity.getStringValueForField("ExcessForSEC6"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredPlate")) {
				clearAndSendKeys(sumInsuredPlateTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredPlate"));
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredsec7and9")) {
				clearAndSendKeys(sumInsuredsec7and9TextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredsec7and9"));
			}
			//SE
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerAccident")) {
				clearAndSendKeys(compensationLimitPerAccidentTextField, polInsIntRiskDetMNLEntity.getStringValueForField("CompensationLimitPerAccident"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameofthePersonForNonLiability")) {
				clearAndSendKeys(NameofthePersonForNonLiabilityTextField, polInsIntRiskDetMNLEntity.getStringValueForField("NameofthePersonForNonLiability"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationforNamedIndividualSumInsured")) {
				clearAndSendKeys(designationforNamedIndividualSumInsuredTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DesignationforNamedIndividualSumInsured"));
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredForMiscNonLiability")) {
				clearAndSendKeys(sumInsuredForMiscNonLiabilityTextField, polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredForMiscNonLiability"));
			}

		}
		else if(polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("verify")){
			//BA-Yogesh	
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredForNamedFloating")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredForNamedFloating"), fetchValueFromTextFields(sumInsuredForNamedFloatingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerPerson")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerPerson"), fetchValueFromTextFields(limitPerPersonTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGeographicalJurisdictionForBaggage")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GeographicalJurisdictionForBaggage"), fetchValueFromList(geographicalJurisdictionForBaggageDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigJourneyDescription")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("JourneyDescription"), fetchValueFromTextFields(journeyDescriptionTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigParameterListforNameddetailsforBaggageDetails")) {
				verifyParameterListforNameddetailsforBaggageDetails(polInsIntRiskDetMNLEntity,assertReference);
			}
			//BS-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDGmRmDiscretionaryDiscount")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DGmRmDiscretionaryDiscount"), fetchValueFromTextFields(dGmRmDiscretionaryDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAdverseClaimExperienceLoadingIn")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AdverseClaimExperienceLoadingIn"), fetchValueFromTextFields(adverseClaimExperienceLoadingInTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoadingIn")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoadingIn"), fetchValueFromTextFields(otherLoadingInTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"), fetchValueFromTextFields(giveReasonForOtherLoadingTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			//MI-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTotalEstimatedTurnoverForAllTheLocations")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("TotalEstimatedTurnoverForAllTheLocations"), fetchValueFromTextFields(totalEstimatedTurnoverForAllTheLocationsTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCarryingLimitPerLocation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("CarryingLimitPerLocation"), fetchValueFromTextFields(carryingLimitPerLocationTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigMoneyInTillDuringBusinessHours")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("MoneyInTillDuringBusinessHours"), fetchValueFromTextFields(moneyInTillDuringBusinessHoursTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigMoneyInSafeAfterBusinessHours")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("MoneyInSafeAfterBusinessHours"), fetchValueFromTextFields(moneyInSafeAfterBusinessHoursTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigWhatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKm")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("WhatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKm"), fetchValueFromTextFields(whatIsTheMaximumDistanceOverWhichTheMoneyWillBeCarriedInKmTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDistanceFrom")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DistanceFrom"), fetchValueFromTextFields(distanceFromTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDistanceTo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DistanceTo"), fetchValueFromTextFields(distanceToTextArea), AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDetailsforFloating")){
				verifyParameterListForFloatingLocationDetailsForMoney(polInsIntRiskDetMNLEntity,assertReference);
			}
			//************BI(CHINTAN)*****************
			//BI VERIFY
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitOfTheLocation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("LimitOfTheLocation"), fetchValueFromTextFields(limitoftheLocationTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigFloaterExtra")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("FloaterExtra"), fetchValueFromTextFields(floaterExtraTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			/*if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
				}*/
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			//***********EV(CHINTAN)*********************

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDGMRMDiscretionaryDiscount")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DGMRMDiscretionaryDiscount"), fetchValueFromTextFields(dGMRMDiscretionarydiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerLocation"), fetchValueFromTextFields(adverseClaimExperienceLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoading"), fetchValueFromTextFields(otherLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"), fetchValueFromTextFields(giveReasonforOtherLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			//HH-Yogesh
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfTheEmployer")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameOfTheEmployer"), fetchValueFromTextFields(nameOfTheEmployerTextField), AssertionType.WARNING);
			}
			//PB-Yogesh
			/*if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfTheEmployer")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameOfTheEmployer"), fetchValueFromTextFields(nameOfTheEmployerTextField), AssertionType.WARNING);
			}*/
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRelationshipOfSponsor")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RelationshipOfSponsor").toLowerCase(), fetchValueFromTextFields(relationshipOfSponsorTextField).toLowerCase(), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCountryOfVisit")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("CountryOfVisit"), fetchValueFromTextFields(countryOfVisitTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressInCountryOfVisit")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressInCountryOfVisit"), fetchValueFromTextFields(addressInCountryOfVisitTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfWorkplace")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameOfWorkplace").toLowerCase(), fetchValueFromTextFields(nameOfWorkplaceTextField).toLowerCase(), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfTheWorkplace")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfTheWorkplace"), fetchValueFromTextFields(addressOfTheWorkplaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTelephoneNoOfSchoolWorkplace")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("TelephoneNoOfSchoolWorkplace"), fetchValueFromTextFields(telephoneNoOfSchoolWorkplaceTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDetailsOfNatureOfEmploymentIncludingPeriodFromAndTo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DetailsOfNatureOfEmploymentIncludingPeriodFromAndTo"), fetchValueFromTextFields(detailsOfNatureOfEmploymentIncludingPeriodFromAndToTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAreYouFreeFromPhysicalDefectOrInfirmity")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AreYouFreeFromPhysicalDefectOrInfirmity"), fetchValueFromList(areYouFreeFromPhysicalDefectOrInfirmityDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDetailsOfPhysicalDefect")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DetailsOfPhysicalDefect"), fetchValueFromTextFields(detailsOfPhysicalDefectTextArea), AssertionType.WARNING);
			}

			//digvijay prod-py
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBasisOfCalculation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("BasisOfCalculation"), fetchValueFromList(basisOfCalculationDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPremium")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Premium"), fetchValueFromTextFields(premiumTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			// digvijay prod-sk


			//***********************FI(CHINTAN)VERIFY**********************
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGuaranteeAmountForNamedFloating")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GuaranteeAmountForNamedFloating"), fetchValueFromTextFields(guaranteeAmountForNamedFloatingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCarde")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Carde"), fetchValueFromTextFields(cardeTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameOfThePerson")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameOfThePerson"), fetchValueFromTextFields(nameofthepersonTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGuaranteeAmount")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GuaranteeAmount"), fetchValueFromTextFields(guaranteeAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateInPercentage")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateInPercentage"), fetchValueFromTextFields(rateInPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPerCapitaLoading")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PerCapitaLoading"), fetchValueFromTextFields(perCapitaLoadingTextField), AssertionType.WARNING);
			}


			//**********************NI(CHINTAN)*************************

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerlocation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("limitPerlocation"), fetchValueFromTextFields(limitperlocationTextField), AssertionType.WARNING);
			}
			//**************************************PQ(CHINTAN)
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions1"), fetchValueFromTextFields(specialConditions1TextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions2"), fetchValueFromTextFields(specialConditions2TextArea), AssertionType.WARNING);
			}

			// digvijay prod-JBI
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStockInPremises")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("StockInPremises"), fetchValueFromTextFields(stockInPremisesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStockAtDisplayWindowInThePremises")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("StockAtDisplayWindowInThePremises"), fetchValueFromTextFields(stockAtDisplayWindowInThePremisesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStockInLockedSafeInThePremises")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("StockInLockedSafeInThePremises"), fetchValueFromTextFields(stockInLockedSafeInThePremisesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigElseWhereWithinThePremises")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("ElseWhereWithinThePremises"), fetchValueFromTextFields(elseWhereWithinThePremisesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCashAndCurrencyNotes")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("CashAndCurrencyNotes"), fetchValueFromTextFields(cashAndCurrencyNotesTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPropertyInBankLockers")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PropertyInBankLockers"), fetchValueFromTextFields(propertyInBankLockersTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfTheBranchOfTheBank")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfTheBranchOfTheBank"), fetchValueFromTextFields(addressOfTheBranchOfTheBankTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPrivateLockers")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PrivateLockers"), fetchValueFromTextFields(privateLockersTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfThePrivateLocker")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfThePrivateLocker"), fetchValueFromTextFields(addressOfThePrivateLockerTextArea), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateUpto1Cr")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateUpto1Cr"), fetchValueFromTextFields(rateUpto1CrTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateUpto5Cr")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateUpto5Cr"), fetchValueFromTextFields(rateUpto5CrTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateUpto10Cr")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateUpto10Cr"), fetchValueFromTextFields(rateUpto10CrTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateExceed10Cr")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateExceed10Cr"), fetchValueFromTextFields(rateExceed10CrTextField), AssertionType.WARNING);
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoadinginPercentage")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoadinginPercentage"), fetchValueFromTextFields(otherLoadinginPercentageTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigWhichJurisdiction")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("WhichJurisdiction"), fetchValueFromList(whichJurisdictionDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRatePercentageForJurisdiction")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RatePercentageForJurisdiction"), fetchValueFromTextFields(ratePercentageForJurisdictionTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStoreDealerCode")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("StoreDealerCode"), fetchValueFromTextFields(storeDealerCodeTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStoreDealerName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("StoreDealerName"), fetchValueFromTextFields(storeDealerNameTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InvoiceNumber"), fetchValueFromTextFields(invoiceNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInvoiceDate")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InvoiceDate"), fetchValueFromTextFields(invoiceDateTextField), AssertionType.WARNING);
			}

			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyTypeForPlateGlass")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PolicyTypeForPlateGlass"), fetchValueFromList(policyTypeForPlateGlassDropDown), AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerLocation")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerLocation"),fetchValueFromTextFields(limitPerLocationTextField) , AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateInPercent")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateInPercent"), fetchValueFromTextFields(rateInPercentTextField),AssertionType.WARNING);
			}

			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDetailsforFloating")){
				verifyParameterListForPlateGlassDetailsForFloating(polInsIntRiskDetMNLEntity,assertReference);
			}
			//************BI(CHINTAN)*****************
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			//PT - Rajkumar Multiple Occupancy DropDown
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDimensionofPlateGlass")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DimensionofPlateGlass"), fetchValueFromTextFields(dimensionofPlateGlassTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsured")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRateInPercent")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RateInPercent"), fetchValueFromTextFields(rateInPercentTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeForMultipleOccupancy")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeForMultipleOccupancy"), fetchValueFromTextFields(pinCodeForMultipleOccupancyTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDescriptionForMultipleOccupancy")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("plateGlassDescriptionForMultipleOccupancy"), fetchValueFromTextFields(plateGlassDescriptionForMultipleOccupancyTextArea),AssertionType.WARNING);
			}
			//PT - Rajkumar StandAlone DropDown
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocation")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocation"), fetchValueFromTextFields(addressOfLocationBITextArea),AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}


			//SH-Rajkumar
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigtotalSumInsuredForFireContentDisabled")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("TotalSumInsuredForFireContentDisabled"), fetchValueFromTextFields(totalSumInsuredForFireContentDisabledTextField),AssertionType.WARNING);
			}
			//SY-Rajkumar
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRatePerStudent")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RatePerStudent"), fetchValueFromTextFields(ratePerStudentTextField),AssertionType.WARNING);
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigFloatingLocationdtlsforBI")) {
				verifyFloatingLocationdtlsforBIDetails(polInsIntRiskDetMNLEntity,assertReference);			
			}

			//***********EV(CHINTAN)*********************

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDGMRMDiscretionaryDiscount")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DGMRMDiscretionaryDiscount"), fetchValueFromTextFields(dGMRMDiscretionarydiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerLocation"), fetchValueFromTextFields(adverseClaimExperienceLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("OtherLoading"), fetchValueFromTextFields(otherLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGiveReasonForOtherLoading")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GiveReasonForOtherLoading"), fetchValueFromTextFields(giveReasonforOtherLoadingTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			//BB-Rajkumar
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRetroactiveDateoneCalenderDate")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RetroactiveDateoneCalenderDate"), fetchValueFromTextFields(retroactiveDateoneCalenderDate), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBasicSumInsured")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("BasicSumInsured"), fetchValueFromTextFields(basicSumInsuredTextField), AssertionType.WARNING);
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGeographicalJurisdictionOneList")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GeographicalJurisdictionOneList"), fetchValueFromList(geographicalJurisdictionOneDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeductibleTypeOneList")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DeductibleTypeOneList"), fetchValueFromTextFields(deductibleTypeOneDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeductibleForIndiaOne")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DeductibleForIndiaOne"), fetchValueFromTextFields(deductibleForIndiaOneTextField), AssertionType.WARNING);
			}				
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDetroactiveDateTwoCalenderDate")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RetroactiveDateTwo"), fetchValueFromTextFields(retroactiveDateTwoCalenderDateTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeductibleForIndiaThreeCalenderDate")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("RetroactiveDateThree"), fetchValueFromTextFields(retroactiveDateThreeCalenderDateTextField), AssertionType.WARNING);
			}
			//BI
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOccupancyDetails")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("OccupancyDetails"), fetchValueFromTextFields(occupancyDetailsDropDown), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeForSingleLocation")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeForSingleLocation"), fetchValueFromTextFields(pinCodeForSingleLocationDropDown), AssertionType.WARNING);			
			}

			//SH Endorse
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredPedalCycles")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredPedalCycles"), fetchValueFromTextFields(sumInsuredPedalCyclesTextField), AssertionType.WARNING);
			}
			//SE
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCompensationLimitPerAccident")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("CompensationLimitPerAccident"), fetchValueFromTextFields(compensationLimitPerAccidentTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNoofpersonstheDesignationBA")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NoofpersonstheDesignationBA"), fetchValueFromTextFields(numberofpersonstheDesignationTextFieldBA), AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationforNamedIndividualSumInsured")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DesignationforNamedIndividualSumInsured"), fetchValueFromTextFields(designationforNamedIndividualSumInsuredTextField), AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSumInsuredForMiscNonLiability")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SumInsuredForMiscNonLiability"), fetchValueFromTextFields(sumInsuredForMiscNonLiabilityTextField), AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameofthePersonForNonLiability")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameofthePersonForNonLiability"), fetchValueFromTextFields(NameofthePersonForNonLiabilityTextField), AssertionType.WARNING);
			}

		}
	}

	public void navigateToPolicy(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMember(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigMemberTab")){			
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnOpenButton(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openbutton);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Named(Floating) details for Baggage' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Named(Floating) details for Baggage' Details");
			}
		}
	}


	private void fillParameterListforNameddetailsforBaggageDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException {
		clickOnOpenButton(polInsIntRiskDetMNLEntity);
		Thread.sleep(3000);
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameofThePerson")) {
			clearAndSendKeys(nameoftheperson, polInsIntRiskDetMNLEntity.getStringValueForField("NameOfThePerson"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationForName")) {
			clearAndSendKeys(designationforname, polInsIntRiskDetMNLEntity.getStringValueForField("DesignationForName"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBaggageDetails")) {
			clearAndSendKeys(baggagedetails, polInsIntRiskDetMNLEntity.getStringValueForField("BaggageDetails"));
		}

		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);

		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deletebutton);

		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}


	private void verifyParameterListforNameddetailsforBaggageDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity, CustomAssert assertReference ) throws InterruptedException {
		clickOnOpenButton(polInsIntRiskDetMNLEntity);

		if(polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSerialno")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Serialno"), fetchValueFromTextFields(serialno), AssertionType.WARNING);	
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameoftheperson")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameOfThePerson"), fetchValueFromTextFields(nameoftheperson), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationForName")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DesignationForName"), fetchValueFromTextFields(designationforname), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBaggagedetails")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("BaggageDetails"), fetchValueFromTextFields(baggagedetails), AssertionType.WARNING);
			}	
		}
	}


	public void clickOnForwardButton(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
		}
		else if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDoubleForwordButton")){			
			click(forwardButton);
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void clickOnSaveButton(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPageSaveButton")){
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void clickOnBackwardButton(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
			if(polInsIntRiskDetMNLEntity.getStringValueForField("Product").equalsIgnoreCase("HH")){
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
			}
			
		}
	}
	public void clickOnBackButton(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
			if(polInsIntRiskDetMNLEntity.getStringValueForField("Product").equalsIgnoreCase("FI")){
				click(proceedButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBackHH")){
				click(proceedButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigBacSeckHH")){
				click(proceedButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");

			}
			
		}
	}

	public void clickToOpenButtonForFloatingLocationList(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOpenClick1Button")){
			click(openbuttonMI);
			try{
				switchToWindow("Parameter List for Floating location details for Money");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Floating location details for Money");
			}
		}
	}


	public void fillParameterListForFloatingLocationDetailsForMoney(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		clickToOpenButtonForFloatingLocationList(polInsIntRiskDetMNLEntity);
		Thread.sleep(3000);
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddNewWindow1Button")){
			click(addNewWindow1Button);
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocation1")){
			clearAndEnterDate(addressOfLocation1TextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocation1"));
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCode1")){
			clearAndSendKeys(pinCode1TextField,polInsIntRiskDetMNLEntity.getStringValueForField("PinCode1"));
		}

		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeleteNewWindow1Button")){
			click(deleteNewWindow1Button);
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveNewWindow1Button")){	
			click(saveNewWindow1Button);
			click(closeNewWindow1Button);	
			switchToWindow("Integrated Insurance Management System");
		}
	}

	public void verifyParameterListForFloatingLocationDetailsForMoney(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButtonForFloatingLocationList(polInsIntRiskDetMNLEntity);

		if(polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSerialNoDisabled1")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SerialNoDisabled1"), fetchValueFromTextFields(serialNoDisabled1TextField), AssertionType.WARNING);	
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocation1")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocation1"), fetchValueFromTextFields(addressOfLocation1TextArea),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCode1")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PinCode1"), fetchValueFromTextFields(pinCode1TextField),AssertionType.WARNING);
				click(closeNewWindow1Button);
				switchToWindow("Integrated Insurance Management System");
			}
		}
	}	


	private void fillFloatingLocationdtlsforBIDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException {
		clickOnOpenButtonBi(polInsIntRiskDetMNLEntity);
		Thread.sleep(2000);
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocationBI")) {
			clearAndSendKeys(addressOfLocationBi, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocationBi"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeBI")) {
			clearAndSendKeys(pinCodeBi, polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeBi"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deletebutton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	//BI
	public void clickOnOpenButtonBi(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOpenButtonBi")){
			click(openbuttonBi);
			try{
				switchToWindow("'Floating Location dtls for BI' Details");
			}  
			catch (Exception e){
			}
		}
	}
	//****************************************FI************************
	public void clickOnOpenButtonfI(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOpenButtonFi")){
			click(openbuttonFi);
			try{
				//Thread.sleep(3000);
				switchToWindow("Named(Floating) details for Fidelity' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Named(Floating) details for Fidelity' Details");
			}
		}
	}
	//***************************************FILL DETAILS OF FI************************
	private void fillParameterListNamedFloatingdetailsforFidelityDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException {
		clickOnOpenButton(polInsIntRiskDetMNLEntity);

		Thread.sleep(3000);
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
			switchToFrame("display");
		}

		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameoftheperson")) {
			clearAndSendKeys(nameoftheperson, polInsIntRiskDetMNLEntity.getStringValueForField("Nameoftheperson"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCarde")) {
			clearAndSendKeys(cardeTextField, polInsIntRiskDetMNLEntity.getStringValueForField("Carde"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNumberOfPersonInCarde")) {
			clearAndSendKeys(numberOfPersonInCardeTextField, polInsIntRiskDetMNLEntity.getStringValueForField("NumberOfPersonInCarde"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerPersonInTheCadre")) {
			clearAndSendKeys(limitPerPersonIntheCadreTextField, polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerPersonInTheCadre"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGuaranteedAmountPerCadre")) {
			clearAndSendKeys(guaranteedAmountperCadreTextField, polInsIntRiskDetMNLEntity.getStringValueForField("GuaranteedAmountPerCadre"));
		}

		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deletebutton);
			switchToFrame("display");
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	//******************************VERIFY(FI)****************
	public void verifyListNamedFloatingdetailsforFidelityDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity, CustomAssert assertReference ) throws InterruptedException {
		clickOnOpenButton(polInsIntRiskDetMNLEntity);
		DesignationsforUnnamedFloatingButton(polInsIntRiskDetMNLEntity);// DesignationsforUnnamedFloatingButton(when user select unamed floating option)
		if(polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSerialno")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Serialno"), fetchValueFromTextFields(serialno), AssertionType.WARNING);	
			}

			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNameoftheperson")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NameOfThePerson"), fetchValueFromTextFields(nameoftheperson), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCarde")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("Carde"), fetchValueFromTextFields(cardeTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigNumberOfPersonInCarde")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("NumberOfPersonInCarde"), fetchValueFromTextFields(numberOfPersonInCardeTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigLimitPerPersonInTheCadre")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("LimitPerPersonInTheCadre"), fetchValueFromTextFields(limitPerPersonIntheCadreTextField), AssertionType.WARNING);
			}
			if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigGuaranteedAmountPerCadre")) {
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("GuaranteedAmountPerCadre"), fetchValueFromTextFields(guaranteedAmountperCadreTextField), AssertionType.WARNING);
			}

		}
	}


	public void DesignationsforUnnamedFloatingButton(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationsforUnnamedFloatingButton")){
			click(designationsforUnnamedFloatingButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Named(Floating) details for Fidelity' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("Named(Floating) details for Fidelity' Details");
			}
		}
	}

	private void verifyFloatingLocationdtlsforBIDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity, CustomAssert assertReference ) throws InterruptedException {
		clickOnOpenButtonBi(polInsIntRiskDetMNLEntity);

		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocationBI")) {
			assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocationBI"), fetchValueFromTextFields(addressOfLocationBi), AssertionType.WARNING);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCodeBi")) {
			assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PinCodeBI"),fetchValueFromTextFields(pinCodeBi), AssertionType.WARNING);
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void clickToOpenButtonForParameterList(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOpenNewWindowButton")){
			click(openNewWindowButton);
			try{
				switchToWindow("Parameter List for Plate Glass Details for Stand Alone");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Plate Glass Details for Stand Alone");
			}
		}
	}

	public void fillParameterListForPlateGlassDetailsForFloating(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		clickToOpenButtonForParameterList(polInsIntRiskDetMNLEntity);
		Thread.sleep(3000);
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddNewWindowButton")){
			switchToWindow("'Plate Glass Details for Stand Alone' Details");
			click(addNewWindowButton);
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocation")){
			clearAndSendKeys(addressOfLocationTextArea, polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocation"));
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCode")){
			clearAndSendKeys(pinCodeTextField,polInsIntRiskDetMNLEntity.getStringValueForField("PinCode"));
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDescription")){
			clearAndSendKeys(plateGlassDescriptionTextArea,polInsIntRiskDetMNLEntity.getStringValueForField("PlateGlassDescription"));
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDeleteNewWindowButton")){
			click(deleteNewWindowButton);
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredForStandAlone")){
			clearAndSendKeys(insuredForStandAloneTextField, polInsIntRiskDetMNLEntity.getStringValueForField("InsuredForStandAlone"));
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDimensionofPlateGlassForStandAlone")){
			clearAndSendKeys(dimensionofPlateGlassForStandAloneTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DimensionofPlateGlassForStandAlone"));
		}
		if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){	
			click(saveButton);
			click(closebutton);	
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyParameterListForPlateGlassDetailsForFloating(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButtonForParameterList(polInsIntRiskDetMNLEntity);

		if(polInsIntRiskDetMNLEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSerialNoDisabled")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("SerialNoDisabled"), fetchValueFromTextFields(serialNoDisabledTextField), AssertionType.WARNING);	
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddressOfLocation")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("AddressOfLocation"), fetchValueFromTextFields(addressOfLocationTextArea),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPinCode")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PinCode"), fetchValueFromTextFields(pinCodeTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredForStandAlone")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("InsuredForStandAlone"), fetchValueFromTextFields(insuredForStandAloneTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDimensionofPlateGlassForStandAlone")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("DimensionofPlateGlassForStandAlone"), fetchValueFromTextFields(dimensionofPlateGlassForStandAloneTextField),AssertionType.WARNING);
			}
			if(polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigPlateGlassDescription")){
				assertReference.assertEquals(polInsIntRiskDetMNLEntity.getStringValueForField("PlateGlassDescription"), fetchValueFromTextFields(plateGlassDescriptionTextArea),AssertionType.WARNING);
				click(closeNewWindowButton);
				switchToWindow("Integrated Insurance Management System");
			}
		}
	}
	public void navigateToInsuredInterest(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity){
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	private void fillDesignationUnnamedFloating(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException {
		clickOnOpenButtonUnNamedFloating(polInsIntRiskDetMNLEntity);
		Thread.sleep(3000);
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationforUnnamedFloating")) {
			clearAndSendKeys(designationUnamedFloatingBATextFiled, polInsIntRiskDetMNLEntity.getStringValueForField("DesignationforUnnamedFloating"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}



	public void clickOnOpenButtonUnNamedFloating(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws InterruptedException{
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openUnnamedbutton);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Designations for Unnamed (Floating)' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Designations for Unnamed (Floating)' Details");
			}
		}
	}
	public void fillParameterListforDesignationorUnnamedFloatingDetails(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity) throws Exception {
		DesignationsforUnnamedFloatingButton(polInsIntRiskDetMNLEntity);
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
		}
		
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigDesignationorUnnamedFloating")) {
			clearAndSendKey(designationorUnnamedFloatingTextField, polInsIntRiskDetMNLEntity.getStringValueForField("DesignationorUnnamedFloating"));
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
		if (polInsIntRiskDetMNLEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}


	public void fillandSubmitSpecialConditionForMiscNL(PolInsIntRiskDetMNLEntity polInsIntRiskDetMNLEntity, CustomAssert assertReference) throws Exception {
		if(isConfigTrue(polInsIntRiskDetMNLEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestRiskDetailsMiscNLDetails(polInsIntRiskDetMNLEntity,assertReference);
			clickOnForwardButton(polInsIntRiskDetMNLEntity);
			clickOnBackButton(polInsIntRiskDetMNLEntity);
			clickOnBackwardButton(polInsIntRiskDetMNLEntity);
			clickOnSaveButton(polInsIntRiskDetMNLEntity);
			navigateToPolicy(polInsIntRiskDetMNLEntity);
			navigateToAttribute(polInsIntRiskDetMNLEntity);
			navigateToInsuredInterest(polInsIntRiskDetMNLEntity);
			navigateToMember(polInsIntRiskDetMNLEntity);
			navigateToCoverage(polInsIntRiskDetMNLEntity);
			navigateToLoan(polInsIntRiskDetMNLEntity);
			navigateToClientDetails(polInsIntRiskDetMNLEntity);
			navigateToRelation(polInsIntRiskDetMNLEntity);
			navigateToPayment(polInsIntRiskDetMNLEntity);
			navigateToFollowup(polInsIntRiskDetMNLEntity);
			navigateToDocument(polInsIntRiskDetMNLEntity);

		}
	}
}
