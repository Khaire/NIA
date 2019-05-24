package com.aqm.staf.library.pages.engineering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AttachCoverTerrorismCEntity;
import com.aqm.staf.library.databin.PolCovSectionDetailsEntity;
public class PolSectionDetailsEngineer extends BasePage{
	private PageElement policyTitle;
	private PageElement attributeTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;
	private PageElement attachCoveragesDetailTitle;
	private PageElement attachCoveragesAttributesTitle; 
	private PageElement attachCoveragesPremiumTitle;

	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberHomePageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement memberDetailPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;
	private PageElement attachCoveragesDetailsPageTitle;
	private PageElement attachCoveragesAttributesPageTitle;
	private PageElement attachCoveragesPremiumPageTitle;
	private PageElement netPremiumFilledbyHOOnlyTextField;
	private PageElement premiumChargeableTextField;
	private PageElement saveButton;
	private PageElement forwordButton;
	private PageElement attachCoveragesPremiumLinkForEng;
	//LE
	private PageElement attCoverTitle;
	private PageElement isThereAnyAddOnCoverExtAppForSectionIDropDown;
	private PageElement anyOtherAddonCoverReqDropDown;
	private PageElement minDedAmtSectIProjWorksTestPeriodTextField;
	private PageElement dedWordForSectIProjWorksTestPeriodTextArea;
	private PageElement minDedAmtSectIProjWorksAOGClaimsTextField;
	private PageElement dedWordForSectionIProjectWorksAOGClaimsTextArea;
	private PageElement minDedAmtSectionIProjectWorksMaintPeriodTextField;
	private PageElement dedWordingForSectionIProjectWorksMaintPeriodTextArea;
	private PageElement minDedAmtSectIProjWorksOthersClaimsTextField;
	private PageElement dedWordingForSectIProjectWorksOthersClaimsTextArea;
	
	public PolSectionDetailsEngineer(WebDriver driver, String pageName){
		super(driver, pageName);
		netPremiumFilledbyHOOnlyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Net Premium(Filled by HO only)')]//following::input"), "Net Premium(Filled by HO only)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumChargeableTextField = new PageElement(By.xpath("//td//div[contains(text(),'Premium (Chargeable)')]//following::input"), "Premium (Chargeable)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forwordButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesDetailTitle = new PageElement(By.xpath("//div//b//a[contains(text(),'Details')]"), " AttchedCoverageDetail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesAttributesTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Attributes Title", false , WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCoveragesPremiumTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//navigations
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberHomePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Policy Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Attach Coverages Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesAttributesPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Attach Coverages Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"), "Attach Coverages Premium Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attachCoveragesPremiumLinkForEng=new PageElement(By.xpath("//td//b//div[contains(text(),'Premium')]"), "Premium Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//LE
		isThereAnyAddOnCoverExtAppForSectionIDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Is there any Add on Cover / Extension applicable for Section I')]//following::select"),"Add on Cover / Extension applicable for Section I", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		 anyOtherAddonCoverReqDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Any other AddOn Cover required')]//following::select"),"Any other AddOn Cover required", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		 minDedAmtSectIProjWorksTestPeriodTextField= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Section I Project works, Testing Period')]//following::input"),"Section I Project works, Testing Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 dedWordForSectIProjWorksTestPeriodTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Section I (Project works), Testing Period')]//following::textarea"), "Deductible Wording for Section I (Project works), Testing", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 minDedAmtSectIProjWorksAOGClaimsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Section I Project works, AOG claims')]//following::input"),"Minimum Deductible Amount Section I Project works, AOG claims", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 dedWordForSectionIProjectWorksAOGClaimsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Section I (Project works), AOG claims')]//following::textarea"), "Deductible Wording for Section I (Project works), AOG claims", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 minDedAmtSectionIProjectWorksMaintPeriodTextField= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Section I Project works, Maintenance period')]//following::input"), "Minimum Deductible Amount Section I Project works, Maintenance period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 dedWordingForSectionIProjectWorksMaintPeriodTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Section I (Project works), Maintenance period')]//following::textarea"),"Deductible Wording for Section I (Project works), Maintenance period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 minDedAmtSectIProjWorksOthersClaimsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Minimum Deductible Amount Section I Project works, Others Claims')]//following::input"), "", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		 dedWordingForSectIProjectWorksOthersClaimsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Deductible Wording for Section I (Project works), Others Claims')]//following::textarea"),"Deductible Wording for Section I (Project works), Others Claims", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

	}
	public void fillPolSectionDetailsEngineer1Page(PolCovSectionDetailsEntity polCovSectionDetailsEntity, CustomAssert assertReference)throws InterruptedException{
		if(polCovSectionDetailsEntity.getAction().equalsIgnoreCase("add") || polCovSectionDetailsEntity.getAction().equalsIgnoreCase("edit")){
			//LE
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtAppForSectionI")) {
				selectValueFromList(isThereAnyAddOnCoverExtAppForSectionIDropDown,polCovSectionDetailsEntity.getStringValueForField("IsThereAnyAddOnCoverExtAppForSectionI"));
						}
			click(forwordButton);
			switchToFrame("display");
			attCoverTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polCovSectionDetailsEntity.getStringValueForField("AttCoverTitle")+"')]"), "AttCoverTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attCoverTitle);
		}
		else if(polCovSectionDetailsEntity.getAction().equalsIgnoreCase("verify")){
			//LE
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigIsThereAnyAddOnCoverExtAppForSectionI")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("IsThereAnyAddOnCoverExtAppForSectionI"), fetchValueFromList(isThereAnyAddOnCoverExtAppForSectionIDropDown), AssertionType.WARNING);
						}
			click(forwordButton);
			switchToFrame("display");
			attCoverTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+polCovSectionDetailsEntity.getStringValueForField("AttCoverTitle")+"')]"), "AttCoverTitle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(attCoverTitle);
		}
	}
	
	public void fillPolSectionDetailsEngineer(PolCovSectionDetailsEntity polCovSectionDetailsEntity, CustomAssert assertReference)throws InterruptedException{
		if(polCovSectionDetailsEntity.getAction().equalsIgnoreCase("add") || polCovSectionDetailsEntity.getAction().equalsIgnoreCase("edit")){
			//Le
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigAnyOtherAddonCoverReq")) {
				selectValueFromList(anyOtherAddonCoverReqDropDown,polCovSectionDetailsEntity.getStringValueForField("AnyOtherAddonCoverReq"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectIProjWorksTestPeriod")) {
				clearAndSendKeys(minDedAmtSectIProjWorksTestPeriodTextField, polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectIProjWorksTestPeriod"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordForSectIProjWorksTestPeriod")) {
				clearAndSendKeys(dedWordForSectIProjWorksTestPeriodTextArea, polCovSectionDetailsEntity.getStringValueForField("DedWordForSectIProjWorksTestPeriod"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectIProjWorksAOGClaims")) {
				clearAndSendKeys(minDedAmtSectIProjWorksAOGClaimsTextField, polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectIProjWorksAOGClaims"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordForSectionIProjectWorksAOGClaims")) {
				clearAndSendKeys(dedWordForSectionIProjectWorksAOGClaimsTextArea, polCovSectionDetailsEntity.getStringValueForField("DedWordForSectionIProjectWorksAOGClaims"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectionIProjectWorksMaintPeriod")) {
				clearAndSendKeys(minDedAmtSectionIProjectWorksMaintPeriodTextField, polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectionIProjectWorksMaintPeriod"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordingForSectionIProjectWorksMaintPeriod")) {
				clearAndSendKeys(dedWordingForSectionIProjectWorksMaintPeriodTextArea, polCovSectionDetailsEntity.getStringValueForField("DedWordingForSectionIProjectWorksMaintPeriod"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectIProjWorksOthersClaims")) {
				clearAndSendKeys(minDedAmtSectIProjWorksOthersClaimsTextField, polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectIProjWorksOthersClaims"));
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordingForSectIProjectWorksOthersClaims")) {
				clearAndSendKeys(dedWordingForSectIProjectWorksOthersClaimsTextArea, polCovSectionDetailsEntity.getStringValueForField("DedWordingForSectIProjectWorksOthersClaims"));
						}
			
		}
		else if(polCovSectionDetailsEntity.getAction().equalsIgnoreCase("verify")){
			//LE
			
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigAnyOtherAddonCoverReq")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("AnyOtherAddonCoverReq"), fetchValueFromList(anyOtherAddonCoverReqDropDown), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectIProjWorksTestPeriod")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectIProjWorksTestPeriod"), fetchValueFromTextFields(minDedAmtSectIProjWorksTestPeriodTextField), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordForSectIProjWorksTestPeriod")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("DedWordForSectIProjWorksTestPeriod"), fetchValueFromTextFields(dedWordForSectIProjWorksTestPeriodTextArea), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectIProjWorksAOGClaims")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectIProjWorksAOGClaims"), fetchValueFromTextFields(minDedAmtSectIProjWorksAOGClaimsTextField), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordForSectionIProjectWorksAOGClaims")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("DedWordForSectionIProjectWorksAOGClaims"), fetchValueFromTextFields(dedWordForSectionIProjectWorksAOGClaimsTextArea), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectionIProjectWorksMaintPeriod")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectionIProjectWorksMaintPeriod"), fetchValueFromTextFields(minDedAmtSectionIProjectWorksMaintPeriodTextField), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordingForSectionIProjectWorksMaintPeriod")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("DedWordingForSectionIProjectWorksMaintPeriod"), fetchValueFromTextFields(dedWordingForSectionIProjectWorksMaintPeriodTextArea), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMinDedAmtSectIProjWorksOthersClaims")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("MinDedAmtSectIProjWorksOthersClaims"), fetchValueFromTextFields(minDedAmtSectIProjWorksOthersClaimsTextField), AssertionType.WARNING);
						}
			if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDedWordingForSectIProjectWorksOthersClaims")) {
				assertReference.assertEquals(polCovSectionDetailsEntity.getStringValueForField("DedWordingForSectIProjectWorksOthersClaims"), fetchValueFromTextFields(dedWordingForSectIProjectWorksOthersClaimsTextArea), AssertionType.WARNING);
						}	
		}
		
	}
	
	public void navigateToPolicy(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToPolicyAttribute(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigAttributeTab")) {
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToPolicyMember(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMemberTab")) {
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(memberHomePageTitle);
		}
	}
	public void navigateToPolicyCoverage(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigCoverageTab")) {
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToPolicyClientDetils(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")) {
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToPolicyRelations(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigRelationsTab")) {
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPolicyPayments(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")) {
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToPolicyFollowup(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigFollowupTab")) {
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToPolicyDocuments(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDocumentTab")) {
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}

	public void navigateToPolicyMemberDetails(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMemberDetailTab")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(memberDetailPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMemberAttributesTab")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigAttachCoveragesTab")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMemberRelationsTab")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigMemberPaymentsTab")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesDetails(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigDetailsTab")) {
			click(attachCoveragesDetailTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesDetailsPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesAttributes(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigAttachCoveragesAttributesTab")) {
			click(attachCoveragesAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesAttributesPageTitle);
		}
	}
	public void navigateToPolicyAttachCoveragesPremium(PolCovSectionDetailsEntity polCovSectionDetailsEntity){
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigPremiumTab")) {
			click(attachCoveragesPremiumTitle);
			switchToFrame("display");
			isElementDisplayed(attachCoveragesPremiumPageTitle);
		}
	}

	private void saveButtonPolicyMemberAttachCoveragseAttributes(PolCovSectionDetailsEntity polCovSectionDetailsEntity) {
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			switchToFrame("display");
		}
	}
	private void forwardButtonPolicyMemberAttachCoveragseAttributes(PolCovSectionDetailsEntity polCovSectionDetailsEntity) {
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigForwardButton")) {
			click(forwordButton);
			switchToFrame("display");
		}
	}
	private void navigateToPolicyPremiumLink(PolCovSectionDetailsEntity polCovSectionDetailsEntity) {
		if (polCovSectionDetailsEntity.getBooleanValueForField("ConfigAttachCoveragesPremium")) {
			click(attachCoveragesPremiumLinkForEng);
			switchToFrame("display");
		}
	}
	
	
	public void fillAndSubmitPolCovSectionDetails(PolCovSectionDetailsEntity polCovSectionDetailsEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polCovSectionDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolSectionDetailsEngineer1Page(polCovSectionDetailsEntity, assertReference);
			fillPolSectionDetailsEngineer(polCovSectionDetailsEntity, assertReference);
			forwardButtonPolicyMemberAttachCoveragseAttributes(polCovSectionDetailsEntity);
			saveButtonPolicyMemberAttachCoveragseAttributes(polCovSectionDetailsEntity);
			navigateToPolicyAttachCoveragesAttributes(polCovSectionDetailsEntity);
			navigateToPolicyMember(polCovSectionDetailsEntity);
			navigateToPolicy(polCovSectionDetailsEntity);
			navigateToPolicyAttribute(polCovSectionDetailsEntity);
			navigateToPolicyCoverage(polCovSectionDetailsEntity);
			navigateToPolicyClientDetils(polCovSectionDetailsEntity);
			navigateToPolicyRelations(polCovSectionDetailsEntity);
			navigateToPolicyPayments(polCovSectionDetailsEntity);
			navigateToPolicyFollowup(polCovSectionDetailsEntity);
			navigateToPolicyDocuments(polCovSectionDetailsEntity);
			navigateToPolicyMemberDetails(polCovSectionDetailsEntity);
			navigateToPolicyMemberDetails(polCovSectionDetailsEntity);
			navigateToPolicyMemberRelations(polCovSectionDetailsEntity);
			navigateToPolicyMemberPayments(polCovSectionDetailsEntity);
			navigateToPolicyAttachCoveragesDetails(polCovSectionDetailsEntity);
			navigateToPolicyAttachCoveragesPremium(polCovSectionDetailsEntity);
			navigateToPolicyPremiumLink(polCovSectionDetailsEntity);
		}
	}

}
