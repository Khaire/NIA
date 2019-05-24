package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.JryDiscMNLEntity;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.PolInsIntAttRiskDet1Entity;
import com.aqm.staf.library.databin.PolicyAttributeHealthEntity;
import com.aqm.staf.library.databin.PolicyDocumentSearchEntity;

public class PolicyAttributeMiscNonLiability extends BasePage {

	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement forwordButton;
	private PageElement backButton;
	//FS-Yogesh
	private PageElement miscProductTypeDropDown;
	//OS-Yogesh
	private PageElement eProductDropDown;
	private PageElement typeOfPolicyDropDown;
	private PageElement nameOfInsurerDropDown;
	private PageElement previousPolicyNumberTextField;
	private PageElement previousPolicyPeriodFromTextField;
	private PageElement previousPolicyPeriodToTextField;
	private PageElement premiumPaidTextField;
	private PageElement totalNumberofClaimsRegisteredTextField;
	private PageElement claimsPaidTextField;
	private PageElement claimsIncurredTextField;
	private PageElement incurredClaimRatioTextField;
	private PageElement remarksTextField;
	private PageElement detailUnderwritingRequiredDropDown;
	private PageElement policySumInsuredTextField;
	private PageElement totalPremiumExcludingTerrorismTextField;
	private PageElement terrorismPremiumifapplicableTextField;
	private PageElement otherPolicyDetailsTextField;
	private PageElement anyPolicyNumberReferenceTextField;
	private PageElement locationDetails1TextField;
	private PageElement locationDetails2TextField;
	private PageElement locationDetails3TextField;
	private PageElement locationDetails4TextField;
	private PageElement addonCoverDetails1TextField;
	private PageElement addonCoverDetails2TextField;
	private PageElement addonCoverDetails3TextField;
	private PageElement addonCoverDetails4TextField;
	private PageElement excessforProvisionalPolicyTextField;
	private PageElement specialConditions1TextField;
	private PageElement specialConditions2TextField;
	private PageElement specialConditions3TextField;
	private PageElement specialConditions4TextField;
	private PageElement typeofDevelopmentOfficerDropDown;
	private PageElement policyTypeOfficeProtectionShieldDropDown;
	private PageElement typeOfOccupantDropDown;
	private PageElement renewalDiscountTextField;
	//BD-Yogesh
	private PageElement policyTypeBurglaryDeclarationDropDown;
	//BI--Rajkumar
	private PageElement specialEconomicZoneDropDown;
	private PageElement coInsuranceApplicableDropDown;
	//BN--Rajkumar
	private PageElement isthebusinessdirectDropDown;
	private PageElement discountforDirectBusinessTextField;
	//SK - Rajkumar
	private PageElement openButton;
	private PageElement serialNoTextFieldOfNextWindow;
	private PageElement  installmentPercentageTextFieldOfNextWindow; 
	private PageElement  deleteButtonOfNextWindow;
	private PageElement  saveButtonOfNextWindow;
	private PageElement  closeButtonOfNextWindow;
	private PageElement  policyDetailsTitle;
	//PB-Yogesh
	private PageElement whetherYouHadAHealthPolicyInThePastDropDown;
	private PageElement companyNameTextArea;
	private PageElement currentPolicyNumberTextField;
	private PageElement expiryDateOfTheLastPolicyTextField;
	private PageElement sumInsuredTextField;
	private PageElement dateOfFirstPolicyTextField;
	private PageElement howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField;
	private PageElement claimReceivedAndReportedAmountTextField;
	private PageElement doYouHaveMediclaim2007PolicyWithNewIndiaDropDown;
	private PageElement policyNumberTextField;
	private PageElement policyPeriodFromTextField;
	private PageElement policyPeriodToTextField;
	private PageElement sumInsuredRsTextField;
	private PageElement preExistingDiseasesTextArea;
	private PageElement expectedNoOfMonthsForEmploymentDropDown;

	//chintan
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement insuredInterestTab;	
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement insuredInterestTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberCoverageTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement memberRelationsTitlePage;
	private PageElement memberPaymentListTitle;
	private PageElement insuredInterestCoverageTitle;
	private PageElement insuredInterestTabTitle;	
	private PageElement isThisIndianInterestAbroadPolicyDropDown;
	//SK
	private PageElement typeOfPolicyStockBrokersIndemnityDropDown;
	//EV
	private PageElement typeOfRiskForEventCancellationDropDown;
	private PageElement coverForOtherExtensionDropDown;
	//BA
	private PageElement typesOfPolicyBADropDown;
	//FS
	private PageElement miscProductTypeDropDownFS;
	private PageElement posApplicableDropDown;
	private PageElement POSApplicableHHDropDown;
	private PageElement policyTypeOfficeProtectionShieldDropDownOS;
	private PageElement typeOfOccupantDropDownOS;
	private PageElement typeofPolicyDropDownPB;

	public PolicyAttributeMiscNonLiability(WebDriver driver, String pageName,int rowCounts) {
		super(driver, pageName);
		statusLabel= new PageElement(By.xpath("//div/b[contains(text(),'Status')]/following::td"),"Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		policyholderLabel= new PageElement(By.xpath("//div/b[contains(text(),'Policyholder')]/following::td"),"Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		productLabel= new PageElement(By.xpath("//div/b[contains(text(),'Product')]/following::td"),"Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		isthebusinessdirectDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is the business direct')]/following::select"),"Is the business direct", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		discountforDirectBusinessTextField=new PageElement(By.xpath("//td/div[contains(text(),'Discount for Direct Business(%)')]/following::input"),"Discount for Direct Business", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//FS-Yogesh
		specialEconomicZoneDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Special Economic Zone')]/following::select"),"Special Economic Zone DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		coInsuranceApplicableDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Co-Insurance Applicable')]/following::select"),"Co-Insurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		miscProductTypeDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Misc Product Type')]/following::select"),"Misc Product Type DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	

		//OS-Yogesh
		eProductDropDown=new PageElement(By.xpath("//td/div[contains(text(),'E-Product')]/following::select"),"E-Product DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfPolicyDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of policy')]/following::select"),"Type Of Policy DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		nameOfInsurerDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Name of Insurer')]/following::select"),"Name Of Insurer DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyNumberTextField=new PageElement(By.xpath("//td/div[contains(text(),'Previous Policy Number')]/following::input"),"Previous Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodFromTextField=new PageElement(By.xpath("//td/div[contains(text(),'Previous Policy Period From')]/following::input"),"Previous Policy Period From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodToTextField=new PageElement(By.xpath("//td/div[contains(text(),'Previous Policy Period To')]/following::input"),"Previous Policy Period To Textfield", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumPaidTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium Paid')]/following::input"),"Premium Paid DropDown TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberofClaimsRegisteredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Number of Claims Registered')]/following::input"),"total Number of Claims Registered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidTextField=new PageElement(By.xpath("//td/div[contains(text(),'Claims Paid')]/following::input"),"Claims Paid TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Claims Incurred')]/following::input"),"Claims Incurred TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioTextField=new PageElement(By.xpath("//td/div[contains(text(),'Incurred Claim Ratio (%)')]/following::input"),"Incurred Claim Ratio Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksTextField=new PageElement(By.xpath("//td/div[contains(text(),'Remarks')]/following::TextArea"),"Remarks TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailUnderwritingRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Detail Underwriting Required')]/following::select"),"Detail Underwriting Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policySumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Policy Sum Insured')]/following::input"),"Policy Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalPremiumExcludingTerrorismTextField=new PageElement(By.xpath("//td/div[contains(text(),'Total Premium(excluding Terrorism)')]/following::input"),"Total Premium Excluding Terrorism TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		terrorismPremiumifapplicableTextField=new PageElement(By.xpath("//td/div[contains(text(),'Terrorism Premium(if applicable)')]/following::input"),"Terrorism Premium if applicable TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherPolicyDetailsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Other Policy Details')]/following::TextArea"),"Other Policy Details TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyPolicyNumberReferenceTextField=new PageElement(By.xpath("//td/div[contains(text(),'Any Policy Number Reference')]/following::input"),"any Policy Number Reference TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Location Details1')]/following::TextArea"),"Location Details1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Location Details2')]/following::TextArea"),"Location Details2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Location Details3')]/following::TextArea"),"Location Details3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationDetails4TextField=new PageElement(By.xpath("//td/div[contains(text(),'Location Details4')]/following::TextArea"),"Location Details4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetails1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Add on Cover Details1')]/following::TextArea"),"Add on Cover Details1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetails2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Add on Cover Details2')]/following::TextArea"),"Add on Cover Details2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetails3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Add on Cover Details3')]/following::TextArea"),"Add on Cover Details3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addonCoverDetails4TextField=new PageElement(By.xpath("//td/div[contains(text(),'Add on Cover Details4')]/following::TextArea"),"Add on Cover Details4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessforProvisionalPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Excess for Provisional Policy')]/following::TextArea"),"Excess for Provisional Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions1')]/following::TextArea"),"Special Conditions1 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions2')]/following::TextArea"),"Special Conditions2 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions3')]/following::TextArea"),"Special Conditions3 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditions4TextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions4')]/following::TextArea"),"Special Conditions4 TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeofDevelopmentOfficerDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Type of Development Officer')]/following::select"),"Type of Development Officer DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyTypeOfficeProtectionShieldDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type Office Protection Shield","select")),"Policy Type Office Protection Shield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfOccupantDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type Office Protection Shield","select")),"Policy Type Office Protection Shield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		renewalDiscountTextField=new PageElement(By.xpath("//td/div[contains(text(),'Renewal Discount')]/following::input"),"Renewal Discount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//BD-Yogesh
		policyTypeBurglaryDeclarationDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Policy Type Burglary Declaration')]/following::select"),"Policy Type Burglary Declaration DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//BI-Rajkumar
		specialEconomicZoneDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Economic Zone","select")),"Special Economic Zone DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Insurance Applicable","select")),"Co-Insurance Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BN--Rajkumar
		isthebusinessdirectDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is the business direct","select")),"Is the business direct DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		discountforDirectBusinessTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Discount for Direct Business(%)","input")),"Is the business direct DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//SK--Rajkumar
		openButton= new PageElement(By.xpath("//td//div[contains(text(),'Installment Percentage List')]/following::input"), "Open Button for New Window", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextFieldOfNextWindow= new PageElement(By.name("slNo0"+rowCounts+""), "SerialNo Of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageTextFieldOfNextWindow= new PageElement(By.name("Data_210784827092009_"+rowCounts+""), "InstallmentPercentageTextField of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//PB-Yogesh
		whetherYouHadAHealthPolicyInThePastDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Whether You Had A Health Policy in the Past')]/following::select"),"Whether You Had A Health Policy In The Past DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		companyNameTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Company Name')]/following::textArea"),"Company Name TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		currentPolicyNumberTextField=new PageElement(By.xpath("//td/div[contains(text(),'Current Policy Number')]/following::input"),"Current Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expiryDateOfTheLastPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Expiry Date of the Last Policy')]/following::input"),"Expiry Date Of The Last Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured')]/following::input"),"Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfFirstPolicyTextField=new PageElement(By.xpath("//td/div[contains(text(),'Date of First Policy')]/following::input"),"Date Of First Policy TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField=new PageElement(By.xpath("//td/div[contains(text(),'How many years you are covered under the Health policy in the Past')]/following::input"),"How Many Years You Are Covered Under The Health Policy In The Past TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimReceivedAndReportedAmountTextField=new PageElement(By.xpath("//td/div[contains(text(),'Claim Received and Reported Amount')]/following::input"),"Claim Received And Reported Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouHaveMediclaim2007PolicyWithNewIndiaDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Do you have Mediclaim 2007 Policy with New India')]/following::select"),"Do You Have Mediclaim 2007 Policy With New India DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		policyNumberTextField=new PageElement(By.xpath("//tr[11]//td/div[contains(text(),'Policy Number')]/following::input"),"Policy Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPeriodFromTextField=new PageElement(By.xpath("//tr//td/div[contains(text(),'Policy Period (From)')]/following::input"),"Policy Period From TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPeriodToTextField=new PageElement(By.xpath("//tr//td/div[contains(text(),'Policy Period (To)')]/following::input"),"Policy Period To TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredRsTextField=new PageElement(By.xpath("//tr//td/div[contains(text(),'Sum insured (Rs)')]/following::input"),"Sum Insured Rs TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		preExistingDiseasesTextArea=new PageElement(By.xpath("//tr//td/div[contains(text(),'Pre existing diseases')]/following::textArea"),"Pre Existing Diseases TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expectedNoOfMonthsForEmploymentDropDown=new PageElement(By.xpath("//tr//td/div[contains(text(),'Expected No. of Months for Employment')]/following::select"),"Expected No Of Months For Employment DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//old(modified)chintan
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTitle = new PageElement(By.linkText("Detail"), " InsuredInterestTitle ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(TextField(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),' List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isThisIndianInterestAbroadPolicyDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is this Indian Interest Abroad policy')]/following::select")," Is this Indian Interest Abroad policy Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//SK
		typeOfPolicyStockBrokersIndemnityDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Policy (Stock Brokers Indemnity)","select")),"Type of Policy (Stock Brokers Indemnity) DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		posApplicableDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("POS Applicable","select")),"POS Applicable DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BA
		typesOfPolicyBADropDown= new PageElement(By.xpath("//select[@name='propValues2']"),"Types Of Policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		miscProductTypeDropDownFS= new PageElement(By.xpath("//select[@name='propValues3']"),"Misc ProductTypeFS", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		POSApplicableHHDropDown=new PageElement(By.xpath("//select[@name='propValues1']"),"Misc ProductTypeFS", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//OS
		policyTypeOfficeProtectionShieldDropDownOS=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Type Office Protection Shield","select")),"Policy Type Office Protection Shield", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfOccupantDropDownOS=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Occupant","select")),"Type of Occupant", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofPolicyDropDownPB=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type Of Policy","select")),"Type Of Policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void fillPolicyAttributeMNLDetails(PolAttributeMNLEntity polAttributeMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirect")) {
				selectValueFromList(isthebusinessdirectDropDown, polAttributeMNLEntity.getStringValueForField("Isthebusinessdirect"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDiscountforDirectBusiness")) {
				clearAndSendKeys(discountforDirectBusinessTextField, polAttributeMNLEntity.getStringValueForField("DiscountforDirectBusiness"));
			}

			//FS-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigMiscProductType")) {
				selectValueFromList(miscProductTypeDropDown, polAttributeMNLEntity.getStringValueForField("MiscProductType"));
			}

			//OS-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigEProduct")) {
				selectValueFromList(eProductDropDown, polAttributeMNLEntity.getStringValueForField("EProduct"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				selectValueFromList(typeOfPolicyDropDown, polAttributeMNLEntity.getStringValueForField("TypeOfPolicy"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigNameOfInsurer")) {
				selectValueFromList(nameOfInsurerDropDown, polAttributeMNLEntity.getStringValueForField("NameOfInsurer"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				clearAndSendKeys(previousPolicyNumberTextField, polAttributeMNLEntity.getStringValueForField("PreviousPolicyNumber"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodFrom")){
				String previousPolicyPeriodFrom=RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PreviousPolicyPeriodFrom"));
				clearAndEnterDate(previousPolicyPeriodFromTextField, previousPolicyPeriodFrom);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodTo")){
				String previousPolicyPeriodTo=RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PreviousPolicyPeriodTo"));
				clearAndEnterDate(previousPolicyPeriodToTextField, previousPolicyPeriodTo);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPremiumPaid")) {
				clearAndSendKeys(premiumPaidTextField, polAttributeMNLEntity.getStringValueForField("PremiumPaid"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")) {
				clearAndSendKeys(totalNumberofClaimsRegisteredTextField, polAttributeMNLEntity.getStringValueForField("TotalNumberofClaimsRegistered"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigClaimsPaid")) {
				clearAndSendKeys(claimsPaidTextField, polAttributeMNLEntity.getStringValueForField("ClaimsPaid"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
				clearAndSendKeys(claimsIncurredTextField, polAttributeMNLEntity.getStringValueForField("ClaimsIncurred"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				clearAndSendKeys(incurredClaimRatioTextField, polAttributeMNLEntity.getStringValueForField("IncurredClaimRatio"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(remarksTextField, polAttributeMNLEntity.getStringValueForField("Remarks"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDetailUnderwritingRequired")) {
				selectValueFromList(detailUnderwritingRequiredDropDown, polAttributeMNLEntity.getStringValueForField("DetailUnderwritingRequired"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicySumInsured")) {
				clearAndSendKeys(policySumInsuredTextField, polAttributeMNLEntity.getStringValueForField("PolicySumInsured"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTotalPremiumExcludingTerrorism")) {
				clearAndSendKeys(totalPremiumExcludingTerrorismTextField, polAttributeMNLEntity.getStringValueForField("TotalPremiumExcludingTerrorism"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTerrorismPremiumifapplicable")) {
				clearAndSendKeys(terrorismPremiumifapplicableTextField, polAttributeMNLEntity.getStringValueForField("TerrorismPremiumifapplicable"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigOtherPolicyDetails")) {
				clearAndSendKeys(otherPolicyDetailsTextField, polAttributeMNLEntity.getStringValueForField("OtherPolicyDetails"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAnyPolicyNumberReference")) {
				clearAndSendKeys(anyPolicyNumberReferenceTextField, polAttributeMNLEntity.getStringValueForField("AnyPolicyNumberReference"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails1")) {
				clearAndSendKeys(locationDetails1TextField, polAttributeMNLEntity.getStringValueForField("LocationDetails1"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails2")) {
				clearAndSendKeys(locationDetails2TextField, polAttributeMNLEntity.getStringValueForField("LocationDetails2"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails3")) {
				clearAndSendKeys(locationDetails3TextField, polAttributeMNLEntity.getStringValueForField("LocationDetails3"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails4")) {
				clearAndSendKeys(locationDetails4TextField, polAttributeMNLEntity.getStringValueForField("LocationDetails4"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails1")) {
				clearAndSendKeys(addonCoverDetails1TextField, polAttributeMNLEntity.getStringValueForField("AddonCoverDetails1"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails2")) {
				clearAndSendKeys(addonCoverDetails2TextField, polAttributeMNLEntity.getStringValueForField("AddonCoverDetails2"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails3")) {
				clearAndSendKeys(addonCoverDetails3TextField, polAttributeMNLEntity.getStringValueForField("AddonCoverDetails3"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails4")) {
				clearAndSendKeys(addonCoverDetails4TextField, polAttributeMNLEntity.getStringValueForField("AddonCoverDetails4"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigExcessforProvisionalPolicy")) {
				clearAndSendKeys(excessforProvisionalPolicyTextField, polAttributeMNLEntity.getStringValueForField("ExcessforProvisionalPolicy"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				clearAndSendKeys(specialConditions1TextField, polAttributeMNLEntity.getStringValueForField("SpecialConditions1"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				clearAndSendKeys(specialConditions2TextField, polAttributeMNLEntity.getStringValueForField("SpecialConditions2"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions3")) {
				clearAndSendKeys(specialConditions3TextField, polAttributeMNLEntity.getStringValueForField("SpecialConditions3"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions4")) {
				clearAndSendKeys(specialConditions4TextField, polAttributeMNLEntity.getStringValueForField("SpecialConditions4"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeofDevelopmentOfficer")) {
				selectValueFromList(typeofDevelopmentOfficerDropDown, polAttributeMNLEntity.getStringValueForField("TypeofDevelopmentOfficer"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTypeOfficeProtectionShield")) {
				selectValueFromList(policyTypeOfficeProtectionShieldDropDown, polAttributeMNLEntity.getStringValueForField("PolicyTypeOfficeProtectionShield"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfOccupant")) {
				selectValueFromList(typeOfOccupantDropDown, polAttributeMNLEntity.getStringValueForField("TypeOfOccupant"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigRenewalDiscount")) {
				clearAndSendKeys(renewalDiscountTextField, polAttributeMNLEntity.getStringValueForField("RenewalDiscount"));
			}
			//BD-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTypeBurglaryDeclaration")) {
				selectValueFromList(policyTypeBurglaryDeclarationDropDown, polAttributeMNLEntity.getStringValueForField("PolicyTypeBurglaryDeclaration"));
			}
			//SK-Rajkumar-add add edit
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigInstallementPercentageList")) {
				fillInstallmentPercentageDetails(polAttributeMNLEntity);
			}
			//PB-Yogesh
			/*if (polAttributeMNLEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
				selectValueFromList(whetherYouHadAHealthPolicyInThePastDropDown, polAttributeMNLEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"));
			}*/
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigCompanyName")) {
				clearAndSendKeys(companyNameTextArea, polAttributeMNLEntity.getStringValueForField("CompanyName"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
				clearAndSendKeys(currentPolicyNumberTextField, polAttributeMNLEntity.getStringValueForField("CurrentPolicyNumber"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")){
				String expiryDateOfTheLastPolicy=RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("ExpiryDateOfTheLastPolicy"));
				clearAndEnterDate(expiryDateOfTheLastPolicyTextField, expiryDateOfTheLastPolicy);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polAttributeMNLEntity.getStringValueForField("SumInsured"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")){
				String dateOfFirstPolicy=RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("DateOfFirstPolicy"));
				clearAndEnterDate(dateOfFirstPolicyTextField, dateOfFirstPolicy);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigHowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast")) {
				clearAndSendKeys(howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField, polAttributeMNLEntity.getStringValueForField("HowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				clearAndSendKeys(claimReceivedAndReportedAmountTextField, polAttributeMNLEntity.getStringValueForField("ClaimReceivedAndReportedAmount"));
			}
			/*if (polAttributeMNLEntity.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
				selectValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown, polAttributeMNLEntity.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"));
			}*/
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNumberTextField, polAttributeMNLEntity.getStringValueForField("PolicyNumber"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyPeriodFrom")){
				String policyPeriodFrom=RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PolicyPeriodFrom"));
				clearAndEnterDate(policyPeriodFromTextField, policyPeriodFrom);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyPeriodTo")){
				String policyPeriodTo=RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PolicyPeriodTo"));
				clearAndEnterDate(policyPeriodToTextField, policyPeriodTo);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				clearAndSendKeys(sumInsuredRsTextField, polAttributeMNLEntity.getStringValueForField("SumInsuredRs"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreExistingDiseases")) {
				clearAndSendKeys(preExistingDiseasesTextArea, polAttributeMNLEntity.getStringValueForField("PreExistingDiseases"));
			}
			/*if (polAttributeMNLEntity.getBooleanValueForField("ConfigExpectedNoOfMonthsForEmployment")) {
				selectValueFromList(expectedNoOfMonthsForEmploymentDropDown, polAttributeMNLEntity.getStringValueForField("ExpectedNoOfMonthsForEmployment"));
			}*/

			//AKSHATA FS
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialEconomicZoneFS")){
				selectValueFromList(specialEconomicZoneDropDown,polAttributeMNLEntity.getStringValueForField("SpecialEconomicZoneFS"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigCoInsuranceApplicableFS")){
				selectValueFromList(coInsuranceApplicableDropDown, polAttributeMNLEntity.getStringValueForField("CoInsuranceApplicableFS"));
			}

			//Pravina BA
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfPolicyBA")) {
				selectValueFromList(typesOfPolicyBADropDown, polAttributeMNLEntity.getStringValueForField("TypeOfPolicyBA"));
			}

		}
		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PolicyHolder"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Product"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirect")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Isthebusinessdirect"), fetchValueFromList(isthebusinessdirectDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDiscountforDirectBusiness")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("DiscountforDirectBusiness"), fetchValueFromTextFields(discountforDirectBusinessTextField), AssertionType.WARNING);
			}

			//FS-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigMiscProductType")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("MiscProductType"), fetchValueFromList(miscProductTypeDropDown), AssertionType.WARNING);
			}
			//OS-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigEProduct")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("EProduct"), fetchValueFromList(eProductDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TypeOfPolicy"), fetchValueFromList(typeOfPolicyDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigNameOfInsurer")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("NameOfInsurer"), fetchValueFromList(nameOfInsurerDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreviousPolicyNumber")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PreviousPolicyNumber"), fetchValueFromTextFields(previousPolicyNumberTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodFrom")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PreviousPolicyPeriodFrom")) ,fetchValueFromTextFields(previousPolicyPeriodFromTextField),AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodTo")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PreviousPolicyPeriodTo")) ,fetchValueFromTextFields(previousPolicyPeriodToTextField),AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPremiumPaid")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PremiumPaid"), fetchValueFromTextFields(premiumPaidTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TotalNumberofClaimsRegistered"), fetchValueFromTextFields(totalNumberofClaimsRegisteredTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigClaimsPaid")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ClaimsPaid"), fetchValueFromTextFields(claimsPaidTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigClaimsIncurred")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ClaimsIncurred"), fetchValueFromTextFields(claimsIncurredTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIncurredClaimRatio")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("IncurredClaimRatio"), fetchValueFromTextFields(incurredClaimRatioTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDetailUnderwritingRequired")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("DetailUnderwritingRequired"), fetchValueFromList(detailUnderwritingRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicySumInsured")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PolicySumInsured"), fetchValueFromTextFields(policySumInsuredTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTotalPremiumExcludingTerrorism")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TotalPremiumExcludingTerrorism"), fetchValueFromTextFields(totalPremiumExcludingTerrorismTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTerrorismPremiumifapplicable")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TerrorismPremiumifapplicable"), fetchValueFromTextFields(terrorismPremiumifapplicableTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigOtherPolicyDetails")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("OtherPolicyDetails"), fetchValueFromTextFields(otherPolicyDetailsTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAnyPolicyNumberReference")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("AnyPolicyNumberReference"), fetchValueFromTextFields(anyPolicyNumberReferenceTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails1")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("LocationDetails1"), fetchValueFromTextFields(locationDetails1TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails2")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("LocationDetails2"), fetchValueFromTextFields(locationDetails2TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails3")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("LocationDetails3"), fetchValueFromTextFields(locationDetails3TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigLocationDetails4")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("LocationDetails4"), fetchValueFromTextFields(locationDetails4TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails1")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("AddonCoverDetails1"), fetchValueFromTextFields(addonCoverDetails1TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails2")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("AddonCoverDetails2"), fetchValueFromTextFields(addonCoverDetails2TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails3")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("AddonCoverDetails3"), fetchValueFromTextFields(addonCoverDetails3TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigAddonCoverDetails4")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("AddonCoverDetails4"), fetchValueFromTextFields(addonCoverDetails4TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigExcessforProvisionalPolicy")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ExcessforProvisionalPolicy"), fetchValueFromTextFields(excessforProvisionalPolicyTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions1")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SpecialConditions1"), fetchValueFromTextFields(specialConditions1TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions2")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SpecialConditions2"), fetchValueFromTextFields(specialConditions2TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions3")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SpecialConditions3"), fetchValueFromTextFields(specialConditions3TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialConditions4")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SpecialConditions4"), fetchValueFromTextFields(specialConditions4TextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeofDevelopmentOfficer")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TypeofDevelopmentOfficer"), fetchValueFromList(typeofDevelopmentOfficerDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTypeOfficeProtectionShield")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PolicyTypeOfficeProtectionShield"), fetchValueFromList(policyTypeOfficeProtectionShieldDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfOccupant")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TypeOfOccupant"), fetchValueFromList(typeOfOccupantDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigRenewalDiscount")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("RenewalDiscount"), fetchValueFromTextFields(renewalDiscountTextField), AssertionType.WARNING);
			}

			//BD-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTypeBurglaryDeclaration")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PolicyTypeBurglaryDeclaration"), fetchValueFromList(policyTypeBurglaryDeclarationDropDown), AssertionType.WARNING);
			}
			//BA-Rajkumar- verify
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirect")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Isthebusinessdirect"), fetchValueFromList(isthebusinessdirectDropDown), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageTextFieldOfNextWindow), AssertionType.WARNING);
			}
			//SK-Rajkumar- verify

			if(polAttributeMNLEntity.getBooleanValueForField("ConfigInstallementPercentageList")){
				verifyInstallementPercentageDetails(polAttributeMNLEntity,assertReference);			
			}
			//PB-Yogesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"), fetchValueFromList(whetherYouHadAHealthPolicyInThePastDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigCompanyName")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("CompanyName"), fetchValueFromTextFields(companyNameTextArea), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("CurrentPolicyNumber"), fetchValueFromTextFields(currentPolicyNumberTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("ExpiryDateOfTheLastPolicy")) ,fetchValueFromTextFields(expiryDateOfTheLastPolicyTextField),AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("DateOfFirstPolicy")) ,fetchValueFromTextFields(dateOfFirstPolicyTextField),AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigHowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("HowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast"), fetchValueFromTextFields(howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ClaimReceivedAndReportedAmount"), fetchValueFromTextFields(claimReceivedAndReportedAmountTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"), fetchValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyPeriodFrom")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PolicyPeriodFrom")) ,fetchValueFromTextFields(policyPeriodFromTextField),AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyPeriodTo")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polAttributeMNLEntity.getStringValueForField("PolicyPeriodTo")) ,fetchValueFromTextFields(policyPeriodToTextField),AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigSumInsuredRs")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SumInsuredRs"), fetchValueFromTextFields(sumInsuredRsTextField), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPreExistingDiseases")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PreExistingDiseases"), fetchValueFromTextFields(preExistingDiseasesTextArea), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigExpectedNoOfMonthsForEmployment")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ExpectedNoOfMonthsForEmployment"), fetchValueFromList(expectedNoOfMonthsForEmploymentDropDown), AssertionType.WARNING);
			}
			//BA
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfPolicyBA")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TypeOfPolicyBA"), fetchValueFromList(typesOfPolicyBADropDown), AssertionType.WARNING);
			}

		}
	}

	public void clickOnForwardButton(PolAttributeMNLEntity polAttributeMNLEntity){
		if (polAttributeMNLEntity.getBooleanValueForField("ConfigForwordButton")){
			click(forwordButton);
			switchToFrame("display");
			policyDetailsTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polAttributeMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyDetailsTitle);
		}
	}
	public void clickOnBackButton(PolAttributeMNLEntity polAttributeMNLEntity){
		if (polAttributeMNLEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
	}


	/*==========SK-Rajkumar=======*/

	/*code for going to new window*/

	public void clickToOpenButton(PolAttributeMNLEntity polAttributeMNLEntity) throws InterruptedException{
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigOpenNewWindowButton")){
			click(openButton);
			try{
				switchToWindow("Parameter List for Installment Percentage List");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Installment Percentage List");
			}
		}
	}

	public void fillInstallmentPercentageDetails(PolAttributeMNLEntity polAttributeMNLEntity) throws InterruptedException{
		clickToOpenButton(polAttributeMNLEntity);
		Thread.sleep(3000);
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigInstallmentPercentageOfNextWindow")){
			clearAndSendKeys(installmentPercentageTextFieldOfNextWindow,polAttributeMNLEntity.getStringValueForField("InstallmentPercentageOfNextWindow"));
		}
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
		}
		switchToWindow("Integrated Insurance Management System");
		switchToFrame("display");
	}

	public void verifyInstallementPercentageDetails(PolAttributeMNLEntity polAttributeMNLEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polAttributeMNLEntity);

		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigInstallmentPercentageOfNextWindow")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("InstallmentPercentageOfNextWindow"), fetchValueFromTextFields(installmentPercentageTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}
	//OLD(modified)chintan

	public void navigateToPolicyTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}
	public void navigateToAttributeTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToInsuredInterest(PolAttributeMNLEntity polAttributeMNLEntity){
		if (polAttributeMNLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverageTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}
	public void navigateToClientDetailTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){

			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(schemeDetailTitle);
		}
	}

	public void navigateToRelationsTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToDetailTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigDetailTab")){
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTitle);
		}
	}
	public void navigateToAttributesTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitlePage);
		}
	}
	public void navigateToAttachCoveragesTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestCoverageTitle));
			return;
		}
	}
	public void navigateToMemRelationsTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitlePage));
			return;
		}
	}
	public void navigateToMemPaymentsTab(PolAttributeMNLEntity polAttributeMNLEntity){
		if(polAttributeMNLEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(memberPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}

	private void fillBusinessDirectDetailsForBI(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){
			//BI-Rajkumar-add and edit
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialEconomicZone")){
				selectValueFromList(specialEconomicZoneDropDown,polAttributeMNLEntity.getStringValueForField("SpecialEconomicZone"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")){
				selectValueFromList(coInsuranceApplicableDropDown, polAttributeMNLEntity.getStringValueForField("CoInsuranceApplicable"));
			}

			//PB-Mangesh
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirectPB")) {
				selectValueFromList(isthebusinessdirectDropDown, polAttributeMNLEntity.getStringValueForField("Isthebusinessdirect"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDiscountforDirectBusinessPB")) {
				clearAndSendKeys(discountforDirectBusinessTextField, polAttributeMNLEntity.getStringValueForField("DiscountforDirectBusiness"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigPOSApplicable")){
				selectValueFromList(posApplicableDropDown, polAttributeMNLEntity.getStringValueForField("POSApplicable"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigMiscProductTypeFS")){
				selectValueFromList(miscProductTypeDropDownFS, polAttributeMNLEntity.getStringValueForField("MiscProductTypeFS"));
			}
			click(forwordButton);
		}
		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
			//BI-Rajkumar- verify
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialEconomicZone")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SpecialEconomicZone"), fetchValueFromList(specialEconomicZoneDropDown), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}	
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigDiscountforDirectBusinessPB")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("DiscountforDirectBusiness"), fetchValueFromTextFields(discountforDirectBusinessTextField), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirectPB")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Isthebusinessdirect"), fetchValueFromList(isthebusinessdirectDropDown), AssertionType.WARNING);
			}

			if(polAttributeMNLEntity.getBooleanValueForField("ConfigPOSApplicable")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("POSApplicable"), fetchValueFromList(posApplicableDropDown), AssertionType.WARNING);
			}	

			if(polAttributeMNLEntity.getBooleanValueForField("ConfigMiscProductTypeFS")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("MiscProductTypeFS"), fetchValueFromList(miscProductTypeDropDownFS), AssertionType.WARNING);
			}

			click(forwordButton);
		}
	}

	private void fillPolicyDetailsForPB(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){
			if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("PB")){
				if (polAttributeMNLEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
					selectValueFromList(whetherYouHadAHealthPolicyInThePastDropDown, polAttributeMNLEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"));
				}
				if (polAttributeMNLEntity.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
					selectValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown, polAttributeMNLEntity.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"));
				}
				if (polAttributeMNLEntity.getBooleanValueForField("ConfigExpectedNoOfMonthsForEmployment")) {
					selectValueFromList(expectedNoOfMonthsForEmploymentDropDown, polAttributeMNLEntity.getStringValueForField("ExpectedNoOfMonthsForEmployment"));
				}
				click(forwordButton);
		}
			}
		
		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){

			if(polAttributeMNLEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"), fetchValueFromList(whetherYouHadAHealthPolicyInThePastDropDown), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"), fetchValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown), AssertionType.WARNING);
			}	
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigExpectedNoOfMonthsForEmployment")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ExpectedNoOfMonthsForEmployment"), fetchValueFromList(expectedNoOfMonthsForEmploymentDropDown), AssertionType.WARNING);
			}

			click(forwordButton);
		}
	}


	private void fillPosPageHH(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("HH")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("GS")){
			if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){
				if (polAttributeMNLEntity.getBooleanValueForField("ConfigPOSHH")) {
					selectValueFromList(POSApplicableHHDropDown, polAttributeMNLEntity.getStringValueForField("POSApplicableHH"));
					//doubleClick(quoteNoLabel);
					click(forwordButton);
				}
			}
			else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
				if (polAttributeMNLEntity.getBooleanValueForField("ConfigPOSHH")) {
					assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("POSApplicableHH"), fetchValueFromList(POSApplicableHHDropDown), AssertionType.WARNING);
					click(forwordButton);
				}
			}
		}
	}
	private void fillTypeOfDevelopmentHidden(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){

			if(polAttributeMNLEntity.getBooleanValueForField("ConfigpolicyTypeOfficeProtectionShieldOS")){
				selectValueFromList(policyTypeOfficeProtectionShieldDropDownOS, polAttributeMNLEntity.getStringValueForField("policyTypeOfficeProtectionShieldOS"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigtypeOfOccupantOS")){
				selectValueFromList(typeOfOccupantDropDownOS, polAttributeMNLEntity.getStringValueForField("typeOfOccupantOS"));
			}
			click(forwordButton);
		}

		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigpolicyTypeOfficeProtectionShieldOS")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("policyTypeOfficeProtectionShieldOS"), fetchValueFromList(policyTypeOfficeProtectionShieldDropDownOS), AssertionType.WARNING);
			}

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigtypeOfOccupantOS")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("typeOfOccupantOS"), fetchValueFromList(typeOfOccupantDropDownOS), AssertionType.WARNING);
			}
			click(forwordButton);
		}
	}

	private void fillSpecialConditionForMiscNLDetails(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {

		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsThisIndianInterestAbroadPolicy")) {
				selectValueFromList(isThisIndianInterestAbroadPolicyDropDown, polAttributeMNLEntity.getStringValueForField("IsThisIndianInterestAbroadPolicy"));
				//doubleClick(quoteNoLabel);
			}
			if((polAttributeMNLEntity.getBooleanValueForField("ConfigEndorse"))){
				click(saveButtonOfNextWindow);
			}
			/*else
			{

				click(forwordButton);
				click(saveButtonOfNextWindow);
			}*/

		}

		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsThisIndianInterestAbroadPolicy")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("IsThisIndianInterestAbroadPolicy"), fetchValueFromList(isThisIndianInterestAbroadPolicyDropDown), AssertionType.WARNING);
			}
		}
	}
	private void fillPolicyDetailsTwo(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfPolicyStockBrokersIndemnity")) {
				selectValueFromList(typeOfPolicyStockBrokersIndemnityDropDown, polAttributeMNLEntity.getStringValueForField("TypeOfPolicyStockBrokersIndemnity"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialEconomicZoneMI")){
				selectValueFromList(specialEconomicZoneDropDown,polAttributeMNLEntity.getStringValueForField("SpecialEconomicZoneMI"));
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigCoInsuranceApplicableMI")){
				selectValueFromList(coInsuranceApplicableDropDown, polAttributeMNLEntity.getStringValueForField("CoInsuranceApplicableMI"));
			}

			click(forwordButton);
		}
		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigTypeOfPolicyStockBrokersIndemnity")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("TypeOfPolicyStockBrokersIndemnity"), fetchValueFromList(typeOfPolicyStockBrokersIndemnityDropDown), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigSpecialEconomicZoneMI")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("SpecialEconomicZoneMI"), fetchValueFromList(specialEconomicZoneDropDown), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigCoInsuranceApplicableMI")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("CoInsuranceApplicableMI"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			click(forwordButton);
		}
	}
	private void fillBusinessDirectDetails(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){


			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirectBA")) {
				selectValueFromList(isthebusinessdirectDropDown, polAttributeMNLEntity.getStringValueForField("IsthebusinessdirectBA"));
			}
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigDiscountforDirectBusinessBA")) {
				clearAndSendKeys(discountforDirectBusinessTextField, polAttributeMNLEntity.getStringValueForField("DiscountforDirectBusinessBA"));
			}

			click(forwordButton);
		}
		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigIsthebusinessdirectBA")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("IsthebusinessdirectBA"), fetchValueFromList(isthebusinessdirectDropDown), AssertionType.WARNING);
			}
			if(polAttributeMNLEntity.getBooleanValueForField("ConfigDiscountforDirectBusinessBA")){
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("DiscountforDirectBusinessBA"), fetchValueFromTextFields(discountforDirectBusinessTextField), AssertionType.WARNING);
			}

			click(forwordButton);
		}
	}


	private void fillPolicyTypeBD(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) {
		if(polAttributeMNLEntity.getAction().equalsIgnoreCase("add") || polAttributeMNLEntity.getAction().equalsIgnoreCase("edit")){

			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTypeBurglaryDeclarationBD")) {
				selectValueFromList(policyTypeBurglaryDeclarationDropDown, polAttributeMNLEntity.getStringValueForField("PolicyTypeBurglaryDeclarationBD"));
			}
			click(forwordButton);
		}
		else if(polAttributeMNLEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttributeMNLEntity.getBooleanValueForField("ConfigPolicyTypeBurglaryDeclarationBD")) {
				assertReference.assertEquals(polAttributeMNLEntity.getStringValueForField("PolicyTypeBurglaryDeclarationBD"), fetchValueFromList(policyTypeBurglaryDeclarationDropDown), AssertionType.WARNING);
			}
			click(forwordButton);
		}
	}


	/*=============SK-Rajkumar-Code-Page=====*/
	public void fillandSubmitPolicyAttributeMNLDetails(PolAttributeMNLEntity polAttributeMNLEntity,CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(polAttributeMNLEntity.getConfigExecute())){
			switchToFrame("display");
			if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BD")){
				fillPolicyTypeBD(polAttributeMNLEntity, assertReference);
			}
			if(!(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("FI"))){
				fillPolicyAttributeMNLDetails(polAttributeMNLEntity,assertReference);
				clickOnForwardButton(polAttributeMNLEntity);
			}
			if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SK")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("MI")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("GS")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("RK")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("RM")){
				fillPolicyDetailsTwo(polAttributeMNLEntity, assertReference);
			}
			if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BI")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("PB")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("FI")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("FS")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SE")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SH")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SK")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BA")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("HH")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("OS")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SY")){
				fillBusinessDirectDetailsForBI(polAttributeMNLEntity, assertReference);
				fillPolicyDetailsForPB(polAttributeMNLEntity, assertReference);
				}
				fillPosPageHH(polAttributeMNLEntity, assertReference);
			

			if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("OS")){
				fillTypeOfDevelopmentHidden(polAttributeMNLEntity, assertReference);
				fillSpecialConditionForMiscNLDetails(polAttributeMNLEntity, assertReference);
			}
			if(polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BA")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("FS")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("HH")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("MI")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("OS")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("BC")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("PB")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SE")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("RM")||polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SH")|| polAttributeMNLEntity.getStringValueForField("Product").equalsIgnoreCase("SY")){
				fillBusinessDirectDetails(polAttributeMNLEntity, assertReference);
			}
			navigateToPolicyTab(polAttributeMNLEntity);
			navigateToAttributeTab(polAttributeMNLEntity);
			navigateToInsuredInterest(polAttributeMNLEntity);
			navigateToCoverageTab(polAttributeMNLEntity);
			navigateToClientDetailTab(polAttributeMNLEntity);
			navigateToRelationsTab(polAttributeMNLEntity);
			navigateToPaymentsTab(polAttributeMNLEntity);
			navigateToFollowupTab(polAttributeMNLEntity);
			navigateToDocumentTab(polAttributeMNLEntity);
			navigateToDetailTab(polAttributeMNLEntity);
			navigateToAttributesTab(polAttributeMNLEntity);
			navigateToAttachCoveragesTab(polAttributeMNLEntity);
			navigateToRelationsTab(polAttributeMNLEntity);
			navigateToPaymentsTab(polAttributeMNLEntity);
		}
	}
}


