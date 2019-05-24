package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntPreHistMotorEntity;

public class PolicyInsuredIntrestPreviousHistoryOfMotor extends BasePage {
	
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
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private PageElement dateOfPurchaseOfVehicleByProposerTextField;
	private PageElement vehicleNewOrSecondHandAtTheTimeOfPurchaseDropDown;
	private PageElement vehicleUsedForPrivateSocialDomesticPleasureProfessionalPurposeDropDown;
	private PageElement isVehicleInGoodConditionDropDown;
	private PageElement giveVehicleDetailsTextArea;
	private PageElement whetherVehicleBelongsToForeignEmbassyOrConsulateDropDown;
	private PageElement whetherTheVehicleIsGovernmentVehicleDropDown;
	private PageElement additionalLoadingForVehiclesTextField;
	
	public PolicyInsuredIntrestPreviousHistoryOfMotor(WebDriver driver, String pageName) {
		super(driver, pageName);
		
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
	   //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		dateOfPurchaseOfVehicleByProposerTextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Purchase of Vehicle by Proposer')]/following::input"), "Date of Purchase of Vehicle by Proposer Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleNewOrSecondHandAtTheTimeOfPurchaseDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Vehicle New or Second hand at the time of purchase')]/following::select"), "Vehicle New or Second hand at the time of purchase DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleUsedForPrivateSocialDomesticPleasureProfessionalPurposeDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Used for Private,Social,domestic,pleasure,professional purpose')]/following::select"), "Vehicle Used for Private,Social,domestic,pleasure,professional purpose DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isVehicleInGoodConditionDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is vehicle in good condition')]/following::select"), "Is vehicle in good condition DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		giveVehicleDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Give Vehicle Details')]/following::textarea"), "Give Vehicle Details textArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherVehicleBelongsToForeignEmbassyOrConsulateDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether vehicle belongs to foreign embassy or consulate')]/following::select"), " Whether vehicle belongs to foreign embassy or consulate DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheVehicleIsGovernmentVehicleDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the Vehicle is Government Vehicle')]/following::select"), "Whether the Vehicle is Government Vehicle DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalLoadingForVehiclesTextField= new PageElement(By.xpath("//td//div[contains(text(),'Additional Loading for vehicles')]/following::input"), "Additional Loading for vehicles Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	
	
	public void fillPolicyInsuredIntrestPreviousHistoryOfMotor(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntPreHistMotorEntity.getAction().equalsIgnoreCase("add") || polInsIntPreHistMotorEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigDateOfPurchaseOfVehicleByProposer")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(polInsIntPreHistMotorEntity.getStringValueForField("DateOfPurchaseOfVehicleByProposer"));
				clearAndEnterDate(dateOfPurchaseOfVehicleByProposerTextField, dateofIntimation);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigVehicleNewOrSecondHandAtTheTimeOfPurchase")) {
				selectValueFromList(vehicleNewOrSecondHandAtTheTimeOfPurchaseDropDown, polInsIntPreHistMotorEntity.getStringValueForField("VehicleNewOrSecondHandAtTheTimeOfPurchase"));
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigVehicleUsedForPrivateSocialDomesticPleasureProfessionalPurpose")) {
				selectValueFromList(vehicleUsedForPrivateSocialDomesticPleasureProfessionalPurposeDropDown, polInsIntPreHistMotorEntity.getStringValueForField("VehicleUsedForPrivateSocialDomesticPleasureProfessionalPurpose"));
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigIsVehicleInGoodCondition")) {
				selectValueFromList(isVehicleInGoodConditionDropDown, polInsIntPreHistMotorEntity.getStringValueForField("IsVehicleInGoodCondition"));
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigGiveVehicleDetails")) {
				clearAndSendKeys(giveVehicleDetailsTextArea, polInsIntPreHistMotorEntity.getStringValueForField("GiveVehicleDetails"));
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigWhetherVehicleBelongsToForeignEmbassyOrConsulate")) {
				selectValueFromList(whetherVehicleBelongsToForeignEmbassyOrConsulateDropDown, polInsIntPreHistMotorEntity.getStringValueForField("WhetherVehicleBelongsToForeignEmbassyOrConsulate"));
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigWhetherTheVehicleIsGovernmentVehicle")) {
				selectValueFromList(whetherTheVehicleIsGovernmentVehicleDropDown, polInsIntPreHistMotorEntity.getStringValueForField("WhetherTheVehicleIsGovernmentVehicle"));
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigAdditionalLoadingForVehicles")) {
				clearAndSendKeys(additionalLoadingForVehiclesTextField, polInsIntPreHistMotorEntity.getStringValueForField("AdditionalLoadingForVehicles"));
			}
		}
		else if(polInsIntPreHistMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigDateOfPurchaseOfVehicleByProposer")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntPreHistMotorEntity.getStringValueForField("DateOfPurchaseOfVehicleByProposer")) ,fetchValueFromTextFields(dateOfPurchaseOfVehicleByProposerTextField), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigVehicleNewOrSecondHandAtTheTimeOfPurchase")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("VehicleNewOrSecondHandAtTheTimeOfPurchase"), fetchValueFromList(vehicleNewOrSecondHandAtTheTimeOfPurchaseDropDown), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigVehicleUsedForPrivateSocialDomesticPleasureProfessionalPurpose")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("VehicleUsedForPrivateSocialDomesticPleasureProfessionalPurpose"), fetchValueFromList(vehicleUsedForPrivateSocialDomesticPleasureProfessionalPurposeDropDown), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigIsVehicleInGoodCondition")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("IsVehicleInGoodCondition"), fetchValueFromList(isVehicleInGoodConditionDropDown), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigGiveVehicleDetails")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("GiveVehicleDetails"), fetchValueFromTextFields(giveVehicleDetailsTextArea), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigWhetherVehicleBelongsToForeignEmbassyOrConsulate")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("WhetherVehicleBelongsToForeignEmbassyOrConsulate"), fetchValueFromList(whetherVehicleBelongsToForeignEmbassyOrConsulateDropDown), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigWhetherTheVehicleIsGovernmentVehicle")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("WhetherTheVehicleIsGovernmentVehicle"), fetchValueFromList(whetherTheVehicleIsGovernmentVehicleDropDown), AssertionType.WARNING);
			}
			if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigAdditionalLoadingForVehicles")) {
				assertReference.assertEquals(polInsIntPreHistMotorEntity.getStringValueForField("AdditionalLoadingForVehicles"), fetchValueFromTextFields(additionalLoadingForVehiclesTextField), AssertionType.WARNING);
				
			}
		}
	}
	
	public void navigateToPolicy(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity ){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberDocument")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigMemberSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnBackButton(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity){
		if (polInsIntPreHistMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}

	public void fillandSubmitPolicyAttributePropertyDamageAddOnEngineering(PolInsIntPreHistMotorEntity polInsIntPreHistMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntPreHistMotorEntity.getConfigExecute())){
			fillPolicyInsuredIntrestPreviousHistoryOfMotor(polInsIntPreHistMotorEntity, assertReference);
			clickOnForwardButton(polInsIntPreHistMotorEntity );
			navigateToPolicy(polInsIntPreHistMotorEntity );
			navigateToAttribute(polInsIntPreHistMotorEntity );
			navigateToInsuredInterest(polInsIntPreHistMotorEntity );
			navigateToCoverage(polInsIntPreHistMotorEntity );
			navigateToLoan(polInsIntPreHistMotorEntity );
			navigateToClientDetails(polInsIntPreHistMotorEntity );
			navigateToRelation(polInsIntPreHistMotorEntity );
			navigateToPayment(polInsIntPreHistMotorEntity );
			navigateToFollowup(polInsIntPreHistMotorEntity );
			navigateToDocument(polInsIntPreHistMotorEntity );
			navigateToInsuredInterestDetails(polInsIntPreHistMotorEntity );
			navigateToInsuredInterestAttributes(polInsIntPreHistMotorEntity );
			navigateToInsuredInterestAttachCoverages(polInsIntPreHistMotorEntity );
			navigateToInsuredInterestRelations(polInsIntPreHistMotorEntity );
			navigateToInsuredInterestDocuments(polInsIntPreHistMotorEntity);
			navigateToInsuredInterestPayments(polInsIntPreHistMotorEntity );
			navigateToInsuredInterestSchedule(polInsIntPreHistMotorEntity);
			
		}
	}
}
