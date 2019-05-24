package com.aqm.staf.library.pages.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AccChequeDishonourEntity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class PolicyPremiumCollectionPage extends WebPage {

	private PageElement collectionCollectionCumAdjustmentAdjustmentScreenPageTitle;
	private PageElement instrumentAmountTextField;
	private PageElement collectionNumberTextField;
	private PageElement receivedFromTextField;
	private PageElement sourceOfCollectionDropdown;
	private PageElement collectionTypeDropdown;
	private PageElement otherApprovedSrcTextField;
	private PageElement dateOfCollectionTextField;

	// collection Mode Check Box
	private PageElement collectionRowCheckBox;
	private PageElement collectionModeDropdown;
	private PageElement policyNoQuotationNoTextField;
	private PageElement premiumToBeCollectedTextField;
	private PageElement effectiveDateTextField;
	private PageElement collectionAmountRsTextField;
	private PageElement accountCodeTextField;
	private PageElement subCodeTextField;
	private PageElement drCrDropdown;
	private PageElement referenceNoTextField;
	private PageElement scrollDateTextField;
	private PageElement chequeInsDateTextField;
	private PageElement chequeInsNumberTextField;
	private PageElement chequeInsTypeDropdown;
	private PageElement draweeBankNameTextField;
	private PageElement mICRCodeTextField;
	private PageElement iFSCCodeTextField;
	private PageElement draweeBankBranchTextField;
	private PageElement narrationTextField;
	private PageElement getTotalButton;
	private PageElement toBeCollectedTextField;
	private PageElement collectedTextField;
	private PageElement addNewRowButton;
	private PageElement addPreviuosRowButton;
	private PageElement addPreviuosRowCheckButton;
	private PageElement deleteRowButton;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement policyQuoteDetailsPageTitle;
	private PageElement subCodeFindButton;
	private PageElement referenceNofindButton;
	private PageElement draweeBankFindButton;
	private PageElement gLCodeNoLink;
	private PageElement searchSubCodeButton;
	private PageElement partyCodeForDraweeBankTextField;
	private PageElement draweeBankLink;
	private PageElement collectNoTextField;
	private String collectionNumber;
	private PageElement collectionNumberLinkTextField;
	private PageElement collectionDetailsButton;
	private PageElement proposalPolicyNoTextField;
	private PageElement serachCollectionDetails;
	private PageElement collectionSearchPageIdentifier;
	private PageElement quotationNoFindButton;
	private PageElement quotationNoTextField;
	private PageElement searchButton;
	private PageElement searchCollectionTitle;
	private PageElement nextPageTitle;
	private PageElement vouchereNumberTextField;
	private PageElement voucherNoLink;
	private PageElement companyWindowDropdown;
	private PageElement policyQuoteLink;
	private String quoteNo;	
	private String policyNo;
	//private PageElement quoteNoWindowTextField;
	private PageElement searchWindowButton;

	private PageElement subCodeVerfiyTextField;
	private PageElement policyQuotationTextField;
	private PageElement chequeInsDateFindButton;
	private PageElement referenceTypeAccountTranscationDropdown;
	private PageElement referenceNumberAccountTranscationTextField;

	private PageElement partyCodeTextField;
	private PageElement searchPolicyNoTextField;
	private PageElement searchStatusDropDown;
	private PageElement policyNumberLink;

	public PolicyPremiumCollectionPage(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		// TODO Auto-generated constructor stub

		collectionCollectionCumAdjustmentAdjustmentScreenPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Collection/Collection Cum Adjustment/Adjustment Screen')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		instrumentAmountTextField= new PageElement(By.name("pInstrumentAmt"), "Instrument Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		collectionNumberTextField= new PageElement(By.name("pCollectionNo"), "Collection Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		receivedFromTextField= new PageElement(By.name("pReceivedFrom"), "Received From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sourceOfCollectionDropdown= new PageElement(By.name("pSourceOfCollection"), "Source of Collection TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		collectionTypeDropdown= new PageElement(By.name("pCollectionType"), "Collection Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherApprovedSrcTextField= new PageElement(By.name("pOtherApprovedSrc"), "Other Approved Src TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		dateOfCollectionTextField= new PageElement(By.name("pCollectionDate"), "Date of Collection TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		collectionRowCheckBox= new PageElement(By.name("pCheckBox"), "Collection Row Selection Checkbox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		// here as per Collection Mode next fields locator name is changed.
		// example : cash, Cheque
		collectionModeDropdown = new PageElement(By.name("pModeType"+rowcount+""), "Collection Mode Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		// here as per Collection Mode next fields locator name is changed.
		policyNoQuotationNoTextField = new PageElement(By.name("pPolPropNo0"+rowcount+""), "Policy No./Quotation No.TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Commented by PKP as Amount is only populated in First Row 
		//premiumToBeCollectedTextField= new PageElement(By.name("pPremiumCollect"+rowcount+""), "Premium to be Collected TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumToBeCollectedTextField= new PageElement(By.name("pPremiumCollect0"), "Premium to be Collected TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		effectiveDateTextField= new PageElement(By.name("pEffDate"+rowcount+""), "Effective Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		collectionAmountRsTextField= new PageElement(By.name("pCollectAmt"+rowcount+""), "Collection Amount(Rs) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		accountCodeTextField= new PageElement(By.name("pAccountCode"+rowcount+""), "Account Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subCodeTextField= new PageElement(By.name("pGLCode"), "Sub Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vouchereNumberTextField= new PageElement(By.name("pVoucherNo"), "Reference Number Window TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		drCrDropdown= new PageElement(By.name("pDrCrInd"+rowcount+""), "Dr/Cr TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		referenceNoTextField= new PageElement(By.name("pScrollNo"+rowcount+""), "Reference No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		scrollDateTextField= new PageElement(By.name("pScrlDate"+rowcount+""), "Scroll Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeInsDateTextField= new PageElement(By.name("pChqDate"+rowcount+""), "Chq/Ins. Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeInsNumberTextField= new PageElement(By.name("pChequeNo"+rowcount+""), "Chq/Ins. NumberTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeInsTypeDropdown= new PageElement(By.name("pCheckType"+rowcount+""), "Chq/Ins. Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		draweeBankNameTextField= new PageElement(By.name("pDraweeName"+rowcount+""), "Drawee Bank Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mICRCodeTextField= new PageElement(By.id("ChequeNo1"), "MICR Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iFSCCodeTextField= new PageElement(By.name("pIfscCode"+rowcount+""), "IFSC Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		draweeBankBranchTextField= new PageElement(By.name("pDraweeBankbranch"+rowcount+""), "Drawee Bank Branch TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		narrationTextField= new PageElement(By.name("pNarration"+rowcount+""), "Narration TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		getTotalButton= new PageElement(By.name("btnGetTot"), "Get Total Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toBeCollectedTextField= new PageElement(By.name("pPremiumCollectTotal"), "To Be Collected TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectedTextField= new PageElement(By.name("pCollectAmtTotal"), "Collected TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addNewRowButton= new PageElement(By.name("btnAdd"), "Add New Row Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addPreviuosRowButton= new PageElement(By.name("btnAddPrev"), "Add Previuos Row Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addPreviuosRowCheckButton= new PageElement(By.name("btnAddPrevCheq"), "Add Previous Row Cheque Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deleteRowButton= new PageElement(By.name("btnDel"), "Delete Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton= new PageElement(By.xpath("//input[@name='Save']"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		policyQuoteDetailsPageTitle= new PageElement(By.xpath("//div[1]//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subCodeFindButton=new PageElement(By.name("SubCodeFind"+rowcount+""), "SubCode Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		referenceNofindButton=new PageElement(By.name("pScrollNoFind"+rowcount+""), "Reference No. find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		draweeBankFindButton=new PageElement(By.name("pDraweeNameFind"+rowcount+""), "DraweeBAnkfind Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchSubCodeButton=new PageElement(By.name("Search"), "search Sub Code Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partyCodeForDraweeBankTextField=new PageElement(By.name("pPartyCode"),"Party Code textfield for Drawee bank", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//partyCodeForDraweeBankTextField=new PageElement(By.xpath("//input[@name='pPartyCode']"),"Party Code textfield for Drawee bank", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectionDetailsButton=new PageElement(By.xpath("//input[@name='Collection Details']"), "Collection Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proposalPolicyNoTextField=new PageElement(By.name("pPolPropNo"), "Proposal PolicyNo TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serachCollectionDetails=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		collectionSearchPageIdentifier=new PageElement(By.xpath("//form[@name='frmollectionSearch']//div//b[contains(text(),'Search Collection')]"), "Collection Search Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		collectNoTextField=new PageElement(By.name("pCollectNo"), "Collect Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		searchButton= new PageElement(By.name("Search"), "Search Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		searchCollectionTitle=new PageElement(By.xpath("//div//b[contains(text(),'Search Collection')]"), "Policy/Quote Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		nextPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Collection')]"), "Collection/Collection Cum Adjustment/Adjustment Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		companyWindowDropdown=new PageElement(By.name("pCompanyCode"), "Company Dropdown Button",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//quotationNoFindButton=new PageElement(By.xpath("//input[@name='pPolPropNo1']/following::td/input"), "QuotationNo Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotationNoTextField = new PageElement(By.xpath("//td//input[@name='pProposalNo']"),"Quote Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//quoteNoWindowTextField=new PageElement(By.name("pProposalNo"), "Quote No Window TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		searchWindowButton=new PageElement(By.name("Search5465"), "Search Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		subCodeVerfiyTextField=new PageElement(By.name("pSubCode"+rowcount+""), "Sub Code Verfiy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyQuotationTextField=new PageElement(By.name("pPolPropNo"+rowcount+""), "Policy Quotation TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chequeInsDateFindButton=new PageElement(By.name("pChqDateFind1"), "	Cheque Ins Date Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		referenceTypeAccountTranscationDropdown=new PageElement(By.name("pReferenceType"), "Refrence Type Account Transcation Dropdown",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		referenceNumberAccountTranscationTextField=new PageElement(By.name("pReferenceNumber"), "Reference Number Account Transcation TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		partyCodeTextField=new PageElement(By.name("pPartyCode"), "party Code TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		searchPolicyNoTextField = new PageElement(By.xpath("//td//input[@name='pPolicyNo']"),"Policy Number TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		searchStatusDropDown= new PageElement(By.xpath("//td//select[@name='pStatus']"),"Status  TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
	}

	public void fillPremiumCollectionDetails(PolicyPremCollectionEntity policyPremCollectionEntity, CustomAssert assertReference,int rowcount) throws InterruptedException{
		int premiumToBeCollectedAmount;
 		Thread.sleep(3000);
		if(policyPremCollectionEntity.getAction().equalsIgnoreCase("edit")){

			if (policyPremCollectionEntity.getBooleanValueForField("ConfigReceivedFrom")) {
				clearAndSendKeys(receivedFromTextField, policyPremCollectionEntity.getStringValueForField("ReceivedFrom"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigSourceofCollection")) {
				selectValueFromList(sourceOfCollectionDropdown, policyPremCollectionEntity.getStringValueForField("SourceofCollection"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionType")) {
				selectValueFromList(collectionTypeDropdown, policyPremCollectionEntity.getStringValueForField("CollectionType"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionRowCheckBox")) {
				check(collectionRowCheckBox);
			}
			/***********Table start********/
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionModeDropdown")) {
				selectValueFromList(collectionModeDropdown, policyPremCollectionEntity.getStringValueForField("CollectionModeDropdown"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigQuotationNo")) {
				quotationNoFindButton=new PageElement(By.xpath("//input[@name='pPolPropNo"+rowcount+"']/following::input"), "QuotationNo Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				fillPolicyNoQuotationNo(policyPremCollectionEntity);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigPolicySearchNo")) {
				quotationNoFindButton=new PageElement(By.xpath("//input[@name='pPolPropNo"+rowcount+"']/following::input"), "QuotationNo Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				fillPolicyNoQuotationNo(policyPremCollectionEntity);
				workAround(policyPremCollectionEntity);
				Thread.sleep(10000);
				workAround(policyPremCollectionEntity);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionAmountRs")) {
				int CollectionAmountRs ;
				// Split amount payment. Calculation added by PKP
				//on 13-10-2015
				premiumToBeCollectedAmount = Integer.parseInt(fetchValueFromTextFields(premiumToBeCollectedTextField));
				if (rowcount==0){
					CollectionAmountRs = (premiumToBeCollectedAmount /100)*100;
				}else{
					CollectionAmountRs = premiumToBeCollectedAmount % 100;  
				}
				String CollectionAmount = String.valueOf(CollectionAmountRs);
				policyPremCollectionEntity.setStringValueForField("CollectionAmountRs", CollectionAmount);
				//////////////////////////////////

				clearAndSendKeys(collectionAmountRsTextField, policyPremCollectionEntity.getStringValueForField("CollectionAmountRs"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigSubCode")) {
				selectSubCode(policyPremCollectionEntity);
				//Abhijit
				if(policyPremCollectionEntity.getStringValueForField("CollectionModeDropdown").equalsIgnoreCase("Excess-Cheque")||policyPremCollectionEntity.getStringValueForField("CollectionModeDropdown").equalsIgnoreCase("Excess-Draft")||(policyPremCollectionEntity.getBooleanValueForField("ConfigSecondCollection")))
				{
					workAround(policyPremCollectionEntity);
				}
				// Workaround added for endorsment of UH Product
				/*ConfigEndorseUH needs to set 1 while Additional Endorsment Of UH Product*/
				if(policyPremCollectionEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")){
					if (policyPremCollectionEntity.getBooleanValueForField("ConfigEndorseUH")) {
						workAround(policyPremCollectionEntity);
					}
				}
				//Sachin
				/* Workaround added for endorsment of YT Product
				ConfigEndorseYT needs to set 1 while Additional Endorsment Of YT Product*/
				if(policyPremCollectionEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance") && policyPremCollectionEntity.getStringValueForField("Product").equalsIgnoreCase("YT")){
					if (policyPremCollectionEntity.getBooleanValueForField("ConfigEndorseYT")) {
						workAround(policyPremCollectionEntity);
						workAround(policyPremCollectionEntity);
					}
				}
			}

			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDrCr")) {
				selectValueFromList(drCrDropdown, policyPremCollectionEntity.getStringValueForField("DrCr"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigReferenceNo")) {
				selectReferenceNo(policyPremCollectionEntity);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigScrollDate")) {
				String scrollDate=RandomCodeGenerator.dateGenerator(policyPremCollectionEntity.getStringValueForField("ScrollDate"));
				clearAndEnterDate(scrollDateTextField, scrollDate);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigChequeInsDate")) {

				String chequeInsDate=RandomCodeGenerator.dateGenerator(policyPremCollectionEntity.getStringValueForField("ChequeInsDate"));
				try {
					if(!driver.getTitle().equalsIgnoreCase("Collection Screen")) {
						switchToWindow("Collection Screen");
						clearAndEnterDate(chequeInsDateTextField, chequeInsDate);
				clearAndEnterDate(chequeInsDateTextField, chequeInsDate);
								try {
									if(!driver.getTitle().equalsIgnoreCase("Collection Screen")) {
										switchToWindow("Collection Screen");
										clearAndEnterDate(chequeInsDateTextField, chequeInsDate);
									}
									else {
										clearAndEnterDate(chequeInsDateTextField, chequeInsDate);
									}
								}
								catch(Exception e) {
									e.printStackTrace();
									
								}
					}
					else {
						clearAndEnterDate(chequeInsDateTextField, chequeInsDate);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}

			}
			// ///This config is to select Date for second row of excess cheque.
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigExcessChequeInsDate")) {
				selectDateFromCalender(chequeInsDateFindButton, policyPremCollectionEntity.getStringValueForField("ChequeInsDate"));
				switchToWindow("Collection Screen");
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigChequeInsNumber")) {
				clearAndSendKeys(chequeInsNumberTextField, policyPremCollectionEntity.getStringValueForField("ChequeInsNumber"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigChequeInsType")) {
				selectValueFromList(chequeInsTypeDropdown, policyPremCollectionEntity.getStringValueForField("ChequeInsType"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				selectDraweeBank(policyPremCollectionEntity);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigMICRCode")) {
				clearAndSendKeys(mICRCodeTextField, policyPremCollectionEntity.getStringValueForField("MICRCode"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigIFSCCode")) {
				clearAndSendKeys(iFSCCodeTextField, policyPremCollectionEntity.getStringValueForField("IFSCCode"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDraweeBankBranch")) {

				clearAndSendKeys(draweeBankBranchTextField, policyPremCollectionEntity.getStringValueForField("DraweeBankBranch"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigNarration")) {

				clearAndSendKeys(narrationTextField, policyPremCollectionEntity.getStringValueForField("Narration"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionInstrumentAmt")) {
				click(getTotalButton);
				/*try{
					acceptAlertAndReturnConfirmationMessage();
				}
				catch (Exception e){

				}*/

				double instrumentAmount = Double.parseDouble(fetchValueFromTextFields(collectedTextField));
				clearAndSendKeys(instrumentAmountTextField, String.valueOf(Math.round(instrumentAmount)));
			}
		}

		else if(policyPremCollectionEntity.getAction().equalsIgnoreCase("verify")){
			try{
				switchToFrame("display");
			}
			catch (Exception exception) {

			}

			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectNo")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("CollectNo"),fetchValueFromTextFields(collectNoTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionInstrumentAmt")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("CollectionInstrumentAmt"),fetchValueFromTextFields(instrumentAmountTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionNumber")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("CollectionNumber"),fetchValueFromTextFields(collectionNumberTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigReceivedFrom")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("ReceivedFrom"),fetchValueFromTextFields(receivedFromTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigSourceofCollection")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("SourceofCollection"),fetchValueFromList(sourceOfCollectionDropdown), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionType")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("CollectionType"),fetchValueFromList(collectionTypeDropdown), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigOtherApprovedSrc")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("OtherApprovedSrc"),fetchValueFromTextFields(otherApprovedSrcTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDateofCollection")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyPremCollectionEntity.getStringValueForField("DateofCollection")),fetchValueFromTextFields(dateOfCollectionTextField), AssertionType.WARNING);
			} 
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionModeDropdown")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("CollectionModeDropdown"),fetchValueFromList(collectionModeDropdown), AssertionType.WARNING);
			}

			if (policyPremCollectionEntity.getBooleanValueForField("ConfigQuotationNo")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo"),fetchValueFromTextFields(policyQuotationTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigPremiumToBeCollected")) {
				premiumToBeCollectedTextField= new PageElement(By.name("pPremiumCollect"+rowcount+""), "Premium to be Collected TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("PremiumToBeCollected"),fetchValueFromTextFields(premiumToBeCollectedTextField), AssertionType.WARNING);
			}
			//**************
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigEffectiveDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyPremCollectionEntity.getStringValueForField("EffectiveDate")),fetchValueFromTextFields(effectiveDateTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionAmountRs")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("CollectionAmountRs"),fetchValueFromTextFields(collectionAmountRsTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigAccountCode")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("AccountCode"),fetchValueFromTextFields(accountCodeTextField), AssertionType.WARNING);		
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigSubCode")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("SubCode"),fetchValueFromTextFields(subCodeVerfiyTextField), AssertionType.WARNING);		
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDrCr")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("DrCr"),fetchValueFromList(drCrDropdown), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigReferenceNo")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("ReferenceNo"),fetchValueFromTextFields(referenceNoTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigScrollDate")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("ScrollDate"),fetchValueFromTextFields(scrollDateTextField), AssertionType.WARNING);			
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigChequeInsDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyPremCollectionEntity.getStringValueForField("ChequeInsDate")),fetchValueFromTextFields(chequeInsDateTextField), AssertionType.WARNING);			
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigChequeInsNumber")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("ChequeInsNumber"),fetchValueFromTextFields(chequeInsNumberTextField), AssertionType.WARNING);			
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigChequeInsType")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("ChequeInsType"),fetchValueFromList(chequeInsTypeDropdown), AssertionType.WARNING);			
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("DraweeBankName"),fetchValueFromTextFields(draweeBankNameTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigMICRCode")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("MICRCode"),fetchValueFromTextFields(mICRCodeTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigIFSCCode")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("IFSCCode"),fetchValueFromTextFields(iFSCCodeTextField), AssertionType.WARNING);
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigDraweeBankBranch")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("DraweeBankBranch"),fetchValueFromTextFields(draweeBankBranchTextField), AssertionType.WARNING);			
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigNarration")) {
				assertReference.assertEquals(policyPremCollectionEntity.getStringValueForField("Narration"),fetchValueFromTextFields(narrationTextField), AssertionType.WARNING);			
			}
		}
		switchToWindow("Collection Screen");
	}
	//Abhijit
	public void clickOnQuotationNoFindButton(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigQuotationNoFindButton")){
			click(quotationNoFindButton);
			//Thread.sleep(3000);
			switchToWindow("Policy Search List");
		}
	}

	private void fillPolicyNoQuotationNo(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		clickOnQuotationNoFindButton(policyPremCollectionEntity);
		//Sachin
		if(!policyPremCollectionEntity.getStringValueForField("Product").equalsIgnoreCase("YT")){
			if(policyPremCollectionEntity.getBooleanValueForField("ConfigQuotationNo")){
				//Sachin
				if(policyPremCollectionEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance") && policyPremCollectionEntity.getStringValueForField("Product").equalsIgnoreCase("YT")){
					if (!policyPremCollectionEntity.getBooleanValueForField("ConfigEndorseYT")) {
						clearAndSendKeys(quotationNoTextField,policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo"));
					}
				}
				else{
					clearAndSendKeys(quotationNoTextField,policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo"));
				}
			}	
			if(policyPremCollectionEntity.getBooleanValueForField("ConfigPolicySearchNo")){	
				clearAndSendKeys(searchPolicyNoTextField,policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo"));
				if(policyPremCollectionEntity.getBooleanValueForField("ConfigSearchStatus")){	
					selectValueFromList(searchStatusDropDown,policyPremCollectionEntity.getStringValueForField("SearchStatus"));
				}
			}
		}		
		click(searchWindowButton);
		Thread.sleep(2000);
		selectQuotationNo(policyPremCollectionEntity);
		selectSearchPolicyNo(policyPremCollectionEntity);
	}


	public void selectQuotationNo(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigSearchQuoteNo")){
			quoteNo=policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo").trim();
			policyQuoteLink = new PageElement(By.xpath("//a//font[contains(text(),'"+quoteNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyQuoteLink);
			switchToWindow("Collection Screen");
			try{
				switchToFrame("display");
			}catch (Exception e){
			}
		}
	}
	public void selectSearchPolicyNo(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigPolicySearchNo")){
			policyNo=policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo").trim();
			policyNumberLink = new PageElement(By.xpath("//a//font[contains(text(),'"+policyNo+"')]"), "Policy Quote Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(policyNumberLink);
			switchToWindow("Collection Screen");
			try{
				switchToFrame("display");
			}catch (Exception e){
			}
		}
	}
	public void submitPolicyPremiumCollectionDetails(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigSave")) {
			Thread.sleep(3000);
			if(policyPremCollectionEntity.getBooleanValueForField("ConfigPolicySearchNo")){	
				workAround(policyPremCollectionEntity);
			}
			click(saveButton);
			Thread.sleep(2000);
			if(policyPremCollectionEntity.getStringValueForField("CollectionModeDropdown").equalsIgnoreCase("Scroll"))
			{
				acceptAlertAndReturnConfirmationMessage();
			}
			Thread.sleep(2000);
			policyPremCollectionEntity.setStringValueForField("CollectionNumber", fetchValueFromTextFields(collectionNumberTextField));
		}
	}
	public void backButton(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigBack")) {
			click(backButton);
			
			/*String CurrentTitle=driver.getTitle(); 
			switchToWindow("Problem loading page");
			driver.close();*/
			
			switchToWindow();
			//switchToFrame("display");
			Thread.sleep(2000);
			//isElementDisplayed(policyQuoteDetailsPageTitle);
		}
		else if (policyPremCollectionEntity.getBooleanValueForField("ConfigAccountingCollectionBack")) {
			click(backButton);
			Thread.sleep(3000);
			if(policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionSearchBackButton")){
				click(backButton);
				switchToWindow();
				Thread.sleep(3000);
			}
		}
	}



	public void addNewRowButton(PolicyPremCollectionEntity policyPremCollectionEntity) {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigAddNewRowButton")) {
			click(addNewRowButton);
			isElementDisplayed(collectionCollectionCumAdjustmentAdjustmentScreenPageTitle);
		}
	}
	public void addPrevoiusRowButton(PolicyPremCollectionEntity policyPremCollectionEntity) {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigAddPreviousRowButton")) {
			click(addPreviuosRowButton);
			switchToFrame("display");
			isElementDisplayed(collectionCollectionCumAdjustmentAdjustmentScreenPageTitle);
		}
	}
	public void addPreviousRowCheckButton(PolicyPremCollectionEntity policyPremCollectionEntity) {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigAddPreviousRowCheckButton")) {
			click(addPreviuosRowCheckButton);
			switchToFrame("display");
			isElementDisplayed(collectionCollectionCumAdjustmentAdjustmentScreenPageTitle);
		}
	}

	public void deleteRowButton(PolicyPremCollectionEntity policyPremCollectionEntity) {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigDeleteRowButton")) {
			click(deleteRowButton);
			switchToFrame("display");
			isElementDisplayed(collectionCollectionCumAdjustmentAdjustmentScreenPageTitle);
		}
	}
	public void navigateToCollectionSearchTypePage() {
		navigateToCollectionSearchTypePage();
		switchToFrame("display");
		isElementDisplayed(searchCollectionTitle);
	}



	//  some buttons pending : reason by clicking on button New Row is Added
	public void selectSubCode(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		click(subCodeFindButton);
		
		//Thread.sleep(5000);
		switchToWindow("Account Search");
		clearAndSendKeys(subCodeTextField, policyPremCollectionEntity.getStringValueForField("SubCode"));
		if(policyPremCollectionEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||policyPremCollectionEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")||policyPremCollectionEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")){
			if(policyPremCollectionEntity.getBooleanValueForField("ConfigPartyCode")){
				clearAndSendKeys(partyCodeTextField, policyPremCollectionEntity.getStringValueForField("PartyCode"));
			}
		}
		click(searchSubCodeButton);
		Thread.sleep(2000);
		gLCodeNoLink=new PageElement(By.linkText(policyPremCollectionEntity.getStringValueForField("SubCode")), "Sub Code Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		doubleClick(gLCodeNoLink);
		//click(gLCodeNoLink);
		Thread.sleep(1000);
		//switchToWindow();
		switchToWindow("Collection Screen");
		//switchToWindow("Collection Screen");
		
		// To handle accounting collection
		try{
			//Ashutosh 18-06-2018 Purpose(To reduce unwanted waiting time)
			driver.switchTo().frame("display");
			//switchToFrame("display");
		}  
		catch (Exception e){
		}
	}
	public void selectDraweeBank(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		click(draweeBankFindButton);
		//Thread.sleep(5000);
		switchToWindow("Party Maintenance");
		clearAndSendKeys(partyCodeForDraweeBankTextField, policyPremCollectionEntity.getStringValueForField("DraweeBankName"));
		click(searchSubCodeButton);
		Thread.sleep(3000);
		draweeBankLink=new PageElement(By.linkText(policyPremCollectionEntity.getStringValueForField("DraweeBankName")), "Drawee Bank Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(draweeBankLink);
		//Thread.sleep(1000);
		switchToWindow("Collection Screen");

		driver.switchTo().defaultContent();
		// To handle accounting collection


		/*try{
		//temp comment for testing 
			switchToFrame("display");	
		}  
		catch (Exception e){
		}*/
	}

	//@Rasika
	public void selectReferenceNo(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		click(referenceNofindButton);
		switchToWindow("Untitled Document");
		//workaround
		if(policyPremCollectionEntity.getAction().equalsIgnoreCase("edit")){
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCompanyDropdown")) {
				selectValueFromList(companyWindowDropdown, policyPremCollectionEntity.getStringValueForField("CompanyDropdown"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigVoucherNumber")) {
				clearAndSendKeys(vouchereNumberTextField, policyPremCollectionEntity.getStringValueForField("VoucherNumber"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigReferenceType")) {
				selectValueFromList(referenceTypeAccountTranscationDropdown, policyPremCollectionEntity.getStringValueForField("ReferenceType"));
			}
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigReferenceNoAccountingTransaction")) {
				clearAndSendKeys(referenceNumberAccountTranscationTextField, policyPremCollectionEntity.getStringValueForField("ReferenceNoAccountingTransaction"));
			}
			click(searchSubCodeButton);
			voucherNoLink=new PageElement(By.xpath("//td//b[contains(text(),'Voucher Number')]/following::a[@name='firstFocus']//div"), "Voucher No Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(voucherNoLink);
			switchToWindow("Collection Screen");
		}
	}

	public void selectCollectionNo(PolicyPremCollectionEntity policyPremCollectionEntity)  throws InterruptedException{
		if (policyPremCollectionEntity.getAction().equalsIgnoreCase("verify")){
			if (policyPremCollectionEntity.getBooleanValueForField("ConfigCollectionNumber")){
				collectionNumber=policyPremCollectionEntity.getStringValueForField("CollectionNumber");
				collectionNumberLinkTextField=new PageElement(By.linkText(collectionNumber),"Collection No Search in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(collectionNumberLinkTextField);
				isElementDisplayed(nextPageTitle);

			}
		}
	}

	public void clickOnSearchButton(PolicyPremCollectionEntity policyPremCollectionEntity) {
		if (policyPremCollectionEntity.getBooleanValueForField("ConfigSearchButton")){
			click(searchButton);
		}
	}

	public void workAround(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		selectValueFromList(collectionModeDropdown, policyPremCollectionEntity.getStringValueForField("CollectionModeDropdown"));
		selectSubCode(policyPremCollectionEntity);

	}
	private void fillPolicyNo(PolicyPremCollectionEntity policyPremCollectionEntity) throws InterruptedException{
		clickOnQuotationNoFindButton(policyPremCollectionEntity);
		if(policyPremCollectionEntity.getBooleanValueForField("ConfigPolicySearchNo")){
			clearAndSendKeys(quotationNoTextField,policyPremCollectionEntity.getStringValueForField("PolicyNoQuotationNo"));
		}	
		click(searchWindowButton);
		Thread.sleep(2000);
		selectQuotationNo(policyPremCollectionEntity);
	}



	public void fillandSubmitPolicyCollectionDetails(PolicyPremCollectionEntity policyPremCollectionEntity,CustomAssert assertReference, int rowcount) throws InterruptedException {
		if(isConfigTrue(policyPremCollectionEntity.getConfigExecute())){
			fillPremiumCollectionDetails(policyPremCollectionEntity,assertReference,rowcount);
			submitPolicyPremiumCollectionDetails(policyPremCollectionEntity);
			backButton(policyPremCollectionEntity);
			addNewRowButton(policyPremCollectionEntity);
			addPrevoiusRowButton(policyPremCollectionEntity);
			addPreviousRowCheckButton(policyPremCollectionEntity);
			deleteRowButton(policyPremCollectionEntity);

		}
	}
}
