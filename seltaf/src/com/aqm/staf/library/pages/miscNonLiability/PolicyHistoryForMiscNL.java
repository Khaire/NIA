package com.aqm.staf.library.pages.miscNonLiability;

//import org.bouncycastle.crypto.prng.RandomGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttributeMNLEntity;
import com.aqm.staf.library.databin.PolHistoryForMiscNLEntity;

public class PolicyHistoryForMiscNL extends BasePage {

	//private PageElement policyHistoryForMiscNLLabel ;
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyHolderLabel;
	private PageElement productLabel;	
	private PageElement typeOfPolicyDropDown;
	private PageElement nameOfInsurerDropDown;	
	private PageElement premiumPaidTextField;
	private PageElement totalNumberofClaimsRegisteredTextField;
	private PageElement claimsPaidTextField;
	private PageElement claimsIncurredTextField;
	private PageElement previousPolicyPeriodFromDateTextField;
	private PageElement previousPolicyPeriodToDateTextField;	
	private PageElement incurredClaimRatioTextField;
	private PageElement remarksTextField;
	private PageElement forwardButton;

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
	private PageElement policyHistoryForMiscNLTabTitle;
	
	
	public PolicyHistoryForMiscNL(WebDriver driver,String PageName){
		super(driver,PageName);

		quoteNoLabel=new PageElement(By.xpath("//div//b[contains(text(),'Quote No.')]/following::td"), "Quote No Label Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel=new PageElement(By.xpath("//div//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel=new PageElement(By.xpath("//div//b[contains(text(),'Policyholder')]/following::td"), " Policyholder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel=new PageElement(By.xpath("//div//b[contains(text(),'Product')]/following::td"), " Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of policy')]/following::select"), " Type of policy Select", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfInsurerDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Name of Insurer')]/following::select"), " Name of Insurer Select", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousPolicyPeriodFromDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Period From')]/following::input"), " Previous Policy Period From DateField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyPeriodToDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Previous Policy Period To')]/following::input"), "Previous Policy Period To DateField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumPaidTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Paid')]/following::input"), " Premium Paid TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalNumberofClaimsRegisteredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Number of Claims Registered')]/following::input"), " Total Number of Claims Registered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsPaidTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claims Paid')]/following::input"), " Claims Paid TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimsIncurredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claims Incurred')]/following::input"), " Claims Incurred TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		incurredClaimRatioTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Incurred Claim Ratio (%)')]/following::input"), " Incurred Claim Ratio (%) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		remarksTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Remarks')]/following::TextArea"), " Remarks TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//previousButton=new PageElement(By.name("previousButton"), "Go to Previous Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);		
		//backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
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
		policyHistoryForMiscNLTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy History for Misc NL')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
	}

	public void fillpolicyAttributeHealthDetails(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyHistoryForMiscNLEntity.getAction().equalsIgnoreCase("add") || policyHistoryForMiscNLEntity.getAction().equalsIgnoreCase("edit")){			
			if (policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				selectValueFromList(typeOfPolicyDropDown, policyHistoryForMiscNLEntity.getStringValueForField("TypeOfPolicy"));
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigNameOfInsurer")){
				selectValueFromList(nameOfInsurerDropDown,policyHistoryForMiscNLEntity.getStringValueForField("NameOfInsurer") );
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodFromDate")){
				String fromDate=RandomCodeGenerator.dateGenerator(policyHistoryForMiscNLEntity.getStringValueForField("PreviousPolicyPeriodFromDate"));
				clearAndEnterDate(previousPolicyPeriodFromDateTextField,fromDate);
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodToDate")){
				String toDate=RandomCodeGenerator.dateGenerator(policyHistoryForMiscNLEntity.getStringValueForField("PreviousPolicyPeriodToDate"));
				clearAndEnterDate(previousPolicyPeriodToDateTextField, toDate);
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPremiumPaid")){
				clearAndSendKeys(premiumPaidTextField, policyHistoryForMiscNLEntity.getStringValueForField("PremiumPaid"));
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")){
				clearAndSendKeys(totalNumberofClaimsRegisteredTextField, policyHistoryForMiscNLEntity.getStringValueForField("TotalNumberofClaimsRegistered"));
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigClaimsPaid")){
				clearAndSendKeys(claimsPaidTextField, policyHistoryForMiscNLEntity.getStringValueForField("ClaimsPaid"));
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigClaimsIncurred")){
				clearAndSendKeys(claimsIncurredTextField, policyHistoryForMiscNLEntity.getStringValueForField("claimsIncurred"));
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigRemarks")){
				clearAndSendKeys(remarksTextField, policyHistoryForMiscNLEntity.getStringValueForField("Remarks"));
			}
		}
		else if(policyHistoryForMiscNLEntity.getAction().equalsIgnoreCase("verify")){
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigQuoteNoLabel")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigStatusLabel")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigpolicyHolderLabel")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("PolicyHolderLabel"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}			

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigproductLabel")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}	

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigTypeOfPolicy")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("TypeOfPolicy"), fetchValueFromList(typeOfPolicyDropDown), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigNameOfInsurer")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("NameOfInsurer"), fetchValueFromList(nameOfInsurerDropDown), AssertionType.WARNING);
			}		

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodFromDate")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("PreviousPolicyPeriodFromDate"), fetchValueFromTextFields(previousPolicyPeriodFromDateTextField), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPreviousPolicyPeriodToDate")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("PreviousPolicyPeriodToDate"), fetchValueFromTextFields(previousPolicyPeriodToDateTextField), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPremiumPaid")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("PremiumPaid"), fetchValueFromTextFields(premiumPaidTextField), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigTotalNumberofClaimsRegistered")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("TotalNumberofClaimsRegistered"), fetchValueFromTextFields(totalNumberofClaimsRegisteredTextField), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigClaimsPaid")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("ClaimsPaid"), fetchValueFromTextFields(claimsPaidTextField), AssertionType.WARNING);
			}

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigClaimsIncurred")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("ClaimsIncurred"), fetchValueFromTextFields(claimsIncurredTextField), AssertionType.WARNING);
			}	

			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigRemarks")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksTextField), AssertionType.WARNING);
			}
			if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigIncurredClaimRatio")){
				assertReference.assertEquals(policyHistoryForMiscNLEntity.getStringValueForField("IncurredClaimRatio"), fetchValueFromTextFields(incurredClaimRatioTextField), AssertionType.WARNING);
			}
		}
	}

	public void clickForwardButton(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigForwardButton")){
			if(!(policyHistoryForMiscNLEntity.getStringValueForField("Product").equalsIgnoreCase("SK")))
			{
			click(forwardButton);
			}
			switchToFrame("display");
			policyHistoryForMiscNLTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+policyHistoryForMiscNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyHistoryForMiscNLTabTitle);
		}
	}

	public void navigateToPolicyTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if (policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}
	public void navigateToAttributeTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToInsuredInterest(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if (policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigInsuredInterestTab")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverageTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}
	public void navigateToClientDetailTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigClientDetailsTab")){

			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(schemeDetailTitle);
		}
	}

	public void navigateToRelationsTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToDetailTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigDetailTab")){
			click(insuredInterestTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTitle);
		}
	}
	public void navigateToAttributesTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitlePage);
		}
	}
	public void navigateToAttachCoveragesTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToMemRelationsTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitlePage);
			
		}
	}
	public void navigateToMemPaymentsTab(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity){
		if(policyHistoryForMiscNLEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(memberPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
		}
	}
	
	public void fillAndSubmitPolHistoryDetail(PolHistoryForMiscNLEntity policyHistoryForMiscNLEntity,CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(policyHistoryForMiscNLEntity.getConfigExecute())){
			fillpolicyAttributeHealthDetails(policyHistoryForMiscNLEntity, assertReference);
			clickForwardButton(policyHistoryForMiscNLEntity);
			navigateToPolicyTab(policyHistoryForMiscNLEntity);
			navigateToAttributeTab(policyHistoryForMiscNLEntity);
			navigateToInsuredInterest(policyHistoryForMiscNLEntity);
			navigateToCoverageTab(policyHistoryForMiscNLEntity);
			navigateToClientDetailTab(policyHistoryForMiscNLEntity);
			navigateToRelationsTab(policyHistoryForMiscNLEntity);
			navigateToPaymentsTab(policyHistoryForMiscNLEntity);
			navigateToFollowupTab(policyHistoryForMiscNLEntity);
			navigateToDocumentTab(policyHistoryForMiscNLEntity);
			navigateToDetailTab(policyHistoryForMiscNLEntity);
			navigateToAttributesTab(policyHistoryForMiscNLEntity);
			navigateToAttachCoveragesTab(policyHistoryForMiscNLEntity);
			navigateToRelationsTab(policyHistoryForMiscNLEntity);
			navigateToPaymentsTab(policyHistoryForMiscNLEntity);
		}
	}
}
