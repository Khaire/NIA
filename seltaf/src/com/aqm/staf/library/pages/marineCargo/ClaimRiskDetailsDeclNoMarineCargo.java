package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetDeclNoMCEntity;

public class ClaimRiskDetailsDeclNoMarineCargo extends BasePage {
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
	private PageElement claimRiskDtls2Title;

	private PageElement forwardButton;
	private PageElement backButton;
	//cc-Yogesh
	private PageElement cargoSumInsuredTextField;
	private PageElement dutyInsuranceValueTextField;
	//OP-Yogesh
	private PageElement commoditySumInsuredTextField;
	private PageElement certificateNumberFindButton;
	private PageElement certificateNoBeSelectedLink;
	private PageElement certificateNumberTextField;
	private PageElement typeOfBillForMarineDropDown;
	//digvijay marine sv
	private PageElement typeOfTheBillTextField;
	private PageElement billDateTextField;
	private PageElement invoiceNumberTextField;
	private PageElement fromPlaceTextField;
	private PageElement toPlaceTextField;
	private PageElement increasedValueSumInsuredTextField;
	private PageElement dutyValueTextField;
	//digvijay at
	private PageElement declarationNumberTextField;
	private PageElement declarationNumberFindButton;

	//DI-Rajkumar
	private PageElement billNumberTextArea;
	private PageElement markNumberTextArea;
	private PageElement consigneeNameTextArea;
	private PageElement consigneeAddressTextArea;
	private PageElement fromPlaceTextArea;
	private PageElement toPlaceTextArea;
	private PageElement commodityTypeDropDown;
	//AM-Rajkumar

	private PageElement policyNoCertificateNoOneTextField;
	private PageElement sumInsuredTextField;
	private PageElement marineCargoClaimNoOneTextField;
	private PageElement marineCargoPolicyNoCertificateNoOneTextField;
	private PageElement natureOfLossOneTextArea;
	private PageElement causeOfLossOneTextArea;
	private PageElement dateOfLossOneTextField;	
	private PageElement commentsOneTextArea;	
	private PageElement dateOfIntimationOneTextField;	
	private PageElement timeOfLossOneTextField;	
	private PageElement policyNoCertificateNoTwoTextField;	
	private PageElement sumInsuredTwoTextField;	
	private PageElement marineCargoClaimNoTwoTextField;	
	private PageElement marineCargoPolicyNoCertificateTwoTextField;	
	private PageElement natureOfLossTwoTextArea;
	private PageElement causeOfLossTwoTextArea;	
	private PageElement date0fLossTwoTextField;	
	private PageElement commentsTwoTextArea;	
	private PageElement dateOfIntimationTwoTextField;
	private PageElement timeOfLossTwoTextField;

	public ClaimRiskDetailsDeclNoMarineCargo(WebDriver driver, String pageName,int rowCounts) {
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

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 

		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//CC-Yogesh
		cargoSumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Cargo Sum Insured')]/following::input"), "Cargo Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dutyInsuranceValueTextField= new PageElement(By.xpath("//td//div[contains(text(),'Duty Insurance Value')]/following::input"), "Duty Insurance ValueTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		//OP-Yogesh
		certificateNumberFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Certificate Number')]/following::input/following::a[@name='firstFocus']"), "Certificate Number TextField", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 30);
		certificateNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Certificate Number ')]/following::input"), "Certificate Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		typeOfBillForMarineDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Type of Bill for Marine')]/following::select"), "Type of Bill for Marine Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 30);
		//digvijay marine sv
		typeOfTheBillTextField=new PageElement(By.xpath("//td//div[contains(text(),'Type of the Bill')]/following::input"), "Type of the Bill", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bill Date')]/following::input"), "Bill Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invoiceNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Invoice Number')]/following::input"), "Invoice Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Name')]/following::textarea"), "Consignee Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeAddressTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Address')]/following::textarea"), "Consignee Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fromPlaceTextField=new PageElement(By.xpath("//td//div[contains(text(),'From Place')]/following::input"), "From Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toPlaceTextField=new PageElement(By.xpath("//td//div[contains(text(),'To Place')]/following::input"), "To Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Type')]/following::select"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commoditySumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Sum Insured')]/following::input"), "Commodity Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		increasedValueSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Increased Value Sum Insured')]/following::input"), "Increased Value Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dutyValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Duty Value')]/following::input"), "Duty Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay at
		declarationNumberTextField= new PageElement(By.xpath("//td//div[contains(text(),'Declaration Number ')]/following::input"),"Declaration Number text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationNumberFindButton=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Number')]/following::input/following::a[@name='firstFocus']"),  "Declaration Number Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//DI-Rajkumar			
		billNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//verify --
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Name')]/following::textarea"), "Consignee Name Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeAddressTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Address')]/following::textarea"), "Consignee Address Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		fromPlaceTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Address')]/following::textarea"), "From Place Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toPlaceTextArea=new PageElement(By.xpath("//td//div[contains(text(),'To Place')]/following::textarea"), "To Place Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//AM-Rajkumar	
		policyNoCertificateNoOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 1')]/following::input"), "Policy No Certificate No One", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured1')]/following::input"), "Sum Insured Text ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoClaimNoOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.1')]/following::input"), "Marine Cargo Claim No One Text ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoPolicyNoCertificateNoOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 1')]/following::input"), "Marine Cargo Policy No Certificate No One Text ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfLossOneTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss1')]/following::textarea"), "Nature Of Loss One Text Area ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossOneTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss1')]/following::textarea"), "Cause Of Loss One Text Area ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfLossOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss1')]/following::input"), "Date Of Loss One Date Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commentsOneTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Comments1 ')]/following::textarea"), "Comments One Text Area ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIntimationOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation1 ')]/following::input"), "Date Of Intimation One Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeOfLossOneTextField=new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss1 ')]/following::input"), "Time Of Loss One Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoCertificateNoTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 2')]/following::input"), "Policy No Certificate No Two Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured2 ')]/following::input"), "Sum Insured Two Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoClaimNoTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.2 ')]/following::input"), "Marine Cargo Claim No Two Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		marineCargoPolicyNoCertificateTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 2')]/following::input"), "Marine Cargo Policy No Certificate Two Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		natureOfLossTwoTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss2')]/following::textarea"), "Nature Of Loss Two Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		causeOfLossTwoTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss2')]/following::textarea"), "Cause Of Loss Two Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		date0fLossTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss2')]/following::input"), "Date 0f Loss Two Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commentsTwoTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Comments2 ')]/following::textarea"), "Comments Two Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfIntimationTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation2 ')]/following::input"), "Date Of Intimation Two Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeOfLossTwoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss2 ')]/following::input"), "Time Of Loss Two Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
}

public void fillClaimRiskDetailsDeclNoMarineCargo(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity, CustomAssert assertReference) throws InterruptedException{
	if(riskDetDeclNoMCEntity.getAction().equalsIgnoreCase("add") || riskDetDeclNoMCEntity.getAction().equalsIgnoreCase("edit")){
		//Yogesh
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCargoSumInsured")) {
			clearAndSendKeys(cargoSumInsuredTextField, riskDetDeclNoMCEntity.getStringValueForField("CargoSumInsured"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDutyInsuranceValue")) {
			clearAndSendKeys(dutyInsuranceValueTextField, riskDetDeclNoMCEntity.getStringValueForField("DutyInsuranceValue"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigIncreasedValueSumInsured")) {
			clearAndSendKeys(increasedValueSumInsuredTextField, riskDetDeclNoMCEntity.getStringValueForField("IncreasedValueSumInsured"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
			clearAndSendKeys(commoditySumInsuredTextField, riskDetDeclNoMCEntity.getStringValueForField("CommoditySumInsured"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTypeOfBillForMarine")) {
			selectValueFromList(typeOfBillForMarineDropDown, riskDetDeclNoMCEntity.getStringValueForField("TypeOfBillForMarine"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTypepofLoss")) {
			fillCertificateNumberFindButton(riskDetDeclNoMCEntity);
		}
		//digvijay marine sv
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTypeOfTheBill")) {
			clearAndSendKeys(typeOfTheBillTextField, riskDetDeclNoMCEntity.getStringValueForField("TypeOfTheBill"));
		}


		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBillNumber")) {
			clearAndSendKeys(billNumberTextArea, riskDetDeclNoMCEntity.getStringValueForField("BillNumber"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBillDate")) {
			String billDate=RandomCodeGenerator.dateGenerator(riskDetDeclNoMCEntity.getStringValueForField("BillDate"));
			clearAndSendKeys(billDateTextField, billDate);		
		}

		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
			clearAndSendKeys(invoiceNumberTextField, riskDetDeclNoMCEntity.getStringValueForField("InvoiceNumber"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
			clearAndSendKeys(markNumberTextArea, riskDetDeclNoMCEntity.getStringValueForField("MarkNumber"));
		}

		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeName")) {
			clearAndSendKeys(consigneeNameTextArea, riskDetDeclNoMCEntity.getStringValueForField("ConsigneeName"));
		}			

		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
			clearAndSendKeys(consigneeAddressTextArea, riskDetDeclNoMCEntity.getStringValueForField("ConsigneeAddress"));
		}

		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigFromPlace")) {
			clearAndSendKeys(fromPlaceTextField, riskDetDeclNoMCEntity.getStringValueForField("FromPlace"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigToPlace")) {
			clearAndSendKeys(toPlaceTextField, riskDetDeclNoMCEntity.getStringValueForField("ToPlace"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommodityType")) {
			selectValueFromList(commodityTypeDropDown, riskDetDeclNoMCEntity.getStringValueForField("CommodityType"));
		}
		


		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDutyValue")) {
			clearAndSendKeys(dutyValueTextField, riskDetDeclNoMCEntity.getStringValueForField("DutyValue"));
		}
		//digvijay at
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDeclarationNumber")) {
			fillDeclarationNumberFindButton(riskDetDeclNoMCEntity);
		}
		//DI-Rajkumar	
	
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBillNumber")) {
			clearAndSendKeys(billNumberTextArea, riskDetDeclNoMCEntity.getStringValueForField("BillNumber"));
		}
		
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
			clearAndSendKeys(markNumberTextArea, riskDetDeclNoMCEntity.getStringValueForField("MarkNumber"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeName")) {
			clearAndSendKeys(consigneeNameTextArea, riskDetDeclNoMCEntity.getStringValueForField("ConsigneeName"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
			clearAndSendKeys(consigneeAddressTextArea, riskDetDeclNoMCEntity.getStringValueForField("ConsigneeAddress"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigFromPlace")) {
			clearAndSendKeys(fromPlaceTextArea, riskDetDeclNoMCEntity.getStringValueForField("FromPlace"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigToPlace")) {
			clearAndSendKeys(toPlaceTextArea, riskDetDeclNoMCEntity.getStringValueForField("ToPlace"));
		}
	
		//AM-Rajkumar
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoOne")) {
			clearAndSendKeys(policyNoCertificateNoOneTextField, riskDetDeclNoMCEntity.getStringValueForField("PolicyNoCertificateNoOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigSumInsured")) {
			clearAndSendKeys(sumInsuredTextField, riskDetDeclNoMCEntity.getStringValueForField("SumInsured"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoOne")) {
			clearAndSendKeys(marineCargoClaimNoOneTextField, riskDetDeclNoMCEntity.getStringValueForField("marineCargoClaimNoOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNoOne")) {
			clearAndSendKeys(marineCargoPolicyNoCertificateNoOneTextField, riskDetDeclNoMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateNoOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigNatureOfLossOne")) {
			clearAndSendKeys(natureOfLossOneTextArea, riskDetDeclNoMCEntity.getStringValueForField("NatureOfLossOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCauseOfLossOne")) {
			clearAndSendKeys(causeOfLossOneTextArea, riskDetDeclNoMCEntity.getStringValueForField("CauseOfLossOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDateOfLossOne")) {
			String dateOfLossOneDate=RandomCodeGenerator.dateGenerator(riskDetDeclNoMCEntity.getStringValueForField("DateOfLossOne"));
			clearAndEnterDate(dateOfLossOneTextField, dateOfLossOneDate);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommentsOne")) {
			clearAndSendKeys(commentsOneTextArea, riskDetDeclNoMCEntity.getStringValueForField("CommentsOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDateOfIntimationOne")) {
			String dateOfIntimationOneDate=RandomCodeGenerator.dateGenerator(riskDetDeclNoMCEntity.getStringValueForField("DateOfIntimationOne"));
			clearAndEnterDate(dateOfIntimationOneTextField, dateOfIntimationOneDate);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTimeOfLossOne")) {
			clearAndSendKeys(timeOfLossOneTextField, riskDetDeclNoMCEntity.getStringValueForField("TimeOfLossOne"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoTwo")) {
			clearAndSendKeys(policyNoCertificateNoTwoTextField, riskDetDeclNoMCEntity.getStringValueForField("PolicyNoCertificateNoTwo"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigSumInsuredTwo")) {
			clearAndSendKeys(sumInsuredTwoTextField, riskDetDeclNoMCEntity.getStringValueForField("SumInsuredTwo"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoTwo")) {
			clearAndSendKeys(marineCargoClaimNoTwoTextField, riskDetDeclNoMCEntity.getStringValueForField("MarineCargoClaimNoTwo"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateTwo")) {
			clearAndSendKeys(marineCargoPolicyNoCertificateTwoTextField, riskDetDeclNoMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateTwo"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigNatureOfLossTwo")) {
			clearAndSendKeys(natureOfLossTwoTextArea, riskDetDeclNoMCEntity.getStringValueForField("natureOfLossTwo"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCauseOfLossTwo")) {
			clearAndSendKeys(causeOfLossTwoTextArea, riskDetDeclNoMCEntity.getStringValueForField("CauseOfLossTwo"));
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDate0fLossTwo")) {
			String date0fLossTwoTextFields=RandomCodeGenerator.dateGenerator(riskDetDeclNoMCEntity.getStringValueForField("Date0fLossTwo"));
			clearAndEnterDate(date0fLossTwoTextField , date0fLossTwoTextFields);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommentsTwo")) {
			clearAndSendKeys(commentsTwoTextArea, riskDetDeclNoMCEntity.getStringValueForField("CommentsTwo"));
		}			
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDateOfIntimationTwo")) {
			String dateOfIntimationTwoDate=RandomCodeGenerator.dateGenerator(riskDetDeclNoMCEntity.getStringValueForField("DateOfIntimationTwo"));
			clearAndEnterDate(dateOfIntimationTwoTextField, dateOfIntimationTwoDate);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTimeOfLossTwo")) {
			clearAndSendKeys(timeOfLossTwoTextField, riskDetDeclNoMCEntity.getStringValueForField("TimeOfLossTwo"));
		}

	}
	else if(riskDetDeclNoMCEntity.getAction().equalsIgnoreCase("verify")){
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigClaimNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPolicyNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigClaimDate")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigClaimStatus")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigProductCode")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
		}
		//Yogesh
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCargoSumInsured")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CargoSumInsured"), fetchValueFromTextFields(cargoSumInsuredTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDutyInsuranceValue")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("DutyInsuranceValue"), fetchValueFromTextFields(dutyInsuranceValueTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigIncreasedValueSumInsured")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("IncreasedValueSumInsured"), fetchValueFromTextFields(increasedValueSumInsuredTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CommoditySumInsured"), fetchValueFromTextFields(commoditySumInsuredTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCertificateNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CertificateNumber"), fetchValueFromTextFields(certificateNumberTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTypeOfBillForMarine")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("TypeOfBillForMarine"), fetchValueFromList(typeOfBillForMarineDropDown), AssertionType.WARNING);
		}
		//digvijay marine sv
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTypeOfTheBill")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("TypeOfTheBill"), fetchValueFromTextFields(typeOfTheBillTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBillNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("BillNumber"), fetchValueFromTextFields(billNumberTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBillDate")) {
			assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetDeclNoMCEntity.getStringValueForField("BillDate")) ,fetchValueFromTextFields(billDateTextField),AssertionType.WARNING);	
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("InvoiceNumber"), fetchValueFromTextFields(invoiceNumberTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("MarkNumber"), fetchValueFromTextFields(markNumberTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeName")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ConsigneeName"), fetchValueFromTextFields(consigneeNameTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ConsigneeAddress"), fetchValueFromTextFields(consigneeAddressTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigFromPlace")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("FromPlace"), fetchValueFromTextFields(fromPlaceTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigToPlace")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ToPlace"), fetchValueFromTextFields(toPlaceTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommodityType")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CommodityType"), fetchValueFromList(commodityTypeDropDown), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDutyValue")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("DutyValue"), fetchValueFromTextFields(dutyValueTextField), AssertionType.WARNING);
		}
		//digvijay at
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDeclarationNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("riskDetDeclNoMCEntity"), fetchValueFromTextFields(declarationNumberTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("PolicyNoCertificateNoOne"), fetchValueFromTextFields(policyNoCertificateNoOneTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigSumInsured")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("MarineCargoClaimNoOne"), fetchValueFromTextFields(marineCargoClaimNoOneTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNoOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateNoOne"), fetchValueFromTextFields(marineCargoPolicyNoCertificateNoOneTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigNatureOfLossOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("NatureOfLossOne"), fetchValueFromTextFields(natureOfLossOneTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCauseOfLossOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CauseOfLossOne"), fetchValueFromTextFields(causeOfLossOneTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDateOfLossOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("DateOfLossOne"), fetchValueFromTextFields(dateOfLossOneTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommentsOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CommentsOne"), fetchValueFromTextFields(commentsOneTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDateOfIntimationOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("DateOfIntimationOne"), fetchValueFromTextFields(dateOfIntimationOneTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTimeOfLossOne")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("TimeOfLossOne"), fetchValueFromTextFields(timeOfLossOneTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("PolicyNoCertificateNoTwo"), fetchValueFromTextFields(policyNoCertificateNoTwoTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigSumInsuredTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("SumInsuredTwo"), fetchValueFromTextFields(sumInsuredTwoTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("MarineCargoClaimNoTwo"), fetchValueFromTextFields(marineCargoClaimNoTwoTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateTwo"), fetchValueFromTextFields(marineCargoPolicyNoCertificateTwoTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigNatureOfLossTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("NatureOfLossTwo"), fetchValueFromTextFields(natureOfLossTwoTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCauseOfLossTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CauseOfLossTwo"), fetchValueFromTextFields(causeOfLossTwoTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDate0fLossTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("Date0fLossTwo"), fetchValueFromTextFields(date0fLossTwoTextField), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigCommentsTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("CommentsTwo"), fetchValueFromTextFields(commentsTwoTextArea), AssertionType.WARNING);
		}			
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDateOfIntimationTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("DateOfIntimationTwo"), fetchValueFromTextFields(dateOfIntimationTwoTextField), AssertionType.WARNING);
		}	
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigTimeOfLossTwo")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("TimeOfLossTwo"), fetchValueFromTextFields(timeOfLossTwoTextField), AssertionType.WARNING);
		}	
		//DI-Rajkumar	
	
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBillNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("BillNumber"), fetchValueFromTextFields(billNumberTextArea), AssertionType.WARNING);
		}
	
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("MarkNumber"), fetchValueFromTextFields(markNumberTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeName")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ConsigneeName"), fetchValueFromTextFields(consigneeNameTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ConsigneeAddress"), fetchValueFromTextFields(consigneeAddressTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigFromPlace")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("FromPlace"), fetchValueFromTextFields(fromPlaceTextArea), AssertionType.WARNING);
		}
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigToPlace")) {
			assertReference.assertEquals(riskDetDeclNoMCEntity.getStringValueForField("ToPlace"), fetchValueFromTextFields(toPlaceTextArea), AssertionType.WARNING);
		}
		
	}
}

public void clickOnCertificateNumberFindButton(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity) throws InterruptedException{
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigSearchInsuredInterestCode")){
		click(certificateNumberFindButton);
		switchToWindow(" Certificate Id List ");
	}
}
public void fillCertificateNumberFindButton(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity) throws InterruptedException{
	clickOnCertificateNumberFindButton(riskDetDeclNoMCEntity);
	selectCertificateNo(riskDetDeclNoMCEntity);

}
public void selectCertificateNo(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity) throws InterruptedException{
	certificateNoBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+riskDetDeclNoMCEntity.getStringValueForField("Certificate Id List")+"')]"),"Certificate Id List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	click(certificateNoBeSelectedLink);
	switchToWindow("Integrated Insurance Management System");
	switchToFrame("display");
}

public void navigateToMainAttributePage(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigBackButton")){		
		click(backButton);
		switchToFrame("display");
		isElementDisplayed(attributesTabTitle);
	}
}	
public void navigateToclaimHomePage(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigClaimTab")){		
		click(claimTab);
		switchToFrame("display");
		isElementDisplayed(claimTabTitle);
	}
}
public void navigateToInsuredItem(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
		click(insuredItemTab);
		switchToFrame("display");
		isElementDisplayed(insuredItemTabTitle);
	}
}
public void navigateToDocument(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDocumentTab")){		
		click(documentTab);
		switchToFrame("display");
		isElementDisplayed(documentTabTitle);
	}
}
public void navigateToParties(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPartiesTab")){		
		click(partiesTab);
		switchToFrame("display");
		isElementDisplayed(partiesTabTitle);
	}
}
public void navigateToReserve(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigReserveTab")){		
		click(reserveTab);
		switchToFrame("display");
		isElementDisplayed(reserveTabTitle);
	}
}
public void navigateToPayment(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigPaymentTab")){		
		click(paymentTab);
		switchToFrame("display");
		isElementDisplayed(paymentTabTitle);
	}
}
public void navigateToAttribute(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigAttributesTab")){		
		click(attributesTab);
		switchToFrame("display");
		isElementDisplayed(attributesTabTitle);
	}
}
public void navigateToInsuredItemDetails(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
		click(insuredItemDetailsTab);
		switchToFrame("display");
		isElementDisplayed(insuredItemDetailsTabTitle);
	}
}
public void navigateTInsuredItemAttribute(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
		click(insuredItemAttributeTab);
		switchToFrame("display");
		isElementDisplayed(insuredItemAttributeTabTitle);
	}
}
public void clickOnForwardButton(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity){
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigForwardButton")){		
		click(forwardButton);
		switchToFrame("display");
		claimRiskDtls2Title= new PageElement(By.xpath("//div//b[contains(text(),'"+riskDetDeclNoMCEntity.getStringValueForField("Claim Risk Dtls-2")+"')]"), " Claim Risk Dtls-2 Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isElementDisplayed(claimRiskDtls2Title);
	}
}

///digvijay at
public void clickOnDeclarationNumberFindButton(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity) throws InterruptedException{
	if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigDeclarationNumber")){
		click(declarationNumberFindButton);
		switchToWindow();
	}
}
public void fillDeclarationNumberFindButton(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity) throws InterruptedException{
	clickOnDeclarationNumberFindButton(riskDetDeclNoMCEntity);
	selectDeclarationNumberFindButton(riskDetDeclNoMCEntity);
}

public void selectDeclarationNumberFindButton(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity)throws InterruptedException{
	if(riskDetDeclNoMCEntity.getAction().equalsIgnoreCase("add") || riskDetDeclNoMCEntity.getAction().equalsIgnoreCase("edit")){
		switchToWindow("Declaration Id List");
		String declarationId=riskDetDeclNoMCEntity.getStringValueForField("SL No").trim();
		PageElement declarationIdToBeSelectedLink = new PageElement(By.linkText(declarationId), "Declaration Id List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(declarationIdToBeSelectedLink);
	}
}


public void fillandSubmitClaimRiskDetailsDeclNoMarineCargo(RiskDetDeclNoMCEntity riskDetDeclNoMCEntity, CustomAssert assertReference) throws InterruptedException {
	if (isConfigTrue(riskDetDeclNoMCEntity.getConfigExecute())){
		switchToFrame("display");
		fillClaimRiskDetailsDeclNoMarineCargo(riskDetDeclNoMCEntity, assertReference);
		navigateToMainAttributePage(riskDetDeclNoMCEntity);
		navigateToclaimHomePage(riskDetDeclNoMCEntity);
		navigateToInsuredItem(riskDetDeclNoMCEntity);
		navigateToDocument(riskDetDeclNoMCEntity);
		navigateToParties(riskDetDeclNoMCEntity);
		navigateToReserve(riskDetDeclNoMCEntity);
		navigateToPayment(riskDetDeclNoMCEntity);
		navigateToAttribute(riskDetDeclNoMCEntity);
		navigateToInsuredItemDetails(riskDetDeclNoMCEntity);
		navigateTInsuredItemAttribute(riskDetDeclNoMCEntity);
		clickOnForwardButton(riskDetDeclNoMCEntity);
	}
}
}

