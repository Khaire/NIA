package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProp3MNLEntity;
import com.aqm.staf.library.databin.ComClaimRiskPropMNLEntity;

public class ClaimCommonClaimRiskPropertyForMiscNonLiability extends BasePage{


	private PageElement commonClaimRiskPropertyTitle;
	private PageElement miscNonT1CLRTitle;
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
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement claimDropDown;
	private PageElement totalAssessedLossAmountTextField;
	private PageElement isUnderlnsuranceApplicableDropDown;
	private PageElement excessTextField;
	private PageElement netClaimAmountTextField;
	private PageElement reasonForReopenDropDown;
	private PageElement districtStateNationalDropDown;
	private PageElement districtCourtSupremeCourtHighCourtSLPDropDown;
	private PageElement underInsuranceTypeDropDown;
	private PageElement underInsuranceAmountTextField;
	private PageElement claimLossAfterUnderInsuranceTextField;
	private PageElement nextPageTitle;
	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;
	private PageElement backButton;
	//OS
	private PageElement isTerrorismCoverRequiredDropDown;
	private PageElement sumInsuredForTerrorismTextField;
	private PageElement assessedLossAmountOfTerrorismCoverTextField;
	private PageElement claimAmountOfTerrorismCoverTextField;
	//SH
	private PageElement earthquakeRequiredDropDown;
	private PageElement sumInsuredForEarthquakeTextField;
	private PageElement assessedLossAmountOfEarthquakeCoverTextField;
	private PageElement claimAmountOfEarthquakeCoverTextField;
	private PageElement terrorismRequiredDropDown;
	//BB
	private PageElement isMoneyInATMCoverRequiredDropDown;
	private PageElement sumInsuredTextField;
	private PageElement assessedLossAmountOfMoneyInATMCoverTextField;
	private PageElement claimAmountOfMoneyInATMCoverTextField;
	private PageElement isEarthquakeCoverRequiredDropDown;
	private PageElement isSTFICoverRequiredDropDown;
	private PageElement sumInsuredForSTFICoverTextField;
	private PageElement assessedLossAmountOfSTFICoverTextField;	
	private PageElement claimAmountOfSTFICoverTextField;
	private PageElement  underInsurancePercentTextField;

	public ClaimCommonClaimRiskPropertyForMiscNonLiability(WebDriver driver, String pageName) {
		super(driver, pageName);

		//commonClaimRiskPropertyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Common Claim Risk Property')]"), " Common Claim Risk Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim", "select")), "Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalAssessedLossAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total Assessed Loss Amount", "input")), "Total Assessed Loss Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isUnderlnsuranceApplicableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("ls Under lnsurance Applicable", "select")), "ls Under lnsurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess", "input")), "Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netClaimAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Net Claim Amount", "input")), "Net Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reasonForReopenDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Reason For Reopen", "select")), "Reason For Reopen DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtStateNationalDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District/State/National", "select")), "District/State/National DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		districtCourtSupremeCourtHighCourtSLPDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("District Court/Supreme Court/High Court/SLP", "select")), "District Court/Supreme Court/High Court/SLP DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceTypeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under Insurance Type", "select")), "Under Insurance Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underInsuranceAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance amount", "input")), "Under insurance amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimLossAfterUnderInsuranceTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Loss After Under Insurance", "input")), "Claim Loss After Under Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//OS
		isTerrorismCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Terrorism Cover Required?", "select")), "Is Terrorism Cover Required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForTerrorismTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Terrorism", "input")), "Sum Insured for Terrorism TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Terrorism Cover", "input")), "Assessed Loss Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfTerrorismCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Terrorism Cover", "input")), "Claim Amount of Terrorism Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SH
		earthquakeRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Earthquake Required", "select")), "Earthquake Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForEarthquakeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Earthquake", "input")), "Sum Insured for Earthquake TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfEarthquakeCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Earthquake Cover", "input")), "Assessed Loss Amount of Earthquake Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfEarthquakeCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Earthquake Cover", "input")), "Claim Amount of Earthquake Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		terrorismRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Terrorism Required", "select")), "Terrorism Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BB
		isMoneyInATMCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Money in ATM Cover required", "select")), "Is Money in ATM Cover required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfMoneyInATMCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of Money in ATM Cover", "input")), "Assessed Loss Amount of Money in ATM Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfMoneyInATMCoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of Money in ATM Cover", "input")), "Claim Amount of Money in ATM Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isEarthquakeCoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Earthquake Cover required?", "select")), "Is Earthquake Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSTFICoverRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is STFI Cover required?", "select")), "Is STFI Cover required? DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSTFICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for STFI Cover", "input")), "Sum Insured for STFI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedLossAmountOfSTFICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assessed Loss Amount of STFI Cover", "input")), "Assessed Loss Amount of STFI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAmountOfSTFICoverTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Amount of STFI Cover", "input")), "Claim Amount of STFI Cover TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underInsurancePercentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance percent", "input")), "Under insurance percent TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			
			if(comClaimRiskPropMNLEntity.getAction().equalsIgnoreCase("add") || comClaimRiskPropMNLEntity.getAction().equalsIgnoreCase("edit")){

				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaim")) {
					selectValueFromList(claimDropDown, comClaimRiskPropMNLEntity.getStringValueForField("Claim"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					clearAndSendKeys(totalAssessedLossAmountTextField, comClaimRiskPropMNLEntity.getStringValueForField("TotalAssessedLossAmount"));
					clickTabButton(totalAssessedLossAmountTextField);
				}
				
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					selectValueFromList(isUnderlnsuranceApplicableDropDown, comClaimRiskPropMNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigExcess")) {
					clearAndSendKeys(excessTextField, comClaimRiskPropMNLEntity.getStringValueForField("Excess"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					clearAndSendKeys(netClaimAmountTextField, comClaimRiskPropMNLEntity.getStringValueForField("NetClaimAmount"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					selectValueFromList(reasonForReopenDropDown, comClaimRiskPropMNLEntity.getStringValueForField("ReasonForReopen"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					selectValueFromList(districtStateNationalDropDown, comClaimRiskPropMNLEntity.getStringValueForField("DistrictStateNational"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					selectValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown, comClaimRiskPropMNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					selectValueFromList(underInsuranceTypeDropDown, comClaimRiskPropMNLEntity.getStringValueForField("UnderInsuranceType"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
					clearAndSendKeys(underInsuranceAmountTextField, comClaimRiskPropMNLEntity.getStringValueForField("UnderInsuranceAmount"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					clearAndSendKeys(claimLossAfterUnderInsuranceTextField, comClaimRiskPropMNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
					clearAndSendKeys(underInsurancePercentTextField, comClaimRiskPropMNLEntity.getStringValueForField("UnderInsurancePercent"));
				}
				//OS
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					selectValueFromList(isTerrorismCoverRequiredDropDown, comClaimRiskPropMNLEntity.getStringValueForField("IsTerrorismCoverRequired"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					clearAndSendKeys(sumInsuredForTerrorismTextField, comClaimRiskPropMNLEntity.getStringValueForField("SumInsuredForTerrorism"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					clearAndSendKeys(assessedLossAmountOfTerrorismCoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					clearAndSendKeys(claimAmountOfTerrorismCoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"));
				}
				//BB
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsMoneyInATMCoverRequired")) {
					selectValueFromList(isMoneyInATMCoverRequiredDropDown, comClaimRiskPropMNLEntity.getStringValueForField("IsMoneyInATMCoverRequired"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
					clearAndSendKeys(sumInsuredTextField, comClaimRiskPropMNLEntity.getStringValueForField("SumInsured"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					clearAndSendKeys(assessedLossAmountOfMoneyInATMCoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInATMCover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInATMCover")) {
					clearAndSendKeys(claimAmountOfMoneyInATMCoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfMoneyInATMCover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsEarthquakeCoverRequired")) {
					selectValueFromList(isEarthquakeCoverRequiredDropDown, comClaimRiskPropMNLEntity.getStringValueForField("IsEarthquakeCoverRequired"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsSTFICoverRequired")) {
					selectValueFromList(isSTFICoverRequiredDropDown, comClaimRiskPropMNLEntity.getStringValueForField("IsSTFICoverRequired"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsuredForSTFICover")) {
					clearAndSendKeys(sumInsuredForSTFICoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("SumInsuredForSTFICover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSTFICover")) {
					clearAndSendKeys(assessedLossAmountOfSTFICoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfSTFICover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfSTFICover")) {
					clearAndSendKeys(claimAmountOfSTFICoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfSTFICover"));
				}
				//SH
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigEarthquakeRequired")) {
					selectValueFromList(earthquakeRequiredDropDown, comClaimRiskPropMNLEntity.getStringValueForField("EarthquakeRequired"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsuredForEarthquake")) {
					clearAndSendKeys(sumInsuredForEarthquakeTextField, comClaimRiskPropMNLEntity.getStringValueForField("SumInsuredForEarthquake"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfEarthquakeCover")) {
					clearAndSendKeys(assessedLossAmountOfEarthquakeCoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfEarthquakeCover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfEarthquakeCover")) {
					clearAndSendKeys(claimAmountOfEarthquakeCoverTextField, comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfEarthquakeCover"));
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigTerrorismRequired")) {
					selectValueFromList(terrorismRequiredDropDown, comClaimRiskPropMNLEntity.getStringValueForField("TerrorismRequired"));
				}
			}
			else if(comClaimRiskPropMNLEntity.getAction().equalsIgnoreCase("verify")){

				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaim")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("Claim"),fetchValueFromList(claimDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigTotalAssessedLossAmount")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("TotalAssessedLossAmount"),fetchValueFromTextFields(totalAssessedLossAmountTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsUnderlnsuranceApplicable")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("IsUnderlnsuranceApplicable"),fetchValueFromList(isUnderlnsuranceApplicableDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigExcess")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("Excess"),fetchValueFromTextFields(excessTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigNetClaimAmount")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("NetClaimAmount"),fetchValueFromTextFields(netClaimAmountTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigReasonForReopen")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ReasonForReopen"),fetchValueFromList(reasonForReopenDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigDistrictStateNational")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("DistrictStateNational"),fetchValueFromList(districtStateNationalDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigDistrictCourtSupremeCourtHighCourtSLP")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("DistrictCourtSupremeCourtHighCourtSLP"),fetchValueFromList(districtCourtSupremeCourtHighCourtSLPDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceType")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("UnderInsuranceType"),fetchValueFromList(underInsuranceTypeDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("UnderInsuranceAmount"),fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimLossAfterUnderInsurance")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimLossAfterUnderInsurance"),fetchValueFromTextFields(claimLossAfterUnderInsuranceTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsTerrorismCoverRequired")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("IsTerrorismCoverRequired"),fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsuredForTerrorism")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("SumInsuredForTerrorism"),fetchValueFromTextFields(sumInsuredForTerrorismTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfTerrorismCover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfTerrorismCover"),fetchValueFromTextFields(assessedLossAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfTerrorismCover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfTerrorismCover"),fetchValueFromTextFields(claimAmountOfTerrorismCoverTextField), AssertionType.WARNING);
				}
				//BB
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsMoneyInATMCoverRequired")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("IsMoneyInATMCoverRequired"),fetchValueFromList(isMoneyInATMCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfMoneyInATMCover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfMoneyInATMCover"),fetchValueFromTextFields(assessedLossAmountOfMoneyInATMCoverTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfMoneyInATMCover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfMoneyInATMCover"),fetchValueFromTextFields(claimAmountOfMoneyInATMCoverTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsEarthquakeCoverRequired")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("IsEarthquakeCoverRequired"),fetchValueFromList(isEarthquakeCoverRequiredDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigIsSTFICoverRequired")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("IsSTFICoverRequired"),fetchValueFromList(isSTFICoverRequiredDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsuredForSTFICover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("SumInsuredForSTFICover"),fetchValueFromTextFields(sumInsuredForSTFICoverTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfSTFICover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfSTFICover"),fetchValueFromTextFields(assessedLossAmountOfSTFICoverTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfSTFICover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfSTFICover"),fetchValueFromTextFields(claimAmountOfSTFICoverTextField), AssertionType.WARNING);
				}
				//SH
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigEarthquakeRequired")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("EarthquakeRequired"),fetchValueFromList(earthquakeRequiredDropDown), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSumInsuredForEarthquake")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("SumInsuredForEarthquake"),fetchValueFromTextFields(sumInsuredForEarthquakeTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAssessedLossAmountOfEarthquakeCover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("AssessedLossAmountOfEarthquakeCover"),fetchValueFromTextFields(assessedLossAmountOfEarthquakeCoverTextField), AssertionType.WARNING);
				}
				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimAmountOfEarthquakeCover")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("ClaimAmountOfEarthquakeCover"),fetchValueFromTextFields(claimAmountOfEarthquakeCoverTextField), AssertionType.WARNING);
				}

				if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigTerrorismRequired")) {
					assertReference.assertEquals(comClaimRiskPropMNLEntity.getStringValueForField("TerrorismRequired"),fetchValueFromList(terrorismRequiredDropDown), AssertionType.WARNING);
				}

			}
		}
	}
	public void navigateNextToCommonClaimRiskProperty(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+comClaimRiskPropMNLEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void navigatePreviousToCommonClaimRiskProperty(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(miscNonT1CLRTitle);			}
	}	
	public void navigateToMainAttributePage(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void SubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity){
		if (comClaimRiskPropMNLEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+comClaimRiskPropMNLEntity.getStringValueForField("CommonClaimRiskPropertyTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}
	public void fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(comClaimRiskPropMNLEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntity, assertReference);
			navigateNextToCommonClaimRiskProperty(comClaimRiskPropMNLEntity);
			SubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntity);
			navigateToMainAttributePage(comClaimRiskPropMNLEntity);
			navigateToclaimHomePage(comClaimRiskPropMNLEntity);
			navigateToInsuredItem(comClaimRiskPropMNLEntity);
			navigateToDocument(comClaimRiskPropMNLEntity);
			navigateToParties(comClaimRiskPropMNLEntity);
			navigateToReserve(comClaimRiskPropMNLEntity);
			navigateToPayment(comClaimRiskPropMNLEntity);
			navigateToAttribute(comClaimRiskPropMNLEntity);
			navigateToInsuredItemDetails(comClaimRiskPropMNLEntity);
			navigateTInsuredItemAttribute(comClaimRiskPropMNLEntity);
			
			
		}
	}
}



