package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrMarinCargoEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMCargoEntity;
import com.aqm.staf.library.databin.PolInsIntAvtEntity;
import com.aqm.staf.library.databin.PolAttrMarinCargoEntity;

public class PolicyAttributeMarineCargo extends BasePage{
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
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	//DIGVIJAY PROD=AT
	
	private PageElement isGstExemptedDropDown;
	private PageElement reasonForGstExemptionDropDown;
	private PageElement nameOfSEZLocationTextArea;
	private PageElement whetherA2CertificatesubmittedDropDown;
	private PageElement a2CertificateNumberTextField;
	private PageElement dateOfIssuanceOfA2CertificateTextField;
	private PageElement nameOfTheAuthorityIssuingTheA2CertificateTextArea;
	private PageElement designationOfTheAuthorityIssuingTheA2CertificateTextField;
	private PageElement coInsuranceApplicableDropDown;
	//DIGVIJAY PROD=SV
	private PageElement typeOfPolicyForSVDropDown;

	//CC Dharmendra
	private PageElement openCoverAgreementNumberTextField;
	//op
	private PageElement natureOfTradeDropDown;
	private PageElement declarationBookStartNoTextField;
	private PageElement declarationBookEndNoTextField;
	private PageElement excessApplicableDropDown;
	private PageElement minimumExcessRsTextField;
	private PageElement specialConditionsTextArea;
	private PageElement excessApplicableOnDropDown;
	private PageElement excessClaimAmountTextField;
	private PageElement excessOthersTextField;
	private PageElement excessSITextField;
	//DI Label
	private PageElement policyDetailsDITitle;
	private PageElement openButton;
	private PageElement serialNoTextFieldOfNextWindow;
	private PageElement installmentPercentageTextFieldOfNextWindow;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	//DI--Normal outside
	private PageElement subjectToSanctionsLimitationAndExclusionClauseDropDown ;
	private PageElement subjectToPrivateCarriersWarrantyDropDown;
	private PageElement subjectToClosedVehicleWarrantyDropDown;
	private PageElement cargoTerminationOfTransitStorageClauseDropDown;
	//Next Window
	private PageElement policyDetailsDITitles;
	private PageElement typeOfDevelopmentDropDown;
	private PageElement installmentPercentageOpenButton;
	//OP attributes 
	private PageElement displayOfPremiumOnDocumentTextField;
	private PageElement IsthePaymentreceivedfromGovtEntity;
	
	
	
	public PolicyAttributeMarineCargo(WebDriver driver, String pageName) {
		super(driver, pageName);
		displayOfPremiumOnDocumentTextField= new PageElement(By.xpath("//div[contains(text(),'Display of Premium on document')]//following::input[1]"), "Display of Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageOpenButton = new PageElement(By.xpath("//div[contains(text(),'Installment Percentage List')]//following::input[1]"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfDevelopmentDropDown= new PageElement(By.xpath("//div[contains(text(),'Type of Development Officer')]//following::select[1]"), "Type Of Development officer", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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
		policyDetailsDITitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Details DI')]"), "Policy Details DI Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		subjectToSanctionsLimitationAndExclusionClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Subject to Sanctions, Limitation & Exclusion Clause JC 2010/014(11.08.2010)')]/following::select"), "Subject To Sanctions Limitation And Exclusion Clause List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subjectToPrivateCarriersWarrantyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Subject to Private Carriers Warranty')]/following::select"), "Subject To Private Carriers Warranty List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subjectToClosedVehicleWarrantyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Subject to closed vehicle Warranty')]/following::select"), "Subject To Closed Vehicle Warranty List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cargoTerminationOfTransitStorageClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Cargo Termination of Transit (Storage) Clause')]/following::select"), "Cargo Termination Of Transit Storage Clause List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DI --Open Button
		openButton=new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Open New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextFieldOfNextWindow= new PageElement(By.name("slNo0"), "Serial No Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		installmentPercentageTextFieldOfNextWindow= new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete Button Of Next Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

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
		//DIGVIJAY PROD AT
		isGstExemptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Service Tax Exempted')]/following::select"), "Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reasonForGstExemptionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Reason for Service Tax Exemption')]/following::select"), "Reason for Service Tax Exemption", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfSEZLocationTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name of SEZ location')]/following::textarea"), "Name of SEZ location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherA2CertificatesubmittedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether A2 Certificate submitted')]/following::select"), "Whether A2 Certificate submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		a2CertificateNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'A2 Certificate Number')]/following::input"), "A2 Certificate Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIssuanceOfA2CertificateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Issuance of A2 Certificate')]/following::input"), "Date of Issuance of A2 Certificate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfTheAuthorityIssuingTheA2CertificateTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Name of the authority issuing the A2 certificate')]/following::textarea"), "Name of the authority issuing the A2 certificate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		designationOfTheAuthorityIssuingTheA2CertificateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Designation of the authority issuing the A2 certificate')]/following::input"), "Designation of the authority issuing the A2 certificate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"), "Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DIGVIJAY PROD=SV
		typeOfPolicyForSVDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Policy for SV')]/following::select"), "Type of Policy for SV", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		openCoverAgreementNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Open Cover Agreement Number')]/following::input"), "Open Cover Agreement Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//op
		natureOfTradeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Trade')]/following::select"), "Nature of Trade", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		declarationBookStartNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book Start No.')]/following::input"), "Declaration Book Start No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationBookEndNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book End No.')]/following::input"), "Declaration Book End No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess applicable')]/following::select"), "Excess applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		minimumExcessRsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Minimum Excess Rs')]/following::input"), "Minimum Excess Rs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::Textarea"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessApplicableOnDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable on')]/following::select"), "Excess Applicable on", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessClaimAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) Claim Amount')]/following::input"), "Excess(%) Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessOthersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) Others')]/following::input"), "Excess(%) Others", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessSITextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) SI')]/following::input"), "Excess(%) SI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsthePaymentreceivedfromGovtEntity=new PageElement(By.xpath("//td//div[contains(text(),'Is the Payment received from Govt Entity?')]/following::select[1]"),"Is the Payment received from Govt Entity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	public void fillPolicyAttributeMarineCargo(PolAttrMarinCargoEntity polAttrMarinCargoEntity, CustomAssert assertReference) throws InterruptedException{
		if(polAttrMarinCargoEntity.getAction().equalsIgnoreCase("add") || polAttrMarinCargoEntity.getAction().equalsIgnoreCase("edit")){
			//DIGVIJAY PROD AT
			//DI- Rajkumar add add edit
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigInstallementPercentageList")) {
				fillInstallmentPercentageDetails(polAttrMarinCargoEntity);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigNameOfSEZLocation")) {
				clearAndSendKeys(nameOfSEZLocationTextArea, polAttrMarinCargoEntity.getStringValueForField("NameOfSEZLocation"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigWhetherA2Certificatesubmitted")) {
				selectValueFromList(whetherA2CertificatesubmittedDropDown, polAttrMarinCargoEntity.getStringValueForField("WhetherA2Certificatesubmitted"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigA2CertificateNumber")) {
				clearAndSendKeys(a2CertificateNumberTextField, polAttrMarinCargoEntity.getStringValueForField("A2CertificateNumber"));
			}
			
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDateOfIssuanceOfA2Certificate")) {
				String dateOfIssuanceOfA2Certificate=RandomCodeGenerator.dateGenerator(polAttrMarinCargoEntity.getStringValueForField("DateOfIssuanceOfA2Certificate"));
				clearAndEnterDate(dateOfIssuanceOfA2CertificateTextField, dateOfIssuanceOfA2Certificate);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigNameOfTheAuthorityIssuingTheA2Certificate")) {
				clearAndSendKeys(nameOfTheAuthorityIssuingTheA2CertificateTextArea, polAttrMarinCargoEntity.getStringValueForField("NameOfTheAuthorityIssuingTheA2Certificate"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDesignationOfTheAuthorityIssuingTheA2Certificate")) {
				clearAndSendKeys(designationOfTheAuthorityIssuingTheA2CertificateTextField, polAttrMarinCargoEntity.getStringValueForField("DesignationOfTheAuthorityIssuingTheA2Certificate"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, polAttrMarinCargoEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			//DIGVIJAY PROD=SV
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigTypeOfPolicyForSV")) {
				selectValueFromList(coInsuranceApplicableDropDown, polAttrMarinCargoEntity.getStringValueForField("TypeOfPolicyForSV"));
			}
			//cc
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigopenCoverAgreementNumber")) {
				clearAndSendKeys(openCoverAgreementNumberTextField, polAttrMarinCargoEntity.getStringValueForField("OpenCoverAgreementNumber"));
			}//op
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDeclarationBookStartNo")) {
				clearAndSendKeys(declarationBookStartNoTextField, polAttrMarinCargoEntity.getStringValueForField("DeclarationBookStartNo"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDeclarationBookEndNo")) {
				clearAndSendKeys(declarationBookEndNoTextField, polAttrMarinCargoEntity.getStringValueForField("DeclarationBookEndNo"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigMinimumExcessRs")) {
				clearAndSendKeys(minimumExcessRsTextField, polAttrMarinCargoEntity.getStringValueForField("MinimumExcessRs"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polAttrMarinCargoEntity.getStringValueForField("SpecialConditions"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigNatureOfTrade")) {
				selectValueFromList(natureOfTradeDropDown, polAttrMarinCargoEntity.getStringValueForField("NatureOfTrade"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessApplicable")) {
				selectValueFromList(excessApplicableDropDown, polAttrMarinCargoEntity.getStringValueForField("ExcessApplicable"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigexcessApplicableOn")) {
				selectValueFromList(excessApplicableOnDropDown, polAttrMarinCargoEntity.getStringValueForField("ExcessApplicableOn"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessClaimAmount")) {
				clearAndSendKeys(excessClaimAmountTextField, polAttrMarinCargoEntity.getStringValueForField("ExcessClaimAmount"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessOthers")) {
				clearAndSendKeys(excessOthersTextField, polAttrMarinCargoEntity.getStringValueForField("ExcessOthers"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessSI")) {
				clearAndSendKeys(excessSITextField, polAttrMarinCargoEntity.getStringValueForField("ExcessSI"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigsubjectToSanctionsLimitationAndExclusionClauseList")) {
				selectValueFromList(subjectToSanctionsLimitationAndExclusionClauseDropDown, polAttrMarinCargoEntity.getStringValueForField("SubjectToSanctionsLimitationAndExclusionClauseList"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigSubjectToPrivateCarriersWarranty")) {
				selectValueFromList(subjectToPrivateCarriersWarrantyDropDown, polAttrMarinCargoEntity.getStringValueForField("SubjectToPrivateCarriersWarranty"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigSubjectToClosedVehicleWarranty")) {
				selectValueFromList(subjectToClosedVehicleWarrantyDropDown, polAttrMarinCargoEntity.getStringValueForField("SubjectToClosedVehicleWarranty"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigCargoTerminationOfTransitStorageClause")) {
				selectValueFromList(cargoTerminationOfTransitStorageClauseDropDown, polAttrMarinCargoEntity.getStringValueForField("CargoTerminationOfTransitStorageClause"));
				click(forwardButton);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDisplayOfPremium")) {
				clearAndSendKeys(displayOfPremiumOnDocumentTextField, polAttrMarinCargoEntity.getStringValueForField("DisplayOfPremium"));
				click(forwardButton);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigTypeOfDevelopmentOfficer")) {
				selectValueFromList(typeOfDevelopmentDropDown, polAttrMarinCargoEntity.getStringValueForField("TypeOfDevelopmentOfficer"));
				click(forwardButton);
			}
			
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigIsGstExempted")) {
				selectValueFromList(isGstExemptedDropDown, polAttrMarinCargoEntity.getStringValueForField("IsGstExempted"));
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigReasonForGstExemption")) {
				selectValueFromList(reasonForGstExemptionDropDown, polAttrMarinCargoEntity.getStringValueForField("ReasonForGstExemption"));
			}
			//AN
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigIsthePaymentreceivedfromGovtEntity")) {
				selectValueFromList(IsthePaymentreceivedfromGovtEntity, polAttrMarinCargoEntity.getStringValueForField("IsthePaymentreceivedfromGovtEntity"));
				}


		}
		else if(polAttrMarinCargoEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			//DIGVIJAY PROD AT
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigIsGstExempted")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("IsGstExempted"), fetchValueFromList(isGstExemptedDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigReasonForGstExemption")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ReasonForGstExemption"), fetchValueFromList(reasonForGstExemptionDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigNameOfSEZLocation")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("NameOfSEZLocation"), fetchValueFromTextFields(nameOfSEZLocationTextArea), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigWhetherA2Certificatesubmitted")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("WhetherA2Certificatesubmitted"), fetchValueFromList(whetherA2CertificatesubmittedDropDown), AssertionType.WARNING);
			}			
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigA2CertificateNumber")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("A2CertificateNumber"), fetchValueFromTextFields(a2CertificateNumberTextField), AssertionType.WARNING);
			}

			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDateOfIssuanceOfA2Certificate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttrMarinCargoEntity.getStringValueForField("DateOfIssuanceOfA2Certificate")) ,fetchValueFromTextFields(dateOfIssuanceOfA2CertificateTextField),AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigNameOfTheAuthorityIssuingTheA2Certificate")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("NameOfTheAuthorityIssuingTheA2Certificate"), fetchValueFromTextFields(nameOfTheAuthorityIssuingTheA2CertificateTextArea), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDesignationOfTheAuthorityIssuingTheA2Certificate")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("DesignationOfTheAuthorityIssuingTheA2Certificate"), fetchValueFromTextFields(designationOfTheAuthorityIssuingTheA2CertificateTextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}

			//
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigTypeOfPolicyForSV")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("TypeOfPolicyForSV"), fetchValueFromList(typeOfPolicyForSVDropDown), AssertionType.WARNING);
			}

			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigopenCoverAgreementNumber")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("OpenCoverAgreementNumber"), fetchValueFromTextFields(openCoverAgreementNumberTextField), AssertionType.WARNING);
			}
			//op
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigNatureOfTrade")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("NatureOfTrade"), fetchValueFromList(natureOfTradeDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessApplicable")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ExcessApplicable"), fetchValueFromList(excessApplicableDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDeclarationBookStartNo")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("DeclarationBookStartNo"), fetchValueFromTextFields(declarationBookStartNoTextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDeclarationBookEndNo")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("DeclarationBookEndNo"), fetchValueFromTextFields(declarationBookEndNoTextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigMinimumExcessRs")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("MinimumExcessRs"), fetchValueFromTextFields(minimumExcessRsTextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessApplicableOn")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ExcessApplicableOn"), fetchValueFromList(excessApplicableOnDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessClaimAmount")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ExcessClaimAmount"), fetchValueFromTextFields(excessClaimAmountTextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessOthers")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ExcessOthers"), fetchValueFromTextFields(excessOthersTextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigExcessSI")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("ExcessSI"), fetchValueFromTextFields(excessSITextField), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigPolicyDetailsDITitle")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("PolicyDetailsDITitle"), fetchValueFromFields(policyDetailsDITitle), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigsubjectToSanctionsLimitationAndExclusionClause")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("SubjectToSanctionsLimitationAndExclusionClause"),fetchValueFromList(subjectToSanctionsLimitationAndExclusionClauseDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigSubjectToPrivateCarriersWarranty")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("SubjectToPrivateCarriersWarranty"),fetchValueFromList(subjectToPrivateCarriersWarrantyDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigSubjectToClosedVehicleWarranty")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("SubjectToClosedVehicleWarranty"),fetchValueFromList(subjectToClosedVehicleWarrantyDropDown), AssertionType.WARNING);
			}
			if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigCargoTerminationOfTransitStorageClause")) {
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("CargoTerminationOfTransitStorageClause"),fetchValueFromList(cargoTerminationOfTransitStorageClauseDropDown), AssertionType.WARNING);
			}
			//DI-Verify
			if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigInstallementPercentageList")){
				verifyInstallementPercentageDetails(polAttrMarinCargoEntity,assertReference);			
			}

		}
	}
	public void navigateTobackAttributePage(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeDetails(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigForwordButton")&& polAttrMarinCargoEntity.getRowNumber()==1){			
			click(forwardButton);
			}
			click(saveButtonOfNextWindow);
			switchToFrame("display");
	}
	public void navigateToPolicy(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolAttrMarinCargoEntity polAttrMarinCargoEntity){
		if (polAttrMarinCargoEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
		}
	}
	public void fillInstallmentPercentageDetails(PolAttrMarinCargoEntity polAttrMarinCargoEntity) throws InterruptedException{
		clickToOpenButton(polAttrMarinCargoEntity);
		Thread.sleep(3000);
		if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigInstallmentPercentageTextFieldOfNextWindow")){
			clearAndSendKeys(installmentPercentageTextFieldOfNextWindow,polAttrMarinCargoEntity.getStringValueForField("InstallmentPercentageTextFieldOfNextWindow"));
		}
		if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		policyDetailsDITitles = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrMarinCargoEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyDetailsDITitles);
		}
	}

	public void verifyInstallementPercentageDetails(PolAttrMarinCargoEntity polAttrMarinCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		

		if(polAttrMarinCargoEntity.getAction().equalsIgnoreCase("verify")){
			clickToOpenButton(polAttrMarinCargoEntity);
			if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigSerialNoTextFieldOfNextWindow")){
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("SerialNoTextFieldOfNextWindow"), fetchValueFromFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigInstallmentPercentageTextFieldOfNextWindow")){
				assertReference.assertEquals(polAttrMarinCargoEntity.getStringValueForField("InstallmentPercentageTextFieldOfNextWindow"), fetchValueFromTextFields(installmentPercentageTextFieldOfNextWindow), AssertionType.WARNING);
			}		
			if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
			click(forwardButton);
		} 

	}
	public void clickToOpenButton(PolAttrMarinCargoEntity polAttrMarinCargoEntity) throws InterruptedException{
		if(polAttrMarinCargoEntity.getBooleanValueForField("ConfigInstallmentPercentageOpenButton")){
			click(installmentPercentageOpenButton);
			//click(addButton);
			try{
				switchToWindow("'Installment Percentage List' Details");
			}
			catch(Exception e){
				switchToWindow("'Installment Percentage List' Details");

			}
		}
	}

	public void fillandSubmitPolicyInsIntMarineCargo(PolAttrMarinCargoEntity polAttrMarinCargoEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrMarinCargoEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeMarineCargo(polAttrMarinCargoEntity, assertReference);
			clickNextButtonPolicyAttributeDetails(polAttrMarinCargoEntity);
			navigateTobackAttributePage(polAttrMarinCargoEntity);
			navigateToPolicy(polAttrMarinCargoEntity);
			navigateToAttribute(polAttrMarinCargoEntity);
			navigateToInsuredInterest(polAttrMarinCargoEntity);
			navigateToCoverage(polAttrMarinCargoEntity);
			navigateToLoan(polAttrMarinCargoEntity);
			navigateToClientDetails(polAttrMarinCargoEntity);
			navigateToRelation(polAttrMarinCargoEntity);
			navigateToPayment(polAttrMarinCargoEntity);
			navigateToFollowup(polAttrMarinCargoEntity);
			navigateToDocument(polAttrMarinCargoEntity);


		}
	}

}
