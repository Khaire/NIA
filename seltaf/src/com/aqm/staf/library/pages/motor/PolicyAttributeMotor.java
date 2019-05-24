package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BasicCommVehDetMotorEntity;
import com.aqm.staf.library.databin.PolAttrAOCDetEngEntity;
import com.aqm.staf.library.databin.PolAttributeMotorEntity;

public class PolicyAttributeMotor extends BasePage {

	private PageElement	coverNoteNoTextField;
	private PageElement	coverNoteBookNoTextField;	
	private PageElement	coverNoteIssueDateTextField;	
	private PageElement	coverNoteIssuedTimeStampTextField;
	private PageElement	coverNoteReceivedDateTextField;
	private PageElement	fireexplosionselfIgnitionOrLightningPerilRequiredDropDown;	
	private PageElement	burglaryHousebreakingOrTheftperilRequiredDropDown;
	private PageElement	riotAndStrikePerilRequiredDropDown;	
	private PageElement	earthquakeDamagePerilRequiredDropDown;	
	private PageElement	floodTyphoonHurricaneStormTempestInundationCycloneHailstormDropDown;
	private PageElement	accidentalExternalMeansPerilRequiredDropDown;
	private PageElement	maliciousActPerilRequiredDropDown;
	private PageElement	terroristActivityPerilRequiredDropDown;
	private PageElement	whilstInTransitByRoadRailDropDown;
	private PageElement	landslideRockslidePerilRequiredDropDown;
	private PageElement	isServiceTaxExemptedDropDown;
	private PageElement	opportunityIdTextField;
	private PageElement	isItDeclarationTypePolicyDropDown;
	private PageElement	coInsuranceApplicableDropDown;
	private PageElement	financierNameFromPortalTextField;
	private PageElement	typeOfFinancingAgreementFromPortalTextField;
	//old
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
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;
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
	private PageElement forwardButton;
	private PageElement backwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestDocumentsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestDocumentsTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement insuredInterestScheduleTitle;
	private PageElement TieUpDetailsTitle;

	public PolicyAttributeMotor(WebDriver driver, String pageName){
		super(driver,pageName);

		coverNoteNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cover Note No')]/following::input"), "Cover Note No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverNoteBookNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cover Note Book No')]/following::input"), "Cover Note Book No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverNoteIssueDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cover note Issue date')]/following::input"), "Cover note Issue date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverNoteIssuedTimeStampTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cover Note Issued Time Stamp (HH:MM:SS)')]/following::input"), "Cover Note Issued Time Stamp (HH:MM:SS)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverNoteReceivedDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cover Note Received Date')]/following::input"), "Cover Note Received Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fireexplosionselfIgnitionOrLightningPerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Fire explosion self ignition or lightning peril required')]/following::select"),"Fire explosion self ignition or lightning peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		burglaryHousebreakingOrTheftperilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Burglary housebreaking or theft peril required')]/following::select"),"Burglary housebreaking or theft peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riotAndStrikePerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Riot and strike peril required')]/following::select"),"Riot and strike peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		earthquakeDamagePerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Earthquake damage peril required')]/following::select"),"Earthquake damage peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		floodTyphoonHurricaneStormTempestInundationCycloneHailstormDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Flood typhoon hurricane storm tempest inundation cyclone hailstorm frost peril required')]/following::select"),"Flood typhoon hurricane storm tempest inundation cyclone hailstorm frost peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		accidentalExternalMeansPerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Accidental external means peril required')]/following::select"),"Accidental external means peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		maliciousActPerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Malicious act peril required')]/following::select"),"Malicious act peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		terroristActivityPerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Terrorist activity peril required')]/following::select"),"Terrorist activity peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whilstInTransitByRoadRailDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whilst in transit by road rail inland-waterway lift elevator or air peril required')]/following::select"),"Whilst in transit by road rail inland-waterway lift elevator or air peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		landslideRockslidePerilRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Landslide rockslide peril required')]/following::select"),"Landslide rockslide peril required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isServiceTaxExemptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Service Tax Exempted')]/following::select"),"Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIdTextField=new PageElement(By.xpath("//td//div[contains(text(),'Opportunity Id')]/following::input"),"Opportunity Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isItDeclarationTypePolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is it declaration type policy')]/following::select"),"Is it declaration type policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Co-Insurance Applicable')]/following::select"),"Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		financierNameFromPortalTextField=new PageElement(By.xpath("//td//div[contains(text(),'Financier name from Portal')]/following::input"),"Financier name from Portal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfFinancingAgreementFromPortalTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type Of financing Agreement from Portal')]/following::input"),"Type Of financing Agreement from Portal", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		//Buttons
		forwardButton= new PageElement(By.name("Next"),"Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backwardButton= new PageElement(By.name("btnPrevious"),"Backward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton= new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestDocumentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/font/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDocumentsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestScheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyAttributeMotorDetails(PolAttributeMotorEntity  polAttributeMotorEntity , CustomAssert assertReference) throws InterruptedException{

		if(polAttributeMotorEntity.getAction().equalsIgnoreCase("add") || polAttributeMotorEntity.getAction().equalsIgnoreCase("edit")){

			if(polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteNo")){
				clearAndSendKeys(coverNoteNoTextField,polAttributeMotorEntity.getStringValueForField("CoverNoteNo"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteBookNo")){
				clearAndSendKeys(coverNoteBookNoTextField,polAttributeMotorEntity.getStringValueForField("CoverNoteBookNo"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteIssueDate")){
				String dateissue=RandomCodeGenerator.dateGenerator(polAttributeMotorEntity.getStringValueForField("CoverNoteIssueDate"));
				clearAndEnterDate(coverNoteIssueDateTextField, dateissue);
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteIssuedTimeStamp")){
				clearAndSendKeys(coverNoteIssuedTimeStampTextField,polAttributeMotorEntity.getStringValueForField("CoverNoteIssuedTimeStamp"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteReceivedDate")){
				String datereacive=RandomCodeGenerator.dateGenerator(polAttributeMotorEntity.getStringValueForField("CoverNoteReceivedDate"));
				clearAndEnterDate(coverNoteReceivedDateTextField, datereacive);
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigFireexplosionselfIgnitionOrLightningPerilRequired")){
				selectValueFromList(fireexplosionselfIgnitionOrLightningPerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("FireexplosionselfIgnitionOrLightningPerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigBurglaryHousebreakingOrTheftperilRequired")){
				selectValueFromList(burglaryHousebreakingOrTheftperilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("BurglaryHousebreakingOrTheftperilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigRiotAndStrikePerilRequired")){
				selectValueFromList(riotAndStrikePerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("RiotAndStrikePerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigEarthquakeDamagePerilRequired")){
				selectValueFromList(earthquakeDamagePerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("EarthquakeDamagePerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigFloodTyphoonHurricaneStormTempestInundationCycloneHailstorm")){
				selectValueFromList(floodTyphoonHurricaneStormTempestInundationCycloneHailstormDropDown,polAttributeMotorEntity.getStringValueForField("FloodTyphoonHurricaneStormTempestInundationCycloneHailstorm"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigAccidentalExternalMeansPerilRequired")){
				selectValueFromList(accidentalExternalMeansPerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("AccidentalExternalMeansPerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigMaliciousActPerilRequired")){
				selectValueFromList(maliciousActPerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("MaliciousActPerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigTerroristActivityPerilRequired")){
				selectValueFromList(terroristActivityPerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("TerroristActivityPerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigWhilstInTransitByRoadRail")){
				selectValueFromList(whilstInTransitByRoadRailDropDown,polAttributeMotorEntity.getStringValueForField("WhilstInTransitByRoadRail"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigLandslideRockslidePerilRequired")){
				selectValueFromList(landslideRockslidePerilRequiredDropDown,polAttributeMotorEntity.getStringValueForField("LandslideRockslidePerilRequired"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")){
				selectValueFromList(isServiceTaxExemptedDropDown,polAttributeMotorEntity.getStringValueForField("IsServiceTaxExempted"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigOpportunityId")){
				clearAndSendKeys(opportunityIdTextField,polAttributeMotorEntity.getStringValueForField("OpportunityId"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigIsItDeclarationTypePolicy")){
				selectValueFromList(isItDeclarationTypePolicyDropDown,polAttributeMotorEntity.getStringValueForField("IsItDeclarationTypePolicy"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")){
				selectValueFromList(coInsuranceApplicableDropDown,polAttributeMotorEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigFinancierNameFromPortal")){
				clearAndSendKeys(financierNameFromPortalTextField,polAttributeMotorEntity.getStringValueForField("FinancierNameFromPortal"));
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigTypeOfFinancingAgreementFromPortal")){
				clearAndSendKeys(typeOfFinancingAgreementFromPortalTextField,polAttributeMotorEntity.getStringValueForField("TypeOfFinancingAgreementFromPortal"));
			}
		}
		else if(polAttributeMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polAttributeMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteNo")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("CoverNoteNo"), fetchValueFromTextFields(coverNoteNoTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteBookNo")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("CoverNoteBookNo"), fetchValueFromTextFields(coverNoteBookNoTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteIssueDate")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("CoverNoteIssueDate"), fetchValueFromTextFields(coverNoteIssueDateTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteIssuedTimeStamp")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("CoverNoteIssuedTimeStamp"), fetchValueFromTextFields(coverNoteIssuedTimeStampTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoverNoteReceivedDate")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("CoverNoteReceivedDate"), fetchValueFromTextFields(coverNoteReceivedDateTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigFireexplosionselfIgnitionOrLightningPerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("FireexplosionselfIgnitionOrLightningPerilRequired"), fetchValueFromList(fireexplosionselfIgnitionOrLightningPerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigBurglaryHousebreakingOrTheftperilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("BurglaryHousebreakingOrTheftperilRequired"), fetchValueFromList(burglaryHousebreakingOrTheftperilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigRiotAndStrikePerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("RiotAndStrikePerilRequired"), fetchValueFromList(riotAndStrikePerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigEarthquakeDamagePerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("EarthquakeDamagePerilRequired"), fetchValueFromList(earthquakeDamagePerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigFloodTyphoonHurricaneStormTempestInundationCycloneHailstorm")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("FloodTyphoonHurricaneStormTempestInundationCycloneHailstorm"), fetchValueFromList(floodTyphoonHurricaneStormTempestInundationCycloneHailstormDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigAccidentalExternalMeansPerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("AccidentalExternalMeansPerilRequired"), fetchValueFromList(accidentalExternalMeansPerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigMaliciousActPerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("MaliciousActPerilRequired"), fetchValueFromList(maliciousActPerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigTerroristActivityPerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("TerroristActivityPerilRequired"), fetchValueFromList(terroristActivityPerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigWhilstInTransitByRoadRail")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("WhilstInTransitByRoadRail"), fetchValueFromList(whilstInTransitByRoadRailDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigLandslideRockslidePerilRequired")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("LandslideRockslidePerilRequired"), fetchValueFromList(landslideRockslidePerilRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigIsItDeclarationTypePolicy")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("IsItDeclarationTypePolicy"), fetchValueFromList(isItDeclarationTypePolicyDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigFinancierNameFromPortal")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("FinancierNameFromPortal"), fetchValueFromTextFields(financierNameFromPortalTextField), AssertionType.WARNING);
			}
			if (polAttributeMotorEntity.getBooleanValueForField("ConfigTypeOfFinancingAgreementFromPortal")) {
				assertReference.assertEquals(polAttributeMotorEntity.getStringValueForField("TypeOfFinancingAgreementFromPortal"), fetchValueFromTextFields(typeOfFinancingAgreementFromPortalTextField), AssertionType.WARNING);
			}
		}


	}
	public void navigateToPolicy(PolAttributeMotorEntity  polAttributeMotorEntity ){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolAttributeMotorEntity  polAttributeMotorEntityy){
		if (polAttributeMotorEntityy.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigInsuredInterestPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigInsuredInterestDocuments")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigInsuredInterestSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnForwardButton(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			TieUpDetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeMotorEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(TieUpDetailsTitle);
		}
	}
	public void clickOnBackButton(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolAttributeMotorEntity  polAttributeMotorEntity){
		if (polAttributeMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void fillandSubmitfillPolicyAttributeMotorDetails(PolAttributeMotorEntity  polAttributeMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttributeMotorEntity.getConfigExecute())){
			fillPolicyAttributeMotorDetails(polAttributeMotorEntity, assertReference);
			clickOnForwardButton(polAttributeMotorEntity );
			navigateToPolicy(polAttributeMotorEntity );
			navigateToAttribute(polAttributeMotorEntity );
			navigateToInsuredInterest(polAttributeMotorEntity );
			navigateToCoverage(polAttributeMotorEntity );
			navigateToLoan(polAttributeMotorEntity );
			navigateToClientDetails(polAttributeMotorEntity );
			navigateToRelation(polAttributeMotorEntity );
			navigateToPayment(polAttributeMotorEntity );
			navigateToFollowup(polAttributeMotorEntity );
			navigateToDocument(polAttributeMotorEntity );
			navigateToInsuredInterestDetails(polAttributeMotorEntity );
			navigateToInsuredInterestAttributes(polAttributeMotorEntity );
			navigateToInsuredInterestAttachCoverages(polAttributeMotorEntity );
			navigateToInsuredInterestRelations(polAttributeMotorEntity );
			navigateToInsuredInterestDocuments(polAttributeMotorEntity);
			navigateToInsuredInterestPayments(polAttributeMotorEntity );
			navigateToInsuredInterestSchedule(polAttributeMotorEntity);

		}
	}
}


