package com.aqm.staf.library.pages.motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BasicCommVehDetMotorEntity;

public class PolicyInsuredIntrestBasicCommVehicleDetailsMotor extends BasePage {

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
	//----------------------------------------------------------
	//Motor page 5
	//Mayur_Product name= CV-G
	private PageElement loadingAmountForODTextField;
	private PageElement correctionInPremiumInViewOfCourtOrderWithoutPrejudiceTextField;
	private PageElement	extensionofGeographicalArearequiredDropDown;
	private PageElement	extensionofGeographicalAreatoBangladeshDropDown;
	private PageElement	extensionofGeographicalAreatoBhutanDropDown;
	private PageElement	extensionofGeographicalAreatoNepalDropDown;
	private PageElement	extensionofGeographicalAreatoPakistanDropDown;
	private PageElement	extensionofGeographicalAreatoSriLankaDropDown;
	private PageElement	extensionofGeographicalAreatoMaldivesDropDown;
	private PageElement	vehicleRequisitionedbyGovernmentDropDown;
	private PageElement policyExcessRsTextField;
	private PageElement imposedExcessRsTextField;
	private PageElement preExistingDamageDetailsTextField;
	private PageElement oDDiscountPercentTextField;	

	//**********PC(CHINTAN) INSURED INTREST 4TH PAGE************
	private PageElement voluntaryExcessforPCDropDown;

	//**********TW(CHINTAN) INSURED INTREST 4TH PAGE************
	private PageElement voluntaryExcessForTWDropDown;
	private PageElement loadingAmountForTPTextField;
	
	private PageElement saveButton;

	public PolicyInsuredIntrestBasicCommVehicleDetailsMotor(WebDriver driver, String pageName) {
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
		//Mayur_Product name= CV-G

		loadingAmountForODTextField= new PageElement(By.xpath("//td//div[contains(text(),'Loading amount for OD')]/following::input"), "Loading amount for OD TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		correctionInPremiumInViewOfCourtOrderWithoutPrejudiceTextField= new PageElement(By.xpath("//td//div[contains(text(),'Correction in premium in view of Court Order without prejudice')]/following::input"), "Correction in premium in view of Court Order without prejudice TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionofGeographicalArearequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area required')]/following::select"),"Extension of Geographical Area required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoBangladeshDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Bangladesh')]/following::select"),"Extension of Geographical Area to Bangladesh", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoBhutanDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Bhutan')]/following::select"),"Extension of Geographical Area to Bhutan", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoNepalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Nepal')]/following::select"),"Extension of Geographical Area to Nepal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoPakistanDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Pakistan')]/following::select"),"Extension of Geographical Area to Pakistan", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoSriLankaDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Sri Lanka')]/following::select"),"Extension of Geographical Area to Sri Lanka", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofGeographicalAreatoMaldivesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Extension of Geographical Area to Maldives')]/following::select"),"Extension of Geographical Area to Maldives", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleRequisitionedbyGovernmentDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Vehicle Requisitioned by Government')]/following::select"),"Vehicle Requisitioned by Government", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyExcessRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Policy Excess (Rs)')]/following::input"), "Policy Excess (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		imposedExcessRsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Imposed Excess (Rs)')]/following::input"), "Imposed Excess (Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preExistingDamageDetailsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Pre existing damage details')]/following::textarea"), "Pre existing damage details TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		oDDiscountPercentTextField= new PageElement(By.xpath("//td//div[contains(text(),'OD discount (%)')]/following::input"), "OD discount (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//**********PC(CHINTAN) INSURED INTREST 4TH PAGE************
		voluntaryExcessforPCDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Voluntary Excess for PC')]/following::select"), "Voluntary Excess for PC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//**********TW(CHINTAN) INSURED INTREST 4TH PAGE************
		voluntaryExcessForTWDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Voluntary Excess for TW')]/following::select"), "Voluntary Excess for TW", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		loadingAmountForTPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Loading amount for TP')]/following::select"), "Loading amount for TP", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	
	}


	public void fillPolicyInsuredIntrestBasicCommVehicleDetailsMotor(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(basicCommVehDetMotorEntity.getAction().equalsIgnoreCase("add") || basicCommVehDetMotorEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_Product name= CV-G
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigLoadingAmountForOD")) {
				clearAndSendKeys(loadingAmountForODTextField, basicCommVehDetMotorEntity.getStringValueForField("LoadingAmountForOD"));
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigCorrectionInPremiumInViewOfCourtOrderWithoutPrejudice")) {
				clearAndSendKeys(correctionInPremiumInViewOfCourtOrderWithoutPrejudiceTextField, basicCommVehDetMotorEntity.getStringValueForField("CorrectionInPremiumInViewOfCourtOrderWithoutPrejudice"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalArearequired")){
				selectValueFromList(extensionofGeographicalArearequiredDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalArearequired"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBangladesh")){
				selectValueFromList(extensionofGeographicalAreatoBangladeshDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBangladesh"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBhutan")){
				selectValueFromList(extensionofGeographicalAreatoBhutanDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBhutan"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoNepal")){
				selectValueFromList(extensionofGeographicalAreatoNepalDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoNepal"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoPakistan")){
				selectValueFromList(extensionofGeographicalAreatoPakistanDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoPakistan"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoSriLanka")){
				selectValueFromList(extensionofGeographicalAreatoSriLankaDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoSriLanka"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoMaldives")){
				selectValueFromList(extensionofGeographicalAreatoMaldivesDropDown,basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoMaldives"));
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigVehicleRequisitionedbyGovernment")){
				selectValueFromList(vehicleRequisitionedbyGovernmentDropDown,basicCommVehDetMotorEntity.getStringValueForField("VehicleRequisitionedbyGovernment"));
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPolicyExcessRs")) {
				clearAndSendKeys(policyExcessRsTextField, basicCommVehDetMotorEntity.getStringValueForField("PolicyExcessRs"));
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigImposedExcessRs")) {
				clearAndSendKeys(imposedExcessRsTextField, basicCommVehDetMotorEntity.getStringValueForField("ImposedExcessRs"));
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPreExistingDamageDetails")) {
				clearAndSendKeys(preExistingDamageDetailsTextField, basicCommVehDetMotorEntity.getStringValueForField("PreExistingDamageDetails"));
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigODDiscountPercent")) {
				clearAndSendKeys(oDDiscountPercentTextField, basicCommVehDetMotorEntity.getStringValueForField("ODDiscountPercent"));
			}

			//***********PC(CHINTAN) INSURED INTREST 4TH PAGE********
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigVoluntaryExcessforPc")) {
				selectValueFromList(voluntaryExcessforPCDropDown, basicCommVehDetMotorEntity.getStringValueForField("VoluntaryExcessforPc"));
			}

			//***********TW(CHINTAN) INSURED INTREST 4TH PAGE********
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigVoluntaryExcessForTW")) {
				selectValueFromList(voluntaryExcessForTWDropDown, basicCommVehDetMotorEntity.getStringValueForField("VoluntaryExcessForTW"));
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigLoadingAmountForTP")) {
				clearAndSendKeys(loadingAmountForTPTextField, basicCommVehDetMotorEntity.getStringValueForField("LoadingAmountForTP"));
			}

		}
		else if(basicCommVehDetMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(basicCommVehDetMotorEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Mayur_Product name= CV-G
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigLoadingAmountForOD")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("LoadingAmountForOD"), fetchValueFromTextFields(loadingAmountForODTextField), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigCorrectionInPremiumInViewOfCourtOrderWithoutPrejudice")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("CorrectionInPremiumInViewOfCourtOrderWithoutPrejudice"), fetchValueFromTextFields(correctionInPremiumInViewOfCourtOrderWithoutPrejudiceTextField), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalArearequired")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalArearequired"), fetchValueFromList(extensionofGeographicalArearequiredDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBangladesh")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBangladesh"), fetchValueFromList(extensionofGeographicalAreatoBangladeshDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoBhutan")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoBhutan"), fetchValueFromList(extensionofGeographicalAreatoBhutanDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoNepal")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoNepal"), fetchValueFromList(extensionofGeographicalAreatoNepalDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoPakistan")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoPakistan"), fetchValueFromList(extensionofGeographicalAreatoPakistanDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoSriLanka")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoSriLanka"), fetchValueFromList(extensionofGeographicalAreatoSriLankaDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigExtensionofGeographicalAreatoMaldives")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ExtensionofGeographicalAreatoMaldives"), fetchValueFromList(extensionofGeographicalAreatoMaldivesDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigVehicleRequisitionedbyGovernment")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("VehicleRequisitionedbyGovernment"), fetchValueFromList(vehicleRequisitionedbyGovernmentDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPolicyExcessRs")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("PolicyExcessRs"), fetchValueFromTextFields(policyExcessRsTextField), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigImposedExcessRs")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ImposedExcessRs"), fetchValueFromTextFields(imposedExcessRsTextField), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPreExistingDamageDetails")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("PreExistingDamageDetails"), fetchValueFromTextFields(preExistingDamageDetailsTextField), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigODDiscountPercent")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("ODDiscountPercent"), fetchValueFromTextFields(oDDiscountPercentTextField), AssertionType.WARNING);
			}
			//***********PC(CHINTAN) INSURED INTREST 4TH PAGE********
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigVoluntaryExcessforPc")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("VoluntaryExcessforPC"), fetchValueFromList(voluntaryExcessforPCDropDown), AssertionType.WARNING);
			}
			//***********TW(CHINTAN) INSURED INTREST 4TH PAGE********
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigVoluntaryExcessForTW")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("VoluntaryExcessForTW"), fetchValueFromList(voluntaryExcessForTWDropDown), AssertionType.WARNING);
			}
			if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigLoadingAmountForTP")) {
				assertReference.assertEquals(basicCommVehDetMotorEntity.getStringValueForField("LoadingAmountForTP"), fetchValueFromList(loadingAmountForTPTextField), AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicy(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity ){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			switchToFrame("display");
		}
	}
	public void navigateToClientDetails(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToInsuredInterestDocuments(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestDocuments")) {
			click(insuredInterestDocumentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDocumentsTitle);
		}
	}
	public void navigateToInsuredInterestSchedule(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigInsuredInterestSchedule")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTitle);
		}
	}
	public void clickOnForwardButton(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			return;
		}
	}
	public void clickOnBackButton(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnsaveButton(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity){
		if (basicCommVehDetMotorEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
		}
	}
	public void fillandSubmitPolicyInsuredIntrestBasicCommVehicleDetailsMotor(BasicCommVehDetMotorEntity basicCommVehDetMotorEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(basicCommVehDetMotorEntity.getConfigExecute())){
			fillPolicyInsuredIntrestBasicCommVehicleDetailsMotor(basicCommVehDetMotorEntity, assertReference);
			clickOnForwardButton(basicCommVehDetMotorEntity );
			navigateToPolicy(basicCommVehDetMotorEntity );
			navigateToAttribute(basicCommVehDetMotorEntity );
			navigateToInsuredInterest(basicCommVehDetMotorEntity );
			navigateToCoverage(basicCommVehDetMotorEntity );
			navigateToLoan(basicCommVehDetMotorEntity );
			navigateToClientDetails(basicCommVehDetMotorEntity );
			navigateToRelation(basicCommVehDetMotorEntity );
			navigateToPayment(basicCommVehDetMotorEntity );
			navigateToFollowup(basicCommVehDetMotorEntity );
			navigateToDocument(basicCommVehDetMotorEntity );
			navigateToInsuredInterestDetails(basicCommVehDetMotorEntity );
			navigateToInsuredInterestAttributes(basicCommVehDetMotorEntity );
			navigateToInsuredInterestAttachCoverages(basicCommVehDetMotorEntity );
			navigateToInsuredInterestRelations(basicCommVehDetMotorEntity );
			navigateToInsuredInterestDocuments(basicCommVehDetMotorEntity);
			navigateToInsuredInterestPayments(basicCommVehDetMotorEntity );
			navigateToInsuredInterestSchedule(basicCommVehDetMotorEntity);
			clickOnsaveButton(basicCommVehDetMotorEntity );
		}
	}
}
