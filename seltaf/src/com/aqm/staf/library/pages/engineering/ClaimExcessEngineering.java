package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimExcessEngEntity;
import com.aqm.staf.library.databin.PolInsIntAttEQEngEntity;

public class ClaimExcessEngineering extends BasePage{

	private PageElement claimDeatilsExcessTitle;
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

	private PageElement excessAmountTextField;
	private PageElement policyNoCertificateNo3TextField;
	private PageElement sumInsured3TextField;
	private PageElement marineCargoClaimNo3TextField; 
	private PageElement marineCargoPolicyNoCertificateNo3TextField; 
	private PageElement natureOfLoss3TextArea;
	private PageElement causeOfLoss3TextArea;
	private PageElement dateOfLoss3TextField;
	private PageElement comments3TextArea;
	private PageElement dateOfIntimation3TextField;
	private PageElement timeOfLoss3TextField;
	private PageElement policyNoCertificateNo4TextField;
	private PageElement sumInsured4TextField;
	private PageElement marineCargoClaimNo4TextField; 
	private PageElement marineCargoPolicyNoCertificateNo4TextField; 
	private PageElement natureOfLoss4TextArea;
	private PageElement causeOfLoss4TextArea;
	private PageElement dateOfLoss4TextField;
	private PageElement comments4TextArea;
	private PageElement dateOfIntimation4TextField;
	private PageElement timeOfLoss4TextField;
	private PageElement calculatedExcessCPMTextField;
	private PageElement calculatedExcessDSTextField;
	private PageElement calculatedExcessWPTextField;
	//EC-Yogesh
	private PageElement calculatedExcessECTextField;
	//EI-Yogesh
	private PageElement calculatedExcessEITextField;
	//MB-Yogesh
	private PageElement calculatedExcessMBTextField;
	private PageElement saveButton;

	public ClaimExcessEngineering(WebDriver driver, String pageName,int rowCounts) {
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
		excessAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Excess Amount')]/following::input"), "Excess Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyNoCertificateNo3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 3 ')]/following::input"), "Policy No./Certificate No. 3  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		sumInsured3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured3 ')]/following::input"), "Sum Insured3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		marineCargoClaimNo3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.3 ')]/following::input"), "Marine Cargo Claim No.3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		marineCargoPolicyNoCertificateNo3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 3 ')]/following::input"), "Marine Cargo Policy No./Certificate No. 3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		natureOfLoss3TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss3 ')]/following::textarea"), "Nature of Loss3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		causeOfLoss3TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss3 ')]/following::textarea"), "Cause of Loss3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dateOfLoss3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss3 ')]/following::input"), "Cause of Loss3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		comments3TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Comments3 ')]/following::textarea"), "Comments3 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dateOfIntimation3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation3 ')]/following::input"), "Date of Intimation3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		timeOfLoss3TextField= new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss3 ')]/following::input"), "Time of Loss3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		policyNoCertificateNo4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 4 ')]/following::input"), "Policy No./Certificate No. 4  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		sumInsured4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured4 ')]/following::input"), "Sum Insured4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		marineCargoClaimNo4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.4 ')]/following::input"), "Marine Cargo Claim No.4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		marineCargoPolicyNoCertificateNo4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 4 ')]/following::input"), "Marine Cargo Policy No./Certificate No. 4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		natureOfLoss4TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss4 ')]/following::textarea"), "Nature of Loss4 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		causeOfLoss4TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss4 ')]/following::textarea"), "Cause of Loss4 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		dateOfLoss4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss4 ')]/following::input"), "Cause of Loss4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		comments4TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Comments4 ')]/following::textarea"), "Comments4 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		dateOfIntimation4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation4 ')]/following::input"), "Date of Intimation4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		timeOfLoss4TextField= new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss4 ')]/following::input"), "Time of Loss4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		calculatedExcessCPMTextField= new PageElement(By.xpath("//td//div[contains(text(),'Calculated Excess(CPM)')]/following::input"), "Calculated Excess(CPM) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		calculatedExcessDSTextField= new PageElement(By.xpath("//td//div[contains(text(),'Calculated Excess(DS)')]/following::input"), "Calculated Excess(DS) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		calculatedExcessWPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Calculated Excess(WP)')]/following::input"), "Calculated Excess(WP) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 40);
		calculatedExcessECTextField=new PageElement(By.xpath("//td/div[contains(text(),'Calculated Excess(EC)')]/following::input"),"Calculated Excess(EC) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EI-yogesh
		calculatedExcessEITextField=new PageElement(By.xpath("//td/div[contains(text(),'Calculated Excess(EI)')]/following::input"),"Calculated Excess(EI) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//MB-yogesh
		calculatedExcessMBTextField=new PageElement(By.xpath("//td/div[contains(text(),'Calculated Excess(MB)')]/following::input"),"Calculated Excess(MB) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillClaimExcessEngineering(ClaimExcessEngEntity claimExcessEngEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimExcessEngEntity.getAction().equalsIgnoreCase("add") || claimExcessEngEntity.getAction().equalsIgnoreCase("edit")){
			if (claimExcessEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo3")) {
				clearAndSendKeys(policyNoCertificateNo3TextField, claimExcessEngEntity.getStringValueForField("PolicyNoCertificateNo3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigSumInsured3")) {
				clearAndSendKeys(sumInsured3TextField, claimExcessEngEntity.getStringValueForField("SumInsured3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo3")) {
				clearAndSendKeys(marineCargoClaimNo3TextField, claimExcessEngEntity.getStringValueForField("MarineCargoClaimNo3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo3")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNo3TextField, claimExcessEngEntity.getStringValueForField("MarineCargoPolicyNoCertificateNo3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigNatureOfLoss3")) {
				clearAndSendKeys(natureOfLoss3TextArea, claimExcessEngEntity.getStringValueForField("NatureOfLoss3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCauseOfLoss3")) {
				clearAndSendKeys(causeOfLoss3TextArea, claimExcessEngEntity.getStringValueForField("CauseOfLoss3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfLoss3")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimExcessEngEntity.getStringValueForField("DateOfLoss3"));
				clearAndEnterDate(dateOfLoss3TextField, dateofIntimation);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigComments3")) {
				clearAndSendKeys(comments3TextArea, claimExcessEngEntity.getStringValueForField("Comments3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfIntimation3")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimExcessEngEntity.getStringValueForField("DateOfIntimation3"));
				clearAndEnterDate(dateOfIntimation3TextField, dateofIntimation);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigTimeOfLoss3")) {
				clearAndSendKeys(timeOfLoss3TextField, claimExcessEngEntity.getStringValueForField("TimeOfLoss3"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo4")) {
				clearAndSendKeys(policyNoCertificateNo4TextField, claimExcessEngEntity.getStringValueForField("PolicyNoCertificateNo4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigSumInsured4")) {
				clearAndSendKeys(sumInsured4TextField, claimExcessEngEntity.getStringValueForField("SumInsured4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo4")) {
				clearAndSendKeys(marineCargoClaimNo4TextField, claimExcessEngEntity.getStringValueForField("MarineCargoClaimNo4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo4")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNo4TextField, claimExcessEngEntity.getStringValueForField("MarineCargoPolicyNoCertificateNo4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigNatureOfLoss4")) {
				clearAndSendKeys(natureOfLoss4TextArea, claimExcessEngEntity.getStringValueForField("NatureOfLoss4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCauseOfLoss4")) {
				clearAndSendKeys(causeOfLoss4TextArea, claimExcessEngEntity.getStringValueForField("CauseOfLoss4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfLoss4")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimExcessEngEntity.getStringValueForField("DateOfLoss4"));
				clearAndEnterDate(dateOfLoss4TextField, dateofIntimation);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigComments4")) {
				clearAndSendKeys(comments4TextArea, claimExcessEngEntity.getStringValueForField("Comments4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfIntimation4")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimExcessEngEntity.getStringValueForField("DateOfIntimation4"));
				clearAndEnterDate(dateOfIntimation4TextField, dateofIntimation);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigTimeOfLoss4")) {
				clearAndSendKeys(timeOfLoss4TextField, claimExcessEngEntity.getStringValueForField("TimeOfLoss4"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessDS")) {
				clearAndSendKeys(calculatedExcessDSTextField, claimExcessEngEntity.getStringValueForField("CalculatedExcessDS"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessWP")) {
				clearAndSendKeys(calculatedExcessWPTextField, claimExcessEngEntity.getStringValueForField("CalculatedExcessWP"));
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigExcessAmount")) {
				clearAndSendKeys(excessAmountTextField, claimExcessEngEntity.getStringValueForField("ExcessAmount"));
			}
		}
		else if(claimExcessEngEntity.getAction().equalsIgnoreCase("verify")){
			if (claimExcessEngEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigExcessAmount")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("ExcessAmount"),fetchValueFromTextFields(excessAmountTextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("PolicyNoCertificateNo3"),fetchValueFromTextFields(policyNoCertificateNo3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigSumInsured3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("SumInsured3"),fetchValueFromTextFields(sumInsured3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("MarineCargoClaimNo3"),fetchValueFromTextFields(marineCargoClaimNo3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("marineCargoPolicyNoCertificateNo3"),fetchValueFromTextFields(marineCargoPolicyNoCertificateNo3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigNatureOfLoss3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("NatureOfLoss3"),fetchValueFromTextFields(natureOfLoss3TextArea), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCauseOfLoss3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CauseOfLoss3"),fetchValueFromTextFields(causeOfLoss3TextArea), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfLoss3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("DateOfLoss3"),fetchValueFromTextFields(dateOfLoss3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigComments3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("Comments3"),fetchValueFromTextFields(comments3TextArea), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfIntimation3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("DateOfIntimation3"),fetchValueFromTextFields(dateOfIntimation3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigTimeOfLoss3")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("TimeOfLoss3"),fetchValueFromTextFields(timeOfLoss3TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("PolicyNoCertificateNo4"),fetchValueFromTextFields(policyNoCertificateNo4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigSumInsured4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("SumInsured4"),fetchValueFromTextFields(sumInsured4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("MarineCargoClaimNo4"),fetchValueFromTextFields(marineCargoClaimNo4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("marineCargoPolicyNoCertificateNo4"),fetchValueFromTextFields(marineCargoPolicyNoCertificateNo4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigNatureOfLoss4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("NatureOfLoss4"),fetchValueFromTextFields(natureOfLoss4TextArea), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCauseOfLoss4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CauseOfLoss4"),fetchValueFromTextFields(causeOfLoss4TextArea), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfLoss4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("DateOfLoss4"),fetchValueFromTextFields(dateOfLoss4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigComments4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("Comments4"),fetchValueFromTextFields(comments4TextArea), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigDateOfIntimation4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("DateOfIntimation4"),fetchValueFromTextFields(dateOfIntimation4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigTimeOfLoss4")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("TimeOfLoss4"),fetchValueFromTextFields(timeOfLoss4TextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessCPM")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CalculatedExcessCPM"),fetchValueFromTextFields(calculatedExcessCPMTextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessDS")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CalculatedExcessDS"),fetchValueFromTextFields(calculatedExcessDSTextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessWP")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CalculatedExcessWP"),fetchValueFromTextFields(calculatedExcessWPTextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessEC")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CalculatedExcessEC"), fetchValueFromTextFields(calculatedExcessECTextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessEI")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CalculatedExcessEI"), fetchValueFromTextFields(calculatedExcessEITextField), AssertionType.WARNING);
			}
			if (claimExcessEngEntity.getBooleanValueForField("ConfigCalculatedExcessMB")) {
				assertReference.assertEquals(claimExcessEngEntity.getStringValueForField("CalculatedExcessMB"), fetchValueFromTextFields(calculatedExcessMBTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToMainAttributePage(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			claimDeatilsExcessTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimExcessEngEntity.getStringValueForField("ClaimDeatilsExcessTitle")+"')]"), " Claim Deatils-Excess  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimDeatilsExcessTitle);
		}
	}
	public void clickOnSaveButton(ClaimExcessEngEntity claimExcessEngEntity){
		if (claimExcessEngEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
		}
	}
	public void fillandSubmitClaimExcessEngineering(ClaimExcessEngEntity claimExcessEngEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimExcessEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimExcessEngineering(claimExcessEngEntity, assertReference);
			navigateToMainAttributePage(claimExcessEngEntity);
			navigateToclaimHomePage(claimExcessEngEntity);
			navigateToInsuredItem(claimExcessEngEntity);
			navigateToDocument(claimExcessEngEntity);
			navigateToParties(claimExcessEngEntity);
			navigateToReserve(claimExcessEngEntity);
			navigateToPayment(claimExcessEngEntity);
			navigateToAttribute(claimExcessEngEntity);
			navigateToInsuredItemDetails(claimExcessEngEntity);
			navigateTInsuredItemAttribute(claimExcessEngEntity);
			clickOnForwardButton(claimExcessEngEntity);
			clickOnSaveButton(claimExcessEngEntity);

		}
	}
}

