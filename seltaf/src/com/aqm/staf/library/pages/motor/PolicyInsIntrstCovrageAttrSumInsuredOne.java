package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.LoadDiscntDetRuralEntity;
import com.aqm.staf.library.databin.SumInsforLibMotorEntity;

public class PolicyInsIntrstCovrageAttrSumInsuredOne extends BasePage{

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
	private PageElement doYouwanttoreduceTPPDcoverDropDown;
	private PageElement doyouwanttoincludePAcoverforNamedPersonDropDown;
	private PageElement doyouwishtoincludePACoverforPaidDriversDropDown;
	private PageElement doyouwanttoincludePAcoverforunnamedDropDown;
	private PageElement LLtopaiddriverscleaneropnunderWCADropDown;
	private PageElement LLtoEmployeesofInsuredtravelingDropDown;
	private PageElement LLtoSoldiersSailorsAirmenDriversDropDown;
	private PageElement  typeofCoverageDropDown;
	private PageElement nextButton;
	private PageElement backButton;

	private PageElement attchCoverageAttributesLinkTitle;
	private PageElement sumInsuredforPAcoverTextFeild;
	private PageElement LLunderWCAforcarriagemorethansixemployeesDropDown;
	private PageElement numberofAdditionalLLEmployeesTextFeild;
	private PageElement	LLtopersonsemployedforopnmaintDropDown;
	private PageElement	LLtoNonfarePayingPassengersOwnerofgoodsDropDown;
	private PageElement	LLtoNonfarePayingPassengersDropDown;
	private PageElement	douwishincludePACoverforPaidDriversCleanerConductorDropDown;
	private PageElement sumInsuredforPAtoOwnerDriverTextFeild;
	private PageElement douwanttoincludePAcoverforunnamedpersonDropDown;
	private PageElement declinedRiskConditionsTextField;
	private PageElement noOfPaidDriversTextField;
	private PageElement noOfCleanersTextField;
	private PageElement noOfConductorsTextField;
	private PageElement capitalSIForDriverCleanerConductorPerPersonTextField;
	private PageElement DoYouWantToIncludePACoverForUnnamedPersonDropDown;
	private PageElement lLtoPaidDriverAndOrConductorAndOrCleanerDropDown;
	private PageElement lLtoNonfarePayingPassengersDropDown;
	private PageElement typeOfCoverageTextField;
	//CV-F
	private PageElement basisOfRoadTransitDropDown;
	private PageElement noOfNamedDriversTextField;
	private PageElement totalTradeCertificateValueTextField;
	private PageElement llOfCooliesCleanersHelpersTextField;
	private PageElement llForNonFarePayingPassengerOfCoverageTextField;
	private PageElement privateUseExtnRequiredDropDown;
	private PageElement demonstrationRequiredDropDown;
	private PageElement drivingTutionExtnRequiredDropDown;
	private PageElement insertionOfIMT62DropDown;
	private PageElement loanOrHireOfVehiclesToCustomerByyMotorDealersDropDown;
	private PageElement noOfDaysOfHireTextField;
	private PageElement doYouWantToReduceTPPDDropDown;
	private PageElement numberOfLLPaidDriverTextField;
	private PageElement noOfNamedDrivers1TextField;
	private PageElement aGeTextField;
	private PageElement drivingLicenceNoTextField;
	private PageElement salaryOfTheDriverTextField;
	private PageElement tradeCertificateValue1TextField;
	//CV-G
	private PageElement estimatedWageBillTextField;
	private PageElement dateOfConstructionTextField;
	private PageElement useTextField;
	private PageElement areaOfOpenCarParksTextField;
	private PageElement noOfPremisesTextField;
	private PageElement twtypeofCoverageDropDown;




	public PolicyInsIntrstCovrageAttrSumInsuredOne(WebDriver driver, String pageName) {
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

		doYouwanttoreduceTPPDcoverDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Do You want to reduce TPPD cover to the statutory limit of Rs.6000')]/following::select[1]"),"Do You want to reduce TPPD cover to the statutory limit of Rs.6000 Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doyouwanttoincludePAcoverforNamedPersonDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you want to include PA cover for Named Person')]/following::select"),"Do you want to include PA cover for Named Person Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doyouwishtoincludePACoverforPaidDriversDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you wish to include PA Cover for Paid Drivers')]/following::select"),"Do you wish to include PA Cover for Paid Drivers Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		doyouwanttoincludePAcoverforunnamedDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you want to include PA cover for unnamed person/hirer/pillion passangers')]/following::select[1]"),"Do you want to include PA cover for unnamed person/hirer/pillion passangers Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLtopaiddriverscleaneropnunderWCADropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL to paid drivers,cleaner employed  for opn. and/or maint. of vehicle under WCA')]/following::select[1]"),"LL to paid drivers,cleaner employed  for opn. and/or maint. of vehicle under WCA Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLtoEmployeesofInsuredtravelingDropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL to Employees of Insured traveling and / or driving the Vehicle')]/following::select[1]"),"LL to Employees of Insured traveling and / or driving the Vehicle Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLtoSoldiersSailorsAirmenDriversDropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL to Soldiers/Sailors/Airmen employed as Drivers')]/following::select[1]"),"LL to Soldiers/Sailors/Airmen employed as Drivers Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeofCoverageDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Coverage","select")),"Type of Coverage Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nextButton= new PageElement(By.name("Next"),  "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"),"BAck Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredforPAcoverTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for PA cover')]/following::input[1]"),"Sum Insured for PA cover input", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLunderWCAforcarriagemorethansixemployeesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL under WCA,for carriage of more than six employees(excluding the Driver)')]/following::select[1]"),"LL under WCA,for carriage of more than six employees(excluding the Driver) Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		numberofAdditionalLLEmployeesTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Number of Additional  LL Employees')]/following::input[1]"),"Number of Additional  LL Employees input", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLtopersonsemployedforopnmaintDropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL to persons employed for opn and/or maint.and/or loading and/or unloading')]/following::select[1]"),"LL to persons employed for opn and/or maint.and/or loading and/or unloading Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLtoNonfarePayingPassengersOwnerofgoodsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL to Non-fare Paying Passengers,Owner of goods(Not Employees of the Insured)')]/following::select[1]"),"LL to Non-fare Paying Passengers,Owner of goods(Not Employees of the Insured) Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		LLtoNonfarePayingPassengersDropDown= new PageElement(By.xpath("//td//div[contains(text(),'LL to Non-fare Paying Passengers (Employee of Insurd but not Workmen under WCA)')]/following::select[1]"),"LL to Non-fare Paying Passengers (Employee of Insurd but not Workmen under WCA) Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		douwishincludePACoverforPaidDriversCleanerConductorDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you wish to include PA Cover for Paid Drivers, Cleaner, Conductor')]/following::select[1]"),"LL to Non-fare Paying Passengers (Employee of Insurd but not Workmen under WCA) Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sumInsuredforPAtoOwnerDriverTextFeild= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for PA to Owner Driver')]/following::input[1]"),"Sum Insured for PA to Owner Driver input", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		douwanttoincludePAcoverforunnamedpersonDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you want to include PA cover for unnamed person')]/following::select[1]"),"Do you want to include PA cover for unnamed person Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);

		noOfPaidDriversTextField=new PageElement(By.name("propValues12"),"No of Paid Drivers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noOfCleanersTextField=new PageElement(By.name("propValues13"),"No of Cleaners", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noOfConductorsTextField=new PageElement(By.name("propValues14"),"No Of Conductors", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		capitalSIForDriverCleanerConductorPerPersonTextField=new PageElement(By.name("propValues15"),"Capital SI for Driver,Cleaner,Conductor per Person", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		DoYouWantToIncludePACoverForUnnamedPersonDropDown=new PageElement(By.name("propValues16"),"Do you want to include PA cover for unnamed person", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		lLtoPaidDriverAndOrConductorAndOrCleanerDropDown=new PageElement(By.name("propValues19"),"LL to paid driver and/or conductor and/or cleaner employed for operation", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		lLtoNonfarePayingPassengersDropDown=new PageElement(By.name("propValues23"),"LL to Non-fare Paying Passengers", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		typeOfCoverageTextField=new PageElement(By.name("propValues25"),"Type of Coverage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		twtypeofCoverageDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Coverage","select")),"Type of Coverage", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		declinedRiskConditionsTextField=new PageElement(By.name("propValues26"),"Declined Risk Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//CV-F
		basisOfRoadTransitDropDown=new PageElement(By.name("propValues1"),"Basis of Road Transit", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		noOfNamedDriversTextField=new PageElement(By.name("propValues35"),"No of named drivers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalTradeCertificateValueTextField=new PageElement(By.name("propValues111"),"Total Trade Certificate value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		llOfCooliesCleanersHelpersTextField=new PageElement(By.name("propValues112"),"No of Paid Drivers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		llForNonFarePayingPassengerOfCoverageTextField=new PageElement(By.name("propValues113"),"LL for Non fare paying passenger", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		privateUseExtnRequiredDropDown=new PageElement(By.xpath("propValues114"),"Do you want to include PA cover for unnamed person", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		demonstrationRequiredDropDown=new PageElement(By.xpath("propValues115"),"Demonstration required", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		drivingTutionExtnRequiredDropDown=new PageElement(By.xpath("propValues116"),"Driving tuition extn. Required", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		insertionOfIMT62DropDown=new PageElement(By.xpath("propValues117"),"Insertion of IMT 62", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loanOrHireOfVehiclesToCustomerByyMotorDealersDropDown=new PageElement(By.xpath("propValues118"),"Loan or Hire of vehicles to customer by motor dealers", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		noOfDaysOfHireTextField=new PageElement(By.name("propValues119"),"No of days of hire", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouWantToReduceTPPDDropDown=new PageElement(By.xpath("propValues121"),"Do You want to reduce TPPD cover to the statutory limit of Rs.6000", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		numberOfLLPaidDriverTextField=new PageElement(By.name("propValues122"),"Number of LL paid driver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//F
		noOfNamedDrivers1TextField=new PageElement(By.xpath("//textarea[@name='propValues36']"),"No of named drivers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		aGeTextField=new PageElement(By.name("propValues38"),"Age", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		drivingLicenceNoTextField=new PageElement(By.name("propValues39"),"Driving Licence No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		salaryOfTheDriverTextField=new PageElement(By.name("propValues40"),"Salary OF Driving Licence", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		tradeCertificateValue1TextField=new PageElement(By.name("propValues37"),"Trade Certificate Value1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//CV-G
		estimatedWageBillTextField=new PageElement(By.name("propValues2"),"Estimated WageBill", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfConstructionTextField=new PageElement(By.name("propValues3"),"Date Of Construction", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		useTextField=new PageElement(By.name("propValues4"),"Use", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		areaOfOpenCarParksTextField=new PageElement(By.name("propValues5"),"Area Of Open Car Parks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		noOfPremisesTextField=new PageElement(By.name("propValues6"),"No Of Premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);


	}
	public void fillSumInsuredforLibMotor(SumInsforLibMotorEntity sumInsforLibMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(sumInsforLibMotorEntity.getAction().equalsIgnoreCase("add") || sumInsforLibMotorEntity.getAction().equalsIgnoreCase("edit")){

			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoYouwanttoreduceTPPDcover")) {
				selectValueFromList(doYouwanttoreduceTPPDcoverDropDown, sumInsforLibMotorEntity.getStringValueForField("DoYouwanttoreduceTPPDcover"));
			}
			if(sumInsforLibMotorEntity.getBooleanValueForField("ConfigSumInsuredforPAtoOwnerDriver")) {
				clearAndSendKeys(sumInsuredforPAtoOwnerDriverTextFeild,sumInsforLibMotorEntity.getStringValueForField("SumInsuredforPAtoOwnerDriver"));
			}
			if(sumInsforLibMotorEntity.getBooleanValueForField("ConfigSumInsuredforPAcover")) {
				clearAndSendKeys(sumInsuredforPAcoverTextFeild,sumInsforLibMotorEntity.getStringValueForField("SumInsuredforPAcover"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLunderWCAforcarriagemorethansixemployees")) {
				selectValueFromList(LLunderWCAforcarriagemorethansixemployeesDropDown, sumInsforLibMotorEntity.getStringValueForField("LLunderWCAforcarriagemorethansixemployees"));
			}
			if(sumInsforLibMotorEntity.getBooleanValueForField("ConfigNumberofAdditionalLLEmployees")) {
				clearAndSendKeys(numberofAdditionalLLEmployeesTextFeild,sumInsforLibMotorEntity.getStringValueForField("NumberofAdditionalLLEmployees"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtopersonsemployedforopnmaint")) {
				selectValueFromList(LLtopersonsemployedforopnmaintDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtopersonsemployedforopnmaint"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoNonfarePayingPassengersOwnerofgoods")) {
				selectValueFromList(LLtoNonfarePayingPassengersOwnerofgoodsDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtoNonfarePayingPassengersOwnerofgoods"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoNonfarePayingPassengers")) {
				selectValueFromList(LLtoNonfarePayingPassengersDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtoNonfarePayingPassengers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDouwishincludePACoverforPaidDriversCleanerConductor")) {
				selectValueFromList(douwishincludePACoverforPaidDriversCleanerConductorDropDown, sumInsforLibMotorEntity.getStringValueForField("DouwishincludePACoverforPaidDriversCleanerConductor"));
			}



			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoyouwanttoincludePAcoverforNamedPerson")) {
				selectValueFromList(doyouwanttoincludePAcoverforNamedPersonDropDown, sumInsforLibMotorEntity.getStringValueForField("DoyouwanttoincludePAcoverforNamedPerson"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoyouwishtoincludePACoverforPaidDrivers")) {
				selectValueFromList(doyouwishtoincludePACoverforPaidDriversDropDown, sumInsforLibMotorEntity.getStringValueForField("DoyouwishtoincludePACoverforPaidDrivers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoyouwanttoincludePAcoverforunnamedpersonhirerpillionpassangers")) {
				selectValueFromList(doyouwanttoincludePAcoverforunnamedDropDown, sumInsforLibMotorEntity.getStringValueForField("DoyouwanttoincludePAcoverforunnamedpersonhirerpillionpassangers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtopaiddriverscleaneropnunderWCA")) {
				selectValueFromList(LLtopaiddriverscleaneropnunderWCADropDown, sumInsforLibMotorEntity.getStringValueForField("LLtopaiddriverscleaneropnunderWCA"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoEmployeesofInsuredtraveling")) {
				selectValueFromList(LLtoEmployeesofInsuredtravelingDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtoEmployeesofInsuredtraveling"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoSoldiersSailorsAirmenDrivers")) {
				selectValueFromList(LLtoSoldiersSailorsAirmenDriversDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtoSoldiersSailorsAirmenDrivers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTypeOfCoverage")) {
				selectValueFromList(typeofCoverageDropDown, sumInsforLibMotorEntity.getStringValueForField("TypeOfCoverage"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTwTypeOfCoverage")) {
				selectValueFromList(twtypeofCoverageDropDown, sumInsforLibMotorEntity.getStringValueForField("TwTypeOfCoverage"));
			}

			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDouwanttoincludePAcoverforunnamedperson")) {
				selectValueFromList(douwanttoincludePAcoverforunnamedpersonDropDown, sumInsforLibMotorEntity.getStringValueForField("DouwanttoincludePAcoverforunnamedperson"));
			}
			//
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfPaidDrivers")) {
				clearAndSendKeys(noOfPaidDriversTextField, sumInsforLibMotorEntity.getStringValueForField("NoOfPaidDrivers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfCleaners")) {
				clearAndSendKeys(noOfCleanersTextField, sumInsforLibMotorEntity.getStringValueForField("NoOfCleaners"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfConductors")) {
				clearAndSendKeys(noOfConductorsTextField, sumInsforLibMotorEntity.getStringValueForField("NoOfConductors"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigCapitalSIForDriverCleanerConductorPerPerson")) {
				clearAndSendKeys(capitalSIForDriverCleanerConductorPerPersonTextField, sumInsforLibMotorEntity.getStringValueForField("CapitalSIForDriverCleanerConductorPerPerson"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoYouWantToIncludePACoverForUnnamedPerson")) {
				selectValueFromList(DoYouWantToIncludePACoverForUnnamedPersonDropDown, sumInsforLibMotorEntity.getStringValueForField("DoYouWantToIncludePACoverForUnnamedPerson"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoPaidDriverAndOrConductorAndOrCleaner")) {
				selectValueFromList(lLtoPaidDriverAndOrConductorAndOrCleanerDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtoPaidDriverAndOrConductorAndOrCleaner"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoNonfarePayingPassengers")) {
				selectValueFromList(lLtoNonfarePayingPassengersDropDown, sumInsforLibMotorEntity.getStringValueForField("LLtoNonfarePayingPassengers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDeclinedRiskConditions")) {
				clearAndSendKeys(declinedRiskConditionsTextField, sumInsforLibMotorEntity.getStringValueForField("DeclinedRiskConditions"));
			}
			//CV-F
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigBasisOfRoadTransit")) {
				selectValueFromList(basisOfRoadTransitDropDown, sumInsforLibMotorEntity.getStringValueForField("BasisOfRoadTransit"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfNamedDrivers")) {
				clearAndSendKeys(noOfNamedDriversTextField, sumInsforLibMotorEntity.getStringValueForField("NoOfNamedDrivers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTotalTradeCertificateValue")) {
				SelectValueAndTypeForHomeTextField(totalTradeCertificateValueTextField, sumInsforLibMotorEntity.getStringValueForField("TotalTradeCertificateValue"));
				//clearAndSendKeys(totalTradeCertificateValueTextField, sumInsforLibMotorEntity.getStringValueForField("TotalTradeCertificateValue"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLlOfCooliesCleanersHelpers")) {
				clearAndSendKeys(llOfCooliesCleanersHelpersTextField, sumInsforLibMotorEntity.getStringValueForField("LlOfCooliesCleanersHelpers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLlForNonFarePayingPassengerOfCoverage")) {
				clearAndSendKeys(llForNonFarePayingPassengerOfCoverageTextField, sumInsforLibMotorEntity.getStringValueForField("LlForNonFarePayingPassengerOfCoverage"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigPrivateUseExtnRequired")) {
				selectValueFromList(privateUseExtnRequiredDropDown, sumInsforLibMotorEntity.getStringValueForField("PrivateUseExtnRequired"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDemonstrationRequired")) {
				selectValueFromList(demonstrationRequiredDropDown, sumInsforLibMotorEntity.getStringValueForField("DemonstrationRequired"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDrivingTutionExtnRequired")) {
				selectValueFromList(drivingTutionExtnRequiredDropDown, sumInsforLibMotorEntity.getStringValueForField("DrivingTutionExtnRequired"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigInsertionOfIMT62")) {
				selectValueFromList(insertionOfIMT62DropDown, sumInsforLibMotorEntity.getStringValueForField("InsertionOfIMT62"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLoanOrHireOfVehiclesToCustomerByyMotorDealers")) {
				selectValueFromList(loanOrHireOfVehiclesToCustomerByyMotorDealersDropDown, sumInsforLibMotorEntity.getStringValueForField("LoanOrHireOfVehiclesToCustomerByyMotorDealers"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfDaysOfHire")) {
				clearAndSendKeys(noOfDaysOfHireTextField, sumInsforLibMotorEntity.getStringValueForField("NoOfDaysOfHire"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoYouWantToReduceTPPD")) {
				selectValueFromList(doYouWantToReduceTPPDDropDown, sumInsforLibMotorEntity.getStringValueForField("DoYouWantToReduceTPPD"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNumberOfLLPaidDriver")) {
				clearAndSendKeys(numberOfLLPaidDriverTextField, sumInsforLibMotorEntity.getStringValueForField("NumberOfLLPaidDriver"));
			}
			//
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNamedDrivers1")) {
				clearAndSendKeys(noOfNamedDrivers1TextField, sumInsforLibMotorEntity.getStringValueForField("NamedDrivers1"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigAge")) {
				clearAndSendKeys(aGeTextField, sumInsforLibMotorEntity.getStringValueForField("Age"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDrivingLicenceNo")) {
				clearAndSendKeys(drivingLicenceNoTextField, sumInsforLibMotorEntity.getStringValueForField("DrivingLicenceNo"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigSalaryOfTheDriver")) {
				clearAndSendKeys(salaryOfTheDriverTextField, sumInsforLibMotorEntity.getStringValueForField("SalaryOfTheDriver"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTradeCertificateValue1")) {
				SelectValueAndTypeForTextField(tradeCertificateValue1TextField, sumInsforLibMotorEntity.getStringValueForField("TradeCertificateValue1"));
				//clearAndSendKeys(tradeCertificateValue1TextField, sumInsforLibMotorEntity.getStringValueForField("TradeCertificateValue1"));
			}
			//CV-G
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigEstimatedWageBill")) {
				clearAndSendKeys(estimatedWageBillTextField, sumInsforLibMotorEntity.getStringValueForField("EstimatedWageBill"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDateOfConstruction")) {
				String RegistrationDate=RandomCodeGenerator.dateGenerator(sumInsforLibMotorEntity.getStringValueForField("DateOfConstruction"));
				clearAndEnterDate(dateOfConstructionTextField, RegistrationDate);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigUseText")) {
				clearAndSendKeys(useTextField, sumInsforLibMotorEntity.getStringValueForField("UseText"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigAreaOfOpenCarParks")) {
				clearAndSendKeys(areaOfOpenCarParksTextField, sumInsforLibMotorEntity.getStringValueForField("AreaOfOpenCarParks"));
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfPremises")) {
				clearAndSendKeys(noOfPremisesTextField, sumInsforLibMotorEntity.getStringValueForField("NoOfPremises"));
			}
		}
		else if(sumInsforLibMotorEntity.getAction().equalsIgnoreCase("verify")){
			if(sumInsforLibMotorEntity.getBooleanValueForField("ConfigSumInsuredforPAcover")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("SumInsuredforPAcover"), fetchValueFromTextFields(sumInsuredforPAcoverTextFeild), AssertionType.WARNING);
			}
			if(sumInsforLibMotorEntity.getBooleanValueForField("ConfigNumberofAdditionalLLEmployees")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NumberofAdditionalLLEmployees"), fetchValueFromTextFields(numberofAdditionalLLEmployeesTextFeild), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtopersonsemployedforopnmaint")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtopersonsemployedforopnmaint"), fetchValueFromList(LLtopersonsemployedforopnmaintDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoNonfarePayingPassengersOwnerofgoods")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtoNonfarePayingPassengersOwnerofgoods"), fetchValueFromList(LLtoNonfarePayingPassengersOwnerofgoodsDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoNonfarePayingPassengers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtoNonfarePayingPassengers"), fetchValueFromList(LLtoNonfarePayingPassengersDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDouwishincludePACoverforPaidDriversCleanerConductor")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DouwishincludePACoverforPaidDriversCleanerConductor"), fetchValueFromList(douwishincludePACoverforPaidDriversCleanerConductorDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoYouwanttoreduceTPPDcover")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DoYouwanttoreduceTPPDcover"), fetchValueFromList(doYouwanttoreduceTPPDcoverDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoyouwanttoincludePAcoverforNamedPerson")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DoyouwanttoincludePAcoverforNamedPerson"), fetchValueFromList(doyouwanttoincludePAcoverforNamedPersonDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoyouwishtoincludePACoverforPaidDrivers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DoyouwishtoincludePACoverforPaidDrivers"), fetchValueFromList(doyouwishtoincludePACoverforPaidDriversDropDown), AssertionType.WARNING);
			}

			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoyouwanttoincludePAcoverforunnamedpersonhirerpillionpassangers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DoyouwanttoincludePAcoverforunnamedpersonhirerpillionpassangers"), fetchValueFromList(doyouwanttoincludePAcoverforunnamedDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtopaiddriverscleaneropnunderWCA")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtopaiddriverscleaneropnunderWCA"), fetchValueFromList(LLtopaiddriverscleaneropnunderWCADropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoEmployeesofInsuredtraveling")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtoEmployeesofInsuredtraveling"), fetchValueFromList(LLtoEmployeesofInsuredtravelingDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoSoldiersSailorsAirmenDrivers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtoSoldiersSailorsAirmenDrivers"), fetchValueFromList(LLtoSoldiersSailorsAirmenDriversDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfPaidDrivers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NoOfPaidDrivers"), fetchValueFromTextFields(noOfPaidDriversTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfCleaners")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NoOfCleaners"), fetchValueFromTextFields(noOfCleanersTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfConductors")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NoOfConductors"), fetchValueFromTextFields(noOfConductorsTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigCapitalSIForDriverCleanerConductorPerPerson")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("CapitalSIForDriverCleanerConductorPerPerson"), fetchValueFromTextFields(capitalSIForDriverCleanerConductorPerPersonTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoYouWantToIncludePACoverForUnnamedPerson")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DoYouwanttoreduceTPPDcover"), fetchValueFromList(DoYouWantToIncludePACoverForUnnamedPersonDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoPaidDriverAndOrConductorAndOrCleaner")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtoPaidDriverAndOrConductorAndOrCleaner"), fetchValueFromList(lLtoPaidDriverAndOrConductorAndOrCleanerDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLLtoNonfarePayingPassengers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LLtoNonfarePayingPassengers"), fetchValueFromList(lLtoNonfarePayingPassengersDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTypeOfCoverage")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("TypeOfCoverage"), fetchValueFromList(typeOfCoverageTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTypeOfPCCoverage")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("TypeOfPCCoverage"), fetchValueFromList(twtypeofCoverageDropDown), AssertionType.WARNING);
			}

			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTwTypeOfCoverage")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("TwTypeOfCoverage"), fetchValueFromList(twtypeofCoverageDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDeclinedRiskConditions")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DeclinedRiskConditions"), fetchValueFromFields(declinedRiskConditionsTextField), AssertionType.WARNING);
			}
			//CV-F
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigBasisOfRoadTransit")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("BasisOfRoadTransit"), fetchValueFromFields(basisOfRoadTransitDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfNamedDrivers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NoOfNamedDrivers"), fetchValueFromFields(noOfNamedDriversTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTotalTradeCertificateValue")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("TotalTradeCertificateValue"), fetchValueFromFields(totalTradeCertificateValueTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLlOfCooliesCleanersHelpers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LlOfCooliesCleanersHelpers"), fetchValueFromFields(llOfCooliesCleanersHelpersTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLlForNonFarePayingPassengerOfCoverage")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LlForNonFarePayingPassengerOfCoverage"), fetchValueFromFields(llForNonFarePayingPassengerOfCoverageTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDemonstrationRequired")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DemonstrationRequired"), fetchValueFromFields(privateUseExtnRequiredDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigPrivateUseExtnRequired")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("PrivateUseExtnRequired"), fetchValueFromFields(privateUseExtnRequiredDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDrivingTutionExtnRequired")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DrivingTutionExtnRequired"), fetchValueFromFields(drivingTutionExtnRequiredDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigInsertionOfIMT62")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("InsertionOfIMT62"), fetchValueFromFields(insertionOfIMT62DropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigLoanOrHireOfVehiclesToCustomerByyMotorDealers")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("LoanOrHireOfVehiclesToCustomerByyMotorDealers"), fetchValueFromFields(loanOrHireOfVehiclesToCustomerByyMotorDealersDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfDaysOfHire")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NoOfDaysOfHire"), fetchValueFromFields(noOfDaysOfHireTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDoYouWantToReduceTPPD")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DoYouWantToReduceTPPD"), fetchValueFromFields(doYouWantToReduceTPPDDropDown), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNumberOfLLPaidDriver")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NumberOfLLPaidDriver"), fetchValueFromFields(numberOfLLPaidDriverTextField), AssertionType.WARNING);
			}
			//
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNamedDrivers1")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NamedDrivers1"), fetchValueFromFields(noOfNamedDrivers1TextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigAge")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("Age"), fetchValueFromFields(aGeTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigDrivingLicenceNo")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("DrivingLicenceNo"), fetchValueFromFields(drivingLicenceNoTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigSalaryOfTheDriver")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("SalaryOfTheDriver"), fetchValueFromFields(salaryOfTheDriverTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigTradeCertificateValue1")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("TradeCertificateValue1"), fetchValueFromFields(estimatedWageBillTextField), AssertionType.WARNING);
			}
			//CV-G
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigEstimatedWageBill")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("EstimatedWageBill"), fetchValueFromFields(noOfNamedDrivers1TextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigUseText")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("UseText"), fetchValueFromFields(useTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigAreaOfOpenCarParks")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("AreaOfOpenCarParks"), fetchValueFromFields(areaOfOpenCarParksTextField), AssertionType.WARNING);
			}
			if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNoOfPremises")) {
				assertReference.assertEquals(sumInsforLibMotorEntity.getStringValueForField("NoOfPremises"), fetchValueFromFields(noOfPremisesTextField), AssertionType.WARNING);
			}
		}
	}

	public void clickNextButton(SumInsforLibMotorEntity sumInsforLibMotorEntity) {
		if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			attchCoverageAttributesLinkTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+sumInsforLibMotorEntity.getStringValueForField("PolicyInsuredCoverageAttributesTitle")+"')]"), "Policy Insured Coverage Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attchCoverageAttributesLinkTitle);


		}
	}

	public void clickBackButton(SumInsforLibMotorEntity sumInsforLibMotorEntity) {
		if (sumInsforLibMotorEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitSumInsuredforLibMotorEntity(SumInsforLibMotorEntity sumInsforLibMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(sumInsforLibMotorEntity.getConfigExecute())){
			switchToFrame("display");
			fillSumInsuredforLibMotor(sumInsforLibMotorEntity, assertReference);
			clickNextButton(sumInsforLibMotorEntity);
			clickBackButton(sumInsforLibMotorEntity);
		}

	}

}
