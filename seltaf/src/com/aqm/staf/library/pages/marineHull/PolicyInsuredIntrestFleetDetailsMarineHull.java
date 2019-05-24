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
import com.aqm.staf.library.databin.PolInsVesselRiskDEntity;


public class PolicyInsuredIntrestFleetDetailsMarineHull extends BasePage {
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
	//digvijay cs           1st page
	private PageElement projectDetailsTextArea;
	private PageElement locationTextArea;
	private PageElement additionalInformationIfAnyTextArea;
	private PageElement saveButton;
	//private PageElement 
	//Product name= BR
	private PageElement	categoriesDropDown;
	private PageElement	typeOfVesselForcategoryADropDown;
	private PageElement	preFabricationDoneinYardDropDown;
	private PageElement	layingKeelDateTextField;
	private PageElement	dateOfattachmentOfMachineryTextField;
	private PageElement	dateOfcompletionTextField;
	private PageElement	buildersNameTextArea;
	private PageElement	addressTextArea;
	private PageElement	yardnumberTextField;
	private PageElement	constructionAccountTextField;
	private PageElement	constructionAccountForTextArea;
	private PageElement	constructionPlaceTextArea;
	private PageElement	policyIssuedinFavorOfDropDown; 	

	//Mayur_Product name= SB
	private PageElement typeOfVesselsDropDown;
	private PageElement categoryOfVesselDropDown;
	private PageElement vesselCodeTextField;
	//(VesselCode)
	private PageElement vesselCodeOpenWindowTextField;
	private PageElement vesselNameOpenWindowTextField;
	private PageElement backButtons;
	private PageElement searchButton;
	private PageElement vesselCodeClickButton;
	private PageElement vesselCodeToBeSelectedLink;
	//Mayur_Product name= SL
	private PageElement repairingLocationTextArea;
	private PageElement natureOfRepairTextArea;
	private PageElement limitOfLiabilityTextField;
	private PageElement rateForLimitOfLiabilityInPercentTextField;
	private PageElement deductibleTextField;
	private PageElement provisionalAnnualTurnoverTextField;
	private PageElement rateForProvisionalAnnualTurnoverInPercentTextField;
	private PageElement ownersDiscountTextField;
	private PageElement deTariffDiscountTextField;
	//Raj_Product name=VI
	private PageElement typeOfVoyageVesselDropDown;
	private PageElement subTypeOfOceanGoingVesselDropDown;
	private PageElement IMONoTextField;

	//CL-Yogesh
	private PageElement natureOfCharterPartyDropDown;	
	private PageElement voyageFromTextField; 
	private PageElement voyageToTextField;	
	private PageElement agreementPeriodFromTextField;	  
	private PageElement agreementPeriodToTextField;	
	//CP-Repeated
	//WR-Rajkumar--1st page

	private PageElement hullAndMachineryPolicyDropDown;
	private PageElement hullAndMachineryPolicyNumberTextField;
	private PageElement typeOfVesselForWarRiskDropDown;
	private PageElement hullAndMachineryPolicyWithWhichCompanyTextField;
	//marine hull insured interest  attribute 1st page new element add by Anzaf
	private PageElement HOApprovalNo;
	private PageElement HOApprovalDate;
	String hoApprovalDates;

	//Ajit Product Name:-BR
	private PageElement	materialDropDown;
	private PageElement	lengthOverallTextField;
	private PageElement	lengthBPTextField;
	private PageElement	draftTextField;
	private PageElement	breadthMouldedTextField;
	private PageElement	DepthUptoMainDockTextField;
	private PageElement	grossRegisteredTonnageGRTTextField;
	private PageElement	deadWeightTonnageDWTTextField;
	private PageElement	sumInsuredforHullTextField;
	private PageElement	sumInsuredforMachineryTextField;
	private PageElement	ClaimRatioTextField;
	private PageElement	DeliveryDistanceNMTextField;
	private PageElement	coverCodeforBRDropDown;
	private PageElement	isEarthquakeCoverrequiredDropDown;
	private PageElement	IsTerrorismCoverRequiredDropDown;
	
	
	// Product - AB by arunkumar on 19-09-2018
	//start
	private PageElement TypeofVessels;
	private PageElement SubTypeofDredger;
	private PageElement YearofBuilt;
	private PageElement CoverPlace;
	private PageElement SafeAnchoragerequired;
	private PageElement GrossRegisteredTonnageGRT;
	private PageElement LightDisplacementTonnageLDT;
	private PageElement DeadWeightTonnageDWT;
	private PageElement BollardHorsePowerBHP;
	private PageElement SpecialDiscountRate;
	private PageElement SumInsured;
	private PageElement deductible;
	private PageElement NameoftheVessel;
	private PageElement VesselCode;
	private PageElement SpecialConditions1;
	private PageElement SpecialConditions2;
	private PageElement PlaceofAwaitingBreakup;
	//end



	public PolicyInsuredIntrestFleetDetailsMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);
		//CL-Yogesh
		natureOfCharterPartyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Charter Party')]/following::select"), "Nature of Charter Party DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		voyageFromTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voyage From')]/following::input"), "Voyage From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voyageToTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voyage To')]/following::input"), "Voyage To TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreementPeriodFromTextField=new PageElement(By.xpath("//td//div[contains(text(),'Agreement Period From')]/following::input"), "Agreement Period From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreementPeriodToTextField=new PageElement(By.xpath("//td//div[contains(text(),'Agreement Period To')]/following::input"), "Agreement Period To", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CP-Repeated

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
		//policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		nextAttributePageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Vessel type and MH Pol Infmn')]"),"Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		//digvijay cs           1st page
		projectDetailsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'PROJECT DETAILS')]/following::textarea"), "PROJECT DETAILS", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Location')]/following::textarea"), "Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalInformationIfAnyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Additional Information(if any)')]/following::textarea"), "Additional Information(if any)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Mayur_Product name= SB
		typeOfVesselsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Vessels')]/following::select"), "Type of Vessels DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		categoryOfVesselDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Category of Vessel')]/following::select"), "Category of Vessel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselCodeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Vessel Code')]/following::input"), "Vessel Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//(VesselCode)
		vesselCodeOpenWindowTextField=new PageElement(By.name("pVesselCode"), "Vessel Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselNameOpenWindowTextField=new PageElement(By.name("pVesselName"), "Vessel Name", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButtons=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		vesselCodeClickButton=new PageElement(By.xpath("//td//div[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Vessel Code Click Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Mayur_Product name= SL
		repairingLocationTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Repairing Location')]/following::textarea"), "Repairing Location TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfRepairTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of repair')]/following::textarea"), "Nature of repair TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitOfLiabilityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Limit of Liability')]/following::input"), "Limit of Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForLimitOfLiabilityInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate for Limit of Liability (in %)')]/following::input"), "Rate for Limit of Liability (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleTextField= new PageElement(By.xpath("//td//div[contains(text(),'deductible')]/following::input"), "deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		provisionalAnnualTurnoverTextField= new PageElement(By.xpath("//td//div[contains(text(),'Provisional Annual Turnover')]/following::input"), "Provisional Annual Turnover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForProvisionalAnnualTurnoverInPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Rate for Provisional Annual Turnover (in %)')]/following::input"), "Rate for Provisional Annual Turnover (in %) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownersDiscountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Owners Discount')]/following::input"), "Owners Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deTariffDiscountTextField= new PageElement(By.xpath("//td//div[contains(text(),'De Tariff Discount')]/following::input"), "De Tariff Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Raj_Product name=VI
		typeOfVoyageVesselDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Voyage Vessel')]/following::select"), "Type of Voyage Vessel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subTypeOfOceanGoingVesselDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Sub Type of Inland Vessel')]/following::select"), "Sub Type of Inland Vessel DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IMONoTextField= new PageElement(By.xpath("//td//div[contains(text(),'IMO No.')]/following::textarea"), "IMO No. TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CL-Yogesh
		natureOfCharterPartyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Charter Party')]/following::select"), "Nature of Charter Party DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		voyageFromTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voyage From')]/following::input"), "Voyage From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		voyageToTextField=new PageElement(By.xpath("//td//div[contains(text(),'Voyage To')]/following::input"), "Voyage To TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreementPeriodFromTextField=new PageElement(By.xpath("//td//div[contains(text(),'Agreement Period From')]/following::input"), "Agreement Period From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreementPeriodToTextField=new PageElement(By.xpath("//td//div[contains(text(),'Agreement Period To')]/following::input"), "Agreement Period To", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		hullAndMachineryPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Hull and Machinery Policy')]/following::select"), "Hull and Machinery Policy list", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hullAndMachineryPolicyNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Hull and Machinery Policy Number')]/following::input"), "Hull and Machinery Policy Number text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hullAndMachineryPolicyWithWhichCompanyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Hull and Machinery Policy with which company')]/following::input"), "Hull and Machinery Policy with which company text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfVesselForWarRiskDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Vessel for War Risk')]/following::select"), "Type of Vessel for War Risk list", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		HOApprovalNo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("HO Approval No.", "textarea")), "HO Approval No", false,  WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//div[contains(text(),'HO Approval No.')]//following::TEXTAREA[1]
		HOApprovalDate=new PageElement(By.xpath("//div[contains(text(),'HO Approval Date')]//following::input[1]"), "HO Approval Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);


		materialDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Material", "select")), "Material", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lengthOverallTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Length Overall", "input")), "Length Overall Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		lengthBPTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Length B.P.", "input")), "Length BP Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draftTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Draft", "input")), "Draft Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		breadthMouldedTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Breadth Moulded", "input")), "Breadth Moulded Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DepthUptoMainDockTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Depth Upto Main Dock", "input")), "Depth Upto Main Dock Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		grossRegisteredTonnageGRTTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Gross Registered Tonnage (GRT)", "input")), "Gross Registered Tonnage (GRT) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deadWeightTonnageDWTTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Dead Weight Tonnage (DWT)", "input")), "Dead Weight TonnageDWT Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredforHullTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Hull", "input")), "Sum Insured for Hull Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredforMachineryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Machinery", "input")), "sum Insured for Machinery Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ClaimRatioTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Ratio(%)", "input")), "Claim Ratio % Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		DeliveryDistanceNMTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Delivery Distance(NM)", "input")), "DeliveryDistance (NM) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Adding on 10-09-2018 by ADP
		categoriesDropDown 					 = new PageElement(By.xpath("//div[contains(text(),'Catego')]//following::Select[1]"), "categories Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfVesselForcategoryADropDown	 = new PageElement(By.xpath("//div[contains(text(),'Type of Vessel for category A')]//following::Select[1]"), "Type of Vessel for category A", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preFabricationDoneinYardDropDown	 = new PageElement(By.xpath("//div[contains(text(),'Pre Fabrication Done in Yard')]//following::Select[1]"), "pre Fabrication Done in Yard Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		layingKeelDateTextField				 = new PageElement(By.xpath("//div[contains(text(),'Laying Keel Date')]//following::Input[1]"), "laying Keel Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfattachmentOfMachineryTextField = new PageElement(By.xpath("//div[contains(text(),'Date of attachment of machinery')]//following::Input[1]"), "date Of attachment Of Machinery Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfcompletionTextField			 = new PageElement(By.xpath("//div[contains(text(),'Date of completion (aaprox)')]//following::Input[1]"), "date Of completion Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		buildersNameTextArea   				 = new PageElement(By.xpath("//div[contains(text(),'Builders Name')]//following::textarea[1]"), "builders Name Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressTextArea 					 = new PageElement(By.xpath("//div[contains(text(),'Address')]//following::textarea[1]"), "address Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yardnumberTextField					 = new PageElement(By.xpath("//div[contains(text(),'Yard Number')]//following::input[1]"), "yard number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		constructionAccountTextField		 = new PageElement(By.xpath("//div[contains(text(),'Construction Account')]//following::input[1]"), "construction Account Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		constructionAccountForTextArea		 = new PageElement(By.xpath("//div[contains(text(),'Construction Account for')]//following::textarea[1]"), "construction Account For Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		constructionPlaceTextArea			 = new PageElement(By.xpath("//div[contains(text(),'Construction Place')]//following::textarea[1]"), "construction Place Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyIssuedinFavorOfDropDown        = new PageElement(By.xpath("//div[contains(text(),'Policy Issued in Favor of')]//following::Select[1]"), "policy Issued in Favor Of Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 	


		coverCodeforBRDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cover Code for BR", "select")), "Cover Code for BR Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isEarthquakeCoverrequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Earthquake Cover required?", "select")), "Is Earthquake Coverrequired Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsTerrorismCoverRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Terrorism Cover Required?", "select")), "Is Terrorism Cover Required Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Product type - AB 
		// start 
		//input
		GrossRegisteredTonnageGRT	= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Gross Registered Tonnage (GRT)","input")),"Gross Registered Tonnage (GRT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LightDisplacementTonnageLDT	= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Light Displacement Tonnage (LDT)","input")),"Light Displacement Tonnage (LDT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DeadWeightTonnageDWT		= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Dead Weight Tonnage (DWT)","input")),"Dead Weight Tonnage (DWT)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BollardHorsePowerBHP		= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Bollard Horse Power (BHP)","input")),"Bollard Horse Power (BHP)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialDiscountRate			= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Discount Rate(%)","input")),"Special Discount Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SumInsured					= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured","input")),"Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductible					= new PageElement(By.xpath(locatorforQuestionAnswerPanel("deductible","input")),"deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NameoftheVessel				= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Vessel","input")),"Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		VesselCode					= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Vessel Code","input")),"Vessel Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// select
		TypeofVessels				= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Vessels","select")),"Type of Vessels", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SubTypeofDredger			= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sub Type of Dredger","select")),"Sub Type of Dredger", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		YearofBuilt					= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of Built","select")),"Year of Built", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		CoverPlace					= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cover Place","select")),"Cover Place", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SafeAnchoragerequired		= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Safe Anchorage required","select")),"Safe Anchorage required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//textarea
		SpecialConditions1			= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1","textarea")),"Special Conditions1", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SpecialConditions2			= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2","textarea")),"Special Conditions2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		PlaceofAwaitingBreakup		= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of Awaiting Breakup","textarea")),"Place of Awaiting Breakup", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


	}
	public void fillPolicyInsuredIntrestFleetDetailsMarineHull(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntFleetDMHEntity.getAction().equalsIgnoreCase("add") || polInsIntFleetDMHEntity.getAction().equalsIgnoreCase("edit")){
			//first page of insured interest attribute of marine hull coding by anzaf




			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigProjectDetails")) {
				clearAndSendKeys(projectDetailsTextArea, polInsIntFleetDMHEntity.getStringValueForField("ProjectDetails"));
			}


			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLocation")) {
				clearAndSendKeys(locationTextArea, polInsIntFleetDMHEntity.getStringValueForField("Location"));
			}


			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHOApprovalNo")) {
				clearAndSendKeys(HOApprovalNo, polInsIntFleetDMHEntity.getStringValueForField("HoApprovalno"));
			}


			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHOApprovalDate")) {
				hoApprovalDates = RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("HoApprovaldate"));
				clearAndEnterDate(HOApprovalDate,hoApprovalDates);

			}

			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAdditionalInformationIfAny")) {
				clearAndSendKeys(additionalInformationIfAnyTextArea, polInsIntFleetDMHEntity.getStringValueForField("AdditionalInformationIfAny"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigCategories")) {
				selectValueFromList(categoriesDropDown, polInsIntFleetDMHEntity.getStringValueForField("Categories"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVesselForcategoryA")) {
				selectValueFromList(typeOfVesselForcategoryADropDown, polInsIntFleetDMHEntity.getStringValueForField("TypeOfVesselForcategoryA"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPreFabricationDoneinYard")) {
				selectValueFromList(preFabricationDoneinYardDropDown, polInsIntFleetDMHEntity.getStringValueForField("PreFabricationDoneinYard"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLayingKeelDate")) {
				String datelayingkeel=RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("LayingKeelDate"));
				clearAndEnterDate(layingKeelDateTextField, datelayingkeel);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDateOfattachmentOfMachinery")) {
				String dateOfattachmentOfMachinery=RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("DateOfattachmentOfMachinery"));
				clearAndEnterDate(dateOfattachmentOfMachineryTextField, dateOfattachmentOfMachinery);
			}	

			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDateOfcompletion")) {
				String dateOfcompilation=RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("DateOfcompletion"));
				clearAndEnterDate(dateOfcompletionTextField, dateOfcompilation);
			}

			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBuildersName")) {
				clearAndSendKeys(buildersNameTextArea, polInsIntFleetDMHEntity.getStringValueForField("BuildersName"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAddress")) {
				clearAndSendKeys(addressTextArea, polInsIntFleetDMHEntity.getStringValueForField("Address"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigYardnumber")) {
				clearAndSendKeys(yardnumberTextField, polInsIntFleetDMHEntity.getStringValueForField("Yardnumber"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigConstructionAccount")) {
				clearAndSendKeys(constructionAccountTextField, polInsIntFleetDMHEntity.getStringValueForField("ConstructionAccount"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigConstructionAccountFor")) {
				clearAndSendKeys(constructionAccountForTextArea, polInsIntFleetDMHEntity.getStringValueForField("ConstructionAccountFor"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigConstructionPlace")) {
				clearAndSendKeys(constructionPlaceTextArea, polInsIntFleetDMHEntity.getStringValueForField("ConstructionPlace"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPolicyIssuedinFavorOf")) {
				selectValueFromList(policyIssuedinFavorOfDropDown, polInsIntFleetDMHEntity.getStringValueForField("PolicyIssuedinFavorOf"));
			}


			//Mayur_Product name= SB
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				selectValueFromList(typeOfVesselsDropDown, polInsIntFleetDMHEntity.getStringValueForField("TypeOfVessels"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigCategoryOfVessel")) {
				selectValueFromList(categoryOfVesselDropDown, polInsIntFleetDMHEntity.getStringValueForField("CategoryOfVessel"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVesselCodeSearch")) {
				fillVesselCodeSearch(polInsIntFleetDMHEntity);
			}
			//Mayur_Product name= SL
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRepairingLocation")) {
				clearAndSendKeys(repairingLocationTextArea, polInsIntFleetDMHEntity.getStringValueForField("RepairingLocation"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigNatureOfRepair")) {
				clearAndSendKeys(natureOfRepairTextArea, polInsIntFleetDMHEntity.getStringValueForField("NatureOfRepair"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLimitOfLiability")) {
				clearAndSendKeys(limitOfLiabilityTextField, polInsIntFleetDMHEntity.getStringValueForField("LimitOfLiability"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRateForLimitOfLiabilityInPercent")) {
				clearAndSendKeys(rateForLimitOfLiabilityInPercentTextField, polInsIntFleetDMHEntity.getStringValueForField("RateForLimitOfLiabilityInPercent"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextField, polInsIntFleetDMHEntity.getStringValueForField("Deductible"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigProvisionalAnnualTurnover")) {
				clearAndSendKeys(provisionalAnnualTurnoverTextField, polInsIntFleetDMHEntity.getStringValueForField("ProvisionalAnnualTurnover"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRateForProvisionalAnnualTurnoverInPercent")) {
				clearAndSendKeys(rateForProvisionalAnnualTurnoverInPercentTextField, polInsIntFleetDMHEntity.getStringValueForField("RateForProvisionalAnnualTurnoverInPercent"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				clearAndSendKeys(ownersDiscountTextField, polInsIntFleetDMHEntity.getStringValueForField("OwnersDiscount"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				clearAndSendKeys(deTariffDiscountTextField, polInsIntFleetDMHEntity.getStringValueForField("DeTariffDiscount"));
			}
			//Raj_Product name=VI
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVoyageVessel")) {
				selectValueFromList(typeOfVoyageVesselDropDown, polInsIntFleetDMHEntity.getStringValueForField("TypeOfVoyageVessel"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSubTypeOfOceanGoingVessel")) {
				selectValueFromList(subTypeOfOceanGoingVesselDropDown, polInsIntFleetDMHEntity.getStringValueForField("SubTypeOfOceanGoingVessel"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigIMONo")) {
				clearAndSendKeys(IMONoTextField, polInsIntFleetDMHEntity.getStringValueForField("IMONo"));
			}
			//CL-Yogesh
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigNatureOfCharterParty")) {
				selectValueFromList(natureOfCharterPartyDropDown, polInsIntFleetDMHEntity.getStringValueForField("NatureOfCharterParty"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVoyageFrom")) {
				clearAndSendKeys(voyageFromTextField, polInsIntFleetDMHEntity.getStringValueForField("VoyageFrom"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVoyageTo")) {
				clearAndSendKeys(voyageToTextField, polInsIntFleetDMHEntity.getStringValueForField("VoyageTo"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAgreementPeriodFrom")) {
				String agreementPeriodFrom=RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("AgreementPeriodFrom"));
				clearAndEnterDate(agreementPeriodFromTextField, agreementPeriodFrom);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAgreementPeriodTo")) {
				String agreementPeriodTo=RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("AgreementPeriodTo"));
				clearAndEnterDate(agreementPeriodToTextField, agreementPeriodTo);
			}
			//WR-Rajkumar--1st page

			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHullAndMachineryPolicy")) {
				selectValueFromList(hullAndMachineryPolicyDropDown, polInsIntFleetDMHEntity.getStringValueForField("HullAndMachineryPolicy"));
			}	
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHullAndMachineryPolicyNumber")) {
				clearAndSendKeys(hullAndMachineryPolicyNumberTextField, polInsIntFleetDMHEntity.getStringValueForField("HullAndMachineryPolicyNumber"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHullAndMachineryPolicyWithWhichCompany")) {
				clearAndSendKeys(hullAndMachineryPolicyWithWhichCompanyTextField, polInsIntFleetDMHEntity.getStringValueForField("HullAndMachineryPolicyWithWhichCompany"));
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVesselForWarRisk")) {
				selectValueFromList(typeOfVesselForWarRiskDropDown, polInsIntFleetDMHEntity.getStringValueForField("TypeOfVesselForWarRisk"));
			}
			
			// by arunkumar on 19-09-2018 for AB
			//start
			
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeofVesselsAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSubTypeofDredgerAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigYearofBuiltAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigCoverPlaceAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSafeAnchoragerequiredAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRTAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLightDisplacementTonnageLDTAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWTAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBollardHorsePowerBHPAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSpecialDiscountRateAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSumInsuredAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigdeductibleAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigNameoftheVesselAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVesselCodeAB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSpecialConditions1AB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSpecialConditions2AB")) {
				
				
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPlaceofAwaitingBreakupAB")) {
				
				
			}

			
			//end 
	
		}
		else if(polInsIntFleetDMHEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//digvijay cs           1st page
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigProjectDetails")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ProjectDetails"), fetchValueFromTextFields(projectDetailsTextArea), AssertionType.WARNING);
			}   



			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHOApprovalNo")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("HoApprovalno"), fetchValueFromTextFields(HOApprovalNo), AssertionType.WARNING);
			}   






			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHOApprovalDate")) {
				assertReference.assertEquals(
						RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("HoApprovaldate")),
						fetchValueFromTextFields(HOApprovalDate),AssertionType.WARNING);
			}




			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLocation")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Location"), fetchValueFromTextFields(locationTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAdditionalInformationIfAny")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("AdditionalInformationIfAny"), fetchValueFromTextFields(additionalInformationIfAnyTextArea), AssertionType.WARNING);
			}
			//****************BR(CHINTAN)****************


			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigCategories")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Categories"), fetchValueFromList(categoriesDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVessel")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("TypeOfVessel"), fetchValueFromList(typeOfVesselForcategoryADropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPreFabricationDoneinYard")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("PreFabricationDoneinYard"), fetchValueFromList(preFabricationDoneinYardDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLayingKeelDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("LayingKeelDate")) ,fetchValueFromTextFields(layingKeelDateTextField),AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDateOfattachmentOfMachinery")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("DateOfattachmentOfMachinery")) ,fetchValueFromTextFields(dateOfattachmentOfMachineryTextField),AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDateOfcompletion")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("DateOfcompletion")) ,fetchValueFromTextFields(dateOfcompletionTextField),AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBuildersName")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("BuildersName"), fetchValueFromTextFields(buildersNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAddress")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Address"), fetchValueFromTextFields(addressTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigYardnumber")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Yardnumber"), fetchValueFromTextFields(yardnumberTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigConstructionAccount")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ConstructionAccount"), fetchValueFromTextFields(constructionAccountTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigConstructionAccountFor")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ConstructionAccountFor"), fetchValueFromTextFields(constructionAccountForTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigConstructionPlace")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ConstructionPlace"), fetchValueFromTextFields(constructionPlaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPolicyIssuedinFavorOf")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("PolicyIssuedinFavorOf"), fetchValueFromList(policyIssuedinFavorOfDropDown), AssertionType.WARNING);

			}
			//Mayur_Product name= SB
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("TypeOfVessels"), fetchValueFromList(typeOfVesselsDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigCategoryOfVessel")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("CategoryOfVessel"), fetchValueFromList(categoryOfVesselDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVesselCode")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("VesselCode"), fetchValueFromTextFields(vesselCodeTextField), AssertionType.WARNING);
			}
			//Mayur_Product name= SL
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRepairingLocation")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("RepairingLocation"), fetchValueFromTextFields(repairingLocationTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigNatureOfRepair")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("NatureOfRepair"), fetchValueFromTextFields(natureOfRepairTextArea), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLimitOfLiability")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("LimitOfLiability"), fetchValueFromTextFields(limitOfLiabilityTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRateForLimitOfLiabilityInPercent")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("RateForLimitOfLiabilityInPercent"), fetchValueFromTextFields(rateForLimitOfLiabilityInPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigProvisionalAnnualTurnover")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ProvisionalAnnualTurnover"), fetchValueFromTextFields(provisionalAnnualTurnoverTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRateForProvisionalAnnualTurnoverInPercent")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("RateForProvisionalAnnualTurnoverInPercent"), fetchValueFromTextFields(rateForProvisionalAnnualTurnoverInPercentTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("OwnersDiscount"), fetchValueFromTextFields(ownersDiscountTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("DeTariffDiscount"), fetchValueFromTextFields(deTariffDiscountTextField), AssertionType.WARNING);
			}
			//Raj_Product name=VI
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVoyageVessel")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("TypeOfVoyageVessel"), fetchValueFromList(typeOfVoyageVesselDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSubTypeOfOceanGoingVessel")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("SubTypeOfOceanGoingVessel"), fetchValueFromList(subTypeOfOceanGoingVesselDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigIMONo")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("IMONo"), fetchValueFromTextFields(IMONoTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigNatureOfCharterParty")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("NatureOfCharterParty"), fetchValueFromList(natureOfCharterPartyDropDown), AssertionType.WARNING);
			}			
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVoyageFrom")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("VoyageFrom"), fetchValueFromTextFields(voyageFromTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVoyageTo")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("VoyageTo"), fetchValueFromTextFields(voyageToTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAgreementPeriodFrom")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("AgreementPeriodFrom")) ,fetchValueFromTextFields(agreementPeriodFromTextField),AssertionType.WARNING);
			}	
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAgreementPeriodTo")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntFleetDMHEntity.getStringValueForField("AgreementPeriodTo")) ,fetchValueFromTextFields(agreementPeriodToTextField),AssertionType.WARNING);
			}	
			//WR-Rajkumar--1st page
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHullAndMachineryPolicy")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("HullAndMachineryPolicy"), fetchValueFromList(hullAndMachineryPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHullAndMachineryPolicyNumber")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("HullAndMachineryPolicyNumber"), fetchValueFromTextFields(hullAndMachineryPolicyNumberTextField), AssertionType.WARNING);
			}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigHullAndMachineryPolicyWithWhichCompany")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("HullAndMachineryPolicyWithWhichCompany"), fetchValueFromTextFields(hullAndMachineryPolicyWithWhichCompanyTextField), AssertionType.WARNING);
			}

			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigTypeOfVesselForWarRisk")) {
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("TypeOfVesselForWarRisk"), fetchValueFromList(typeOfVesselForWarRiskDropDown), AssertionType.WARNING);
			}	
		}
	}

	public void navigateTobackAttributePage(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetails(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigForwardButton")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle);
		}
			if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigForwardButtonSL")){			
				click(forwardButton);
				switchToFrame("display");
			}
	}
	public void navigateToPolicy(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnSaveButton(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity){
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}



	public void clickOnFORWARDSaveButton(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity) throws InterruptedException{
		if (polInsIntFleetDMHEntity.getBooleanValueForField("button")){

			click(forwardButton);
			Thread.sleep(5000);
			click(saveButton);
			Thread.sleep(5000);
			switchToFrame("display");
		}
	}



	//Mayur_Product name= SB(VesselCode)
	public void selectVesselCode(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity) throws InterruptedException{
		vesselCodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntFleetDMHEntity.getStringValueForField("VesselCode")+"')]"),"Vessel Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(vesselCodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}

	//Mayur_Product name= SB(VesselCode)
	public void clickOnVesselCodeFindButton(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity) throws InterruptedException{
		if (polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVesselCodeClickButton")){
			click(vesselCodeClickButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Vessel List");
			}catch(Exception e){
				switchToWindow("Vessel List");
			}
		}
	}

	//Mayur_Product name= SB(VesselCode)
	public void fillVesselCodeSearch(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity) throws InterruptedException{
		clickOnVesselCodeFindButton(polInsIntFleetDMHEntity);

		if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVesselCode")){
			Thread.sleep(3000);
			clearAndSendKeys(vesselCodeOpenWindowTextField,polInsIntFleetDMHEntity.getStringValueForField("VesselCode") );	
		}
		if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigVesselName")){
			Thread.sleep(3000);
			clearAndSendKeys(vesselNameOpenWindowTextField,polInsIntFleetDMHEntity.getStringValueForField("VesselName") );	
		}
		if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBackButtons")){
			click(backButtons);
		}
		if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSearchButton")){
			Thread.sleep(3000);
			click(searchButton);
			selectVesselCode(polInsIntFleetDMHEntity);
		}
	}
	public void fillRiskDetailsforBR2DetailsMarineHull(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntFleetDMHEntity.getAction().equalsIgnoreCase("add") || polInsIntFleetDMHEntity.getAction().equalsIgnoreCase("edit")){
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMaterial")){

				selectValueFromList(materialDropDown,polInsIntFleetDMHEntity.getStringValueForField("Material") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLengthOverall")){

				clearAndSendKeys(lengthOverallTextField,polInsIntFleetDMHEntity.getStringValueForField("LengthOverall") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLengthBP")){

				clearAndSendKeys(lengthBPTextField,polInsIntFleetDMHEntity.getStringValueForField("LengthBP") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDraftTextField")){

				clearAndSendKeys(draftTextField,polInsIntFleetDMHEntity.getStringValueForField("DraftTextField") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBreadthMoulded")){

				clearAndSendKeys(breadthMouldedTextField,polInsIntFleetDMHEntity.getStringValueForField("BreadthMoulded") );	
			}
			
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDepthUptoMainDock")){

				clearAndSendKeys(DepthUptoMainDockTextField,polInsIntFleetDMHEntity.getStringValueForField("DepthUptoMainDock") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")){

				clearAndSendKeys(grossRegisteredTonnageGRTTextField,polInsIntFleetDMHEntity.getStringValueForField("GrossRegisteredTonnageGRT") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")){

				clearAndSendKeys(deadWeightTonnageDWTTextField,polInsIntFleetDMHEntity.getStringValueForField("DeadWeightTonnageDWT") );	
			}if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSumInsuredforHull")){

				clearAndSendKeys(sumInsuredforHullTextField,polInsIntFleetDMHEntity.getStringValueForField("SumInsuredforHull") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSumInsuredforMachinery")){

				clearAndSendKeys(sumInsuredforMachineryTextField,polInsIntFleetDMHEntity.getStringValueForField("SumInsuredforMachinery") );	
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigClaimRatio")){

				clearAndSendKeys(ClaimRatioTextField,polInsIntFleetDMHEntity.getStringValueForField("ClaimRatio") );	
				click(forwardButton);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeliveryDistanceNM")){

				clearAndSendKeys(DeliveryDistanceNMTextField,polInsIntFleetDMHEntity.getStringValueForField("DeliveryDistanceNM") );	
				click(forwardButton);
			}

		}				
		else if(polInsIntFleetDMHEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigMaterial")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("Material"), fetchValueFromTextFields(materialDropDown), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLengthOverall")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("LengthOverall"), fetchValueFromTextFields(lengthOverallTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigLengthBP")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("LengthBP"), fetchValueFromTextFields(lengthBPTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDraftTextField")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("DraftTextField"), fetchValueFromTextFields(draftTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigBreadthMoulded")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("BreadthMoulded"), fetchValueFromTextFields(breadthMouldedTextField), AssertionType.WARNING);
			}
			
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDepthUptoMainDock")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("DepthUptoMainDock"), fetchValueFromTextFields(DepthUptoMainDockTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigGrossRegisteredTonnageGRT")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("GrossRegisteredTonnageGRT"), fetchValueFromTextFields(grossRegisteredTonnageGRTTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeadWeightTonnageDWT")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("DeadWeightTonnageDWT"), fetchValueFromTextFields(deadWeightTonnageDWTTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSumInsuredforHull")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("SumInsuredforHull"), fetchValueFromTextFields(sumInsuredforHullTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigSumInsuredforMachinery")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("SumInsuredforMachinery"), fetchValueFromTextFields(sumInsuredforMachineryTextField), AssertionType.WARNING);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigClaimRatio")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("ClaimRatio"), fetchValueFromTextFields(ClaimRatioTextField), AssertionType.WARNING);
				click(forwardButton);
			}
			if(polInsIntFleetDMHEntity.getBooleanValueForField("ConfigDeliveryDistanceNM")){
				assertReference.assertEquals(polInsIntFleetDMHEntity.getStringValueForField("DeliveryDistanceNM"), fetchValueFromTextFields(DeliveryDistanceNMTextField), AssertionType.WARNING);				
			}
		}
			
		



	}
	public void fillandSubmitPolicyInsuredIntrestFleetDetailsMarineHull(PolInsIntFleetDMHEntity polInsIntFleetDMHEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntFleetDMHEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestFleetDetailsMarineHull(polInsIntFleetDMHEntity, assertReference);
			clickNextButtonPolicyAttributeCSPolicyDetails(polInsIntFleetDMHEntity);
			fillRiskDetailsforBR2DetailsMarineHull(polInsIntFleetDMHEntity, assertReference);
			clickOnSaveButton(polInsIntFleetDMHEntity);
			clickOnFORWARDSaveButton(polInsIntFleetDMHEntity);
			navigateTobackAttributePage(polInsIntFleetDMHEntity);
			navigateToPolicy(polInsIntFleetDMHEntity);
			navigateToAttribute(polInsIntFleetDMHEntity);
			navigateToInsuredInterest(polInsIntFleetDMHEntity);
			navigateToCoverage(polInsIntFleetDMHEntity);
			navigateToLoan(polInsIntFleetDMHEntity);
			navigateToClientDetails(polInsIntFleetDMHEntity);
			navigateToRelation(polInsIntFleetDMHEntity);
			navigateToPayment(polInsIntFleetDMHEntity);
			navigateToFollowup(polInsIntFleetDMHEntity);
			navigateToDocument(polInsIntFleetDMHEntity);
			navigateTobackAttributePage(polInsIntFleetDMHEntity);
			navigateToInsuredInterestAttributes(polInsIntFleetDMHEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntFleetDMHEntity);
			navigateToInsuredInterestRelations(polInsIntFleetDMHEntity);
			navigateToInsuredInterestPayments(polInsIntFleetDMHEntity);
		}
	}
}