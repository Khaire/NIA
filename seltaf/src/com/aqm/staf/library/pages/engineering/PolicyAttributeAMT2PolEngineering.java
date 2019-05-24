package com.aqm.staf.library.pages.engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrAMT2POLEngEntity;
import com.aqm.staf.library.databin.PolAttributeEngEntity;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;

public class PolicyAttributeAMT2PolEngineering extends BasePage {
	private PageElement sumInsuredTextField;
	private PageElement	indemnityPeriodInMonthsTextField;
	private PageElement	agreedOptedTimeExcessInWeeksTextField;
	private PageElement	standardTimeExcessInWeeksTextField;
	private PageElement	factorReflectingTheAgreedTimeTextField;
	private PageElement	maximumProbableDelayMPDInMonthsTextField;
	private PageElement	factorsReflectingAnalysisOfBarChartDropDown;
	private PageElement factorReflectingTheMaximumIndemnityTextField;
	private PageElement	higherTimeExcessWeeksTextField;
	private PageElement premiumRateForMarineCargoALOPPercentageTextField;
	private PageElement specialConditionsTextField;

//old
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
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement nextArrowButton;
	private PageElement backButton;
	private PageElement nextPageTitle;
	private PageElement forwordButton;
	
	

	public PolicyAttributeAMT2PolEngineering(WebDriver driver, String pageName,int rowCounts) {
		super(driver, pageName);

		sumInsuredTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured')]/following::input"),"Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		indemnityPeriodInMonthsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Indemnity Period (in Months)')]/following::input"),"Indemnity Period (in Months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreedOptedTimeExcessInWeeksTextField=new PageElement(By.xpath("//td/div[contains(text(),'Agreed/Opted Time Excess(in weeks)')]/following::input"),"Agreed/Opted Time Excess(in weeks)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		standardTimeExcessInWeeksTextField=new PageElement(By.xpath("//td/div[contains(text(),'Standard Time Excess(in weeks)')]/following::input"),"Standard Time Excess(in weeks)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorReflectingTheAgreedTimeTextField=new PageElement(By.xpath("//td/div[contains(text(),'Factor reflecting the agreed time excess compared to standard time excess')]/following::textarea"),"Factor reflecting the agreed time excess compared to standard time excess", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		maximumProbableDelayMPDInMonthsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Maximum Probable Delay(MPD)(In Months)')]/following::input"),"Maximum Probable Delay(MPD)(In Months)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		factorsReflectingAnalysisOfBarChartDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Factors reflecting analysis of Bar chart')]/following::select"),"Factors reflecting analysis of Bar chart'", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		factorReflectingTheMaximumIndemnityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Factor Reflecting the maximum indemnity period and the maximum probable delay')]/following::input"),"Factor Reflecting the maximum indemnity period and the maximum probable delay", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		higherTimeExcessWeeksTextField=new PageElement(By.xpath("//td/div[contains(text(),'Higher Time Excess(weeks)')]/following::input"),"Higher Time Excess(weeks)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumRateForMarineCargoALOPPercentageTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium Rate for Marine Cargo ALOP(%)')]/following::input"),"", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Special Conditions')]/following::textarea"),"Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
	
		//old(modified)chintan
				policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

				policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
				schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				insuredInterestTitle = new PageElement(By.linkText("Detail"), " InsuredInterestTitle ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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

				nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
				backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
				quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
	}
	
	public void fillPolicyAttributeAMT2PolEngineeringDetails(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity, CustomAssert assertReference) throws InterruptedException{

		//*************ER(CHINTAN)*********************
		if(polAttrAMT2POLEngEntity.getAction().equalsIgnoreCase("add") || polAttrAMT2POLEngEntity.getAction().equalsIgnoreCase("edit")){

			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polAttrAMT2POLEngEntity.getStringValueForField("SumInsured"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				clearAndSendKeys(indemnityPeriodInMonthsTextField, polAttrAMT2POLEngEntity.getStringValueForField("IndemnityPeriodInMonths"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessInWeeks")) {
				clearAndSendKeys(agreedOptedTimeExcessInWeeksTextField, polAttrAMT2POLEngEntity.getStringValueForField("AgreedOptedTimeExcessInWeeks"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigStandardTimeExcessInWeeks")) {
				clearAndSendKeys(standardTimeExcessInWeeksTextField, polAttrAMT2POLEngEntity.getStringValueForField("StandardTimeExcessInWeeks"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFactorReflectingTheAgreedTime")) {
				clearAndSendKeys(factorReflectingTheAgreedTimeTextField, polAttrAMT2POLEngEntity.getStringValueForField("FactorReflectingTheAgreedTime"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigMaximumProbableDelayMPDInMonths")) {
				clearAndSendKeys(maximumProbableDelayMPDInMonthsTextField, polAttrAMT2POLEngEntity.getStringValueForField("MaximumProbableDelayMPDInMonths"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFactorsReflectingAnalysisOfBarChart")) {
				selectValueFromList(factorsReflectingAnalysisOfBarChartDropDown, polAttrAMT2POLEngEntity.getStringValueForField("FactorsReflectingAnalysisOfBarChar"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFactorReflectingTheMaximumIndemnity")) {
				clearAndSendKeys(factorReflectingTheMaximumIndemnityTextField, polAttrAMT2POLEngEntity.getStringValueForField("FactorReflectingTheMaximumIndemnity"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigHigherTimeExcessWeeks")) {
				clearAndSendKeys(higherTimeExcessWeeksTextField, polAttrAMT2POLEngEntity.getStringValueForField("HigherTimeExcessWeeks"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigPremiumRateForMarineCargoALOPPercentage")) {
				clearAndSendKeys(premiumRateForMarineCargoALOPPercentageTextField, polAttrAMT2POLEngEntity.getStringValueForField("PremiumRateForMarineCargoALOPPercentage"));
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextField, polAttrAMT2POLEngEntity.getStringValueForField("SpecialConditions"));
			}

		}
		else if(polAttrAMT2POLEngEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigIndemnityPeriodInMonths")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("IndemnityPeriodInMonths"), fetchValueFromTextFields(indemnityPeriodInMonthsTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigAgreedOptedTimeExcessInWeeks")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("AgreedOptedTimeExcessInWeeks"), fetchValueFromTextFields(agreedOptedTimeExcessInWeeksTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigStandardTimeExcessInWeeks")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("StandardTimeExcessInWeeks"), fetchValueFromTextFields(standardTimeExcessInWeeksTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFactorReflectingTheAgreedTime")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("FactorReflectingTheAgreedTimeExcess"), fetchValueFromTextFields(factorReflectingTheAgreedTimeTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigMaximumProbableDelayMPDInMonths")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("MaximumProbableDelayMPDInMonths"), fetchValueFromTextFields(maximumProbableDelayMPDInMonthsTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFactorsReflectingAnalysisOfBarChart")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("FactorsReflectingAnalysisOfBarChart"), fetchValueFromList(factorsReflectingAnalysisOfBarChartDropDown), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFactorReflectingTheMaximumIndemnity")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("FactorReflectingTheMaximumIndemnity"), fetchValueFromTextFields(factorReflectingTheMaximumIndemnityTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigHigherTimeExcessWeeks")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("HigherTimeExcessWeeks"), fetchValueFromTextFields(higherTimeExcessWeeksTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigPremiumRateForMarineCargoALOPPercentage")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("PremiumRateForMarineCargoALOPPercentage"), fetchValueFromTextFields(premiumRateForMarineCargoALOPPercentageTextField), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			
			//old
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("PolicyHolderName"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrAMT2POLEngEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}

		}
	}
	//OLD(modified)chintan

		public void navigateToPolicyTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigPolicyTab")) {
				click(policyTitle);
				switchToFrame("display");
				isElementDisplayed(policyQuoteDetailsTitlePage);
			}
		}
		public void navigateToAttributeTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigAttributeTab")){
				click(attributeTitle);
				switchToFrame("display");
				isElementDisplayed(policyAttributesTitlePage);
			}
		}
		public void navigateToInsuredInterest(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
				click(insuredInterestTab);
				switchToFrame("display");
				isElementDisplayed(insuredInterestTabTitle);
			}
		}
		public void navigateToCoverageTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigCoverageTab")){
				click(coverageTitle);
				switchToFrame("display");
				isElementDisplayed(policyCoverageListTitlePage);
			}
		}
		public void navigateToClientDetailTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigClientDetailsTab")){

				click(clientDetailsTitle);
				switchToFrame("display");
				isElementDisplayed(schemeDetailTitle);
			}
		}

		public void navigateToRelationsTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigRelationsTab")){
				click(relationsTitle);
				switchToFrame("display");
				isElementDisplayed(policyRelationsTitle);
			}
		}
		public void navigateToPaymentsTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigPaymentsTab")){
				click(paymentsTitle);
				switchToFrame("display");
				isElementDisplayed(policyPaymentListTitle);
			}
		}
		public void navigateToFollowupTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigFollowupTab")){
				click(followupTitle);
				switchToFrame("display");
				isElementDisplayed(quotePolicyTitle);
			}
		}
		public void navigateToDocumentTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigDocumentTab")){
				click(documentTitle);
				switchToFrame("display");
				isElementDisplayed(policyDocumentTitle);
			}
		}

		public void navigateToDetailTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigDetailTab")){
				click(insuredInterestTitle);
				switchToFrame("display");
				isElementDisplayed(insuredInterestTitle);
			}
		}
		public void navigateToAttributesTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigAttributesTab")){
				click(memberAttributesTitle);
				switchToFrame("display");
				isElementDisplayed(memberAttributesTitlePage);
			}
		}
		public void navigateToAttachCoveragesTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
				click(memberAttachCoveragesTitle);
				switchToFrame("display");
				if(isElementDisplayed(insuredInterestCoverageTitle));
				return;
			}
		}
		public void navigateToMemRelationsTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
				click(memberAttachCoveragesTitle);
				switchToFrame("display");
				if(isElementDisplayed(memberRelationsTitlePage));
				return;
			}
		}
		public void navigateToMemPaymentsTab(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if(polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
				click(memberPaymentsTitle);
				switchToFrame("display");
				if(isElementDisplayed(memberPaymentListTitle));
				return;
			}
		}
		public void clickOnForwardButton(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity){
			if (polAttrAMT2POLEngEntity.getBooleanValueForField("ConfigForwordButton")){
				click(forwordButton);
				switchToFrame("display");
				//if(isElementDisplayed(policyQuoteDetailsTitlePage));
				return;
			}

		}


		public void fillandSubmitAttributeEngineeringAMT2PolEngineeringDetails(PolAttrAMT2POLEngEntity polAttrAMT2POLEngEntity, CustomAssert assertReference) throws InterruptedException {
			if (isConfigTrue(polAttrAMT2POLEngEntity.getConfigExecute())){
				switchToFrame("display");
				fillPolicyAttributeAMT2PolEngineeringDetails(polAttrAMT2POLEngEntity, assertReference);
				clickOnForwardButton(polAttrAMT2POLEngEntity);
				navigateToPolicyTab(polAttrAMT2POLEngEntity);
				navigateToAttributeTab(polAttrAMT2POLEngEntity);
				navigateToInsuredInterest(polAttrAMT2POLEngEntity);
				navigateToCoverageTab(polAttrAMT2POLEngEntity);
				navigateToClientDetailTab(polAttrAMT2POLEngEntity);
				navigateToRelationsTab(polAttrAMT2POLEngEntity);
				navigateToPaymentsTab(polAttrAMT2POLEngEntity);
				navigateToFollowupTab(polAttrAMT2POLEngEntity);
				navigateToDocumentTab(polAttrAMT2POLEngEntity);
				navigateToDetailTab(polAttrAMT2POLEngEntity);
				navigateToAttributesTab(polAttrAMT2POLEngEntity);
				navigateToAttachCoveragesTab(polAttrAMT2POLEngEntity);
				navigateToPaymentsTab(polAttrAMT2POLEngEntity);
			}
		}
	}

