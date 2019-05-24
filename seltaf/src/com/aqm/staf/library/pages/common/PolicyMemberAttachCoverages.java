package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovEntity;

public class PolicyMemberAttachCoverages extends BasePage {
	private PageElement insuredInterestCoverageTitle;
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
	private PageElement	quoteNolabel;
	private PageElement	policyNoLabel;
	private PageElement productLabel;
	private PageElement policyholderLabel;
	private PageElement statusLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement newButton;
	private PageElement proRataDeleteButton;
	private PageElement shortTermDeleteButton;
	private PageElement backButton;
	private PageElement coverBuilderButton;
	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberCoverageTitle;
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement memberRelationsTitlePage;
	private PageElement memberPaymentListTitle;
	private PageElement coverageCodeLinkTextField;
	private PageElement nextPageTitle;
	private String coverageCode;
	private PageElement coverageTextFeild;
	private PageElement saveButton;
	private PageElement coverageCodeNameTextField;
	private PageElement coverageCodeCheckbox;
	private PageElement attachCoveragesPremiumTitle;
	private PageElement attachCovCodeFindButton;
	private PageElement attachCovCodeLink;

	public PolicyMemberAttachCoverages(WebDriver driver, String pageName) {
		super(driver, pageName);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td"), " MemberPayments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNolabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverDetails","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath("//td//b[contains(text(),'Status')]/following::td"), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel = new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::td"), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel = new PageElement(By.xpath("//td//b[contains(text(),'Serial No.')]/following::td"), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		

		//Table

		newButton = new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		proRataDeleteButton = new PageElement(By.name("proRataDelete"), "Pro-Rata Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		shortTermDeleteButton = new PageElement(By.name("shortTermDelete"), "Short Term Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverBuilderButton = new PageElement(By.xpath("//td//input[@name='Cover Builder']"), "Cover Builder Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),' List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTextFeild = new PageElement(By.name("pCoverCode"), "Coverage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageCodeNameTextField = new PageElement(By.name("pCoverName"), "Coverage Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		attachCoveragesPremiumTitle = new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), " AttchedCoveragePremium Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attachCovCodeFindButton = new PageElement(By.xpath("//a[@name=('firstFocus')]//following::img[1]"), "Attach Coverage Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

	}

	public void fillMemberAttachCovDetails(PolicyMemAttachCovEntity policyMemAttachCovEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyMemAttachCovEntity.getAction().equalsIgnoreCase("add") || policyMemAttachCovEntity.getAction().equalsIgnoreCase("edit")){
			WebDriverWait wait	=new WebDriverWait(driver, 30);
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")) {
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("Coverage"));
				}
				click(saveButton);
			}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));
				}
				click(saveButton);
			}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));
				}
				click(saveButton);
			}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));
				}
				click(saveButton);
			}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));
				}
				click(saveButton);
			}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));
				}
				click(saveButton);
			}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));

				}
				
					else if(policyMemAttachCovEntity.getBooleanValueForField("ConfigAttachCovCode")) {
						switchToFrame("display");
						click(attachCovCodeFindButton);
						switchToWindow("Insured InterestCoverage List");
						Thread.sleep(1000);
						attachCovCodeLink=new PageElement (By.xpath("//a[contains(text(),'"+policyMemAttachCovEntity.getStringValueForField("AttachCovCode")+"')]"), " Attach Coverage Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
						//wait.until(ExpectedConditions.elementToBeClickable(getWebElement(attachCovCodeLink)));
						//	click(attachCovCodeLink, driver);
						click(attachCovCodeLink);
						Thread.sleep(5000);
						switchToWindow("Integrated Insurance Management System");
						switchToFrame("display");

					}

					click(saveButton);
				}
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton") && policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){
				if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
					clearAndSendKeys(coverageTextFeild,policyMemAttachCovEntity.getStringValueForField("CoverageCode"));

				}
				click(saveButton);
			}
		}

			if(policyMemAttachCovEntity.getAction().equalsIgnoreCase("verify")){

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNolabel), AssertionType.WARNING);
				}

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigPolicyNo")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
				}

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigProductLabel")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
				}

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("Policyholder"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
				}

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
				}

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigMemberCode")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("MemberCode"), fetchValueFromFields(memberCodeLabel), AssertionType.WARNING);
				}

				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("MemberSerialNo"), fetchValueFromFields(memberSerialNoLabel), AssertionType.WARNING);
				}
				if(policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural") || policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")||policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")||policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")|| policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")|| policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")|| policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")|| policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")){
					if (policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverage")) {
						assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("CoverageCode"), fetchValueFromTextFields(coverageTextFeild), AssertionType.WARNING);
					}

				}
				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigAttachCovCode")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("AttachCovCode"), fetchValueFromTextFields(coverageTextFeild), AssertionType.WARNING);
				}
				if (policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverageName")) {
					assertReference.assertEquals(policyMemAttachCovEntity.getStringValueForField("CoverageName"), fetchValueFromTextFields(coverageCodeNameTextField), AssertionType.WARNING);
				}
			}
		}
		

	public void createNewCoverage(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getAction().equalsIgnoreCase("add")||policyMemAttachCovEntity.getAction().equalsIgnoreCase("edit")){
			if(policyMemAttachCovEntity.getBooleanValueForField("ConfigNewButton"))
				click(newButton);
			switchToFrame("display");
		}
	}

	// for selection to SC Cover
	public void selectSearchCoverageCode(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getAction().equalsIgnoreCase("edit")||policyMemAttachCovEntity.getAction().equalsIgnoreCase("verify")){
			if (policyMemAttachCovEntity.getBooleanValueForField("ConfigSearchCoverageCode")){
				coverageCode=policyMemAttachCovEntity.getStringValueForField("CoverageCode");
				coverageCodeLinkTextField=new PageElement(By.linkText(coverageCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(coverageCodeLinkTextField);
				switchToFrame("display");
			}
			if(policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
				if((policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")) || (policyMemAttachCovEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering"))){
					if (policyMemAttachCovEntity.getBooleanValueForField("ConfigSearchAddCoverageCode")){
						coverageCode=policyMemAttachCovEntity.getStringValueForField("CoverageCode");
						coverageCodeLinkTextField=new PageElement(By.linkText(coverageCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

					}
				}

			}
		}
	}
	// To Delete Add On Cover
	public void deleteCoverageCode(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getAction().equalsIgnoreCase("edit")||policyMemAttachCovEntity.getAction().equalsIgnoreCase("verify")){
			if (policyMemAttachCovEntity.getBooleanValueForField("ConfigCheckboxForCoverageCode")){
				String coverageCode=policyMemAttachCovEntity.getStringValueForField("CoverageCode");
				coverageCodeCheckbox=new PageElement(By.xpath("//form[@name='FormRiskCoverList']//td//a[contains(text(),'"+coverageCode+"')]/preceding::input[1]"), "CoverageCode checkbox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				check(coverageCodeCheckbox);
				switchToFrame("display");
			}
		}
	}

	public void proRataDeleteButton(PolicyMemAttachCovEntity policyMemAttachCovEntity) {
		if (policyMemAttachCovEntity.getBooleanValueForField("ConfigProRataDeleteButton")) {
			click(proRataDeleteButton);
		}
	}

	public void clickShortTermDelete(PolicyMemAttachCovEntity policyMemAttachCovEntity) {
		if (policyMemAttachCovEntity.getBooleanValueForField("ConfigShorttermDeleteButton")) {
			click(shortTermDeleteButton);
		}
	}

	public void clickCoverBuilder(PolicyMemAttachCovEntity policyMemAttachCovEntity) {
		if (policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverBuilder")) {
			click(coverBuilderButton);
		}
	}

	public void backFromPage(PolicyMemAttachCovEntity policyMemAttachCovEntity) {
		if (policyMemAttachCovEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}

	public void navigateToPolicyTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if (policyMemAttachCovEntity.getBooleanValueForField("ConfigPolicyTab")) {
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}
	public void navigateToAttributeTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToMemberTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(policyInsuredInterestTitlePage);
		}
	}

	public void navigateToCoverageTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}

	public void navigateToClientDetailTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigClientDetailsTab")){

			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(schemeDetailTitle);
		}
	}

	public void navigateToRelationsTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}

	public void navigateToPaymentsTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}

	public void navigateToFollowupTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}

	public void navigateToDocumentTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}

	public void navigateToDetailTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigDetailTab")){
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsTitle);
		}
	}

	public void navigateToAttributesTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(memberAttributesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitlePage);
		}
	}

	public void navigateToAttachCoveragesTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(insuredInterestCoverageTitle));
			return;
		}
	}
	public void navigateToMemRelationsTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitlePage));
			return;
		}
	}
	public void navigateToMemPaymentsTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if(policyMemAttachCovEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(memberPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}
	public void navigateToAttachCoveragesPremiumTab(PolicyMemAttachCovEntity policyMemAttachCovEntity){
		if (policyMemAttachCovEntity.getBooleanValueForField("ConfigAttchCoveragePremiumEngineering")) {
			click(attachCoveragesPremiumTitle);
			switchToFrame("display");
		}
		
	}

	public void fillAndSubmitAttachCoverageDetails(PolicyMemAttachCovEntity policyMemAttachCovEntity , CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyMemAttachCovEntity.getConfigExecute())){
			selectSearchCoverageCode(policyMemAttachCovEntity);
			createNewCoverage(policyMemAttachCovEntity);
			deleteCoverageCode(policyMemAttachCovEntity);
			fillMemberAttachCovDetails(policyMemAttachCovEntity, assertReference);
			navigateToPolicyTab(policyMemAttachCovEntity);
			navigateToAttributeTab(policyMemAttachCovEntity);
			navigateToMemberTab(policyMemAttachCovEntity);
			navigateToCoverageTab(policyMemAttachCovEntity);
			navigateToClientDetailTab(policyMemAttachCovEntity);
			navigateToRelationsTab(policyMemAttachCovEntity);
			navigateToPaymentsTab(policyMemAttachCovEntity);
			navigateToFollowupTab(policyMemAttachCovEntity);
			navigateToDocumentTab(policyMemAttachCovEntity);
			navigateToDetailTab(policyMemAttachCovEntity);
			navigateToAttributesTab(policyMemAttachCovEntity);
			navigateToAttachCoveragesTab(policyMemAttachCovEntity);
			navigateToAttachCoveragesPremiumTab(policyMemAttachCovEntity);
			navigateToRelationsTab(policyMemAttachCovEntity);
			navigateToPaymentsTab(policyMemAttachCovEntity);
			proRataDeleteButton(policyMemAttachCovEntity);
			clickCoverBuilder(policyMemAttachCovEntity);
			clickShortTermDelete(policyMemAttachCovEntity);
			//createNewCoverage(policyMemAttachCovEntity);
			//backFromPage(policyMemAttachCovEntity);
		}

	}



}
