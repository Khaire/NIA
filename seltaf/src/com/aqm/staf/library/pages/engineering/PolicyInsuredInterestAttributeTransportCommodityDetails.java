package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntAttTransCommEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMNLEntity;


public class PolicyInsuredInterestAttributeTransportCommodityDetails extends BasePage {
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
	private PageElement saveButton;
	private PageElement proceedButton;

	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement typeOfExportDropDown;
	private PageElement machineryDropDown;
	private PageElement secondHandDropDown;
	private PageElement whetherOverDimensionalDropDown;
	private PageElement basisOfValuationDropDown;
	private PageElement typeOfPostDropDown;
	private PageElement typeOfCarrierDropDown;
	private PageElement typeOfBillDropDown;
	private PageElement dutyInsuranceApplicableDropDown;
	private PageElement percentageExtraTextField;
	private PageElement increasedValueSumInsuredTextField;
	private PageElement billNumberTextArea;
	private PageElement markNumberTextArea;
	private PageElement billDateTextField;

	private PageElement modeOfTransportDropDown;
	private PageElement fromPlaceTextArea;
	private PageElement toPlaceTextArea;
	private PageElement commodityDescriptionTextArea;
	private PageElement packagingDescriptionTextArea;
	private PageElement commoditySumInsuredTextField;
	private PageElement commodityRateTextField;


	private PageElement addbutton;
	private PageElement savebutton;
	private PageElement closebutton;
	private PageElement deletebutton;
	private PageElement openButton;
	private PageElement openButton1;

	public PolicyInsuredInterestAttributeTransportCommodityDetails(WebDriver driver, String pageName,int rowcount) {
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
		saveButton= new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		typeOfExportDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Export')]/following::select"),"Type of Export", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machineryDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Machinery')]/following::select"),"Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		secondHandDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Second Hand')]/following::select"),"Second Hand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherOverDimensionalDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether over-dimensional')]/following::select"),"Whether over-dimensional", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Basis of Valuation')]/following::select"),"Basis of Valuation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfPostDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Post')]/following::select"),"Type of Post", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfCarrierDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Carrier')]/following::select"),"Type of Carrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBillDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Bill')]/following::select"),"Type of Bill", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		dutyInsuranceApplicableDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Duty Insurance Applicable')]/following::select"),"Duty Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		percentageExtraTextField=new PageElement(By.xpath("//td//div[contains(text(),'% Extra')]/following::input"), "% Extra", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		increasedValueSumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Increased Value Sum Insured')]/following::input"), "Increased Value Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billNumberTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Bill Number')]/following::textarea"),"Bill Number", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"),"Mark Number", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		billDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bill Date')]/following::input"),"Bill Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		fromPlaceTextArea=new PageElement(By.name("Data_213898705022010_"+rowcount+""),"From place Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toPlaceTextArea=new PageElement(By.name("Data_213898805022010_"+rowcount+""),"To place Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addbutton=new PageElement(By.name("btnAdd"),"Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		savebutton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closebutton=new PageElement(By.name("btnClose"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deletebutton=new PageElement(By.name("btnDel"),"Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openButton= new PageElement(By.xpath("//td//div[contains(text(),'Transport Details')]/following::input"), "Open Button for Transport Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		openButton1= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Details')]/following::input"), "Open Button for Commodity Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		commodityDescriptionTextArea=new PageElement(By.name("Data_213910105022010_0"),"commodity description Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextArea=new PageElement(By.name("Data_213913805022010_0"),"packaging description Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commoditySumInsuredTextField=new PageElement(By.name("Data_213913905022010_0"),"commodity suminsured Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateTextField=new PageElement(By.name("Data_213914005022010_0"),"commodity Rate Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}


	public void fillPolicyInsuredIntrestAttributeTransportCommodityDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity, CustomAssert assertReference) throws InterruptedException{

		if(polInsIntAttTransCommEntity.getAction().equalsIgnoreCase("add") || polInsIntAttTransCommEntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfExport")) {
				selectValueFromList(typeOfExportDropDown,polInsIntAttTransCommEntity.getStringValueForField("typeOfExport"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMachinery")) {
				selectValueFromList(machineryDropDown,polInsIntAttTransCommEntity.getStringValueForField("Machinery"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSecondHand")) {
				selectValueFromList(secondHandDropDown,polInsIntAttTransCommEntity.getStringValueForField("SecondHand"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigwhetherOverDimensional")) {
				selectValueFromList(whetherOverDimensionalDropDown,polInsIntAttTransCommEntity.getStringValueForField("whetherOverDimensional"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigbasisOfValuation")) {
				selectValueFromList(basisOfValuationDropDown,polInsIntAttTransCommEntity.getStringValueForField("basisOfValuation"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfPost")) {
				selectValueFromList(typeOfPostDropDown,polInsIntAttTransCommEntity.getStringValueForField("typeOfPost"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfCarrier")) {
				selectValueFromList(typeOfCarrierDropDown,polInsIntAttTransCommEntity.getStringValueForField("typeOfCarrier"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfBill")) {
				selectValueFromList(typeOfBillDropDown,polInsIntAttTransCommEntity.getStringValueForField("typeOfBill"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigdutyInsuranceApplicable")) {
				selectValueFromList(dutyInsuranceApplicableDropDown,polInsIntAttTransCommEntity.getStringValueForField("dutyInsuranceApplicable"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigpercentageExtra")) {
				clearAndSendKeys(percentageExtraTextField, polInsIntAttTransCommEntity.getStringValueForField("percentageExtra"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigincreasedValueSumInsured")) {
				clearAndSendKeys(increasedValueSumInsuredTextField, polInsIntAttTransCommEntity.getStringValueForField("increasedValueSumInsured"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigbillNumber")) {
				clearAndSendKeys(billNumberTextArea, polInsIntAttTransCommEntity.getStringValueForField("billNumber"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigmarkNumber")) {
				clearAndSendKeys(markNumberTextArea, polInsIntAttTransCommEntity.getStringValueForField("markNumber"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigbillDate")) {
				clearAndSendKeys(billDateTextField, polInsIntAttTransCommEntity.getStringValueForField("billDate"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigTransportDetails")) {
				verifyTransportDetails(polInsIntAttTransCommEntity, assertReference);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigCommodityDetails")) {
				fillCommodityDetails(polInsIntAttTransCommEntity);
			}

		}
		else if(polInsIntAttTransCommEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfExport")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("typeOfExport"), fetchValueFromList(typeOfExportDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMachinery")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("Machinery"), fetchValueFromList(machineryDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSecondHand")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("SecondHand"), fetchValueFromList(secondHandDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigwhetherOverDimensional")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("whetherOverDimensional"), fetchValueFromList(whetherOverDimensionalDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigbasisOfValuation")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("basisOfValuation"), fetchValueFromList(basisOfValuationDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfPost")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("typeOfPost"), fetchValueFromList(typeOfPostDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfCarrier")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("typeOfCarrier"), fetchValueFromList(typeOfCarrierDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtypeOfBill")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("typeOfBill"), fetchValueFromList(typeOfBillDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigdutyInsuranceApplicable")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("dutyInsuranceApplicable"), fetchValueFromList(dutyInsuranceApplicableDropDown), AssertionType.WARNING);
			}

		}
	}
	public void navigateToPolicy(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigLoanTab")){			
			click(loanTab);
			//		switchToFrame("display");
		}
	}
	public void navigateToClientDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void clickOnForwardButton(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigForwardButton")){
			click(forwardButton);
			switchToFrame("display");
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigBackER")){
				click(backButton);
				switchToFrame("display");
				click(proceedButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");
				click(forwardButton);
				switchToFrame("display");

			}
			//if(isElementDisplayed(policyQuoteDetailsTitlePage));
			return;
		}
	}
	public void clickOnBackButton(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}
	public void clickOnBackwardButton(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigBackwardButton")){
			click(backwardButton);
		}
	}
	public void clickOnSaveButton(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity){
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
		}
	}
	public void clickOnOpenButton(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity) throws InterruptedException{
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigOpenButton")){
			switchToFrame("display");
			click(openButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Transport Details' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Transport Details' Details");
			}
		}
	}
	public void clickOnOpenButton1(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity) throws InterruptedException{
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigOpenButton")){
			switchToFrame("display");
			click(openButton1);
			try{
				//Thread.sleep(3000);
				switchToWindow("'Commodity Details' Details");	//Error Window
			}  
			catch (Exception e){
				switchToWindow("'Commodity Details' Details");
			}
		}
	}
	public void fillTransportDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity) throws InterruptedException{
		clickOnOpenButton(polInsIntAttTransCommEntity);
		Thread.sleep(3000);
		if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigfromPlace")) {
				clearAndSendKeys(fromPlaceTextArea, polInsIntAttTransCommEntity.getStringValueForField("fromPlace"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtoPlace")) {
				clearAndSendKeys(toPlaceTextArea, polInsIntAttTransCommEntity.getStringValueForField("toPlace"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSavebuttonME")){
				Thread.sleep(3000);
				click(savebutton);	
				click(closebutton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}
	public void fillCommodityDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity) throws InterruptedException{
		clickOnOpenButton1(polInsIntAttTransCommEntity);
		Thread.sleep(3000);
		if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addbutton);
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigcommodityDescription")) {
				clearAndSendKeys(commodityDescriptionTextArea, polInsIntAttTransCommEntity.getStringValueForField("commodityDescription"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigpackagingDescription")) {
				clearAndSendKeys(packagingDescriptionTextArea, polInsIntAttTransCommEntity.getStringValueForField("packagingDescription"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigcommoditySumInsured")) {
				clearAndSendKeys(commoditySumInsuredTextField, polInsIntAttTransCommEntity.getStringValueForField("commoditySumInsured"));
			}
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigcommodityRate")) {
				clearAndSendKeys(commodityRateTextField, polInsIntAttTransCommEntity.getStringValueForField("commodityRate"));
			}
			if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSavebuttonME")){
				Thread.sleep(3000);
				click(savebutton);
				click(closebutton);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		}
	}

	public void verifyTransportDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity , CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(polInsIntAttTransCommEntity);
		Thread.sleep(3000);
		if(polInsIntAttTransCommEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigfromPlace")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("fromPlace"), fetchValueFromTextFields(fromPlaceTextArea), AssertionType.WARNING);
			}

			if(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigtoPlace")) {
				assertReference.assertEquals(polInsIntAttTransCommEntity.getStringValueForField("toPlace"), fetchValueFromTextFields(toPlaceTextArea), AssertionType.WARNING);
			}

		}
		if (polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSavebuttonME")){
			Thread.sleep(3000);
			click(savebutton);	
			click(closebutton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolicyInsuredIntrestAttributeTransportCommodityDetails(PolInsIntAttTransCommEntity polInsIntAttTransCommEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttTransCommEntity.getConfigExecute())){

			if(!(polInsIntAttTransCommEntity.getBooleanValueForField("ConfigSkipFrame"))){
				switchToFrame("display");
			}
			fillPolicyInsuredIntrestAttributeTransportCommodityDetails(polInsIntAttTransCommEntity,assertReference);	
			clickOnForwardButton(polInsIntAttTransCommEntity);
			clickOnSaveButton(polInsIntAttTransCommEntity);
			navigateToPolicy(polInsIntAttTransCommEntity);
			navigateToAttribute(polInsIntAttTransCommEntity);
			navigateToInsuredInterest(polInsIntAttTransCommEntity);
			navigateToCoverage(polInsIntAttTransCommEntity);
			navigateToLoan(polInsIntAttTransCommEntity);
			navigateToClientDetails(polInsIntAttTransCommEntity);
			navigateToRelation(polInsIntAttTransCommEntity);
			navigateToPayment(polInsIntAttTransCommEntity);
			navigateToFollowup(polInsIntAttTransCommEntity);
			navigateToDocument(polInsIntAttTransCommEntity);
			navigateToInsuredInterestDetails(polInsIntAttTransCommEntity);
			navigateToInsuredInterestAttributes(polInsIntAttTransCommEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttTransCommEntity);
			navigateToInsuredInterestRelations(polInsIntAttTransCommEntity);
			navigateToInsuredInterestPayments(polInsIntAttTransCommEntity);
		}
	}

}
