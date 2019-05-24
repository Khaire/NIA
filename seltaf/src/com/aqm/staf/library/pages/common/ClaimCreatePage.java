package com.aqm.staf.library.pages.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.AccountDistributionEntity;
import com.aqm.staf.library.databin.AccountingDistributionTable;
import com.aqm.staf.library.databin.ClaimCloseEntity;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.ClaimPaymentEntity;
import com.aqm.staf.library.databin.FinancialSummaryTableEntity;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PartyPartyRoleClaimantEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMember_InsuredEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;

public class ClaimCreatePage extends BasePage {
	private PageElement claimDetailsPageTitle;
	private PageElement claimTitle;
	private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberTextField;
	private PageElement claimStatusLabel;
	private PageElement openLable;
	private PageElement timeOfIntimationTextField;
	private PageElement dateOfIntimationTextField;
	private PageElement reportedBranchTextField;
	private PageElement dateofIllnessTextField;
	private PageElement timeofAdmissionTextField;
	private PageElement dateOfLossTextField;
	private PageElement timeOfLossTextField;
	private PageElement claimReportedByTextField;
	private PageElement eventCodeTextField;
	private PageElement typeOfLossTextField;
	private PageElement natureOfLossTextField;
	private PageElement firGdrNumberTextField;
	private PageElement policeReportedDateTextField;
	private PageElement policeStationTextField;
	private PageElement reportedByTextField;
	private PageElement relationshipWithTheInsuredTextField;
	private PageElement lossDescriptionTextField;
	private PageElement placeOfLossTextField;
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement processButton;
	private PageElement rejectButton;
	private PageElement disputedButton;
	private PageElement cloneClaimButton;
	private PageElement claimHistoryButton;
	private PageElement documentStatusButton;
	private PageElement transferToAPButton;

	private PageElement typeOfLossFindButton;
	private PageElement typeOfLossTextFeild;
	private PageElement typeOFLossBeSelectedLink;
	private PageElement typeOfLossSecondFindButton;
	private PageElement natureOfLossFindButton;
	private PageElement natureOfLossTextFeild;
	private PageElement natureOFLossBeSelectedLink;
	private PageElement natureOfLossSecondFindButton;

	private PageElement reserveTypeTextFeild;
	private PageElement reserveAmountForMedicalTextFeild;
	private PageElement reserveTypeForExpTextFeild;
	private PageElement reserveAmountForExpTextFeild;
	//links
	private PageElement claimDetailsTitle;
	private PageElement claimInsuredInterestDamageTitle;
	private PageElement claimMemberDamageTitle;	
	private PageElement claimDocumentsTitle;
	private PageElement claimAssociatedPartiesTitle;
	private PageElement	claimReserveTitle;
	private PageElement claimPaymentsTitle;
	private PageElement	claimPropertyTitle;
	private PageElement claimSearchTitle;
	private PageElement claimHistoryTitle;

	private PageElement pageTitleAfterCreateReserve;
	private PageElement indemnityReserveTypeFunctionDropDown;
	private PageElement indemnityReserveAmountTextField;
	private PageElement expenseReserveTypeFunctionDropDown;
	private PageElement expenseReserveAmountTextField;
	private PageElement insuredInterestCodeTextField;
	private PageElement reasonForInitiatingIhisactionTextField;
	private PageElement insuredInmtrestFindButton;
	private PageElement searchButton;
	private PageElement insuredIntrestToBeSelectedLink;
	private PageElement reasonSaveButton;
	private PageElement reOpenIndemnityReserveTypeFunctionDropDown;
	private PageElement reOpenIndemnityReserveAmountTextField;
	private PageElement reOpenExpenseReserveTypeFunctionDropDown;
	private PageElement reOpenExpenseReserveAmountTextField;
	
	//Close Claim
	private PageElement claimApprovalTypeDropdown;
	private PageElement rejectionReasonDropdown;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement closeButton;
	private PageElement reopenButton;

	private PageElement insuredInterestCodeFindButton;
	private PageElement insuredInterestCodeSearchButton;
	private PageElement insuredCodeToBeSelectedLink;
	private PageElement seqNoTextField;
	private PageElement cPOCodeTextField;
	private PageElement cPOClaimNumberTextField;

	private PageElement saveWindowButton;
	private PageElement closeWindowButton;
	private PageElement srNumber;
	private PageElement claimFollowUpEventsStaus;
	private PageElement reserveType; 
	private PageElement amount;
	private PageElement paidAmount;
	private PageElement pendingAmount;

	private PageElement claimLitigationButton;
	private PageElement litigationListTitle;

	private PageElement certificateNoTextField;
	private PageElement nameTextField;
	private PageElement seachButton;
	private PageElement surveyorToBeAppointedDropdown;
	private PageElement policeReportedDateFindButton;
	private PageElement surveyorCodeTextField;
	private PageElement typeOfSurveyTypeDropdown;
	private PageElement dateOfAppointmentTextField;
	private PageElement userIdLabel;
	private PageElement roleLabel;


	public ClaimCreatePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimDetailsPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimTitle = new PageElement(By.xpath("//td//div//b[contains(text(),'Claim')]"),"Claim Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		insuredItemTitle = new PageElement(By.xpath("//b//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Member')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Claim")), "Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		policyNumberTextField = new PageElement(By.name("pPolicyNumber"), "Policy NumberTextfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0050","Status")), "Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		timeOfIntimationTextField = new PageElement(By.name("pClaimNoteTime"), "Time Of Intimation TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfIntimationTextField =  new PageElement(By.name("pReceivedDate"), "Date Of Intimation TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reportedBranchTextField = new PageElement(By.name("pClaimBranch"), "Reported Branch TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateofIllnessTextField=new PageElement(By.name("pLossDate"), "Date of Illness TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		timeofAdmissionTextField=new PageElement(By.name("pTimeOfLoss"), "Time of Admission TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfLossTextField = new PageElement(By.name("pLossDate"), "Date Of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		timeOfLossTextField = new PageElement(By.name("pTimeOfLoss"), "Time Of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimReportedByTextField = new PageElement(By.name("pClaimReportedBy"), "Claim Reported By TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		eventCodeTextField = new PageElement(By.name("pClaimEventCode"), "Claim Event Code TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOfLossTextField = new PageElement(By.name("pPrimaryCauseCode"), "Type Of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		natureOfLossTextField = new PageElement(By.name("pSecondaryCauseCode"), "Nature Of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		firGdrNumberTextField = new PageElement(By.name("pClaimCaseNo"), "Fir/Gdr Numbers TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policeReportedDateTextField = new PageElement(By.name("pClaimReportedDate"), "Police Reported Date TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policeStationTextField = new PageElement(By.name("pPoliceStation"), "Police Station TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reportedByTextField = new PageElement(By.name("pReportedBy"), "Reported By TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationshipWithTheInsuredTextField =  new PageElement(By.name("pRelInsured"), "Relationship With The Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		lossDescriptionTextField = new PageElement(By.name("pClaimLocation"), "Loss Description TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		placeOfLossTextField = new PageElement(By.name("pAreaCode"), "Place of Loss TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Fin Summary table
		//Claim follow up table
		saveButton = new PageElement(By.name("Save"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//saveWindowButton = new PageElement(By.xpath("//table//input[@name='Save']"),  "Save Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveWindowButton = new PageElement(By.name("Save"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"),  "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		processButton= new PageElement(By.name("Process"),  "Process Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		rejectButton= new PageElement(By.name("Reject"),  "Reject Button ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		disputedButton= new PageElement(By.name("Disputed"),  "Disputed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cloneClaimButton= new PageElement(By.name("CloneClaim"),  "CloneClaim Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		claimHistoryButton= new PageElement(By.name("ClaimHistory"),  "ClaimHistory Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentStatusButton= new PageElement(By.name("DocumentStatus"),  "DocumentStatus Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transferToAPButton=	new PageElement(By.name("Transfer"),  "Transfer TO AP Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//links
		claimDetailsTitle= new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Claim Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimInsuredInterestDamageTitle=new PageElement(By.xpath("//b[contains(text(),'Insured InterestDamage')]"), "Claim Insured InterestDamage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimMemberDamageTitle= new PageElement(By.xpath("//b[contains(text(),'MemberDamage')]"), "Claim MemberDamageTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDocumentsTitle= new PageElement(By.xpath("//b[contains(text(),'Documents')]"), "Claim Documents Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimAssociatedPartiesTitle= new PageElement(By.xpath("//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReserveTitle= new PageElement(By.xpath("//b[contains(text(),'Reserve')]"), "Claim Reserve Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPaymentsTitle= new PageElement(By.xpath("//b[contains(text(),'Payments')]"), "Claim Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimPropertyTitle= new PageElement(By.xpath("//b[contains(text(),'Claim Property')]"), "Claim Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSearchTitle= new PageElement(By.xpath("//b[contains(text(),'Claim Search')]"), "Claim Search Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimHistoryTitle= new PageElement(By.xpath("//b[contains(text(),'Claim History')]"), "Claim History Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		typeOfLossFindButton=new PageElement(By.xpath("//input[@name='pPrimaryCauseCode']/following::a[@name='firstFocus']"), "Type Of Loss Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		typeOfLossTextFeild = new PageElement(By.name("pValueCode"), "Type Of Loss TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		natureOfLossFindButton=new PageElement(By.xpath("//input[@name='pSecondaryCauseCode']/following::a[@name='firstFocus']"), "Nature Of Loss Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		natureOfLossTextFeild = new PageElement(By.name("pValueCode"), "Nature Of Loss TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeOfLossSecondFindButton=new PageElement(By.xpath("//input[@name='pValueCode']/following::a[@name='firstFocus']"), "Type Of Loss Second Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		natureOfLossSecondFindButton=new PageElement(By.xpath("//input[@name='pValueCode']/following::a[@name='firstFocus']"), "Nature Of Loss Second Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		pageTitleAfterCreateReserve= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		indemnityReserveTypeFunctionDropDown=new PageElement(By.xpath("//select[@name='pPartyFunction']"), "claim party Function DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//indemnityReserveTypeFunctionDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Indemnity", "select")),"claim party Function DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		indemnityReserveAmountTextField= new PageElement(By.name("pClaimReserveAmount"), "Claim Reserve Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expenseReserveTypeFunctionDropDown=new PageElement(By.xpath("//form[@name='S0031']//td//b[contains(text(),'Expense')] /following::select"), "claim party Function 1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		expenseReserveAmountTextField= new PageElement(By.name("pClaimReserveAmount1"), "Claim Reserve 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeTextField= new PageElement(By.name("pPolicyRiskCode"), "Policy Risk Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInmtrestFindButton=new PageElement(By.xpath("//input[@name='pPolicyRiskCode']/following::a[@name='firstFocus']"), "Insured Intrest Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchButton = new PageElement(By.name("Search"),  "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reOpenIndemnityReserveTypeFunctionDropDown=new PageElement(By.xpath("//form[@name='S0031']//td//b[contains(text(),'Indemnity Reserve Type Function    ')]//following::select[1]"), "claim party Function DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reOpenIndemnityReserveAmountTextField= new PageElement(By.xpath("//form[@name='S0031']//td//b[contains(text(),'Indemnity Reserve Amount')] /following::input[1]"), "Claim Reserve Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reOpenExpenseReserveTypeFunctionDropDown=new PageElement(By.xpath("//form[@name='S0031']//td//b[contains(text(),'Expense')] /following::select"), "claim party Function 1 DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		reOpenExpenseReserveAmountTextField= new PageElement(By.xpath("//form[@name='S0031']//td//b[contains(text(),'Expense Reserve ')] /following::input[2]"), "Claim Reserve 1 Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		reasonSaveButton = new PageElement(By.name("Save"),"Save For Reason Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Close Window
		claimApprovalTypeDropdown = new PageElement(By.xpath(locatorforPanel("Claim Approval Type", "select")),"Claim Approval Type Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		//reasonForInitiatingThisActionTextArea = new PageElement(By.xpath(locatorforPanel("Reason for initiating this action", "textarea")),"Reason for initiating this action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		closeButton = new PageElement(By.xpath("//input[@name='Close Claim']"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeWindowButton = new PageElement(By.name("CloseWin"),"Close Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reopenButton = new PageElement(By.name("Reopen"),"Reopen Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Insured InterestCode')]/following::input/following::a[@name='firstFocus']"), "Insured Interest code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		seqNoTextField = new PageElement(By.xpath("//td//b[contains(text(),'SeqNo')]/following::a[@name='firstFocus']"), "Seq No Field", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		reserveTypeTextFeild = new PageElement(By.xpath("//table//tbody//td[contains(text(),'MEDICAL')]"), "Reserve Type For Medical TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveAmountForMedicalTextFeild = new PageElement(By.xpath("//table//tbody//td[contains(text(),'MEDICAL')]/following::td"), "TReserve Type For Medical TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTypeForExpTextFeild = new PageElement(By.xpath("//table//tbody//td[contains(text(),'EXP')]"), "Reserve Type For EXP TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveAmountForExpTextFeild = new PageElement(By.xpath("//table//tbody//td[contains(text(),'EXP')]/following::td"), "Reserve Type For Exp TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cPOCodeTextField = new PageElement(By.name("pClaimHubOffCode"), "CPO Code TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cPOClaimNumberTextField = new PageElement(By.name("pClaimHubSRNo"), "CPO Claim Number TextFeild", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		rejectionReasonDropdown=new PageElement(By.xpath("//select[@name='pClmRejReason']"),"Rejection Reason Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		claimLitigationButton=new PageElement(By.name("ClaimLitigation"),  "Claim Litigation Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		litigationListTitle=new PageElement(By.xpath("//font//b[contains(text(),'Litigation ')]"), "Litigation List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		certificateNoTextField=new PageElement(By.name("pFirstName"),  "Certificate No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameTextField=new PageElement(By.name("pFirstName"),  "Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		seachButton=new PageElement(By.name("Search"),  "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		surveyorToBeAppointedDropdown=new PageElement(By.name("pSurveyorFlag"),  "surveyor To Be Appointed Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policeReportedDateFindButton=new PageElement(By.xpath("//div[contains(text(),'Police Reported Date')]/following::input/following::a[@name='firstFocus']"), "Police Reported Date FindButton", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surveyorCodeTextField= new PageElement(By.name("pSurveyorCode"), "Surveyor Code Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfSurveyTypeDropdown=new PageElement(By.name("pSurveyorType"),  "Type of Survey Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfAppointmentTextField=new PageElement(By.name("pSurveyorDate"), "Date of Appointment TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		userIdLabel=new PageElement(By.xpath("//font/b[contains(text(),'User Id')]"), "user Id Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		roleLabel=new PageElement(By.xpath("//font/b[contains(text(),'Role')]"), "role Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}


	public void navigateToClaimTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitle);
		}
	}
	public void navigateToInsuredItemTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
			click(insuredItemTitle);
			switchToFrame("display");
			isElementDisplayed(claimInsuredInterestDamageTitle);
		}
	}

	public void navigateToMemberTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitle);
		}
	}
	public void navigateToDocumentTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitle);
		}
	}
	public void navigateToPartiesTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitle);
		}
	}
	public void navigateToReserveTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitle);
		}
	}
	public void navigateToPaymentTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitle);
		}
	}
	public void navigateToAttributestTab(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitle);
		}
	}
	public void navigateToCloneClaimButton(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
			click(cloneClaimButton);
			switchToFrame("display");
			isElementDisplayed(claimSearchTitle);
		}
	}
	public void navigateToCloneHistoryButton(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigClaimHistoryButton")){
			click(claimHistoryButton);
			switchToFrame("display");
			isElementDisplayed(claimHistoryTitle);
		}
	}
	public void navigateToBackButton(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(claimSearchTitle);
		}
	}
	public void navigateTransferToAPButton(ClaimEntity claimEntityListData) throws InterruptedException{
		if (claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
			click(transferToAPButton);
			switchToWindow("Refund/Excess Voucher List");
		}
	}

	public void claimLitigationButton(ClaimEntity claimEntityListData){
		if (claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
			click(claimLitigationButton);
			switchToFrame("display");
			isElementDisplayed(litigationListTitle);
		}
	}


	public void fillClaimDetails(ClaimEntity claimEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{

		if(claimEntityListData.getBooleanValueForField("ConfigPrimaryInformation")){
			if(claimEntityListData.getAction().equalsIgnoreCase("add") || claimEntityListData.getAction().equalsIgnoreCase("edit")){

				if (claimEntityListData.getBooleanValueForField("ConfigPolicyNumber")) {
					clearAndSendKeys(policyNumberTextField, claimEntityListData.getStringValueForField("PolicyNumber"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigTimeofIntimation")) {

					clearAndEnterTime(timeOfIntimationTextField);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigDateofIntimation")) {
					String dateofIntimation=RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("DateofIntimation"));
					clearAndEnterDate(dateOfIntimationTextField, dateofIntimation);
				}

				if (claimEntityListData.getBooleanValueForField("ConfigReportedBranch")) {
					clearAndSendKeys(reportedBranchTextField, claimEntityListData.getStringValueForField("ReportedBranch"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigDateofIllness")) {
					String dateofIllness=RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("DateofIllness"));
					clearAndEnterDate(dateofIllnessTextField, dateofIllness);
				}

				if (claimEntityListData.getBooleanValueForField("ConfigTimeofAdmission")) {

					String timeofIntimation=fetchValueFromTextFields(timeOfIntimationTextField);
					clearAndEnterForwardTime(timeofAdmissionTextField,timeofIntimation);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigClaimReportedBy")) {
					clearAndSendKeys(claimReportedByTextField, claimEntityListData.getStringValueForField("ClaimReportedBy"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigEventCode")) {
					clearAndSendKeys(eventCodeTextField, claimEntityListData.getStringValueForField("EventCode"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigTypepofLoss")) {
					fillTypeOfLossSearch(claimEntityListData);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigNatureofLoss")) {
					fillNatureOfLossSearch(claimEntityListData);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigFIRGDRNo")) {
					clearAndSendKeys(firGdrNumberTextField, claimEntityListData.getStringValueForField("FIRGDRNo"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigPoliceReportedDate")) {
					selectDateFromCalender(policeReportedDateFindButton, claimEntityListData.getStringValueForField("PoliceReportedDate"));
					switchToFrame("display");
				}
				if (claimEntityListData.getBooleanValueForField("ConfigPoliceStation")) {
					clearAndSendKeys(policeStationTextField, claimEntityListData.getStringValueForField("PoliceStation"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigReportedBy")) {
					clearAndSendKeys(reportedByTextField, claimEntityListData.getStringValueForField("ReportedBy"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigRelationshipWithTheInsured")) {
					clearAndSendKeys(relationshipWithTheInsuredTextField, claimEntityListData.getStringValueForField("RelationshipWithTheInsured"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigLossDescription")) {
					clearAndSendKeys(lossDescriptionTextField, claimEntityListData.getStringValueForField("LossDescription"));
				}
				if (claimEntityListData.getBooleanValueForField("ConfigPlaceofLossPinCode")) {
					clearAndSendKeys(placeOfLossTextField, claimEntityListData.getStringValueForField("PlaceofLossPinCode"));
				}
			}
			else if(claimEntityListData.getAction().equalsIgnoreCase("verify")){

				if (claimEntityListData.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigClaimStaus")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("ClaimStaus"), fetchValueFromFields(claimStatusLabel),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigTimeofIntimation")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("TimeofIntimation")) ,fetchValueFromTextFields(timeOfIntimationTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigDateofIntimation")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("DateofIntimation")) ,fetchValueFromTextFields(dateOfIntimationTextField),AssertionType.WARNING);
				}

				if (claimEntityListData.getBooleanValueForField("ConfigReportedBranch")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("ReportedBranch"),fetchValueFromTextFields(reportedBranchTextField),AssertionType.WARNING);
				}

				if (claimEntityListData.getBooleanValueForField("ConfigDateofIllness")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("DateofIllness")) ,fetchValueFromTextFields(dateofIllnessTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigTimeofAdmission")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("TimeofAdmission"), fetchValueFromTextFields(timeofAdmissionTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigClaimReportedBy")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("ClaimReportedBy"),fetchValueFromTextFields(claimReportedByTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigEventCode")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("EventCode"),fetchValueFromTextFields(eventCodeTextField),AssertionType.WARNING);
				}
				/*if (claimEntityListData.getBooleanValueForField("ConfigEventCode")) {
					actualClaimSearch_CreateEntity.setStringValueForField("EventCode", fetchValueFromFields(eventCodeTextField));
					assertReference.assertEquals(claimEntityListData.getStringValueForField("EventCode"), actualClaimSearch_CreateEntity.getStringValueForField("ClaimReportedBy"),AssertionType.WARNING);
				}*/
				if (claimEntityListData.getBooleanValueForField("ConfigTypepofLoss")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("TypepofLoss"), fetchValueFromTextFields(typeOfLossTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigNatureofLoss")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("NatureofLoss"), fetchValueFromTextFields(natureOfLossTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigFIRGDRNo")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("FIRGDRNo"),fetchValueFromTextFields(firGdrNumberTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigPoliceReportedDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("PoliceReportedDate")) ,fetchValueFromTextFields(policeReportedDateTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigPoliceStation")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("PoliceStation"),fetchValueFromTextFields(policeStationTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigReportedBy")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("ReportedBy"), fetchValueFromTextFields(reportedByTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigRelationshipWithTheInsured")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("RelationshipWithTheInsured"),fetchValueFromTextFields(relationshipWithTheInsuredTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigLossDescription")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("LossDescription"), fetchValueFromTextFields(lossDescriptionTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigCPOCode")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("CPOCode"),fetchValueFromTextFields(cPOCodeTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigCPOClaimNumber")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("CPOClaimNumber"),fetchValueFromTextFields(cPOClaimNumberTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigCPOClaimNumber")) {
					assertReference.assertEquals(claimEntityListData.getStringValueForField("CPOClaimNumber"),fetchValueFromTextFields(cPOClaimNumberTextField),AssertionType.WARNING);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigSearchClaimNumber")) {
					verifyFinancialSummaryTable(claimEntityListData,assertReference, testData);
				}
				if (claimEntityListData.getBooleanValueForField("ConfigClaimStausFollowUpEventsTable")) {
					verifyClaimFollowUpEventsTable(claimEntityListData,assertReference, testData);
				}

				if (claimEntityListData.getBooleanValueForField("ConfigUserId")) {
					switchToFrame("head");
					assertReference.assertEquals(claimEntityListData.getStringValueForField("UserId"),fetchValueFromFields(userIdLabel), AssertionType.WARNING);
					switchToFrame("display");
				}
				if (claimEntityListData.getBooleanValueForField("ConfigRole")) {
					switchToFrame("head");
					assertReference.assertEquals(claimEntityListData.getStringValueForField("Role"),fetchValueFromFields(roleLabel), AssertionType.WARNING);
					switchToFrame("display");
				}

			}
		}
	}

	public void fillClaimReserveBeforeIntimationDetails(ClaimEntity claimEntityListData, CustomAssert assertReference) throws InterruptedException{
		if(claimEntityListData.getAction().equalsIgnoreCase("add")){
			switchToJSPPage();
			//	switchToDefaultFrame();
			if (claimEntityListData.getBooleanValueForField("ConfigIndemnityReserveTypeFunction")) {
				//bringWebElementInView(indemnityReserveTypeFunctionDropDown);
				selectValueFromList(indemnityReserveTypeFunctionDropDown, claimEntityListData.getStringValueForField("IndemnityReserveTypeFunction"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigIndemnityReserveAmount")) {
				clearAndSendKeys(indemnityReserveAmountTextField, claimEntityListData.getStringValueForField("IndemnityReserveAmount"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigExpenseReserveTypeFunction")) {
				selectValueFromList(expenseReserveTypeFunctionDropDown, claimEntityListData.getStringValueForField("ExpenseReserveTypeFunction"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigExpenseReserveAmount")) {
				clearAndSendKeys(expenseReserveAmountTextField, claimEntityListData.getStringValueForField("ExpenseReserveAmount"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigInsuredInterestCode")) {
				fillInsuredInterestCodeSearch(claimEntityListData);
			}
			if (claimEntityListData.getBooleanValueForField("ConfigReasonForInitiatingThisaction")) {
				clearAndSendKeys(reasonForInitiatingIhisactionTextField, claimEntityListData.getStringValueForField("ReasonForInitiatingIhisaction"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSurveyorToBeAppointed")) {
				selectValueFromList(surveyorToBeAppointedDropdown, claimEntityListData.getStringValueForField("SurveyorToBeAppointed"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSurveyorCode")) {
				clearAndSendKeys(surveyorCodeTextField, claimEntityListData.getStringValueForField("SurveyorCode"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigTypeOfSurvey")) {
				selectValueFromList(typeOfSurveyTypeDropdown, claimEntityListData.getStringValueForField("TypeOfSurvey"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigDateOfAppointment")) {
				String dateofIntimation=RandomCodeGenerator.dateGenerator(claimEntityListData.getStringValueForField("DateOfAppointment"));
				clearAndEnterDate(dateOfAppointmentTextField, dateofIntimation);
			  }
			submitReserveDetails(claimEntityListData);

			//pending to add Find button Code 

		}

	}

	//TODO Insured Interest Code Sl.No.
	public void clickOnInsuredInterestCodeFindButton(ClaimEntity claimEntityListData) throws InterruptedException{
		if (claimEntityListData.getBooleanValueForField("ConfigSearchInsuredInterestCode")){
			click(insuredInterestCodeFindButton);
			switchToWindow();
		}
	}
	public void fillInsuredInterestCodeSearch(ClaimEntity claimEntityListData) throws InterruptedException{
		clickOnInsuredInterestCodeFindButton(claimEntityListData);
		selectSearchInsuredInterestCode(claimEntityListData);
	}

	public void selectSearchInsuredInterestCode(ClaimEntity claimEntityListData)throws InterruptedException{
		if(claimEntityListData.getAction().equalsIgnoreCase("add")){
			switchToWindow("Policy Insured Item List");
			if(claimEntityListData.getStringValueForField("Product").equalsIgnoreCase("GH")){
				if (claimEntityListData.getBooleanValueForField("ConfigCertificateNo")){
					clearAndSendKeys(certificateNoTextField, claimEntityListData.getStringValueForField("CertificateNo"));
				}
				click(searchButton);
			}
			if(claimEntityListData.getStringValueForField("Product").equalsIgnoreCase("PZ")||claimEntityListData.getStringValueForField("Product").equalsIgnoreCase("TG")||claimEntityListData.getStringValueForField("Product").equalsIgnoreCase("TF")){
				if (claimEntityListData.getBooleanValueForField("ConfigName")){
					Thread.sleep(3000);
					clearAndSendKeys(nameTextField, claimEntityListData.getStringValueForField("Name"));
				}
				click(seachButton);
			}
			if (claimEntityListData.getBooleanValueForField("ConfigSeqNo")){
				String insuredCode=claimEntityListData.getStringValueForField("SeqNo").trim();
				insuredCodeToBeSelectedLink=new PageElement(By.linkText(insuredCode), "Insured Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(insuredCodeToBeSelectedLink);
				switchToJSPPage();
			}
		}
	}

	//TODO Fill Reason
	public void fillReasonDetails(ClaimEntity claimEntityListData)throws InterruptedException {
		switchToWindow("Reason");
		if((claimEntityListData.getAction().equalsIgnoreCase("add")||claimEntityListData.getAction().equalsIgnoreCase("edit"))){
			if (claimEntityListData.getBooleanValueForField("ConfigClaimApprovalType")) {
				selectValueFromList(claimApprovalTypeDropdown, claimEntityListData.getStringValueForField("ClaimApprovalType"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigIndemnityReserveTypeFunction")) {
				//bringWebElementInView(indemnityReserveTypeFunctionDropDown);
				selectValueFromList(reOpenIndemnityReserveTypeFunctionDropDown, claimEntityListData.getStringValueForField("IndemnityReserveTypeFunction"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigIndemnityReserveAmount")) {
				clearAndSendKeys(reOpenIndemnityReserveAmountTextField, claimEntityListData.getStringValueForField("IndemnityReserveAmount"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigExpenseReserveTypeFunction")) {
				selectValueFromList(reOpenExpenseReserveTypeFunctionDropDown, claimEntityListData.getStringValueForField("ExpenseReserveTypeFunction"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigExpenseReserveAmount")) {
				clearAndSendKeys(reOpenExpenseReserveAmountTextField, claimEntityListData.getStringValueForField("ExpenseReserveAmount"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigRejectionReason")) {
				selectValueFromList(rejectionReasonDropdown, claimEntityListData.getStringValueForField("RejectionReason"));
			}
			if (claimEntityListData.getBooleanValueForField("ConfigReasonForInitiatingThisaction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, claimEntityListData.getStringValueForField("ReasonForInitiatingThisaction"));
			}
			if(claimEntityListData.getBooleanValueForField("ConfigSaveForReason")){
				click(reasonSaveButton);
			}
			switchToWindow();
			switchToFrame("display");
		}
	}

	public void clickOnInsuredIntrestFindButton(ClaimEntity claimEntityListData) throws InterruptedException{
		if (claimEntityListData.getBooleanValueForField("ConfigInsuredInterestCodeFindButton")){
			click(insuredInmtrestFindButton);
			switchToWindow();
		}
	}


	public void fillInsuredInmtrestSearch(ClaimEntity claimEntityListData) throws InterruptedException{
		clickOnInsuredIntrestFindButton(claimEntityListData);

		if(claimEntityListData.getBooleanValueForField("ConfigInsuredInterestCode")){
			clearAndSendKeys(insuredInterestCodeTextField,claimEntityListData.getStringValueForField("InsuredInterestCode"));	
		}

		click(searchButton);
		selectInsuredIntrestCode(claimEntityListData);
	}

	public void selectInsuredIntrestCode(ClaimEntity claimEntityListData) throws InterruptedException{
		insuredIntrestToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+claimEntityListData.getStringValueForField("InsuredInterestCode")+"')]"),"Insured Interest Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(insuredIntrestToBeSelectedLink);
		switchToWindow();
		switchToFrame("display");
	}
	//Type Of Loss
	public void clickOnTypeOfLossFindButton(ClaimEntity claimEntityListData) throws InterruptedException{
		if (claimEntityListData.getBooleanValueForField("ConfigTypepofLossFindButton")){
			click(typeOfLossFindButton);
			switchToWindow("Cause of Loss List");
		}
	}

	public void fillTypeOfLossSearch(ClaimEntity claimEntityListData) throws InterruptedException{
		clickOnTypeOfLossFindButton(claimEntityListData);

		if(claimEntityListData.getBooleanValueForField("ConfigTypepofLoss")){
			Thread.sleep(3000);
			clearAndSendKeys(typeOfLossTextFeild,claimEntityListData.getStringValueForField("TypepofLoss"));	
		}

		click(typeOfLossSecondFindButton);
		selectTypeOfLoss(claimEntityListData);
	}

	public void selectTypeOfLoss(ClaimEntity claimEntityListData) throws InterruptedException{
		typeOFLossBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+claimEntityListData.getStringValueForField("TypepofLoss")+"')]"),"Type of Loss to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(typeOFLossBeSelectedLink);
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}
	//Nature Of Loss
	public void clickOnNatureOfLossFindButton(ClaimEntity claimEntityListData) throws InterruptedException{
		if (claimEntityListData.getBooleanValueForField("ConfigNaturepofLossFindButton")){
			click(natureOfLossFindButton);
			switchToWindow("Nature of Loss List");
		}
	}
	public void fillNatureOfLossSearch(ClaimEntity claimEntityListData) throws InterruptedException{
		clickOnNatureOfLossFindButton(claimEntityListData);

		if(claimEntityListData.getBooleanValueForField("ConfigNatureofLoss")){
			Thread.sleep(3000);
			clearAndSendKeys(natureOfLossTextFeild,claimEntityListData.getStringValueForField("NatureofLoss"));	
		}
		click(natureOfLossSecondFindButton);
		selectNatureOfLoss(claimEntityListData);
	}

	public void selectNatureOfLoss(ClaimEntity claimEntityListData) throws InterruptedException{
		natureOFLossBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+claimEntityListData.getStringValueForField("NatureofLoss")+"')]"),"Nature of Loss to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(natureOFLossBeSelectedLink);
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}

	public void saveClaimDetails(ClaimEntity claimEntityListData,CustomAssert assertReference) throws InterruptedException {
		if (claimEntityListData.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			if(claimEntityListData.getAction().equalsIgnoreCase("add")){
				Thread.sleep(3000);
				fillClaimReserveBeforeIntimationDetails(claimEntityListData, assertReference);
				switchToFrame("display");
				fetchClaimNumber(claimEntityListData );				
			}
		}
	}
	public void processClaimDetails(ClaimEntity claimEntityListData) throws InterruptedException {
		if (claimEntityListData.getBooleanValueForField("ConfigProcessButton")) {
			click(processButton);
			fillReasonDetails(claimEntityListData);
			switchToFrame("display");
		}
	}
	public void rejectClaimDetails(ClaimEntity claimEntityListData) throws InterruptedException {
		if (claimEntityListData.getBooleanValueForField("ConfigRejectButtton")) {
			click(rejectButton);
			fillReasonDetails(claimEntityListData);
			switchToFrame("display");

		}
	}
	public void disputedClaimDetails(ClaimEntity claimEntityListData) throws InterruptedException {
		if (claimEntityListData.getBooleanValueForField("ConfigDisputedButton")) {
			click(disputedButton);
			try{
				acceptAlertAndReturnConfirmationMessage();
			}
			catch (Exception e){

			}

			fillReasonDetails(claimEntityListData);
			switchToFrame("display");
		}
	}

	public void documentStatusDetails(ClaimEntity claimEntityListData) {
		if (claimEntityListData.getBooleanValueForField("ConfigDocumentStatusButton")) {
			click(documentStatusButton);
			switchToFrame("display");

		}
	}

	public void submitReserveDetails(ClaimEntity claimEntityListData) throws InterruptedException{
		if (claimEntityListData.getBooleanValueForField("ConfigSaveReserveButton")){
		//	switchToDefaultFrame();
			click(saveWindowButton);
			Thread.sleep(3000);
			switchToWindow("Error Window");
			try{
				afterClickOnSaveButtonHandlePopup(claimEntityListData);
			}catch(Exception e){}
		}

	}


	public void clickCloseClaimDetails(ClaimEntity claimEntityListData) throws InterruptedException {
		if (claimEntityListData.getBooleanValueForField("ConfigCloseButton")) {
			click(closeButton);
			fillReasonDetails(claimEntityListData);
			switchToFrame("display");

		}
	}

	public void clickReopenClaimDetails(ClaimEntity claimEntityListData) throws InterruptedException {
		if (claimEntityListData.getBooleanValueForField("ConfigReopenButton")) {
			click(reopenButton);
			fillReasonDetails(claimEntityListData);
			switchToFrame("display");
		}
	}

	public void afterClickOnSaveButtonHandlePopup(ClaimEntity claimEntityListData) throws InterruptedException {
		switchToWindow("Error Window");
		if (claimEntityListData.getBooleanValueForField("ConfigCloseWindowButton")) {
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			isElementDisplayed(pageTitleAfterCreateReserve);
		}
	}

	public void fetchClaimNumber(ClaimEntity claimEntityListData) {
		claimEntityListData.setStringValueForField("ClaimNumber", fetchValueFromFields(claimNumberLabel));
	}


	private void verifyFinancialSummaryTable(ClaimEntity claimEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		List<FinancialSummaryTableEntity> financialSummaryTableEntityList = testData.getFinancialSummaryTableEntityRecords();

		for(FinancialSummaryTableEntity financialSummaryTableListData : financialSummaryTableEntityList){
			if(claimEntityListData.getStepGroup().equalsIgnoreCase(financialSummaryTableListData.getStepGroup())){
				if(claimEntityListData.getParentKey().equalsIgnoreCase(financialSummaryTableListData.getChildKey())){
					if(financialSummaryTableListData.getAction().equalsIgnoreCase("verify")){
						int TableRowNumber = financialSummaryTableListData.getIntegerValueForField("TableRowNumber");
						int datarow =TableRowNumber+1; 
						if (financialSummaryTableListData.getBooleanValueForField("ConfigSlNo")) {
							srNumber = new PageElement(By.xpath("(//td[contains(text(),'"+TableRowNumber+"')])[1]"), "Sl No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
							assertReference.assertEquals(financialSummaryTableListData.getStringValueForField("SlNo"),fetchValueFromFields(srNumber),AssertionType.WARNING);
						}
						if (financialSummaryTableListData.getBooleanValueForField("ConfigReserveType")) {
							reserveType = new PageElement(By.xpath("(//td[contains(text(),'"+TableRowNumber+"')])[1]//following::td[1]"), "Reserve Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
							assertReference.assertEquals(financialSummaryTableListData.getStringValueForField("ReserveType"),fetchValueFromFields(reserveType),AssertionType.WARNING);
						}
						if (financialSummaryTableListData.getBooleanValueForField("ConfigReserveAmount")) {
							amount = new PageElement(By.xpath("(//td[contains(text(),'"+TableRowNumber+"')])[1]//following::td[2]"), "Reserve Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
							assertReference.assertEquals(financialSummaryTableListData.getStringValueForField("ReserveAmount"),fetchValueFromFields(amount),AssertionType.WARNING);
						}
						if (financialSummaryTableListData.getBooleanValueForField("ConfigPaidAmount")) {
							paidAmount = new PageElement(By.xpath("(//td[contains(text(),'"+TableRowNumber+"')])[1]//following::td[3]"), "Paid Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
							assertReference.assertEquals(financialSummaryTableListData.getStringValueForField("PaidAmount"),fetchValueFromFields(paidAmount),AssertionType.WARNING);
						}
						if (financialSummaryTableListData.getBooleanValueForField("ConfigPendingAmount")) {
							pendingAmount = new PageElement(By.xpath("(//td[contains(text(),'"+TableRowNumber+"')])[1]//following::td[4]"), "Pending Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
							assertReference.assertEquals(financialSummaryTableListData.getStringValueForField("PendingAmount"),fetchValueFromFields(pendingAmount),AssertionType.WARNING);
						}
					}
				}
			}
		}
	}

	private void verifyClaimFollowUpEventsTable(ClaimEntity claimEntityListData, CustomAssert assertReference, ScenarioTestData testData) throws InterruptedException{
		int TableRowNumber = claimEntityListData.getIntegerValueForField("TableRowNumber");
		int datarow =TableRowNumber+1; 
		if (claimEntityListData.getBooleanValueForField("ConfigSlNo")) {
			srNumber = new PageElement(By.xpath("//form[1]/table[6]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[1]"), "Sl No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			assertReference.assertEquals(claimEntityListData.getStringValueForField("SlNo"),fetchValueFromFields(srNumber),AssertionType.WARNING);
		}
		if (claimEntityListData.getBooleanValueForField("ConfigClaimFollowUpEventsStaus")) {
			claimFollowUpEventsStaus = new PageElement(By.xpath("//form[1]/table[6]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[4]"), "ClaimFollowUpEventsStaus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			assertReference.assertEquals(claimEntityListData.getStringValueForField("ClaimFollowUpEventsStaus"),fetchValueFromFields(claimFollowUpEventsStaus),AssertionType.WARNING);
		}
		if (claimEntityListData.getBooleanValueForField("ConfigClaimFollowUpEventsRemarks")) {
			PageElement claimFollowUpEventsRemarks = new PageElement(By.xpath("//form[1]/table[6]/tbody/tr/td/table/tbody/tr["+datarow+"]/td[5]"), "ClaimFollowUpEventsRemarks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			assertReference.assertEquals(claimEntityListData.getStringValueForField("ClaimFollowUpEventsRemarks"),fetchValueFromFields(claimFollowUpEventsRemarks),AssertionType.WARNING);
		}
	}



	public void fillandSubmitClaimDetails(ClaimEntity claimEntityListData, CustomAssert assertReference,ScenarioTestData testData)throws InterruptedException {
		if (isConfigTrue(claimEntityListData.getConfigExecute())){
			switchToFrame("display");
			fillClaimDetails(claimEntityListData, assertReference,testData);
			saveClaimDetails(claimEntityListData,assertReference);
			navigateToClaimTab(claimEntityListData);
			navigateToInsuredItemTab(claimEntityListData);
			navigateToMemberTab(claimEntityListData);
			navigateToDocumentTab(claimEntityListData);
			navigateToPartiesTab(claimEntityListData);
			navigateToReserveTab(claimEntityListData);
			navigateToPaymentTab(claimEntityListData);
			navigateToAttributestTab(claimEntityListData);
			processClaimDetails(claimEntityListData);
			rejectClaimDetails(claimEntityListData);
			disputedClaimDetails(claimEntityListData);
			clickCloseClaimDetails(claimEntityListData);
			clickReopenClaimDetails(claimEntityListData);
			navigateTransferToAPButton(claimEntityListData);
			navigateToCloneClaimButton(claimEntityListData);
			navigateToCloneHistoryButton(claimEntityListData);
			documentStatusDetails(claimEntityListData);
			claimLitigationButton(claimEntityListData);
		}
	}
}
