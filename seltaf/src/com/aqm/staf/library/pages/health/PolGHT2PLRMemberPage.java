package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolGHT1PLRMemberEntity;
import com.aqm.staf.library.databin.PolGHT2PLRMemberEntity;
import com.aqm.staf.library.databin.PolicyAttrGstUpdateEntity;
import com.aqm.staf.library.pages.common.PolicySearchPage;

public class PolGHT2PLRMemberPage extends BasePage {

	private PageElement nextPageTitle;
	private PageElement polGHT2PLRMemberPageTitle;
	private PageElement polBPMCRateChart23MemberPageTitle;

	//PageTabs
	private PageElement policyTab;
	private PageElement attributesTab;
	private PageElement insuredInterestTab;
	private PageElement coverageTab;
	private PageElement loanTab;
	private PageElement clientDetailsTab;
	private PageElement relationsTab;
	private PageElement paymentsTab;
	private PageElement followupTab;
	private PageElement documentTab;
	private PageElement memberDetailsTab;
	private PageElement memberAttributesTab;
	private PageElement memberAttachCoveragesTab;
	private PageElement memberRelationsTab;
	private PageElement memberPaymentsTab;

	//Page Titles
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement followupPageTitle;
	private PageElement policyDocumentTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;

	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;

	//Question Answers
	private PageElement mcSumInsuredTextField;
	private PageElement cumulativeBonusTextField;
	private PageElement mcBasicPremiumTextField;

	//@MU-Priyanka

	private PageElement pA_SumInsuredTextField;
	private PageElement citiReferencNoforCardholderTextField;
	private PageElement citiReferenceNoforInsuredTextField;

	private PageElement forwardButton;
	private PageElement saveButton;
	private PageElement previousButton;



	public PolGHT2PLRMemberPage(WebDriver driver, String pageName) {
		super(driver, pageName);

		polGHT2PLRMemberPageTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'GH T2-PLR Member')]"), "Policy GH T2-PLR Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		polBPMCRateChart23MemberPageTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'BP MC Rate Chart 23')]"), "Policy GH BP MC Rate Chart 23 Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextPageTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'BP MC Rate Chart 23')]"), "Policy GH BP MC Rate Chart 23 Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//PageTabs
		policyTab = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab = new PageElement(By.linkText("Insured Interest"), "Insured Interest Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab = new PageElement(By.linkText("Coverage"), "Coverage Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab = new PageElement(By.xpath("//div//b[contains(text(),'Client Tab')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailsTab = new PageElement(By.linkText("Detail"), "Member Details Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTab=new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"),"Member Attributes Tab",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTab=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Member Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberRelationsTab= new PageElement(By.xpath("//div[@title='Relation']"), "Member Relations Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		memberPaymentsTab=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Member Payments Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Page Titles
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), " Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured InterestCode")), "Insured Interest Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredInterestSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "Insured Interest Serial No")), "Insured Interest Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		mcSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC_Sum Insured","input")), "MC Sum Insured TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cumulativeBonusTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus","input")), "Cumulative Bonus TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		mcBasicPremiumTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("MC Basic Premium","input")), "MC Basic Premium TextField",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//@MU-Priyanka

		pA_SumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("PA_Sum Insured", "input")), "PA_Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		citiReferencNoforCardholderTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Citi Reference No. for Cardholder", "input")), "Citi Reference No. for Cardholder Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		citiReferenceNoforInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Citi Reference No. for Insured", "input")), "Citi Reference No. for Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forwardButton=new PageElement(By.name("Next"), "forword Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}


	public void fillPolGHT2PLRMember(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity, CustomAssert assertReference) throws InterruptedException{
		if(polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			
	      if((polGHT2PLRMemberEntity.getAction().equalsIgnoreCase("add"))||(polGHT2PLRMemberEntity.getAction().equalsIgnoreCase("edit"))){
	    	  
	    	  if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPA_SumInsured")) {
	    		  clearAndSendKeys(pA_SumInsuredTextField, polGHT2PLRMemberEntity.getStringValueForField("PA_SumInsured"));  
	    	  }
	      
	    	  if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigCitiReferenceNoforCardholder")) {
	    		  clearAndSendKeys(citiReferencNoforCardholderTextField, polGHT2PLRMemberEntity.getStringValueForField("CitiReferenceNoforCardholder"));
	    	  }
	    	  if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigCitiReferenceNoforInsured")) {
	    		  clearAndSendKeys(citiReferenceNoforInsuredTextField, polGHT2PLRMemberEntity.getStringValueForField("CitiReferenceNoforInsured"));
	      }
	        }
			if (polGHT2PLRMemberEntity.getAction().equalsIgnoreCase("verify")) {

				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigMCSumInsured")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("MCSumInsured"), fetchValueFromTextFields(mcSumInsuredTextField),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigCumulativeBonus")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("CumulativeBonus"), fetchValueFromTextFields(cumulativeBonusTextField),AssertionType.WARNING);
				}

				//@MU-Priyanka

				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPA_SumInsured")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("PA_SumInsured"), fetchValueFromTextFields(pA_SumInsuredTextField), AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigCitiReferenceNoforCardholder")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("Citi Reference No. for Cardholder"), fetchValueFromTextFields(citiReferencNoforCardholderTextField), AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigCitiReferenceNoforInsured")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("Citi Reference No. for Insured"), fetchValueFromTextFields(citiReferenceNoforInsuredTextField), AssertionType.WARNING);
				}
			}
		}
	}

	public void fillPolBPMCRateChart23Member(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity, CustomAssert assertReference) throws InterruptedException{
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPrimaryInformationCheck")) {
			if(polGHT2PLRMemberEntity.getAction().equalsIgnoreCase("verify")){
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel),AssertionType.WARNING);
				}
				if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigMCBasicPremium")) {
					assertReference.assertEquals(polGHT2PLRMemberEntity.getStringValueForField("MCBasicPremium"), fetchValueFromTextFields(mcBasicPremiumTextField),AssertionType.WARNING);
				}
			}
		}
	}

	public void navigateToPolicyTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPolicyButton")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigAttributeButton")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToMemberTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigInsuredInterestButton")){		
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(policyMemberTitle);
		}
	}
	public void navigateToCoverageTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigCoverageButton")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}

	public void navigateToClientDetailsTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigClientDetailsButton")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigRelationsButton")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigPaymentsButton")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigFollowupButton")){	
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigDocumentButton")){	
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToMemberDetailTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(memberAttributesTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToMemberAttachCoverageTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(memberAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToMemberRelationsTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigMemberRelationsButton")){	
			click(memberRelationsTab);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToMemberPaymentsTab(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(memberPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}

	public void nextButtonPolGHT2PLRMemberPage(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){

		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			if(polGHT2PLRMemberEntity.getStringValueForField("Product").equalsIgnoreCase("GH")){	
				driver.navigate().back();
				click(previousButton);
				click(forwardButton);
				click(forwardButton);
			}
			switchToFrame("display");
		}
	}
	public void saveButtonPolBPMCRateChart23Member(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity){
		if (polGHT2PLRMemberEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolGHT2PLRMember(PolGHT2PLRMemberEntity polGHT2PLRMemberEntity, CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(polGHT2PLRMemberEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolGHT2PLRMember(polGHT2PLRMemberEntity, assertReference);
			nextButtonPolGHT2PLRMemberPage(polGHT2PLRMemberEntity);
			fillPolBPMCRateChart23Member(polGHT2PLRMemberEntity, assertReference);
			saveButtonPolBPMCRateChart23Member(polGHT2PLRMemberEntity);
			navigateToPolicyTab(polGHT2PLRMemberEntity);
			navigateToAttributeTab(polGHT2PLRMemberEntity);
			navigateToMemberTab(polGHT2PLRMemberEntity);
			navigateToCoverageTab(polGHT2PLRMemberEntity);
			navigateToClientDetailsTab(polGHT2PLRMemberEntity);
			navigateToRelationsTab(polGHT2PLRMemberEntity);
			navigateToPaymentsTab(polGHT2PLRMemberEntity);
			navigateToFollowupTab(polGHT2PLRMemberEntity);
			navigateToDocumentTab(polGHT2PLRMemberEntity);
			navigateToMemberDetailTab(polGHT2PLRMemberEntity);
			navigateToMemberAttributesTab(polGHT2PLRMemberEntity);
			navigateToMemberAttachCoverageTab(polGHT2PLRMemberEntity);
			navigateToMemberRelationsTab(polGHT2PLRMemberEntity);
			navigateToMemberPaymentsTab(polGHT2PLRMemberEntity);

		}
	}


}
