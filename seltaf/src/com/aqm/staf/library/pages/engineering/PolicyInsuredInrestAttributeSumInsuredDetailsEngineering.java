package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntAttrSIDEngEntity;

public class PolicyInsuredInrestAttributeSumInsuredDetailsEngineering extends BasePage {
	//MB-Yogesh
	private PageElement excessAmountMBTextField;
	//EF-Yogesh
	private PageElement whetherTheDeletionOfFireAndAlliedPerilsRequiredDropDown;
	private PageElement deletionIsRequiredForDropDown;
	//BP-Yogesh
	private PageElement incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderBoilerForLast5YearsIncludingTheExpiringPolicyTextField;
	private PageElement loadingForBoilerTextField;
	//CF-Yogesh
	private PageElement incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderCPMForLast3YearsIncludingTheExpiringPolicyTextField;

	//EI-Repeated with EF

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
	private PageElement saveButton;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	//*************ER(CHINTAN)2ND PAGE *********************
	private PageElement invoiceCostOfImportedItemsTextField;
	private PageElement exchangeRate1TextField;
	private PageElement customDuty1TextField;
	private PageElement freightInsuranceHandlingClearingForwardingChargesUptoFactoryTextField;
	private PageElement landedCostOfImportedItemsTextField;
	private PageElement	escalationPercentageForImportedItemsTextField;
	private PageElement	escalationValueForImportedItemsTextField;
	private PageElement	landedCostOfIndegenousItemTextField;
	private PageElement	exciseDutyTextField;
	private PageElement	totalValueOfIndigenousItemsTextField;
	private PageElement	escalationPercentageForIndigenousItemsTextField;
	private PageElement	escalationValueForIndigenousItemsTextField;
	private PageElement	costOfErectionTextField;
	private PageElement	permanentCivilWorkTextField;
	private PageElement	escalationPercentageForPermanentCivilWorkTextField;
	private PageElement	escalationValueForPermanentCivilWorkTextField;
	private PageElement temporaryCivilWorkTextField;
	private PageElement	totalSumInsuredNewMachineTextField;
	private PageElement	isThereAnyUsedSecondHandMachineryTextField;
	private PageElement	totalProjectSumInsuredTextField;
	private PageElement escalationPercentageForCostOfErectionTextField;
	private PageElement escalationValueForCostOfErectionTextField;
	private PageElement totalEscalationValueTextField;
	private PageElement policyExcessIncreasedToDropDown;
	private PageElement earthquakeExcessIncreasedToDropDown;


	//*************CR(CHINTAN)2ND PAGE *********************
	private PageElement	materialSuppliedByPrincipalTextField;
	private PageElement	contractValueTextField;
	private PageElement	anyAdditionalItemTextField;
	private PageElement	description1ForAnyAdditionalItemTextField;
	private PageElement	escalationPercentageForContractTextField;
	private PageElement	escalationValueForContractTextField;
	private PageElement	escalationPercentageForMaterialSuppliedByPrincipalTextField;	
	private PageElement	escalationValueForMaterialSuppliedByPrincipalTextField;	
	private PageElement escalationPercentageForAnyAdditionalItemTextField;
	private PageElement	escalationValueForAnyAdditionalItemTextField;
	//*************CM(CHINTAN)2ND PAGE *********************
	private PageElement	incurredClaimratioofTheMachineriesAtTheSubjectLocationTextField;
	private PageElement	loadingForCPMTextField;
	//Mayur_ Product Name= EC
	private PageElement incurredClaimRatioOfMachineriesAtSubjectLocationCoveredUnderCECRForLast5YearsIncludingExpiringPolicyTextField;
	private PageElement projectTypeDropDown;
	private PageElement projectLocationDropDown;
	private PageElement earthquakeProtectionDesignDropDown;
	private PageElement neighborhoodDropDown;
	private PageElement maintenanceOfPropertyDropDown;
	private PageElement fireFightingFacilitiesDropDown;	
	private PageElement publicOrOwnFireStationDropDown;
	private PageElement securityArrangementsDropDown;
	private PageElement communicationFacilityAtSiteDropDown;
	private PageElement maintenanceDepartmentDropDown;
	private PageElement effectivePointsEarnedTextField;
	//Mayur_ Product Name= ET
	private PageElement isThePropertySurroundedByOtherPropertyDropDown;
	private PageElement directionInWhichItIsSurroundedParticularsEastTextArea;
	private PageElement directionInWhichItIsSurroundedParticularsWestTextArea;
	private PageElement directionInWhichItIsSurroundedParticularsSouthTextArea;
	private PageElement directionInWhichItIsSurroundedParticularsNorthTextArea;
	private PageElement isThePropertyProtectedWithCompoundWallFencesDropDown;
	private PageElement isItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgencyDropDown;
	private PageElement detailsOfSecurityPersonnelOrAgencyTextArea;
	private PageElement detailsOfAlarmSystemCCTVEtcTextArea;
	private PageElement detailsOfKeySystemsAndControlTextArea;
	private PageElement detailsOfAccessControlProcedureAndEquipmentTextArea;
	private PageElement whetherSecurityGuardsAreArmedDropDown;
	private PageElement areThereGovernmentSecurityEstablishmentNearbyDropDown;
	private PageElement detailOfGovernmentSecurityEstablishmentTextArea;
	//ALOP
	private PageElement grossProfitTextField;
	private PageElement sumInsuredForAFTextField;
	private PageElement agreedOptedTimeExcessInWeeks;
	private PageElement indemnityPeriodInMonthsForAFTextField;
	private PageElement maximumProbableDelayMPDInMonthsTextField;
	private PageElement netRateOfThePolicyTextField;
	//nilesh-DS
		private PageElement IscoldStrgInstBefore1999DropDown;
		private PageElement DesinedStrgCapctyQuintlsTextField;
		private PageElement MaximumStocOfGoodsDurngSeasonTextField;
		private PageElement AveragePriceAgreedTextField;
		private PageElement SIOfStocksToBeInsuredTextField;
		private PageElement DoYouReqExtForFailOfPubElecSuplyDropDown;
		private PageElement WhetherPolicyIsRequiredOnDeclBasisDropDown;
		//Nilesh-ME
		private PageElement transporterNameTextArea;
		
		//ER
		private PageElement coverValidUptoTextField;
		
	public PolicyInsuredInrestAttributeSumInsuredDetailsEngineering(WebDriver driver, String pageName) {
		super(driver, pageName);
		//MB-Yogesh
		excessAmountMBTextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess Amount(MB)')]/following::input"),"Excess Amount(MB) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EF-Yogesh
		whetherTheDeletionOfFireAndAlliedPerilsRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether the deletion of fire and allied perils required')]/following::select"),"Whether the deletion of fire and allied perils required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deletionIsRequiredForDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Deletion is required for')]/following::select"),"Deletion is required for DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BP-Yogesh
		incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderBoilerForLast5YearsIncludingTheExpiringPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim ratio of the machineries at the subject Location covered under Boiler for last 5 years Including the expiring policy')]/following::input"),"Incurred Claim ratio of the machineries at the subject Location covered under Boiler for last 5 years Including the expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingForBoilerTextField=new PageElement(By.xpath("//td/div[contains(text(),'Loading for Boiler')]/following::input"),"Loading for Boiler TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CF-Yogesh
		incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderCPMForLast3YearsIncludingTheExpiringPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim ratio of the machineries at the subject Location covered under CPM for last 3 years Including the expiring policy')]/following::input"),"Incurred Claim ratio of the machineries at the subject Location covered under CPM for last 3 years Including the expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loadingForCPMTextField=new PageElement(By.xpath("//td/div[contains(text(),'Loading for CPM')]/following::input"),"Loading for CPM TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

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

		invoiceCostOfImportedItemsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Invoice Cost of Imported Items')]/following::input")," Invoice Cost of Imported Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exchangeRate1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Exchange Rate1')]/following::input"),"Exchange Rate1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		customDuty1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Custom Duty1')]/following::input"),"Custom Duty1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		freightInsuranceHandlingClearingForwardingChargesUptoFactoryTextField= new PageElement(By.xpath("//td/div[contains(text(),'Freight,Insurance,handling,clearing,forwarding charges upto factory')]/following::input"),"Freight,Insurance,handling,clearing,forwarding charges upto factory", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		landedCostOfImportedItemsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Landed Cost of Imported Items')]/following::input"),"Landed Cost of Imported Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForImportedItemsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage for Imported Items')]/following::input"),"Escalation Percentage for Imported Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationValueForImportedItemsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation value for Imported Items')]/following::input"),"Escalation value for Imported Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		landedCostOfIndegenousItemTextField=new PageElement(By.xpath("//td/div[contains(text(),'Landed Cost of Indegenous Item')]/following::input"),"Landed Cost of Indegenous Item", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exciseDutyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Excise Duty')]/following::input"),"Excise Duty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalValueOfIndigenousItemsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total value of Indigenous Items')]/following::input"),"Total value of Indigenous Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForIndigenousItemsTextField= new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage for Indigenous Items')]/following::input"),"Escalation Percentage for Indigenous Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationValueForIndigenousItemsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation value for Indigenous Items')]/following::input"),"Escalation value for Indigenous Items", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		costOfErectionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cost of erection')]/following::input"),"Cost of erection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		permanentCivilWorkTextField=new PageElement(By.xpath("//td/div[contains(text(),'Permanent Civil work')]/following::input"),"Permanent Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForPermanentCivilWorkTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage for Permanent Civil work')]/following::input"),"Escalation Percentage for Permanent Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationValueForPermanentCivilWorkTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation value for Permanent Civil work')]/following::input"),"Escalation value for Permanent Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		temporaryCivilWorkTextField=new PageElement(By.xpath("//td/div[contains(text(),'Temporary Civil work')]/following::input"),"Temporary Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredNewMachineTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Sum Insured (New Machine)')]/following::input"),"Total Sum Insured (New Machine)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isThereAnyUsedSecondHandMachineryTextField=new PageElement(By.xpath("//td/div[contains(text(),'Is there any Used/Second hand Machinery')]/following::input"),"Is there any Used/Second hand Machinery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalProjectSumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Project Sum Insured')]/following::input"),"Total Project Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForCostOfErectionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage for Cost of erection')]/following::input"),"Escalation Percentage for Cost of erection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationValueForCostOfErectionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation value for Cost of erection')]/following::input"),"Escalation value for Cost of erection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalEscalationValueTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Escalation Value')]/following::input"),"Total Escalation Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyExcessIncreasedToDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Policy Excess Increased To')]/following::select"),"Policy Excess Increased To", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeExcessIncreasedToDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Earthquake Excess Increased To')]/following::select"),"Earthquake Excess Increased To", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	

		//*************CR(CHINTAN)2ND PAGE *********************
		materialSuppliedByPrincipalTextField=new PageElement(By.xpath("//td/div[contains(text(),'Material Supplied by Principal')]/following::input"),"Material Supplied by Principal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		contractValueTextField=new PageElement(By.xpath("//td/div[contains(text(),'Contract Value')]/following::input"),"Contract Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyAdditionalItemTextField=new PageElement(By.xpath("//td/div[contains(text(),'Any Additional Item')]/following::input"),"Any Additional Item", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		description1ForAnyAdditionalItemTextField=new PageElement(By.xpath("//td/div[contains(text(),'Description 1 for Any Additional Item')]/following::TextArea"),"Description 1 for Any Additional Item", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForContractTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage for Contract')]/following::input"),"Escalation Percentage for Contract", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationValueForContractTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Value for Contract')]/following::input"),"Escalation Value for Contract", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForMaterialSuppliedByPrincipalTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage for Material Supplied By Principal')]/following::input"),"Escalation Percentage for Material Supplied By Principal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationValueForMaterialSuppliedByPrincipalTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Value for Material Supplied By Principal')]/following::input"),"Escalation Value for Material Supplied By Principal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		escalationPercentageForAnyAdditionalItemTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Percentage For Any Additional Item')]/following::input"),"Escalation Percentage For Any Additional Item", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		escalationValueForAnyAdditionalItemTextField=new PageElement(By.xpath("//td/div[contains(text(),'Escalation Value For Any Additional Item')]/following::input"),"Escalation Value For Any Additional Item", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//*************ME AND ER SAME(CHINTAN)2ND PAGE *********************

		//*************CM(CHINTAN)2ND PAGE *********************
		//incurredClaimratioofTheMachineriesAtTheSubjectLocationTextField=new PageElement(By.xpath("//td/div[contains(text(),'')]/following::input"),"", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//loadingForCPMTextField=new PageElement(By.xpath("//td/div[contains(text(),'')]/following::input"),"", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_ Product Name= EC
		incurredClaimRatioOfMachineriesAtSubjectLocationCoveredUnderCECRForLast5YearsIncludingExpiringPolicyTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Incurred Claim ratio of machineries at subject Location covered under CECR')]/following::input"), "Incurred Claim ratio of machineries at subject Location covered under CECR for last 5 years Including expiring policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		projectTypeDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Project Type')]/following::select"), "Project Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		projectLocationDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Project Location')]/following::select"), "Project Location DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeProtectionDesignDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Earthquake Protection Design')]/following::select"), "Earthquake Protection Design DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		neighborhoodDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Neighborhood')]/following::select"), "Neighborhood DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		maintenanceOfPropertyDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Maintenance of Property')]/following::select"), " Maintenance of Property DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fireFightingFacilitiesDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Fire Fighting Facilities')]/following::select"), "Fire Fighting Facilities DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		publicOrOwnFireStationDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Public or Own Fire Station')]/following::select"), "Public or Own Fire Station DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		securityArrangementsDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Security Arrangements')]/following::select"), "Security Arrangements DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		communicationFacilityAtSiteDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Communication Facility at site')]/following::select"), "Communication Facility at site DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		maintenanceDepartmentDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Maintenance Department')]/following::select"), "Maintenance Department DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		effectivePointsEarnedTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Effective Points Earned')]/following::input"), "Effective Points Earned TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_ Product Name= ET
		isThePropertySurroundedByOtherPropertyDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Project Type')]/following::select"), "Is the property protected with compound wall / fences DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		directionInWhichItIsSurroundedParticularsEastTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Direction in which it is surrounded / Particulars (East)')]/following::TextArea"), "Direction in which it is surrounded / Particulars (East) TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		directionInWhichItIsSurroundedParticularsWestTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Direction in which it is surrounded / Particulars (West)')]/following::TextArea"), "Direction in which it is surrounded / Particulars (West) TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		directionInWhichItIsSurroundedParticularsSouthTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Direction in which it is surrounded / Particulars (South)')]/following::TextArea"), "Direction in which it is surrounded / Particulars (South) TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		directionInWhichItIsSurroundedParticularsNorthTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Direction in which it is surrounded / Particulars (North)')]/following::TextArea"), "Direction in which it is surrounded / Particulars (North) TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isThePropertyProtectedWithCompoundWallFencesDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Is the property protected with compound wall / fences')]/following::select"), "Is the property protected with compound wall / fences DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgencyDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Is it manned by exclusive security personnel of the insured or agency')]/following::select"), "Is it manned by exclusive security personnel of the insured or agency DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfSecurityPersonnelOrAgencyTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Details of Security personnel or agency')]/following::TextArea"), "Details of Security personnel or agency TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfAlarmSystemCCTVEtcTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Details of Security personnel or agency')]/following::TextArea"), "Details of Security personnel or agency TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfKeySystemsAndControlTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Details of Security personnel or agency')]/following::TextArea"), "Details of Security personnel or agency TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfAccessControlProcedureAndEquipmentTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Details of Security personnel or agency')]/following::TextArea"), "Details of Security personnel or agency TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherSecurityGuardsAreArmedDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Whether security guards are armed')]/following::select"), "Whether security guards are armed DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		areThereGovernmentSecurityEstablishmentNearbyDropDown= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Are there Government security establishment nearby')]/following::select"), "Are there Government security establishment nearby DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailOfGovernmentSecurityEstablishmentTextArea= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Details of Security personnel or agency')]/following::TextArea"), "Details of Security personnel or agency TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//ALOP
		grossProfitTextField = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Gross Profit')]/following::input"), "Gross Profit TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForAFTextField = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Sum Insured for AF')]/following::input"), "Sum Insured for AF TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreedOptedTimeExcessInWeeks = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Agreed/Opted Time Excess(in weeks)')]/following::input"), "Agreed/Opted Time Excess(in weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodInMonthsForAFTextField = new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Indemnity Period (in Months) for AF')]/following::input"), "Indemnity Period (in Months) for AF TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumProbableDelayMPDInMonthsTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Maximum Probable Delay(MPD)(In Months)')]/following::input"), "Maximum Probable Delay(MPD)(In Months) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netRateOfThePolicyTextField= new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Net Rate of the Policy')]/following::input"), "Net Rate of the Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//nilesh-DS
		
		IscoldStrgInstBefore1999DropDown=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Is cold storage is installed before the season commencing in the year 1999')]/following::select"), "Is cold storage is installed before the season commencing in the year 1999 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		DesinedStrgCapctyQuintlsTextField=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Designed Storage Capacity(Quintals)')]/following::input"), "Designed Storage Capacity(Quintals) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MaximumStocOfGoodsDurngSeasonTextField=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Maximum Stock of Goods Stored by insured at any time during the Season(Quintals)')]/following::input"), "Maximum Stock of Goods Stored by insured at any time during the Season(Quintals) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		AveragePriceAgreedTextField=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Average Price agreed(Rs) at the time of Storage at which Stock to be insured(price should include storage charges)')]/following::input"), "Average Price agreed(Rs) at the time of Storage at which Stock to be insured(price should include storage charges) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SIOfStocksToBeInsuredTextField=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'The SI of Stock to be insured')]/following::input"), "The SI of Stock to be insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DoYouReqExtForFailOfPubElecSuplyDropDown=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Do you require extension for accidental failure of public electric supply')]/following::select"), "Do you require extension for accidental failure of public electric supply DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WhetherPolicyIsRequiredOnDeclBasisDropDown=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Whether Policy is required on Declaration Basis')]/following::select"), "Whether Policy is required on Declaration Basis DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transporterNameTextArea=new PageElement(By.xpath("//form[@name='S0042']//td//div[contains(text(),'Transporter Name')]/following::TextArea"), "Transporter Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	}

	public void fillPolicyInsuredInrestAttributeSumInsuredDetailsEngineering(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntAttrSIDEngEntity.getAction().equalsIgnoreCase("add") || polInsIntAttrSIDEngEntity.getAction().equalsIgnoreCase("edit")){
			//EF-yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigWhetherTheDeletionOfFireAndAlliedPerilsRequired")) {
				selectValueFromList(whetherTheDeletionOfFireAndAlliedPerilsRequiredDropDown,polInsIntAttrSIDEngEntity.getStringValueForField("WhetherTheDeletionOfFireAndAlliedPerilsRequired"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDeletionIsRequiredFor")) {
				selectValueFromList(deletionIsRequiredForDropDown,polInsIntAttrSIDEngEntity.getStringValueForField("DeletionIsRequiredFor"));
			}
			//BP-Yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineAtTheSubtLocCovUnderBoilerForLast5Years")) {
				clearAndSendKeys(incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderBoilerForLast5YearsIncludingTheExpiringPolicyTextField, polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineAtTheSubtLocCovUnderBoilerForLast5Years"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoadingForBoiler")) {
				clearAndSendKeys(loadingForBoilerTextField, polInsIntAttrSIDEngEntity.getStringValueForField("LoadingForBoiler"));
			}
			//CF-Yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineAtTheSubLocCovUnderCPMForLast3Years")) {
				clearAndSendKeys(incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderCPMForLast3YearsIncludingTheExpiringPolicyTextField, polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineAtTheSubLocCovUnderCPMForLast3Years"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoadingForCPM")) {
				clearAndSendKeys(loadingForCPMTextField, polInsIntAttrSIDEngEntity.getStringValueForField("LoadingForCPM"));
			}

			//*************ER(CHINTAN)2ND PAGE *********************

			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigInvoiceCostOfImportedItems")) {
				clearAndSendKeys(invoiceCostOfImportedItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("InvoiceCostOfImportedItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigExchangeRate1")) {
				clearAndSendKeys(exchangeRate1TextField, polInsIntAttrSIDEngEntity.getStringValueForField("ExchangeRate1"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCustomDuty1")) {
				clearAndSendKeys(customDuty1TextField, polInsIntAttrSIDEngEntity.getStringValueForField("CustomDuty1"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigFreightInsuranceHandlingClearingForwardingChargesUptoFactory")) {
				clearAndSendKeys(freightInsuranceHandlingClearingForwardingChargesUptoFactoryTextField, polInsIntAttrSIDEngEntity.getStringValueForField("FreightInsuranceHandlingClearingForwardingChargesUptoFactory"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLandedCostOfImportedItems")) {
				clearAndSendKeys(landedCostOfImportedItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("LandedCostOfImportedItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForImportedItems")) {
				clearAndSendKeys(escalationPercentageForImportedItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForImportedItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForImportedItems")) {
				clearAndSendKeys(escalationValueForImportedItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForImportedItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLandedCostOfIndegenousItem")) {
				clearAndSendKeys(landedCostOfIndegenousItemTextField, polInsIntAttrSIDEngEntity.getStringValueForField("LandedCostOfIndegenousItem"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigExciseDuty")) {
				clearAndSendKeys(exciseDutyTextField, polInsIntAttrSIDEngEntity.getStringValueForField("ExciseDuty"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalValueOfIndigenousItems")) {
				clearAndSendKeys(totalValueOfIndigenousItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("TotalValueOfIndigenousItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForIndigenousItems")) {
				clearAndSendKeys(escalationPercentageForIndigenousItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForIndigenousItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForIndigenousItems")) {
				clearAndSendKeys(escalationValueForIndigenousItemsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForIndigenousItems"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCostOfErection")) {
				clearAndSendKeys(costOfErectionTextField, polInsIntAttrSIDEngEntity.getStringValueForField("CostOfErection"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPermanentCivilWork")) {
				clearAndSendKeys(permanentCivilWorkTextField, polInsIntAttrSIDEngEntity.getStringValueForField("PermanentCivilWork"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForPermanentCivilWork")) {
				clearAndSendKeys(escalationPercentageForPermanentCivilWorkTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForPermanentCivilWork"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForPermanentCivilWork")) {
				clearAndSendKeys(escalationValueForPermanentCivilWorkTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForPermanentCivilWork"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTemporaryCivilWork")) {
				clearAndSendKeys(temporaryCivilWorkTextField, polInsIntAttrSIDEngEntity.getStringValueForField("TemporaryCivilWork"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalSumInsuredNewMachine")) {
				clearAndSendKeys(totalSumInsuredNewMachineTextField, polInsIntAttrSIDEngEntity.getStringValueForField("TotalSumInsuredNewMachine"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsThereAnyUsedSecondHandMachinery")) {
				clearAndSendKeys(isThereAnyUsedSecondHandMachineryTextField, polInsIntAttrSIDEngEntity.getStringValueForField("IsThereAnyUsedSecondHandMachinery"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalProjectSumInsured")) {
				clearAndSendKeys(totalProjectSumInsuredTextField, polInsIntAttrSIDEngEntity.getStringValueForField("TotalProjectSumInsured"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForCostOfErection")) {
				clearAndSendKeys(escalationPercentageForCostOfErectionTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForCostOfErection"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForCostOfErection")) {
				clearAndSendKeys(escalationValueForCostOfErectionTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForCostOfErection"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalEscalationValue")) {
				clearAndSendKeys(totalEscalationValueTextField, polInsIntAttrSIDEngEntity.getStringValueForField("TotalEscalationValue"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPolicyExcessIncreasedTo")) {
				selectValueFromList(policyExcessIncreasedToDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("PolicyExcessIncreasedTo"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEarthquakeExcessIncreasedTo")) {
				selectValueFromList(earthquakeExcessIncreasedToDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("EarthquakeExcessIncreasedTo"));
			}
			//*************CR(CHINTAN)2ND PAGE *********************	
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaterialSuppliedByPrincipal")) {
				clearAndSendKeys(materialSuppliedByPrincipalTextField, polInsIntAttrSIDEngEntity.getStringValueForField("MaterialSuppliedByPrincipal"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigContractValue")) {
				clearAndSendKeys(contractValueTextField, polInsIntAttrSIDEngEntity.getStringValueForField("ContractValue"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAnyAdditionalItem")) {
				clearAndSendKeys(anyAdditionalItemTextField, polInsIntAttrSIDEngEntity.getStringValueForField("AnyAdditionalItem"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDescription1ForAnyAdditionalItem")) {
				clearAndSendKeys(description1ForAnyAdditionalItemTextField, polInsIntAttrSIDEngEntity.getStringValueForField("Description1ForAnyAdditionalItem"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForContract")) {
				clearAndSendKeys(escalationPercentageForContractTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForContract"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForContract")) {
				clearAndSendKeys(escalationValueForContractTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForContract"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForMaterialSuppliedByPrincipal")) {
				clearAndSendKeys(escalationPercentageForMaterialSuppliedByPrincipalTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForMaterialSuppliedByPrincipal"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForMaterialSuppliedByPrincipal")) {
				clearAndSendKeys(escalationValueForMaterialSuppliedByPrincipalTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForMaterialSuppliedByPrincipal"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForAnyAdditionalItem")) {
				clearAndSendKeys(escalationPercentageForAnyAdditionalItemTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForAnyAdditionalItem"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForAnyAdditionalItem")) {
				clearAndSendKeys(escalationValueForAnyAdditionalItemTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForAnyAdditionalItem"));
			}
			//*************CM(CHINTAN)2ND PAGE *********************
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimratioofTheMachineriesAtTheSubjectLocation")) {
				clearAndSendKeys(incurredClaimratioofTheMachineriesAtTheSubjectLocationTextField, polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimratioofTheMachineriesAtTheSubjectLocation"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoadingForCPM")) {
				clearAndSendKeys(loadingForCPMTextField, polInsIntAttrSIDEngEntity.getStringValueForField("LoadingForCPM"));
			}	
			//Mayur_ Product Name= EC
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfMachineAtSubjectLocCovUnderCECRForLast5Years")) {
				clearAndSendKeys(incurredClaimRatioOfMachineriesAtSubjectLocationCoveredUnderCECRForLast5YearsIncludingExpiringPolicyTextField, polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimRatioOfMachineAtSubjectLocCovUnderCECRForLast5Years"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigProjectType")) {
				selectValueFromList(projectTypeDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("ProjectType"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigProjectLocation")) {
				selectValueFromList(projectLocationDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("ProjectLocation"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEarthquakeProtectionDesign")) {
				selectValueFromList(earthquakeProtectionDesignDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("EarthquakeProtectionDesign"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigNeighborhood")) {
				selectValueFromList(neighborhoodDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("Neighborhood"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaintenanceOfProperty")) {
				selectValueFromList(maintenanceOfPropertyDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("MaintenanceOfProperty"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigFireFightingFacilities")) {
				selectValueFromList(fireFightingFacilitiesDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("FireFightingFacilities"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPublicOrOwnFireStation")) {
				selectValueFromList(publicOrOwnFireStationDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("PublicOrOwnFireStation"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigSecurityArrangements")) {
				selectValueFromList(securityArrangementsDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("SecurityArrangements"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCommunicationFacilityAtSite")) {
				selectValueFromList(communicationFacilityAtSiteDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("CommunicationFacilityAtSite"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaintenanceDepartment")) {
				selectValueFromList(maintenanceDepartmentDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("MaintenanceDepartment"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEffectivePointsEarned")) {
				clearAndSendKeys(effectivePointsEarnedTextField, polInsIntAttrSIDEngEntity.getStringValueForField("EffectivePointsEarned"));
			}
			//Mayur_ Product Name= ET
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsThePropertySurroundedByOtherProperty")) {
				selectValueFromList(isThePropertySurroundedByOtherPropertyDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("IsThePropertySurroundedByOtherProperty"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDirectionInWhichItIsSurroundedParticularsEast")) {
				clearAndSendKeys(directionInWhichItIsSurroundedParticularsEastTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DirectionInWhichItIsSurroundedParticularsEast"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDirectionInWhichItIsSurroundedParticularsWest")) {
				clearAndSendKeys(directionInWhichItIsSurroundedParticularsWestTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DirectionInWhichItIsSurroundedParticularsWest"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDirectionInWhichItIsSurroundedParticularsNorth")) {
				clearAndSendKeys(directionInWhichItIsSurroundedParticularsNorthTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DirectionInWhichItIsSurroundedParticularsNorth"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDirectionInWhichItIsSurroundedParticularsSouth")) {
				clearAndSendKeys(directionInWhichItIsSurroundedParticularsSouthTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DirectionInWhichItIsSurroundedParticularsSouth"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsThePropertyProtectedWithCompoundWallFences")) {
				selectValueFromList(isThePropertyProtectedWithCompoundWallFencesDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("IsThePropertyProtectedWithCompoundWallFences"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgency")) {
				selectValueFromList(isItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgencyDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("IsItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgency"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfSecurityPersonnelOrAgency")) {
				clearAndSendKeys(detailsOfSecurityPersonnelOrAgencyTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfSecurityPersonnelOrAgency"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfAlarmSystemCCTVEtc")) {
				clearAndSendKeys(detailsOfAlarmSystemCCTVEtcTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfAlarmSystemCCTVEtc"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfKeySystemsAndControl")) {
				clearAndSendKeys(detailsOfKeySystemsAndControlTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfKeySystemsAndControl"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfAccessControlProcedureAndEquipment")) {
				clearAndSendKeys(detailsOfAccessControlProcedureAndEquipmentTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfAccessControlProcedureAndEquipment"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigwhetherSecurityGuardsAreArmed")) {
				selectValueFromList(whetherSecurityGuardsAreArmedDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("whetherSecurityGuardsAreArmed"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigareThereGovernmentSecurityEstablishmentNearby")) {
				selectValueFromList(areThereGovernmentSecurityEstablishmentNearbyDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("areThereGovernmentSecurityEstablishmentNearby"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailOfGovernmentSecurityEstablishment")) {
				clearAndSendKeys(detailOfGovernmentSecurityEstablishmentTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("DetailOfGovernmentSecurityEstablishment"));
			}
			//ALOP
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigGrossProfit")) {
				clearAndSendKeys(grossProfitTextField, polInsIntAttrSIDEngEntity.getStringValueForField("GrossProfit"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessInWeeks")) {
				clearAndSendKeys(agreedOptedTimeExcessInWeeks, polInsIntAttrSIDEngEntity.getStringValueForField("AgreedOptedTimeExcessInWeeks"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonthsForAF")) {
				clearAndSendKeys(indemnityPeriodInMonthsForAFTextField, polInsIntAttrSIDEngEntity.getStringValueForField("IndemnityPeriodInMonthsForAF"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaximumProbableDelayMPDInMonths")) {
				clearAndSendKeys(maximumProbableDelayMPDInMonthsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("MaximumProbableDelayMPDInMonths"));
			}
			//Nilesh-DS
			
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIscoldStrgInstBefore1999")) {
				selectValueFromList(IscoldStrgInstBefore1999DropDown, polInsIntAttrSIDEngEntity.getStringValueForField("IscoldStrgInstBefore1999"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDesignedStorageCapacity")) {
				clearAndSendKeys(DesinedStrgCapctyQuintlsTextField, polInsIntAttrSIDEngEntity.getStringValueForField("DesignedStorageCapacity"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaximumStockOfGoodsDurngSeason")) {
				clearAndSendKeys(MaximumStocOfGoodsDurngSeasonTextField, polInsIntAttrSIDEngEntity.getStringValueForField("MaximumStockOfGoodsDurngSeason"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAveragePriceAgreed")) {
				clearAndSendKeys(AveragePriceAgreedTextField, polInsIntAttrSIDEngEntity.getStringValueForField("AveragePriceAgreed"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDoYouReqExtForFailOfPubElecSuply")) {
				selectValueFromList(DoYouReqExtForFailOfPubElecSuplyDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("DoYouReqExtForFailOfPubElecSuply"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigWhetherPolicyIsRequiredOnDeclBasis")) {
				selectValueFromList(WhetherPolicyIsRequiredOnDeclBasisDropDown, polInsIntAttrSIDEngEntity.getStringValueForField("WhetherPolicyIsRequiredOnDeclBasis"));
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTranporterName")) {
				clearAndSendKeys(transporterNameTextArea, polInsIntAttrSIDEngEntity.getStringValueForField("TranporterName"));
			}
			
			
		}
		else if(polInsIntAttrSIDEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}	
			//MB-yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigExcessAmountMB")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ExcessAmountMB"), fetchValueFromTextFields(excessAmountMBTextField), AssertionType.WARNING);
			}
			//EF-Yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigWhetherTheDeletionOfFireAndAlliedPerilsRequired")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("WhetherTheDeletionOfFireAndAlliedPerilsRequired"), fetchValueFromList(whetherTheDeletionOfFireAndAlliedPerilsRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDeletionIsRequiredFor")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DeletionIsRequiredFor"), fetchValueFromList(deletionIsRequiredForDropDown), AssertionType.WARNING);
			}
			//BP-Yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineAtTheSubtLocCovUnderBoilerForLast5Years")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineAtTheSubtLocCovUnderBoilerForLast5Years"), fetchValueFromTextFields(incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderBoilerForLast5YearsIncludingTheExpiringPolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoadingForBoiler")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("LoadingForBoiler"), fetchValueFromTextFields(loadingForBoilerTextField), AssertionType.WARNING);
			}
			//CF-Yogesh
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfTheMachineAtTheSubLocCovUnderCPMForLast3Years")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimRatioOfTheMachineAtTheSubLocCovUnderCPMForLast3Years"), fetchValueFromTextFields(incurredClaimRatioOfTheMachineriesAtTheSubjectLocationCoveredUnderCPMForLast3YearsIncludingTheExpiringPolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoadingForCPM")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("LoadingForCPM"), fetchValueFromTextFields(loadingForCPMTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigInvoiceCostOfImportedItems")) {
				String invoiceCostOfImportedItems[] = fetchValueFromTextFields(invoiceCostOfImportedItemsTextField).toString().split("\\.");
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("InvoiceCostOfImportedItems"), invoiceCostOfImportedItems[0], AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigExchangeRate1")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ExchangeRate1"), fetchValueFromTextFields(exchangeRate1TextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCustomDuty1")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("CustomDuty1"), fetchValueFromTextFields(customDuty1TextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigFreightInsuranceHandlingClearingForwardingChargesUptoFactory")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("FreightInsuranceHandlingClearingForwardingChargesUptoFactory"), fetchValueFromTextFields(freightInsuranceHandlingClearingForwardingChargesUptoFactoryTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLandedCostOfImportedItems")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("LandedCostOfImportedItems"), fetchValueFromTextFields(landedCostOfImportedItemsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForImportedItems")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForImportedItems"), fetchValueFromTextFields(escalationPercentageForImportedItemsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForImportedItems")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForImportedItems"), fetchValueFromTextFields(escalationValueForImportedItemsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLandedCostOfIndegenousItem")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("LandedCostOfIndegenousItem"), fetchValueFromTextFields(landedCostOfIndegenousItemTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigExciseDuty")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ExciseDuty"), fetchValueFromTextFields(exciseDutyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalValueOfIndigenousItems")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("TotalValueOfIndigenousItems"), fetchValueFromTextFields(totalValueOfIndigenousItemsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForIndigenousItems")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForIndigenousItems"), fetchValueFromTextFields(escalationPercentageForIndigenousItemsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForIndigenousItems")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForIndigenousItems"), fetchValueFromTextFields(escalationValueForIndigenousItemsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCostOfErection")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("CostOfErection"), fetchValueFromTextFields(costOfErectionTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPermanentCivilWork")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("PermanentCivilWork"), fetchValueFromTextFields(permanentCivilWorkTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForPermanentCivilWork")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForPermanentCivilWork"), fetchValueFromTextFields(escalationPercentageForPermanentCivilWorkTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForPermanentCivilWork")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForPermanentCivilWork"), fetchValueFromTextFields(escalationValueForPermanentCivilWorkTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTemporaryCivilWork")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("TemporaryCivilWork"), fetchValueFromTextFields(temporaryCivilWorkTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalSumInsuredNewMachine")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("TotalSumInsuredNewMachine"), fetchValueFromTextFields(totalSumInsuredNewMachineTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsThereAnyUsedSecondHandMachinery")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IsThereAnyUsedSecondHandMachinery"), fetchValueFromTextFields(isThereAnyUsedSecondHandMachineryTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalProjectSumInsured")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("TotalProjectSumInsured"), fetchValueFromTextFields(totalProjectSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForCostOfErection")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForCostOfErection"), fetchValueFromTextFields(escalationPercentageForCostOfErectionTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForCostOfErection")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForCostOfErection"), fetchValueFromTextFields(escalationValueForCostOfErectionTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTotalEscalationValue")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("TotalEscalationValue"), fetchValueFromTextFields(totalEscalationValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPolicyExcessIncreasedTo")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("PolicyExcessIncreasedTo"), fetchValueFromList(policyExcessIncreasedToDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEarthquakeExcessIncreasedTo")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EarthquakeExcessIncreasedTo"), fetchValueFromList(earthquakeExcessIncreasedToDropDown), AssertionType.WARNING);
			}

			//*************CR(CHINTAN)2ND PAGE *********************
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaterialSuppliedByPrincipal")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("MaterialSuppliedByPrincipal"), fetchValueFromTextFields(materialSuppliedByPrincipalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigContractValue")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ContractValue"), fetchValueFromTextFields(contractValueTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAnyAdditionalItem")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("AnyAdditionalItem"), fetchValueFromTextFields(anyAdditionalItemTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDescription1ForAnyAdditionalItem")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("Description1ForAnyAdditionalItem"), fetchValueFromTextFields(description1ForAnyAdditionalItemTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForContract")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForContract"), fetchValueFromTextFields(escalationPercentageForContractTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForContract")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForContract"), fetchValueFromTextFields(escalationValueForContractTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForMaterialSuppliedByPrincipal")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForMaterialSuppliedByPrincipal"), fetchValueFromTextFields(escalationPercentageForMaterialSuppliedByPrincipalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForMaterialSuppliedByPrincipal")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForMaterialSuppliedByPrincipal"), fetchValueFromTextFields(escalationValueForMaterialSuppliedByPrincipalTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationPercentageForAnyAdditionalItem")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationPercentageForAnyAdditionalItem"), fetchValueFromTextFields(escalationPercentageForAnyAdditionalItemTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEscalationValueForAnyAdditionalItem")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EscalationValueForAnyAdditionalItem"), fetchValueFromTextFields(escalationValueForAnyAdditionalItemTextField), AssertionType.WARNING);
			}

			//*************CM(CHINTAN)2ND PAGE *********************
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimratioofTheMachineriesAtTheSubjectLocation")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimratioofTheMachineriesAtTheSubjectLocation"), fetchValueFromTextFields(incurredClaimratioofTheMachineriesAtTheSubjectLocationTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoadingForCPM")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("LoadingForCPM"), fetchValueFromTextFields(loadingForCPMTextField), AssertionType.WARNING);
			}

			//Mayur_ Product Name= EC
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIncurredClaimRatioOfMachineAtSubjectLocCovUnderCECRForLast5Years")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IncurredClaimRatioOfMachineAtSubjectLocCovUnderCECRForLast5Years"), fetchValueFromFields(incurredClaimRatioOfMachineriesAtSubjectLocationCoveredUnderCECRForLast5YearsIncludingExpiringPolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigProjectType")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ProjectType"), fetchValueFromList(projectTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigProjectLocation")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("ProjectLocation"), fetchValueFromList(projectLocationDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEarthquakeProtectionDesign")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EarthquakeProtectionDesign"), fetchValueFromList(earthquakeProtectionDesignDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigNeighborhood")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("Neighborhood"), fetchValueFromList(neighborhoodDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaintenanceOfProperty")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("MaintenanceOfProperty"), fetchValueFromList(maintenanceOfPropertyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigFireFightingFacilities")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("FireFightingFacilities"), fetchValueFromList(fireFightingFacilitiesDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPublicOrOwnFireStation")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("PublicOrOwnFireStation"), fetchValueFromList(publicOrOwnFireStationDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigSecurityArrangements")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("SecurityArrangements"), fetchValueFromList(securityArrangementsDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCommunicationFacilityAtSite")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("CommunicationFacilityAtSite"), fetchValueFromList(communicationFacilityAtSiteDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaintenanceDepartment")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("MaintenanceDepartment"), fetchValueFromList(maintenanceDepartmentDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEffectivePointsEarned")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("EffectivePointsEarned"), fetchValueFromTextFields(effectivePointsEarnedTextField), AssertionType.WARNING);
			}
			//Mayur_ Product Name= ET
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsThePropertySurroundedByOtherProperty")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IsThePropertySurroundedByOtherProperty"), fetchValueFromList(isThePropertySurroundedByOtherPropertyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDirectionInWhichItIsSurroundedParticularsEast")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DirectionInWhichItIsSurroundedParticularsEast"), fetchValueFromTextFields(directionInWhichItIsSurroundedParticularsEastTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDirectionInWhichItIsSurroundedParticularsWest")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DirectionInWhichItIsSurroundedParticularsWest"), fetchValueFromTextFields(directionInWhichItIsSurroundedParticularsWestTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigdirectionInWhichItIsSurroundedParticularsNorth")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("directionInWhichItIsSurroundedParticularsNorth"), fetchValueFromTextFields(directionInWhichItIsSurroundedParticularsNorthTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigdirectionInWhichItIsSurroundedParticularsSouth")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("directionInWhichItIsSurroundedParticularsSouth"), fetchValueFromTextFields(directionInWhichItIsSurroundedParticularsSouthTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsThePropertyProtectedWithCompoundWallFences")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IsThePropertyProtectedWithCompoundWallFences"), fetchValueFromList(isThePropertyProtectedWithCompoundWallFencesDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIsItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgency")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IsItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgency"), fetchValueFromList(isItMannedByExclusiveSecurityPersonnelOfTheInsuredOrAgencyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfSecurityPersonnelOrAgency")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfSecurityPersonnelOrAgency"), fetchValueFromTextFields(detailsOfSecurityPersonnelOrAgencyTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfAlarmSystemCCTVEtc")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfAlarmSystemCCTVEtc"), fetchValueFromTextFields(detailsOfAlarmSystemCCTVEtcTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfKeySystemsAndControl")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfKeySystemsAndControl"), fetchValueFromTextFields(detailsOfKeySystemsAndControlTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailsOfAccessControlProcedureAndEquipment")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DetailsOfAccessControlProcedureAndEquipment"), fetchValueFromTextFields(detailsOfAccessControlProcedureAndEquipmentTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigWhetherSecurityGuardsAreArmed")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("WhetherSecurityGuardsAreArmed"), fetchValueFromList(whetherSecurityGuardsAreArmedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAreThereGovernmentSecurityEstablishmentNearby")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("AreThereGovernmentSecurityEstablishmentNearby"), fetchValueFromList(areThereGovernmentSecurityEstablishmentNearbyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDetailOfGovernmentSecurityEstablishment")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DetailOfGovernmentSecurityEstablishment"), fetchValueFromTextFields(detailOfGovernmentSecurityEstablishmentTextArea), AssertionType.WARNING);
			}
			//ALOP
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigGrossProfit")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("GrossProfit"), fetchValueFromTextFields(grossProfitTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigSumInsuredForAF")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("SumInsuredForAF"), fetchValueFromTextFields(sumInsuredForAFTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessInWeeks")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("AgreedOptedTimeExcessInWeeks"), fetchValueFromTextFields(agreedOptedTimeExcessInWeeks), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonthsForAF")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IndemnityPeriodInMonthsForAF"), fetchValueFromTextFields(indemnityPeriodInMonthsForAFTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaximumProbableDelayMPDInMonths")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("MaximumProbableDelayMPDInMonths"), fetchValueFromTextFields(maximumProbableDelayMPDInMonthsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigNetRateOfThePolicy")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("NetRateOfThePolicy"), fetchValueFromTextFields(netRateOfThePolicyTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigTranporterName")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("TransporterName"), fetchValueFromTextFields(transporterNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCoverValidUpto")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("CoverValidUpto"), fetchValueFromTextFields(coverValidUptoTextField), AssertionType.WARNING);
			}
			//*******************Chintan****************
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigIscoldStrgInstBefore1999")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("IscoldStrgInstBefore1999"), fetchValueFromList(IscoldStrgInstBefore1999DropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDesignedStorageCapacity")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DesignedStorageCapacity"), fetchValueFromTextFields(DesinedStrgCapctyQuintlsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAveragePriceAgreed")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("AveragePriceAgreed"), fetchValueFromTextFields(AveragePriceAgreedTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigSIOfStocksToBeInsured")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("SIOfStocksToBeInsured"), fetchValueFromTextFields(SIOfStocksToBeInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDesignedStorageCapacity")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("DesignedStorageCapacity"), fetchValueFromTextFields(DesinedStrgCapctyQuintlsTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMaximumStockOfGoodsDurngSeason")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("MaximumStockOfGoodsDurngSeason"), fetchValueFromTextFields(MaximumStocOfGoodsDurngSeasonTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAveragePriceAgreed")) {
				assertReference.assertEquals(polInsIntAttrSIDEngEntity.getStringValueForField("AveragePriceAgreed"), fetchValueFromTextFields(AveragePriceAgreedTextField), AssertionType.WARNING);
			}
		}
		
		
	}
	public void navigateToPolicy(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			if((polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("ET")||polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("DS")) && polInsIntAttrSIDEngEntity.getAction().equalsIgnoreCase("edit")){
				click(forwardButton);
				switchToFrame("display");
			}
			if((polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("ER")||polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("CR")||polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("ME")) && polInsIntAttrSIDEngEntity.getAction().equalsIgnoreCase("add")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}
				catch(Exception e){
				}
			}
			switchToFrame("display");
			//if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigEndorseAlter")){
			click(forwardButton);
			if((polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("ER")||polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("CR")||polInsIntAttrSIDEngEntity.getStringValueForField("Product").equalsIgnoreCase("ME")) && polInsIntAttrSIDEngEntity.getAction().equalsIgnoreCase("add")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}
				catch(Exception e){
				}
			}
		switchToFrame("display");
		//if(isElementDisplayed(policyQuoteDetailsTitlePage));
		return;
	}
	}
	public void clickOnBackButton(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnSaveButton(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void clickOnBackwardButton(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity){
		if (polInsIntAttrSIDEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void fillandSubmitPolicyInsuredInrestAttributeSumInsuredDetailsEngineering(PolInsIntAttrSIDEngEntity polInsIntAttrSIDEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttrSIDEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInrestAttributeSumInsuredDetailsEngineering(polInsIntAttrSIDEngEntity,assertReference);	
			clickOnForwardButton(polInsIntAttrSIDEngEntity);
			clickOnSaveButton(polInsIntAttrSIDEngEntity);
			navigateToPolicy(polInsIntAttrSIDEngEntity);
			navigateToAttribute(polInsIntAttrSIDEngEntity);
			navigateToInsuredInterest(polInsIntAttrSIDEngEntity);
			navigateToCoverage(polInsIntAttrSIDEngEntity);
			navigateToLoan(polInsIntAttrSIDEngEntity);
			navigateToClientDetails(polInsIntAttrSIDEngEntity);
			navigateToRelation(polInsIntAttrSIDEngEntity);
			navigateToPayment(polInsIntAttrSIDEngEntity);
			navigateToFollowup(polInsIntAttrSIDEngEntity);
			navigateToDocument(polInsIntAttrSIDEngEntity);
			navigateToInsuredInterestDetails(polInsIntAttrSIDEngEntity);
			navigateToInsuredInterestAttributes(polInsIntAttrSIDEngEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttrSIDEngEntity);
			navigateToInsuredInterestRelations(polInsIntAttrSIDEngEntity);
			navigateToInsuredInterestPayments(polInsIntAttrSIDEngEntity);
		}
	}
}