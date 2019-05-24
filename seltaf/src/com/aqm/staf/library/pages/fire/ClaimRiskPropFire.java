package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskPropFireEntity;

public class ClaimRiskPropFire extends BasePage{
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;

	private PageElement claimTabTitle;
	private PageElement insuredItemTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemrDetailsTabTitle;
	private PageElement insuredItemrAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	//Buttons
	private PageElement backButton;
	private PageElement nextArrowButton;
	private PageElement nextPageTitle;
	//LR
	private PageElement insuredNameTextField;
	private PageElement claimAssessedAmountTextField;	
	private PageElement salvageAmountTextField;	
	private PageElement depreciationAmountTextField;	
	private PageElement underinsuranceAmountTextField;	
	private PageElement totalDeductibleAmountTextField;	
	private PageElement totalRecoveredAmountTextField;
	private PageElement claimSettlementAmountTextField;	
	private PageElement riskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlossesTextArea;	
	private PageElement basisofIndemnityDropDown;
	private PageElement noOfDaysforBusinessinterruptionTextField;
	private PageElement noOfDaysDeductedTimedeductibleTextField; 
	
	//*********AR(CHINTAN)*******
	//private PageElement	insuredNameTextField;	 
	private PageElement	basisOfIndemnityTextField;		
	private PageElement	estimatedAmountOfLossasperInsuredsIntimationTextField;		 
	private PageElement	whetherclaimisCloseProximityclaimDropDown;	
	private PageElement whetherApprovalOfCompetentAuthorityObtainedDropDown; 
	private PageElement	whetherClaimiSwithinselfSurveylimitDropDown;
	private PageElement	estimatedAmountofLossasPerpreliminarysurveyorTextField;		 
	private PageElement	estimatedAmountofLossAsPerfinalsurveyorTextField;	
	private PageElement assessedAmountOfIfSelfSurveyedTextField;
	private PageElement	assessedAmountOfLossbythefinalsurveyorTextField;		 
	private PageElement	salvageRealizationAmountaccountedinthefinalsurveyreportTextField;		 
	private PageElement	excessAccountedInthefinalsurveyreportTextField;		 
	private PageElement	approvedClaimSettlementAmountTextField;		 
	private PageElement	isAnyRecoverypendingWithTheInsuredonanyUWorClaimMatterDropDown;	
	private PageElement	amountToBeRecoveredTextField;
	private PageElement	pleaseMentionTheOtherNatureOflossIfApplicableTextField;		 
	private PageElement	claimToBeRaisedForSectionDropDown;
	private PageElement blockTypeDropDown;
	private PageElement deductibleForLOPTextField;

	//*********FD SAME AS AR(CHINTAN)*******
	//*********FP(CHINTAN)*******
	private PageElement	riskCoveredtTextField; 
	private PageElement	optedCoverdetailsTextField;	 
	private PageElement	specialPerilsTextField;	 
	private PageElement	specialExclusionsTextField;	 
	private PageElement	subjectToClauseTextField; 
	private PageElement	selectionCoverageforclaimDropDown;	
	private PageElement	excessInPercentageForPTDTextField;	 
	private PageElement	specialConditionsTextField;	 
	private PageElement	specialDiscountAmountTextField;	 
	private PageElement	sumInsuredRsTextField;	 
	private PageElement	estimatedClaimAmountTextField;	 
	private PageElement	claimPayableAmountTextField; 
	private PageElement	nameOfwitnessTextField;	 
	private PageElement	addressOfwitnessTextField;	 
	private PageElement	whetherThepolicyIs64VBcompliantDropDown;


	public ClaimRiskPropFire(WebDriver driver, String pageName) {
		super(driver,pageName);
		
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attribute')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Details",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTab= new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Attributes",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTitle= new PageElement(By.xpath("//div//b[contains(text(),'Insured InterestDamage')]"), "Insured Item Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Number Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Payment Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Damage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemrAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), "Attribute Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Buttons
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//LR
		insuredNameTextField= new PageElement(By.xpath("//td//div[contains(text(),'Insured Name')]/following::input"), "Insured Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssessedAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim assessed Amount')]/following::input"), "Claim assessed Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		salvageAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Salvage Amount')]/following::input"), "Salvage Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		depreciationAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Depreciation Amount ')]/following::input"), "Depreciation Amount ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underinsuranceAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Under insurance amount ')]/following::input"), "Under insurance amount ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalDeductibleAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Deductible Amount')]/following::input"), "Total Deductible Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalRecoveredAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Recovered Amount')]/following::input"), "Total Recovered Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSettlementAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Settlement Amount ')]/following::input"), "Claim Settlement Amount ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlossesTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Risk Improvement measurers')]/following::input"), "Risk Improvement measurers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basisofIndemnityDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Basis of Indemnity')]/following::select"), "Basis of Indemnity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noOfDaysforBusinessinterruptionTextField= new PageElement(By.xpath("//td//div[contains(text(),'No of days for Business interruption')]/following::input"), "No of days for Business interruption", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfDaysDeductedTimedeductibleTextField= new PageElement(By.xpath("//td//div[contains(text(),'No of days deducted(time deductible) ')]/following::input"), "No of days deducted(time deductible) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//*********AR(CHINTAN)*******
		//insuredNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Insured Name')]/following::input"), "Insured Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basisOfIndemnityTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Indemnity')]/following::select"), "Basis of Indemnity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedAmountOfLossasperInsuredsIntimationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estimated Amount of Loss as per insureds intimation')]/following::input"), "Estimated Amount of Loss as per insureds intimation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		whetherclaimisCloseProximityclaimDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether claim is Close proximity claim')]/following::select"), "Whether claim is Close proximity claim", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherApprovalOfCompetentAuthorityObtainedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether approval of competent authority obtained in case of Close Proximate Claim')]/following::select"), "Whether approval of competent authority obtained in case of Close Proximate Claim", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherClaimiSwithinselfSurveylimitDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether claim is within self survey limit')]/following::select"), "Whether claim is within self survey limit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedAmountofLossasPerpreliminarysurveyorTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estimated Amount of Loss as per preliminary surveyor')]/following::input"), "Estimated Amount of Loss as per preliminary surveyor", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		estimatedAmountofLossAsPerfinalsurveyorTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estimated Amount of Loss as per final surveyor')]/following::input"), "Estimated Amount of Loss as per final surveyor", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedAmountOfIfSelfSurveyedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Amount of if Self Surveyed')]/following::input"), "Assessed Amount of if Self Surveyed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedAmountOfLossbythefinalsurveyorTextField=new PageElement(By.xpath("//td//div[contains(text(),'Assessed Amount of Loss by the final surveyor')]/following::input"), "Assessed Amount of Loss by the final surveyor", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		salvageRealizationAmountaccountedinthefinalsurveyreportTextField=new PageElement(By.xpath("//td//div[contains(text(),'Salvage Realization Amount accounted in the final survey report')]/following::input"), "Salvage Realization Amount accounted in the final survey report", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		excessAccountedInthefinalsurveyreportTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess accounted in the final survey report')]/following::input"), "Excess accounted in the final survey report", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		approvedClaimSettlementAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approved Claim Settlement Amount')]/following::input"), "Approved Claim Settlement Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		isAnyRecoverypendingWithTheInsuredonanyUWorClaimMatterDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is any recovery pending with the insured on any U/W or claim matter')]/following::select"), "Is any recovery pending with the insured on any U/W or claim matter", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		amountToBeRecoveredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount to be recovered')]/following::input"), "Amount to be recovered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		pleaseMentionTheOtherNatureOflossIfApplicableTextField=new PageElement(By.xpath("//td//div[contains(text(),'Please mention the other nature of loss,if applicable ')]/following::textarea"), "Please mention the other nature of loss,if applicable ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	 
		claimToBeRaisedForSectionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Claim To Be Raised For Section')]/following::select"), "Claim To Be Raised For Section", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		blockTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Block Type')]/following::select"), "Block Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForLOPTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible For LOP')]/following::textarea"), "Deductible For LOP", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//*********FP(CHINTAN)*******
		riskCoveredtTextField =new PageElement(By.xpath("//td//div[contains(text(),'Risk Covered')]/following::textarea"), "Risk Covered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		optedCoverdetailsTextField =new PageElement(By.xpath("//td//div[contains(text(),'Opted Cover details')]/following::textarea"), "Opted Cover details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialPerilsTextField =new PageElement(By.xpath("//td//div[contains(text(),'Special Perils')]/following::textarea"), "Special Perils", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialExclusionsTextField	 =new PageElement(By.xpath("//td//div[contains(text(),'Special Exclusions ')]/following::textarea"), "Special Exclusions ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subjectToClauseTextField=new PageElement(By.xpath("//td//div[contains(text(),'Subject to Clause ')]/following::input"), "Subject to Clause ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		selectionCoverageforclaimDropDown	=new PageElement(By.xpath("//td//div[contains(text(),'Selection coverage for claim')]/following::select"), "Selection coverage for claim", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessInPercentageForPTDTextField =new PageElement(By.xpath("//td//div[contains(text(),'Excess in (%) for PTD')]/following::input"), "Excess in (%) for PTD", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField =new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::testarea"), "Special Conditions ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialDiscountAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Special Discount Amount ')]/following::input"), "Special Discount Amount ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsTextField	 =new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured(Rs)')]/following::input"), "Sum Insured(Rs)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedClaimAmountTextField	 =new PageElement(By.xpath("//td//div[contains(text(),'Estimated Claim Amount')]/following::input"), "Estimated Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPayableAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim Payable Amount')]/following::input"), "Claim Payable Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameOfwitnessTextField =new PageElement(By.xpath("//td//div[contains(text(),'Name of witness ')]/following::input"), "Name of witness ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfwitnessTextField =new PageElement(By.xpath("//td//div[contains(text(),'Address of witness ')]/following::input"), "Address of witness ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherThepolicyIs64VBcompliantDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the policy is 64 VB compliant')]/following::select"), "Whether the policy is 64 VB compliant", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);



	}
	
	public void fillClaimRiskPropFire(ClaimRiskPropFireEntity claimRiskPropFireEntity, CustomAssert assertReference) {

		if(claimRiskPropFireEntity.getAction().equalsIgnoreCase("add") || claimRiskPropFireEntity.getAction().equalsIgnoreCase("edit")){
			//LR
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBasisOfIndemnity")) {
				selectValueFromList(basisofIndemnityDropDown, claimRiskPropFireEntity.getStringValueForField("BasisOfIndemnity"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredName")) {
				clearAndSendKeys(insuredNameTextField, claimRiskPropFireEntity.getStringValueForField("InsuredName"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimAssessedAmount")) {
				clearAndSendKeys(claimAssessedAmountTextField, claimRiskPropFireEntity.getStringValueForField("ClaimAssessedAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				clearAndSendKeys(salvageAmountTextField, claimRiskPropFireEntity.getStringValueForField("SalvageAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigDepreciationAmount")) {
				clearAndSendKeys(depreciationAmountTextField, claimRiskPropFireEntity.getStringValueForField("DepreciationAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigUnderinsuranceAmount")) {
				clearAndSendKeys(underinsuranceAmountTextField, claimRiskPropFireEntity.getStringValueForField("UnderinsuranceAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				clearAndSendKeys(totalDeductibleAmountTextField, claimRiskPropFireEntity.getStringValueForField("TotalDeductibleAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigTotalRecoveredAmount")) {
				clearAndSendKeys(totalRecoveredAmountTextField, claimRiskPropFireEntity.getStringValueForField("TotalRecoveredAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimSettlementAmount")) {
				clearAndSendKeys(claimSettlementAmountTextField, claimRiskPropFireEntity.getStringValueForField("ClaimSettlementAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigRiskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlosses")) {
				clearAndSendKeys(riskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlossesTextArea, claimRiskPropFireEntity.getStringValueForField("RiskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlosses"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNoOfDaysforBusinessinterruption")) {
				clearAndSendKeys(noOfDaysforBusinessinterruptionTextField, claimRiskPropFireEntity.getStringValueForField("NoOfDaysforBusinessinterruption"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNoOfDaysDeductedTimedeductible")) {
				clearAndSendKeys(noOfDaysDeductedTimedeductibleTextField, claimRiskPropFireEntity.getStringValueForField("NoOfDaysDeductedTimedeductible"));
			}
			//*********AR(CHINTAN)*******
			/*if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredName")) {
				clearAndSendKeys(insuredNameTextField, claimRiskPropFireEntity.getStringValueForField("InsuredName"));
			}*/
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBasisOfIndemnitytext")) {
				clearAndSendKeys(basisOfIndemnityTextField, claimRiskPropFireEntity.getStringValueForField("BasisOfIndemnitytext"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedAmountOfLossasperInsuredsIntimation")) {
				clearAndSendKeys(estimatedAmountOfLossasperInsuredsIntimationTextField, claimRiskPropFireEntity.getStringValueForField("EstimatedAmountOfLossasperInsuredsIntimation"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherclaimisCloseProximityclaim")) {
				selectValueFromList(whetherclaimisCloseProximityclaimDropDown, claimRiskPropFireEntity.getStringValueForField("WhetherclaimisCloseProximityclaim"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherApprovalOfCompetentAuthorityObtained")) {
				selectValueFromList(whetherApprovalOfCompetentAuthorityObtainedDropDown, claimRiskPropFireEntity.getStringValueForField("WhetherApprovalOfCompetentAuthorityObtained"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherClaimiSwithinselfSurveylimit")) {
				selectValueFromList(whetherClaimiSwithinselfSurveylimitDropDown, claimRiskPropFireEntity.getStringValueForField("WhetherClaimiSwithinselfSurveylimit"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedAmountofLossasPerpreliminarysurveyor")) {
				clearAndSendKeys(estimatedAmountofLossasPerpreliminarysurveyorTextField, claimRiskPropFireEntity.getStringValueForField("EstimatedAmountofLossasPerpreliminarysurveyor"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedAmountofLossAsPerfinalsurveyor")) {
				clearAndSendKeys(estimatedAmountofLossAsPerfinalsurveyorTextField, claimRiskPropFireEntity.getStringValueForField("EstimatedAmountofLossAsPerfinalsurveyor"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAssessedAmountOfIfSelfSurveyed")) {
				clearAndSendKeys(assessedAmountOfIfSelfSurveyedTextField, claimRiskPropFireEntity.getStringValueForField("AssessedAmountOfIfSelfSurveyed"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAssessedAmountOfLossbythefinalsurveyor")) {
				clearAndSendKeys(assessedAmountOfLossbythefinalsurveyorTextField, claimRiskPropFireEntity.getStringValueForField("AssessedAmountOfLossbythefinalsurveyor"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSalvageRealizationAmountaccountedinthefinalsurveyreport")) {
				clearAndSendKeys(salvageRealizationAmountaccountedinthefinalsurveyreportTextField, claimRiskPropFireEntity.getStringValueForField("SalvageRealizationAmountaccountedinthefinalsurveyreport"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigExcessAccountedInthefinalsurveyreport")) {
				clearAndSendKeys(excessAccountedInthefinalsurveyreportTextField, claimRiskPropFireEntity.getStringValueForField("ExcessAccountedInthefinalsurveyreport"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigApprovedClaimSettlementAmount")) {
				clearAndSendKeys(approvedClaimSettlementAmountTextField, claimRiskPropFireEntity.getStringValueForField("ApprovedClaimSettlementAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigIsAnyRecoverypendingWithTheInsuredonanyUWorClaimMatter")) {
				selectValueFromList(isAnyRecoverypendingWithTheInsuredonanyUWorClaimMatterDropDown, claimRiskPropFireEntity.getStringValueForField("IsAnyRecoverypendingWithTheInsuredonanyUWorClaimMatter"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAmountToBeRecovered")) {
				clearAndSendKeys(amountToBeRecoveredTextField, claimRiskPropFireEntity.getStringValueForField("AmountToBeRecovered"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigPleaseMentionTheOtherNatureOflossIfApplicable")) {
				clearAndSendKeys(pleaseMentionTheOtherNatureOflossIfApplicableTextField, claimRiskPropFireEntity.getStringValueForField("PleaseMentionTheOtherNatureOflossIfApplicable"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimToBeRaisedForSection")) {
				selectValueFromList(claimToBeRaisedForSectionDropDown, claimRiskPropFireEntity.getStringValueForField("ClaimToBeRaisedForSection"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBlockType")) {
				selectValueFromList(blockTypeDropDown, claimRiskPropFireEntity.getStringValueForField("BlockType"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigDeductibleForLOP")) {
				clearAndSendKeys(deductibleForLOPTextField, claimRiskPropFireEntity.getStringValueForField("DeductibleForLOP"));
			}
			//*********FP(CHINTAN)*******
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSelectionCoverageforclaim")) {
				selectValueFromList(selectionCoverageforclaimDropDown, claimRiskPropFireEntity.getStringValueForField("SelectionCoverageforclaim"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedClaimAmount")) {
				clearAndSendKeys(estimatedClaimAmountTextField, claimRiskPropFireEntity.getStringValueForField("EstimatedClaimAmount"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNameOfwitness")) {
				clearAndSendKeys(nameOfwitnessTextField, claimRiskPropFireEntity.getStringValueForField("NameOfwitness"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAddressOfwitness")) {
				clearAndSendKeys(addressOfwitnessTextField, claimRiskPropFireEntity.getStringValueForField("AddressOfwitness"));
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherThepolicyIs64VBcompliant")) {
				selectValueFromList(whetherThepolicyIs64VBcompliantDropDown, claimRiskPropFireEntity.getStringValueForField("WhetherThepolicyIs64VBcompliant"));
			}

		}
		else if(claimRiskPropFireEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBasisofIndemnity")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("BasisofIndemnity"), fetchValueFromList(basisofIndemnityDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredName")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimAssessedAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimAssessedAmount"), fetchValueFromTextFields(claimAssessedAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SalvageAmount"), fetchValueFromTextFields(salvageAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigDepreciationAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("DepreciationAmount"), fetchValueFromTextFields(depreciationAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigUnderinsuranceAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("UnderinsuranceAmount"), fetchValueFromTextFields(underinsuranceAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("totalDeductibleAmountTextField"), fetchValueFromTextFields(totalDeductibleAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigTotalRecoveredAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("TotalRecoveredAmount"), fetchValueFromTextFields(totalRecoveredAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimSettlementAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimSettlementAmount"), fetchValueFromTextFields(claimSettlementAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigRiskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlosses")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("riskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlossesTextArea"), fetchValueFromTextFields(riskImprovementMeasurersSuggestedbySurveyorsLossassessorstopreventrecurrenceofsimilarlossesTextArea), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNoOfDaysforBusinessinterruption")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("NoOfDaysforBusinessinterruption"), fetchValueFromTextFields(noOfDaysforBusinessinterruptionTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNoOfDaysDeductedTimedeductible")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("NoOfDaysDeductedTimedeductible"), fetchValueFromTextFields(noOfDaysDeductedTimedeductibleTextField), AssertionType.WARNING);
			}
			//*********AR(CHINTAN)*******
			/*if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredName")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
			}*/
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBasisOfIndemnity")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("BasisOfIndemnity"), fetchValueFromList(basisOfIndemnityTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedAmountOfLossasperInsuredsIntimation")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("EstimatedAmountOfLossasperInsuredsIntimation"), fetchValueFromTextFields(estimatedAmountOfLossasperInsuredsIntimationTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherclaimisCloseProximityclaim")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("WhetherclaimisCloseProximityclaim"), fetchValueFromList(whetherclaimisCloseProximityclaimDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherApprovalOfCompetentAuthorityObtained")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("WhetherApprovalOfCompetentAuthorityObtained"), fetchValueFromList(whetherApprovalOfCompetentAuthorityObtainedDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherClaimiSwithinselfSurveylimit")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("WhetherClaimiSwithinselfSurveylimit"), fetchValueFromList(whetherClaimiSwithinselfSurveylimitDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedAmountofLossasPerpreliminarysurveyor")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("EstimatedAmountofLossasPerpreliminarysurveyor"), fetchValueFromTextFields(estimatedAmountofLossasPerpreliminarysurveyorTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedAmountofLossAsPerfinalsurveyor")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("EstimatedAmountofLossAsPerfinalsurveyor"), fetchValueFromTextFields(estimatedAmountofLossAsPerfinalsurveyorTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAssessedAmountOfIfSelfSurveyed")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("AssessedAmountOfIfSelfSurveyed"), fetchValueFromTextFields(assessedAmountOfIfSelfSurveyedTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAssessedAmountOfLossbythefinalsurveyor")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("AssessedAmountOfLossbythefinalsurveyor"), fetchValueFromTextFields(assessedAmountOfLossbythefinalsurveyorTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSalvageRealizationAmountaccountedinthefinalsurveyreport")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SalvageRealizationAmountaccountedinthefinalsurveyreport"), fetchValueFromTextFields(salvageRealizationAmountaccountedinthefinalsurveyreportTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigExcessAccountedInthefinalsurveyreport")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ExcessAccountedInthefinalsurveyreport"), fetchValueFromTextFields(excessAccountedInthefinalsurveyreportTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigApprovedClaimSettlementAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ApprovedClaimSettlementAmount"), fetchValueFromTextFields(approvedClaimSettlementAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigIsAnyRecoverypendingWithTheInsuredonanyUWorClaimMatter")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("IsAnyRecoverypendingWithTheInsuredonanyUWorClaimMatter"), fetchValueFromList(isAnyRecoverypendingWithTheInsuredonanyUWorClaimMatterDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAmountToBeRecovered")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("AmountToBeRecovered"), fetchValueFromTextFields(amountToBeRecoveredTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigPleaseMentionTheOtherNatureOflossIfApplicable")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("PleaseMentionTheOtherNatureOflossIfApplicable"), fetchValueFromTextFields(pleaseMentionTheOtherNatureOflossIfApplicableTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimToBeRaisedForSection")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimToBeRaisedForSection"), fetchValueFromList(claimToBeRaisedForSectionDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBlockType")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("BlockType"), fetchValueFromList(blockTypeDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigDeductibleForLOP")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("DeductibleForLOP"), fetchValueFromTextFields(deductibleForLOPTextField), AssertionType.WARNING);
			}
			//*********FP(CHINTAN)*******
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("RiskCovered"), fetchValueFromTextFields(riskCoveredtTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigOptedCoverdetails")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("OptedCoverdetails"), fetchValueFromTextFields(optedCoverdetailsTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SpecialPerils"), fetchValueFromTextFields(specialPerilsTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSpecialExclusions")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SpecialExclusions"), fetchValueFromTextFields(specialExclusionsTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SubjectToClause"), fetchValueFromTextFields(subjectToClauseTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSelectionCoverageforclaim")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SelectionCoverageForclaim"), fetchValueFromList(selectionCoverageforclaimDropDown), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigExcessInPercentageForPTD")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ExcessinPercentageForPTD"), fetchValueFromTextFields(excessInPercentageForPTDTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSpecialDiscountAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SpecialDiscountAmount"), fetchValueFromTextFields(specialDiscountAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("SumInsuredRs"), fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigEstimatedClaimAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("EstimatedClaimAmount"), fetchValueFromTextFields(estimatedClaimAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimPayableAmount")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("ClaimPayableAmount"), fetchValueFromTextFields(claimPayableAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNameOfwitness")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("NameOfwitness"), fetchValueFromTextFields(nameOfwitnessTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAddressOfwitness")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("AddressOfwitness"), fetchValueFromTextFields(addressOfwitnessTextField), AssertionType.WARNING);
			}
			if (claimRiskPropFireEntity.getBooleanValueForField("ConfigWhetherThepolicyIs64VBcompliant")) {
				assertReference.assertEquals(claimRiskPropFireEntity.getStringValueForField("WhetherThepolicyIs64VBcompliant"), fetchValueFromList(whetherThepolicyIs64VBcompliantDropDown), AssertionType.WARNING);
			}

		}
		}
	public void nextButtonClaimRiskPropFire(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigNextArrowButton")){		
			click(nextArrowButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskPropFireEntity.getStringValueForField("Loss")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void navigateToMainAttributePage(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTitle);
		}
	}
	public void navigateToDocument(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}

	public void navigateToInsuredItemDetail(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrDetailsTabTitle);
		}
	}

	public void navigateToInsuredItemAttribute(ClaimRiskPropFireEntity claimRiskPropFireEntity){
		if (claimRiskPropFireEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemrAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimRiskPropFire(ClaimRiskPropFireEntity claimRiskPropFireEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskPropFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskPropFire(claimRiskPropFireEntity, assertReference);
			nextButtonClaimRiskPropFire(claimRiskPropFireEntity);
			navigateToMainAttributePage(claimRiskPropFireEntity);
			navigateToclaimHomePage(claimRiskPropFireEntity);
			navigateToInsuredItem(claimRiskPropFireEntity);
			navigateToDocument(claimRiskPropFireEntity);
			navigateToParties(claimRiskPropFireEntity);
			navigateToReserve(claimRiskPropFireEntity);
			navigateToPayment(claimRiskPropFireEntity);
			navigateToAttribute(claimRiskPropFireEntity);
			navigateToInsuredItemDetail(claimRiskPropFireEntity);
			navigateToInsuredItemAttribute(claimRiskPropFireEntity);
		}
        }	

}

