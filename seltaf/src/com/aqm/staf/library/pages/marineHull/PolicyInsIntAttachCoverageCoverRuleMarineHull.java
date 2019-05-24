package com.aqm.staf.library.pages.marineHull;

import org.openqa.jetty.servlet.Forward;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PolAttCoverRuleMHEntity;
import com.aqm.staf.library.databin.PolAttrMarineHullEntity;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class PolicyInsIntAttachCoverageCoverRuleMarineHull extends BasePage {

	private PageElement premiumScheduleTitle;
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
	private PageElement detail1Title;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement	fundTitle;
	private PageElement details2Title;
	private PageElement attributes2Title;
	private PageElement premiumTitle;
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
	private PageElement premiumSchedule2Title;

	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement memberAttributesTitle;	
	private PageElement memberRelationTitle;
	private PageElement memberAttributes2Title;
	private PageElement insuredInterestTab;

	private PageElement isSectionICoverRequiredDropDown;
	private PageElement coverDescriptionForSectionIOfOffShoreEnergyDropDown;
	private PageElement subSectionDetailsOfPhysicalDamageOpenButton;
	private PageElement sumInsuredForSectionPhysicalDamageTextField;
	private PageElement deductibleForSectionPhysicalDamageTextField;
	private PageElement rateBasedOrAmountBasedForSectionICoverDropDown;
	private PageElement	premiumForSectionPhysicalDamageTextField;
	private PageElement	isSectionIICoverRequiredDropDown;
	private PageElement	isSectionIIICoverRequiredDropDown;
	private PageElement coverDescriptionForSectionPhysicalDamageTextArea;
	private PageElement subLimitForSubSectionTextField;
	private PageElement deductibleForSubSectionTextField;
	private PageElement premiumInSubSectionTextField;
	private PageElement addButton;
	private PageElement saveButton;
	private PageElement closeButton;
	private PageElement coverCodeforSBDropDown;
	private PageElement isEarthquakeCoverrequiredDropDown;
	private PageElement isSTFICoverrequiredDropDown;
	private PageElement deletionofAdditionalWarrantyNo3requiredDropDown;
	private PageElement sumInsuredforDeletionofAdditionalWarrantyTextField;
	private PageElement deletionofAdditionalWarrantyNo3rateTextField;
	//SL
	private PageElement isPersonalInjuryCoverrequiredDropDown;
	private PageElement isOtherWorkCoverrequiredDropDown;
	
	//2
	private PageElement	isSectionIIcoverrequiredDropDown;
	private PageElement	coverDescriptionforSectionIIofOffshoreEnergyDropDown;
	private PageElement	subSectionDetailsOfBusinessInterruptionButton;
	private PageElement	sumInsuredForSectionBusinessInterruptionTextField;
	private PageElement	deductibleForSectionBusinessInterruptionInDaysTextField;	
	private PageElement	ratebasedorAmountbasedforSectionIICoverDropDown;	
	private PageElement premiumForSectionBusinessInterruptionTextField;	
	//private PageElement isSectionIIIcoverrequiredDropDown;
	private PageElement coverDescriptionForSectionBusinessInterruptionTextArea;

	//3
	private PageElement isSectionIIICoverrequiredDropDown;
	private PageElement coverDescriptionForSectionIIIOfPortPackageDropDown;
	private PageElement subSectionDetailsOfPortOperatorsLiabilityOpenButton;
	private PageElement sumInsuredForSectionPortOperatorsLiabilityTextField;
	private PageElement deductibleForSectionPortOperatorsLiabilityTextField;
	private PageElement ratebasedOrAmountBasedForSectionIIICoverDropDown;
	private PageElement premiumForSectionPortOperatorsLiabilityTextField;
	private PageElement coverDescriptionForSectionPortOperatorsLiabilityTextArea;

	//2nd PAGE
	private PageElement isSectionIVcoverrequiredDropDown;
	private PageElement coverDescriptionForSectionIVOfPortPackageDropDown;
	private PageElement subSectionDetailsofVesselsButton;
	private PageElement sumInsuredForSectionVesselsTextField;
	private PageElement deductibleForSectionVesselsTextField;
	private PageElement ratebasedOrAmountbasedForSectionIVCoverDropDown;
	private PageElement premiumForSectionVesselsTextField;
	private PageElement coverDescriptionForSectionVesselsTextArea;

	//2nd PAGE (B)
	private PageElement isSectionVcoverrequiredDropDown;
	private PageElement coverDescriptionForSectionVofPortPackageDropDown;
	private PageElement	subSectionDetailsOfWreckRemovalButton;
	private PageElement sumInsuredForSectionWreckRemovalTextField;	
	private PageElement deductibleforSectionWreckRemovalTextField;	
	private PageElement	ratebasedOrAmountbasedForSectionVCoverDropDown;
	private PageElement	premiumForSectionWreckRemovalTextField;

	//3RD PAGE
	private PageElement	isSectionVIcoverrequiredDropDown;
	private PageElement	coverDescriptionforSectionVIofPortPackageDropDown;
	private PageElement otherCover1DetailsTextArea;
	private PageElement subSectionDetailsofOtherCover1Button;
	private PageElement sumInsuredforSectionOtherCover1TextField;
	private PageElement deductibleforSectionOtherCover1TextField;
	private PageElement ratebasedorAmountbasedforSectionVICoverDropDown;
	private PageElement premiumforSectionOtherCover1TextField;

	//2nd(b)
	private PageElement	isSectionVIIcoverrequiredDropDown;
	private PageElement	coverDescriptionForSectionVIIofPortPackageDropDown;	
	private PageElement otherCover2DetailsTextArea;
	private PageElement subSectionDetailsOfOtherCover2Button;
	private PageElement sumInsuredForSectionOtherCover2TextField;
	private PageElement deductibleForSectionOtherCover2TextField;	
	private PageElement	ratebasedOrAmountbasedForSectionVIICoverDropDown;
	private PageElement	premiumForSectionOtherCover2TextField;

	private PageElement	isSectionVIIIcoverrequiredDropDown;
	private PageElement	coverDescriptionForSectionVIIIofPortPackageDropDown;	
	private PageElement	otherCover3DetailsTextArea;		
	private PageElement	subSectionDetailsOfOtherCover3Button;		
	private PageElement	sumInsuredForSectionOtherCover3TerxtField;		
	private PageElement	deductibleForSectionOtherCover3TextField;		
	private PageElement	ratebasedorAmountbasedForSectionVIIICoverDropDown;	
	private PageElement	premiumForSectionOtherCover3TextField;


	private PageElement isOnshoreTerrorismCoverRequiredDropDown;
	private PageElement subSectionDetailsOfOnshoreTerrorismButton;
	private PageElement sumInsuredForOnshoreTerrorismTextField;
	private PageElement deductibleForOnshoreTerrorismTextField;
	private PageElement ratebasedOrAmountbasedforOnshoreTerrorismCoverDropDown;
	private PageElement premiumForOnshoreTerrorismTextField;

	private PageElement forwardButton;
	private PageElement saveButtonForRule3;
	
	
	private PageElement ForwardButtonForCoverRule2;

	private PageElement coverRule2forPortPKGTitle;
	private PageElement coverRule3forPortPKGTitle;
	//wr
	private PageElement typeOfWarRiskDropdown;
	private PageElement fleetOfVesselsForOceanGoingDropdown;	
	private PageElement rateAsPerGIWarRiskSchemeTextField;

	private PageElement warRiskTitle;
	//HM
	private PageElement standardCoverTypeDropDown;
	private PageElement isPremReducCoverRequiredDropDown;
	//anzaf

	private PageElement CoverDescriptionforSectionIofPortPackage;
	private  PageElement IsSectionIXcoverrequireddropdown;
	//Ajit
	private  PageElement coverCodeforBRDropDown;
	private  PageElement isEarthquakeCoverrequiredDropDownBR;
	private  PageElement isTerrorismCoverRequiredDropDown;


	public PolicyInsIntAttachCoverageCoverRuleMarineHull(WebDriver driver, String pageName) {
		super(driver, pageName);
		//*************AB(CHINTAN)*********************
		policyTitle = new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		policyRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.linkText("Attributes"), "MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quotePolicyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Quote/Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberCoverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Member Coverage')]"), "Policy Member Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),' Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle = new PageElement(By.xpath("//div//b[contains(text(),' List')]"), "Member Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle =new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//NEW CHINTAN
		isSectionICoverRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section I cover required?')]/following::select[1]"), "Is Section I cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionIOfOffShoreEnergyDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section I of Offshore Energy')]/following::select"),"Cover Description for Section I of Offshore Energy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsOfPhysicalDamageOpenButton=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Physical Damage')]/following::input"),"Sub Section Details of Physical Damage", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForSectionPhysicalDamageTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Physical Damage)')]/following::input[1]"),"Sum Insured for Section (Physical Damage)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSectionPhysicalDamageTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Physical Damage)')]/following::input[1]"),"Deductible for Section (Physical Damage)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateBasedOrAmountBasedForSectionICoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section I Cover')]/following::select[1]"),"Rate based or Amount based for Section I Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForSectionPhysicalDamageTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Physical Damage)')]/following::input[1]"),"Premium for Section (Physical Damage)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isSectionIICoverRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section II cover required?')]/following::select"),"Is Section II cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSectionIIICoverRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section III cover required?')]/following::select"),"Is Section III cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionPhysicalDamageTextArea=new PageElement(By.name("Data_249883302112010_0"),"CoverDescriptionForSectionPhysicalDamage ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subLimitForSubSectionTextField=new PageElement(By.name("Data_250126402112010_0"),"Sub Limit for Sub Section ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSubSectionTextField=new PageElement(By.name("Data_250126502112010_0"),"deductibleForSubSectionTextField ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumInSubSectionTextField=new PageElement(By.name("Data_250126602112010_0"),"premiumInSubSectionTextField  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SB
		coverCodeforSBDropDown=new PageElement(By.name("propValues1"), "Cover Code for SB DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isEarthquakeCoverrequiredDropDown=new PageElement(By.name("propValues2"), "Is Earthquake Cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSTFICoverrequiredDropDown=new PageElement(By.name("propValues5"), "Is STFI Cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deletionofAdditionalWarrantyNo3requiredDropDown=new PageElement(By.name("propValues8"), "Deletion of Additional Warranty No. 3 required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredforDeletionofAdditionalWarrantyTextField=new PageElement(By.name("propValues9"),"SumInsured for Deletion of Additional Warranty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deletionofAdditionalWarrantyNo3rateTextField=new PageElement(By.name("propValues10"),"Deletion of Additional Warranty No. 3 rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//SL
		isPersonalInjuryCoverrequiredDropDown=new PageElement(By.name("propValues1"), "Is Personal Injury Cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isOtherWorkCoverrequiredDropDown=new PageElement(By.name("propValues4"), "Is Other Work Cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//2
		isSectionIIcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section II cover required?')]/following::select[1]"), "Is Section II cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionforSectionIIofOffshoreEnergyDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section II of Offshore Energy')]/following::select[1]"), "Cover Description for Section II of Offshore Energy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsOfBusinessInterruptionButton=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details Of Business Interruption')]/following::input"), "Sub Section Details Of Business Interruption", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForSectionBusinessInterruptionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Business Interruption)')]/following::input"), "Sum Insured for Section (Business Interruption)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSectionBusinessInterruptionInDaysTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Business Interruption) in days')]/following::input"), "Deductible for Section (Business Interruption) in days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratebasedorAmountbasedforSectionIICoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section II Cover')]/following::select"), "Rate based or Amount based for Section II Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForSectionBusinessInterruptionTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Business Interruption)')]/following::input"), "Premium for Section (Business Interruption)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//isSectionIIIcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section III cover required?')]/following::select"), "Is Section III cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionBusinessInterruptionTextArea=new PageElement(By.name("Data_250143402112010_0"),"coverDescriptionForSectionOperatorsExtraExpense", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//3
		isSectionIIICoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section III cover required?')]/following::select[1]"), "Is Section III cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionIIIOfPortPackageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section III of Port Package')]/following::select[1]"), "coverDescriptionForSectionIIIOfPortPackage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsOfPortOperatorsLiabilityOpenButton=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Port Operators Liability')]/following::select"), "Sub Section Details of Port Operators Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sumInsuredForSectionPortOperatorsLiabilityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Port Operators Liability)')]/following::input"), "Sum Insured for Section (Port Operators Liability)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSectionPortOperatorsLiabilityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Port Operators Liability)')]/following::input"), "Deductible for Section (Port Operators Liability)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratebasedOrAmountBasedForSectionIIICoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section III Cover')]/following::select"), "Rate based or Amount based for Section III Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForSectionPortOperatorsLiabilityTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Port Operators Liability)')]/following::input"), "Premium for Section (Port Operators Liability)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverDescriptionForSectionPortOperatorsLiabilityTextArea=new PageElement(By.name("Data_250143902112010_0"),"CoverDescriptionForSectionThirdPartyLiability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		addButton=new PageElement(By.name("btnAdd"),"Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonForRule3=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton=new PageElement(By.name("btnClose"),"Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//2nd page
		isSectionIVcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section IV cover required?')]/following::select[1]"), "Is Section IV cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionIVOfPortPackageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section IV of Port Package')]/following::select"), "Cover Description for Section IV of Port Package", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsofVesselsButton=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Vessels')]/following::input"), "Sub Section Details of Vessels", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForSectionVesselsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Vessels)')]/following::input"), "Sum Insured for Section (Vessels)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSectionVesselsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Vessels)')]/following::input"), "Deductible for Section (Vessels)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratebasedOrAmountbasedForSectionIVCoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section IV Cover')]/following::select"), "Rate based or Amount based for Section IV Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForSectionVesselsTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Vessels)')]/following::input"), "Premium for Section (Vessels)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverDescriptionForSectionVesselsTextArea =new PageElement(By.name(" Data_249887302112010_0"),"coverDescriptionForSectionVessels", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subLimitForSubSectionTextField=new PageElement(By.name("Data_250126402112010_0"),"Sub Limit for Sub Section ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		deductibleForSubSectionTextField=new PageElement(By.name("Data_250126502112010_0"),"Deductible for Sub Section  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
		premiumInSubSectionTextField=new PageElement(By.name("Data_250126602112010_0"),"Premium in Sub Section", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  

		//2nd page (b)
		isSectionVcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section V cover required?')]/following::select[1]"), "Is Section V cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionVofPortPackageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section V of Port Package')]/following::select"), "Cover Description for Section V of Port Package", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsOfWreckRemovalButton=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Wreck Removal')]/following::input"), "Sub Section Details of Wreck Removal", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForSectionWreckRemovalTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Wreck Removal)')]/following::input"), "Sum Insured for Section (Wreck Removal)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleforSectionWreckRemovalTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Wreck Removal)')]/following::input"), "Deductible for Section (Wreck Removal)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		ratebasedOrAmountbasedForSectionVCoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section V Cover')]/following::select"), "Rate based or Amount based for Section V Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		premiumForSectionWreckRemovalTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Wreck Removal)')]/following::input"), "Premium for Section (Wreck Removal)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//3RD PAGE	
		isSectionVIcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section VI cover required?')]/following::select"), "Is Section VI cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionforSectionVIofPortPackageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section VI of Port Package')]/following::select"), "Cover Description for Section VI of Port Package", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherCover1DetailsTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Other Cover 1 Details')]/following::textarea"), "Other Cover 1 Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subSectionDetailsofOtherCover1Button=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Other Cover 1')]/following::input"), "Sub Section Details of Other Cover 1", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredforSectionOtherCover1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Other Cover 1)')]/following::input"), "Sum Insured for Section (Other Cover 1)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleforSectionOtherCover1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Other Cover 1)')]/following::input"), "Deductible for Section (Other Cover 1)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratebasedorAmountbasedforSectionVICoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section VI Cover')]/following::select"), "Rate based or Amount based for Section VI Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumforSectionOtherCover1TextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Other Cover 1)')]/following::input"), "Premium for Section (Other Cover 1)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//(b)
		isSectionVIIcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section VII cover required?')]/following::select"), "Is Section VII cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionVIIofPortPackageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section VII of Port Package')]/following::select"), "Cover Description for Section VII of Port Package", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherCover2DetailsTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Other Cover 2 Details')]/following::textarea"), "Other Cover 2 Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsOfOtherCover2Button=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Other Cover 2')]/following::input"), "Sub Section Details of Other Cover 2", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForSectionOtherCover2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Other Cover 2)')]/following::input"), "Sum Insured for Section (Other Cover 2)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForSectionOtherCover2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Other Cover 2)')]/following::input"), "Deductible for Section (Other Cover 2)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratebasedOrAmountbasedForSectionVIICoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section VII Cover')]/following::select"), "Rate based or Amount based for Section VII Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForSectionOtherCover2TextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Other Cover 2)')]/following::input"), "Premium for Section (Other Cover 2)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		//2nd(C)

		isSectionVIIIcoverrequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Section VIII cover required?')]/following::select[1]"), "Is Section VIII cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coverDescriptionForSectionVIIIofPortPackageDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Cover Description for Section VIII of Port Package')]/following::select"), "Cover Description for Section VIII of Port Package", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherCover3DetailsTextArea=new PageElement(By.xpath("//td/div[contains(text(),'Other Cover 3 Details')]/following::textarea"), "Other Cover 3 Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subSectionDetailsOfOtherCover3Button=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Other Cover 3')]/following::input"), "Sub Section Details of Other Cover 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForSectionOtherCover3TerxtField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Section (Other Cover 3)')]/following::input"), "Sum Insured for Section (Other Cover 3)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deductibleForSectionOtherCover3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Section (Other Cover 3)')]/following::input"), "Deductible for Section (Other Cover 3)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ratebasedorAmountbasedForSectionVIIICoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Section VIII Cover')]/following::select"), "Rate based or Amount based for Section VIII Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		premiumForSectionOtherCover3TextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Section (Other Cover 3)')]/following::input"), "Premium for Section (Other Cover 3)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		
		ForwardButtonForCoverRule2 =new PageElement(By.xpath("//div/input[@class='MouseOver' and @value='-->']"), "ForwardButtonForCoverRule2", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		isOnshoreTerrorismCoverRequiredDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Is Onshore Terrorism cover required?')]/following::select"), "Is Onshore Terrorism cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subSectionDetailsOfOnshoreTerrorismButton=new PageElement(By.xpath("//td/div[contains(text(),'Sub Section Details of Onshore Terrorism')]/following::input"), "Sub Section Details of Onshore Terrorism", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sumInsuredForOnshoreTerrorismTextField=new PageElement(By.xpath("//td/div[contains(text(),'Sum Insured for Onshore Terrorism')]/following::input"), "Sum Insured for Onshore Terrorism", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deductibleForOnshoreTerrorismTextField=new PageElement(By.xpath("//td/div[contains(text(),'Deductible for Onshore Terrorism')]/following::input"), "Deductible for Onshore Terrorism", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratebasedOrAmountbasedforOnshoreTerrorismCoverDropDown=new PageElement(By.xpath("//td/div[contains(text(),'Rate based or Amount based for Onshore Terrorism Cover')]/following::select"), "Rate based or Amount based for Onshore Terrorism Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		premiumForOnshoreTerrorismTextField=new PageElement(By.xpath("//td/div[contains(text(),'Premium for Onshore Terrorism')]/following::input"), "Premium for Onshore Terrorism", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		premiumScheduleTitle=new PageElement(By.xpath("//div//b[contains(text(),'Premium Schedule')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Attribute"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		memberTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		detail1Title=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		fundTitle=new PageElement(By.xpath("//div//b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		details2Title=new PageElement(By.linkText("Details"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes2Title=new PageElement(By.xpath("//div//a//b[contains(text(),'Attributes')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		premiumTitle=new PageElement(By.xpath("//div//a//b[contains(text(),'Premium')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		quoteNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Quote No")),"Quote No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		statusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Status")),"Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel=new PageElement(By.xpath(genericLocatorforLabel("S0050","Product")),"Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverRule2forPortPKGTitle=new PageElement(By.xpath("//div//b[contains(text(),'Cover Rule 2 for Port PKG')]"),"Cover Rule 2 for Port PKG",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		coverRule3forPortPKGTitle=new PageElement(By.xpath("/html/body/form[1]/div/b"),"Cover Rule 3 for Port PKG",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		//coverRule3forPortPKGTitle=new PageElement(By.xpath("//div//b[contains(text(),'Basic Cover Details')]"),"Cover Rule 3 for Port PKG",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//wr

		typeOfWarRiskDropdown=new PageElement(By.xpath("//td//div[@id='Type of War Risk']/following::select"), "Type of War Risk", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fleetOfVesselsForOceanGoingDropdown=new PageElement(By.xpath("//td//div[@id='Fleet of Vessels for Ocean Going']/following::select"), "Fleet of Vessels for Ocean Going", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		rateAsPerGIWarRiskSchemeTextField=new PageElement(By.xpath("//td//div[@id='Rate as per GI War Risk Scheme']/following::input"), "Rate as per GI War Risk Scheme", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		warRiskTitle=new PageElement(By.xpath("//div//b[contains(text(),'WAR RISK T1-PRC')]"),"WAR RISK T1-PRC",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//hm
		standardCoverTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Standard Cover Type')]/following::select[1]"), "Standard Cover Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		isPremReducCoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Premium Reducing Cover required?')]/following::select[1]"), "Is Premium Reducing Cover", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//ANZAF INSURED INTEREST COVEREGE ATTRIBUTE IST PAGE FOR CP PRODUCT
		CoverDescriptionforSectionIofPortPackage=new PageElement(By.xpath("//td//div[contains(text(),'Cover Description for Section I of Port Package')]/following::select[1]"), "Cover Description Section I of Port Package", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IsSectionIXcoverrequireddropdown=new PageElement(By.xpath("//td//div[contains(text(),'Is Section IX cover required?')]/following::select[1]"), "Is Section IX cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		   coverCodeforBRDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cover Code for BR", "select")), "Cover Code for BR", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		   isEarthquakeCoverrequiredDropDownBR=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Earthquake Cover required?", "select")), "Is Earthquake Cover required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		   isTerrorismCoverRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Terrorism Cover Required?", "select")), "Is Terrorism Cover Required?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}


	public void fillPolicyInsIntAttachCoverageCoverRule1MarineHull(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity, CustomAssert assertReference) throws InterruptedException{
		//ANZAF INSURED INTEREST COVEREGE ATTRIBUTE ISTMetod PAGE FOR CP PRODUCT

		if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("add") || polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionforSectionIofPortPackage")) {
				selectValueFromList(CoverDescriptionforSectionIofPortPackage, polAttCoverRuleMHEntity.getStringValueForField("DescriptionforSectionIofPortPackage"));
			}
			//SL
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsPersonalInjuryCoverrequired")) {
				selectValueFromList(isPersonalInjuryCoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsPersonalInjuryCoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsOtherWorkCoverrequired")) {
				selectValueFromList(isOtherWorkCoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsOtherWorkCoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionICoverRequired")) {
				selectValueFromList(isSectionICoverRequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionICoverRequired"));
			}
			//SB
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverCodeforSB")) {
				selectValueFromList(coverCodeforSBDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverCodeforSB"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsEarthquakeCoverrequired")) {
				selectValueFromList(isEarthquakeCoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsEarthquakeCoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSTFICoverrequired")) {
				selectValueFromList(isSTFICoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSTFICoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeletionofAdditionalWarrantyNo3required")) {
				selectValueFromList(deletionofAdditionalWarrantyNo3requiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("DeletionofAdditionalWarrantyNo3required"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredforDeletionofAdditionalWarranty")) {
				clearAndSendKeys(sumInsuredforDeletionofAdditionalWarrantyTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredforDeletionofAdditionalWarranty"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeletionofAdditionalWarrantyNo3rate")) {
				clearAndSendKeys(deletionofAdditionalWarrantyNo3rateTextField, polAttCoverRuleMHEntity.getStringValueForField("DeletionofAdditionalWarrantyNo3rate"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionIOfOffShoreEnergy")) {
				selectValueFromList(coverDescriptionForSectionIOfOffShoreEnergyDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionIOfOffShoreEnergy"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfPhysicalDamage")) {
				fillSubSectionDetailsOfPhysicalDamage(polAttCoverRuleMHEntity);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionPhysicalDamage")) {
				clearAndSendKeys(sumInsuredForSectionPhysicalDamageTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionPhysicalDamage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionPhysicalDamage")) {
				clearAndSendKeys(deductibleForSectionPhysicalDamageTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionPhysicalDamage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRateBasedOrAmountBasedForSectionICover")) {
				selectValueFromList(rateBasedOrAmountBasedForSectionICoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RateBasedOrAmountBasedForSectionICover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionPhysicalDamage")) {
				clearAndSendKeys(premiumForSectionPhysicalDamageTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionPhysicalDamage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIICoverRequired")) {
				selectValueFromList(isSectionIICoverRequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionIICoverRequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIIICoverRequired")) {
				selectValueFromList(isSectionIIICoverRequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionIIICoverRequired"));
			}
			//End of frist page for narine hull cs product
			
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIIcoverrequired")) {
				selectValueFromList(isSectionIIcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionIIcoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionforSectionIIofOffshoreEnergy")) {
				selectValueFromList(coverDescriptionforSectionIIofOffshoreEnergyDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionforSectionIIofOffshoreEnergy"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsofBusinessInterruption")) {
				fillSubSectionDetailsOfBusinessInterruption(polAttCoverRuleMHEntity);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionBusinessInterruption")) {
				clearAndSendKeys(sumInsuredForSectionBusinessInterruptionTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionBusinessInterruption"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionBusinessInterruptionInDays")) {
				clearAndSendKeys(deductibleForSectionBusinessInterruptionInDaysTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionBusinessInterruptionInDays"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedorAmountbasedforSectionIICover")) {
				selectValueFromList(ratebasedorAmountbasedforSectionIICoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedorAmountbasedforSectionIICover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionBusinessInterruption")) {
				clearAndSendKeys(premiumForSectionBusinessInterruptionTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionBusinessInterruption"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionBusinessInterruption")) {
				selectValueFromList(coverDescriptionForSectionBusinessInterruptionTextArea, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionBusinessInterruption"));
			}

			//3
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIIICoverrequired")) {
				selectValueFromList(isSectionIIICoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionIIICoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionIIIOfPortPackage")) {
				selectValueFromList(coverDescriptionForSectionIIIOfPortPackageDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionIIIOfPortPackage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfPortOperatorsLiability")) {
				filSubSectionDetailsOfPortOperatorsLiability(polAttCoverRuleMHEntity);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfPortOperatorsLiabilityOpenButton")) {
				selectValueFromList(subSectionDetailsOfPortOperatorsLiabilityOpenButton, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfPortOperatorsLiabilityOpenButton"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionPortOperatorsLiability")) {
				clearAndSendKeys(sumInsuredForSectionPortOperatorsLiabilityTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionPortOperatorsLiability"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionPortOperatorsLiability")) {
				clearAndSendKeys(deductibleForSectionPortOperatorsLiabilityTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionPortOperatorsLiability"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionIIICover")) {
				selectValueFromList(ratebasedOrAmountBasedForSectionIIICoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionIIICover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionPortOperatorsLiability")) {
				clearAndSendKeys(premiumForSectionPortOperatorsLiabilityTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionPortOperatorsLiability"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPortOperatorsLiability")) {
				clearAndSendKeys(coverDescriptionForSectionPortOperatorsLiabilityTextArea, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPortOperatorsLiability"));
			}
			//Ajit Product Name:-BR
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverCodeforBR")) {
				selectValueFromList(coverCodeforBRDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverCodeforBR"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsEarthquakeCoverrequire")) {
				selectValueFromList(isEarthquakeCoverrequiredDropDownBR, polAttCoverRuleMHEntity.getStringValueForField("IsEarthquakeCoverrequire"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsTerrorismCoverr")) {
				selectValueFromList(isTerrorismCoverRequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsTerrorismCover"));
			}
			
			
			

		}
		else if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("verify")){

			//ANZAF INSURED INTEREST COVEREGE ATTRIBUTE IST PAGE FOR CP PRODUCT

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionforSectionIofPortPackage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DescriptionforSectionIofPortPackage"), fetchValueFromList(CoverDescriptionforSectionIofPortPackage), AssertionType.WARNING);
			}


			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionICoverRequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionICoverRequired"), fetchValueFromList(isSectionICoverRequiredDropDown), AssertionType.WARNING);
			}
			//SB
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverCodeforSB")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverCodeforSB"), fetchValueFromList(coverCodeforSBDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsEarthquakeCoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsEarthquakeCoverrequired"), fetchValueFromList(isEarthquakeCoverrequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSTFICoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSTFICoverrequired"), fetchValueFromList(isSTFICoverrequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeletionofAdditionalWarrantyNo3required")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeletionofAdditionalWarrantyNo3required"), fetchValueFromList(deletionofAdditionalWarrantyNo3requiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredforDeletionofAdditionalWarranty")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredforDeletionofAdditionalWarranty"), fetchValueFromList(sumInsuredforDeletionofAdditionalWarrantyTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeletionofAdditionalWarrantyNo3rate")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeletionofAdditionalWarrantyNo3rate"), fetchValueFromList(deletionofAdditionalWarrantyNo3rateTextField), AssertionType.WARNING);
			}

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionIOfOffShoreEnergy")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionIOfOffShoreEnergy"), fetchValueFromList(coverDescriptionForSectionIOfOffShoreEnergyDropDown), AssertionType.WARNING);
			}
			if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfPhysicalDamage")) {
				verifySubSectionDetailsOfPhysicalDamage(polAttCoverRuleMHEntity, assertReference);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionPhysicalDamage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionPhysicalDamage"), fetchValueFromTextFields(sumInsuredForSectionPhysicalDamageTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionPhysicalDamage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionPhysicalDamage"), fetchValueFromTextFields(deductibleForSectionPhysicalDamageTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRateBasedOrAmountBasedForSectionICover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RateBasedOrAmountBasedForSectionICover"), fetchValueFromList(rateBasedOrAmountBasedForSectionICoverDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionPhysicalDamage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionPhysicalDamage"), fetchValueFromTextFields(premiumForSectionPhysicalDamageTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIICoverRequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionIICoverRequired"), fetchValueFromList(isSectionIICoverRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIIICoverRequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionIIICoverRequired"), fetchValueFromList(isSectionIIICoverRequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPhysicalDamage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPhysicalDamage"), fetchValueFromTextFields(coverDescriptionForSectionPhysicalDamageTextArea), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitForSubSection")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubLimitForSubSection"), fetchValueFromTextFields(subLimitForSubSectionTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSubSection")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSubSection"), fetchValueFromTextFields(deductibleForSubSectionTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumInSubSection"), fetchValueFromTextFields(premiumInSubSectionTextField), AssertionType.WARNING);
			}

			//2

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIIcoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionIIcoverrequired"), fetchValueFromList(isSectionIIcoverrequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionforSectionIIofOffshoreEnergy")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionforSectionIIofOffshoreEnergy"), fetchValueFromList(coverDescriptionforSectionIIofOffshoreEnergyDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsofBusinessInterruption")) {
				verifySubSectionDetailsOfBusinessInterruption(polAttCoverRuleMHEntity, assertReference);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionBusinessInterruption")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionBusinessInterruption"), fetchValueFromTextFields(sumInsuredForSectionBusinessInterruptionTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionBusinessInterruptionInDays")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionBusinessInterruptionInDays"), fetchValueFromTextFields(deductibleForSectionBusinessInterruptionInDaysTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedorAmountbasedforSectionIICover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RatebasedorAmountbasedforSectionIICover"), fetchValueFromList(ratebasedorAmountbasedforSectionIICoverDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionBusinessInterruption")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionBusinessInterruption"), fetchValueFromTextFields(premiumForSectionBusinessInterruptionTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionBusinessInterruption")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionBusinessInterruption"), fetchValueFromTextFields(coverDescriptionForSectionBusinessInterruptionTextArea), AssertionType.WARNING);
			}

			//3
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIIICoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionIIICoverrequired"), fetchValueFromList(isSectionIIICoverrequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionIIIOfPortPackage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionIIIOfPortPackage"), fetchValueFromList(coverDescriptionForSectionIIIOfPortPackageDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfPortOperatorsLiabilityOpenButton")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfPortOperatorsLiabilityOpenButton"), fetchValueFromList(subSectionDetailsOfPortOperatorsLiabilityOpenButton), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionPortOperatorsLiability")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionPortOperatorsLiability"), fetchValueFromTextFields(sumInsuredForSectionPortOperatorsLiabilityTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionPortOperatorsLiability")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionPortOperatorsLiability"), fetchValueFromTextFields(deductibleForSectionPortOperatorsLiabilityTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountBasedForSectionIIICover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountBasedForSectionIIICover"), fetchValueFromList(ratebasedOrAmountBasedForSectionIIICoverDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionPortOperatorsLiability")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionPortOperatorsLiability"), fetchValueFromTextFields(premiumForSectionPortOperatorsLiabilityTextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPortOperatorsLiability")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPortOperatorsLiability"), fetchValueFromTextFields(coverDescriptionForSectionPortOperatorsLiabilityTextArea), AssertionType.WARNING);
			}  
			//Ajit Product Name:-BR
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverCodeforBR")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverCodeforBR"), fetchValueFromList(coverCodeforBRDropDown), AssertionType.WARNING);

			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsEarthquakeCoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsEarthquakeCoverrequired"), fetchValueFromList(isEarthquakeCoverrequiredDropDownBR), AssertionType.WARNING);

			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsTerrorismCoverr")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsTerrorismCover"), fetchValueFromList(isTerrorismCoverRequiredDropDown), AssertionType.WARNING);
			}

		}
	}

	//NEW 2nd page
	public void fillPolicyInsIntAttachCoverageCoverRule2MarineHull(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity, CustomAssert assertReference) throws InterruptedException{

		if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("add") || polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("edit")){
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIVcoverrequired")) {
				selectValueFromList(isSectionIVcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionIVcoverrequired"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionIVOfPortPackage")) {
				selectValueFromList(coverDescriptionForSectionIVOfPortPackageDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionIVOfPortPackage"));
			}

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsofVesselsButton")) {
				selectValueFromList(subSectionDetailsofVesselsButton, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsofVesselsButton"));
			}

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionVessels")) {
				clearAndSendKeys(sumInsuredForSectionVesselsTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionVessels"));
			}

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionVessels")) {
				clearAndSendKeys(deductibleForSectionVesselsTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionVessels"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionIVCover")) {
				selectValueFromList(ratebasedOrAmountbasedForSectionIVCoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionIVCover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionVessels")) {
				clearAndSendKeys(premiumForSectionVesselsTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionVessels"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVessels")) {
				clearAndSendKeys(coverDescriptionForSectionVesselsTextArea, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVessels"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitForSubSection")) {
				selectValueFromList(subLimitForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("SubLimitForSubSection"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSubSection")) {
				clearAndSendKeys(deductibleForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSubSection"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
				clearAndSendKeys(premiumInSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumInSubSection"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVcoverrequired")) {
				selectValueFromList(isSectionVcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionVcoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVofPortPackage")) {
				selectValueFromList(coverDescriptionForSectionVofPortPackageDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVofPortPackage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfWreckRemovalButton")) {
				selectValueFromList(subSectionDetailsOfWreckRemovalButton, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfWreckRemovalButton"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionWreckRemoval")) {
				clearAndSendKeys(sumInsuredForSectionWreckRemovalTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionWreckRemoval"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSectionWreckRemoval")) {
				selectValueFromList(deductibleforSectionWreckRemovalTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSectionWreckRemoval"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionVCover")) {
				selectValueFromList(ratebasedOrAmountbasedForSectionVCoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionVCover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionWreckRemoval")) {
				clearAndSendKeys(premiumForSectionWreckRemovalTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionWreckRemoval"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIcoverrequired")) {
				selectValueFromList(isSectionVIcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIcoverrequired"));
				click(forwardButton);
			}
		}

		else if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionIVcoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionIVcoverrequired"), fetchValueFromList(isSectionIVcoverrequiredDropDown), AssertionType.WARNING);
			} 
			
			
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVcoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionVcoverrequired"), fetchValueFromList(isSectionVcoverrequiredDropDown), AssertionType.WARNING);
			}
				
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIcoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIcoverrequired"), fetchValueFromList(isSectionVIcoverrequiredDropDown), AssertionType.WARNING);
				click(forwardButton);
			}
			
			
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionIVOfPortPackage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionIVOfPortPackage"), fetchValueFromList(coverDescriptionForSectionIVOfPortPackageDropDown), AssertionType.WARNING);
			} 
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsofVesselsButton")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsofVesselsButton"), fetchValueFromTextFields(subSectionDetailsofVesselsButton), AssertionType.WARNING);
			} 
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionVessels")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionVessels"), fetchValueFromTextFields(sumInsuredForSectionVesselsTextField), AssertionType.WARNING);
			} 
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionVessels")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionVessels"), fetchValueFromTextFields(deductibleForSectionVesselsTextField), AssertionType.WARNING);
			} 
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionIVCover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionIVCover"), fetchValueFromList(ratebasedOrAmountbasedForSectionIVCoverDropDown), AssertionType.WARNING);
			} 
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionVessels")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionVessels"), fetchValueFromTextFields(premiumForSectionVesselsTextField), AssertionType.WARNING);

				if (polAttCoverRuleMHEntity.getBooleanValueForField("CoverDescriptionForSectionVessels")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVessels"), fetchValueFromTextFields(coverDescriptionForSectionVesselsTextArea), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitForSubSection")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubLimitForSubSection"), fetchValueFromTextFields(subLimitForSubSectionTextField), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSubSection")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSubSection"), fetchValueFromTextFields(deductibleForSubSectionTextField), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumInSubSection"), fetchValueFromTextFields(premiumInSubSectionTextField), AssertionType.WARNING);
				}
				//NEW 2nd PAGE(b)
				
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVofPortPackage")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVofPortPackage"), fetchValueFromList(coverDescriptionForSectionVofPortPackageDropDown), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfWreckRemovalButton")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfWreckRemovalButton"), fetchValueFromTextFields(subSectionDetailsOfWreckRemovalButton), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionWreckRemoval")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionWreckRemoval"), fetchValueFromTextFields(sumInsuredForSectionWreckRemovalTextField), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSectionWreckRemoval")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSectionWreckRemoval"), fetchValueFromTextFields(deductibleforSectionWreckRemovalTextField), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionVCover")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionVCover"), fetchValueFromList(ratebasedOrAmountbasedForSectionVCoverDropDown), AssertionType.WARNING);
				}
				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionWreckRemoval")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionWreckRemoval"), fetchValueFromTextFields(premiumForSectionWreckRemovalTextField), AssertionType.WARNING);


				}
			}
		}
	}

	//NEW 3rd PAGE

	public void fillPolicyInsIntAttachCoverageCoverRule3MarineHull(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity, CustomAssert assertReference) throws InterruptedException{

		if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("add") || polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("edit")){
			//if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIcoverrequired")) {
			//	selectValueFromList(isSectionVIcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIcoverrequired"));
			//	}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionforSectionVIofPortPackage")) {
				selectValueFromList(coverDescriptionforSectionVIofPortPackageDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionforSectionVIofPortPackage"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOtherCover1Details")) {
				clearAndSendKeys(otherCover1DetailsTextArea, polAttCoverRuleMHEntity.getStringValueForField("OtherCover1Details"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsofOtherCover1Button")) {
				selectValueFromList(subSectionDetailsofOtherCover1Button, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsofOtherCover1Button"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredforSectionOtherCover1")) {
				clearAndSendKeys(sumInsuredforSectionOtherCover1TextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredforSectionOtherCover1"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSectionOtherCover1")) {
				clearAndSendKeys(deductibleforSectionOtherCover1TextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSectionOtherCover1"));
			}	
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedorAmountbasedforSectionVICover")) {
				selectValueFromList(ratebasedorAmountbasedforSectionVICoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedorAmountbasedforSectionVICover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumforSectionOtherCover1")) {
				clearAndSendKeys(premiumforSectionOtherCover1TextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumforSectionOtherCover1"));
			}
			//2(B)
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIIcoverrequired")) {
				selectValueFromList(isSectionVIIcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIIcoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVIIofPortPackage")) {
				selectValueFromList(coverDescriptionForSectionVIIofPortPackageDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVIIofPortPackage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOtherCover2Details")) {
				clearAndSendKeys(otherCover2DetailsTextArea, polAttCoverRuleMHEntity.getStringValueForField("OtherCover2Details"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfOtherCover2Button")) {
				selectValueFromList(subSectionDetailsOfOtherCover2Button, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfOtherCover2Button"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionOtherCover2")) {
				clearAndSendKeys(sumInsuredForSectionOtherCover2TextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionOtherCover2"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionOtherCover2")) {
				clearAndSendKeys(deductibleForSectionOtherCover2TextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionOtherCover2"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionVIICover")) {
				selectValueFromList(ratebasedOrAmountbasedForSectionVIICoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionVIICover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionOtherCover2")) {
				clearAndSendKeys(premiumForSectionOtherCover2TextField, polAttCoverRuleMHEntity.getStringValueForField("premiumForSectionOtherCover2"));
			}	
			//2(C)
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIIIcoverrequired")) {
				selectValueFromList(isSectionVIIIcoverrequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIIIcoverrequired"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVIIIofPortPackage")) {
				selectValueFromList(coverDescriptionForSectionVIIIofPortPackageDropDown, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVIIIofPortPackage"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOtherCover3Details")) {
				clearAndSendKeys(otherCover3DetailsTextArea, polAttCoverRuleMHEntity.getStringValueForField("OtherCover3Details"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfOtherCover3Button")) {
				selectValueFromList(subSectionDetailsOfOtherCover3Button, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfOtherCover3Button"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionOtherCover3")) {
				clearAndSendKeys(sumInsuredForSectionOtherCover3TerxtField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionOtherCover3"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionOtherCover3")) {
				clearAndSendKeys(deductibleForSectionOtherCover3TextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionOtherCover3"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedorAmountbasedForSectionVIIICover")) {
				selectValueFromList(ratebasedorAmountbasedForSectionVIIICoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedorAmountbasedForSectionVIIICover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionOtherCover3")) {
				clearAndSendKeys(premiumForSectionOtherCover3TextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionOtherCover3"));
			}

			//ddddd

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIXcoverrequireddrop")) {
				selectValueFromList(IsSectionIXcoverrequireddropdown, polAttCoverRuleMHEntity.getStringValueForField("Ixcoverrequired"));
			}



		/*	if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIIcoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIIcoverrequired"), fetchValueFromList(isSectionVIIcoverrequiredDropDown), AssertionType.WARNING);
			}*/





			//2(d)
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsOnshoreTerrorismCoverRequired")) {
				selectValueFromList(isOnshoreTerrorismCoverRequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsOnshoreTerrorismCoverRequired"));
				click(forwardButton);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfOnshoreTerrorismButton")) {
				clearAndSendKeys(subSectionDetailsOfOnshoreTerrorismButton, polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfOnshoreTerrorismButton"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForOnshoreTerrorism")) {
				clearAndSendKeys(sumInsuredForOnshoreTerrorismTextField, polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForOnshoreTerrorism"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForOnshoreTerrorism")) {
				clearAndSendKeys(deductibleForOnshoreTerrorismTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleForOnshoreTerrorism"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedforOnshoreTerrorismCover")) {
				selectValueFromList(ratebasedOrAmountbasedforOnshoreTerrorismCoverDropDown, polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedforOnshoreTerrorismCover"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForOnshoreTerrorism")) {
				clearAndSendKeys(premiumForOnshoreTerrorismTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumForOnshoreTerrorism"));
			}

		}
		else if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("verify")){

			
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionforSectionVIofPortPackage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigCoverDescriptionforSectionVIofPortPackage"), fetchValueFromList(coverDescriptionforSectionVIofPortPackageDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOtherCover1Details")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigOtherCover1Details"), fetchValueFromTextFields(otherCover1DetailsTextArea), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsofOtherCover1Button")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigSubSectionDetailsofOtherCover1Button"), fetchValueFromTextFields(subSectionDetailsofOtherCover1Button), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredforSectionOtherCover1")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigSumInsuredforSectionOtherCover1"), fetchValueFromTextFields(sumInsuredforSectionOtherCover1TextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSectionOtherCover1")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigDeductibleforSectionOtherCover1"), fetchValueFromTextFields(deductibleforSectionOtherCover1TextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedorAmountbasedforSectionVICover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigRatebasedorAmountbasedforSectionVICover"), fetchValueFromList(ratebasedorAmountbasedforSectionVICoverDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumforSectionOtherCover1")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumforSectionOtherCover1"), fetchValueFromList(premiumforSectionOtherCover1TextField), AssertionType.WARNING);
			}
			//2(b)
			
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVIIofPortPackage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVIIofPortPackage"), fetchValueFromList(coverDescriptionForSectionVIIofPortPackageDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOtherCover2Details")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("OtherCover2Details"), fetchValueFromTextFields(otherCover2DetailsTextArea), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfOtherCover2Button")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfOtherCover2Button"), fetchValueFromTextFields(subSectionDetailsOfOtherCover2Button), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionOtherCover2")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForSectionOtherCover2"), fetchValueFromTextFields(sumInsuredForSectionOtherCover2TextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionOtherCover2")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForSectionOtherCover2"), fetchValueFromTextFields(deductibleForSectionOtherCover2TextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedForSectionVIICover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedForSectionVIICover"), fetchValueFromList(ratebasedOrAmountbasedForSectionVIICoverDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionOtherCover2")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForSectionOtherCover2"), fetchValueFromList(premiumForSectionOtherCover2TextField), AssertionType.WARNING);
			}
			//2(c)
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsSectionVIIIcoverrequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsSectionVIIIcoverrequired"), fetchValueFromList(isSectionVIIIcoverrequiredDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionVIIIofPortPackage")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionVIIIofPortPackage"), fetchValueFromList(coverDescriptionForSectionVIIIofPortPackageDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOtherCover3Details")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigOtherCover3Details"), fetchValueFromTextFields(otherCover3DetailsTextArea), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfOtherCover3Button")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigSubSectionDetailsOfOtherCover3Button"), fetchValueFromTextFields(subSectionDetailsOfOtherCover3Button), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForSectionOtherCover3")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigSumInsuredForSectionOtherCover3"), fetchValueFromTextFields(sumInsuredForSectionOtherCover3TerxtField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForSectionOtherCover3")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigDeductibleForSectionOtherCover3"), fetchValueFromTextFields(deductibleForSectionOtherCover3TextField), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedorAmountbasedForSectionVIIICover")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigRatebasedorAmountbasedForSectionVIIICover"), fetchValueFromList(ratebasedorAmountbasedForSectionVIIICoverDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForSectionOtherCover3")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("ConfigPremiumForSectionOtherCover3"), fetchValueFromList(premiumForSectionOtherCover3TextField), AssertionType.WARNING);
			}
				//ddddd

				if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIXcoverrequireddrop")) {
					assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("Ixcoverrequired"), fetchValueFromList(IsSectionIXcoverrequireddropdown), AssertionType.WARNING);
				}	






			
		
		//2(d)
		/*if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsOnshoreTerrorismCoverRequired")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsOnshoreTerrorismCoverRequired"), fetchValueFromList(isOnshoreTerrorismCoverRequiredDropDown), AssertionType.WARNING);
		}*/
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubSectionDetailsOfOnshoreTerrorismButton")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubSectionDetailsOfOnshoreTerrorismButton"), fetchValueFromTextFields(subSectionDetailsOfOnshoreTerrorismButton), AssertionType.WARNING);
		}
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSumInsuredForOnshoreTerrorism")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SumInsuredForOnshoreTerrorism"), fetchValueFromTextFields(sumInsuredForOnshoreTerrorismTextField), AssertionType.WARNING);
		}
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleForOnshoreTerrorism")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleForOnshoreTerrorism"), fetchValueFromTextFields(deductibleForOnshoreTerrorismTextField), AssertionType.WARNING);
		}
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRatebasedOrAmountbasedforOnshoreTerrorismCover")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RatebasedOrAmountbasedforOnshoreTerrorismCover"), fetchValueFromList(ratebasedOrAmountbasedforOnshoreTerrorismCoverDropDown), AssertionType.WARNING);
		}
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumForOnshoreTerrorism")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumForOnshoreTerrorism"), fetchValueFromTextFields(premiumForOnshoreTerrorismTextField), AssertionType.WARNING);
		}
		}
	}

	//WR
	public void fillPolicyInsIntAttachCoverageCoverRuleWR(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity, CustomAssert assertReference) throws InterruptedException{

		if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("add") || polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("edit")){
			//wr
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigTypeOfWarRisk")) {
				selectValueFromList(typeOfWarRiskDropdown, polAttCoverRuleMHEntity.getStringValueForField("TypeOfWarRisk"));
				click(forwardButton);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigFleetOfVesselsForOceanGoing")) {
				selectValueFromList(fleetOfVesselsForOceanGoingDropdown, polAttCoverRuleMHEntity.getStringValueForField("FleetOfVesselsForOceanGoing"));
				click(forwardButton);
			}

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRateAsPerGIWarRiskScheme")) {
				clearAndSendKeys(rateAsPerGIWarRiskSchemeTextField, polAttCoverRuleMHEntity.getStringValueForField("RateAsPerGIWarRiskScheme"));
				//click(forwardButton);
			}
		}
		else if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigTypeOfWarRisk")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("TypeOfWarRisk"), fetchValueFromList(typeOfWarRiskDropdown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigFleetOfVesselsForOceanGoing")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("FleetOfVesselsForOceanGoing"), fetchValueFromList(fleetOfVesselsForOceanGoingDropdown), AssertionType.WARNING);

			}

			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRateAsPerGIWarRiskScheme")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("RateAsPerGIWarRiskScheme"), fetchValueFromTextFields(rateAsPerGIWarRiskSchemeTextField), AssertionType.WARNING);
			}
		}

	}	
	//HM
	public void fillPolicyInsIntAttachCoverageCoverRuleHM(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity, CustomAssert assertReference) throws InterruptedException{

		if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("add") || polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("edit")){
			//HM
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigStandardCoverType")) {
				selectValueFromList(standardCoverTypeDropDown, polAttCoverRuleMHEntity.getStringValueForField("StandardCoverType"));
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsPremReducCoverRequired")) {
				selectValueFromList(isPremReducCoverRequiredDropDown, polAttCoverRuleMHEntity.getStringValueForField("IsPremReducCoverRequired"));
			}
		}
		else if(polAttCoverRuleMHEntity.getAction().equalsIgnoreCase("verify")){
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigStandardCoverType")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("StandardCoverType"), fetchValueFromList(standardCoverTypeDropDown), AssertionType.WARNING);
			}
			if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigIsPremReducCoverRequired")) {
				assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("IsPremReducCoverRequired"), fetchValueFromList(isPremReducCoverRequiredDropDown), AssertionType.WARNING);
			}
		}
	}
	public void clickOnOpenButton(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity) throws InterruptedException{
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOpenButton")){
			click(subSectionDetailsOfPhysicalDamageOpenButton);
			Thread.sleep(5000);
			switchToWindow("'Sub Section Details of Physical Damage' Details");			
		}
	}
	public void clickOnOpenButton1(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity) throws InterruptedException{
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOpenButton")){
			click(subSectionDetailsOfBusinessInterruptionButton);
			Thread.sleep(5000);
			switchToWindow("' Sub Section Details Of Business Interruption");			
		}
	}

	public void clickOnOpenButton2(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity) throws InterruptedException{
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigOpenButton")){
			click(subSectionDetailsOfPortOperatorsLiabilityOpenButton);
			Thread.sleep(5000);
			switchToWindow("' Sub Section Details of Port Operators Liability");			
		}
	}

	public void fillSubSectionDetailsOfPhysicalDamage(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity) throws InterruptedException{
		clickOnOpenButton(polAttCoverRuleMHEntity);
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			Thread.sleep(5000);		
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPhysicalDamage")) {
			clearAndSendKeys(coverDescriptionForSectionPhysicalDamageTextArea, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPhysicalDamage"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitforSubSection")) {
			clearAndSendKeys(subLimitForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("SubLimitforSubSection"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSubSection")) {
			clearAndSendKeys(deductibleForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSubSection"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
			clearAndSendKeys(premiumInSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumInSubSection"));
		}	
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonSubSectionDetailsOfPhysicalDamage")) {
			click(saveButton);
			Thread.sleep(5000);
			click(closeButton);
			Thread.sleep(5000);
		}
	}
	public void fillSubSectionDetailsOfBusinessInterruption(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity) throws InterruptedException{
		clickOnOpenButton1(polAttCoverRuleMHEntity);
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			Thread.sleep(5000);		
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionBusinessInterruption")) {
			clearAndSendKeys(coverDescriptionForSectionBusinessInterruptionTextArea, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionBusinessInterruption"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitforSubSection")) {
			clearAndSendKeys(subLimitForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("SubLimitforSubSection"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSubSection")) {
			clearAndSendKeys(deductibleForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSubSection"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
			clearAndSendKeys(premiumInSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiumInSubSection"));
		}	
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonSubSectionDetailsOfPhysicalDamage")) {
			click(saveButton);
			Thread.sleep(5000);
			click(closeButton);
			Thread.sleep(5000);
		}
	}
	public void filSubSectionDetailsOfPortOperatorsLiability(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity) throws InterruptedException{
		clickOnOpenButton2(polAttCoverRuleMHEntity);
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
			Thread.sleep(5000);		
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPortOperatorsLiability")) {
			clearAndSendKeys(coverDescriptionForSectionPortOperatorsLiabilityTextArea, polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPortOperatorsLiability"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitforSubSection")) {
			clearAndSendKeys(subLimitForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("SubLimitforSubSection"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSubSection")) {
			clearAndSendKeys(deductibleForSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSubSection"));
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
			clearAndSendKeys(premiumInSubSectionTextField, polAttCoverRuleMHEntity.getStringValueForField("PremiuminSubSection"));
		}	
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonSubSectionDetailsOfPhysicalDamage")) {
			click(saveButton);
			Thread.sleep(5000);
			click(closeButton);
			Thread.sleep(5000);
		}
	}

	public void verifySubSectionDetailsOfPhysicalDamage(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton(polAttCoverRuleMHEntity);
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPhysicalDamage")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPhysicalDamage"), fetchValueFromTextFields(coverDescriptionForSectionPhysicalDamageTextArea), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitforSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubLimitforSubSection"), fetchValueFromTextFields(subLimitForSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSubSection"), fetchValueFromTextFields(deductibleForSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiuminSubSection"), fetchValueFromTextFields(premiumInSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonSubSectionDetailsOfPhysicalDamage")) {
			click(closeButton);
			Thread.sleep(5000);
		}
	}

	public void verifySubSectionDetailsOfBusinessInterruption(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton1(polAttCoverRuleMHEntity);
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionBusinessInterruption")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionBusinessInterruption"), fetchValueFromTextFields(coverDescriptionForSectionBusinessInterruptionTextArea), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitforSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubLimitforSubSection"), fetchValueFromTextFields(subLimitForSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSubSection"), fetchValueFromTextFields(deductibleForSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiumInSubSection"), fetchValueFromTextFields(premiumInSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonSubSectionDetailsOfBusinessInterruption")) {
			click(closeButton);
			Thread.sleep(5000);
		}
	}

	public void verifySubSectionDetailsOfPortOperatorsLiability(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity,CustomAssert assertReference) throws InterruptedException{
		clickOnOpenButton2(polAttCoverRuleMHEntity);
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverDescriptionForSectionPortOperatorsLiability")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("CoverDescriptionForSectionPortOperatorsLiability"), fetchValueFromTextFields(coverDescriptionForSectionPortOperatorsLiabilityTextArea), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSubLimitforSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("SubLimitforSubSection"), fetchValueFromTextFields(subLimitForSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDeductibleforSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("DeductibleforSubSection"), fetchValueFromTextFields(deductibleForSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumInSubSection")) {
			assertReference.assertEquals(polAttCoverRuleMHEntity.getStringValueForField("PremiuminSubSection"), fetchValueFromTextFields(premiumInSubSectionTextField), AssertionType.WARNING);
		}
		if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonSubSectionDetailsOfBusinessInterruption")) {
			click(closeButton);
			Thread.sleep(5000);
		}
	}

	public void navigateToPolicyTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
		else if(polAttCoverRuleMHEntity.getBooleanValueForField("ConfigInsuredInterestTab")){
			click(insuredInterestTab);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetail1Tab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigMemberDetailsTab")){
			click(detail1Title);
			isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void navigateToAttributes1Tab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigMemberAttributesTab")){
			click(attributes1Title);
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(attachCoverageTitle);
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelationTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(relations1Title);
			isElementDisplayed(memberRelationTitle);
		}
	}
	public void navigateToPaymentTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(payments1Title);
			isElementDisplayed(memberPaymentListTitle);
		}
	}
	public void navigateToDetails2Tab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigMemberTab")){
			click(details2Title);
			isElementDisplayed(policyMemberCoverageTitle);
		}
	}
	public void navigateToAttributes2Tab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributes2Title);
			isElementDisplayed(memberAttributes2Title);
		}
	}
	public void navigateToPremiumTab(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigPremiumTab")){
			click(premiumTitle);
			isElementDisplayed(premiumSchedule2Title);
		}
	}
	public void clickNextButton(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButton1")){
		click(forwardButton);
		}
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButton")){
			isElementDisplayed(coverRule2forPortPKGTitle);
		}
	}



	public void clickNextButtonCS(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButtonCS")) {
			click(forwardButton);

		}
	}



	public void clickNextButtonCS3(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButtonCS3")) {
			click(forwardButton);

		}
	}





	public void clickNextButtonWR(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButtonWR")){
			click(forwardButton);
			isElementDisplayed(warRiskTitle);
		}
	}
	public void clickNextButtonForCoverRule2(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButtonForCoverRule2")){
			click(forwardButton);
			isElementDisplayed(coverRule3forPortPKGTitle);
		}
	}
	public void clickNextButtonForCoverRule3(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButtonForCoverRule3")){
			click(forwardButton);
			isElementDisplayed(coverRule3forPortPKGTitle);
		}
	}
	
	
	//samplechange
	
	public void clickSaveButton(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButton")){
			click(saveButton);
			isElementDisplayed(coverRule3forPortPKGTitle);
		}
	}


	public void clickSaveButtonCS(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){

		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonCS")){
			click(saveButtonForRule3);

		}}

	public void clickSaveButtonWR(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonWR")){
			click(saveButton);
			isElementDisplayed(warRiskTitle);
		}
	}

	public void clickNextButtonForHM(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigForwardButtonForHM")){
			click(forwardButton);
		}
	}
	public void clickSaveButtonHM(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity){
		if (polAttCoverRuleMHEntity.getBooleanValueForField("ConfigSaveButtonHM")){
			click(saveButton);
		}
	}
	public void fillandSubmitPolicyInsIntAttachCoverageCoverRule(PolAttCoverRuleMHEntity polAttCoverRuleMHEntity, CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(polAttCoverRuleMHEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsIntAttachCoverageCoverRule1MarineHull(polAttCoverRuleMHEntity,assertReference);
			clickNextButton(polAttCoverRuleMHEntity);
			clickNextButtonCS(polAttCoverRuleMHEntity);
			fillPolicyInsIntAttachCoverageCoverRule2MarineHull(polAttCoverRuleMHEntity,assertReference);
			//clickNextButtonCS(polAttCoverRuleMHEntity);
			
			
			//problemCp
			clickNextButtonForCoverRule2(polAttCoverRuleMHEntity);
			fillPolicyInsIntAttachCoverageCoverRule3MarineHull(polAttCoverRuleMHEntity,assertReference);
			
			clickNextButtonCS3(polAttCoverRuleMHEntity);
			clickNextButtonForCoverRule3(polAttCoverRuleMHEntity);

			clickSaveButton(polAttCoverRuleMHEntity);
			clickSaveButtonCS(polAttCoverRuleMHEntity);
			fillPolicyInsIntAttachCoverageCoverRuleWR(polAttCoverRuleMHEntity,assertReference);
			clickSaveButtonWR(polAttCoverRuleMHEntity);
			fillPolicyInsIntAttachCoverageCoverRuleHM(polAttCoverRuleMHEntity, assertReference);
			clickNextButtonForHM(polAttCoverRuleMHEntity);
			clickSaveButtonHM(polAttCoverRuleMHEntity);
			navigateToPolicyTab(polAttCoverRuleMHEntity);
			navigateToAttributeTab(polAttCoverRuleMHEntity);
			navigateToInsuredInterestTab(polAttCoverRuleMHEntity);
			navigateToCoverageTab(polAttCoverRuleMHEntity);

			navigateToClientDetailsTab(polAttCoverRuleMHEntity);
			navigateToRelationsTab(polAttCoverRuleMHEntity);
			navigateToPaymentsTab(polAttCoverRuleMHEntity);
			navigateToFollowupTab(polAttCoverRuleMHEntity);
			navigateToDocumentTab(polAttCoverRuleMHEntity);
			navigateToDetail1Tab(polAttCoverRuleMHEntity);
			navigateToAttributes1Tab(polAttCoverRuleMHEntity);
			navigateToAttachCoverageTab(polAttCoverRuleMHEntity);
			navigateToRelationTab(polAttCoverRuleMHEntity);
			navigateToPaymentTab(polAttCoverRuleMHEntity);
			navigateToPremiumTab(polAttCoverRuleMHEntity);
		}
	}
}








