package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimRiskDetEngEntity;

public class ClaimRiskDetailsEngineering extends BasePage {
	
	private PageElement claimRiskDetailsTitle;
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
	
	private PageElement policyNoCertificateNo5TextField;
	private PageElement sumInsured5TextField;
	private PageElement marineCargoClaimNo5TextField; 
	private PageElement marineCargoPolicyNoCertificateNo5TextField; 
	private PageElement natureOfLoss5TextArea;
	private PageElement causeOfLoss5TextArea;
	private PageElement dateOfLoss5TextField;
	private PageElement comments5TextArea;
	private PageElement dateOfIntimation5TextField;
	private PageElement timeOfLoss5TextField;
	
	private PageElement indemnityPeriodInMonthsTextField;
	private PageElement standardTimeExcessInWeeksTextField;
	private PageElement agreedOptedTimeExcessinWeeksTextField;
	private PageElement specialFeaturesOfClaimIfAnyTextField;
	private PageElement calculatedExcessEngTextField;
	private PageElement whetherThePolicyIs64VBCompliantDropDown;
	private PageElement listOfTheCountriesDropDown;

	public ClaimRiskDetailsEngineering(WebDriver driver, String pageName,int rowCounts) {
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
		
		policyNoCertificateNo5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 5 ')]/following::input"), "Policy No./Certificate No. 5  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		sumInsured5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured5 ')]/following::input"), "Sum Insured5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		marineCargoClaimNo5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.5 ')]/following::input"), "Marine Cargo Claim No.5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		marineCargoPolicyNoCertificateNo5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 5 ')]/following::input"), "Marine Cargo Policy No./Certificate No. 5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		natureOfLoss5TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss5 ')]/following::textarea"), "Nature of Loss5 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		causeOfLoss5TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss5 ')]/following::textarea"), "Cause of Loss5 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		dateOfLoss5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss5 ')]/following::input"), "Cause of Loss5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		comments5TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Comments5 ')]/following::textarea"), "Comments5 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		dateOfIntimation5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation5 ')]/following::input"), "Date of Intimation5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		timeOfLoss5TextField= new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss5 ')]/following::input"), "Time of Loss5 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		
		indemnityPeriodInMonthsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Indemnity Period (in Months) ')]/following::input"), "Indemnity Period (in Months)  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		standardTimeExcessInWeeksTextField= new PageElement(By.xpath("//td//div[contains(text(),'Standard Time Excess(in weeks) ')]/following::input"), "Standard Time Excess(in weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		agreedOptedTimeExcessinWeeksTextField= new PageElement(By.xpath("//td//div[contains(text(),'Agreed/Opted Time Excess(in weeks) ')]/following::input"), "Agreed/Opted Time Excess(in weeks) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		specialFeaturesOfClaimIfAnyTextField= new PageElement(By.xpath("//td//div[contains(text(),'Special features of Claim (if any) ')]/following::textarea"), "Special features of Claim (if any) TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		calculatedExcessEngTextField= new PageElement(By.xpath("//td//div[contains(text(),'Calculated Excess ')]/following::input"), "Calculated Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 50);
		whetherThePolicyIs64VBCompliantDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the policy is 64 VB compliant ')]/following::select"), "Whether the policy is 64 VB compliant dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		listOfTheCountriesDropDown= new PageElement(By.xpath("//td//div[contains(text(),'List of the Countries ')]/following::select"), "List of the Countries dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	
	public void fillClaimRiskDetailsEngineering(ClaimRiskDetEngEntity claimRiskDetEngEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimRiskDetEngEntity.getAction().equalsIgnoreCase("add") || claimRiskDetEngEntity.getAction().equalsIgnoreCase("edit")){
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo5")) {
				clearAndSendKeys(policyNoCertificateNo5TextField, claimRiskDetEngEntity.getStringValueForField("PolicyNoCertificateNo5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigSumInsured5")) {
				clearAndSendKeys(sumInsured5TextField, claimRiskDetEngEntity.getStringValueForField("SumInsured5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo5")) {
				clearAndSendKeys(marineCargoClaimNo5TextField, claimRiskDetEngEntity.getStringValueForField("MarineCargoClaimNo5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo5")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNo5TextField, claimRiskDetEngEntity.getStringValueForField("MarineCargoPolicyNoCertificateNo5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigNatureOfLoss5")) {
				clearAndSendKeys(natureOfLoss5TextArea, claimRiskDetEngEntity.getStringValueForField("NatureOfLoss5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigCauseOfLoss5")) {
				clearAndSendKeys(causeOfLoss5TextArea, claimRiskDetEngEntity.getStringValueForField("CauseOfLoss5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigDateOfLoss5")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimRiskDetEngEntity.getStringValueForField("DateOfLoss5"));
				clearAndEnterDate(dateOfLoss5TextField, dateofIntimation);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigComments5")) {
				clearAndSendKeys(comments5TextArea, claimRiskDetEngEntity.getStringValueForField("Comments5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigDateOfIntimation5")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimRiskDetEngEntity.getStringValueForField("DateOfIntimation5"));
				clearAndEnterDate(dateOfIntimation5TextField, dateofIntimation);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigTimeOfLoss5")) {
				clearAndSendKeys(timeOfLoss5TextField, claimRiskDetEngEntity.getStringValueForField("TimeOfLoss5"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaimIfAny")) {
				clearAndSendKeys(specialFeaturesOfClaimIfAnyTextField, claimRiskDetEngEntity.getStringValueForField("SpecialFeaturesOfClaimIfAny"));
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigCalculatedExcessEng")) {
				clearAndSendKeys(calculatedExcessEngTextField, claimRiskDetEngEntity.getStringValueForField("CalculatedExcessEng"));
			}
			if(claimRiskDetEngEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")){
				selectValueFromList(whetherThePolicyIs64VBCompliantDropDown,claimRiskDetEngEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"));
			}
			if(claimRiskDetEngEntity.getBooleanValueForField("ConfigListOfTheCountries")){
				selectValueFromList(listOfTheCountriesDropDown,claimRiskDetEngEntity.getStringValueForField("ListOfTheCountries"));
			}
		}
		else if(claimRiskDetEngEntity.getAction().equalsIgnoreCase("verify")){
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("PolicyNoCertificateNo5"),fetchValueFromTextFields(policyNoCertificateNo5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigSumInsured5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("SumInsured5"),fetchValueFromTextFields(sumInsured5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("MarineCargoClaimNo5"),fetchValueFromTextFields(marineCargoClaimNo5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("marineCargoPolicyNoCertificateNo5"),fetchValueFromTextFields(marineCargoPolicyNoCertificateNo5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigNatureOfLoss5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("NatureOfLoss5"),fetchValueFromTextFields(natureOfLoss5TextArea), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigCauseOfLoss5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("CauseOfLoss5"),fetchValueFromTextFields(causeOfLoss5TextArea), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigDateOfLoss5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("DateOfLoss5"),fetchValueFromTextFields(dateOfLoss5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigComments5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("Comments5"),fetchValueFromTextFields(comments5TextArea), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigDateOfIntimation5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("DateOfIntimation5"),fetchValueFromTextFields(dateOfIntimation5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigTimeOfLoss5")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("TimeOfLoss5"),fetchValueFromTextFields(timeOfLoss5TextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("IndemnityPeriodInMonths"),fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigStandardTimeExcessInWeeks")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("StandardTimeExcessInWeeks"),fetchValueFromTextFields(standardTimeExcessInWeeksTextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessinWeeks")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("AgreedOptedTimeExcessinWeeks"),fetchValueFromTextFields(agreedOptedTimeExcessinWeeksTextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaimIfAny")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("SpecialFeaturesOfClaimIfAny"),fetchValueFromTextFields(specialFeaturesOfClaimIfAnyTextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigCalculatedExcessEng")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("CalculatedExcessEng"),fetchValueFromTextFields(calculatedExcessEngTextField), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"), fetchValueFromList(whetherThePolicyIs64VBCompliantDropDown), AssertionType.WARNING);
			}
			if (claimRiskDetEngEntity.getBooleanValueForField("ConfigListOfTheCountries")) {
				assertReference.assertEquals(claimRiskDetEngEntity.getStringValueForField("ListOfTheCountries"), fetchValueFromList(listOfTheCountriesDropDown), AssertionType.WARNING);
			}

		}
	}
	public void navigateToMainAttributePage(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(ClaimRiskDetEngEntity claimRiskDetEngEntity){
		if (claimRiskDetEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			claimRiskDetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimRiskDetEngEntity.getStringValueForField("ClaimRiskDetailsTitle")+"')]"), "  claim Risk details ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimRiskDetailsTitle);
		}
	}
	public void fillandSubmitClaimRiskDetailsEngineering(ClaimRiskDetEngEntity claimRiskDetEngEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimRiskDetEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskDetailsEngineering(claimRiskDetEngEntity, assertReference);
			navigateToMainAttributePage(claimRiskDetEngEntity);
			navigateToclaimHomePage(claimRiskDetEngEntity);
			navigateToInsuredItem(claimRiskDetEngEntity);
			navigateToDocument(claimRiskDetEngEntity);
			navigateToParties(claimRiskDetEngEntity);
			navigateToReserve(claimRiskDetEngEntity);
			navigateToPayment(claimRiskDetEngEntity);
			navigateToAttribute(claimRiskDetEngEntity);
			navigateToInsuredItemDetails(claimRiskDetEngEntity);
			navigateTInsuredItemAttribute(claimRiskDetEngEntity);
			clickOnForwardButton(claimRiskDetEngEntity);
		}
	}
}	
