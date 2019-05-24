package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PolInsIntAttrFireEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMemAttachCovEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;

public class PolicyMemberDetails extends BasePage {
	private PageElement policyMemberDetailsTitle;
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement insuredInterestTitle;
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
	private PageElement	quoteNoLabel;
	private PageElement	policyNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberSerialNoLabel;
	private PageElement memberCodeTextField;
	private PageElement memberCodeSearchTextField;
	private PageElement inceptionDateTextField;
	private PageElement sILimitsOfLiabilityTextField ;
	private PageElement currencyTextField;
	private PageElement currencySearchTextField;
	private PageElement benifitAmountTextField;
	private PageElement grossPremiumTextField;
	private PageElement discretionaryDiscountTextField;
	private PageElement discretionaryLoadingTextField;
	private PageElement netPremiumTextField;
	private PageElement premiumCurrencyTextField;
	private PageElement premiumCurrencySerachTextField;
	private PageElement netPremiumInrTextField;
	private PageElement descriptionTextArea;
	private PageElement address1TextField;
	private PageElement address2TextField;
	private PageElement cityTextField;
	private PageElement stateTextField;
	private PageElement countryCodeTextField;
	private PageElement pinCodeTextField;
	private PageElement saveButton;
	private PageElement premScheduleButton;
	private PageElement calculatePremiumButton;
	private PageElement cbDetailButton;
	private PageElement previousMediHisButton;
	private PageElement backToRiskListButton;
	private PageElement backTPolicyDetailButton;

	private PageElement policyQuoteDetailsTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement policyInsuredInterestTitlePage;
	private PageElement policyCoverageListTitlePage; 
	private PageElement schemeDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement memberAttributesTitlePage;
	private PageElement insuredInterestCoverageTitle;
	private PageElement memberRelationsTitlePage;
	private PageElement memberPaymentListTitle;

	private PageElement policyHolderNameTextField;
	private PageElement productNameTextField;
	private PageElement effectiveDateOFSITextField;
	private PageElement sumInsuredTextField;
	private PageElement cbPercentageTextField;
	private PageElement cbAmountTextField;
	private PageElement backTCBDetailButton;

	private PageElement cumulativeBonusDetailsTitle;
	private PageElement previousClaimHistoryTitle ;
	private PageElement searchButton;
	private PageElement preExistingDiseaseatTheTimeofRenewalTextFeild;
	private PageElement insuredInterestTab;

	//Fire
	private PageElement pinCodeFindButton;

	private PageElement attachedToInsuredInterestNoTextField;
	private PageElement insuredInterestCodeNameTextField;

	private PageElement backButtonMisc;

	//PU
	private PageElement insuredInterestCodeFind;
	private PageElement insuredInterestCodetext;
	private PageElement AttachedToInsuredInterestNoTextField;


	public PolicyMemberDetails(WebDriver driver, String pageName) {
		super(driver, pageName);
		//policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy  Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.linkText("Insured Interest"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.linkText("Loan"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.linkText("Client Details"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.linkText("Relations"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]following::td"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Attach Coverage']/following::td/following::td"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("FormRiskCoverList", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskDetail", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskDetail","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskDetail","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("FormPolicyRiskDetail", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel = new PageElement(By.xpath("//b[contains(text(),'Serial No.')]/following::font"), "Member Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeTextField = new PageElement(By.name("pRiskCode"), " Member Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeSearchTextField = new PageElement(By.name("pRiskName"), " Member Code Search Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		inceptionDateTextField = new PageElement(By.name("pEffectiveStartDate"), " Inception Date Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sILimitsOfLiabilityTextField  = new PageElement(By.name("pLimLiabTc"), " SI/Limits Of Liability Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currencyTextField = new PageElement(By.name("pCurrency"), " Currency TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		currencySearchTextField = new PageElement(By.name("pCurrencyRate"), " Currency Search Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		benifitAmountTextField = new PageElement(By.name("pSumInsuredAssured"), " Benifit Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		grossPremiumTextField = new PageElement(By.name("pGrossPremium"), " Gross Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryDiscountTextField = new PageElement(By.name("pTotalDiscount"), " Total Discount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		discretionaryLoadingTextField = new PageElement(By.name("pTotalLoading"), " Discretionary Loading Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremiumTextField = new PageElement(By.name("pNetPrmTc"), " Net Prmium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumCurrencyTextField = new PageElement(By.name("pNetPremCurrency"), "Premium Currency Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		premiumCurrencySerachTextField = new PageElement(By.name("pNetPremCurrencyRate"), "Premium Currency Search Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		netPremiumInrTextField = new PageElement(By.name("pNetPremium"), "Net Premium INR Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		descriptionTextArea = new PageElement(By.name("pDescription"), "Description Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		address1TextField = new PageElement(By.name("pContactAddress1"), "Address1 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		address2TextField = new PageElement(By.name("pContactAddress2"), "Address2 Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cityTextField = new PageElement(By.name("pAreaCode"), "City Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		stateTextField = new PageElement(By.name("pStateCode"), "State Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		countryCodeTextField = new PageElement(By.name("pCountryCode"), "Country Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		pinCodeTextField = new PageElement(By.name("pPostalCode"), "Pin Code Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premScheduleButton = new PageElement(By.name("Prem.Schedule"),  "Prem.Schedule Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		calculatePremiumButton = new PageElement(By.xpath("//td//input[@name='Calculate Premium']"),  "Calculate Premium Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cbDetailButton = new PageElement(By.xpath("//input[@name='CB Details']"),  "CB Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousMediHisButton = new PageElement(By.xpath("//td//input[@name='CB Details']"),  "CB Details Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backToRiskListButton = new PageElement(By.xpath("//td//input[@name='Back to Risk List']"),  "Back To Risk List Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backTPolicyDetailButton = new PageElement(By.xpath("//td//input[@name='Back to Policy Detail']"),  "Back to Policy Detail Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backTCBDetailButton = new PageElement(By.name("Back"),  "Back to CB Detail Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyQuoteDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy/Quote Details Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyInsuredInterestTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyCoverageListTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title Page",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		schemeDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Scheme Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyHolderNameTextField= new PageElement(By.name("pPolicyHolderName"), "Policy Holder Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		productNameTextField= new PageElement(By.name("pProductName"), "Product Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		effectiveDateOFSITextField= new PageElement(By.name("pEffectiveDate0"), "Effective Date of SI TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField= new PageElement(By.name("pSumInsured0"), "Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cbPercentageTextField= new PageElement(By.name("pCBPercentage0"), "CB % TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cbAmountTextField= new PageElement(By.name("pCBAmount0"), "CB Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		cumulativeBonusDetailsTitle = new PageElement(By.xpath("//b//font[contains(text(),'Cumulative Bonus Details')]"), "Cumulative Bonus Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousClaimHistoryTitle = new PageElement(By.xpath("//b//font[contains(text(),'Previous Claim History')]"), " Previous Claim History  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton = new PageElement(By.name("Search"),  "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		preExistingDiseaseatTheTimeofRenewalTextFeild=new PageElement(By.name("pPreExDisease0"), " Previous Claim History  Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTab=new PageElement(By.xpath("//div/b[contains(text(),'Insured Interest')]"), "Insured Interest Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//Fire
		pinCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Pin Code')]/following::input/following::a[@name='firstFocus']"),"Pin Code Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		attachedToInsuredInterestNoTextField=new PageElement(By.name("pParentRiskSlNo"), "attached To Insured Interest No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeNameTextField=new PageElement(By.name("pRiskCode"), "insured Interest Code Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeFind=new PageElement(By.xpath("//input[@name='pParentRiskSlNo']//following::a[2]"), "insured Interest Code Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodetext=new PageElement(By.xpath("/html/body/form/table[2]/tbody/tr/td/table/tbody/tr[3]/td[1]/div/a"), "insured Interest Code Name TextField" , false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		AttachedToInsuredInterestNoTextField=new PageElement(By.name("pParentRiskSlNo"), "attached To Insured Interest No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 

		backButtonMisc=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


	}

	public void fillMemberDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity, CustomAssert assertReference) throws InterruptedException{
		if(policyMemberDetailsEntity.getAction().equalsIgnoreCase("add") || policyMemberDetailsEntity.getAction().equalsIgnoreCase("edit")){
			
			if(policyMemberDetailsEntity.getBooleanValueForField("ConfigAttachedToInsuredInterestNo")) {
				clearAndSendKeys(AttachedToInsuredInterestNoTextField, policyMemberDetailsEntity.getStringValueForField("AttachedToInsuredInterestNo"));
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestCodeName")) {
				click(insuredInterestCodeFind);
				Thread.sleep(2000);
				switchToWindow();
				click(insuredInterestCodetext);
				switchToWindow();
				switchToFrame("display");
				//clearAndSendKeys(insuredInterestCodeNameTextField, policyMemberDetailsEntity.getStringValueForField("InsuredInterestCodeName"));
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberCode")) {
				clearAndSendKeys(memberCodeTextField, policyMemberDetailsEntity.getStringValueForField("MemberCode"));
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigBuyerCode")) {
				clearAndSendKeys(memberCodeTextField, policyMemberDetailsEntity.getStringValueForField("BuyerCode"));
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDescription")) {
				clearAndSendKeys(descriptionTextArea, policyMemberDetailsEntity.getStringValueForField("Description"));
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAddress1")) {
				clearAndSendKeys(address1TextField, policyMemberDetailsEntity.getStringValueForField("Address1"));
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAddress2")) {
				clearAndSendKeys(address2TextField, policyMemberDetailsEntity.getStringValueForField("Address2"));
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCity")) {
				clearAndSendKeys(cityTextField, policyMemberDetailsEntity.getStringValueForField("City"));
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigState")) {
				clearAndSendKeys(stateTextField, policyMemberDetailsEntity.getStringValueForField("State"));
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCountryCode")) {
				clearAndSendKeys(countryCodeTextField, policyMemberDetailsEntity.getStringValueForField("CountryCode"));
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPinCode")) {				
				pinCodeTextField=new PageElement(By.xpath("//a[@name='firstFocus']"), "PIN CODE", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				clearAndSendKeys(pinCodeTextField, policyMemberDetailsEntity.getStringValueForField("PinCode"));
			}
			//Fire Lob
			if (policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")||policyMemberDetailsEntity.getStringValueForField("Product").equalsIgnoreCase("EP")||policyMemberDetailsEntity.getStringValueForField("Product").equalsIgnoreCase("PS")||policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Engineering")||policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigClearPinCode")) {
					clearTextField(pinCodeTextField);
				}
				fillPinCodeDetailsForFire(policyMemberDetailsEntity);
				fillPinCodeDetailsForMotor(policyMemberDetailsEntity);
			}

		}
		else if(policyMemberDetailsEntity.getAction().equalsIgnoreCase("verify")){

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("PolicyNo"), fetchValueFromFields(policyNoLabel), AssertionType.WARNING);
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAddress1")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("Address1"), fetchValueFromTextFields(address1TextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("MemberSerialNo"), fetchValueFromFields(memberSerialNoLabel), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInceptionDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberDetailsEntity.getStringValueForField("InceptionDate")) ,fetchValueFromTextFields(inceptionDateTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSILimitsofLiability")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("SILimitsofLiability"), fetchValueFromTextFields(sILimitsOfLiabilityTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCurrency")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("Currency"), fetchValueFromTextFields(currencyTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCurrencySearch")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("CurrencySearch"), fetchValueFromTextFields(currencySearchTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigBenefitAmount")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("BenefitAmount"), fetchValueFromTextFields(benifitAmountTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigGrossPremium")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("GrossPremium"), fetchValueFromTextFields(grossPremiumTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDiscretionaryDiscount")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("DiscretionaryDiscount"), fetchValueFromTextFields(discretionaryDiscountTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDiscretionaryLoading")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("DiscretionaryLoading"), fetchValueFromTextFields(discretionaryLoadingTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigNetPremium")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("NetPremium"), fetchValueFromTextFields(netPremiumTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPremiumCurrency")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("PremiumCurrency"), fetchValueFromTextFields(premiumCurrencyTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPremiumCurrencySearch")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("PremiumCurrencySearch"), fetchValueFromTextFields(premiumCurrencySerachTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigNetPremiumINR")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("NetPremiumINR"), fetchValueFromTextFields(netPremiumInrTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDescription")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("Description"), fetchValueFromTextFields(descriptionTextArea), AssertionType.WARNING);
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDescriptionCheck")) {
				assertReference.assertEquals(true, fetchValueFromTextFields(descriptionTextArea).contains(policyMemberDetailsEntity.getStringValueForField("DescriptionCheck")), AssertionType.WARNING);
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAddress2")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("Address2"), fetchValueFromTextFields(address2TextField), AssertionType.WARNING);
			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPinCode")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("PinCode"), fetchValueFromTextFields(pinCodeTextField), AssertionType.WARNING);
			}
			if (policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Rural")){

				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAttachedToInsuredInterestNo")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("AttachedToInsuredInterestNo"), fetchValueFromTextFields(attachedToInsuredInterestNoTextField), AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestCodeName")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("InsuredInterestCodeName"), fetchValueFromTextFields(insuredInterestCodeNameTextField), AssertionType.WARNING);
				}

			}
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCity")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("City"), fetchValueFromTextFields(cityTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigState")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("State"), fetchValueFromTextFields(stateTextField), AssertionType.WARNING);
			}

			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCountryCode")) {
				assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("CountryCode"), fetchValueFromTextFields(countryCodeTextField), AssertionType.WARNING);
			}

		}
	}

	public void submitMemberDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSave")) {
			click(saveButton);
			// Alert Comes After Click on Save Button
			try{
				acceptAlertAndReturnConfirmationMessage();
			}
			catch (Exception e){
			}
			switchToFrame("display");
			policyMemberDetailsEntity.setStringValueForField("MemberSerialNo", fetchValueFromFields(memberSerialNoLabel));
		}
	}

	public void clickBackToRiskList(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigBackToRiskList")) {
			click(backToRiskListButton);
			switchToFrame("display");
		}
	}

	public void clickbackToPolicyDetail(PolicyMemberDetailsEntity policyMemberDetailsEntity) {
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigBackToPolicyDetail")) {
			click(backTPolicyDetailButton);
		}
	}

	public void clickCBDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity,CustomAssert assertReference) throws InterruptedException{
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCBDetails")){
			click(cbDetailButton);
			verifyCBDeatil(policyMemberDetailsEntity,assertReference);
			click(backTCBDetailButton);
			switchToWindow();
			switchToFrame("display");

		}
	}
	public void clickPrevMediClaimHistory(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPreMediclaimHis")){
			click(previousMediHisButton);
			isElementDisplayed(previousClaimHistoryTitle);
		}
	}
	public void navigateToPolicyTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitlePage);
		}
	}

	public void navigateToAttributeTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitlePage);
		}
	}
	public void navigateToMemberTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			//isElementDisplayed(policyInsuredInterestTitlePage);
		}
	}

	public void navigateToCoverageTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitlePage);
		}
	}
	public void navigateToClientDetailTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(schemeDetailTitle);
		}
	}
	public void navigateToMemberRelationsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToMemberPaymentsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	/*public void navigateToMemberDetailTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigDetailTab")){
			click(memberDetailTitle);
			switchToFrame("display");
			//isElementDisplayed(policyMemberDetailsTitle);
		}
	}*/
	public void navigateToMemberAttributesTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(memberAttributesTitle);
			switchToFrame("display");
		}
	}

	public void navigateToMemberAttachCoveragesTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){

		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigAttachCoveragesTab")){
			click(memberAttachCoveragesTitle);
			switchToFrame("display");		}
	}
	public void navigateToMemRelationsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(memberRelationsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberRelationsTitlePage));
			return;
		}
	}

	public void navigateToMemPaymentsTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(memberPaymentsTitle);
			switchToFrame("display");
			if(isElementDisplayed(memberPaymentListTitle));
			return;
		}
	}

	public void verifyCBDeatil(PolicyMemberDetailsEntity policyMemberDetailsEntity,CustomAssert assertReference) throws InterruptedException{
		switchToWindow("Cumulative Bonus Details");
		if(policyMemberDetailsEntity.getBooleanValueForField("ConfigSearchMemberCode")){
			if(policyMemberDetailsEntity.getAction().equalsIgnoreCase("add") || policyMemberDetailsEntity.getAction().equalsIgnoreCase("edit")){
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSumInsured")) {
					SelectValueAndTypeForHomeTextField(sumInsuredTextField, policyMemberDetailsEntity.getStringValueForField("SumInsured"));
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPreExistingDiseaseatTheTimeofRenewal")) {
					clearAndSendKeys(preExistingDiseaseatTheTimeofRenewalTextFeild, policyMemberDetailsEntity.getStringValueForField("PreExistingDiseaseatTheTimeofRenewal"));
				}
				click(saveButton);
			}
			if(policyMemberDetailsEntity.getAction().equalsIgnoreCase("verify")){
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("QuoteNo"),fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("ProductName"),fetchValueFromTextFields(productNameTextField), AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("PolicyHolderName"),fetchValueFromTextFields(policyHolderNameTextField), AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigEventEffectiveDate")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(policyMemberDetailsEntity.getStringValueForField("EventEffectiveDate")) ,fetchValueFromTextFields(effectiveDateOFSITextField), AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigSumInsured")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("SumInsured"),fetchValueFromTextFields(sumInsuredTextField),AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCBPercentage")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("CBPercentage"),fetchValueFromTextFields(cbPercentageTextField),AssertionType.WARNING);
				}
				if (policyMemberDetailsEntity.getBooleanValueForField("ConfigCBAmount")) {
					assertReference.assertEquals(policyMemberDetailsEntity.getStringValueForField("CBAmount"),fetchValueFromTextFields(cbAmountTextField),AssertionType.WARNING);
				}

			}
		}

	}

	public void navigateToInsuredIntersetTab(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			switchToFrame("display");
			//isElementDisplayed(policyInsuredInterestTitlePage);
			if (policyMemberDetailsEntity.getBooleanValueForField("ConfigRedirectToInsuredInterestTab")){
				click(memberDetailTitle);
				click(backToRiskListButton);
				switchToFrame("display");
			}

		}
	}


	public void fillPinCodeDetailsForFire(PolicyMemberDetailsEntity policyMemberDetailsEntity) throws InterruptedException{
		if(policyMemberDetailsEntity.getBooleanValueForField("ConfigPinCodeFire")||policyMemberDetailsEntity.getBooleanValueForField("ConfigPinCodeRural")){
			clearAndSendKeys(pinCodeTextField, policyMemberDetailsEntity.getStringValueForField("PinCodeFire"));
			click(pinCodeFindButton);
			Thread.sleep(3000);
			switchToWindow("PinCode Details");
			selectPinCode(policyMemberDetailsEntity);
		}
	}

	public void fillPinCodeDetailsForMotor(PolicyMemberDetailsEntity policyMemberDetailsEntity) throws InterruptedException{
		if(policyMemberDetailsEntity.getBooleanValueForField("ConfigPinCodeMotor")){
			clearAndSendKeys(pinCodeTextField, policyMemberDetailsEntity.getStringValueForField("PinCodeMotor"));
			click(pinCodeFindButton);
			Thread.sleep(3000);
			switchToWindow("PinCode Details");
			selectPinCode(policyMemberDetailsEntity);
			
		}
	}

	public void selectPinCode(PolicyMemberDetailsEntity policyMemberDetailsEntity) throws InterruptedException{
		if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Fire")) {
		PageElement pinCodeLink = new PageElement(By.xpath("//a[contains(text(),'"+policyMemberDetailsEntity.getStringValueForField("PinCodeFire")+"')]"),"Pin Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(pinCodeLink);
		}
		if(policyMemberDetailsEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")) {
			PageElement pinCodeLink = new PageElement(By.xpath("//a[contains(text(),'"+policyMemberDetailsEntity.getStringValueForField("PinCodeMotor")+"')]"),"Pin Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(pinCodeLink);
			}
		Thread.sleep(3000);		
		switchToWindow();
		switchToFrame("display");
	}

	public void clickButton(PolicyMemberDetailsEntity policyMemberDetailsEntity){
		if (policyMemberDetailsEntity.getBooleanValueForField("ConfigMiscBack")){
			click(backButtonMisc);
			switchToFrame("display");
			click(backButtonMisc);
			switchToFrame("display");
		}

	}
	public void fillAndSaveMemberDetails(PolicyMemberDetailsEntity policyMemberDetailsEntity,CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(policyMemberDetailsEntity.getConfigExecute())){
			switchToFrame("display");
			fillMemberDetails(policyMemberDetailsEntity, assertReference);
			submitMemberDetails(policyMemberDetailsEntity);
			clickCBDetails(policyMemberDetailsEntity,assertReference);
			navigateToPolicyTab(policyMemberDetailsEntity);
			navigateToAttributeTab(policyMemberDetailsEntity);
			navigateToMemberTab(policyMemberDetailsEntity);
			navigateToInsuredIntersetTab(policyMemberDetailsEntity);
			if(policyMemberDetailsEntity.getBooleanValueForField("ConfigMiscBack")){
				clickButton(policyMemberDetailsEntity);
			}
			navigateToCoverageTab(policyMemberDetailsEntity);
			navigateToClientDetailTab(policyMemberDetailsEntity);
			navigateToMemberRelationsTab(policyMemberDetailsEntity);
			navigateToMemberPaymentsTab(policyMemberDetailsEntity);
			navigateToFollowupTab(policyMemberDetailsEntity);
			navigateToMemberAttributesTab(policyMemberDetailsEntity);
			navigateToMemberAttachCoveragesTab(policyMemberDetailsEntity);
			navigateToMemberRelationsTab(policyMemberDetailsEntity);
			navigateToMemberPaymentsTab(policyMemberDetailsEntity);
			clickPrevMediClaimHistory(policyMemberDetailsEntity);
			clickBackToRiskList(policyMemberDetailsEntity);
		}
	}

}
