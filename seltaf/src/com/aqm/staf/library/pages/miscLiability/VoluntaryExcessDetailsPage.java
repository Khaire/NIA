package com.aqm.staf.library.pages.miscLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.PreviousPolicyHistoryEntity;
import com.aqm.staf.library.databin.VoluntaryExcessDetailsEntity;

public class VoluntaryExcessDetailsPage extends BasePage{

	private PageElement voluntaryExcessDetailsPageTitle;	
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

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	

	private PageElement consignmentNotesTextArea;	
	private PageElement packingWeightOfGoodsTextField;
	private PageElement satatutoryLegislationWaiverTextArea;
	private PageElement optionForVoluntaryExcessDropdown;
	private PageElement voluntaryExcessTextField;
	private PageElement discountInPercentForVoluntaryExcessTextField;
	private PageElement forwardButton;
	private PageElement saveButton;
	
	private PageElement doYouWantToAttachOtherextensionsDropDown;;
	private PageElement listOfExtensionsDropDown;
	private PageElement subLimitOfOtherExtensionsTextField;
	private PageElement optionsForOtherextensionsDropDown;
	private PageElement premiumRateTextField;
	private PageElement excessTextField;
	private PageElement loadingForAdverseFeatureTextField;
	private PageElement specialConditionsWarrantiesTextArea;
	private PageElement specialConditionsOneTextArea;
	private PageElement specialConditionsTwoTextArea;
	
	private PageElement	deductibleTextField;
	private PageElement	loadingOnAOYTextField;
	private PageElement	compulsoryExcessTextField;
	private PageElement	loadingforAdversefeatureTextField;
	private PageElement	specialConditionsOneTextField;
	private PageElement	SpecialConditionsTwoTextField;
	private PageElement	discountPercentage;
	private PageElement	loadingPercentage;


	public VoluntaryExcessDetailsPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		consignmentNotesTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Consignment notes","textarea")), "Consignment notes TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		packingWeightOfGoodsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Packing Weight of goods","input")), "Packing Weight of goods TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		satatutoryLegislationWaiverTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Statutory Legislation Waiver","textarea")), "Statutory Legislation Waiver TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionForVoluntaryExcessDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Option for Voluntary Excess","select")), "Option for Voluntary Excess DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		voluntaryExcessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Voluntary Excess","input")), "Voluntary Excess TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		discountInPercentForVoluntaryExcessTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount(%) for Voluntary Excess","input")), "Discount(%) for Voluntary Excess TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		doYouWantToAttachOtherextensionsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you want to attach Other extensions?')]/following::select"), "Do you want to attach Other extensions? Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		listOfExtensionsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'List of Extensions')]/following::select"), "List of Extensions Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		subLimitOfOtherExtensionsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sub Limit of Other extensions')]/following::input"), "Sub Limit of Other extensions Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		optionsForOtherextensionsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Options for Other extensions')]/following::select"), "Options for Other extensions Drop Down", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		premiumRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium rate (%)')]/following::input"), "Premium rate (%) Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		excessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess')]/following::input"), "Excess Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingForAdverseFeatureTextField=new PageElement(By.xpath("//td//div[contains(text(),'Loading (%) for Adverse feature')]/following::input"), "Loading (%) for Adverse feature Text Field", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsWarrantiesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special conditions/warranties')]/following::TextArea"), "Special conditions/warranties Text Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsOneTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions1')]/following::TextArea"), "Special Conditions1 Text Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsTwoTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions2')]/following::TextArea"), "Special Conditions2 Text Area", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		deductibleTextField 		= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Deductible","TextArea")), "Deductible TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingOnAOYTextField		= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading On AOY","input")), "Loading On AOY TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		compulsoryExcessTextField	= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Compulsory Excess","input")), "Compulsory Excess TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingforAdversefeatureTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%) for Adverse feature","input")), "Loading (%) for Adverse feature",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		specialConditionsOneTextField	= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions1","textarea")), "Special Conditions1 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		SpecialConditionsTwoTextField	= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions2","textarea")), "Special Conditions2 TextArea",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		

		//PF
		discountPercentage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount (%)","input")), "Discount (%)TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		loadingPercentage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Loading (%)","input")), "Loading (%)TextField",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
			
	}

	//Services
	public void fillVoluntaryExcessDetailsPage(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity, CustomAssert assertReference) throws InterruptedException{
		if(voluntaryExcessDetailsPageEntity.getAction().equalsIgnoreCase("add") || voluntaryExcessDetailsPageEntity.getAction().equalsIgnoreCase("edit")){

			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigConsignmentNotes")) {
				clearAndSendKeys(consignmentNotesTextArea, voluntaryExcessDetailsPageEntity.getStringValueForField("ConsignmentNotes"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigPackingWeightOfGoods")) {
				clearAndSendKeys(packingWeightOfGoodsTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("PackingWeightOfGoods"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigStatutoryLegislationWaiver")) {
				clearAndSendKeys(satatutoryLegislationWaiverTextArea, voluntaryExcessDetailsPageEntity.getStringValueForField("StatutoryLegislationWaiver"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				selectValueFromList(optionForVoluntaryExcessDropdown, voluntaryExcessDetailsPageEntity.getStringValueForField("OptionForVoluntaryExcess"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				clearAndSendKeys(voluntaryExcessTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("VoluntaryExcess"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDiscountPercentForVoluntaryExcess")) {
				clearAndSendKeys(discountInPercentForVoluntaryExcessTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("DiscountPercentForVoluntaryExcess"));
			}
			//PD
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDeductible")) {
				clearAndSendKeys(deductibleTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("Deductible"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingOnAOY")) {
				clearAndSendKeys(loadingOnAOYTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingOnAOY"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				clearAndSendKeys(compulsoryExcessTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("CompulsoryExcess"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingforAdversefeature")) {
				clearAndSendKeys(loadingforAdversefeatureTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingforAdversefeature"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				clearAndSendKeys(specialConditionsOneTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("SpecialConditionsOne"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				clearAndSendKeys(SpecialConditionsTwoTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("SpecialConditionsTwo"));
			}
			
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSpecialConditionsWarranties")) {
				clearAndSendKeys(specialConditionsWarrantiesTextArea, voluntaryExcessDetailsPageEntity.getStringValueForField("SpecialConditionsWarranties"));
			}
			
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOtherExtensions")) {
				selectValueFromList(doYouWantToAttachOtherextensionsDropDown, voluntaryExcessDetailsPageEntity.getStringValueForField("DoYouWantToAttachOtherExtensions"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigListOfExtensions")) {
				selectValueFromList(listOfExtensionsDropDown, voluntaryExcessDetailsPageEntity.getStringValueForField("ListOfExtensions"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSubLimitOfOtherExtensions")) {
				clearAndSendKeys(subLimitOfOtherExtensionsTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("SubLimitOfOtherExtensions"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigOptionsForOtherExtensions")) {
				selectValueFromList(optionsForOtherextensionsDropDown, voluntaryExcessDetailsPageEntity.getStringValueForField("OptionsForOtherExtensions"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigPremiumRate")) {
				clearAndSendKeys(premiumRateTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("PremiumRate"));
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigExcess")) {
				clearAndSendKeys(excessTextField, voluntaryExcessDetailsPageEntity.getStringValueForField("Excess"));
			}
			//PF
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDiscountPercentage")) {
				clearAndSendKeys(discountPercentage, voluntaryExcessDetailsPageEntity.getStringValueForField("DiscountPercentage"));
			}
			
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingPercentage")) {
				clearAndSendKeys(loadingPercentage, voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingPercentage"));
			}
			
			
			
		}

		else if(voluntaryExcessDetailsPageEntity.getAction().equalsIgnoreCase("verify")){
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigConsignmentNotes")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("ConsignmentNotes"), fetchValueFromTextFields(consignmentNotesTextArea),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigPackingWeightOfGoods")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("PackingWeightOfGoods"), fetchValueFromTextFields(packingWeightOfGoodsTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigStatutoryLegislationWaiver")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("StatutoryLegislationWaiver"), fetchValueFromTextFields(satatutoryLegislationWaiverTextArea),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigOptionForVoluntaryExcess")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("OptionForVoluntaryExcess"), fetchValueFromList(optionForVoluntaryExcessDropdown),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigVoluntaryExcess")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("VoluntaryExcess"), fetchValueFromTextFields(voluntaryExcessTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDiscountPercentForVoluntaryExcess")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("DiscountPercentForVoluntaryExcess"), fetchValueFromTextFields(discountInPercentForVoluntaryExcessTextField),AssertionType.WARNING);
			}
			//PD
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDeductible")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("Deductible"), fetchValueFromTextFields(deductibleTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingOnAOY")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingOnAOY"), fetchValueFromTextFields(loadingOnAOYTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigCompulsoryExcess")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("CompulsoryExcess"), fetchValueFromTextFields(compulsoryExcessTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingforAdversefeature")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingforAdversefeature"), fetchValueFromTextFields(loadingforAdversefeatureTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSpecialConditionsOne")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("SpecialConditionsOne"), fetchValueFromTextFields(specialConditionsOneTextField),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSpecialConditionsTwo")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("SpecialConditionsTwo"), fetchValueFromTextFields(SpecialConditionsTwoTextField),AssertionType.WARNING);
			}
			//
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDoYouWantToAttachOtherExtensions")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("DoYouWantToAttachOtherExtensions"), fetchValueFromTextFields(doYouWantToAttachOtherextensionsDropDown),AssertionType.WARNING);
				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigListOfExtensions")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("ListOfExtensions"), fetchValueFromTextFields(listOfExtensionsDropDown),AssertionType.WARNING);
				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSubLimitOfOtherExtensions")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("SubLimitOfOtherExtensions"), fetchValueFromTextFields(subLimitOfOtherExtensionsTextField),AssertionType.WARNING);
				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigOptionsForOtherExtensions")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("OptionsForOtherExtensions"), fetchValueFromTextFields(optionsForOtherextensionsDropDown),AssertionType.WARNING);
				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateTextField),AssertionType.WARNING);
				

				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigExcess")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("Excess"), fetchValueFromTextFields(excessTextField),AssertionType.WARNING);
				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingForAdverseFeature")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingForAdverseFeature"), fetchValueFromTextFields(loadingForAdverseFeatureTextField),AssertionType.WARNING);
				
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSpecialConditionsWarranties")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("SpecialConditionsWarranties"), fetchValueFromTextFields(specialConditionsWarrantiesTextArea),AssertionType.WARNING);
				//assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("OptionForVoluntaryExcess"), fetchValueFromTextFields(optionForVoluntaryExcessDropdown),AssertionType.WARNING);
				
			}
			//PF
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDiscountPercentage")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("DiscountPercentage"), fetchValueFromTextFields(discountPercentage),AssertionType.WARNING);
			}
			if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoadingPercentage")) {
				assertReference.assertEquals(voluntaryExcessDetailsPageEntity.getStringValueForField("LoadingPercentage"), fetchValueFromTextFields(loadingPercentage),AssertionType.WARNING);
			}
			
		}
	}
	
	
	
	public void navigateToPolicy(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToInsuredInterest(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}

	}

	public void navigateToLoan(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//switchToFrame("display");
		}
	}

	public void navigateToClientDetails(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}

	}
	public void navigateToPayment(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity){
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	
	private void clickOnNextButton(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity) {
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigNextButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	
	private void clickOnSaveButton(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity) {
		if (voluntaryExcessDetailsPageEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	public void fillandSubmitVoluntaryExcessDetailsPage(VoluntaryExcessDetailsEntity voluntaryExcessDetailsPageEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(voluntaryExcessDetailsPageEntity.getConfigExecute())){
			switchToFrame("display");
			fillVoluntaryExcessDetailsPage(voluntaryExcessDetailsPageEntity, assertReference);
			clickOnNextButton(voluntaryExcessDetailsPageEntity);
			clickOnSaveButton(voluntaryExcessDetailsPageEntity);
			navigateToPolicy(voluntaryExcessDetailsPageEntity);
			navigateToAttribute(voluntaryExcessDetailsPageEntity);
			navigateToInsuredInterest(voluntaryExcessDetailsPageEntity);
			navigateToCoverage(voluntaryExcessDetailsPageEntity);
			navigateToLoan(voluntaryExcessDetailsPageEntity);
			navigateToClientDetails(voluntaryExcessDetailsPageEntity);
			navigateToRelation(voluntaryExcessDetailsPageEntity);
			navigateToPayment(voluntaryExcessDetailsPageEntity);
			navigateToFollowup(voluntaryExcessDetailsPageEntity);
			navigateToDocument(voluntaryExcessDetailsPageEntity);

		}
	}
}

