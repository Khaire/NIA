package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntFleetDMHEntity;
import com.aqm.staf.library.databin.PolInsIntVesselDetEntity;

public class PolicyInsuredIntrestVesselDetailsMarineHull extends BasePage {
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
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement nextAttributePageTitle;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement backwardButton;
	private PageElement saveButton;
	private PageElement	typeOfVesselsDropDown;
	private PageElement subTypeDropDown;
	private PageElement	yearOfBuiltDropDown;
	//*********************8R(CHINTAN)******************
	private PageElement MaterialDropDown;
	private PageElement vesselClassDropDown;
	private PageElement	lengthOverallTextField;
	private PageElement	lengthBPTextField;
	private PageElement	draftTextField;
	private PageElement	breadthMouldedTextField;
	private PageElement	depthUptoMainDockTextField;
	private PageElement	sumInsuredForHullTextField;
	private PageElement sumInsuredForMachineryTextField;
	private PageElement	totalSumInsuredTextField;
	private PageElement	makersNameTextArea;
	private PageElement	engineTypeTextArea;
	private PageElement	fuelUsedTextField;
	private PageElement	horsePowerTextField;
	private PageElement	numberofPropellersTextField;
	private PageElement	numberOfCylindersTextField;
	private PageElement preFAbricationSITextField;
	private PageElement noOfMonthsinContractPeriodforMachineryTextField;
	private PageElement	periodForHullTextField;
	private PageElement	claimRatiopercentageTextField;

	//Mayur-Product Name=SB
	private PageElement nameOfTheVesselTextField;
	private PageElement lightDisplacementTonnageLDTOfVesselTextField;
	private PageElement dateOfBeachingOfVesselTextField;
	private PageElement placeTextField;
	private PageElement dateOfCommencementOfBreakingTextField;
	private PageElement dateOfCustomsClearanceTextField;
	private PageElement dateOfCompletionExpectedTextField;
	private PageElement purchasePriceRsTextField;
	private PageElement customDutyRsTextField;
	private PageElement portChargeRsTextField;
	private PageElement anyGovernmentLevyRsTextField;
	private PageElement totalRsTextField;
	private PageElement valueRateInpercentTextField;
	private PageElement periodInMonthsTextField;
	private PageElement ratePerMonthsInPercentTextField;
	private PageElement specialDiscountPercentTextField;

	//Mayur-Product Name=SL
	private PageElement detailsOfWorkCarriedButton;
	private PageElement detailsOfLargestJobCarriedButton;
	private PageElement premiumsAndClaimsButton;

	private PageElement periodOfWorkDropDown;
	private PageElement repairsRsTextField; 
	private PageElement newConstructionRsTextField; 
	private PageElement miscRsTextField;
	private PageElement numberOfVesselsRepairedTextField; 
	private PageElement numberOfVesselsBuiltTextField;

	private PageElement nameOfTheVesselTextArea;
	private PageElement natureOfJobTextArea;
	private PageElement amountOfBillRsTextField;

	private PageElement totalAnnualBillRsTextField;
	private PageElement netAnnualPremiumRsTextField;
	private PageElement claimsPaidRsTextField;
	private PageElement claimsOutstandingRsTextField;

	//Raj-Product Name=VI
	private PageElement detailsOfInterestButton;
	private PageElement yearOfMakeDropDown;
	private PageElement whetherIsVesselRebuiltDropDown;
	private PageElement interestDropDown;
	private PageElement nameTextField;
	private PageElement addressTextField;
	//CL-Yogesh
	private PageElement  serialNoTextField;	
	private PageElement  vesselNameTextArea; 
	private PageElement  grossRegisteredTonnageGRTTextField;	  
	private PageElement  deadWeightTonnageDWTTextField;
	private PageElement  breakHorsePowerBHPTextField;

	private PageElement vesselDetailsOpenButton;
	private PageElement deleteWindowButton;
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;
	//WR-Rajkumar--2nd page
	private PageElement subTypeOfOceanGoingVesselDropDown;
	private PageElement nameOfInsuredInterestDropDown;
	private PageElement yearOfRebuiltDropDown;
	private PageElement assigneeMortgageeTextArea;
	private PageElement portOfRegistrationAndAuthorityTextField;


	public PolicyInsuredIntrestVesselDetailsMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quotation Details')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//**************AB************
		typeOfVesselsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Vessels')]/following::select"),"Type of Vessels", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Type ')]/following::select"),"Sub Type ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfBuiltDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Year of Built')]/following::select"),"Year of Built", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//*********************8R(CHINTAN)******************
		MaterialDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Material')]/following::select"),"Material", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselClassDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vessel Class')]/following::select"),"Vessel Class", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		lengthOverallTextField=new PageElement(By.xpath("//td//div[contains(text(),'Length Overall')]/following::select"),"Length Overall", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lengthBPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Length B.P.')]/following::input"),"Length B.P.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draftTextField=new PageElement(By.xpath("//td//div[contains(text(),'Draft')]/following::input"),"Draft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breadthMouldedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Breadth Moulded')]/following::input"),"Breadth Moulded", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		depthUptoMainDockTextField=new PageElement(By.xpath("//td//div[contains(text(),'Depth Upto Main Dock')]/following::input"),"Depth Upto Main Dock", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossRegisteredTonnageGRTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Gross Registered Tonnage (GRT)')]/following::input"),"Gross Registered Tonnage (GRT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deadWeightTonnageDWTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Dead Weight Tonnage (DWT)')]/following::input"),"Dead Weight Tonnage (DWT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForHullTextField=new PageElement(By.xpath("//td//div[contains(text(),'')]/following::input"),"", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForMachineryTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Hull')]/following::input"),"Sum Insured for Hull", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured.')]/following::input"),"Total Sum Insured.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		makersNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Makers Name')]/following::TextArea"),"Makers Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		engineTypeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Engine Type')]/following::TextArea"),"Engine Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fuelUsedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Fuel Used')]/following::input"),"Fuel Used", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		horsePowerTextField=new PageElement(By.xpath("//td//div[contains(text(),'Horse Power')]/following::input"),"Horse Power", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberofPropellersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Propellers')]/following::input"),"Number of Propellers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfCylindersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Cylinders')]/following::input"),"Number of Cylinders", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preFAbricationSITextField=new PageElement(By.xpath("//td//div[contains(text(),''Pre Fabrication SI)]/following::input"),"Pre Fabrication SI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfMonthsinContractPeriodforMachineryTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of Months in Contract Period for Machinery')]/following::input"),"No of Months in Contract Period for Machinery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodForHullTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period for Hull (in Months)')]/following::input"),"Period for Hull (in Months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimRatiopercentageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim Ratio(%)')]/following::input"),"Claim Ratio(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur-Product Nmae=SB
		nameOfTheVesselTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of the Vessel')]/following::input"), "Name of the Vessel TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lightDisplacementTonnageLDTOfVesselTextField= new PageElement(By.xpath("//td//div[contains(text(),'Light Displacement Tonnage (LDT) of Vessel')]/following::input"), "Light Displacement Tonnage (LDT) of Vessel TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBeachingOfVesselTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Beaching of Vessel')]/following::input"), "Date of Beaching of Vessel TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Place')]/following::input"), "Place TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfCommencementOfBreakingTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Commencement of Breaking')]/following::input"), "Date of Commencement of Breaking TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfCustomsClearanceTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Customs Clearance')]/following::input"), "Date of Customs Clearance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfCompletionExpectedTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Completion(Expected)')]/following::input"), "Date of Completion(Expected) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		purchasePriceRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Purchase Price(Rs)')]/following::input"), "Purchase Price(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		customDutyRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Custom Duty(Rs)')]/following::input"), "Custom Duty(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portChargeRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Port Charge(Rs)')]/following::input"), "Port Charge(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyGovernmentLevyRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Any Government Levy(Rs)')]/following::input"), "Any Government Levy(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total (Rs)')]/following::input"), "Total (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		valueRateInpercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Value Rate(in percent)')]/following::input"), "Value Rate(in percent) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		periodInMonthsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Period (in Months)')]/following::input"), "Period (in Months) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratePerMonthsInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate per Months(in percent)')]/following::input"), "Rate per Months(in percent) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Special Discount (%)')]/following::input"), "Special Discount (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur-Product Nmae=SL
		detailsOfWorkCarriedButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Work carried out during four completed years and current year')]/following::input"), "Details of Work carried out during four completed years and current year Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detailsOfLargestJobCarriedButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of largest job carried out during four completed years and current year')]/following::input"), "Details of largest job carried out during four completed years and current year Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumsAndClaimsButton= new PageElement(By.xpath("//td//div[contains(text(),'Premiums and claims for four completed years and current year')]/following::input"), "Premiums and claims for four completed years and current year Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		periodOfWorkDropDown= new PageElement(By.name("Data_250178502112010_0"), "Period of work DropDown of New Window", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		repairsRsTextField= new PageElement(By.name("Data_250179602112010_0"), "Repairs (Rs)  TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newConstructionRsTextField= new PageElement(By.name("Data_250179702112010_0"), " New Construction (Rs) TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		miscRsTextField= new PageElement(By.name("Data_250179802112010_0"), " Misc. (Rs) TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfVesselsRepairedTextField= new PageElement(By.name("Data_250179902112010_0"), "  Number of vessels repaired  TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfVesselsBuiltTextField= new PageElement(By.name("Data_250180002112010_0"), "  Number of vessels built  TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		totalAnnualBillRsTextField= new PageElement(By.name("Data_250180402112010_0"), " Total Annual Bill (Rs)  TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netAnnualPremiumRsTextField= new PageElement(By.name("Data_250180502112010_0"), "  Net Annual Premium (Rs)  TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidRsTextField= new PageElement(By.name("Data_250180602112010_0"), "  Claims Paid (Rs)  TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsOutstandingRsTextField= new PageElement(By.name("Data_250180702112010_0"), " Claims Outstanding (Rs) 	TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nameOfTheVesselTextArea= new PageElement(By.name("Data_14548123022002_0"), " Name of the Vessel TextArea of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfJobTextArea= new PageElement(By.name("Data_250180202112010_0"), "  Nature of job  TextArea of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountOfBillRsTextField= new PageElement(By.name("Data_250180302112010_0"), " Amount of bill (Rs) TextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		deleteWindowButton= new PageElement(By.name("btnDel"), "Delete button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addWindowButton= new PageElement(By.name("btnAdd"), "Add button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton= new PageElement(By.name("btnSave"), "Save button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton= new PageElement(By.name("btnClose"), "Close button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//Raj-Product Nmae=VI
		detailsOfInterestButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Interest')]/following::input"), "Details of Interest Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearOfMakeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Year of Make')]/following::select"), "Year of Make DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherIsVesselRebuiltDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether is Vessel Rebuilt?')]/following::select"), "Whether is Vessel Rebuilt? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		interestDropDown= new PageElement(By.name("Data_250092002112010_0"), " Interest DropDown of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameTextField= new PageElement(By.name("Data_20623909012003_0"), " Name TextArea of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressTextField= new PageElement(By.name("Data_36826016032005_0"), " Address TextArea of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CL-Yogesh
		serialNoTextField=new PageElement(By.name("slNo0"), " Serial No. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfVesselsDropDown=new PageElement(By.name("Data_250229602112010_0"), " Type of Vessels  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		vesselNameTextArea=new PageElement(By.name("Data_213905105022010_0"), " Vessel Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfBuiltDropDown=new PageElement(By.name("Data_52367619072005_0"), " Year of Built  DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		grossRegisteredTonnageGRTTextField=new PageElement(By.name("Data_232179827082010_0"), " Gross Registered Tonnage (GRT)  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deadWeightTonnageDWTTextField=new PageElement(By.name("Data_876206022004_0"), " Dead Weight Tonnage (DWT)  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breakHorsePowerBHPTextField=new PageElement(By.name("Data_250104202112010_0"), " Break Horse Power (BHP) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		vesselDetailsOpenButton= new PageElement(By.name("propValues1"), "Vessel Details Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteWindowButton= new PageElement(By.name("btnDel"), "Delete button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addWindowButton= new PageElement(By.name("btnAdd"), "Add button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton= new PageElement(By.name("btnSave"), "Save button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton= new PageElement(By.name("btnClose"), "Close button of New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		subTypeOfOceanGoingVesselDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sub Type of Ocean Going Vessel')]/following::select"), "Sub Type of Ocean Going Vessel List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfInsuredInterestDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Name of Insured Interest')]/following::select"), "Name of Insured Interest List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearOfRebuiltDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Year of Rebuilt')]/following::select"), "Year of Rebuilt list", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		assigneeMortgageeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Assignee/Mortgagee')]/following::select"), "Assignee/Mortgagee TeatArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portOfRegistrationAndAuthorityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Port of Registration and Authority')]/following::select"), "Port of Registration and Authority Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}


	public void fillPolicyInsuredIntrestVesselDetailsMarineHull(PolInsIntVesselDetEntity polInsIntVesselDetEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVesselDetEntity.getAction().equalsIgnoreCase("add") || polInsIntVesselDetEntity.getAction().equalsIgnoreCase("edit")){
			//**************AB************

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				selectValueFromList(typeOfVesselsDropDown, polInsIntVesselDetEntity.getStringValueForField("TypeOfVessels"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSubType")) {
				selectValueFromList(subTypeDropDown, polInsIntVesselDetEntity.getStringValueForField("SubType"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				selectValueFromList(yearOfBuiltDropDown, polInsIntVesselDetEntity.getStringValueForField("YearOfBuilt"));
			}
			//*********************8R(CHINTAN)******************
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMaterial")) {
				selectValueFromList(MaterialDropDown, polInsIntVesselDetEntity.getStringValueForField("Material"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigVesselClass")) {
				selectValueFromList(vesselClassDropDown, polInsIntVesselDetEntity.getStringValueForField("VesselClass"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLengthOverall")) {
				selectValueFromList(lengthOverallTextField, polInsIntVesselDetEntity.getStringValueForField("LengthOverall"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLengthBP")) {
				clearAndSendKeys(lengthBPTextField, polInsIntVesselDetEntity.getStringValueForField("LengthBP"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDraft")) {
				clearAndSendKeys(draftTextField, polInsIntVesselDetEntity.getStringValueForField("Draft"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigBreadthMoulded")) {
				clearAndSendKeys(breadthMouldedTextField, polInsIntVesselDetEntity.getStringValueForField("BreadthMoulded"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDepthUptoMainDock")) {
				clearAndSendKeys(depthUptoMainDockTextField, polInsIntVesselDetEntity.getStringValueForField("DepthUptoMainDock"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")) {
				clearAndSendKeys(grossRegisteredTonnageGRTTextField, polInsIntVesselDetEntity.getStringValueForField("GrossRegisteredTonnageGRT"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")) {
				clearAndSendKeys(deadWeightTonnageDWTTextField, polInsIntVesselDetEntity.getStringValueForField("DeadWeightTonnageDWT"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSumInsuredForHull")) {
				clearAndSendKeys(sumInsuredForHullTextField, polInsIntVesselDetEntity.getStringValueForField("SumInsuredForHull"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSumInsuredForMachinery")) {
				clearAndSendKeys(sumInsuredForMachineryTextField, polInsIntVesselDetEntity.getStringValueForField("SumInsuredForMachinery"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				clearAndSendKeys(totalSumInsuredTextField, polInsIntVesselDetEntity.getStringValueForField("TotalSumInsured"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMakersName")) {
				clearAndSendKeys(makersNameTextArea, polInsIntVesselDetEntity.getStringValueForField("MakersName"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigEngineType")) {
				clearAndSendKeys(engineTypeTextArea, polInsIntVesselDetEntity.getStringValueForField("EngineType"));
			}

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigFuelUsed")) {
				clearAndSendKeys(fuelUsedTextField, polInsIntVesselDetEntity.getStringValueForField("FuelUsed"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigHorsePower")) {
				clearAndSendKeys(horsePowerTextField, polInsIntVesselDetEntity.getStringValueForField("HorsePower"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberofPropellers")) {
				clearAndSendKeys(numberofPropellersTextField, polInsIntVesselDetEntity.getStringValueForField("NumberofPropellers"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberOfCylinders")) {
				clearAndSendKeys(numberOfCylindersTextField, polInsIntVesselDetEntity.getStringValueForField("NumberOfCylinders"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPreFAbricationSI")) {
				clearAndSendKeys(preFAbricationSITextField, polInsIntVesselDetEntity.getStringValueForField("PreFAbricationSI"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNoOfMonthsinContractPeriodforMachinery")) {
				clearAndSendKeys(noOfMonthsinContractPeriodforMachineryTextField, polInsIntVesselDetEntity.getStringValueForField("NoOfMonthsinContractPeriodforMachinery"));
			}

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPeriodForHull")) {
				clearAndSendKeys(periodForHullTextField, polInsIntVesselDetEntity.getStringValueForField("PeriodForHull"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigClaimRatiopercentage")) {
				clearAndSendKeys(claimRatiopercentageTextField, polInsIntVesselDetEntity.getStringValueForField("ClaimRatiopercentage"));
			}
			//Mayur-Product Nmae=SB
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				clearAndSendKeys(nameOfTheVesselTextField, polInsIntVesselDetEntity.getStringValueForField("NameOfTheVessel"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDTOfVessel")) {
				clearAndSendKeys(lightDisplacementTonnageLDTOfVesselTextField, polInsIntVesselDetEntity.getStringValueForField("LightDisplacementTonnageLDTOfVessel"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfBeachingOfVessel")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(polInsIntVesselDetEntity.getStringValueForField("DateOfBeachingOfVessel"));
				clearAndEnterDate(dateOfBeachingOfVesselTextField, dateofIntimation);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPlace")) {
				clearAndSendKeys(placeTextField, polInsIntVesselDetEntity.getStringValueForField("Place"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfCommencementOfBreaking")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(polInsIntVesselDetEntity.getStringValueForField("DateOfCommencementOfBreaking"));
				clearAndEnterDate(dateOfCommencementOfBreakingTextField, dateofIntimation);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfCustomsClearance")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(polInsIntVesselDetEntity.getStringValueForField("DateOfCustomsClearance"));
				clearAndEnterDate(dateOfCustomsClearanceTextField, dateofIntimation);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfCompletionExpected")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(polInsIntVesselDetEntity.getStringValueForField("DateOfCompletionExpected"));
				clearAndEnterDate(dateOfCompletionExpectedTextField, dateofIntimation);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPurchasePriceRs")) {
				clearAndSendKeys(purchasePriceRsTextField, polInsIntVesselDetEntity.getStringValueForField("PurchasePriceRs"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigCustomDutyRs")) {
				clearAndSendKeys(customDutyRsTextField, polInsIntVesselDetEntity.getStringValueForField("CustomDutyRs"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPortChargeRs")) {
				clearAndSendKeys(portChargeRsTextField, polInsIntVesselDetEntity.getStringValueForField("PortChargeRs"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAnyGovernmentLevyRs")) {
				clearAndSendKeys(anyGovernmentLevyRsTextField, polInsIntVesselDetEntity.getStringValueForField("AnyGovernmentLevyRs"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTotalRs")) {
				clearAndSendKeys(totalRsTextField, polInsIntVesselDetEntity.getStringValueForField("TotalRs"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigValueRateInpercent")) {
				clearAndSendKeys(valueRateInpercentTextField, polInsIntVesselDetEntity.getStringValueForField("ValueRateInpercent"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPeriodInMonths")) {
				clearAndSendKeys(periodInMonthsTextField, polInsIntVesselDetEntity.getStringValueForField("PeriodInMonths"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigRatePerMonthsInPercent")) {
				clearAndSendKeys(ratePerMonthsInPercentTextField, polInsIntVesselDetEntity.getStringValueForField("RatePerMonthsInPercent"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSpecialDiscountPercent")) {
				clearAndSendKeys(specialDiscountPercentTextField, polInsIntVesselDetEntity.getStringValueForField("SpecialDiscountPercent"));
			}
			//Mayur-Product Nmae=SL
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfWorkCarriedOutDuringFourCompletedYearsAndCurrentYear")) {
				fillDetailsOfWorkCarriedOutDuringFourCompletedYearsAndCurrentYear(polInsIntVesselDetEntity);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfLargestJobCarriedOutDuringFourCompletedYearsAndCurrentYearButton")) {
				fillDetailsOfLargestJobCarriedOutDuringFourCompletedYearsAndCurrentYearButton(polInsIntVesselDetEntity);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPremiumsAndClaimsforFourCompletedYearsAndCurrentYearButton")) {
				fillPremiumsAndClaimsforFourCompletedYearsAndCurrentYearButton(polInsIntVesselDetEntity);
			}
			//Raj-Product Nmae=VI
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigParameterListForDetailsOfInterest")) {
				fillParameterListForDetailsOfInterest(polInsIntVesselDetEntity);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTearOfMake")) {
				selectValueFromList(yearOfMakeDropDown, polInsIntVesselDetEntity.getStringValueForField("YearOfMake"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigWhetherIsVesselRebuilt")) {
				selectValueFromList(whetherIsVesselRebuiltDropDown, polInsIntVesselDetEntity.getStringValueForField("WhetherIsVesselRebuilt"));
			}

			//CL-Yogesh
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigFillParameterListforVesselDetails")) {
				fillParameterListforVesselDetails(polInsIntVesselDetEntity);
			}
			//WR-Rajkumar--2nd page

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSubTypeOfOceanGoingVesselList")) {
				selectValueFromList(subTypeOfOceanGoingVesselDropDown, polInsIntVesselDetEntity.getStringValueForField("SubTypeOfOceanGoingVesselList"));
			}	
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNameOfInsuredInterestList")) {
				selectValueFromList(nameOfInsuredInterestDropDown, polInsIntVesselDetEntity.getStringValueForField("NameOfInsuredInterestList"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigYearOfRebuilt")) {
				selectValueFromList(yearOfRebuiltDropDown, polInsIntVesselDetEntity.getStringValueForField("YearOfRebuilt"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAssigneeMortgagee")) {
				clearAndSendKeys(assigneeMortgageeTextArea, polInsIntVesselDetEntity.getStringValueForField("AssigneeMortgagee"));
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				clearAndSendKeys(portOfRegistrationAndAuthorityTextField, polInsIntVesselDetEntity.getStringValueForField("PortOfRegistrationAndAuthority"));
			}


		}
		else if(polInsIntVesselDetEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//**************AB************
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("TypeOfVessels"),fetchValueFromList(typeOfVesselsDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSubType")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("SubType"),fetchValueFromList(subTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("YearOfBuilt"),fetchValueFromList(yearOfBuiltDropDown), AssertionType.WARNING);
			}


			//*********************8R(CHINTAN)******************

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMaterial")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Material"),fetchValueFromList(MaterialDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigVesselClass")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("VesselClass"),fetchValueFromList(vesselClassDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLengthOverall")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("LengthOverall"),fetchValueFromList(lengthOverallTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLengthBP")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("LengthBP"),fetchValueFromTextFields(lengthBPTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDraft")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Draft"),fetchValueFromTextFields(draftTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigBreadthMoulded")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("BreadthMoulded"),fetchValueFromTextFields(breadthMouldedTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDepthUptoMainDock")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DepthUptoMainDock"),fetchValueFromTextFields(depthUptoMainDockTextField), AssertionType.WARNING);
			}

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("GrossRegisteredTonnageGRT"),fetchValueFromTextFields(grossRegisteredTonnageGRTTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DeadWeightTonnageDWT"),fetchValueFromTextFields(deadWeightTonnageDWTTextField), AssertionType.WARNING);
			}

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSumInsuredForHull")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("SumInsuredForHull"),fetchValueFromTextFields(sumInsuredForHullTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSumInsuredForMachinery")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("SumInsuredForMachinery"),fetchValueFromTextFields(sumInsuredForMachineryTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("TotalSumInsured"),fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMakersName")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("MakersName"),fetchValueFromTextFields(makersNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigEngineType")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("EngineType"),fetchValueFromTextFields(engineTypeTextArea), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigFuelUsed")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("FuelUsed"),fetchValueFromTextFields(fuelUsedTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigHorsePower")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("HorsePower"),fetchValueFromTextFields(horsePowerTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberofPropellers")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NumberofPropellers"),fetchValueFromTextFields(numberofPropellersTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberOfCylinders")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NumberOfCylinders"),fetchValueFromTextFields(numberOfCylindersTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPreFAbricationSI")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PreFAbricationSI"),fetchValueFromTextFields(preFAbricationSITextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNoOfMonthsinContractPeriodforMachinery")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NoOfMonthsinContractPeriodforMachinery"),fetchValueFromTextFields(noOfMonthsinContractPeriodforMachineryTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPeriodForHull")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PeriodForHull"),fetchValueFromTextFields(periodForHullTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigClaimRatiopercentage")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("ClaimRatiopercentage"),fetchValueFromTextFields(claimRatiopercentageTextField), AssertionType.WARNING);
			}
			//Mayur-Product Nmae=SB
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NameOfTheVessel"), fetchValueFromTextFields(nameOfTheVesselTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDTOfVessel")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("LightDisplacementTonnageLDTOfVessel"), fetchValueFromTextFields(lightDisplacementTonnageLDTOfVesselTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfBeachingOfVessel")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DateOfBeachingOfVessel"), fetchValueFromTextFields(dateOfBeachingOfVesselTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPlace")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Place"), fetchValueFromTextFields(placeTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfCommencementOfBreaking")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DateOfCommencementOfBreaking"), fetchValueFromTextFields(dateOfCommencementOfBreakingTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfCustomsClearance")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DateOfCustomsClearance"), fetchValueFromTextFields(dateOfCustomsClearanceTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDateOfCompletionExpected")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DateOfCompletionExpected"), fetchValueFromTextFields(dateOfCompletionExpectedTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPurchasePriceRs")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PurchasePriceRs"), fetchValueFromTextFields(purchasePriceRsTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigCustomDutyRs")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("CustomDutyRs"), fetchValueFromTextFields(customDutyRsTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPortChargeRs")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PortChargeRs"), fetchValueFromTextFields(portChargeRsTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAnyGovernmentLevyRs")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("AnyGovernmentLevyRs"), fetchValueFromTextFields(anyGovernmentLevyRsTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTotalRs")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("TotalRs"), fetchValueFromTextFields(totalRsTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigValueRateInpercent")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("ValueRateInpercent"), fetchValueFromTextFields(valueRateInpercentTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPeriodInMonths")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PeriodInMonths"), fetchValueFromTextFields(periodInMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigRatePerMonthsInPercent")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("RatePerMonthsInPercent"), fetchValueFromTextFields(ratePerMonthsInPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSpecialDiscountPercent")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("SpecialDiscountPercent"), fetchValueFromTextFields(specialDiscountPercentTextField), AssertionType.WARNING);
			}
			//Mayur-Product Nmae=SL
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfWorkCarriedOutDuringFourCompletedYearsAndCurrentYear")) {
				verifyDetailsOfWorkCarriedOutDuringFourCompletedYearsAndCurrentYear(polInsIntVesselDetEntity, assertReference);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfLargestJobCarriedOutDuringFourCompletedYearsAndCurrentYearButton")) {
				verifyDetailsOfLargestJobCarriedOutDuringFourCompletedYearsAndCurrentYearButton(polInsIntVesselDetEntity, assertReference);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPremiumsAndClaimsforFourCompletedYearsAndCurrentYearButton")) {
				verifyPremiumsAndClaimsforFourCompletedYearsAndCurrentYearButton(polInsIntVesselDetEntity, assertReference);
			}

			//Raj-Product Nmae=VI
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigParameterListForDetailsOfInterest")) {
				verifyParameterListForDetailsOfInterest(polInsIntVesselDetEntity, assertReference);
			}
			//WR-Rajkumar--2nd page
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSubTypeOfOceanGoingVessel")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("SubTypeOfOceanGoingVessel"), fetchValueFromList(subTypeOfOceanGoingVesselDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNameOfInsuredInterest")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NameOfInsuredInterest"), fetchValueFromList(nameOfInsuredInterestDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigYearOfRebuilt")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("YearOfRebuilt"), fetchValueFromList(yearOfRebuiltDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAssigneeMortgagee")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("AssigneeMortgagee"), fetchValueFromTextFields(assigneeMortgageeTextArea), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PortOfRegistrationAndAuthority"), fetchValueFromTextFields(portOfRegistrationAndAuthorityTextField), AssertionType.WARNING);
			}

			//CL-Yogesh
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigVerifyParameterListforVesselDetails")) {
				verifyParameterListforVesselDetails(polInsIntVesselDetEntity, assertReference);
			}
		}
	}
	public void navigateTobackAttributePage(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetails(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle);
		}
	}
	public void navigateToPolicy(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnSaveButton(PolInsIntVesselDetEntity polInsIntVesselDetEntity){
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}

	//Mayur-Product Nmae=SL
	public void clickToOpenButton(PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfWorkCarriedButton")){
			click(detailsOfWorkCarriedButton);
			switchToWindow("'Details of Work carried out during four completed years and current year' Details");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfLargestJobCarriedButton")){
			click(detailsOfLargestJobCarriedButton);
			switchToWindow("'Details of largest job carried out during four completed years and current year' Details");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigPremiumsAndClaimsButton")){
			click(premiumsAndClaimsButton);
			switchToWindow("'Premiums and claims for four completed years and current year' Details");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDetailsOfInterestButton")){
			click(detailsOfInterestButton);
			switchToWindow("'Details of Interest' Details");
		}
	}
	//Raj-Product Nmae=VI
	public void fillParameterListForDetailsOfInterest(PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigInterest")) {
			selectValueFromList(interestDropDown, polInsIntVesselDetEntity.getStringValueForField("Interest"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigName")) {
			clearAndSendKeys(nameTextField, polInsIntVesselDetEntity.getStringValueForField("Name"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddress")) {
			clearAndSendKeys(addressTextField, polInsIntVesselDetEntity.getStringValueForField("Address"));
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}
	//Raj-Product Nmae=VI
	public void verifyParameterListForDetailsOfInterest(PolInsIntVesselDetEntity polInsIntVesselDetEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigInterest")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Interest"), fetchValueFromList(interestDropDown), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigName")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Name"), fetchValueFromFields(nameTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddress")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("Address"), fetchValueFromFields(addressTextField), AssertionType.WARNING);
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	//Mayur-Product Nmae=SL
	//Fill Premiums and claims for four completed years and current year
	public void fillPremiumsAndClaimsforFourCompletedYearsAndCurrentYearButton(PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTotalAnnualBillRs")) {
			clearAndSendKeys(totalAnnualBillRsTextField, polInsIntVesselDetEntity.getStringValueForField("TotalAnnualBillRs"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNetAnnualPremiumRs")) {
			clearAndSendKeys(netAnnualPremiumRsTextField, polInsIntVesselDetEntity.getStringValueForField("NetAnnualPremiumRs"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigClaimsPaidRs")) {
			clearAndSendKeys(claimsPaidRsTextField, polInsIntVesselDetEntity.getStringValueForField("ClaimsPaidRs"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigClaimsOutstandingRs")) {
			clearAndSendKeys(claimsOutstandingRsTextField, polInsIntVesselDetEntity.getStringValueForField("ClaimsOutstandingRs"));
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	// Mayur-Product Nmae=SL
	// verify Premiums and claims for four completed years and current year
	public void verifyPremiumsAndClaimsforFourCompletedYearsAndCurrentYearButton(PolInsIntVesselDetEntity polInsIntVesselDetEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigTotalAnnualBillRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("TotalAnnualBillRs"), fetchValueFromFields(totalAnnualBillRsTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigNetAnnualPremiumRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NetAnnualPremiumRs"), fetchValueFromFields(netAnnualPremiumRsTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigClaimsPaidRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("ClaimsPaidRs"), fetchValueFromFields(claimsPaidRsTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigClaimsOutstandingRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("ClaimsOutstandingRs"), fetchValueFromFields(claimsOutstandingRsTextField), AssertionType.WARNING);
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	// Mayur-Product Nmae=SL
	//Fill Details of largest job carried out during four completed years and current year
	public void fillDetailsOfLargestJobCarriedOutDuringFourCompletedYearsAndCurrentYearButton(PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
			clearAndSendKeys(nameOfTheVesselTextArea, polInsIntVesselDetEntity.getStringValueForField("NameOfTheVessel"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNatureOfJob")) {
			clearAndSendKeys(natureOfJobTextArea, polInsIntVesselDetEntity.getStringValueForField("NatureOfJob"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigAmountOfBillRs")) {
			clearAndSendKeys(amountOfBillRsTextField, polInsIntVesselDetEntity.getStringValueForField("AmountOfBillRs"));
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	// Mayur-Product Nmae=SL
	// Verify Details of largest job carried out during four completed years and current year
	public void verifyDetailsOfLargestJobCarriedOutDuringFourCompletedYearsAndCurrentYearButton(PolInsIntVesselDetEntity polInsIntVesselDetEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigNameOfTheVessel")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NameOfTheVessel"), fetchValueFromFields(nameOfTheVesselTextArea), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigNatureOfJob")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NatureOfJob"), fetchValueFromFields(natureOfJobTextArea), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAmountOfBillRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("AmountOfBillRs"), fetchValueFromFields(amountOfBillRsTextField), AssertionType.WARNING);
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	// Mayur-Product Nmae=SL
	//Fill Details of Work carried out during four completed years and current year
	public void fillDetailsOfWorkCarriedOutDuringFourCompletedYearsAndCurrentYear(PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);
		Thread.sleep(3000);

		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigPeriodOfWork")) {
			selectValueFromList(periodOfWorkDropDown, polInsIntVesselDetEntity.getStringValueForField("PeriodOfWork"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigRepairsRs")) {
			clearAndSendKeys(repairsRsTextField, polInsIntVesselDetEntity.getStringValueForField("RepairsRs"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNewConstructionRs")) {
			clearAndSendKeys(newConstructionRsTextField, polInsIntVesselDetEntity.getStringValueForField("NewConstructionRs"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigMiscRs")) {
			clearAndSendKeys(miscRsTextField, polInsIntVesselDetEntity.getStringValueForField("MiscRs"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberOfVesselsRepaired")) {
			clearAndSendKeys(numberOfVesselsRepairedTextField, polInsIntVesselDetEntity.getStringValueForField("NumberOfVesselsRepaired"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberOfVesselsBuilt")) {
			clearAndSendKeys(numberOfVesselsBuiltTextField, polInsIntVesselDetEntity.getStringValueForField("NumberOfVesselsBuilt"));
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}

	// Mayur-Product Nmae=SL
	// Verify Details of Work carried out during four completed years and current year
	public void verifyDetailsOfWorkCarriedOutDuringFourCompletedYearsAndCurrentYear(PolInsIntVesselDetEntity polInsIntVesselDetEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntVesselDetEntity);

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigPeriodOfWork")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("PeriodOfWork"), fetchValueFromList(periodOfWorkDropDown), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigRepairsRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("RepairsRs"), fetchValueFromFields(repairsRsTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigNewConstructionRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NewConstructionRs"), fetchValueFromFields(newConstructionRsTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigMiscRs")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("MiscRs"), fetchValueFromFields(miscRsTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberOfVesselsRepaired")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NumberOfVesselsRepaired"), fetchValueFromFields(numberOfVesselsRepairedTextField), AssertionType.WARNING);
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigNumberOfVesselsBuilt")){
			assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("NumberOfVesselsBuilt"), fetchValueFromFields(numberOfVesselsBuiltTextField), AssertionType.WARNING);
		}

		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}


	public void clickToOpenButtonForVesselDetails(PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigVesselDetailsOpenButton")){
			click(vesselDetailsOpenButton);
			switchToWindow("'Vessel Details' Details");
		}
	}
	public void fillParameterListforVesselDetails (PolInsIntVesselDetEntity polInsIntVesselDetEntity) throws InterruptedException{
		clickToOpenButtonForVesselDetails(polInsIntVesselDetEntity);
		Thread.sleep(3000);
		click(addWindowButton);

		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTypeOfVessels")) {
			selectValueFromList(typeOfVesselsDropDown, polInsIntVesselDetEntity.getStringValueForField("TypeOfVessels"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigVesselName")) {
			clearAndSendKeys(vesselNameTextArea, polInsIntVesselDetEntity.getStringValueForField("VesselName"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
			selectValueFromList(yearOfBuiltDropDown, polInsIntVesselDetEntity.getStringValueForField("YearOfBuilt"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")) {
			clearAndSendKeys(grossRegisteredTonnageGRTTextField, polInsIntVesselDetEntity.getStringValueForField("GrossRegisteredTonnageGRT"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")) {
			clearAndSendKeys(deadWeightTonnageDWTTextField, polInsIntVesselDetEntity.getStringValueForField("DeadWeightTonnageDWT"));
		}
		if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigBreakHorsePowerBHP")) {
			clearAndSendKeys(breakHorsePowerBHPTextField, polInsIntVesselDetEntity.getStringValueForField("BreakHorsePowerBHP"));
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeleteWindowButton")){
			click(deleteWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigAddWindowButton")){
			click(addWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
			click(closeWindowButton);
			switchToFrame("display");
			switchToWindow("Integrated Insurance Management System");
		}
	}
	public void verifyParameterListforVesselDetails(PolInsIntVesselDetEntity polInsIntVesselDetEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButtonForVesselDetails(polInsIntVesselDetEntity);

		if(polInsIntVesselDetEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("TypeOfVessels"), fetchValueFromList(typeOfVesselsDropDown), AssertionType.WARNING);
			}			
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigVesselName")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("VesselName"), fetchValueFromTextFields(vesselNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigYearOfBuilt")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("YearOfBuilt"), fetchValueFromList(yearOfBuiltDropDown), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("GrossRegisteredTonnageGRT"), fetchValueFromTextFields(grossRegisteredTonnageGRTTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("DeadWeightTonnageDWT"), fetchValueFromTextFields(deadWeightTonnageDWTTextField), AssertionType.WARNING);
			}
			if (polInsIntVesselDetEntity.getBooleanValueForField("ConfigBreakHorsePowerBHP")) {
				assertReference.assertEquals(polInsIntVesselDetEntity.getStringValueForField("BreakHorsePowerBHP"), fetchValueFromTextFields(breakHorsePowerBHPTextField), AssertionType.WARNING);
			}
			if(polInsIntVesselDetEntity.getBooleanValueForField("ConfigCloseWindowButton")){
				click(closeWindowButton);
				switchToFrame("display");
				switchToWindow("Integrated Insurance Management System");
			}
		}
	} 

	public void fillandSubmitPolicyInsuredIntrestVesselDetailsMarineHull(PolInsIntVesselDetEntity polInsIntVesselDetEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntVesselDetEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestVesselDetailsMarineHull(polInsIntVesselDetEntity, assertReference);
			navigateTobackAttributePage(polInsIntVesselDetEntity);
			navigateToPolicy(polInsIntVesselDetEntity);
			navigateToAttribute(polInsIntVesselDetEntity);
			navigateToInsuredInterest(polInsIntVesselDetEntity);
			navigateToCoverage(polInsIntVesselDetEntity);
			navigateToLoan(polInsIntVesselDetEntity);
			navigateToClientDetails(polInsIntVesselDetEntity);
			navigateToRelation(polInsIntVesselDetEntity);
			navigateToPayment(polInsIntVesselDetEntity);
			navigateToFollowup(polInsIntVesselDetEntity);
			navigateToDocument(polInsIntVesselDetEntity);
			navigateTobackAttributePage(polInsIntVesselDetEntity);
			clickOnSaveButton(polInsIntVesselDetEntity);
			navigateToInsuredInterestAttributes(polInsIntVesselDetEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntVesselDetEntity);
			navigateToInsuredInterestRelations(polInsIntVesselDetEntity);
			navigateToInsuredInterestPayments(polInsIntVesselDetEntity);
			clickNextButtonPolicyAttributeCSPolicyDetails(polInsIntVesselDetEntity);
		}
	}

}