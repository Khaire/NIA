package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskDtls3MCEntity;

public class ClaimRiskDtls3MarineCargo extends BasePage{
	
	private PageElement claimRiskDtls3Title;
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

	private PageElement forwardButton;
	private PageElement backButton;
	
	//Mayur_product name= AT/TC/OP
	private PageElement claimAmountTextField;
	private PageElement salvageTextField;
	private PageElement underInsuranceAmountTextField;
	private PageElement netPayableAmountTextField;
	private PageElement lossLocationAtDropDown;
	
	//AM Dharmendra
	private PageElement policyNoCertificateNoFiveTextField;
	private PageElement sumInsured5TextField;
	private PageElement marineCargoClaimNoFiveTextField;
	private PageElement marineCargoPolicyNoCertificateNoFiveTextField;
	private PageElement natureOfLossFiveTextArea;
	private PageElement causeOfLossFiveTextArea;
	private PageElement dateOfLossFiveTextField;
	private PageElement commentsFiveTextArea;
	private PageElement dateOfIntimationFiveTextField;
	private PageElement timeOfLossFiveTextField;
	private PageElement indemnityPeriodInMonthsTextField;
	private PageElement standardTimeExcessInWeeksTextField;
	private PageElement agreedOptedTimeExcessInWeeksTextArea;
	private PageElement specialFeaturesOfClaimIfAnyTextField;
	private PageElement calculatedExcessTextField;
	private PageElement listOfTheCountriesDropDown;
	private PageElement whetherThePolicyIs64VbCompliantDropDown;


	public ClaimRiskDtls3MarineCargo(WebDriver driver, String pageName,int rowCounts) {
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
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		claimAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount')]/following::input"), "Claim Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		salvageTextField= new PageElement(By.xpath("//td//div[contains(text(),'Salvage')]/following::input"), "Salvage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		underInsuranceAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Under insurance amount')]/following::input"), "Under insurance amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		netPayableAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Net payable Amount')]/following::input"), "Net payable Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		lossLocationAtDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Loss Location at ')]/following::select"), "Loss Location at Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 50);

	//AM Dharmendra
		policyNoCertificateNoFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 5 ')]/following::input"), "Policy No./Certificate No. 5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsured5TextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured5 ')]/following::input"), "Sum Insured5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoClaimNoFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.5 ')]/following::input"), "Marine Cargo Claim No.5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoPolicyNoCertificateNoFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 5 ')]/following::input"), "Marine Cargo Policy No./Certificate No. 5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfLossFiveTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss5 ')]/following::input"), "Nature of Loss5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossFiveTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss5 ')]/following::input"), "Cause of Loss5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commentsFiveTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Comments5 ')]/following::input"), "Comments5 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeOfLossFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss5')]/following::input"), "Time of Loss5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		indemnityPeriodInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period (in Months) ')]/following::input"), "Indemnity Period (in Months) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standardTimeExcessInWeeksTextField=new PageElement(By.xpath("//td//div[contains(text(),'Standard Time Excess(in weeks) ')]/following::input"), "Standard Time Excess(in weeks) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreedOptedTimeExcessInWeeksTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Agreed/Opted Time Excess(in weeks) ')]/following::input"), "Agreed/Opted Time Excess(in weeks) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		calculatedExcessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Calculated Excess ')]/following::input"), "Calculated Excess ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialFeaturesOfClaimIfAnyTextField=new PageElement(By.xpath("//td//div[contains(text(),'Special features of Claim (if any) ')]/following::input"), "Special features of Claim (if any) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		listOfTheCountriesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'List of the Countries ')]/following::select"), "List of the Countries ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherThePolicyIs64VbCompliantDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the policy is 64 VB compliant ')]/following::select"), "Whether the policy is 64 VB compliant ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dateOfLossFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss5')]/following::input"), "Date of Loss5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIntimationFiveTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation5')]/following::input"), "Date of Intimation5", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	
	public void fillClaimRiskDtls3MarineCargo(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskDtls3MCEntity.getAction().equalsIgnoreCase("add") || claimRiskDtls3MCEntity.getAction().equalsIgnoreCase("edit")){
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, claimRiskDtls3MCEntity.getStringValueForField("ClaimAmount"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(salvageTextField, claimRiskDtls3MCEntity.getStringValueForField("Salvage"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				clearAndSendKeys(underInsuranceAmountTextField, claimRiskDtls3MCEntity.getStringValueForField("UnderInsuranceAmount"));
			}
			if(claimRiskDtls3MCEntity.getBooleanValueForField("ConfigLossLocationAt")){
				selectValueFromList(lossLocationAtDropDown,claimRiskDtls3MCEntity.getStringValueForField("LossLocationAt"));
			}
			//AM Dharmendra
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigListOfTheCountries")) {
				selectValueFromList(listOfTheCountriesDropDown, claimRiskDtls3MCEntity.getStringValueForField("ListOfTheCountries"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VbCompliant")) {
				selectValueFromList(whetherThePolicyIs64VbCompliantDropDown, claimRiskDtls3MCEntity.getStringValueForField("WhetherThePolicyIs64VbCompliant"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigSumInsured5")) {
				clearAndSendKeys(sumInsured5TextField, claimRiskDtls3MCEntity.getStringValueForField("SumInsured5"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoFive")) {
				clearAndSendKeys(marineCargoClaimNoFiveTextField, claimRiskDtls3MCEntity.getStringValueForField("marineCargoClaimNoFive"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNoFive")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNoFiveTextField, claimRiskDtls3MCEntity.getStringValueForField("MarineCargoPolicyNoCertificateNoFive"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigNatureOfLossFive")) {
				clearAndSendKeys(natureOfLossFiveTextArea, claimRiskDtls3MCEntity.getStringValueForField("NatureOfLossFive"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCauseOfLossFive")) {
				clearAndSendKeys(causeOfLossFiveTextArea, claimRiskDtls3MCEntity.getStringValueForField("CauseOfLossFive"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCommentsFive")) {
				clearAndSendKeys(commentsFiveTextArea, claimRiskDtls3MCEntity.getStringValueForField("commentsFive"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigTimeOfLossFive")) {
				clearAndSendKeys(timeOfLossFiveTextField, claimRiskDtls3MCEntity.getStringValueForField("timeOfLossFive"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				clearAndSendKeys(indemnityPeriodInMonthsTextField, claimRiskDtls3MCEntity.getStringValueForField("indemnityPeriodInMonths"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigStandardTimeExcessInWeeks")) {
				clearAndSendKeys(standardTimeExcessInWeeksTextField, claimRiskDtls3MCEntity.getStringValueForField("standardTimeExcessInWeeks"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessInWeeks")) {
				clearAndSendKeys(agreedOptedTimeExcessInWeeksTextArea, claimRiskDtls3MCEntity.getStringValueForField("AgreedOptedTimeExcessInWeeks"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCalculatedExcess")) {
				clearAndSendKeys(calculatedExcessTextField, claimRiskDtls3MCEntity.getStringValueForField("CalculatedExcess"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaimIfAny")) {
				clearAndSendKeys(specialFeaturesOfClaimIfAnyTextField, claimRiskDtls3MCEntity.getStringValueForField("specialFeaturesOfClaimIfAny"));
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigDateOfLossFive")){
				String dateOfFirstPolicy=RandomCodeGenerator.dateGenerator(claimRiskDtls3MCEntity.getStringValueForField("DateOfLossFive"));
				clearAndEnterDate(dateOfLossFiveTextField, dateOfFirstPolicy);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigDateOfIntimationFive")){
				String dateOfFirstPolicy=RandomCodeGenerator.dateGenerator(claimRiskDtls3MCEntity.getStringValueForField("DateOfIntimationFive"));
				clearAndEnterDate(dateOfIntimationFiveTextField, dateOfFirstPolicy);
			}

		}
		else if(claimRiskDtls3MCEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimAmount")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("ClaimAmount"),fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigSalvage")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("Salvage"),fetchValueFromTextFields(salvageTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("UnderInsuranceAmount"),fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigNetPayableAmount")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("NetPayableAmount"),fetchValueFromTextFields(netPayableAmountTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigLossLocationAt")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("LossLocationAt"), fetchValueFromList(lossLocationAtDropDown), AssertionType.WARNING);
			}
			//AM Dharmendra
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfiglistOfTheCountries")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("listOfTheCountries"), fetchValueFromList(listOfTheCountriesDropDown), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigWhetherInsuredIsaCompanyAsPerCompanyAct")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("WhetherInsuredIsaCompanyAsPerCompanyAct"), fetchValueFromList(whetherThePolicyIs64VbCompliantDropDown), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("PolicyNoCertificateNoFive"), fetchValueFromTextFields(policyNoCertificateNoFiveTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigSumInsured5")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("SumInsured5"), fetchValueFromTextFields(sumInsured5TextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("MarineCargoClaimNoFive"), fetchValueFromTextFields(marineCargoClaimNoFiveTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNoFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("MarineCargoPolicyNoCertificateNoFive"), fetchValueFromTextFields(marineCargoPolicyNoCertificateNoFiveTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfignatureOfLossFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("NatureOfLossFive"), fetchValueFromTextFields(natureOfLossFiveTextArea), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCauseOfLossFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("CauseOfLossFive"), fetchValueFromTextFields(causeOfLossFiveTextArea), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCommentsFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("CommentsFive"), fetchValueFromTextFields(commentsFiveTextArea), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfgTimeOfLossFive")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("TimeOfLossFive"), fetchValueFromTextFields(timeOfLossFiveTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("IndemnityPeriodInMonths"), fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigStandardTimeExcessInWeeks")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("StandardTimeExcessInWeeks"), fetchValueFromTextFields(standardTimeExcessInWeeksTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessInWeeks")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("agreedOptedTimeExcessInWeeks"), fetchValueFromTextFields(agreedOptedTimeExcessInWeeksTextArea), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigCalculatedExcess")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("CalculatedExcess"), fetchValueFromTextFields(calculatedExcessTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaimIfAny")) {
				assertReference.assertEquals(claimRiskDtls3MCEntity.getStringValueForField("SpecialFeaturesOfClaimIfAny"), fetchValueFromTextFields(specialFeaturesOfClaimIfAnyTextField), AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigDateOfLossFive")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskDtls3MCEntity.getStringValueForField("DateOfLossFive")) ,fetchValueFromTextFields(dateOfLossFiveTextField),AssertionType.WARNING);
			}
			if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigDateOfIntimationFive")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimRiskDtls3MCEntity.getStringValueForField("DateOfIntimationFive")) ,fetchValueFromTextFields(dateOfIntimationFiveTextField),AssertionType.WARNING);
			}

		}
	}
	public void navigateToMainAttributePage(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity){
		if (claimRiskDtls3MCEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(forwardButton);
			switchToFrame("display");
			claimRiskDtls3Title = new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskDtls3MCEntity.getStringValueForField("ClaimRiskDtls3Title")+"')]"), "  claim Risk dtls 4 ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimRiskDtls3Title);
		}
	}
	public void fillandSubmitClaimRiskDtls3MarineCargo(ClaimRiskDtls3MCEntity claimRiskDtls3MCEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskDtls3MCEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskDtls3MarineCargo(claimRiskDtls3MCEntity, assertReference);
			navigateToMainAttributePage(claimRiskDtls3MCEntity);
			navigateToclaimHomePage(claimRiskDtls3MCEntity);
			navigateToInsuredItem(claimRiskDtls3MCEntity);
			navigateToDocument(claimRiskDtls3MCEntity);
			navigateToParties(claimRiskDtls3MCEntity);
			navigateToReserve(claimRiskDtls3MCEntity);
			navigateToPayment(claimRiskDtls3MCEntity);
			navigateToAttribute(claimRiskDtls3MCEntity);
			navigateToInsuredItemDetails(claimRiskDtls3MCEntity);
			navigateTInsuredItemAttribute(claimRiskDtls3MCEntity);
			clickOnForwardButton(claimRiskDtls3MCEntity);
		}
	}
	
}
