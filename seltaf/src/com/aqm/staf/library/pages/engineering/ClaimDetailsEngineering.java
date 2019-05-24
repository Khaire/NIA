package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimDetailsEngEntity;

public class ClaimDetailsEngineering extends BasePage {

	private PageElement clamDetailsMachineTitle;
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

	//Mayur_product name=ER		
	private PageElement estimatedDamageImportAmountTextField;
	private PageElement estimateOfDamageIndigeneousAmountTextField;
	private PageElement estimatedOfDamageCivilAmountTextField;
	private PageElement totalEstimatedAmountOfLossTextField;
	private PageElement applicableExcessDropDown;
	private PageElement descriptionOfDamageImportTextArea;
	private PageElement specialFeaturesOfClaimIfAnyTextArea;
	//Mayur_product name=CR
	private PageElement descriptionOfTheCauseOfLossDamageTextArea;
	private PageElement estimatedOfDamageAddOnAmountTextField; 
	private PageElement estimatedOfDamageTPLAmountTextField;
	//Mayur_product name=ALOP
	private PageElement policyNoCertificateNo1TextField;
	private PageElement sumInsured1TextField;
	private PageElement marineCargoClaimNo1TextField; 
	private PageElement marineCargoPolicyNoCertificateNo1TextField; 
	private PageElement natureOfLoss1TextArea;
	private PageElement causeOfLoss1TextArea;
	private PageElement dateOfLoss1TextField;
	private PageElement comments1TextArea;
	private PageElement dateOfIntimation1TextField;
	private PageElement timeOfLoss1TextField;
	private PageElement policyNoCertificateNo2TextField; 
	private PageElement sumInsured2TextField;
	private PageElement marineCargoClaimNo2TextField; 
	private PageElement marineCargoPolicyNoCertificateNo2TextField; 
	private PageElement natureOfLoss2TextArea;
	private PageElement causeOfLoss2TextArea;
	private PageElement dateOfLoss2TextField;
	private PageElement comments2TextArea;
	private PageElement dateOfIntimation2TextField;
	private PageElement timeOfLoss2TextField;
	//Mayur_product name=DS
	private PageElement excessApplicableDSDropDown;
	//Mayur_product name=WP
	private PageElement excessApplicableWPDropDown;

	//EF-Yogesh
	private PageElement descriptionOfTheItemDamagedTextArea; 
	private PageElement otherDetailsAsInThePolicyScheduleTextArea;
	private PageElement estimatedAmountOfLossTextField;
	private PageElement catastropheCodeTextField;
	private PageElement catastropheDescriptionTextArea;
	private PageElement specialFeaturesOfClaimTextArea;
	private PageElement excessApplicableEiDropDown;
	private PageElement insuredNameTextField;
	private PageElement whetherThePolicyIs64VBCompliantDropDown;
	//MB-Yogesh
	private PageElement excessApplicableEngDropDown;
	//CF-Yogesh
	private PageElement excessApplicableCPMDropDown;
	//EC-Yogesh
	private PageElement excessApplicableECDropDown;
	//ET-Yogesh
	private PageElement sIForPropertyDamageTextField;
	private PageElement sIForBusinessInterruptionTextField;
	private PageElement indemnityPeriodMonthsDropDown;
	private PageElement claimAssessedAmountTextField;
	private PageElement salvageAmountTextField;
	private PageElement depreciationAmountTextField;
	private PageElement underInsuranceAmountTextField;
	private PageElement totalDeductibleAmountTextField;
	private PageElement totalRecoveredAmountTextField;
	private PageElement riskImprovementMeasurersSuggestedTextArea;
	private PageElement claimProcessedAmountTextField;
	//LE-Yogesh
	private PageElement sIForSectionIPropertyDamageTextField;
	private PageElement totalInterruptionPeriodInDaysTextField;
	private PageElement timeDeductibleInDaysTextField;
	private PageElement minimumDeductibleAmountSectionITextField;
	//LW-Yogesh
	private PageElement indemnityPeriodInMonthsTextField;
	private PageElement timeExcessInDaysTextField;
	private PageElement calculatedExcessEngTextField;
	//ME-Priyanka
	private PageElement consigneeNameTextArea;
	private PageElement consigneeAddressTextArea;
	private PageElement saveButton;
	private PageElement typeOfTheBillTextField;
	private PageElement billNumberTextArea;
	private PageElement invoiceNumberTextField;
	private PageElement markNumberTextArea;



	public ClaimDetailsEngineering(WebDriver driver, String pageName,int rowCounts) {
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
		//Mayur_product name=ER
		estimatedDamageImportAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Estimated Damage (Import) Amount ')]/following::input"), "Estimated Damage (Import) Amount  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimateOfDamageIndigeneousAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Estimate of Damage (Indigeneous) Amount ')]/following::input"), "Estimate of Damage (Indigeneous) Amount  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedOfDamageCivilAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Estimated of Damage (Civil) Amount ')]/following::input"), "Estimated of Damage (Civil) Amount  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalEstimatedAmountOfLossTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Estimated Amount of Loss ')]/following::input"), "Total Estimated Amount of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableExcessDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Applicable Excess')]/following::select"), "Applicable Excess DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfDamageImportTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Damage(Import, Indigenous, Civil, Add-On covers, TPL)')]/following::textarea"), "Insured Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialFeaturesOfClaimIfAnyTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Damage(Import, Indigenous, Civil, Add-On covers, TPL)')]/following::textarea"), "Description of Damage(Import, Indigenous, Civil, Add-On covers, TPL) Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfTheCauseOfLossDamageTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of the Cause of Loss/ Damage')]/following::textarea"), "Description of the Cause of Loss/ Damage Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_product name=CR
		estimatedOfDamageAddOnAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Estimated of Damage (Add-On) Amount')]/following::input"), "Estimated of Damage (Add-On) Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estimatedOfDamageTPLAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Estimated of Damage (TPL) Amount')]/following::input"), "Estimated of Damage (TPL) Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_product name=ALOP
		policyNoCertificateNo1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 1 ')]/following::input"), "Policy No./Certificate No. 1  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsured1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured1 ')]/following::input"), "Sum Insured1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoClaimNo1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.1 ')]/following::input"), "Marine Cargo Claim No.1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoPolicyNoCertificateNo1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 1 ')]/following::input"), "Marine Cargo Policy No./Certificate No. 1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfLoss1TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss1 ')]/following::textarea"), "Nature of Loss1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLoss1TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss1 ')]/following::textarea"), "Cause of Loss1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLoss1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss1 ')]/following::input"), "Cause of Loss1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		comments1TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Comments1 ')]/following::textarea"), "Comments1 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIntimation1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation1')]/following::input"), "Date of Intimation1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeOfLoss1TextField= new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss1 ')]/following::input"), "Time of Loss1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoCertificateNo2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 2')]/following::input"), "Policy No./Certificate No. 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsured2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured2 ')]/following::input"), "Sum Insured2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoClaimNo2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.2 ')]/following::input"), "Marine Cargo Claim No.2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoPolicyNoCertificateNo2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 2')]/following::input"), "Marine Cargo Policy No./Certificate No. 2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfLoss2TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss2 ')]/following::textarea"), "Nature of Loss2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLoss2TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss2 ')]/following::textarea"), "Cause of Loss2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLoss2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss2 ')]/following::input"), "Date of Loss2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		comments2TextArea= new PageElement(By.xpath("//td//div[contains(text(),'Comments2 ')]/following::textarea"), "Comments2 TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIntimation2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation2')]/following::input"), "Date of Intimation2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeOfLoss2TextField= new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss2 ')]/following::input"), "Time of Loss2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_product name=DS
		excessApplicableDSDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable(DS)')]/following::select"), "Excess Applicable(DS) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//Mayur_product name=WP
		excessApplicableWPDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable(WP)')]/following::select"), "Excess Applicable(WP) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialFeaturesOfClaimTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Special features of Claim')]/following::textarea"), "Special features of Claim Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfTheItemDamagedTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of the Item Damaged')]/following::textarea"), "Description of the Item Damaged Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsAsInThePolicyScheduleTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Other Details as in the Policy Schedule')]/following::textarea"), "Other Details as in the Policy Schedule Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessApplicableEiDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable(EI)')]/following::select"), "Excess Applicable(EI) Textarea", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estimatedOfDamageCivilAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Estimated of Damage (Civil) Amount ')]/following::input"), "Estimated of Damage (Civil) Amount  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalEstimatedAmountOfLossTextField= new PageElement(By.xpath("//td//div[contains(text(),'Total Estimated Amount of Loss ')]/following::input"), "Total Estimated Amount of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicableExcessDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Applicable Excess')]/following::select"), "Applicable Excess DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		descriptionOfDamageImportTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Damage(Import, Indigenous, Civil, Add-On covers, TPL)')]/following::textarea"), "Insured Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialFeaturesOfClaimIfAnyTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of Damage(Import, Indigenous, Civil, Add-On covers, TPL)')]/following::textarea"), "Description of Damage(Import, Indigenous, Civil, Add-On covers, TPL) Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionOfTheCauseOfLossDamageTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of the Cause of Loss/ Damage')]/following::textarea"), "Description of the Cause of Loss/ Damage Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Mayur_product name=CR

		//EF
		descriptionOfTheItemDamagedTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of the Item Damaged')]/following::textarea"), "Description of the Item Damaged TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherDetailsAsInThePolicyScheduleTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Other Details as in the Policy Schedule')]/following::textarea"), "Other Details as in the Policy Schedule TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*descriptionOfTheItemDamagedTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Description of the Item Damaged')]/following::textarea"), "Description of the Item Damaged TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
 	     otherDetailsAsInThePolicyScheduleTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Other Details as in the Policy Schedule')]/following::textarea"), "Other Details as in the Policy Schedule TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);*/
		whetherThePolicyIs64VBCompliantDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Whether the policy is 64 VB compliant')]/following::select"), "Whether the policy is 64 VB compliant Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		excessApplicableCPMDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable(CPM)')]/following::select"), "Excess Applicable(WP) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//ME-Priyanka
		consigneeNameTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Consignee Name')]/following::textarea"),"Consignee Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeAddressTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Consignee Address')]/following::textarea"), "Consignee Address TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfTheBillTextField= new PageElement(By.xpath("//td//div[contains(text(),'Type of the Bill')]/following::input"), "Type of the Bill TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billNumberTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invoiceNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Invoice Number')]/following::input"), "Invoice Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		markNumberTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	//MB
		excessApplicableEngDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable(Eng)')]/following::select"), "Excess Applicable(Eng) DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	    
		estimatedAmountOfLossTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estimated Amount of Loss')]/following::input"), "Estimated Amount of Loss  Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		catastropheCodeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Catastrophe Code')]/following::input"), "Other Details as in the Policy Schedule Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		catastropheDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Catastrophe Description')]/following::textarea"), "Other Details as in the Policy Schedule Textarea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	
	}

	public void fillClaimDetailsEngineering(ClaimDetailsEngEntity claimDetailsEngEntity, CustomAssert assertReference) throws InterruptedException{

		if(claimDetailsEngEntity.getAction().equalsIgnoreCase("add") || claimDetailsEngEntity.getAction().equalsIgnoreCase("edit")){
			//Mayur_product name=ER
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedDamageImportAmount")) {
				clearAndSendKeys(estimatedDamageImportAmountTextField, claimDetailsEngEntity.getStringValueForField("EstimatedDamageImportAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimateOfDamageIndigeneousAmount")) {
				clearAndSendKeys(estimateOfDamageIndigeneousAmountTextField, claimDetailsEngEntity.getStringValueForField("EstimateOfDamageIndigeneousAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedOfDamageCivilAmount")) {
				clearAndSendKeys(estimatedOfDamageCivilAmountTextField, claimDetailsEngEntity.getStringValueForField("EstimatedOfDamageCivilAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalEstimatedAmountOfLoss")) {
				clearAndSendKeys(totalEstimatedAmountOfLossTextField, claimDetailsEngEntity.getStringValueForField("TotalEstimatedAmountOfLoss"));
			}
			if(claimDetailsEngEntity.getBooleanValueForField("ConfigApplicableExcess")){
				selectValueFromList(applicableExcessDropDown,claimDetailsEngEntity.getStringValueForField("ApplicableExcess"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDescriptionOfDamageImport")) {
				clearAndSendKeys(descriptionOfDamageImportTextArea, claimDetailsEngEntity.getStringValueForField("DescriptionOfDamageImport"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaimIfAny")) {
				clearAndSendKeys(specialFeaturesOfClaimIfAnyTextArea, claimDetailsEngEntity.getStringValueForField("SpecialFeaturesOfClaimIfAny"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDescriptionOfTheCauseOfLossDamage")) {
				clearAndSendKeys(descriptionOfTheCauseOfLossDamageTextArea, claimDetailsEngEntity.getStringValueForField("DescriptionOfTheCauseOfLossDamage"));
			}
			//Mayur_product name=CR
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedOfDamageAddOnAmount")) {
				clearAndSendKeys(estimatedOfDamageAddOnAmountTextField, claimDetailsEngEntity.getStringValueForField("EstimatedOfDamageAddOnAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedOfDamageTPLAmount")) {
				clearAndSendKeys(estimatedOfDamageTPLAmountTextField, claimDetailsEngEntity.getStringValueForField("EstimatedOfDamageTPLAmount"));
			}
			//Mayur_product name=ALOP
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo1")) {
				clearAndSendKeys(policyNoCertificateNo1TextField, claimDetailsEngEntity.getStringValueForField("PolicyNoCertificateNo1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSumInsured1")) {
				clearAndSendKeys(sumInsured1TextField, claimDetailsEngEntity.getStringValueForField("SumInsured1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo1")) {
				clearAndSendKeys(marineCargoClaimNo1TextField, claimDetailsEngEntity.getStringValueForField("MarineCargoClaimNo1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo1")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNo1TextField, claimDetailsEngEntity.getStringValueForField("MarineCargoPolicyNoCertificateNo1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigNatureOfLoss1")) {
				clearAndSendKeys(natureOfLoss1TextArea, claimDetailsEngEntity.getStringValueForField("NatureOfLoss1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCauseOfLoss1")) {
				clearAndSendKeys(causeOfLoss1TextArea, claimDetailsEngEntity.getStringValueForField("CauseOfLoss1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfLoss1")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimDetailsEngEntity.getStringValueForField("DateOfLoss1"));
				clearAndEnterDate(dateOfLoss1TextField, dateofIntimation);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigComments1")) {
				clearAndSendKeys(comments1TextArea, claimDetailsEngEntity.getStringValueForField("Comments1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfIntimation1")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimDetailsEngEntity.getStringValueForField("DateOfIntimation1"));
				clearAndEnterDate(dateOfIntimation1TextField, dateofIntimation);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeOfLoss1")) {
				clearAndSendKeys(timeOfLoss1TextField, claimDetailsEngEntity.getStringValueForField("TimeOfLoss1"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo2")) {
				clearAndSendKeys(policyNoCertificateNo2TextField, claimDetailsEngEntity.getStringValueForField("PolicyNoCertificateNo2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSumInsured2")) {
				clearAndSendKeys(sumInsured2TextField, claimDetailsEngEntity.getStringValueForField("SumInsured2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo2")) {
				clearAndSendKeys(marineCargoClaimNo2TextField, claimDetailsEngEntity.getStringValueForField("MarineCargoClaimNo2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo2")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNo2TextField, claimDetailsEngEntity.getStringValueForField("MarineCargoPolicyNoCertificateNo2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigNatureOfLoss2")) {
				clearAndSendKeys(natureOfLoss2TextArea, claimDetailsEngEntity.getStringValueForField("NatureOfLoss2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCauseOfLoss2")) {
				clearAndSendKeys(causeOfLoss2TextArea, claimDetailsEngEntity.getStringValueForField("CauseOfLoss2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfLoss2")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimDetailsEngEntity.getStringValueForField("DateOfLoss2"));
				clearAndEnterDate(dateOfLoss2TextField, dateofIntimation);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigComments2")) {
				clearAndSendKeys(comments2TextArea, claimDetailsEngEntity.getStringValueForField("Comments2"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfIntimation2")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimDetailsEngEntity.getStringValueForField("DateOfIntimation2"));
				clearAndEnterDate(dateOfIntimation2TextField, dateofIntimation);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeOfLoss2")) {
				clearAndSendKeys(timeOfLoss2TextField, claimDetailsEngEntity.getStringValueForField("TimeOfLoss2"));
			}
			//Mayur_product name=DS
			if(claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableDS")){
				selectValueFromList(excessApplicableDSDropDown,claimDetailsEngEntity.getStringValueForField("ExcessApplicableDS"));
			}
			//Mayur_product name=WP
			if(claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableWP")){
				selectValueFromList(excessApplicableWPDropDown,claimDetailsEngEntity.getStringValueForField("ExcessApplicableWP"));
			}
			//EF-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDescriptionOfTheItemDamaged")) {
				clearAndSendKeys(descriptionOfTheItemDamagedTextArea, claimDetailsEngEntity.getStringValueForField("DescriptionOfTheItemDamaged"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigOtherDetailsAsInThePolicySchedule")) {
				clearAndSendKeys(otherDetailsAsInThePolicyScheduleTextArea, claimDetailsEngEntity.getStringValueForField("OtherDetailsAsInThePolicySchedule"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedAmountOfLoss")) {
				clearAndSendKeys(estimatedAmountOfLossTextField, claimDetailsEngEntity.getStringValueForField("EstimatedAmountOfLoss"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCatastropheCode")) {
				clearAndSendKeys(catastropheCodeTextField, claimDetailsEngEntity.getStringValueForField("CatastropheCode"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCatastropheDescription")) {
				clearAndSendKeys(catastropheDescriptionTextArea, claimDetailsEngEntity.getStringValueForField("CatastropheDescription"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaim")) {
				clearAndSendKeys(specialFeaturesOfClaimTextArea, claimDetailsEngEntity.getStringValueForField("SpecialFeaturesOfClaim"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableEi")) {
				selectValueFromList(excessApplicableEiDropDown,claimDetailsEngEntity.getStringValueForField("ExcessApplicableEi"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredName")) {
				clearAndSendKeys(insuredNameTextField, claimDetailsEngEntity.getStringValueForField("InsuredName"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				selectValueFromList(whetherThePolicyIs64VBCompliantDropDown,claimDetailsEngEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"));
			}
			//MB Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableEng")) {
				selectValueFromList(excessApplicableEngDropDown,claimDetailsEngEntity.getStringValueForField("ExcessApplicableEng"));
			}
			//CF-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableCPM")) {
				selectValueFromList(excessApplicableCPMDropDown,claimDetailsEngEntity.getStringValueForField("ExcessApplicableCPM"));
			}
			//EC-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableEC")) {
				selectValueFromList(excessApplicableECDropDown,claimDetailsEngEntity.getStringValueForField("ExcessApplicableEC"));
			}
			//ET-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSIForPropertyDamage")) {
				clearAndSendKeys(sIForPropertyDamageTextField, claimDetailsEngEntity.getStringValueForField("SIForPropertyDamage"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSIForBusinessInterruption")) {
				clearAndSendKeys(sIForBusinessInterruptionTextField, claimDetailsEngEntity.getStringValueForField("SIForBusinessInterruption"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigIndemnityPeriodMonths")) {
				selectValueFromList(indemnityPeriodMonthsDropDown,claimDetailsEngEntity.getStringValueForField("IndemnityPeriodMonths"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimAssessedAmount")) {
				clearAndSendKeys(claimAssessedAmountTextField, claimDetailsEngEntity.getStringValueForField("ClaimAssessedAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				clearAndSendKeys(salvageAmountTextField, claimDetailsEngEntity.getStringValueForField("SalvageAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDepreciationAmount")) {
				clearAndSendKeys(depreciationAmountTextField, claimDetailsEngEntity.getStringValueForField("DepreciationAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				clearAndSendKeys(underInsuranceAmountTextField, claimDetailsEngEntity.getStringValueForField("UnderInsuranceAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				clearAndSendKeys(totalDeductibleAmountTextField, claimDetailsEngEntity.getStringValueForField("TotalDeductibleAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalRecoveredAmount")) {
				clearAndSendKeys(totalRecoveredAmountTextField, claimDetailsEngEntity.getStringValueForField("TotalRecoveredAmount"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigRiskImprovementMeasurersSuggested")) {
				clearAndSendKeys(riskImprovementMeasurersSuggestedTextArea, claimDetailsEngEntity.getStringValueForField("RiskImprovementMeasurersSuggested"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimProcessedAmount")) {
				clearAndSendKeys(claimProcessedAmountTextField, claimDetailsEngEntity.getStringValueForField("ClaimProcessedAmount"));
			}
			//LE-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSIForSectionIPropertyDamage")) {
				clearAndSendKeys(sIForSectionIPropertyDamageTextField, claimDetailsEngEntity.getStringValueForField("SIForSectionIPropertyDamage"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalInterruptionPeriodInDays")) {
				clearAndSendKeys(totalInterruptionPeriodInDaysTextField, claimDetailsEngEntity.getStringValueForField("TotalInterruptionPeriodInDays"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeDeductibleInDays")) {
				clearAndSendKeys(timeDeductibleInDaysTextField, claimDetailsEngEntity.getStringValueForField("TimeDeductibleInDays"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMinimumDeductibleAmountSectionI")) {
				clearAndSendKeys(minimumDeductibleAmountSectionITextField, claimDetailsEngEntity.getStringValueForField("MinimumDeductibleAmountSectionI"));
			}
			//LW-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCalculatedExcessEng")) {
				clearAndSendKeys(calculatedExcessEngTextField, claimDetailsEngEntity.getStringValueForField("CalculatedExcessEng"));
			}
			//ME-Priyanka
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigConsigneeName")) {
				clearAndSendKeys(consigneeNameTextArea, claimDetailsEngEntity.getStringValueForField("ConsigneeName"));
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
				clearAndSendKeys(consigneeAddressTextArea, claimDetailsEngEntity.getStringValueForField("ConsigneeAddress"));
			}
		}
		else if(claimDetailsEngEntity.getAction().equalsIgnoreCase("verify")){
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			//Mayur_product name=ER
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedDamageImportAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("EstimatedDamageImportAmount"),fetchValueFromTextFields(estimatedDamageImportAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimateOfDamageIndigeneousAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("EstimateOfDamageIndigeneousAmount"),fetchValueFromTextFields(estimateOfDamageIndigeneousAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedOfDamageCivilAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("EstimatedOfDamageCivilAmount"),fetchValueFromTextFields(estimatedOfDamageCivilAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalEstimatedAmountOfLoss")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TotalEstimatedAmountOfLoss"),fetchValueFromTextFields(totalEstimatedAmountOfLossTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigApplicableExcess")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ApplicableExcess"), fetchValueFromList(applicableExcessDropDown), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDescriptionOfDamageImport")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DescriptionOfDamageImport"),fetchValueFromTextFields(descriptionOfDamageImportTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaimIfAny")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SpecialFeaturesOfClaimIfAny"),fetchValueFromTextFields(specialFeaturesOfClaimIfAnyTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDescriptionOfTheCauseOfLossDamage")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DescriptionOfTheCauseOfLossDamage"),fetchValueFromTextFields(descriptionOfTheCauseOfLossDamageTextArea), AssertionType.WARNING);
			}
			//Mayur_product name=CR
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedOfDamageAddOnAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("EstimatedOfDamageAddOnAmount"),fetchValueFromTextFields(estimatedOfDamageAddOnAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedOfDamageTPLAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("EstimatedOfDamageTPLAmount"),fetchValueFromTextFields(estimatedOfDamageTPLAmountTextField), AssertionType.WARNING);
			}
			//Mayur_product name=ALOP
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("PolicyNoCertificateNo1"),fetchValueFromTextFields(policyNoCertificateNo1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSumInsured1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SumInsured1"),fetchValueFromTextFields(sumInsured1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("MarineCargoClaimNo1"),fetchValueFromTextFields(marineCargoClaimNo1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("marineCargoPolicyNoCertificateNo1"),fetchValueFromTextFields(marineCargoPolicyNoCertificateNo1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigNatureOfLoss1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("NatureOfLoss1"),fetchValueFromTextFields(natureOfLoss1TextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCauseOfLoss1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("CauseOfLoss1"),fetchValueFromTextFields(causeOfLoss1TextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfLoss1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DateOfLoss1"),fetchValueFromTextFields(dateOfLoss1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigComments1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("Comments1"),fetchValueFromTextFields(comments1TextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfIntimation1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DateOfIntimation1"),fetchValueFromTextFields(dateOfIntimation1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeOfLoss1")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TimeOfLoss1"),fetchValueFromTextFields(timeOfLoss1TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigPolicyNoCertificateNo2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("PolicyNoCertificateNo2"),fetchValueFromTextFields(policyNoCertificateNo2TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSumInsured2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SumInsured2"),fetchValueFromTextFields(sumInsured2TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoClaimNo2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("MarineCargoClaimNo2"),fetchValueFromTextFields(marineCargoClaimNo2TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNo2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("MarineCargoPolicyNoCertificateNo2"),fetchValueFromTextFields(marineCargoPolicyNoCertificateNo2TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigNatureOfLoss2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("NatureOfLoss2"),fetchValueFromTextFields(natureOfLoss2TextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCauseOfLoss2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("CauseOfLoss2"),fetchValueFromTextFields(causeOfLoss2TextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfLoss2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DateOfLoss2"),fetchValueFromTextFields(dateOfLoss2TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigComments2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("Comments2"),fetchValueFromTextFields(comments2TextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDateOfIntimation2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DateOfIntimation2"),fetchValueFromTextFields(dateOfIntimation2TextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeOfLoss2")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TimeOfLoss2"),fetchValueFromTextFields(timeOfLoss2TextField), AssertionType.WARNING);
			}
			//Mayur_product name=DS
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableDS")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ExcessApplicableDS"), fetchValueFromList(excessApplicableDSDropDown), AssertionType.WARNING);
			}
			//Mayur_product name=WP
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableWP")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ExcessApplicableWP"), fetchValueFromList(excessApplicableWPDropDown), AssertionType.WARNING);
			}
			//EF-yOGESH
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDescriptionOfTheItemDamaged")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DescriptionOfTheItemDamaged"), fetchValueFromTextFields(descriptionOfTheItemDamagedTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigOtherDetailsAsInThePolicySchedule")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("OtherDetailsAsInThePolicySchedule"), fetchValueFromTextFields(otherDetailsAsInThePolicyScheduleTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigEstimatedAmountOfLoss")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("EstimatedAmountOfLoss"), fetchValueFromTextFields(estimatedAmountOfLossTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCatastropheCode")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("CatastropheCode"), fetchValueFromTextFields(catastropheCodeTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCatastropheDescription")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("CatastropheDescription"), fetchValueFromTextFields(catastropheDescriptionTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSpecialFeaturesOfClaim")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SpecialFeaturesOfClaim"), fetchValueFromTextFields(specialFeaturesOfClaimTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableEi")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ExcessApplicableEi"), fetchValueFromList(excessApplicableEiDropDown), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredName")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("InsuredName"), fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigWhetherThePolicyIs64VBCompliant")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("WhetherThePolicyIs64VBCompliant"), fetchValueFromList(whetherThePolicyIs64VBCompliantDropDown), AssertionType.WARNING);
			}
			//MB-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableEng")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ExcessApplicableEng"), fetchValueFromList(excessApplicableEngDropDown), AssertionType.WARNING);
			}
			//CF-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableCPM")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ExcessApplicableCPM"), fetchValueFromList(excessApplicableCPMDropDown), AssertionType.WARNING);
			}
			//EC-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigExcessApplicableEC")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ExcessApplicableEC"), fetchValueFromList(excessApplicableECDropDown), AssertionType.WARNING);
			}
			//ET-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSIForPropertyDamage")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SIForPropertyDamage"), fetchValueFromTextFields(sIForPropertyDamageTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSIForBusinessInterruption")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SIForBusinessInterruption"), fetchValueFromTextFields(sIForBusinessInterruptionTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigIndemnityPeriodMonths")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("IndemnityPeriodMonths"), fetchValueFromList(indemnityPeriodMonthsDropDown), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimAssessedAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ClaimAssessedAmount"), fetchValueFromTextFields(claimAssessedAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSalvageAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SalvageAmount"), fetchValueFromTextFields(salvageAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigDepreciationAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("DepreciationAmount"), fetchValueFromTextFields(depreciationAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("UnderInsuranceAmount"), fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalDeductibleAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TotalDeductibleAmount"), fetchValueFromTextFields(totalDeductibleAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalRecoveredAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TotalRecoveredAmount"), fetchValueFromTextFields(totalRecoveredAmountTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigRiskImprovementMeasurersSuggested")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("RiskImprovementMeasurersSuggested"), fetchValueFromTextFields(riskImprovementMeasurersSuggestedTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimProcessedAmount")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ClaimProcessedAmount"), fetchValueFromTextFields(claimProcessedAmountTextField), AssertionType.WARNING);
			}
			//LE-yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigSIForSectionIPropertyDamage")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("SIForSectionIPropertyDamage"), fetchValueFromTextFields(sIForSectionIPropertyDamageTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTotalInterruptionPeriodInDays")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TotalInterruptionPeriodInDays"), fetchValueFromTextFields(totalInterruptionPeriodInDaysTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeDeductibleInDays")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TimeDeductibleInDays"), fetchValueFromTextFields(timeDeductibleInDaysTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMinimumDeductibleAmountSectionI")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("MinimumDeductibleAmountSectionI"), fetchValueFromTextFields(minimumDeductibleAmountSectionITextField), AssertionType.WARNING);
			}
			//LW-Yogesh
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("IndemnityPeriodInMonths"), fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTimeExcessInDays")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TimeExcessInDays"), fetchValueFromTextFields(timeExcessInDaysTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigCalculatedExcessEng")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("CalculatedExcessEng"), fetchValueFromTextFields(calculatedExcessEngTextField), AssertionType.WARNING);
			}
			//ME-Priyanka
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigConsigneeName")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ConsigneeName"), fetchValueFromTextFields(consigneeNameTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("ConsigneeAddress"), fetchValueFromTextFields(consigneeAddressTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigTypeOfTheBill")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("TypeOfTheBill"), fetchValueFromTextFields(typeOfTheBillTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigBillNumber")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("BillNumber"), fetchValueFromTextFields(billNumberTextArea), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("InvoiceNumber"), fetchValueFromTextFields(invoiceNumberTextField), AssertionType.WARNING);
			}
			if (claimDetailsEngEntity.getBooleanValueForField("ConfigMarkNumber")) {
				assertReference.assertEquals(claimDetailsEngEntity.getStringValueForField("MarkNumber"), fetchValueFromTextFields(markNumberTextArea), AssertionType.WARNING);
			}
		}
	}

	public void navigateToMainAttributePage(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			clamDetailsMachineTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimDetailsEngEntity.getStringValueForField("ClamDetailsMachineTitle")+"')]"), " Clam Details-Machine ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(clamDetailsMachineTitle);
			/*clamDetailsMachineTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimDetailsEngEntity.getStringValueForField("ClamDetailsMachineTitle")+"')]"), " Clam Details-Machine ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(clamDetailsMachineTitle);*/
		}
	}
	public void clickOnSaveButton(ClaimDetailsEngEntity claimDetailsEngEntity){
		if (claimDetailsEngEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
			clamDetailsMachineTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimDetailsEngEntity.getStringValueForField("ClamDetailsMachineTitle")+"')]"), " Clam Details-Machine ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(clamDetailsMachineTitle);
		}
	}
	public void fillandSubmitClaimDetailsEngineering(ClaimDetailsEngEntity claimDetailsEngEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimDetailsEngEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimDetailsEngineering(claimDetailsEngEntity, assertReference);
			navigateToMainAttributePage(claimDetailsEngEntity);
			navigateToclaimHomePage(claimDetailsEngEntity);
			navigateToInsuredItem(claimDetailsEngEntity);
			navigateToDocument(claimDetailsEngEntity);
			navigateToParties(claimDetailsEngEntity);
			navigateToReserve(claimDetailsEngEntity);
			navigateToPayment(claimDetailsEngEntity);
			navigateToAttribute(claimDetailsEngEntity);
			navigateToInsuredItemDetails(claimDetailsEngEntity);
			navigateTInsuredItemAttribute(claimDetailsEngEntity);
			clickOnForwardButton(claimDetailsEngEntity);
			clickOnSaveButton(claimDetailsEngEntity);
		}
	}
}

