package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrAOCDetEngEntity;

public class PolicyAttributeAddOnCoversDetailsEngineering extends BasePage{
	//EI
	private PageElement isCoverRequiredForExpressFreightAirFreightExcludedDropDown;	
	private PageElement sumInsuredForExpressFreightAirFreightExcludedTextField;	
	private PageElement isCoverRequiredForAirFreightDropDown;	
	private PageElement sumInsuredForAirFreightTextField;	
	private PageElement isCoverRequiredForSurroundingPropertyDropDown;	
	private PageElement sumInsuredForSurroundingPropertyTextField;	
	private PageElement isCoverRequiredForThirdPartyLiabilityDropDown;	
	private PageElement sumInsuredForThirdPartyLiabilityTextField;	
	private PageElement isCoverRequiredForAdditionalCustomDutyDropDown;	
	private PageElement sumInsuredForAdditionalCustomDutyTextField;
	private PageElement isCoverRequiredForClearanceAndRemovalOfDebrisDropDown;	
	private PageElement sumInsuredForClearanceAndRemovalOfDebrisTextField;	
	private PageElement isCoverRequiredForTerrorismExtensionDropDown;	
	private PageElement riskTypeForTerrorismExtensionDropDown;	
	private PageElement classificationOfRiskDropDown;	
	//BP
	private PageElement removalOfDebrisInExcessOf1OfClaimAmountAddOn1002DropDown;
	private PageElement sumInsuredForAddOn1002TextField;
	//MB
	private PageElement isCoverRequiredForExpressFreightDropDown;
	private PageElement sumInsuredForOSPTextField;
	private PageElement isTPLCoverRequiredDropDown;
	private PageElement sumInsuredForTPLTextField;
	private PageElement sumInsuredForACDTextField;

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

	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

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

	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement backwardButton;
	//FD-Yogesh
	private PageElement deteriorationOfStocksInColdStoragePremisesDueToAccidentalDropDown;	
	private PageElement deteriorationOfStocksInColdStoragePremisesDueToChangeDropDown;	
	private PageElement forestFireAddOn1005DropDown;	
	private PageElement impactDamageDueToInsuredsOwnRailRoadVehiclesForkLiftsDropDown;	
	private PageElement spontaneousCombustionAddOn1007DropDown;	
	private PageElement earthquakeFireAndShockAddOn1009DropDown;
	private PageElement leakageAndContaminationCoverDropDown;
	private PageElement leakageCoverWhereTheTanksAreWithinDropDown;	
	private PageElement terrorismAddOn1017DropDown;	
	private PageElement leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown;	
	private PageElement leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown;
	//SF
	private PageElement architectsSurveyorsAndConsultingEngineersFeesDropDown;	
	private PageElement sumInsuredForAddOn1001TextField;	
	private PageElement omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008DropDown;	

	//EI-SHRUTI

	private PageElement externalDataMediaTextField;
	private PageElement isCoverRequiredforIncreaseCostofWorkingDropDown;
	private PageElement policyAttributeTitle;

	private PageElement IncurredClaimratioTextField;
	private PageElement MaintenanceOftheMachineDropDown;
	private PageElement CalculatedTechnicalDiscountPercentTextField;
	private PageElement TechnicalDiscountAdjustmentFactorTextField;
	private PageElement TechnicalDiscountTextField;
	private PageElement isCoverRequiredForOwnersSurroundingPropertyTextField;
	private PageElement isCoverRequiredForAirFreightMBDropDown;
	
	private PageElement legalLiabilitiesToThirdPartiesForEntirePolicyPeriodTextField;
	private PageElement legalLiabilitiesToThirdPartiesPerAccidentPersonalInjuryTextField;
	private PageElement legalLiabilitiesToThirdPartiesPerAccidentPropertyDamageTextField;
	private PageElement TypeofTerrorismcoverRequired;

	public PolicyAttributeAddOnCoversDetailsEngineering(WebDriver driver, String pageName) {
		super(driver,pageName);

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

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backwardButton=new PageElement(By.name("btnPrevious"), "Backward Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		isCoverRequiredForExpressFreightAirFreightExcludedDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Express freight(Air freight excluded),holiday and overtime rates of wages')]/following::select"), "Is cover required for Express freight(Air freight excluded),holiday and overtime rates of wages DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForExpressFreightAirFreightExcludedTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Express freight(Air freight excluded),holiday and overtime rates of wages')]/following::input"), "Sum Insured for Express freight(Air freight excluded),holiday and overtime rates of wages TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForAirFreightDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Air')]/following::select"), "Is cover required for Air freight Dropdwon", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAirFreightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Air Freight')]/following::input"), "Sum Insured for Air Freight TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForSurroundingPropertyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Surrounding Property')]/following::select"), "Is cover required for Surrounding Property DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSurroundingPropertyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Surrounding Property')]/following::input"), "Sum Insured for Surrounding Property TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForThirdPartyLiabilityDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Third party liability')]/following::select"), "Is cover required for Third party liability DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForThirdPartyLiabilityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Third party liability')]/following::input"), "Sum Insured for Third party liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForAdditionalCustomDutyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Additional Custom Duty')]/following::select"), "Is Cover Required For Additional Custom Duty DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAdditionalCustomDutyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Additional Custom Duty')]/following::input"), "Sum Insured for Additional Custom Duty TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForClearanceAndRemovalOfDebrisDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Clearance and Removal of Debris')]/following::select"), "Is cover required for Clearance and Removal of Debris DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForClearanceAndRemovalOfDebrisTextField= new PageElement(By.xpath("//td//div[@id='Sum Insured for  Clearance and Removal of Debris']/following::input"), "Sum Insured for Clearance and Removal of Debris TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Terrorism extension')]/following::select"), "Is cover required for Terrorism extension DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//riskTypeForTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Risk Type for Terrorism Extension')]/following::select[1]"), "Risk Type for Terrorism Extension DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Rajesh updated below xpath
		riskTypeForTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Risk Type for Terrorism Extension')]/following::select[1]"), "Type of risk for Terrorism extension for CPM", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		classificationOfRiskDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Classification of Risk')]/following::select"), "Classification of Risk DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BP
		removalOfDebrisInExcessOf1OfClaimAmountAddOn1002DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Removal of Debris (In excess of 1% of claim amount)( Add On 1002)')]/following::select"), "Removal of Debris (In excess of 1% of claim amount)( Add On 1002) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAddOn1002TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum insured for add on 1002')]/following::input"), "Sum insured for add on 1002 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MB-sonali
		isCoverRequiredForExpressFreightDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Express Freight')]/following::select"), "Is cover required for Express Freight?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForOSPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured For OSP')]/following::input"), "Sum Insured For OSP TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isTPLCoverRequiredDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is TPL cover required?')]/following::select"), "Is TPL cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTPLTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for TPL')]/following::input"), "Sum Insured for TPL TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForACDTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured For ACD')]/following::input"), "Sum Insured For ACD TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForAirFreightMBDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Air Freight?')]/following::select"), "Is cover required for Air Freight? Dropdwon", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//FD-Yogesh
		deteriorationOfStocksInColdStoragePremisesDueToAccidentalDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Deterioration of stocks in cold storage premises due to accidental power failure consequent to damage at the premises of power station due to an insured peril(Add On 1003)')]/following::select"), "Deterioration of stocks in cold storage premises due to accidental power failure consequent to damage at the premises of power station due to an insured peril(Add On 1003) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deteriorationOfStocksInColdStoragePremisesDueToChangeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Deterioration of stocks in cold storage premises due to change of temperature arising out of loss or damage to the cold storage machineries in the insureds premises due to operation.. (Add On 1004)')]/following::select"), "Deterioration of stocks in cold storage premises due to change of temperature arising out of loss or damage to the cold storage machineries in the insureds premises due to operation.. (Add On 1004) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forestFireAddOn1005DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Forest Fire (Add On 1005)')]/following::select"), "Forest Fire (Add On 1005) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		impactDamageDueToInsuredsOwnRailRoadVehiclesForkLiftsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Impact damage due to insureds own rail/road vehicles, fork lifts, Cranes, stackers, and the like and articles dropped there from (Add On 1006)')]/following::select"), "Impact damage due to insureds own rail/road vehicles, fork lifts, Cranes, stackers, and the like and articles dropped there from (Add On 1006) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		spontaneousCombustionAddOn1007DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Spontaneous Combustion (Add On 1007)')]/following::select"), "Spontaneous Combustion (Add On 1007) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeFireAndShockAddOn1009DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Earthquake (Fire and Shock) (Add On 1009)')]/following::select"), "Earthquake (Fire and Shock) (Add On 1009) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageAndContaminationCoverDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage and contamination cover Where the tanks are within the insureds own premises(Add On 1011)')]/following::select"), "Leakage and contamination cover Where the tanks are within the insureds own premises(Add On 1011) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageCoverWhereTheTanksAreWithinDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage cover Where the tanks are within the insureds own premises(Add On1012)')]/following::select"), "Leakage cover Where the tanks are within the insureds own premises(Add On1012) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		terrorismAddOn1017DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Terrorism (Add On 1017)')]/following::select"), "Terrorism (Add On 1017) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage and contamination cover Where tanks are located elsewhere(Add On 1111)')]/following::select"), "Leakage and contamination cover Where tanks are located elsewhere(Add On 1111) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Leakage cover where tanks are located elsewhere(Add On 1112)')]/following::select"), "Leakage cover where tanks are located elsewhere(Add On 1112) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//SF
		architectsSurveyorsAndConsultingEngineersFeesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Architects surveyors and consulting engineers fees (in excess of 3% of the claim amount) (Add On 1001)')]/following::select"), "Architects surveyors and consulting engineers fees (in excess of 3% of the claim amount) (Add On 1001) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAddOn1001TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Add on 1001')]/following::input"), "Sum Insured for Add on 1001 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008DropDown= new PageElement(By.xpath("//td//div[contains(text(),'Omission to insure additions, alterations or extensions(Add On 1008)')]/following::select"), "Omission to insure additions, alterations or extensions(Add On 1008) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//EI-shruti
		externalDataMediaTextField=new PageElement(By.name("propValues1"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isCoverRequiredforIncreaseCostofWorkingDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Cover required for Increase Cost of Working')]/following::select"),"Is Cover required for Increase Cost of Working Drop Down",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//MB
		IncurredClaimratioTextField=new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim ratio')]/following::input"), "Incurred Claim ratio TextFiled", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		MaintenanceOftheMachineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Maintenance of  the Machine')]/following::select"), "Maintenance of  the Machine DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		CalculatedTechnicalDiscountPercentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Calculated Technical Discount (%)')]/following::input"), "Calculated Technical Discount (%) TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TechnicalDiscountAdjustmentFactorTextField=new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount Adjustment Factor')]/following::input"), "Technical Discount Adjustment Factor TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TechnicalDiscountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Technical Discount')]/following::input"), "Technical Discount Textfield", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		isCoverRequiredForOwnersSurroundingPropertyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Owners Surrounding Property')]/following::select"), "Is Cover Required For Owners Surrounding Property Dropdown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		legalLiabilitiesToThirdPartiesForEntirePolicyPeriodTextField= new PageElement(By.xpath("//td//div[contains(text(),'Legal Liabilities to third parties For Entire Policy Period')]/following::input"), "Legal Liabilities to third parties For Entire Policy Period TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalLiabilitiesToThirdPartiesPerAccidentPersonalInjuryTextField= new PageElement(By.xpath("//td//div[contains(text(),'Legal Liabilities to third parties per Accident: Personal Injury')]/following::input"), "Legal Liabilities to third parties per Accident: Personal Injury TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		legalLiabilitiesToThirdPartiesPerAccidentPropertyDamageTextField= new PageElement(By.xpath("//td//div[contains(text(),'Legal Liabilities to third parties per Accident: Property Damage')]/following::input"), "Legal Liabilities to third parties per Accident: Property Damage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TypeofTerrorismcoverRequired = new PageElement(By.xpath("//td//div[contains(text(),'Type of Terrorism cover required')]/following::select"), "Type of Terrorism Cover Required", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyAttributeAddOnCoversDetailsEngineeringDetails(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity, CustomAssert assertReference) throws InterruptedException{

 		if(polAttrAOCDetEngEntity.getAction().equalsIgnoreCase("add") || polAttrAOCDetEngEntity.getAction().equalsIgnoreCase("edit")){
 			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForAirFreightForEFEI")){
				selectValueFromList(isCoverRequiredForExpressFreightAirFreightExcludedDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForAirFreightForEFEI"));
			}
			
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForAirFreight")){
				selectValueFromList(isCoverRequiredForAirFreightDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForAirFreight"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAirFreight")) {
				clearAndSendKeys(sumInsuredForAirFreightTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAirFreight"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForSurroundingProperty")){
				selectValueFromList(isCoverRequiredForSurroundingPropertyDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForSurroundingProperty"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForSurroundingProperty")) {
				clearAndSendKeys(sumInsuredForSurroundingPropertyTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForSurroundingProperty"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForThirdPartyLiability")){
				selectValueFromList(isCoverRequiredForThirdPartyLiabilityDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForThirdPartyLiability"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForThirdPartyLiability")) {
				clearAndSendKeys(sumInsuredForThirdPartyLiabilityTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForThirdPartyLiability"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForAdditionalCustomDuty")){
				selectValueFromList(isCoverRequiredForAdditionalCustomDutyDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForAdditionalCustomDuty"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAdditionalCustomDuty")) {
				clearAndSendKeys(sumInsuredForAdditionalCustomDutyTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAdditionalCustomDuty"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForClearanceAndRemovalOfDebris")){
				selectValueFromList(isCoverRequiredForClearanceAndRemovalOfDebrisDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForClearanceAndRemovalOfDebris"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForClearanceAndRemovalOfDebris")) {
				clearAndSendKeys(sumInsuredForClearanceAndRemovalOfDebrisTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForClearanceAndRemovalOfDebris"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForTerrorismExtension")){
				selectValueFromList(isCoverRequiredForTerrorismExtensionDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForTerrorismExtension"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigRiskTypeForTerrorismExtension")){
				selectValueFromList(riskTypeForTerrorismExtensionDropDown,polAttrAOCDetEngEntity.getStringValueForField("RiskTypeForTerrorismExtension"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigClassificationOfRisk")){
				selectValueFromList(classificationOfRiskDropDown,polAttrAOCDetEngEntity.getStringValueForField("ClassificationOfRisk"));
			}
			//BP
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigRemovalOfDebrisInExcessOf1OfClaimAmountAddOn1002")){
				selectValueFromList(removalOfDebrisInExcessOf1OfClaimAmountAddOn1002DropDown,polAttrAOCDetEngEntity.getStringValueForField("RemovalOfDebrisInExcessOf1OfClaimAmountAddOn1002"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1002")) {
				clearAndSendKeys(sumInsuredForAddOn1002TextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAddOn1002"));
			}
			//MB
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForExpressFreight")){
				selectValueFromList(isCoverRequiredForExpressFreightDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForExpressFreight"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForExpressFreightAirFreightExcluded")) {
				clearAndSendKeys(sumInsuredForExpressFreightAirFreightExcludedTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForExpressFreightAirFreightExcluded"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsTPLCoverRequired")){
				selectValueFromList(isTPLCoverRequiredDropDown,polAttrAOCDetEngEntity.getStringValueForField("IsTPLCoverRequired"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForTPL")) {
				clearAndSendKeys(sumInsuredForTPLTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForTPL"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForACD")) {
				clearAndSendKeys(sumInsuredForACDTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForACD"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForOwnersSurroundingProperty")) {
				selectValueFromList(isCoverRequiredForOwnersSurroundingPropertyTextField, polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForOwnersSurroundingProperty"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForOSP")) {
				clearAndSendKeys(sumInsuredForOSPTextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForOSP"));
			}
			//FD-Yogesh
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToAccidental")){
				selectValueFromList(deteriorationOfStocksInColdStoragePremisesDueToAccidentalDropDown,polAttrAOCDetEngEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToAccidental"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToChange")){
				selectValueFromList(deteriorationOfStocksInColdStoragePremisesDueToChangeDropDown,polAttrAOCDetEngEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToChange"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigForestFireAddOn1005")){
				selectValueFromList(forestFireAddOn1005DropDown,polAttrAOCDetEngEntity.getStringValueForField("ForestFireAddOn1005"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigImpactDamageDueToInsuredsOwnRailRoadVehiclesForkLifts")){
				selectValueFromList(impactDamageDueToInsuredsOwnRailRoadVehiclesForkLiftsDropDown,polAttrAOCDetEngEntity.getStringValueForField("ImpactDamageDueToInsuredsOwnRailRoadVehiclesForkLifts"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSpontaneousCombustionAddOn1007")){
				selectValueFromList(spontaneousCombustionAddOn1007DropDown,polAttrAOCDetEngEntity.getStringValueForField("SpontaneousCombustionAddOn1007"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigEarthquakeFireAndShockAddOn1009")){
				selectValueFromList(earthquakeFireAndShockAddOn1009DropDown,polAttrAOCDetEngEntity.getStringValueForField("EarthquakeFireAndShockAddOn1009"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageAndContaminationCover")){
				selectValueFromList(leakageAndContaminationCoverDropDown,polAttrAOCDetEngEntity.getStringValueForField("LeakageAndContaminationCover"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageCoverWhereTheTanksAreWithin")){
				selectValueFromList(leakageCoverWhereTheTanksAreWithinDropDown,polAttrAOCDetEngEntity.getStringValueForField("LeakageCoverWhereTheTanksAreWithin"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigTerrorismAddOn1017")){
				selectValueFromList(terrorismAddOn1017DropDown,polAttrAOCDetEngEntity.getStringValueForField("TerrorismAddOn1017"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111")){
				selectValueFromList(leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown,polAttrAOCDetEngEntity.getStringValueForField("LeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageCoverWhereTanksAreLocatedElsewhereAddOn1112")){
				selectValueFromList(leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown,polAttrAOCDetEngEntity.getStringValueForField("LeakageCoverWhereTanksAreLocatedElsewhereAddOn1112"));
			}
			//SF
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigArchitectsSurveyorsAndConsultingEngineersFees")){
				selectValueFromList(architectsSurveyorsAndConsultingEngineersFeesDropDown,polAttrAOCDetEngEntity.getStringValueForField("ArchitectsSurveyorsAndConsultingEngineersFees"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1001")) {
				clearAndSendKeys(sumInsuredForAddOn1001TextField, polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAddOn1001"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigOmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008")){
				selectValueFromList(omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008DropDown,polAttrAOCDetEngEntity.getStringValueForField("OmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008"));
			}
			//BPPI
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLegLiaThirdParEntirePolicyPeriod")) {
				clearAndSendKeys(legalLiabilitiesToThirdPartiesForEntirePolicyPeriodTextField, polAttrAOCDetEngEntity.getStringValueForField("LegLiaThirdParEntirePolicyPeriod"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLegLiaThirdParAccidentPersonalInjury")) {
				clearAndSendKeys(legalLiabilitiesToThirdPartiesPerAccidentPersonalInjuryTextField, polAttrAOCDetEngEntity.getStringValueForField("LegLiaThirdParAccidentPersonalInjury"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLegLiaThirdParAccidentPropertyDamage")) {
				clearAndSendKeys(legalLiabilitiesToThirdPartiesPerAccidentPropertyDamageTextField, polAttrAOCDetEngEntity.getStringValueForField("ThirdParAccidentPropertyDamage"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigtypeofTerrorismcoverrequired")) {
				selectValueFromList(TypeofTerrorismcoverRequired, polAttrAOCDetEngEntity.getStringValueForField("TypeofTerrorismcoverrequired"));
			}
		
		}
		else if(polAttrAOCDetEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForExpressFreight")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForExpressFreight"), fetchValueFromList(isCoverRequiredForExpressFreightDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForExpressFreightAirFreightExcluded")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForExpressFreightAirFreightExcluded"), fetchValueFromTextFields(sumInsuredForExpressFreightAirFreightExcludedTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForAirFreight")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForAirFreight"), fetchValueFromList(isCoverRequiredForAirFreightDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAirFreight")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAirFreight"), fetchValueFromTextFields(sumInsuredForAirFreightTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForSurroundingProperty")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForSurroundingProperty"), fetchValueFromList(isCoverRequiredForSurroundingPropertyDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForSurroundingProperty")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForSurroundingProperty"), fetchValueFromTextFields(sumInsuredForSurroundingPropertyTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForThirdPartyLiability")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForThirdPartyLiability"), fetchValueFromList(isCoverRequiredForThirdPartyLiabilityDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForThirdPartyLiability")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForThirdPartyLiability"), fetchValueFromTextFields(sumInsuredForThirdPartyLiabilityTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForAdditionalCustomDuty")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForAdditionalCustomDuty"), fetchValueFromList(isCoverRequiredForAdditionalCustomDutyDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAdditionalCustomDuty")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAdditionalCustomDuty"), fetchValueFromTextFields(sumInsuredForAdditionalCustomDutyTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForClearanceAndRemovalOfDebris")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForClearanceAndRemovalOfDebris"), fetchValueFromList(isCoverRequiredForClearanceAndRemovalOfDebrisDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForClearanceAndRemovalOfDebris")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForClearanceAndRemovalOfDebris"), fetchValueFromTextFields(sumInsuredForClearanceAndRemovalOfDebrisTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForTerrorismExtension")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForTerrorismExtension"), fetchValueFromList(isCoverRequiredForTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigRiskTypeForTerrorismExtension")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("RiskTypeForTerrorismExtension"), fetchValueFromList(riskTypeForTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigClassificationOfRisk")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ClassificationOfRisk"), fetchValueFromList(classificationOfRiskDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigRemovalOfDebrisInExcessOf1OfClaimAmountAddOn1002")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("RemovalOfDebrisInExcessOf1OfClaimAmountAddOn1002"), fetchValueFromList(removalOfDebrisInExcessOf1OfClaimAmountAddOn1002DropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1002")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAddOn1002"), fetchValueFromTextFields(sumInsuredForAddOn1002TextField), AssertionType.WARNING);
			}
			//MB
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForExpressFreight")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForExpressFreight"), fetchValueFromList(isCoverRequiredForExpressFreightDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForOSP")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForOSP"), fetchValueFromTextFields(sumInsuredForOSPTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsTPLCoverRequired")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsTPLCoverRequired"), fetchValueFromList(isTPLCoverRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForTPL")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForTPL"), fetchValueFromTextFields(sumInsuredForTPLTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForACD")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForACD"), fetchValueFromTextFields(sumInsuredForACDTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForOwnersSurroundingProperty")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForOwnersSurroundingProperty"), fetchValueFromList(isCoverRequiredForOwnersSurroundingPropertyTextField), AssertionType.WARNING);
			}
			//FD-Yogesh
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToAccidental")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToAccidental"), fetchValueFromList(deteriorationOfStocksInColdStoragePremisesDueToAccidentalDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigDeteriorationOfStocksInColdStoragePremisesDueToChange")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("DeteriorationOfStocksInColdStoragePremisesDueToChange"), fetchValueFromList(deteriorationOfStocksInColdStoragePremisesDueToChangeDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigForestFireAddOn1005")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ForestFireAddOn1005"), fetchValueFromList(forestFireAddOn1005DropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigImpactDamageDueToInsuredsOwnRailRoadVehiclesForkLifts")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ImpactDamageDueToInsuredsOwnRailRoadVehiclesForkLifts"), fetchValueFromList(impactDamageDueToInsuredsOwnRailRoadVehiclesForkLiftsDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSpontaneousCombustionAddOn1007")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SpontaneousCombustionAddOn1007"), fetchValueFromList(spontaneousCombustionAddOn1007DropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigEarthquakeFireAndShockAddOn1009")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("EarthquakeFireAndShockAddOn1009"), fetchValueFromList(earthquakeFireAndShockAddOn1009DropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageAndContaminationCover")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("LeakageAndContaminationCover"), fetchValueFromList(leakageAndContaminationCoverDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageCoverWhereTheTanksAreWithin")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("LeakageCoverWhereTheTanksAreWithin"), fetchValueFromList(leakageCoverWhereTheTanksAreWithinDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigTerrorismAddOn1017")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("TerrorismAddOn1017"), fetchValueFromList(terrorismAddOn1017DropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("LeakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111"), fetchValueFromList(leakageAndContaminationCoverWhereTanksAreLocatedElsewhereAddOn1111DropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLeakageCoverWhereTanksAreLocatedElsewhereAddOn1112")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("LeakageCoverWhereTanksAreLocatedElsewhereAddOn1112"), fetchValueFromList(leakageCoverWhereTanksAreLocatedElsewhereAddOn1112DropDown), AssertionType.WARNING);
			}
			//SF
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigArchitectsSurveyorsAndConsultingEngineersFees")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ArchitectsSurveyorsAndConsultingEngineersFees"), fetchValueFromList(architectsSurveyorsAndConsultingEngineersFeesDropDown), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigSumInsuredForAddOn1001")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("SumInsuredForAddOn1001"), fetchValueFromTextFields(sumInsuredForAddOn1001TextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigOmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("OmissionToInsureAdditionsAlterationsOrExtensionsAddOn1008"), fetchValueFromList(omissionToInsureAdditionsAlterationsOrExtensionsAddOn1008DropDown), AssertionType.WARNING);
			}
			//EF/EI
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredForAirFreightForEFEI")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredForAirFreightForEFEI"), fetchValueFromList(isCoverRequiredForExpressFreightAirFreightExcludedDropDown), AssertionType.WARNING);
			}
			//BPPI
		
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLegLiaThirdParEntirePolicyPeriod")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("LegLiaThirdParEntirePolicyPeriod"), fetchValueFromTextFields(legalLiabilitiesToThirdPartiesForEntirePolicyPeriodTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLegLiaThirdParAccidentPersonalInjury")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("LegLiaThirdParAccidentPersonalInjury"), fetchValueFromTextFields(legalLiabilitiesToThirdPartiesPerAccidentPersonalInjuryTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLegLiaThirdParAccidentPropertyDamage")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ThirdParAccidentPropertyDamage"), fetchValueFromTextFields(legalLiabilitiesToThirdPartiesPerAccidentPropertyDamageTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToPolicy(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void clickOnForwardButton(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			if(polAttrAOCDetEngEntity.getStringValueForField("Product").equalsIgnoreCase("BPPI")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}
				catch (Exception e){

				}
			}
			switchToFrame("display");
		/*	policyAttributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrAOCDetEngEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyAttributeTitle);*/
		}
	}
	public void clickOnBackButton(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
		}
	}
	public void clickOnBackwardButton(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity){
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
			switchToFrame("display");
		}
	}
	private void fillPolicyAttributeAddOnCoversDetails2EngineeringDetails(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity,CustomAssert assertReference) {
		if(polAttrAOCDetEngEntity.getAction().equalsIgnoreCase("add") || polAttrAOCDetEngEntity.getAction().equalsIgnoreCase("edit")){
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigExternalDataMedia")){
				clearAndSendKeys(externalDataMediaTextField, polAttrAOCDetEngEntity.getStringValueForField("ExternalDataMedia"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredforIncreaseCostofWorking")) {
				selectValueFromList(isCoverRequiredforIncreaseCostofWorkingDropDown, polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredforIncreaseCostofWorking"));
			}
			//MB
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIncurredClaimratio")){
				clearAndSendKeys(IncurredClaimratioTextField, polAttrAOCDetEngEntity.getStringValueForField("IncurredClaimratio"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigMaintenanceOftheMachine")) {
				selectValueFromList(MaintenanceOftheMachineDropDown, polAttrAOCDetEngEntity.getStringValueForField("MaintenanceOftheMachine"));
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigCalculatedTechnicalDiscountPercent")){
				clearAndSendKeys(CalculatedTechnicalDiscountPercentTextField, polAttrAOCDetEngEntity.getStringValueForField("CalculatedTechnicalDiscountPercent"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigTechnicalDiscountAdjustmentFactor")) {
				clearAndSendKeys(TechnicalDiscountAdjustmentFactorTextField, polAttrAOCDetEngEntity.getStringValueForField("TechnicalDiscountAdjustmentFactor"));
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				clearAndSendKeys(TechnicalDiscountTextField, polAttrAOCDetEngEntity.getStringValueForField("TechnicalDiscount"));
			}

		}
		else if(polAttrAOCDetEngEntity.getAction().equalsIgnoreCase("verify"))	{

			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigExternalDataMedia")){
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("ExternalDataMedia"), fetchValueFromTextFields(externalDataMediaTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIsCoverRequiredforIncreaseCostofWorking")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IsCoverRequiredforIncreaseCostofWorking"), fetchValueFromList(isCoverRequiredforIncreaseCostofWorkingDropDown), AssertionType.WARNING);
			}
			//MB
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigIncurredClaimratio")){
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("IncurredClaimratio"), fetchValueFromTextFields(IncurredClaimratioTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigMaintenanceOftheMachine")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("MaintenanceOftheMachine"), fetchValueFromList(MaintenanceOftheMachineDropDown), AssertionType.WARNING);
			}
			if(polAttrAOCDetEngEntity.getBooleanValueForField("ConfigCalculatedTechnicalDiscountPercent")){
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("CalculatedTechnicalDiscountPercent"), fetchValueFromTextFields(CalculatedTechnicalDiscountPercentTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigTechnicalDiscountAdjustmentFactor")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("TechnicalDiscountAdjustmentFactor"), fetchValueFromTextFields(TechnicalDiscountAdjustmentFactorTextField), AssertionType.WARNING);
			}
			if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigTechnicalDiscount")) {
				assertReference.assertEquals(polAttrAOCDetEngEntity.getStringValueForField("TechnicalDiscount"), fetchValueFromTextFields(TechnicalDiscountTextField), AssertionType.WARNING);
			}
		}

	}

	private void clickOnNextButton(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity) {
		if (polAttrAOCDetEngEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwardButton);
			switchToFrame("display");
		}

	}
	public void fillandSubmitPolicyAttributeAddOnCoversDetailsEngineering(PolAttrAOCDetEngEntity polAttrAOCDetEngEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrAOCDetEngEntity.getConfigExecute())){
			fillPolicyAttributeAddOnCoversDetailsEngineeringDetails(polAttrAOCDetEngEntity, assertReference);
			clickOnForwardButton(polAttrAOCDetEngEntity);
			fillPolicyAttributeAddOnCoversDetails2EngineeringDetails(polAttrAOCDetEngEntity, assertReference);
			clickOnNextButton(polAttrAOCDetEngEntity);
			navigateToPolicy(polAttrAOCDetEngEntity);
			navigateToAttribute(polAttrAOCDetEngEntity);
			navigateToInsuredInterest(polAttrAOCDetEngEntity);
			navigateToCoverage(polAttrAOCDetEngEntity);
			navigateToLoan(polAttrAOCDetEngEntity);
			navigateToClientDetails(polAttrAOCDetEngEntity);
			navigateToRelation(polAttrAOCDetEngEntity);
			navigateToPayment(polAttrAOCDetEngEntity);
			navigateToFollowup(polAttrAOCDetEngEntity);
			navigateToDocument(polAttrAOCDetEngEntity);
		}
	}

}
