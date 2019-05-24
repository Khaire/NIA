package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.PremiumRatePFMiscEntity;

public class PolicyInsuredIntrestAttributePremiumRateForPFMisc extends BasePage{
	// Policy Page Links
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
	// policy Home page Tab Titles
	private PageElement policyTabTitle;
	private PageElement attributeTabTitle;
	private PageElement memberPageTitle;
	private PageElement coverageTabTitle;
	private PageElement clientDetailsTabTitle;
	private PageElement relationsTabTitle;
	private PageElement paymentsTabTitle;
	private PageElement followupTabTitle;
	private PageElement documentTabTitle;
	private PageElement insuredInterestTabTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	private PageElement riskDetailsPageTitle;
	private PageElement	policyNoLabel;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	//Type Of Proffesion On Risk Detail Page DropDown  :    Accountant/Tax Consultant/Management Consultant
	private PageElement	premiumRatePerMilliTextField;
	private PageElement	noOfQualifiedPersonsTextField;
	private PageElement	loadingForQualifiedPersonsTextField;
	private PageElement	noOfAdministrativeStaffTextField;
	private PageElement	loadingForAdministrativeStaffTextField;
	private PageElement	noOfApprenticesTextField;
	private PageElement	loadingForApprenticesTextField;
	private PageElement	totalAnnualFeesWagesPayableTextField;
	private PageElement	estimatedFeesForProposedYearTextField;
	private PageElement	compulsoryExcessTextField;
	private PageElement	minimumPremiumTextField;
	private PageElement	geographicalAreaOfOperationTextArea;
	private PageElement	detailsOfOutsidePersonnelEngagedTextArea;
	private PageElement	groupDiscountPercentTextField;
	private PageElement serialNoTextField;
	private PageElement yearOfTheFeesTextField;
	private PageElement yearFeesTextField;
	private PageElement totalAnnualFeesTextField; 
	private PageElement openButton;
	private PageElement addButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	private PageElement deleteButtonOfNextWindow;
	//Doctor
	private PageElement optionOfServiceDoctorDropDown;
	private PageElement classificationOfDoctorDropDown;
	private PageElement branchOfMedicineDropDown;
	private PageElement qualificationAndYearTextArea;
	private PageElement medicalRegistrationNumberTextField;
	private PageElement registrationYearTextField;
	private PageElement clinicAddressTextArea;	
	private PageElement membershipNoTextField;
	private PageElement nameOfAssociationCouncilTextArea;		
	private PageElement addressOfAssociationCouncilTextArea;	
	private PageElement detailsOfFacilitiesTextArea;	
	private PageElement avgNoOfPatientsTextField;
	private PageElement unqualifiedStaffCoveredDropDown;	
	private PageElement noOfMemberTextField;
	private PageElement excessAmountTextField;	
	//Engineer/Architect/Interior Decorator
	//Medical Establishment
	private PageElement categoryOfEstablishmentDropDown;
	private PageElement detailsOfEstablishmentTextArea;
	private PageElement detailsOfStaffTextArea;	
	private PageElement radioactiveTreatmentOtherThanXRayAvailableDropDown;
	private PageElement detailsOfRadioactiveTreatmentTextField;
	private PageElement noOfOutPatientLastYearTextField;
	private PageElement noOfInPatientGeneralLastYearTextField;
	private PageElement noOfInPatientSurgicalLastYearTextField;
	private PageElement totalNoOfInPatientLastYearTextField;
	private PageElement noOfOutPatientTextField;
	private PageElement noOfInPatientGeneralTextField;
	private PageElement noOfInPatientSurgicalTextField;
	private PageElement totalNoOfInPatientTextField;
	private PageElement noOfBedsTextField;
	private PageElement detailsOfOwnersPartnersDirectorsTextArea;
	private PageElement typeOfServiceSpecializationDropDown;
	private PageElement noOfDoctorTextField; 
	private PageElement noOfEmployeeTextField;
	private PageElement openButton1;
	//Others
	private PageElement professionalCategoryTextArea;	
	private PageElement detailsOfOperationsTextArea;	
	private PageElement forwardButton;
	private PageElement previousButton;
	private PageElement backButton;

	public PolicyInsuredIntrestAttributePremiumRateForPFMisc(WebDriver driver, String pageName){
		super(driver,pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), " Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']/b"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskDetailsPageTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Risk Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0042", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRatePerMilliTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate (per mili)", "input")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfQualifiedPersonsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Qualified Persons", "input")), "No of Qualified Persons TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingForQualifiedPersonsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading for Qualified Persons", "input")), "Loading for Qualified Persons TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfAdministrativeStaffTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Administrative Staff", "input")), "No of Administrative Staff TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingForAdministrativeStaffTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading for Administrative Staff", "input")), "Loading for Administrative Staff TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfApprenticesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Apprentices", "input")), "No of Apprentices TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingForApprenticesTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading for Apprentices", "input")), "Loading for Apprentices TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAnnualFeesWagesPayableTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Annual fees/wages payable", "input")), "Total Annual fees/wages payable TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedFeesForProposedYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated Fees for proposed year", "input")), "Estimated Fees for proposed year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		compulsoryExcessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compulsory Excess", "input")), "Compulsory Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		minimumPremiumTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Minimum Premium", "input")), "Minimum Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalAreaOfOperationTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Geographical Area of Operation", "textarea")), "Geographical Area of Operation TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfOutsidePersonnelEngagedTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Outside personnel engaged", "textarea")), "Details of Outside personnel engaged TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupDiscountPercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Group Discount (%)", "input")), "Group Discount (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoTextField=new PageElement(By.name("slNo0"), "Serial No. TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearOfTheFeesTextField=new PageElement(By.name("Data_253210819012011_0"), "Year of the Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		yearFeesTextField=new PageElement(By.name("Data_253210919012011_0"), "Year Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalAnnualFeesTextField=new PageElement(By.name("Data_253211019012011_0"), "Total Annual Fees TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openButton=new PageElement(By.name("propValues8"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButtonOfNextWindow=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow=new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButtonOfNextWindow=new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Doctor
		optionOfServiceDoctorDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Option of Service (Doctor)","select")),"Option of Service (Doctor) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		classificationOfDoctorDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Classification of Doctor","select")),"Classification of Doctor DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		branchOfMedicineDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Branch of Medicine","select")),"Branch of Medicine DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		qualificationAndYearTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Qualification and Year", "input")), "Qualification and Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalRegistrationNumberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Medical Registration Number", "input")), "Medical Registration Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		registrationYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Registration Year", "input")), "Registration Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clinicAddressTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Clinic Address", "textarea")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		membershipNoTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "input")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfAssociationCouncilTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "textarea")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		addressOfAssociationCouncilTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "textarea")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsOfFacilitiesTextArea	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "input")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		avgNoOfPatientsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "input")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		unqualifiedStaffCoveredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Economic Zone","select")),"Special Economic Zone DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfMemberTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "input")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate per milli", "input")), "Premium Rate per milli TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Medical Establishment
		categoryOfEstablishmentDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Category of Establishment","select")),"Category of Establishment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfEstablishmentTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Establishment", "textarea")), "Details of Establishment TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfStaffTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Staff", "textarea")), "Details of Staff TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		radioactiveTreatmentOtherThanXRayAvailableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Radioactive Treatment (Other Than X-Ray) available?","select")),"Radioactive Treatment (Other Than X-Ray) available? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfRadioactiveTreatmentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Radioactive Treatment", "input")), "Details of Radioactive Treatment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfOutPatientLastYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Out Patient - Last Year", "input")), "No of Out Patient - Last Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfInPatientGeneralLastYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of In Patient (General) - Last Year", "input")), "No of In Patient (General) - Last Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfInPatientSurgicalLastYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of In Patient (Surgical) - Last Year", "input")), "No of In Patient (Surgical) - Last Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNoOfInPatientLastYearTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total No of In Patient - Last Year", "input")), "Total No of In Patient - Last Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfOutPatientTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Out Patient", "input")), "No of Out Patient TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfInPatientGeneralTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of In Patient (General)", "input")), "No of In Patient (General) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfInPatientSurgicalTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of In Patient (Surgical)", "input")), "No of In Patient (Surgical) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNoOfInPatientTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total No of In Patient", "input")), "Total No of In Patient TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfBedsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Beds", "input")), "No of Beds TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfOwnersPartnersDirectorsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Owners/Partners/Directors", "textarea")), "Details of Owners/Partners/Directors TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfServiceSpecializationDropDown=new PageElement(By.name("Data_253199919012011_0"),"Category of Establishment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfDoctorTextField=new PageElement(By.name("Data_253202119012011_0"), "No of Out Patient - Last Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfEmployeeTextField=new PageElement(By.name("Data_253202219012011_0"), "No of Out Patient - Last Year TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		openButton1=new PageElement(By.name("propValues5"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		//Others:
		professionalCategoryTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Professional Category", "textarea")), "Professional Category TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsOfOperationsTextArea	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Operations", "textarea")), "Details of Operations TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolInsIntrAttrPremiumRateDetailsForPF (PremiumRatePFMiscEntity premiumRatePFMiscEntity, CustomAssert assertReference)throws InterruptedException{
		if(premiumRatePFMiscEntity.getAction().equalsIgnoreCase("add") || premiumRatePFMiscEntity.getAction().equalsIgnoreCase("edit")){


			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPremiumRatePerMilli")) {
				clearAndSendKeys(premiumRatePerMilliTextField, premiumRatePFMiscEntity.getStringValueForField("PremiumRatePerMilli"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfQualifiedPersons")) {
				clearAndSendKeys(noOfQualifiedPersonsTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfQualifiedPersons"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigLoadingForQualifiedPersons")) {
				clearAndSendKeys(loadingForQualifiedPersonsTextField, premiumRatePFMiscEntity.getStringValueForField("LoadingForQualifiedPersons"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfAdministrativeStaff")) {
				clearAndSendKeys(noOfAdministrativeStaffTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfAdministrativeStaff"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigLoadingForAdministrativeStaff")) {
				clearAndSendKeys(loadingForAdministrativeStaffTextField, premiumRatePFMiscEntity.getStringValueForField("LoadingForAdministrativeStaff"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfApprentices")) {
				clearAndSendKeys(noOfApprenticesTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfApprentices"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigLoadingForApprentices")) {
				clearAndSendKeys(loadingForApprenticesTextField, premiumRatePFMiscEntity.getStringValueForField("LoadingForApprentices"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPreviousAnnualFeesDetailsCOST")) {
				fillPreviousAnnualFeesCOSTDetails(premiumRatePFMiscEntity);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalAnnualFeesWagesPayable")) {
				clearAndSendKeys(totalAnnualFeesWagesPayableTextField, premiumRatePFMiscEntity.getStringValueForField("TotalAnnualFeesWagesPayable"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigEstimatedFeesForProposedYear")) {
				clearAndSendKeys(estimatedFeesForProposedYearTextField, premiumRatePFMiscEntity.getStringValueForField("EstimatedFeesForProposedYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				clearAndSendKeys(compulsoryExcessTextField, premiumRatePFMiscEntity.getStringValueForField("CompulsoryExcess"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMinimumPremium")) {
				clearAndSendKeys(minimumPremiumTextField, premiumRatePFMiscEntity.getStringValueForField("MinimumPremium"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigGeographicalAreaOfOperation")) {
				clearAndSendKeys(geographicalAreaOfOperationTextArea, premiumRatePFMiscEntity.getStringValueForField("GeographicalAreaOfOperation"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfOutsidePersonnelEngaged")) {
				clearAndSendKeys(detailsOfOutsidePersonnelEngagedTextArea, premiumRatePFMiscEntity.getStringValueForField("DetailsOfOutsidePersonnelEngaged"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigGroupDiscountPercent")) {
				clearAndSendKeys(groupDiscountPercentTextField, premiumRatePFMiscEntity.getStringValueForField("GroupDiscountPercent"));
			}
			//Doctor
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigOptionOfServiceDoctor")) {
				selectValueFromList(optionOfServiceDoctorDropDown, premiumRatePFMiscEntity.getStringValueForField("OptionOfServiceDoctor"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigClassificationOfDoctor")) {
				selectValueFromList(classificationOfDoctorDropDown, premiumRatePFMiscEntity.getStringValueForField("ClassificationOfDoctor"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigClassificationOfDoctor")) {
				selectValueFromList(branchOfMedicineDropDown, premiumRatePFMiscEntity.getStringValueForField("BranchOfMedicine"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigBranchOfMedicine")) {
				clearAndSendKeys(qualificationAndYearTextArea, premiumRatePFMiscEntity.getStringValueForField("QualificationAndYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMedicalRegistrationNumber")) {
				clearAndSendKeys(medicalRegistrationNumberTextField, premiumRatePFMiscEntity.getStringValueForField("MedicalRegistrationNumber"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigRegistrationYear")) {
				clearAndSendKeys(registrationYearTextField, premiumRatePFMiscEntity.getStringValueForField("RegistrationYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigClinicAddress")) {
				clearAndSendKeys(clinicAddressTextArea, premiumRatePFMiscEntity.getStringValueForField("ClinicAddress"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMembershipNo")) {
				clearAndSendKeys(membershipNoTextField, premiumRatePFMiscEntity.getStringValueForField("MembershipNo"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNameOfAssociationCouncil")) {
				clearAndSendKeys(nameOfAssociationCouncilTextArea, premiumRatePFMiscEntity.getStringValueForField("NameOfAssociationCouncil"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigAddressOfAssociationCouncil")) {
				clearAndSendKeys(addressOfAssociationCouncilTextArea, premiumRatePFMiscEntity.getStringValueForField("AddressOfAssociationCouncil"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfFacilities")) {
				clearAndSendKeys(detailsOfFacilitiesTextArea, premiumRatePFMiscEntity.getStringValueForField("DetailsOfFacilities"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigAvgNoOfPatients")) {
				clearAndSendKeys(avgNoOfPatientsTextField, premiumRatePFMiscEntity.getStringValueForField("AvgNoOfPatients"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigUnqualifiedStaffCovered")) {
				selectValueFromList(unqualifiedStaffCoveredDropDown, premiumRatePFMiscEntity.getStringValueForField("UnqualifiedStaffCovered"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfMember")) {
				clearAndSendKeys(noOfMemberTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfMember"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigExcessAmount")) {
				clearAndSendKeys(excessAmountTextField, premiumRatePFMiscEntity.getStringValueForField("ExcessAmount"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigCategoryOfEstablishment")) {
				selectValueFromList(categoryOfEstablishmentDropDown, premiumRatePFMiscEntity.getStringValueForField("CategoryOfEstablishment"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfEstablishment")) {
				clearAndSendKeys(detailsOfEstablishmentTextArea, premiumRatePFMiscEntity.getStringValueForField("DetailsOfEstablishment"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTypeOfService")) {
				fillTypeOfServiceDetails(premiumRatePFMiscEntity);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfStaff")) {
				clearAndSendKeys(detailsOfStaffTextArea, premiumRatePFMiscEntity.getStringValueForField("DetailsOfStaff"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigRadioactiveTreatmentOtherThanXRayAvailable")) {
				selectValueFromList(radioactiveTreatmentOtherThanXRayAvailableDropDown, premiumRatePFMiscEntity.getStringValueForField("RadioactiveTreatmentOtherThanXRayAvailable"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfRadioactiveTreatment")) {
				clearAndSendKeys(detailsOfRadioactiveTreatmentTextField, premiumRatePFMiscEntity.getStringValueForField("DetailsOfRadioactiveTreatment"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfOutPatientLastYear")) {
				clearAndSendKeys(noOfOutPatientLastYearTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfOutPatientLastYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientGeneralLastYear")) {
				clearAndSendKeys(noOfInPatientGeneralLastYearTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientGeneralLastYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientSurgicalLastYear")) {
				clearAndSendKeys(noOfInPatientSurgicalLastYearTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientSurgicalLastYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalNoOfInPatientLastYear")) {
				clearAndSendKeys(totalNoOfInPatientLastYearTextField, premiumRatePFMiscEntity.getStringValueForField("TotalNoOfInPatientLastYear"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfOutPatient")) {
				clearAndSendKeys(noOfOutPatientTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfOutPatient"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientGeneral")) {
				clearAndSendKeys(noOfInPatientGeneralTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientGeneral"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientSurgical")) {
				clearAndSendKeys(noOfInPatientSurgicalTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientSurgical"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalNoOfInPatient")) {
				clearAndSendKeys(totalNoOfInPatientTextField, premiumRatePFMiscEntity.getStringValueForField("TotalNoOfInPatient"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfBeds")) {
				clearAndSendKeys(noOfBedsTextField, premiumRatePFMiscEntity.getStringValueForField("NoOfBeds"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfOwnersPartnersDirectors")) {
				clearAndSendKeys(detailsOfOwnersPartnersDirectorsTextArea, premiumRatePFMiscEntity.getStringValueForField("DetailsOfOwnersPartnersDirectors"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigProfessionalCategory")) {
				clearAndSendKeys(professionalCategoryTextArea, premiumRatePFMiscEntity.getStringValueForField("ProfessionalCategory"));
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfOperations")) {
				clearAndSendKeys(detailsOfOperationsTextArea, premiumRatePFMiscEntity.getStringValueForField("DetailsOfOperations"));
			}

		}
		else if(premiumRatePFMiscEntity.getAction().equalsIgnoreCase("verify")){

			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPremiumRatePerMilli")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("PremiumRatePerMilli"), fetchValueFromTextFields(premiumRatePerMilliTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfQualifiedPersons")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfQualifiedPersons"), fetchValueFromFields(noOfQualifiedPersonsTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigLoadingForQualifiedPersons")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("LoadingForQualifiedPersons"), fetchValueFromFields(loadingForQualifiedPersonsTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfAdministrativeStaff")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfAdministrativeStaff"), fetchValueFromFields(noOfAdministrativeStaffTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigLoadingForAdministrativeStaff")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("LoadingForAdministrativeStaff"), fetchValueFromFields(loadingForAdministrativeStaffTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfApprentices")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfApprentices"), fetchValueFromFields(noOfApprenticesTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigLoadingForApprentices")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("LoadingForApprentices"), fetchValueFromFields(loadingForApprenticesTextField), AssertionType.WARNING);
			}
			
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalAnnualFeesWagesPayable")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("TotalAnnualFeesWagesPayable"), fetchValueFromFields(totalAnnualFeesWagesPayableTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigEstimatedFeesForProposedYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("EstimatedFeesForProposedYear"), fetchValueFromTextFields(estimatedFeesForProposedYearTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("CompulsoryExcess"), fetchValueFromTextFields(compulsoryExcessTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMinimumPremium")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("MinimumPremium"), fetchValueFromTextFields(minimumPremiumTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigGeographicalAreaOfOperation")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("GeographicalAreaOfOperation"), fetchValueFromFields(geographicalAreaOfOperationTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfOutsidePersonnelEngaged")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfOutsidePersonnelEngaged"), fetchValueFromFields(detailsOfOutsidePersonnelEngagedTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigGroupDiscountPercent")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("GroupDiscountPercent"), fetchValueFromFields(groupDiscountPercentTextField), AssertionType.WARNING);
			}
			//Doctor
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigOptionOfServiceDoctor")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("OptionOfServiceDoctor"), fetchValueFromList(optionOfServiceDoctorDropDown), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigClassificationOfDoctor")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("ClassificationOfDoctor"), fetchValueFromList(classificationOfDoctorDropDown), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigBranchOfMedicine")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("BranchOfMedicine"), fetchValueFromList(branchOfMedicineDropDown), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigQualificationAndYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("QualificationAndYear"), fetchValueFromFields(qualificationAndYearTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMedicalRegistrationNumber")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("MedicalRegistrationNumber"), fetchValueFromFields(medicalRegistrationNumberTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigRegistrationYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("RegistrationYear"), fetchValueFromFields(registrationYearTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigClinicAddress")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("ClinicAddress"), fetchValueFromFields(clinicAddressTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMembershipNo")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("MembershipNo"), fetchValueFromFields(membershipNoTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNameOfAssociationCouncil")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NameOfAssociationCouncil"), fetchValueFromFields(nameOfAssociationCouncilTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigAddressOfAssociationCouncil")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("AddressOfAssociationCouncil"), fetchValueFromFields(addressOfAssociationCouncilTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfFacilities")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfFacilities"), fetchValueFromFields(detailsOfFacilitiesTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigAvgNoOfPatients")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("AvgNoOfPatients"), fetchValueFromFields(avgNoOfPatientsTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigUnqualifiedStaffCovered")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("UnqualifiedStaffCovered"), fetchValueFromList(unqualifiedStaffCoveredDropDown), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfMember")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfMember"), fetchValueFromFields(noOfMemberTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigExcessAmount")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("ExcessAmount"), fetchValueFromFields(excessAmountTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigCategoryOfEstablishment")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("CategoryOfEstablishment"), fetchValueFromFields(categoryOfEstablishmentDropDown), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfEstablishment")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfEstablishment"), fetchValueFromFields(detailsOfEstablishmentTextArea), AssertionType.WARNING);
			}			
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfStaff")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfStaff"), fetchValueFromFields(detailsOfStaffTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigRadioactiveTreatmentOtherThanXRayAvailable")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("RadioactiveTreatmentOtherThanXRayAvailable"), fetchValueFromFields(radioactiveTreatmentOtherThanXRayAvailableDropDown), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfRadioactiveTreatment")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfRadioactiveTreatment"), fetchValueFromFields(detailsOfRadioactiveTreatmentTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfOutPatientLastYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfOutPatientLastYear"), fetchValueFromFields(noOfOutPatientLastYearTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientGeneralLastYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientGeneralLastYear"), fetchValueFromFields(noOfInPatientGeneralLastYearTextField), AssertionType.WARNING);
			}
		
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientSurgicalLastYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientSurgicalLastYear"), fetchValueFromFields(noOfInPatientSurgicalLastYearTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalNoOfInPatientLastYear")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("TotalNoOfInPatientLastYear"), fetchValueFromFields(totalNoOfInPatientLastYearTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfOutPatient")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfOutPatient"), fetchValueFromFields(noOfOutPatientTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientGeneral")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientGeneral"), fetchValueFromFields(noOfInPatientGeneralTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfInPatientSurgical")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfInPatientSurgical"), fetchValueFromFields(noOfInPatientSurgicalTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalNoOfInPatient")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("TotalNoOfInPatient"), fetchValueFromFields(totalNoOfInPatientTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfBeds")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfBeds"), fetchValueFromFields(noOfBedsTextField), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfOwnersPartnersDirectors")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfOwnersPartnersDirectors"), fetchValueFromFields(detailsOfOwnersPartnersDirectorsTextArea), AssertionType.WARNING);
			}
			//Others:
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigProfessionalCategory")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("ProfessionalCategory"), fetchValueFromFields(professionalCategoryTextArea), AssertionType.WARNING);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDetailsOfOperations")) {
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("DetailsOfOperations"), fetchValueFromFields(detailsOfOperationsTextArea), AssertionType.WARNING);
			}
			//
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTypeOfService")) {
				verifyTypeOfServiceDetails(premiumRatePFMiscEntity,assertReference);
			}
			if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPreviousAnnualFeesDetailsCOST")) {
				verifyPreviousAnnualFeesCOSTDetails(premiumRatePFMiscEntity,assertReference);
			}
		}
	}
	public void clickToOpenButton(PremiumRatePFMiscEntity premiumRatePFMiscEntity) throws InterruptedException{
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigOpenNewWindowButton")){
			click(openButton);
			try{
				switchToWindow("'Previous Annual Fees details(COST)' Details");
			}
			catch(Exception e){
				switchToWindow("Previous Annual Fees details(ASL)' Details");
			}
		}
	}
	public void fillPreviousAnnualFeesCOSTDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity) throws InterruptedException{
		clickToOpenButton(premiumRatePFMiscEntity);
		Thread.sleep(3000);
		click(addButtonOfNextWindow);
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,premiumRatePFMiscEntity.getStringValueForField("SerialNo"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigYearOfTheFees")){
			clearAndSendKeys(yearOfTheFeesTextField,premiumRatePFMiscEntity.getStringValueForField("YearOfTheFees"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigYearFees")){
			clearAndSendKeys(yearFeesTextField,premiumRatePFMiscEntity.getStringValueForField("YearFees"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalAnnualFees")){
			clearAndSendKeys(totalAnnualFeesTextField,premiumRatePFMiscEntity.getStringValueForField("TotalAnnualFees"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyPreviousAnnualFeesCOSTDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(premiumRatePFMiscEntity);

		if(premiumRatePFMiscEntity.getAction().equalsIgnoreCase("verify")){
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSerialNo")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("SerialNo"), fetchValueFromFields(serialNoTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigYearOfTheFees")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("YearOfTheFees"), fetchValueFromTextFields(yearOfTheFeesTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigYearFees")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("YearFees"), fetchValueFromTextFields(yearFeesTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigTotalAnnualFees")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("TotalAnnualFees"), fetchValueFromTextFields(totalAnnualFeesTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}
	public void clickToOpenButton1(PremiumRatePFMiscEntity premiumRatePFMiscEntity) throws InterruptedException{
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigOpenNewWindowButton")){
			click(openButton1);
			try{
				switchToWindow("'Type of Service' Details");
			}
			catch(Exception e){
				switchToWindow("'Type of Service' Details");
			}
		}
	}
	public void fillTypeOfServiceDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity) throws InterruptedException{
		clickToOpenButton1(premiumRatePFMiscEntity);
		Thread.sleep(3000);
		click(addButtonOfNextWindow);
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,premiumRatePFMiscEntity.getStringValueForField("SerialNo"));
		}
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigTypeOfServiceSpecialization")) {
			selectValueFromList(typeOfServiceSpecializationDropDown, premiumRatePFMiscEntity.getStringValueForField("TypeOfServiceSpecialization"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfDoctor")){
			clearAndSendKeys(noOfDoctorTextField,premiumRatePFMiscEntity.getStringValueForField("NoOfDoctor"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfEmployee")){
			clearAndSendKeys(noOfEmployeeTextField,premiumRatePFMiscEntity.getStringValueForField("NoOfEmployee"));
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyTypeOfServiceDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton1(premiumRatePFMiscEntity);

		if(premiumRatePFMiscEntity.getAction().equalsIgnoreCase("verify")){
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSerialNo")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("SerialNo"), fetchValueFromFields(serialNoTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigTypeOfServiceSpecialization")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("TypeOfServiceSpecialization"), fetchValueFromList(typeOfServiceSpecializationDropDown), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfDoctor")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfDoctor"), fetchValueFromTextFields(noOfDoctorTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigNoOfEmployee")){
				assertReference.assertEquals(premiumRatePFMiscEntity.getStringValueForField("NoOfEmployee"), fetchValueFromTextFields(noOfEmployeeTextField), AssertionType.WARNING);
			}
			if(premiumRatePFMiscEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}
	public void forwardFromPolInsIntrAttrPremiumRateDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(riskDetailsPageTitle);                                                                

		}
	}
	public void PreviousFromPolInsIntrAttrPremiumRateDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPreviousButton")) {
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(riskDetailsPageTitle);                                                                

		}
	}
	public void backFromPolInsIntrAttrPremiumRateDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);                                                               
		}
	}
	public void navigateToPolicyTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttributeTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToMemberTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetailTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelationsTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPaymentsTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowupTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocumentTab(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToPolicyMemberDetails(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PremiumRatePFMiscEntity premiumRatePFMiscEntity){
		if (premiumRatePFMiscEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void fillAndSubmitPolInsIntrAttrPremiumRateDetailsForPF(PremiumRatePFMiscEntity premiumRatePFMiscEntity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(premiumRatePFMiscEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolInsIntrAttrPremiumRateDetailsForPF(premiumRatePFMiscEntity, assertReference);
			navigateToPolicyTab(premiumRatePFMiscEntity);
			navigateToAttributeTab(premiumRatePFMiscEntity);
			navigateToMemberTab(premiumRatePFMiscEntity);
			navigateToCoverageTab(premiumRatePFMiscEntity);
			navigateToClientDetailTab(premiumRatePFMiscEntity);
			navigateToRelationsTab(premiumRatePFMiscEntity);
			navigateToPaymentsTab(premiumRatePFMiscEntity);
			navigateToFollowupTab(premiumRatePFMiscEntity);
			navigateToDocumentTab(premiumRatePFMiscEntity);
			navigateToPolicyMemberDetails(premiumRatePFMiscEntity);
			navigateToPolicyMemberAttributes(premiumRatePFMiscEntity);
			navigateToPolicyMemberAttachCoverages(premiumRatePFMiscEntity);
			navigateToPolicyMemberRelations(premiumRatePFMiscEntity);
			navigateToPolicyMemberPayments(premiumRatePFMiscEntity);
			forwardFromPolInsIntrAttrPremiumRateDetails(premiumRatePFMiscEntity);
			PreviousFromPolInsIntrAttrPremiumRateDetails(premiumRatePFMiscEntity);
			backFromPolInsIntrAttrPremiumRateDetails(premiumRatePFMiscEntity);
		}
	}
}


