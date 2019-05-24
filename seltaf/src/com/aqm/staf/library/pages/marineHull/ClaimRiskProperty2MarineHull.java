package com.aqm.staf.library.pages.marineHull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskProp2Entity;
public class ClaimRiskProperty2MarineHull extends BasePage{
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
	private PageElement saveButton;
	//digvijay cs
	private PageElement totalSumInsuredTextField;
	private PageElement sueAndLabourChargesTextField;
	private PageElement collisionLiabilityTextField;
	private PageElement totalClaimAmountTextField;
	private PageElement totalDeductibleAmountTextField;
	private PageElement underInsurancePercentTextField;
	private PageElement underInsuranceAmountTextField;
	private PageElement otherRecoveredAmountTextField;
	private PageElement netClaimAmountTextField;
	private PageElement remarksTextArea;
	private PageElement whetherThePolicyIs64VBCompliantDropDown;

	//CP-Yogesh
	private PageElement sumInsuredForSectionPhysicalDamageTextField;	 
	private PageElement assessedAmountOfLossBySurveyorForSectionITextField;	 
	private PageElement currencyOfClaimAssessedForSectionIDropdown;	
	private PageElement claimAssessedAmountEquivalentToINRForSectionITextField;	 
	private PageElement deductibleForSectionPhysicalDamageTextField;	
	//CL-Yogesh
	private PageElement  totalGRTTextField;	 
	private PageElement  sIForChartersLiabilityInsuranceTextField;	 
	private PageElement  chartersBunkerInsuranceLiabilityTextField;	 
	private PageElement  chartersBunkerDeductibleTextField;	
	private PageElement  chartersFreightInsuranceLiabilityTextField;	 
	private PageElement  chartersFreightDeductibleTextField;
	private PageElement chartersLiabilityDeductibleTextField;	 
	private PageElement protectionAndIndemnityDeductibleTextField;

	//AB
	private PageElement applicableEventCodeLabel;
	private PageElement vesselRegistrationNoTextField;	
	private PageElement placeOfBeachingTextArea;
	private PageElement placeOfAwaitingBreakupTextArea;
	//BR
	private PageElement  buildersNameTextArea;	
	private PageElement  makersNameTextArea;	
	private PageElement  engineTypeTextArea;	
	private PageElement  additionalPerilsClaimDropDown;
	private PageElement  additionalPerilsDeductibleAmountTextField;	
	private PageElement  typeOfRiskInClaimDropDown;

	private PageElement nextPageTitle;
	private PageElement forwardButton;
	private PageElement backButton;


	public ClaimRiskProperty2MarineHull(WebDriver driver, String pageName,int rowCounts) {
		super(driver, pageName);
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
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		saveButton=new PageElement(By.name("btnSave"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 	
		//digvijay cs
		totalSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Sum Insured')]/following::input"), "Total Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sueAndLabourChargesTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sue and Labour Charges')]/following::input"), "Sue and Labour Charges", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collisionLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Collision Liability')]/following::input"), "Collision Liability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalClaimAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Claim Amount')]/following::input"), "Total Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalDeductibleAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Deductible Amount')]/following::input"), "Total Deductible Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underInsurancePercentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Under insurance percent')]/following::input"), "Under insurance percent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underInsuranceAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Under insurance amount')]/following::input"), "Under insurance amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherRecoveredAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other Recovered Amount')]/following::input"), "Other Recovered Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		netClaimAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Net Claim Amount')]/following::input"), "Net Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Remarks')]/following::textarea"), "Remarks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherThePolicyIs64VBCompliantDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the policy is 64 VB compliant')]/following::select"), "Whether the policy is 64 VB compliant", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//CP-Yogesh
		sumInsuredForSectionPhysicalDamageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured for Section (Physical Damage)')]/following::input"), "Sum Insured for Section (Physical Damage) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assessedAmountOfLossBySurveyorForSectionITextField=new PageElement(By.xpath("//td//div[contains(text(),'Assessed amount of Loss by Surveyor for Section I')]/following::input"), "Assessed amount of Loss by Surveyor for Section I TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currencyOfClaimAssessedForSectionIDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Currency of Claim Assessed for Section I')]/following::select"), "Currency of Claim Assessed for Section I Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		claimAssessedAmountEquivalentToINRForSectionITextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim Assessed Amount Equivalent to INR for Section I')]/following::input"), "Claim Assessed Amount Equivalent to INR for Section I TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSectionPhysicalDamageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Deductible for Section (Physical Damage)')]/following::input"), "Deductible for Section (Physical Damage) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//CL-Yogesh
		totalGRTTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total GRT')]/following::input"), "Total GRT TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sIForChartersLiabilityInsuranceTextField=new PageElement(By.xpath("//td//div[contains(text(),'SI for Charters Liability Insurance')]/following::input"), "SI for Charters Liability Insurance TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersBunkerInsuranceLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Bunker insurance Liability')]/following::input"), "Charters Bunker insurance Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersBunkerDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Bunker deductible')]/following::input"), "Charters Bunker deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersFreightInsuranceLiabilityTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Freight insurance Liability')]/following::input"), "Charters Freight insurance Liability TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersFreightDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Freight deductible')]/following::input"), "Charters Freight deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chartersLiabilityDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Charters Liability deductible')]/following::input"), "Charters Liability deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		protectionAndIndemnityDeductibleTextField=new PageElement(By.xpath("//td//div[contains(text(),'Protection and Indemnity Deductible')]/following::input"), "Protection and Indemnity Deductible TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//AB
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		vesselRegistrationNoTextField=new PageElement(By.xpath("//td//div[@id='Vessel Registration No.']/following::input"), "Vessel Registration No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		placeOfBeachingTextArea=new PageElement(By.xpath("//td//div[@id='Place of Beaching ']/following::textarea"), "Place of Beaching ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		placeOfAwaitingBreakupTextArea=new PageElement(By.xpath("//td//div[@id='Place of Awaiting Breakup ']/following::textarea"), "Place of Awaiting Breakup ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//BR
		buildersNameTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Builders Name", "textarea")), "Builders Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		makersNameTextArea	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Makers Name", "textarea")), "Makers Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		engineTypeTextArea	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Engine Type", "textarea")), "Engine Type TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		additionalPerilsClaimDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional Perils Claim", "select")), "Additional Perils Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalPerilsDeductibleAmountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional Perils deductible Amount", "input")), "Additional Perils deductible Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfRiskInClaimDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Risk in Claim", "select")), "Type of Risk in Claim DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
	}

	public void fillClaimRiskProperty2MarineHull(ClaimRiskProp2Entity claimRiskProp2Entity, CustomAssert assertReference) throws InterruptedException{
		if(claimRiskProp2Entity.getAction().equalsIgnoreCase("add") || claimRiskProp2Entity.getAction().equalsIgnoreCase("edit")){
			//digvijay cs
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalSumInsured")) {
				clearAndSendKeys(totalSumInsuredTextField, claimRiskProp2Entity.getStringValueForField("TotalSumInsured"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigSueAndLabourCharges")) {
				clearAndSendKeys(sueAndLabourChargesTextField, claimRiskProp2Entity.getStringValueForField("SueAndLabourCharges"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigCollisionLiability")) {
				clearAndSendKeys(collisionLiabilityTextField, claimRiskProp2Entity.getStringValueForField("CollisionLiability"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalClaimAmount")) {
				clearAndSendKeys(totalClaimAmountTextField, claimRiskProp2Entity.getStringValueForField("TotalClaimAmount"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				clearAndSendKeys(totalDeductibleAmountTextField, claimRiskProp2Entity.getStringValueForField("TotalDeductibleAmount"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
				clearAndSendKeys(underInsurancePercentTextField, claimRiskProp2Entity.getStringValueForField("UnderInsurancePercent"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				clearAndSendKeys(underInsuranceAmountTextField, claimRiskProp2Entity.getStringValueForField("UnderInsuranceAmount"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigOtherRecoveredAmount")) {
				clearAndSendKeys(otherRecoveredAmountTextField, claimRiskProp2Entity.getStringValueForField("OtherRecoveredAmount"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigNetClaimAmount")) {
				clearAndSendKeys(netClaimAmountTextField, claimRiskProp2Entity.getStringValueForField("NetClaimAmount"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(remarksTextArea, claimRiskProp2Entity.getStringValueForField("Remarks"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				selectValueFromList(whetherThePolicyIs64VBCompliantDropDown, claimRiskProp2Entity.getStringValueForField("WhetherThePolicyIs64VBCompliant"));
			}	
			//CP-Yogesh
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigSumInsuredForSectionPhysicalDamage")) {
				clearAndSendKeys(sumInsuredForSectionPhysicalDamageTextField, claimRiskProp2Entity.getStringValueForField("SumInsuredForSectionPhysicalDamage"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigAssessedAmountOfLossBySurveyorForSectionI")) {
				clearAndSendKeys(assessedAmountOfLossBySurveyorForSectionITextField, claimRiskProp2Entity.getStringValueForField("AssessedAmountOfLossBySurveyorForSectionI"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigCurrencyOfClaimAssessedForSectionI")) {
				selectValueFromList(currencyOfClaimAssessedForSectionIDropdown, claimRiskProp2Entity.getStringValueForField("CurrencyOfClaimAssessedForSectionI"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimAssessedAmountEquivalentToINRForSectionI")) {
				clearAndSendKeys(claimAssessedAmountEquivalentToINRForSectionITextField, claimRiskProp2Entity.getStringValueForField("ClaimAssessedAmountEquivalentToINRForSectionI"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigDeductibleForSectionPhysicalDamage")) {
				clearAndSendKeys(deductibleForSectionPhysicalDamageTextField, claimRiskProp2Entity.getStringValueForField("DeductibleForSectionPhysicalDamage"));
			}
			//CL-Yogesh
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalGRT")) {
				clearAndSendKeys(totalGRTTextField, claimRiskProp2Entity.getStringValueForField("TotalGRT"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigSIForChartersLiabilityInsurance")) {
				clearAndSendKeys(sIForChartersLiabilityInsuranceTextField, claimRiskProp2Entity.getStringValueForField("SIForChartersLiabilityInsurance"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersBunkerInsuranceLiability")) {
				clearAndSendKeys(chartersBunkerInsuranceLiabilityTextField, claimRiskProp2Entity.getStringValueForField("ChartersBunkerInsuranceLiability"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersBunkerDeductible")) {
				clearAndSendKeys(chartersBunkerDeductibleTextField, claimRiskProp2Entity.getStringValueForField("ChartersBunkerDeductible"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersFreightInsuranceLiability")) {
				clearAndSendKeys(chartersFreightInsuranceLiabilityTextField, claimRiskProp2Entity.getStringValueForField("ChartersFreightInsuranceLiability"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersFreightDeductible")) {
				clearAndSendKeys(chartersFreightDeductibleTextField, claimRiskProp2Entity.getStringValueForField("ChartersFreightDeductible"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersLiabilityDeductible")) {
				clearAndSendKeys(chartersLiabilityDeductibleTextField, claimRiskProp2Entity.getStringValueForField("ChartersLiabilityDeductible"));
			}	
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigProtectionAndIndemnityDeductible")) {
				clearAndSendKeys(protectionAndIndemnityDeductibleTextField, claimRiskProp2Entity.getStringValueForField("ProtectionAndIndemnityDeductible"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigVesselRegistrationNo")) {
				clearAndSendKeys(vesselRegistrationNoTextField, claimRiskProp2Entity.getStringValueForField("VesselRegistrationNo"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigAdditionalPerilsClaim")) {
				selectValueFromList(additionalPerilsClaimDropDown, claimRiskProp2Entity.getStringValueForField("AdditionalPerilsClaim"));
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTypeOfRiskInClaim")) {
				selectValueFromList(typeOfRiskInClaimDropDown, claimRiskProp2Entity.getStringValueForField("TypeOfRiskInClaim"));
			}

		}
		else if(claimRiskProp2Entity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			//digvijay cs
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalSumInsured")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("TotalSumInsured"), fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigSueAndLabourCharges")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("SueAndLabourCharges"), fetchValueFromTextFields(sueAndLabourChargesTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigCollisionLiability")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("CollisionLiability"), fetchValueFromTextFields(collisionLiabilityTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalClaimAmount")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("TotalClaimAmount"), fetchValueFromTextFields(totalClaimAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("TotalDeductibleAmount"), fetchValueFromTextFields(totalDeductibleAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("UnderInsurancePercent"), fetchValueFromTextFields(underInsurancePercentTextField), AssertionType.WARNING);
			}

			if (claimRiskProp2Entity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("UnderInsuranceAmount"), fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigOtherRecoveredAmount")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("OtherRecoveredAmount"), fetchValueFromTextFields(otherRecoveredAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigNetClaimAmount")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("NetClaimAmount"), fetchValueFromTextFields(netClaimAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksTextArea), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("WhetherThePolicyIs64VBCompliant"), fetchValueFromList(whetherThePolicyIs64VBCompliantDropDown), AssertionType.WARNING);
			}
			//CP-Yogesh
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigSumInsuredForSectionPhysicalDamage")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("SumInsuredForSectionPhysicalDamage"), fetchValueFromTextFields(sumInsuredForSectionPhysicalDamageTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigAssessedAmountOfLossBySurveyorForSectionI")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("AssessedAmountOfLossBySurveyorForSectionI"), fetchValueFromTextFields(assessedAmountOfLossBySurveyorForSectionITextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigCurrencyOfClaimAssessedForSectionI")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("CurrencyOfClaimAssessedForSectionI"), fetchValueFromList(currencyOfClaimAssessedForSectionIDropdown), AssertionType.WARNING);
			}			
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimAssessedAmountEquivalentToINRForSectionI")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ClaimAssessedAmountEquivalentToINRForSectionI"), fetchValueFromTextFields(claimAssessedAmountEquivalentToINRForSectionITextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigDeductibleForSectionPhysicalDamage")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("DeductibleForSectionPhysicalDamage"), fetchValueFromTextFields(deductibleForSectionPhysicalDamageTextField), AssertionType.WARNING);
			}
			//CL-Yogesh
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTotalGRT")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("TotalGRT"), fetchValueFromTextFields(totalGRTTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigSIForChartersLiabilityInsurance")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("SIForChartersLiabilityInsurance"), fetchValueFromTextFields(sIForChartersLiabilityInsuranceTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersBunkerInsuranceLiability")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ChartersBunkerInsuranceLiability"), fetchValueFromTextFields(chartersBunkerInsuranceLiabilityTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersBunkerDeductible")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ChartersBunkerDeductible"), fetchValueFromTextFields(chartersBunkerDeductibleTextField), AssertionType.WARNING);
			}	
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersFreightInsuranceLiability")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ChartersFreightInsuranceLiability"), fetchValueFromTextFields(chartersFreightInsuranceLiabilityTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersFreightDeductible")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ChartersFreightDeductible"), fetchValueFromTextFields(chartersFreightDeductibleTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigChartersLiabilityDeductible")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ChartersLiabilityDeductible"), fetchValueFromTextFields(chartersLiabilityDeductibleTextField), AssertionType.WARNING);
			}			
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigProtectionAndIndemnityDeductible")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ProtectionAndIndemnityDeductible"), fetchValueFromTextFields(protectionAndIndemnityDeductibleTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigVesselRegistrationNo")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("VesselRegistrationNo"), fetchValueFromTextFields(vesselRegistrationNoTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigPlaceOfBeaching")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("PlaceOfBeaching"),fetchValueFromTextFields(placeOfBeachingTextArea), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("PlaceOfAwaitingBreakup"),fetchValueFromTextFields(placeOfAwaitingBreakupTextArea), AssertionType.WARNING);
			}
			//BR
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigBuildersName")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("BuildersName"),fetchValueFromTextFields(buildersNameTextArea), AssertionType.WARNING);
			}

			if (claimRiskProp2Entity.getBooleanValueForField("ConfigMakersName")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("MakersName"),fetchValueFromTextFields(makersNameTextArea), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigEngineType")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("EngineType"),fetchValueFromTextFields(engineTypeTextArea), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigAdditionalPerilsClaim")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("AdditionalPerilsClaim"),fetchValueFromList(additionalPerilsClaimDropDown), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigAdditionalPerilsDeductibleAmount")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("AdditionalPerilsDeductibleAmount"), fetchValueFromTextFields(additionalPerilsDeductibleAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskProp2Entity.getBooleanValueForField("ConfigTypeOfRiskInClaim")) {
				assertReference.assertEquals(claimRiskProp2Entity.getStringValueForField("TypeOfRiskInClaim"),fetchValueFromTextFields(typeOfRiskInClaimDropDown), AssertionType.WARNING);
			}
		}
	}
	public void navigateNextToClaimRiskProperty(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskProp2Entity.getStringValueForField("ClaimRiskProperty3Title")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}
	public void navigateToInsuredItem(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPayment(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttribute(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnSaveButton(ClaimRiskProp2Entity claimRiskProp2Entity){
		if (claimRiskProp2Entity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitClaimRiskProperty2MarineHull(ClaimRiskProp2Entity claimRiskProp2Entity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskProp2Entity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskProperty2MarineHull(claimRiskProp2Entity, assertReference);
			navigateNextToClaimRiskProperty(claimRiskProp2Entity);
			clickOnSaveButton(claimRiskProp2Entity);
			navigateToMainAttributePage(claimRiskProp2Entity);
			navigateToclaimHomePage(claimRiskProp2Entity);
			navigateToInsuredItem(claimRiskProp2Entity);
			navigateToDocument(claimRiskProp2Entity);
			navigateToParties(claimRiskProp2Entity);
			navigateToReserve(claimRiskProp2Entity);
			navigateToPayment(claimRiskProp2Entity);
			navigateToAttribute(claimRiskProp2Entity);
			navigateToInsuredItemDetails(claimRiskProp2Entity);
			navigateTInsuredItemAttribute(claimRiskProp2Entity);
		}
	}	

}
