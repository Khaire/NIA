package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeEngEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.T4ClaimPropLNMISEntity;
import com.aqm.staf.library.databin.T5ClaimPropLiab1MISEntity;

public class PolicyAttributeEngineering extends BasePage {

	//*************ER(CHINTAN)*********************
	private PageElement policyToBeInsuredInFavorOfDropDown; 
	private PageElement coInsuranceApplicableDropDown;
	private PageElement isServiceTaxExemptedDropDown;
	private PageElement opportunityIdTextField;

	//**********CR AND ER , ME SAME(CHINTAN)**********

	//*************AM(CHINTAN)*********************
	private PageElement reasonForServiceTaxExemptionDropDown;
	private PageElement nameOfSEZLocationTextField;
	private PageElement whetherA2CertificateSubmittedDropDown;

	private PageElement	a2CertificateNumberTextField;
	private PageElement dateOfIssuanceOfA2CertificateTextField;
	private PageElement nameOfTheauthorityIssuingTheA2certificateTextField;	
	private PageElement designationOfTheAuthorityIssuingTheA2CertificateTextField;

	private PageElement saveWindowButton;
	private PageElement deleteWindowButton;
	private PageElement closeWindowButton;
	private PageElement addButton;
	private PageElement openAmButton;
	private PageElement installmentPercentageTextField;

	//chintan
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement insuredInterestTab;	
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement insuredInterestTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberCoverageTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement memberRelationsTitlePage;
	private PageElement memberPaymentListTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestTabTitle;	
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement nextPageTitle;

	//EF-Yogesh
	private PageElement typeOfTheBusinessTextField;	
	private PageElement incurredClaimRatioOfEquipmentsTextField;	
	//MB-Yogesh
	private PageElement typeOfIndustryTextField;
	private PageElement doYouWishToInsureTheFoundationOfTheMachineryDropDown;	
	private PageElement relevantItemsHavingFoundationsTextArea;	
	private PageElement incurredClaimRatioOfTheMachineriesMIF3YearsTextField;	
	//BPPI(BP) Yogesh
	private PageElement typeOfBusinessBPTextField;	
	private PageElement incurredClaimRatioOfTheMachineriesBoiler5YearsTextField;	
	//CF-Yogesh
	private PageElement typeOfBusinessForCPMTextField;	
	private PageElement incurredClaimRatioOfTheMachineriesCPM3YearsTextField;	
	//EI-Yogesh(Repeated with EF)
	//Mayur_Product Name= DS
	private PageElement averageClaimRatioInPercentFor5YearsTextField;
	//Mayur_Product Name= EC
	private PageElement incurredClaimRatioOfMachineriesCECR5YearsTextField;
	//Mayur_Product Name= ET
	private PageElement subjectivitiesTextArea;
	private PageElement exclusionsTextArea;
	private PageElement insuredInterestWordingForPropertyDamageTextArea;
	private PageElement insuredInterestWordingForBusinessInterruptionTextArea;
	private PageElement descriptionOfProjectDescription1TextArea;
	private PageElement descriptionOfProjectDescription2TextArea;
	private PageElement descriptionOfProjectDescription3TextArea;
	private PageElement whetherTheLargeRiskProjectIsSituatedInSEZDropDown;
	//Mayur_Product Name= LE
	private PageElement staffOrganisationChartForProjectOwnersTextArea;
	private PageElement briefDetailsOfExperienceOnPreviousProjectsTextArea;
	//Mayur_Product Name= LW
	private PageElement numberofYearsForWhichWindmillPackagePolicyIsAvailableClaimHistoryTextField;
	private PageElement numberOfYearsForWhichWindmillPackageLOPIsAvailableClaimHistoryTextField;
	private PageElement incurredClaimRatioOfPolicyAtSubjectLocationCoveredunderWindmillPackageForAvailableNoOfYearsExcludingExpiringPolicyTextField;
	private PageElement incurredClaimRatioOfPolicyAtSubjectLocationCoveredUndeWindmillPackageLOPForAvailableNoOfYearsExcludingExpiringPolicyTextField;
	//lm
	private PageElement numberOfYearsForWhichMachInsIsAvailClaimhistoryTextField;
	private PageElement numberOfYearsForWhichMLOPIsAvailableClaimhistoryTextField;
	private PageElement incuClaimRatioOfPolAtSubLocCovUnderMachInsForAvailTextField;
	private PageElement incurClaimRatioOfPolAtSubLocCovUnderMLOPAndMBForAvailTextField;
	private PageElement forwardButton;
	private PageElement coInsuranceTitle;
	private PageElement opertunityidTitle;
	private PageElement WPIForLast5YearsTextField;
	private PageElement typeOfPolicyDropDown;
	private PageElement forwordButton;

	public PolicyAttributeEngineering(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);

		//*************ER(CHINTAN)*********************
		policyToBeInsuredInFavorOfDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Policy To Be Insured In Favor Of')]/following::select"),"Policy To Be Insured In Favor Of", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Co-Insurance Applicable')]/following::select"), "Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isServiceTaxExemptedDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Service Tax Exempted')]/following::select"), "Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIdTextField=new PageElement(By.xpath("//td/div[contains(text(),'Opportunity Id')]/following::input"), "Opportunity Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//*************AM(CHINTAN)*********************
		reasonForServiceTaxExemptionDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Reason for Service Tax Exemption')]/following::select"),"Reason for Service Tax Exemptionf", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfSEZLocationTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of SEZ location')]/following::input"),"Name of SEZ location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherA2CertificateSubmittedDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether A2 Certificate submitted')]/following::select"),"Whether A2 Certificate submitted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButton= new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openAmButton=new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		a2CertificateNumberTextField=new PageElement(By.xpath("//td/div[contains(text(),'A2 Certificate Number')]/following::input"),"A2 Certificate Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIssuanceOfA2CertificateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Date of Issuance of A2 Certificate')]/following::input"),"Date of Issuance of A2 Certificate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		nameOfTheauthorityIssuingTheA2certificateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Name of the authority issuing the A2 certificate')]/following::input"),"Name of the authority issuing the A2 certificate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		designationOfTheAuthorityIssuingTheA2CertificateTextField=new PageElement(By.xpath("//td/div[contains(text(),'Designation of the authority issuing the A2 certificate')]/following::input"),"Designation of the authority issuing the A2 certificate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	


		//old(modified)chintan
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTitle = new PageElement(By.linkText("Detail"), " InsuredInterestTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),' List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		nextArrowButton = new PageElement(By.name("Next"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//EF-Yogesh
		typeOfTheBusinessTextField= new PageElement(By.xpath("//td//div[contains(text(),'Type of the Business')]/following::input"), "Type of the Business TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioOfEquipmentsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Incurred Clm ratio of equipments at subject Location covered in EE for last 3 yrs Including expiring policy')]/following::input"), "Incurred Clm ratio of equipments at subject Location covered in EE for last 3 yrs Including expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MB-Yogesh
		typeOfIndustryTextField= new PageElement(By.xpath("//td//div[contains(text(),'Type of Industry')]/following::input"), "Type of Industry TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouWishToInsureTheFoundationOfTheMachineryDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Do you wish to insure the foundation of the machinery?')]/following::select"), "Do you wish to insure the foundation of the machinery? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		relevantItemsHavingFoundationsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Relevant items having foundations')]/following::TextArea"), "Relevant items having foundations TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioOfTheMachineriesMIF3YearsTextField= new PageElement(By.xpath("//td//div[@id='Incurred Claim ratio of the machineries at the subject Location covered under MI for last 3 years Including the expiring policy']/following::input[1]"), "Incurred Claim ratio of the machineries at the subject Location covered under MI for last 3 years Including the expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BPPI(BP) Yogesh
		typeOfBusinessBPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Type of Business(BP)')]/following::input"), "Type of Business(BP) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioOfTheMachineriesBoiler5YearsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim ratio of the machineries at the subject Location covered under Boiler for last 5 years Including the expiring policy')]/following::input"), "Incurred Claim ratio of the machineries at the subject Location covered under Boiler for last 5 years Including the expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CF-Yogesh
		typeOfBusinessForCPMTextField= new PageElement(By.xpath("//td//div[contains(text(),'Type of Business for CPM')]/following::input"), "Type of Business for CPM", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioOfTheMachineriesCPM3YearsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim ratio of the machineries at the subject Location covered under CPM for last 3 years Including the expiring policy')]/following::input"), "Incurred Claim ratio of the machineries at the subject Location covered under CPM for last 3 years Including the expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product Name= DS
		averageClaimRatioInPercentFor5YearsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Average Claim Ratio in % for 5 years policy preceeding the expiring policy period')]/following::input"), "Average Claim Ratio in % for 5 years policy preceeding the expiring policy period Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product Name= EC
		incurredClaimRatioOfMachineriesCECR5YearsTextField= new PageElement(By.xpath("//td//div[@id='Incurred Claim ratio of machineries at subject Location covered under CECR  for last 5 years Including expiring policy']/following::input"), "Incurred Claim ratio of machineries at subject Location covered under CECR for last 5 years Including expiring policy Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product Name= ET
		subjectivitiesTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Subjectivities')]/following::TextArea"), "Subjectivities Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exclusionsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Exclusions')]/following::TextArea"), "Exclusions Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestWordingForPropertyDamageTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Property Damage')]/following::TextArea"), "Insured Interest Wording for Property Damage Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestWordingForBusinessInterruptionTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Insured Interest Wording for Business Interruption(ALOP)')]/following::TextArea"), "Insured Interest Wording for Business Interruption(ALOP) Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfProjectDescription1TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Project - Description1')]/following::TextArea"), "Description of Project - Description1 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfProjectDescription2TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Project - Description2')]/following::TextArea"), "Description of Project - Description2 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfProjectDescription3TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Project - Description3')]/following::TextArea"), "Description of Project - Description3 Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheLargeRiskProjectIsSituatedInSEZDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the Large Risk Project is situated in SEZ')]/following::select"), "Whether the Large Risk Project is situated in SEZ Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product Name= LE
		staffOrganisationChartForProjectOwnersTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Staff Organisation chart for project owner(s) project management team')]/following::TextArea"), "Staff Organisation chart for project owner(s) project management team Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		briefDetailsOfExperienceOnPreviousProjectsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Brief details of experience on previous projects for key personnel on the project management and contractor management teams')]/following::TextArea"), "Brief details of experience on previous projects for key personnel on the project management and contractor management teams Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_Product Name= LW
		numberofYearsForWhichWindmillPackagePolicyIsAvailableClaimHistoryTextField= new PageElement(By.xpath("//td/div[contains(text(),'Number of years for which Windmill Package Policy is available - Claim history')]/following::input"), "Number of years for which Windmill Package Policy is available - Claim history Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfYearsForWhichWindmillPackageLOPIsAvailableClaimHistoryTextField= new PageElement(By.xpath("//td/div[contains(text(),'Number of years for which Windmill Package LOP is available - Claim history')]/following::input"), "Number of years for which Windmill Package LOP is available - Claim history Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioOfPolicyAtSubjectLocationCoveredunderWindmillPackageForAvailableNoOfYearsExcludingExpiringPolicyTextField= new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim ratio of Policy at subject Location covered under Windmill Package for available no of years excluding expiring policy')]/following::input"), "Incurred Claim ratio of Policy at subject Location covered under Windmill Package for available no of years excluding expiring policy Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioOfPolicyAtSubjectLocationCoveredUndeWindmillPackageLOPForAvailableNoOfYearsExcludingExpiringPolicyTextField= new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim ratio of Policy at subject Location covered under Windmill Package LOP for available no of years excluding expiring policy')]/following::input"), "Incurred Claim ratio of Policy at subject Location covered under Windmill Package LOP for available no of years excluding expiring policy Text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//lm
		numberOfYearsForWhichMachInsIsAvailClaimhistoryTextField=new PageElement(By.xpath("//td/div[contains(text(),'Number of years for which Machinery Insurance is available')]/following::input"),"Number of years for which Machinery Insurance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfYearsForWhichMLOPIsAvailableClaimhistoryTextField=new PageElement(By.xpath("//td/div[contains(text(),'Number of years for which MLOP is available')]/following::input"),"Number of years for which MLOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incuClaimRatioOfPolAtSubLocCovUnderMachInsForAvailTextField=new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim ratio of Policy at subject Location covered under Machinery Insurance')]/following::input"),"Incurred Claim ratio of Policy at subject Location covered under Machinery Insurance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurClaimRatioOfPolAtSubLocCovUnderMLOPAndMBForAvailTextField=new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim ratio of Policy at subject Location covered under MLOP and MB')]/following::input"),"Incurred Claim ratio of Policy at subject Location covered under MLOP and MB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton = new PageElement(By.name("Next"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		WPIForLast5YearsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim ratio of the machineries at the subject Location covered under WPI for last 5 years Including the expiring policy')]/following::input"), "WPI for last 5 years", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPolicyDropDown=new PageElement(By.name("propValues2"), "Type of Policy Dropdown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwordButton=new PageElement(By.name ("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillPolicyAttributeEngineeringDetails(PolAttributeEngEntity polAttributeEngEntity, CustomAssert assertReference) throws InterruptedException{

		//*************ER(CHINTAN)*********************
		if(polAttributeEngEntity.getAction().equalsIgnoreCase("add")||polAttributeEngEntity.getAction().equalsIgnoreCase("edit")) {
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				selectValueFromList(typeOfPolicyDropDown, polAttributeEngEntity.getStringValueForField("TypeOfPolicy"));
				click(forwordButton);
			}
			else
				click(forwordButton);
			if (polAttributeEngEntity.getBooleanValueForField("ConfigPolicyToBeInsuredInFavor")) {
				selectValueFromList(policyToBeInsuredInFavorOfDropDown, polAttributeEngEntity.getStringValueForField("PolicyToBeInsuredInFavor"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, polAttributeEngEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(isServiceTaxExemptedDropDown, polAttributeEngEntity.getStringValueForField("IsServiceTaxExempted"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIdTextField, polAttributeEngEntity.getStringValueForField("OpportunityId"));
			}
			//*************AM(CHINTAN)*********************

			if (polAttributeEngEntity.getBooleanValueForField("ConfigReasonForServiceTaxExemption")) {
				selectValueFromList(reasonForServiceTaxExemptionDropDown, polAttributeEngEntity.getStringValueForField("ReasonForServiceTaxExemption"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNameOfSEZLocation")) {
				clearAndSendKeys(nameOfSEZLocationTextField, polAttributeEngEntity.getStringValueForField("NameOfSEZLocation"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWhetherA2CertificateSubmitted")) {
				selectValueFromList(whetherA2CertificateSubmittedDropDown, polAttributeEngEntity.getStringValueForField("WhetherA2CertificateSubmitted"));
			}	
			if (polAttributeEngEntity.getBooleanValueForField("ConfigfillInstallmentPercentageList")) {
				fillInstallmentPercentageList(polAttributeEngEntity,assertReference);
			}	
			if (polAttributeEngEntity.getBooleanValueForField("ConfigA2CertificateNumber")) {
				clearAndSendKeys(a2CertificateNumberTextField, polAttributeEngEntity.getStringValueForField("A2CertificateNumber"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDateOfIssuanceOfA2Certificate")) {
				clearAndEnterDate(dateOfIssuanceOfA2CertificateTextField, polAttributeEngEntity.getStringValueForField("DateOfIssuanceOfA2Certificate"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNameOfTheauthorityIssuingTheA2certificate")) {
				clearAndSendKeys(nameOfTheauthorityIssuingTheA2certificateTextField, polAttributeEngEntity.getStringValueForField("NameOfTheauthorityIssuingTheA2certificate"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDesignationOfTheAuthorityIssuingTheA2Certificate")) {
				clearAndSendKeys(designationOfTheAuthorityIssuingTheA2CertificateTextField, polAttributeEngEntity.getStringValueForField("DesignationOfTheAuthorityIssuingTheA2Certificate"));
			}
			//EF-Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfTheBusiness")) {
				clearAndSendKeys(typeOfTheBusinessTextField, polAttributeEngEntity.getStringValueForField("TypeOfTheBusiness"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfEquipments")) {
				clearAndSendKeys(incurredClaimRatioOfEquipmentsTextField, polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfEquipments"));
			}
			//MB-Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfIndustry")) {
				clearAndSendKeys(typeOfIndustryTextField, polAttributeEngEntity.getStringValueForField("TypeOfIndustry"));
			}
			if(polAttributeEngEntity.getBooleanValueForField("ConfigDoYouWishToInsureTheFoundationOfTheMachinery")){
				selectValueFromList(doYouWishToInsureTheFoundationOfTheMachineryDropDown,polAttributeEngEntity.getStringValueForField("DoYouWishToInsureTheFoundationOfTheMachinery"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigRelevantItemsHavingFoundations")) {
				clearAndSendKeys(relevantItemsHavingFoundationsTextArea, polAttributeEngEntity.getStringValueForField("RelevantItemsHavingFoundations"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineriesMIF3Years")) {
				clearAndSendKeys(incurredClaimRatioOfTheMachineriesMIF3YearsTextField, polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineriesMIF3Years"));
			}
			//BPPI(BP) Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfBusinessBP")) {
				clearAndSendKeys(typeOfBusinessBPTextField, polAttributeEngEntity.getStringValueForField("TypeOfBusinessBP"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineriesBoiler5Years")) {
				clearAndSendKeys(incurredClaimRatioOfTheMachineriesBoiler5YearsTextField, polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineriesBoiler5Years"));
			}
			//CF-Yogesh

			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfBusinessForCPM")) {
				clearAndSendKeys(typeOfBusinessForCPMTextField, polAttributeEngEntity.getStringValueForField("TypeOfBusinessForCPM"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineriesCPM3Years")) {
				clearAndSendKeys(incurredClaimRatioOfTheMachineriesCPM3YearsTextField, polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineriesCPM3Years"));
			}

			//Mayur_Product Name= DS
			if (polAttributeEngEntity.getBooleanValueForField("ConfigAverageClaimRatioInPercentFor5Years")) {
				clearAndSendKeys(averageClaimRatioInPercentFor5YearsTextField, polAttributeEngEntity.getStringValueForField("AverageClaimRatioInPercentFor5Years"));
			}
			//Mayur_Product Name= EC
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfMachineriesCECR5Years")) {
				clearAndSendKeys(incurredClaimRatioOfMachineriesCECR5YearsTextField, polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfMachineriesCECR5Years"));
			}
			//Mayur_Product Name= ET
			if (polAttributeEngEntity.getBooleanValueForField("ConfigSubjectivities")) {
				clearAndSendKeys(subjectivitiesTextArea, polAttributeEngEntity.getStringValueForField("Subjectivities"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigExclusions")) {
				clearAndSendKeys(exclusionsTextArea, polAttributeEngEntity.getStringValueForField("Exclusions"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForPropertyDamage")) {
				clearAndSendKeys(insuredInterestWordingForPropertyDamageTextArea, polAttributeEngEntity.getStringValueForField("InsuredInterestWordingForPropertyDamage"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForBusinessInterruption")) {
				clearAndSendKeys(insuredInterestWordingForBusinessInterruptionTextArea, polAttributeEngEntity.getStringValueForField("InsuredInterestWordingForBusinessInterruption"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				clearAndSendKeys(descriptionOfProjectDescription1TextArea, polAttributeEngEntity.getStringValueForField("DescriptionOfProjectDescription1"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription2")) {
				clearAndSendKeys(descriptionOfProjectDescription2TextArea, polAttributeEngEntity.getStringValueForField("DescriptionOfProjectDescription2"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription3")) {
				clearAndSendKeys(descriptionOfProjectDescription3TextArea, polAttributeEngEntity.getStringValueForField("DescriptionOfProjectDescription3"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWhetherTheLargeRiskProjectIsSituatedInSEZ")) {
				selectValueFromList(whetherTheLargeRiskProjectIsSituatedInSEZDropDown, polAttributeEngEntity.getStringValueForField("WhetherTheLargeRiskProjectIsSituatedInSEZ"));
			}
			//Mayur_Product Name= LE
			if (polAttributeEngEntity.getBooleanValueForField("ConfigStaffOrganisationChartForProjectOwners")) {
				clearAndSendKeys(staffOrganisationChartForProjectOwnersTextArea, polAttributeEngEntity.getStringValueForField("StaffOrganisationChartForProjectOwners"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigBriefDetailsOfExperienceOnPreviousProjects")) {
				clearAndSendKeys(briefDetailsOfExperienceOnPreviousProjectsTextArea, polAttributeEngEntity.getStringValueForField("BriefDetailsOfExperienceOnPreviousProjects"));
			}
			//Mayur_Product Name= LW
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberofYearsForWhichWindmillPackagePolicy")) {
				clearAndSendKeys(numberofYearsForWhichWindmillPackagePolicyIsAvailableClaimHistoryTextField, polAttributeEngEntity.getStringValueForField("NumberofYearsForWhichWindmillPackagePolicy"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberOfYearsForWhichWindmillPackageLOP")) {
				clearAndSendKeys(numberOfYearsForWhichWindmillPackageLOPIsAvailableClaimHistoryTextField, polAttributeEngEntity.getStringValueForField("NumberOfYearsForWhichWindmillPackageLOP"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWindmillPackageExcludingExpiringPolicy")) {
				clearAndSendKeys(incurredClaimRatioOfPolicyAtSubjectLocationCoveredunderWindmillPackageForAvailableNoOfYearsExcludingExpiringPolicyTextField, polAttributeEngEntity.getStringValueForField("WindmillPackageExcludingExpiringPolicy"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWindmillPackageLOPExpiringPolicy")) {
				clearAndSendKeys(incurredClaimRatioOfPolicyAtSubjectLocationCoveredUndeWindmillPackageLOPForAvailableNoOfYearsExcludingExpiringPolicyTextField, polAttributeEngEntity.getStringValueForField("WindmillPackageLOPExpiringPolicy"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWPIForLast5Years")) {
				clearAndSendKeys(WPIForLast5YearsTextField, polAttributeEngEntity.getStringValueForField("WPIForLast5Years"));
			}
			//lm
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberOfYearsForWhichMachInsIsAvail")) {
				clearAndSendKeys(numberOfYearsForWhichMachInsIsAvailClaimhistoryTextField, polAttributeEngEntity.getStringValueForField("NumberOfYearsForWhichMachInsIsAvail"));

			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberOfYearsForWhichMLOPIsAvail")) {
				clearAndSendKeys(numberOfYearsForWhichMLOPIsAvailableClaimhistoryTextField, polAttributeEngEntity.getStringValueForField("NumberOfYearsForWhichMLOPIsAvail"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncuClaimRatioOfPolAtSubLocCovUnderMachIns")) {
				clearAndSendKeys(incuClaimRatioOfPolAtSubLocCovUnderMachInsForAvailTextField, polAttributeEngEntity.getStringValueForField("IncuClaimRatioOfPolAtSubLocCovUnderMachIns"));
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurClaimRatioOfPolAtSubLocCovUnderMLOPAndMB")) {
				clearAndSendKeys(incurClaimRatioOfPolAtSubLocCovUnderMLOPAndMBForAvailTextField, polAttributeEngEntity.getStringValueForField("IncurClaimRatioOfPolAtSubLocCovUnderMLOPAndMB"));
			}

		}

		//*************ER(CHINTAN)*********************
		else if(polAttributeEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("TypeOfPolicy"), fetchValueFromList(typeOfPolicyDropDown),AssertionType.WARNING);
				click(forwordButton);
			}
			else
				click(forwordButton);
			if (polAttributeEngEntity.getBooleanValueForField("ConfigPolicyToBeInsuredInFavor")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("PolicyToBeInsuredInFavor"), fetchValueFromList(policyToBeInsuredInFavorOfDropDown), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}

			//*************AM(CHINTAN)*********************
			if (polAttributeEngEntity.getBooleanValueForField("ConfigReasonForServiceTaxExemption")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("ReasonForServiceTaxExemption"), fetchValueFromList(reasonForServiceTaxExemptionDropDown), AssertionType.WARNING);
			}	
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNameOfSEZLocation")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("NameOfSEZLocation"), fetchValueFromTextFields(nameOfSEZLocationTextField), AssertionType.WARNING);
			}	
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWhetherA2CertificateSubmitted")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("WhetherA2CertificateSubmitted"), fetchValueFromList(whetherA2CertificateSubmittedDropDown), AssertionType.WARNING);
			}	
			if (polAttributeEngEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}

			if (polAttributeEngEntity.getBooleanValueForField("ConfigA2CertificateNumber")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("A2CertificateNumber"), fetchValueFromTextFields(a2CertificateNumberTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDateOfIssuanceOfA2Certificate")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("DateOfIssuanceOfA2Certificate"), fetchValueFromTextFields(dateOfIssuanceOfA2CertificateTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNameOfTheauthorityIssuingTheA2certificate")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("NameOfTheauthorityIssuingTheA2certificate"), fetchValueFromTextFields(nameOfTheauthorityIssuingTheA2certificateTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDesignationOfTheAuthorityIssuingTheA2Certificate")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("DesignationOfTheAuthorityIssuingTheA2Certificate"), fetchValueFromTextFields(designationOfTheAuthorityIssuingTheA2CertificateTextField), AssertionType.WARNING);
			}
			//EF-Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfTheBusiness")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("TypeOfTheBusiness"), fetchValueFromTextFields(typeOfTheBusinessTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfEquipments")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfEquipments"), fetchValueFromTextFields(incurredClaimRatioOfEquipmentsTextField), AssertionType.WARNING);
			}
			//MB-Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfIndustry")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("TypeOfIndustry"), fetchValueFromTextFields(typeOfIndustryTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDoYouWishToInsureTheFoundationOfTheMachinery")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("DoYouWishToInsureTheFoundationOfTheMachinery"), fetchValueFromList(doYouWishToInsureTheFoundationOfTheMachineryDropDown), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigRelevantItemsHavingFoundations")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("RelevantItemsHavingFoundations"), fetchValueFromTextFields(relevantItemsHavingFoundationsTextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineriesMIF3Years")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineriesMIF3Years"), fetchValueFromTextFields(incurredClaimRatioOfTheMachineriesMIF3YearsTextField), AssertionType.WARNING);
			}
			//BPPI(BP) Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfBusinessBP")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("TypeOfBusinessBP"), fetchValueFromTextFields(typeOfBusinessBPTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineriesBoiler5Years")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineriesBoiler5Years"), fetchValueFromTextFields(incurredClaimRatioOfTheMachineriesBoiler5YearsTextField), AssertionType.WARNING);
			}
			//CF-Yogesh
			if (polAttributeEngEntity.getBooleanValueForField("ConfigTypeOfBusinessForCPM")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("TypeOfBusinessForCPM"), fetchValueFromTextFields(typeOfBusinessForCPMTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineriesCPM3Years")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineriesCPM3Years"), fetchValueFromTextFields(incurredClaimRatioOfTheMachineriesCPM3YearsTextField), AssertionType.WARNING);
			}
			//Mayur_Product Name= DS
			if (polAttributeEngEntity.getBooleanValueForField("ConfigAverageClaimRatioInPercentFor5Years")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("AverageClaimRatioInPercentFor5Years"), fetchValueFromTextFields(averageClaimRatioInPercentFor5YearsTextField), AssertionType.WARNING);
			}
			//Mayur_Product Name= EC
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfMachineriesCECR5Years")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncurredClaimRatioOfMachineriesCECR5Years"), fetchValueFromTextFields(incurredClaimRatioOfMachineriesCECR5YearsTextField), AssertionType.WARNING);
			}
			//Mayur_Product Name= ET
			if (polAttributeEngEntity.getBooleanValueForField("ConfigSubjectivities")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("Subjectivities"), fetchValueFromTextFields(subjectivitiesTextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigExclusions")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("Exclusions"), fetchValueFromTextFields(exclusionsTextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForPropertyDamage")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("InsuredInterestWordingForPropertyDamage"), fetchValueFromTextFields(insuredInterestWordingForPropertyDamageTextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigInsuredInterestWordingForBusinessInterruption")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("InsuredInterestWordingForBusinessInterruption"), fetchValueFromTextFields(insuredInterestWordingForBusinessInterruptionTextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription1")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("DescriptionOfProjectDescription1"), fetchValueFromTextFields(descriptionOfProjectDescription1TextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription2")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("DescriptionOfProjectDescription2"), fetchValueFromTextFields(descriptionOfProjectDescription2TextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigDescriptionOfProjectDescription3")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("DescriptionOfProjectDescription3"), fetchValueFromTextFields(descriptionOfProjectDescription3TextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWhetherTheLargeRiskProjectIsSituatedInSEZ")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("WhetherTheLargeRiskProjectIsSituatedInSEZ"), fetchValueFromList(whetherTheLargeRiskProjectIsSituatedInSEZDropDown), AssertionType.WARNING);
			}
			//Mayur_Product Name= LE
			if (polAttributeEngEntity.getBooleanValueForField("ConfigStaffOrganisationChartForProjectOwners")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("StaffOrganisationChartForProjectOwners"), fetchValueFromTextFields(staffOrganisationChartForProjectOwnersTextArea), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigBriefDetailsOfExperienceOnPreviousProjects")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("BriefDetailsOfExperienceOnPreviousProjects"), fetchValueFromTextFields(briefDetailsOfExperienceOnPreviousProjectsTextArea), AssertionType.WARNING);
			}
			//Mayur_Product Name= LW
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberofYearsForWhichWindmillPackagePolicy")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("NumberofYearsForWhichWindmillPackagePolicy"), fetchValueFromTextFields(numberofYearsForWhichWindmillPackagePolicyIsAvailableClaimHistoryTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberOfYearsForWhichWindmillPackageLOP")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("NumberOfYearsForWhichWindmillPackageLOP"), fetchValueFromTextFields(numberOfYearsForWhichWindmillPackageLOPIsAvailableClaimHistoryTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWindmillPackageExcludingExpiringPolicy")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("WindmillPackageExcludingExpiringPolicy"), fetchValueFromTextFields(incurredClaimRatioOfPolicyAtSubjectLocationCoveredunderWindmillPackageForAvailableNoOfYearsExcludingExpiringPolicyTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWindmillPackageLOPExpiringPolicy")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("WindmillPackageLOPExpiringPolicy"), fetchValueFromTextFields(incurredClaimRatioOfPolicyAtSubjectLocationCoveredUndeWindmillPackageLOPForAvailableNoOfYearsExcludingExpiringPolicyTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigWPIForLast5Years")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("WPIForLast5Years"), fetchValueFromTextFields(WPIForLast5YearsTextField), AssertionType.WARNING);
			}
			//lm
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberOfYearsForWhichMachInsIsAvail")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("NumberOfYearsForWhichMachInsIsAvail"), fetchValueFromTextFields(numberOfYearsForWhichMachInsIsAvailClaimhistoryTextField), AssertionType.WARNING);

			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigNumberOfYearsForWhichMLOPIsAvail")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("NumberOfYearsForWhichMLOPIsAvail"), fetchValueFromTextFields(numberOfYearsForWhichMLOPIsAvailableClaimhistoryTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncuClaimRatioOfPolAtSubLocCovUnderMachIns")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncuClaimRatioOfPolAtSubLocCovUnderMachIns"), fetchValueFromTextFields(incuClaimRatioOfPolAtSubLocCovUnderMachInsForAvailTextField), AssertionType.WARNING);
			}
			if (polAttributeEngEntity.getBooleanValueForField("ConfigIncurClaimRatioOfPolAtSubLocCovUnderMLOPAndMB")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("IncurClaimRatioOfPolAtSubLocCovUnderMLOPAndMB"), fetchValueFromTextFields(incurClaimRatioOfPolAtSubLocCovUnderMLOPAndMBForAvailTextField), AssertionType.WARNING);
			}

		}

	}
	//*************AM(CHINTAN)*********************
	public void clickOnOpenButton(PolAttributeEngEntity polAttributeEngEntity) throws InterruptedException{
		if (polAttributeEngEntity.getBooleanValueForField("ConfigOpenAmButton")){
			click(openAmButton);
			Thread.sleep(5000);
			switchToWindow("Installment Percentage List");
		}
	}
	//*************AM(CHINTAN)*********************
	public void fillInstallmentPercentageList(PolAttributeEngEntity polAttributeEngEntity,CustomAssert assertReference) throws InterruptedException{

		clickOnOpenButton(polAttributeEngEntity);
		installmentPercentageTextField=new PageElement(By.name("Data_210784827092009_0"), "InstallmentPercentage text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		if(polAttributeEngEntity.getBooleanValueForField("ConfigInstallmentPercentage")) {
			clearAndSendKeys(installmentPercentageTextField, polAttributeEngEntity.getStringValueForField("InstallmentPercentage"));
		}

		if(polAttributeEngEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveWindowButton);
			switchToFrame("display");
		}
		if(polAttributeEngEntity.getBooleanValueForField("ConfigCloseButton")) {
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		if(polAttributeEngEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteWindowButton);
			switchToFrame("display");
		}
	}
	//*******

	public void proceedToT2CLRForHealthProducts(PolAttributeEngEntity polAttributeEngEntity){
		if (polAttributeEngEntity.getBooleanValueForField("ConfigProceedButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			if(!polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("WP")){
				nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeEngEntity.getStringValueForField("PolicyAttributeTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				isElementDisplayed(nextPageTitle);

			}
		}
	}	

	//OLD(modified)chintan

	public void navigateToPolicyTab(PolAttributeEngEntity polAttributeEngEntity){
		if (polAttributeEngEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}
	public void navigateToAttributeTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToInsuredInterest(PolAttributeEngEntity polAttributeEngEntity){
		if (polAttributeEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverageTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}
	public void navigateToClientDetailTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){

			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(schemeDetailTitle);
		}
	}

	public void navigateToRelationsTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToDetailTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigDetailTab")){
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTitle);
		}
	}
	public void navigateToAttributesTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitlePage);
		}
	}
	public void navigateToAttachCoveragesTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestCoverageTitle));
			return;
		}
	}
	public void navigateToMemRelationsTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(memberRelationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitlePage));
			return;
		}
	}
	public void navigateToMemPaymentsTab(PolAttributeEngEntity polAttributeEngEntity){
		if(polAttributeEngEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(memberPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}

	public void fillCoInsuranceDetails(PolAttributeEngEntity polAttributeEngEntity,CustomAssert assertReference) {
		if(polAttributeEngEntity.getAction().equalsIgnoreCase("add") || polAttributeEngEntity.getAction().equalsIgnoreCase("edit")){
			//DF-shruti
			if (polAttributeEngEntity.getBooleanValueForField("ConfigCoInsuranceApplicableCF")) {
				selectValueFromList(coInsuranceApplicableDropDown, polAttributeEngEntity.getStringValueForField("CoInsuranceApplicableCF"));
			}
			
			click(forwardButton);
			switchToFrame("display");
			coInsuranceTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeEngEntity.getStringValueForField("CoInsuranceTitle")+"')]"), "Co insurance Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(coInsuranceTitle);
			
		}
		else if(polAttributeEngEntity.getAction().equalsIgnoreCase("verify")){
			//DF-shruti
			if (polAttributeEngEntity.getBooleanValueForField("ConfigCoInsuranceApplicableCF")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("CoInsuranceApplicableCF"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			click(forwardButton);
			switchToFrame("display");
			coInsuranceTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeEngEntity.getStringValueForField("CoInsuranceTitle")+"')]"), "Co insurance Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(coInsuranceTitle);
		}

	}
	public void fillOpertunityIdDetails(PolAttributeEngEntity polAttributeEngEntity,CustomAssert assertReference) {
		if(polAttributeEngEntity.getAction().equalsIgnoreCase("add") || polAttributeEngEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttributeEngEntity.getBooleanValueForField("ConfigOpportunityIdWP")) {
				click(forwardButton);
				clearAndSendKeys(opportunityIdTextField, polAttributeEngEntity.getStringValueForField("OpportunityIdWP"));
			}
			if(!(polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("WP"))) {
			click(forwardButton);
			switchToFrame("display");
			opertunityidTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeEngEntity.getStringValueForField("OpertunityIdTitle")+"')]"), "Opertunity Id Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(opertunityidTitle);
			}
		}
		else if(polAttributeEngEntity.getAction().equalsIgnoreCase("verify")){

			if (polAttributeEngEntity.getBooleanValueForField("ConfigOpportunityIdWP")) {
				assertReference.assertEquals(polAttributeEngEntity.getStringValueForField("OpportunityIdWP"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}
			click(forwardButton);
			switchToFrame("display");
			opertunityidTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeEngEntity.getStringValueForField("OpertunityIdTitle")+"')]"), "Opertunity Id Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(opertunityidTitle);
		}
	}


	public void fillandSubmitAttributeEngineering (PolAttributeEngEntity polAttributeEngEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(polAttributeEngEntity.getConfigExecute())){
			switchToFrame("display");
			if(polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("WP")){	
				fillOpertunityIdDetails(polAttributeEngEntity, assertReference);
			}
			fillPolicyAttributeEngineeringDetails(polAttributeEngEntity, assertReference);
			proceedToT2CLRForHealthProducts(polAttributeEngEntity);
			if(polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("CF")||polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("BPPI")||polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("MB") || polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("CM")|| polAttributeEngEntity.getStringValueForField("Product").equalsIgnoreCase("DS")){	
				fillCoInsuranceDetails(polAttributeEngEntity, assertReference);
			}
			navigateToPolicyTab(polAttributeEngEntity);
			navigateToAttributeTab(polAttributeEngEntity);
			navigateToInsuredInterest(polAttributeEngEntity);
			navigateToCoverageTab(polAttributeEngEntity);
			navigateToClientDetailTab(polAttributeEngEntity);
			navigateToRelationsTab(polAttributeEngEntity);
			navigateToPaymentsTab(polAttributeEngEntity);
			navigateToFollowupTab(polAttributeEngEntity);
			navigateToDocumentTab(polAttributeEngEntity);
			navigateToDetailTab(polAttributeEngEntity);
			navigateToAttributesTab(polAttributeEngEntity);
			navigateToAttachCoveragesTab(polAttributeEngEntity);
			navigateToRelationsTab(polAttributeEngEntity);
			navigateToPaymentsTab(polAttributeEngEntity);
		}
	}
}







