package com.aqm.staf.library.pages.health;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimEntity;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;
import com.aqm.staf.library.databin.PreviousPolicyDataEntity;

public class PolicyMemberPreviousPolicyDataBH extends BasePage{
	private PageElement previousPolicyDataBHTitle;
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement fundTitle;

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;

	//Label
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;


	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailTitle;

	//BH-@Rasika
	private PageElement whetherYouHadAHealthPolicyInThePastDropDown;
	private PageElement companyNameOfThePreviousInsuranceCompanyTextField;
	private PageElement currentPolicyNumberTextField;
	private PageElement expiryDateOfTheLastPolicy;
	private PageElement sumInsuredTextField;
	private PageElement dateOfFirstPolicy;
	private PageElement howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField;
	private PageElement claimReceivedAndReportedAmountTextField;
	private PageElement categoryTypeForBHDropDown;
	private PageElement planTypeForBHDropDown;
	private PageElement doYouHaveMediclaim2007PolicyWithNewIndiaDropDown;
	private PageElement policyNumberTextField;
	private PageElement policyPeriodTextField;
	private PageElement sumInsuredForMemberDropDown;
	private PageElement detailsOfPreExistingDiseasesTextArea;

	private PageElement policyMemberDetailsBHT2PLRTitle;
	private PageElement nextButton;
	private PageElement nextPageTitle;

	//ES Abhijit

	private PageElement categoryTypeForESDropDown;
	private PageElement planTypeForESDropDown;
	private PageElement expectedNoOfMonthSForStudyOREmploymentTextField;
	private PageElement occupationForMediclaimMemberDropdown;
	private PageElement closeWindowButton;
	private PageElement closeWindowBtn;
	


	public PolicyMemberPreviousPolicyDataBH(WebDriver driver,String pageName) {
		super(driver, pageName);

		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " Member Fund Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quate number"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BH-@Rasika
		whetherYouHadAHealthPolicyInThePastDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether You Had A Health Policy in the Past","select")),"Whether You Had A Health Policy in the Past DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		companyNameOfThePreviousInsuranceCompanyTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Company name of the previous insurance company","input")),"Company name of the previous insurance company Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		currentPolicyNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Current Policy Number","input")),"Current Policy Number Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		expiryDateOfTheLastPolicy = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expiry Date of the Last Policy","input")),"Expiry Date of the Last Policy Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		sumInsuredTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured","input")),"Sum Insured Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		dateOfFirstPolicy = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of First Policy","input")),"Date of First Policy Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("How many years you are covered under the Health policy in the Past","input")),"How many years you are covered under the Health policy in the Past Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		claimReceivedAndReportedAmountTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Claim Received and Reported Amount","input")),"Claim Received and Reported Amount Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		categoryTypeForBHDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Category Type For BH","select")),"Category Type For BH Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		planTypeForBHDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Plan Type for BH","select")),"Plan Type for BH Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		doYouHaveMediclaim2007PolicyWithNewIndiaDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you have Mediclaim 2007 Policy with New India","select")),"Do you have Mediclaim 2007 Policy with New India Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		policyNumberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy Number","input")),"Policy Number Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		policyPeriodTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Policy period","input")),"Policy period Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		sumInsuredForMemberDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured For Member","select")),"Sum Insured For Member Text Field",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		detailsOfPreExistingDiseasesTextArea = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Pre-Existing diseases","textarea")),"Details of Pre-Existing diseases Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 

		nextButton= new PageElement(By.name("Next"), "Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		policyMemberDetailsBHT2PLRTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Member Details BH T2-PLR')]"), "Policy Member Details BH T2-PLR Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		////ES Abhijit
		categoryTypeForESDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Category Type For OE","select")),"Category Type For ES Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		planTypeForESDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Plan Type For OE","select")),"Plan Type For ES Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		expectedNoOfMonthSForStudyOREmploymentTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Expected No. of Months for Study/Employment","input")),"Expected No. of Months for Study/Employment ES Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		occupationForMediclaimMemberDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Occupation for Mediclaim Member","select")),"Occupation for Mediclaim Member ES Dropdown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10);

		closeWindowButton=new PageElement(By.name("CloseWin"), "Close Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeWindowBtn=new PageElement(By.name("Close"), "Close Message Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		
		 
	}

	//BH

	public void fillpolicyMemberPreviousPolicyData(PreviousPolicyDataEntity previousPolicyDataEntity, CustomAssert assertReference){
		if(previousPolicyDataEntity.getAction().equalsIgnoreCase("add") || previousPolicyDataEntity.getAction().equalsIgnoreCase("edit")){

			if (previousPolicyDataEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
				selectValueFromList(whetherYouHadAHealthPolicyInThePastDropDown, previousPolicyDataEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCompanyNameOfThePreviousInsuranceCompany")) {
				clearAndSendKeys(companyNameOfThePreviousInsuranceCompanyTextField, previousPolicyDataEntity.getStringValueForField("CompanyNameOfThePreviousInsuranceCompany"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
				clearAndSendKeys(currentPolicyNumberTextField, previousPolicyDataEntity.getStringValueForField("CurrentPolicyNumber"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")) {
				String ExpiryDate=RandomCodeGenerator.dateGenerator(previousPolicyDataEntity.getStringValueForField("ExpiryDateOfTheLastPolicy"));
				clearAndEnterDate(expiryDateOfTheLastPolicy, ExpiryDate);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, previousPolicyDataEntity.getStringValueForField("SumInsured"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
				String DateOfFirstPolicy=RandomCodeGenerator.dateGenerator(previousPolicyDataEntity.getStringValueForField("DateOfFirstPolicy"));
				clearAndEnterDate(dateOfFirstPolicy, DateOfFirstPolicy);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigHowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast")) {
				clearAndSendKeys(howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField, previousPolicyDataEntity.getStringValueForField("HowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				clearAndSendKeys(claimReceivedAndReportedAmountTextField, previousPolicyDataEntity.getStringValueForField("ClaimReceivedAndReportedAmount"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCategoryTypeForBH")) {
				selectValueFromList(categoryTypeForBHDropDown, previousPolicyDataEntity.getStringValueForField("CategoryTypeForBH"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPlanTypeForBH")) {
				selectValueFromList(planTypeForBHDropDown, previousPolicyDataEntity.getStringValueForField("PlanTypeForBH"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
				selectValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown, previousPolicyDataEntity.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				clearAndSendKeys(policyNumberTextField, previousPolicyDataEntity.getStringValueForField("PolicyNumber"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPolicyPeriod")) {
				clearAndSendKeys(policyPeriodTextField, previousPolicyDataEntity.getStringValueForField("PolicyPeriod"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigSumInsuredForMember")) {
				selectValueFromList(sumInsuredForMemberDropDown, previousPolicyDataEntity.getStringValueForField("SumInsuredForMember"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseases")) {
				clearAndSendKeys(detailsOfPreExistingDiseasesTextArea, previousPolicyDataEntity.getStringValueForField("DetailsOfPreExistingDiseases"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCategoryTypeForES")) {
				selectValueFromList(categoryTypeForESDropDown, previousPolicyDataEntity.getStringValueForField("CategoryTypeForES"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPlanTypeForES")) {
				selectValueFromList(planTypeForESDropDown, previousPolicyDataEntity.getStringValueForField("PlanTypeForES"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigExpectedNoofMonthsforStudyEmploymentES")) {
				clearAndSendKeys(expectedNoOfMonthSForStudyOREmploymentTextField, previousPolicyDataEntity.getStringValueForField("ExpectedNoofMonthsforStudyEmploymentES"));
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigOccupationforMediclaimMemberES")) {
				selectValueFromList(occupationForMediclaimMemberDropdown, previousPolicyDataEntity.getStringValueForField("OccupationforMediclaimMemberES"));
			}	
			
		}

		else if(previousPolicyDataEntity.getAction().equalsIgnoreCase("verify")){

			if (previousPolicyDataEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigWhetherYouHadAHealthPolicyInThePast")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("WhetherYouHadAHealthPolicyInThePast"), fetchValueFromList(whetherYouHadAHealthPolicyInThePastDropDown),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCompanyNameOfThePreviousInsuranceCompany")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("CompanyNameOfThePreviousInsuranceCompany"), fetchValueFromTextFields(companyNameOfThePreviousInsuranceCompanyTextField),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCurrentPolicyNumber")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("CurrentPolicyNumber"), fetchValueFromTextFields(currentPolicyNumberTextField),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigExpiryDateOfTheLastPolicy")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("ExpiryDateOfTheLastPolicy"), fetchValueFromTextFields(expiryDateOfTheLastPolicy),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigDateOfFirstPolicy")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("DateOfFirstPolicy"), fetchValueFromTextFields(dateOfFirstPolicy),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigHowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("HowManyYearsYouAreCoveredUnderTheHealthPolicyInThePast"), fetchValueFromTextFields(howManyYearsYouAreCoveredUnderTheHealthPolicyInThePastTextField),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigClaimReceivedAndReportedAmount")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("ClaimReceivedAndReportedAmount"), fetchValueFromTextFields(claimReceivedAndReportedAmountTextField),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCategoryTypeForBH")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("CategoryTypeForBH"), fetchValueFromList(categoryTypeForBHDropDown),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPlanTypeForBH")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("PlanTypeForBH"), fetchValueFromList(planTypeForBHDropDown), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigDoYouHaveMediclaim2007PolicyWithNewIndia")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("DoYouHaveMediclaim2007PolicyWithNewIndia"), fetchValueFromList(doYouHaveMediclaim2007PolicyWithNewIndiaDropDown), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("PolicyNumber"), fetchValueFromTextFields(policyNumberTextField), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPolicyPeriod")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("PolicyPeriod"), fetchValueFromTextFields(policyPeriodTextField), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigSumInsuredForMember")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("SumInsuredForMember"), fetchValueFromList(sumInsuredForMemberDropDown), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDiseases")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("DetailsOfPreExistingDiseases"), fetchValueFromTextFields(detailsOfPreExistingDiseasesTextArea), AssertionType.WARNING);
			}
			//ES Abhijit
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigCategoryTypeForES")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("CategoryTypeForES"), fetchValueFromList(categoryTypeForESDropDown),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigPlanTypeForES")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("PlanTypeForES"), fetchValueFromList(planTypeForESDropDown),AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigExpectedNoofMonthsforStudyEmploymentES")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("ExpectedNoofMonthsforStudyEmploymentES"), fetchValueFromTextFields(expectedNoOfMonthSForStudyOREmploymentTextField), AssertionType.WARNING);
			}
			if (previousPolicyDataEntity.getBooleanValueForField("ConfigOccupationforMediclaimMemberES")) {
				assertReference.assertEquals(previousPolicyDataEntity.getStringValueForField("OccupationforMediclaimMemberES"), fetchValueFromList(occupationForMediclaimMemberDropdown),AssertionType.WARNING);
			}

		}
	}



	public void navigateToPolicyTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToMemberTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberTitle);
		}
	}
	public void navigateToCoverageTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoanTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTitle);
			switchToFrame("display");
			isElementDisplayed(policyLoanTitle);
		}
	}
	public void navigateToClientDetailsTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigRelationsTab")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigFollowupTab")){	
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigDocumentTab")){	
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigDetailTab")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigMemberAttributesTab")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigAttachCoveragesTab")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToRelations1Tab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigRelationTab")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(PreviousPolicyDataEntity previousPolicyDataEntity){
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigMemberPaymentsTab")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}

	public void nextButtonPolicyMemberAttributehealth(PreviousPolicyDataEntity previousPolicyDataEntity) throws InterruptedException{
		if (previousPolicyDataEntity.getBooleanValueForField("ConfigNextButton")){		
			click(nextButton);
			Thread.sleep(9000);
			if(previousPolicyDataEntity.getStringValueForField("Product").equalsIgnoreCase("ES")){
				afterClickOnProceedButtonHandlePopup(previousPolicyDataEntity);
			}
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+previousPolicyDataEntity.getStringValueForField("PreviousPolicyDataTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}

	public void afterClickOnProceedButtonHandlePopup(PreviousPolicyDataEntity previousPolicyDataEntity) throws InterruptedException{
		if(!previousPolicyDataEntity.getAction().equalsIgnoreCase("verify")){
			switchToWindow("Error Window");
			click(closeWindowButton);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
		else{
			              
			switchAndCloseWindow();
			/*click(closeWindowBtn);*/
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolicyMemberPreviousPolicyData(PreviousPolicyDataEntity previousPolicyDataEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(previousPolicyDataEntity.getConfigExecute())){
			switchToFrame("display");
			fillpolicyMemberPreviousPolicyData(previousPolicyDataEntity, assertReference);
			nextButtonPolicyMemberAttributehealth(previousPolicyDataEntity);
			navigateToPolicyTab(previousPolicyDataEntity);
			navigateToAttributeTab(previousPolicyDataEntity);
			navigateToMemberTab(previousPolicyDataEntity);
			navigateToCoverageTab(previousPolicyDataEntity);
			navigateToLoanTab(previousPolicyDataEntity);
			navigateToClientDetailsTab(previousPolicyDataEntity);
			navigateToRelationsTab(previousPolicyDataEntity);
			navigateToPaymentsTab(previousPolicyDataEntity);
			navigateToFollowupTab(previousPolicyDataEntity);
			navigateToDocumentTab(previousPolicyDataEntity);
			navigateToDetailTab(previousPolicyDataEntity);
			navigateToMemberAttributesTab(previousPolicyDataEntity);
			navigateToAttachCoverageTab(previousPolicyDataEntity);
			navigateToRelations1Tab(previousPolicyDataEntity);
			navigateToPayments1Tab(previousPolicyDataEntity);

		}
	}
}