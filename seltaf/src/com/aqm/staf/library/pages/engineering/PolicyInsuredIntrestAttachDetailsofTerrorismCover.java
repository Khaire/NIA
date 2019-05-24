package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AttachCoverTerrorismCEntity;


public class PolicyInsuredIntrestAttachDetailsofTerrorismCover extends BasePage {

	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement attachCoveragesDetailTitle;
	private PageElement attachCoveragesAttributesTitle; 
	private PageElement attachCoveragesPremiumTitle;

	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberHomePageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement memberDetailPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	//private PageElement memberFundPageTitle;
	private PageElement attachCoveragesDetailsPageTitle;
	private PageElement attachCoveragesAttributesPageTitle;
	private PageElement attachCoveragesPremiumPageTitle;

	private PageElement netPremiumFilledbyHOOnlyTextField;
	private PageElement premiumChargeableTextField;
	private PageElement saveButton;
	private PageElement forwordButton;
	private PageElement attachCoveragesPremiumLinkForEng;

	//EC
	private PageElement isCoverRequiredForAirFreightDropDown;	
	private PageElement sumInsuredForAirFreightTextField;	
	private PageElement isCoverRequiredForSurroundingPropertyDropDown;	
	private PageElement sumInsuredForSurroundingPropertyTextField;	
	private PageElement isCoverRequiredForThirdPartyLiabilityDropDown;	
	private PageElement sumInsuredForThirdPartyLiabilityTextField;	
	private PageElement isCoverRequiredForAdditionalCustomDutyDropDown;	
	private PageElement sumInsuredForAdditionalCustomDutyTextField;
	private PageElement isCoverRequiredForRemovalOfDebrisDropDown;	
	private PageElement sumInsuredForRemovalOfDebrisTextField;	
	private PageElement isCoverRequiredForTerrorismExtensionDropDown;	
	private PageElement riskTypeForTerrorismExtensionDropDown;	
	private PageElement whetherEscalationCoverIsRequiredDropDown;	
	private PageElement escalationPercentageForProjectTextField;	
	private PageElement isEscalationCoverRequiredMBDropDown;

	//
	//ER-EC
	private PageElement isCoverReqForEscalationCoverDropDown;
	private PageElement escalationPercentForECTextField;
	private PageElement escalationPercentageforMachineTextField;
	private PageElement isCovReqForDismantlingRiskDropDown;
	private PageElement sumInsForDismantlingRiskTextField;
	private PageElement isCovReqForMaintCoverDropDown;
	private PageElement coverTypeDropDown;
	private PageElement periodInMonthsForMCTextField;
	//ALOP
	private PageElement isCoverRequiredForPreventionOfAccessDropdown;
	private PageElement preventionOfAccessPeriodInWeeksTextField;
	private PageElement isCoverRequiredForDenialOfAccessDropdown;
	private PageElement denialOfAccessPeriodInWeeksTextfield;
	private PageElement isCoverRequiredForFailureOfPublicPowerSupplyDropdown;
	private PageElement failureOfPublicPowerSupplyPeriodInWeeksTextField;
	private PageElement isCoverRequiredForSuppliersExtensionDropdown;
	private PageElement suppliersDetailButton;
	private PageElement suppliersExtensionPeriodInWeeksTextField;

	private PageElement numberOfPerilsToBeCoveredTextField;
	private PageElement addOnCoverTitle;

	private PageElement InvoCostOfImpoItemsTextField;
	private PageElement ExRate1TextField;
	private PageElement CustomDuty1TextField;
	private PageElement FreightInsHandClearForCharUptoFactTextField;
	private PageElement LandCostOfImpItemsTextField;
	private PageElement EscPerForImpItemsTextField;
	private PageElement EscValForImpItemsTextField;
	private PageElement LandCostOfIndsItemTextField;
	private PageElement ExDutyTextField;
	private PageElement TotalValOfIndsItemsTextField;
	private PageElement EscPerForIndsItemsTextField;
	private PageElement EscValuForIndItemsTextField;
	private PageElement CostOfErectionTextField;
	private PageElement PermanentCivilWorkTextField;
	private PageElement EscPerForPerCivilWorkTextField;
	private PageElement EscValForPerCivilWorkTextField;
	private PageElement TempCivilWorkTextField;
	private PageElement TotalSumInsuredNewMachineTextField;
	private PageElement IsThereAnyUsedSecHandMachDropDown;
	private PageElement TotalProjSumInsuredTextField;
	private PageElement TotalEscValTextField;
	private PageElement NetPremPerMilleForProjTextField;
	private PageElement DedWordingForSectIProjWorkTextArea;
	private PageElement MinDedAmountSectIProjWorksTextField;
	private PageElement GeogrLimitsLargeRiskTextArea;
	//le
	private PageElement terrorismAddOn1017DropDown;
	//EF
	private PageElement escalationPercentageElectronicEquipmentTextField;
	//ME
	private PageElement coverValidFromTextField;
	private PageElement extensnOfTestingPeriodTextField;
	//ALOP
	private PageElement whetherTerrorismIsRequiredForALOPRiskDropdown;
	private PageElement rateForTerrorismALOPTextField;

	//EI
	private PageElement applicableSumInsuredDuringExtnPeriodTextField;
	private PageElement extensionPeriodInMonthTextField;
	private PageElement applicableAddOnSumInsuredDuringExtnPeriodTextField;


	private PageElement cPMGroup1OpenButton;
	private PageElement cPMGroupIMachinesSumInsureTextField;
	private PageElement quantityTextField;
	private PageElement descriptionofItemsTextField;
	private PageElement closeButton;
	private PageElement addButton;
	private PageElement totalCPMGroupSumInsuredTextField;
	
	private PageElement typeOfRiskForTerrorismExtensionDropDown;
	private PageElement terrorismInstallmentOptionDropDown;
	private PageElement totalSumInsuredEMGTextField;


	public PolicyInsuredIntrestAttachDetailsofTerrorismCover(WebDriver driver, String pageName){
		super(driver, pageName);
		netPremiumFilledbyHOOnlyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Net Premium(Filled by HO only)')]//following::input"), "Net Premium(Filled by HO only)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumChargeableTextField = new PageElement(By.xpath("//td//div[contains(text(),'Premium (Chargeable)')]//following::input"), "Premium (Chargeable)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwordButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//navigations
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberHomePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Policy Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumLinkForEng=new PageElement(By.xpath("//td//b//div[contains(text(),'Premium')]"), "Premium Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//EC
		isCoverRequiredForAirFreightDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Air freight')]/following::select"), "Is cover required for Air freight Dropdwon", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAirFreightTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Air Freight')]/following::input"), "Sum Insured for Air Freight TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForSurroundingPropertyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Surrounding Property')]/following::select"), "Is cover required for Surrounding Property DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSurroundingPropertyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Surrounding Property')]/following::input"), "Sum Insured for Surrounding Property TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForThirdPartyLiabilityDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Third party liability')]/following::select"), "Is cover required for Third party liability DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForThirdPartyLiabilityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Third party liability')]/following::input"), "Sum Insured for Third party liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForAdditionalCustomDutyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Additional Custom Duty')]/following::select"), "Is Cover Required For Additional Custom Duty DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForAdditionalCustomDutyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Additional Custom Duty')]/following::input"), "Sum Insured for Additional Custom Duty TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForRemovalOfDebrisDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Removal Of Debris')]/following::select"), "Is cover required for Clearance and Removal of Debris DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForRemovalOfDebrisTextField= new PageElement(By.xpath("//td//div[@id='Sum Insured for Removal of Debris']/following::input"), "Sum Insured for Clearance and Removal of Debris TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is cover required for Terrorism extension')]/following::select"), "Is cover required for Terrorism extension DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskTypeForTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Risk Type for Terrorism Extension')]/following::select"), "Risk Type for Terrorism Extension DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//ALOP
		isCoverRequiredForPreventionOfAccessDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required for Prevention of Access')]/following::select"), "Is Cover Required for Prevention of Access Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		preventionOfAccessPeriodInWeeksTextField= new PageElement(By.xpath("//td//div[@id='Prevention of Access Period(in Weeks)']/following::input"), "Prevention of Access Period(in Weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForDenialOfAccessDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required for Denial of Access')]/following::select"), "Is Cover Required for Denial of Access DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		denialOfAccessPeriodInWeeksTextfield= new PageElement(By.xpath("//td//div[@id='Denial of Access Period(in Weeks)']/following::input"), "Denial of Access Period(in Weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForFailureOfPublicPowerSupplyDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required for Failure of Public Power Supply')]/following::select"), "Is Cover Required for Failure of Public Power Supply DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		failureOfPublicPowerSupplyPeriodInWeeksTextField= new PageElement(By.xpath("//td//div[@id='Failure of Public Power Supply Period(in Weeks)']/following::input"), "Failure of Public Power Supply Period(in Weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCoverRequiredForSuppliersExtensionDropdown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required for Suppliers Extension')]/following::select"), "Is Cover Required for Suppliers Extension DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//	suppliersDetailButton
		suppliersExtensionPeriodInWeeksTextField= new PageElement(By.xpath("//td//div[@id='Suppliers Extension Period(in Weeks)']/following::input"), "Suppliers Extension Period(in Weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		numberOfPerilsToBeCoveredTextField= new PageElement(By.xpath("//td//div[@id='Number of Perils to be Covered']/following::input"), "Number of Perils to be Covered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//LE
		InvoCostOfImpoItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Invoice Cost of Imported Items')]/following::input"), "Invoice Cost", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExRate1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Exchange Rate1')]/following::input"), "Exchange Rate1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		CustomDuty1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Custom Duty1')]/following::input"), "Custom Duty1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		FreightInsHandClearForCharUptoFactTextField= new PageElement(By.xpath("//td//div[contains(text(),'Freight,Insurance,handling,clearing')]/following::input"), "Freight,Insurance,handling", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LandCostOfImpItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Landed Cost of Imported Items')]/following::input"), "Landed Cost", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EscPerForImpItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation Percentage for Imported Items')]/following::input"), "Escalation Percentage for Imported", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EscValForImpItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation value for Imported Items')]/following::input"), "Escalation value for Imported", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LandCostOfIndsItemTextField= new PageElement(By.xpath("//td//div[contains(text(),'Landed Cost of Indegenous Item')]/following::input"), "Landed Cost of Indegenous", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExDutyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excise Duty')]/following::input"), "Excise Duty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalValOfIndsItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total value of Indigenous Items')]/following::input"), "Total value of Indigenous", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EscPerForIndsItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation Percentage for Indigenous Items')]/following::input"), "Escalation Percentage for Indigenous", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EscValuForIndItemsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation value for Indigenous Items')]/following::input"), "Escalation value for Indigenous", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		CostOfErectionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Cost of erection')]/following::input"), "Cost of erection", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PermanentCivilWorkTextField= new PageElement(By.xpath("//td//div[contains(text(),'Permanent Civil work')]/following::input"), "Permanent Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EscPerForPerCivilWorkTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation Percentage for Permanent Civil work')]/following::input"), "Escalation Percentage for Permanent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EscValForPerCivilWorkTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation value for Permanent Civil work')]/following::input"), "Escalation value for Permanent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TempCivilWorkTextField= new PageElement(By.xpath("//td//div[contains(text(),'Temporary Civil work')]/following::input"), "Temporary Civil work", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalSumInsuredNewMachineTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured')]/following::input"), "Total Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IsThereAnyUsedSecHandMachDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is there any Used/Second hand Machinery')]/following::select"), "Is there any Used/Second hand Machinery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalProjSumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Project Sum Insured')]/following::input"), "Total Project Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalEscValTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Escalation Value')]/following::input"), "Total Escalation Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NetPremPerMilleForProjTextField= new PageElement(By.xpath("//td//div[contains(text(),'Net Premium Rate (per mille)')]/following::input"), "Net Premium Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DedWordingForSectIProjWorkTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Section I (Project works)')]/following::textarea"), "Deductible Wording for Section I", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MinDedAmountSectIProjWorksTextField= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Section I Project works')]/following::input"), "Minimum Deductible Amount Section I", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		GeogrLimitsLargeRiskTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Geographical Limits (Large Risk)')]/following::textarea"), "Geographical Limits (Large Risk)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//MB
		isEscalationCoverRequiredMBDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Escalation Cover required(MB)')]/following::select"), "Is Escalation Cover required(MB)? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		escalationPercentageforMachineTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation Percentage for Machine')]/following::input"), "Escalation Percentage for Machine DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//le
		terrorismAddOn1017DropDown=new PageElement(By.xpath("//td//div[contains(text(),'Terrorism (Add On 1017)')]/following::select"), "Terrorism (Add On 1017)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//EF
		whetherEscalationCoverIsRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Escalation cover is required')]/following::select"), "Whether Escalation cover is required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		escalationPercentageElectronicEquipmentTextField= new PageElement(By.xpath("//td//div[contains(text(),'Escalation Percentage for Electronic Equipment')]/following::input"), "Escalation Percentage for Electronic Equipment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverValidFromTextField=new PageElement(By.xpath("//td/div[contains(text(),'Cover Valid From')]/following::input"),"Cover Valid From Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensnOfTestingPeriodTextField=new PageElement(By.xpath("//td/div[contains(text(),'Extension of Testing Period Beyond Policy Expiry(In Months)')]/following::input"),"Extension of Testing Period Beyond Policy Expiry(In Months) Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//ER-EC
		isCoverReqForEscalationCoverDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Escalation Cover')]/following::select"), "Is Escalation Cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isCovReqForDismantlingRiskDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Dismantling Risk For Used/Sec Hand Equipments')]/following::select"), "Is Cover Required For Dismantling Risk", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsForDismantlingRiskTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured For Dismantling Risk')]/following::input"),"Cover Valid From Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isCovReqForMaintCoverDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is Cover Required For Maintenance Cover')]/following::select"), "Is Cover Required For Maintenance Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverTypeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Cover Type')]/following::select"), "Cover Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		periodInMonthsForMCTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period(In Months) For Maintenance Cover')]/following::input"),"Period(In Months) For Maintenance Cover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//ALOP
		whetherTerrorismIsRequiredForALOPRiskDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Terrorism is required for ALOP Risk')]/following::select"),"Whether Terrorism is required for ALOP Risk drodown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateForTerrorismALOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Rate for Terrorism(ALOP)')]/following::input"),"Rate for Terrorism(ALOP) text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//EI
		applicableSumInsuredDuringExtnPeriodTextField=new PageElement(By.xpath("//td//div[contains(text(),'Applicable Sum Insured during Extension Period')]/following::input"),"Applicable Sum Insured during Extension Period text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionPeriodInMonthTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extension Period (In Months)')]/following::input"),"Extension Period (In Months) text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableAddOnSumInsuredDuringExtnPeriodTextField=new PageElement(By.xpath("//td//div[contains(text(),'Applicable Add on Sum Insured during Extension Period')]/following::input"),"Applicable Add on Sum Insured during Extension Period text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		closeButton=new PageElement(By.name("btnClose"), "Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButton=new PageElement(By.name("btnAdd"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		cPMGroup1OpenButton= new PageElement(By.xpath("//td//div[contains(text(),'CPM Group1')]/following::input"), "Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cPMGroupIMachinesSumInsureTextField= new PageElement(By.name("Data_213661905022010_0"), "CPM GroupI Machines SumInsure", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quantityTextField= new PageElement(By.name("Data_7824601102001_0"), "Quntity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionofItemsTextField= new PageElement(By.name("Data_213662005022010_0"), "Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalCPMGroupSumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total CPM Group Sum insured')]/following::input"), "Total CPM Group Sum insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//ER
		typeOfRiskForTerrorismExtensionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of risk for Terrorism extension')]/following::select"), "Type of risk for Terrorism extension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		terrorismInstallmentOptionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Terrorism Installment Option')]/following::select"), "Terrorism Installment Option", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalSumInsuredEMGTextField= new PageElement(By.xpath("//div[contains(text(),'Total Sum Insured(Eng)')]/following::input[1]"), "Total Sum Insured(EMG)Text Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void fillPolicyInsuredIntrestAttachDetailsofTerrorismCover(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity, CustomAssert assertReference)throws InterruptedException{
		if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("add") || attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("edit")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigNetPremiumFilledbyHOOnly")) {
				clearAndSendKeys(netPremiumFilledbyHOOnlyTextField, attachCoverTerrorismCEntity.getStringValueForField("NetPremiumFilledbyHOOnly"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPremiumChargeable")) {
				clearAndSendKeys(premiumChargeableTextField, attachCoverTerrorismCEntity.getStringValueForField("PremiumChargeable"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForAirFreight")){
				selectValueFromList(isCoverRequiredForAirFreightDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForAirFreight"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForAirFreight")) {
				clearAndSendKeys(sumInsuredForAirFreightTextField, attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForAirFreight"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForSurroundingProperty")){
				selectValueFromList(isCoverRequiredForSurroundingPropertyDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForSurroundingProperty"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForSurroundingProperty")) {
				clearAndSendKeys(sumInsuredForSurroundingPropertyTextField, attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForSurroundingProperty"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForThirdPartyLiability")){
				selectValueFromList(isCoverRequiredForThirdPartyLiabilityDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForThirdPartyLiability"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForThirdPartyLiability")) {
				clearAndSendKeys(sumInsuredForThirdPartyLiabilityTextField, attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForThirdPartyLiability"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForAdditionalCustomDuty")){
				selectValueFromList(isCoverRequiredForAdditionalCustomDutyDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForAdditionalCustomDuty"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForAdditionalCustomDuty")) {
				clearAndSendKeys(sumInsuredForAdditionalCustomDutyTextField, attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForAdditionalCustomDuty"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForRemovalOfDebris")){
				selectValueFromList(isCoverRequiredForRemovalOfDebrisDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForRemovalOfDebris"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForRemovalOfDebris")) {
				clearAndSendKeys(sumInsuredForRemovalOfDebrisTextField, attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForRemovalOfDebris"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForTerrorismExtension")){
				selectValueFromList(isCoverRequiredForTerrorismExtensionDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForTerrorismExtension"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigRiskTypeForTerrorismExtension")){
				selectValueFromList(riskTypeForTerrorismExtensionDropDown,attachCoverTerrorismCEntity.getStringValueForField("RiskTypeForTerrorismExtension"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigWhetherEscalationCoverIsRequired")){
				selectValueFromList(whetherEscalationCoverIsRequiredDropDown,attachCoverTerrorismCEntity.getStringValueForField("WhetherEscalationCoverIsRequired"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalationPercentageForProject")) {
				clearAndSendKeys(escalationPercentageForProjectTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalationPercentageForProject"));
			}
			//ALOP
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForPreventionOfAccess")){
				selectValueFromList(isCoverRequiredForPreventionOfAccessDropdown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForPreventionOfAccess"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPreventionOfAccessPeriodInWeeks")) {
				clearAndSendKeys(preventionOfAccessPeriodInWeeksTextField, attachCoverTerrorismCEntity.getStringValueForField("PreventionOfAccessPeriodInWeeks"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForDenialOfAccess")){
				selectValueFromList(isCoverRequiredForDenialOfAccessDropdown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForDenialOfAccess"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDenialOfAccessPeriodInWeeks")) {
				clearAndSendKeys(denialOfAccessPeriodInWeeksTextfield, attachCoverTerrorismCEntity.getStringValueForField("DenialOfAccessPeriodInWeeks"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForFailureOfPublicPow")){
				selectValueFromList(isCoverRequiredForFailureOfPublicPowerSupplyDropdown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForFailureOfPublicPow"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigFailureOfPublicPowerSupply")) {
				clearAndSendKeys(failureOfPublicPowerSupplyPeriodInWeeksTextField, attachCoverTerrorismCEntity.getStringValueForField("FailureOfPublicPowerSupply"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForSuppliersExtension")){
				selectValueFromList(isCoverRequiredForSuppliersExtensionDropdown,attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForSuppliersExtension"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSuppliersExtensionPeriodInWeeks")) {
				clearAndSendKeys(suppliersExtensionPeriodInWeeksTextField, attachCoverTerrorismCEntity.getStringValueForField("SuppliersExtensionPeriodInWeeks"));
			}
			//le
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigInvoiceCostOfImportedItems")) {
				clearAndSendKeys(InvoCostOfImpoItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("InvoiceCostOfImportedItems"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExchangeRate1")) {
				clearAndSendKeys(ExRate1TextField, attachCoverTerrorismCEntity.getStringValueForField("ExchangeRate1"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCustomDuty1")) {
				clearAndSendKeys(CustomDuty1TextField, attachCoverTerrorismCEntity.getStringValueForField("CustomDuty1"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigFrInsHandClearForCharUptoFactory")) {
				clearAndSendKeys(FreightInsHandClearForCharUptoFactTextField, attachCoverTerrorismCEntity.getStringValueForField("FrInsHandClearForCharUptoFactory"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigLandCostOfImpItems")) {
				clearAndSendKeys(LandCostOfImpItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("LandCostOfImpItems"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscPerForImpItems")) {
				clearAndSendKeys(EscPerForImpItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("EscPerForImpItems"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscValForImpItems")) {
				clearAndSendKeys(EscValForImpItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("EscValForImpItems"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigLandCostOfIndItem")) {
				clearAndSendKeys(LandCostOfIndsItemTextField, attachCoverTerrorismCEntity.getStringValueForField("LandCostOfIndItem"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExciseDuty")) {
				clearAndSendKeys(ExDutyTextField, attachCoverTerrorismCEntity.getStringValueForField("ExciseDuty"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalValOfIndItems")) {
				clearAndSendKeys(TotalValOfIndsItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalValOfIndItems"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalPerForIndItems")) {
				clearAndSendKeys(EscPerForIndsItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalPerForIndItems"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalValForIndItems")) {
				clearAndSendKeys(EscValuForIndItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalValForIndItems"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCostOfErection")) {
				clearAndSendKeys(CostOfErectionTextField, attachCoverTerrorismCEntity.getStringValueForField("CostOfErection"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPerCivilWork")) {
				clearAndSendKeys(PermanentCivilWorkTextField, attachCoverTerrorismCEntity.getStringValueForField("PerCivilWork"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalPerForPerCivilWork")) {
				clearAndSendKeys(EscPerForPerCivilWorkTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalPerForPerCivilWork"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalValForPerCivilWork")) {
				clearAndSendKeys(EscValForPerCivilWorkTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalValForPerCivilWork"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTempCivilWork")) {
				clearAndSendKeys(TempCivilWorkTextField, attachCoverTerrorismCEntity.getStringValueForField("TempCivilWork"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalSumInsNewMachine")) {
				clearAndSendKeys(TotalSumInsuredNewMachineTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalSumInsNewMachine"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsThereAnyUsedSecHandMach")) {
				selectValueFromList(IsThereAnyUsedSecHandMachDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsThereAnyUsedSecHandMach"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalProjectSumInsured")) {
				clearAndSendKeys(TotalProjSumInsuredTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalProjectSumInsured"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalEscalationValue")) {
				clearAndSendKeys(TotalEscValTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalEscalationValue"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigNetPremRatePerMilleForProject")) {
				clearAndSendKeys(NetPremPerMilleForProjTextField, attachCoverTerrorismCEntity.getStringValueForField("NetPremRatePerMilleForProject"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDeductWordForSectionIProjectWorks")) {
				clearAndSendKeys(DedWordingForSectIProjWorkTextArea, attachCoverTerrorismCEntity.getStringValueForField("DeductWordForSectionIProjectWorks"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMinDeductAmtSectionIProjectWorks")) {
				clearAndSendKeys(MinDedAmountSectIProjWorksTextField, attachCoverTerrorismCEntity.getStringValueForField("MinDeductAmtSectionIProjectWorks"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigGeographicalLimitsLargeRisk")) {
				clearAndSendKeys(GeogrLimitsLargeRiskTextArea, attachCoverTerrorismCEntity.getStringValueForField("GeographicalLimitsLargeRisk"));
			}

			//MB
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsEscalationCoverRequiredMB")){
				selectValueFromList(isEscalationCoverRequiredMBDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsEscalationCoverRequiredMB"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalationPercentageforMachine")) {
				clearAndSendKeys(escalationPercentageforMachineTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalationPercentageforMachine"));
			}
			//le
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTerrorismAddOn1017")){
				selectValueFromList(terrorismAddOn1017DropDown,attachCoverTerrorismCEntity.getStringValueForField("TerrorismAddOn1017"));
			}
			//EF
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalationPercentageElectronicEquipment")) {
				clearAndSendKeys(escalationPercentageElectronicEquipmentTextField, attachCoverTerrorismCEntity.getStringValueForField("EscalationPercentageElectronicEquipment"));
			}
			//ME
			if (attachCoverTerrorismCEntity.getBooleanValueForField("Configcovervalidfrom")) {
				String coverValid=RandomCodeGenerator.dateGenerator(attachCoverTerrorismCEntity.getStringValueForField("covervalidfrom"));
				clearAndEnterDate(coverValidFromTextField, coverValid);

			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExtensionofTesting")) {
				clearAndSendKeys(extensnOfTestingPeriodTextField, attachCoverTerrorismCEntity.getStringValueForField("ExtensionofTesting"));
			}
			//ER-EC
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsEscalationCoverRequiredEC")){
				selectValueFromList(isCoverReqForEscalationCoverDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsEscalationCoverRequiredEC"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCovReqForDismantlingRisk")){
				selectValueFromList(isCovReqForDismantlingRiskDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCovReqForDismantlingRisk"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsForDismantlingRisk")) {
				clearAndSendKeys(sumInsForDismantlingRiskTextField, attachCoverTerrorismCEntity.getStringValueForField("SumInsForDismantlingRisk"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCovReqForMaintCover")){
				selectValueFromList(isCovReqForMaintCoverDropDown,attachCoverTerrorismCEntity.getStringValueForField("IsCovReqForMaintCover"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCoverType")){
				selectValueFromList(coverTypeDropDown,attachCoverTerrorismCEntity.getStringValueForField("CoverType"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPeriodInMonthsForMC")) {
				clearAndSendKeys(periodInMonthsForMCTextField, attachCoverTerrorismCEntity.getStringValueForField("PeriodInMonthsForMC"));
			}
			//CR

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCPMGroup1Button")) {
				fillCPMGroup1(attachCoverTerrorismCEntity);
			}
			
			//ER
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTypeOfRiskForTerrorismExtension")){
				selectValueFromList(typeOfRiskForTerrorismExtensionDropDown,attachCoverTerrorismCEntity.getStringValueForField("TypeOfRiskForTerrorismExtension"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTerrorismInstallmentOption")){
				selectValueFromList(terrorismInstallmentOptionDropDown,attachCoverTerrorismCEntity.getStringValueForField("TerrorismInstallmentOption"));
			}
			if(attachCoverTerrorismCEntity.getStringValueForField("Product").equalsIgnoreCase("ME"))
			{
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigApplicableSumInsuredDuringExtnPeriod")) {
				clearAndSendKeys(applicableSumInsuredDuringExtnPeriodTextField, attachCoverTerrorismCEntity.getStringValueForField("ApplicableSumInsuredDuringExtnPeriod"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExtensionPeriodInMonth")) {
				clearAndSendKeys(extensionPeriodInMonthTextField, attachCoverTerrorismCEntity.getStringValueForField("ExtensionPeriodInMonth"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigcovervalidfromME")) {
				String coverValid=RandomCodeGenerator.dateGenerator(attachCoverTerrorismCEntity.getStringValueForField("covervalidfromME"));
				clearAndEnterDate(coverValidFromTextField, coverValid);

			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalSumInsuredEMG")) {
				//clearAndSendKeys(totalSumInsuredEMGTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalSumInsuredEMG"));


			}
			
			click(forwordButton);
			switchToFrame("display");
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigApplicableAddOnSumInsuredDuringExtnPeriod")) {
				clearAndSendKeys(applicableAddOnSumInsuredDuringExtnPeriodTextField, attachCoverTerrorismCEntity.getStringValueForField("ApplicableAddOnSumInsuredDuringExtnPeriod"));
			}
			click(forwordButton);
			}
		}
		else if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("verify")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigNetPremiumFilledbyHOOnly")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("NetPremiumFilledbyHOOnly"), fetchValueFromTextFields(netPremiumFilledbyHOOnlyTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPremiumChargeable")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("PremiumChargeable"), fetchValueFromTextFields(premiumChargeableTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForAirFreight")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForAirFreight"), fetchValueFromList(isCoverRequiredForAirFreightDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForAirFreight")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForAirFreight"), fetchValueFromTextFields(sumInsuredForAirFreightTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForSurroundingProperty")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForSurroundingProperty"), fetchValueFromList(isCoverRequiredForSurroundingPropertyDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForSurroundingProperty")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForSurroundingProperty"), fetchValueFromTextFields(sumInsuredForSurroundingPropertyTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForThirdPartyLiability")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForThirdPartyLiability"), fetchValueFromList(isCoverRequiredForThirdPartyLiabilityDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForThirdPartyLiability")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForThirdPartyLiability"), fetchValueFromTextFields(sumInsuredForThirdPartyLiabilityTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForAdditionalCustomDuty")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForAdditionalCustomDuty"), fetchValueFromList(isCoverRequiredForAdditionalCustomDutyDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForAdditionalCustomDuty")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForAdditionalCustomDuty"), fetchValueFromTextFields(sumInsuredForAdditionalCustomDutyTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForRemovalOfDebris")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForRemovalOfDebris"), fetchValueFromList(isCoverRequiredForRemovalOfDebrisDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsuredForClearanceAndRemovalOfDebris")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SumInsuredForClearanceAndRemovalOfDebris"), fetchValueFromTextFields(sumInsuredForRemovalOfDebrisTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForTerrorismExtension")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForTerrorismExtension"), fetchValueFromList(isCoverRequiredForTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigRiskTypeForTerrorismExtension")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("RiskTypeForTerrorismExtension"), fetchValueFromList(riskTypeForTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigWhetherEscalationCoverIsRequired")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("WhetherEscalationCoverIsRequired"), fetchValueFromList(whetherEscalationCoverIsRequiredDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalationPercentageForProject")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalationPercentageForProject"), fetchValueFromTextFields(escalationPercentageForProjectTextField), AssertionType.WARNING);
			}
			//MB
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsEscalationCoverRequiredMB")){
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsEscalationCoverRequiredMB"), fetchValueFromList(isEscalationCoverRequiredMBDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalationPercentageforMachine")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalationPercentageforMachine"), fetchValueFromTextFields(escalationPercentageforMachineTextField), AssertionType.WARNING);
			}
			//ER-EC
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsEscalationCoverRequiredEC")){
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsEscalationCoverRequiredEC"), fetchValueFromList(isCoverReqForEscalationCoverDropDown), AssertionType.WARNING);
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCovReqForDismantlingRisk")){
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCovReqForDismantlingRisk"), fetchValueFromList(isCovReqForDismantlingRiskDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSumInsForDismantlingRisk")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SumInsForDismantlingRisk"), fetchValueFromTextFields(sumInsForDismantlingRiskTextField), AssertionType.WARNING);
			}
			//ALOP
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForPreventionOfAccess")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForPreventionOfAccess"), fetchValueFromList(isCoverRequiredForPreventionOfAccessDropdown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPreventionOfAccessPeriodInWeeks")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("PreventionOfAccessPeriodInWeeks"), fetchValueFromTextFields(preventionOfAccessPeriodInWeeksTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForDenialOfAccess")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForDenialOfAccess"), fetchValueFromList(isCoverRequiredForDenialOfAccessDropdown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDenialOfAccessPeriodInWeeks")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("DenialOfAccessPeriodInWeeks"), fetchValueFromTextFields(denialOfAccessPeriodInWeeksTextfield), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForFailureOfPublicPow")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForFailureOfPublicPow"), fetchValueFromList(isCoverRequiredForFailureOfPublicPowerSupplyDropdown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigFailureOfPublicPowerSupply")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("FailureOfPublicPowerSupply"), fetchValueFromTextFields(failureOfPublicPowerSupplyPeriodInWeeksTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsCoverRequiredForSuppliersExtension")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsCoverRequiredForSuppliersExtension"), fetchValueFromList(isCoverRequiredForSuppliersExtensionDropdown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSuppliersExtensionPeriodInWeeks")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("SuppliersExtensionPeriodInWeeks"), fetchValueFromTextFields(suppliersExtensionPeriodInWeeksTextField), AssertionType.WARNING);
			}
			//le
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigInvoiceCostOfImportedItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("InvoiceCostOfImportedItems"), fetchValueFromTextFields(InvoCostOfImpoItemsTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExchangeRate1")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("ExchangeRate1"), fetchValueFromTextFields(ExRate1TextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCustomDuty1")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("CustomDuty1"), fetchValueFromTextFields(CustomDuty1TextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigFrInsHandClearForCharUptoFactory")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("FrInsHandClearForCharUptoFactory"), fetchValueFromTextFields(FreightInsHandClearForCharUptoFactTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigLandCostOfImpItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("LandCostOfImpItems"), fetchValueFromTextFields(LandCostOfImpItemsTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscPerForImpItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscPerForImpItems"), fetchValueFromTextFields(EscPerForImpItemsTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscValForImpItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscValForImpItems"), fetchValueFromTextFields(EscValForImpItemsTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigLandCostOfIndItem")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("LandCostOfIndItem"), fetchValueFromTextFields(LandCostOfIndsItemTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExciseDuty")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("ExciseDuty"), fetchValueFromTextFields(ExDutyTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalValOfIndItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TotalValOfIndItems"), fetchValueFromTextFields(TotalValOfIndsItemsTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalPerForIndItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalPerForIndItems"), fetchValueFromTextFields(EscPerForIndsItemsTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalValForIndItems")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalValForIndItems"), fetchValueFromTextFields(EscValuForIndItemsTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCostOfErection")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("CostOfErection"), fetchValueFromTextFields(CostOfErectionTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPerCivilWork")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("PerCivilWork"), fetchValueFromTextFields(PermanentCivilWorkTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalPerForPerCivilWork")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalPerForPerCivilWork"), fetchValueFromTextFields(EscPerForPerCivilWorkTextField), AssertionType.WARNING);
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalValForPerCivilWork")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalValForPerCivilWork"), fetchValueFromTextFields(EscValForPerCivilWorkTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTempCivilWork")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TempCivilWork"), fetchValueFromTextFields(TempCivilWorkTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalSumInsNewMachine")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TotalSumInsNewMachine"), fetchValueFromTextFields(TotalSumInsuredNewMachineTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsThereAnyUsedSecHandMach")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("IsThereAnyUsedSecHandMach"), fetchValueFromList(IsThereAnyUsedSecHandMachDropDown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalProjectSumInsured")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TotalProjectSumInsured"), fetchValueFromTextFields(TotalProjSumInsuredTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalEscalationValue")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TotalEscalationValue"), fetchValueFromTextFields(TotalEscValTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigNetPremRatePerMilleForProject")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("NetPremRatePerMilleForProject"), fetchValueFromTextFields(NetPremPerMilleForProjTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDeductWordForSectionIProjectWorks")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("DeductWordForSectionIProjectWorks"), fetchValueFromTextFields(DedWordingForSectIProjWorkTextArea), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMinDeductAmtSectionIProjectWorks")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("MinDeductAmtSectionIProjectWorks"), fetchValueFromTextFields(MinDedAmountSectIProjWorksTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigGeographicalLimitsLargeRisk")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("GeographicalLimitsLargeRisk"), fetchValueFromTextFields(GeogrLimitsLargeRiskTextArea), AssertionType.WARNING);
			}
			//le
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTerrorismAddOn1017")){
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TerrorismAddOn1017"), fetchValueFromList(terrorismAddOn1017DropDown), AssertionType.WARNING);
			}
			//EF
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigEscalationPercentageElectronicEquipment")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("EscalationPercentageElectronicEquipment"), fetchValueFromTextFields(escalationPercentageElectronicEquipmentTextField), AssertionType.WARNING);
			}

			//EI
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigApplicableSumInsuredDuringExtnPeriod")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("ApplicableSumInsuredDuringExtnPeriod"), fetchValueFromTextFields(applicableSumInsuredDuringExtnPeriodTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExtensionPeriodInMonth")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("ExtensionPeriodInMonth"), fetchValueFromTextFields(extensionPeriodInMonthTextField), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigApplicableAddOnSumInsuredDuringExtnPeriod")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("ApplicableAddOnSumInsuredDuringExtnPeriod"), fetchValueFromTextFields(applicableAddOnSumInsuredDuringExtnPeriodTextField), AssertionType.WARNING);
			}
			
			//ER
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTypeOfRiskForTerrorismExtension")){
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TypeOfRiskForTerrorismExtension"), fetchValueFromList(typeOfRiskForTerrorismExtensionDropDown), AssertionType.WARNING);
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTerrorismInstallmentOption")){
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("TerrorismInstallmentOption"), fetchValueFromList(terrorismInstallmentOptionDropDown), AssertionType.WARNING);
			}
		}	
	}

	//Add On Covers-2 //ALOP_Product
	public void fillAddOnCovers2PageDetails(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity, CustomAssert assertReference)throws InterruptedException{
		if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("add") || attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("edit")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigNumberOfPerilsToBeCovered")) {
				clearAndSendKeys(numberOfPerilsToBeCoveredTextField, attachCoverTerrorismCEntity.getStringValueForField("NumberOfPerilsToBeCovered"));
			}
			click(forwordButton);
			switchToFrame("display");
			addOnCoverTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+attachCoverTerrorismCEntity.getStringValueForField("AddOnCoverTitle")+"')]"), "Add On Cover Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(addOnCoverTitle);
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalCPMGroupSumInsured")) {
				clearAndSendKeys(totalCPMGroupSumInsuredTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalCPMGroupSumInsured"));
			}
		}
		else if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("verify")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigNumberOfPerilsToBeCovered")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("NumberOfPerilsToBeCovered"), fetchValueFromTextFields(numberOfPerilsToBeCoveredTextField), AssertionType.WARNING);
			}
			click(forwordButton);
			switchToFrame("display");
			addOnCoverTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+attachCoverTerrorismCEntity.getStringValueForField("AddOnCoverTitle")+"')]"), "Add On Cover Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(addOnCoverTitle);
		}
	}
	private void fillAddOnCoversCPMForCRDetails(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity,CustomAssert assertReference) {
		if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("add") || attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("edit")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigTotalCPMGroupSumInsured")) {
				clearAndSendKeys(totalCPMGroupSumInsuredTextField, attachCoverTerrorismCEntity.getStringValueForField("TotalCPMGroupSumInsured"));
			}
		}
	}
	//ALOP_Product
	public void fillTerrorismCoverDetails(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity, CustomAssert assertReference)throws InterruptedException{
		if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("add") || attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("edit")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigWhetherTerrorismIsRequiredForALOPRisk")) {
				selectValueFromList(whetherTerrorismIsRequiredForALOPRiskDropdown, attachCoverTerrorismCEntity.getStringValueForField("WhetherTerrorismIsRequiredForALOPRisk"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigRateForTerrorismALOP")) {
				clearAndSendKeys(rateForTerrorismALOPTextField, attachCoverTerrorismCEntity.getStringValueForField("RateForTerrorismALOP"));
			}
			click(forwordButton);
			switchToFrame("display");
		}
		else if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("verify")){
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigWhetherTerrorismIsRequiredForALOPRisk")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("WhetherTerrorismIsRequiredForALOPRisk"), fetchValueFromList(whetherTerrorismIsRequiredForALOPRiskDropdown), AssertionType.WARNING);
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigRateForTerrorismALOP")) {
				assertReference.assertEquals(attachCoverTerrorismCEntity.getStringValueForField("RateForTerrorismALOP"), fetchValueFromTextFields(rateForTerrorismALOPTextField), AssertionType.WARNING);
			}
			click(forwordButton);
			switchToFrame("display");

		}
	}


	public void clickOnOpenButton(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity) throws InterruptedException{
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigOpenButton")){
			click(cPMGroup1OpenButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("'CPM Group1' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'CPM Group1' Details");
			}
		}
	}
	private void fillCPMGroup1(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity) throws InterruptedException {
		clickOnOpenButton(attachCoverTerrorismCEntity);
		Thread.sleep(3000);
		if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCPMGroupIMachinesSumInsure")) {
				clearAndSendKeys(cPMGroupIMachinesSumInsureTextField, attachCoverTerrorismCEntity.getStringValueForField("CPMGroupIMachinesSumInsure"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigQuantity")) {
				clearAndSendKeys(quantityTextField, attachCoverTerrorismCEntity.getStringValueForField("Quantity"));
			}
			if(attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDescriptionofItems")) {
				clearAndSendKeys(descriptionofItemsTextField, attachCoverTerrorismCEntity.getStringValueForField("DescriptionofItems"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSavebuttonForCR")){
				Thread.sleep(3000);
				click(saveButton);	
				click(closeButton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}
	public void navigateToPolicy(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToPolicyAttribute(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToPolicyMember(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(memberHomePageTitle);
		}
	}
	public void navigateToPolicyCoverage(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToPolicyClientDetils(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToPolicyRelations(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigRelationsTab")) {
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPolicyPayments(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToPolicyFollowup(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToPolicyDocuments(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}

	public void navigateToPolicyMemberDetails(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMemberDetailTab")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(memberDetailPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMemberAttributesTab")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigAttachCoveragesTab")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMemberRelationsTab")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigMemberPaymentsTab")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDetailsTab")) {
			click(attachCoveragesDetailTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
			click(attachCoveragesAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesAttributesPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity){
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigPremiumTab")) {
			click(attachCoveragesPremiumTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}

	private void saveButtonPolicyMemberAttachCoveragseAttributes(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity) {
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	private void forwardButtonPolicyMemberAttachCoveragseAttributes(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity) {
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(forwordButton);
			switchToFrame("display");
		}
		else if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigDoubleForwordButton")){			
			click(forwordButton);
			click(forwordButton);
			switchToFrame("display");
		}
	}
	private void navigateToPolicyPremiumLink(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity) {
		if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigAttachCoveragesPremium")) {
			click(attachCoveragesPremiumLinkForEng);
			switchToFrame("display");
		}
	}
	public void fillAddOnCoversPageDetailsER(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity, CustomAssert assertReference)throws InterruptedException{
		if(attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("add") || attachCoverTerrorismCEntity.getAction().equalsIgnoreCase("edit")){
			//ER
			if(!attachCoverTerrorismCEntity.getBooleanValueForField("ConfigIsTerrorismCov"))
			{
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigApplicableSumInsuredDuringExtnPeriod")) {
				clearAndSendKeys(applicableSumInsuredDuringExtnPeriodTextField, attachCoverTerrorismCEntity.getStringValueForField("ApplicableSumInsuredDuringExtnPeriod"));
			}
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigExtensionPeriodInMonth")) {
				clearAndSendKeys(extensionPeriodInMonthTextField, attachCoverTerrorismCEntity.getStringValueForField("ExtensionPeriodInMonth"));
			}

			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigcovervalidfromER")) {
				String coverValid=RandomCodeGenerator.dateGenerator(attachCoverTerrorismCEntity.getStringValueForField("covervalidfromER"));
				clearAndEnterDate(coverValidFromTextField, coverValid);

			}
			click(forwordButton);
			switchToFrame("display");
			if (attachCoverTerrorismCEntity.getBooleanValueForField("ConfigApplicableAddOnSumInsuredDuringExtnPeriod")) {
				clearAndSendKeys(applicableAddOnSumInsuredDuringExtnPeriodTextField, attachCoverTerrorismCEntity.getStringValueForField("ApplicableAddOnSumInsuredDuringExtnPeriod"));
			}
			if(!(attachCoverTerrorismCEntity.getStringValueForField("Product").equalsIgnoreCase("ER"))){
			click(forwordButton);
			switchToFrame("display");
			click(forwordButton);
			switchToFrame("display");
			click(forwordButton);
			switchToFrame("display");
			}
		}
		}
	}
	public void fillAndSubmitPolicyMemberAttachCoveragseAttributesDetails(AttachCoverTerrorismCEntity attachCoverTerrorismCEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(attachCoverTerrorismCEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestAttachDetailsofTerrorismCover(attachCoverTerrorismCEntity,assertReference);
			forwardButtonPolicyMemberAttachCoveragseAttributes(attachCoverTerrorismCEntity);
			if(attachCoverTerrorismCEntity.getStringValueForField("Product").equalsIgnoreCase("ALOP")){
				fillAddOnCovers2PageDetails(attachCoverTerrorismCEntity, assertReference);
				fillTerrorismCoverDetails(attachCoverTerrorismCEntity, assertReference);
			}
			if(attachCoverTerrorismCEntity.getStringValueForField("Product").equalsIgnoreCase("CR")){
				fillAddOnCoversCPMForCRDetails(attachCoverTerrorismCEntity, assertReference);
			}
			if(attachCoverTerrorismCEntity.getStringValueForField("Product").equalsIgnoreCase("ER")||attachCoverTerrorismCEntity.getStringValueForField("Product").equalsIgnoreCase("CR")){
				fillAddOnCoversPageDetailsER(attachCoverTerrorismCEntity, assertReference);
			}
			saveButtonPolicyMemberAttachCoveragseAttributes(attachCoverTerrorismCEntity);
			navigateToPolicyAttachCoveragesAttributes(attachCoverTerrorismCEntity);
			navigateToPolicyMember(attachCoverTerrorismCEntity);
			navigateToPolicy(attachCoverTerrorismCEntity);
			navigateToPolicyAttribute(attachCoverTerrorismCEntity);
			navigateToPolicyCoverage(attachCoverTerrorismCEntity);
			navigateToPolicyClientDetils(attachCoverTerrorismCEntity);
			navigateToPolicyRelations(attachCoverTerrorismCEntity);
			navigateToPolicyPayments(attachCoverTerrorismCEntity);
			navigateToPolicyFollowup(attachCoverTerrorismCEntity);
			navigateToPolicyDocuments(attachCoverTerrorismCEntity);
			navigateToPolicyMemberDetails(attachCoverTerrorismCEntity);
			navigateToPolicyMemberDetails(attachCoverTerrorismCEntity);
			navigateToPolicyMemberRelations(attachCoverTerrorismCEntity);
			navigateToPolicyMemberPayments(attachCoverTerrorismCEntity);
			navigateToPolicyAttachCoveragesDetails(attachCoverTerrorismCEntity);
			navigateToPolicyAttachCoveragesPremium(attachCoverTerrorismCEntity);
			navigateToPolicyPremiumLink(attachCoverTerrorismCEntity);
		}
	}

}