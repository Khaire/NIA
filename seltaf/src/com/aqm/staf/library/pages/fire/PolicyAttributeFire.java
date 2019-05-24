package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolAttrFireEntity;

public class PolicyAttributeFire extends BasePage {

	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;
	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	//FF DHK
	private PageElement isItaReshBusinessOrRenewalDropDown;	
	private PageElement whetherlistOfallStorageLocationsIncludingTheirDetailedDropDown;
	private PageElement whetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOutDropDown;
	private PageElement underwritingClassificationDropDown;
	private PageElement whetherTheRiskIsSituatedInSEZDropDown;
	//FP DHK
	private PageElement isServiceTaxExemptedDropDown;
	//LR DHK
	private PageElement statusOfRiskLRDropDown;
	private PageElement typeOfPolicyLRDropDown;
	private PageElement remarksTextArea;
	private PageElement installmentPercentageListOpenButton;
	private PageElement serialNoTextField;	
	private PageElement installmentPercentageTextField; 
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	//DIGVIJAY PROD-AR  
	private PageElement isTheRiskNewDropDown;
	private PageElement isItAFreshBusinessOrRenewalDropDown;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement sinceWhenTheRiskIsInsuredUnderIARTextField;
	private PageElement detailsOfPreviousInsurancesTextArea;
	private PageElement hasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicDropDown;
	private PageElement hasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicyDropDown;
	private PageElement detailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicyTextArea;
	private PageElement whetherTheInsuredSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPremropDown;
	private PageElement detailsOfTheAllPreviousLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicyTextArea;
	private PageElement whetherTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPremDropDown;
	private PageElement  detailsofTheAllPrevLossesDueToMBBEEEIBurglaryTextArea;
	private PageElement whetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPremDropDown;
	private PageElement detailsOfTheAllPreviousBIFirelossesTextArea;
	private PageElement whetherTheInsuredSufferedLosslossesDueToBusiInterruptMBForTheInsPremDropDown;
	private PageElement detailsOfTheAllPreviousBIMBLossesTextArea;
	private PageElement hasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsuDropDown;
	private PageElement hasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPremDropDown;
	private PageElement hasAnyInsIncrThePremOrImpSpecialAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLocDropDown;
	private PageElement coInsuranceApplicableDropDown;
	//digvijay prod-df
	private PageElement whtrListOfAllStorLocsInclTheirDetAddWithPINCodeNumbersAreClearlySpeltOutDropDown;	
	private PageElement whetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremisesDropDown;	
	private PageElement whetherTotSumInsuUnThePolCoveringOneOrMoreThanOneGodownsIsRs2CroreAndAboveDropDown;	
	private PageElement whetherSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsuDropDown;	
	private PageElement confirmWhetherStocksAtRailSidAreNotDesForInsuDropDown;
	private PageElement opportunityIdTextField;
	/* PE-Rajkumar*/
	//private PageElement isTheRiskNewDropDown;
	private PageElement isItAfreshBusinessOrRenewalDropDown;
	private PageElement doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSameDropDown;
	private PageElement whetherTheInsuredSufferedLossDueToFireAndOrAnyOtherDropDown;
	private PageElement hasAnyInsurerAtAnyTimeDeclinedToAcceptDropDown;
	private PageElement hasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCoverDropDown;
	private PageElement hasAnyInsurerIncreasedThePremiumOrImposedSpecialConditionDropDown;
	/* SA-Rajkumar*/
	private PageElement statusOfRiskSADropDown;
	private PageElement typeOfRiskSADropDown;
	private PageElement typeOfPolicySADropDown;
	/*SE-Rajkumar*/
	private PageElement hasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerilsDropDown;
	//FD-Yogesh
	private PageElement whetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAboveDropDown;	
	private PageElement whetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCoveredDropdown;	
	//digvijay lp
	private PageElement isThePropARenOfBusInterFirePolicyDropDown;
	private PageElement typeOfPolicyLPDropDown;
	private PageElement typeOfPolicyDropDown;
	
	public PolicyAttributeFire(WebDriver driver, String pageName){

		super(driver, pageName);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//FF DHK
		isItaReshBusinessOrRenewalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is it a fresh business or renewal')]/following::select"), "Is it a fresh business or renewal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherlistOfallStorageLocationsIncludingTheirDetailedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'clearly spelt out')]/following::select"), "Whether list of all storage locations including their detailed address with PIN code numbers are clearly spelt out", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOutDropDown=new PageElement(By.xpath("//td//div[contains(text(),'compound/premises')]/following::select"), "Whether different Godowns covered under the policy are located in the same compound/premises", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Insurance Applicable", "select")), "Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		underwritingClassificationDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Underwriting Classification')]/following::select"), "Underwriting Classification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTheRiskIsSituatedInSEZDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the risk is situated in SEZ')]/following::select"), "Whether the risk is situated in SEZ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		opportunityIdTextField=new PageElement(By.xpath("//td//div[contains(text(),'Opportunity Id')]/following::input"), "Opportunity Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FP DHK
		isServiceTaxExemptedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Service Tax Exempted')]/following::select"), "Is Service Tax Exempted", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//LR DHK
		statusOfRiskLRDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Status of Risk (LR)')]/following::select"), "Status of Risk (LR)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfPolicyLRDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Policy (LR)')]/following::select"), "Type of Policy (LR)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfPolicyLPDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Policy (LP)')]/following::select"), "Type of Policy (LP)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		typeOfPolicyDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type Of Policy", "select")), "Type of Policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
		remarksTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Remarks')]/following::textarea"), "Remarks", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageListOpenButton= new PageElement(By.name("propValues6"), "Installment Percentage List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextField= new PageElement(By.name("slNo0"), "Serial No. ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageTextField= new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY PROD-AR 
		isTheRiskNewDropDown=new PageElement(By.name(locatorforQuestionAnswerPanel("Is the risk new", "select")), "Is the risk new", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isItAFreshBusinessOrRenewalDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is it a fresh business or renewal", "select")), "Is it a fresh business or renewal", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sinceWhenTheRiskIsInsuredUnderIARTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Since when the risk is insured under IAR", "input")), "Since when the risk is insured under IAR", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfPreviousInsurancesTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of previous insurances", "textarea")), "Details of previous insurances", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Has the property been previously insured against fire and allied perils of SFSP policy", "select")), "Has the property been previously insured against fire and allied perils ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicyDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Has the property been previously insured against MB, BE, EEI and Burglary policy", "select")), "Has the property been previously insured against MB, BE, EEI and Burglary", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of previously insured against MB,BE,EEI and Burglary policy')]/following::textarea"), "Details of previously insured against MB,BE,EEI and Burglary policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheInsuredSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPremropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the insured suffered loss/losses due to fire and allied perils of SFSP policy at the insured premises", "select")), "'Whether the insured suffered loss/losses due to fire and allied perils of SFSP policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfTheAllPreviousLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicyTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of the all Previous losses due to fire and/or any other allied peril to be Covered under the proposed policy')]/following::textarea"), "Details of the all Previous losses due to fire and/or any other allied peril to be Covered", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPremDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the insured suffered loss/losses due to MB, BE, EEI,Burglary policy at the insured premises", "select")), "Whether the insured suffered loss/losses due to MB, BE, EEI,Burglary policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsofTheAllPrevLossesDueToMBBEEEIBurglaryTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of the all Previous losses due to MB, BE, EEI, Burglary')]/following::textarea"), "Details of the all Previous losses due to MB, BE, EEI, Burglary", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPremDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the insured suffered loss/losses due to Business Interruption (Fire) for the insured premises", "select")), "Whether the insured suffered loss/losses due to Business Interruption (Fire)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfTheAllPreviousBIFirelossesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of the all Previous BI (Fire) losses')]/following::textarea"), "Details of the all Previous BI (Fire) losses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheInsuredSufferedLosslossesDueToBusiInterruptMBForTheInsPremDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether the insured suffered loss/losses due to Business Interruption (MB) for the insured premises", "select")), "Whether the insured suffered loss/losses due to Business Interruption (MB) for the insured premises", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfTheAllPreviousBIMBLossesTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of the all Previous BI (MB) losses')]/following::textarea"), "Details of the all Previous BI (MB) losses", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsuDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Has any insurer at any time declined to accept any insurance proposal from the insured","select")), "Has any insurer at any time declined to accept any insurance proposal ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPremDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Has any insurer at any time refused to renew the insurance cover for the insured premises", "select")), "Has any insurer at any time refused to renew the insurance cover for the insured premises", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hasAnyInsIncrThePremOrImpSpecialAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLocDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Has any insurer increased the premium or imposed special conditions at the time of renewal or during the currency of the policy for the insured location", "select")), "Has any insurer increased the premium or imposed special conditions at the time of renewal or during the currency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coInsuranceApplicableDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Insurance Applicable", "select")), "Co-Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//digvijay prod-df
		whtrListOfAllStorLocsInclTheirDetAddWithPINCodeNumbersAreClearlySpeltOutDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether list of all storage locations including their detailed address with PIN code numbers are clearly spelt out')]/following::select"), "Whether list of all storage locations including their detailed address with PIN code numbers", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremisesDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether different Godowns covered under the policy are located in the same compound/premises')]/following::select"), "Whether different Godowns covered under the policy are located in the same compound", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherTotSumInsuUnThePolCoveringOneOrMoreThanOneGodownsIsRs2CroreAndAboveDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Total Sum Insured under the Policy covering one or more than one godowns is Rs. 2 Crore and above')]/following::select"), "Whether Total Sum Insured under the Policy covering one or more than one godowns", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsuDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether sum Insured is not less than Rs. 25 Lacs in at least one location out of various locations insured')]/following::select"), "Whether sum Insured is not less than Rs. 25 Lacs in at least one location ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		confirmWhetherStocksAtRailSidAreNotDesForInsuDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Confirm whether stocks at Railway sidings are not desired for Insurance')]/following::select"), "Confirm whether stocks at Railway sidings are not desired for Insurance", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		/* PE-Rajkumar*/
		isTheRiskNewDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is the risk new')]/following::select"), "Is The Risk New DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isItAfreshBusinessOrRenewalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is it a fresh business or renewal')]/following::select"), "Is It A fresh Business Or Renew a lDropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSameDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Do you have any other concurrent insurance in respect of the same property proposed for the insurance')]/following::select"), "Do You Have Any Other Concurrent Insurance In Respect Of The Same DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherTheInsuredSufferedLossDueToFireAndOrAnyOtherDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether the insured suffered loss/losses due to fire and/or any other allied peril at the risk premises')]/following::select"), "Whether The Insured Suffered Loss Due To Fire And Or Any Other DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hasAnyInsurerAtAnyTimeDeclinedToAcceptDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurer at any time declined to accept any insurance proposal from the insured')]/following::select"), "Has Any Insurer At Any Time Declined To Accept DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCoverDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurer at any time refused to renew your insurance cover')]/following::select"), "Has Any Insurer At Any Time Refused To Renew Your Insurance Cover DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hasAnyInsurerIncreasedThePremiumOrImposedSpecialConditionDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Has any insurer increased the premium or imposed special condition for continuing the policy or at the time of renewal of policy.')]/following::select"), "Has Any Insurer Increased The Premium Or Imposed Special Condition List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/* SA -Rajkumar*/
		statusOfRiskSADropDown=new PageElement(By.xpath("//td//div[contains(text(),'Status of Risk (SA)')]/following::select"), "Status Of Risk SA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfRiskSADropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Policy (SA)')]/following::select"), "Type Of Risk SA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		 typeOfPolicySADropDown=new PageElement(By.xpath("//div[@id='Type Of Policy']/following::select"), "Type Of Policy SA", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		/*SE -Rajkumar*/
		statusOfRiskSADropDown=new PageElement(By.xpath("//td//div[contains(text(),'Status of Risk (SA)')]/following::select"), "Status Of Risk SA", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*SE-Rajkumar*/
		hasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerilsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Has the property been previously insured against fire and allied perils')]/following::select"), "Has the Property Been Previously Insured Against Fire And Allied Perils List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Dharmendra
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		installmentPercentageTextField= new PageElement(By.name("Data_210784827092009_0"), "Installment Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//FD-Yogesh
		whetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAboveDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Total Sum Insured under the Policy covering one or more than one godowns is Rs. 1 Crore and above')]/following::select"), "Whether Total Sum Insured under the Policy covering one or more than one godowns is Rs. 1 Crore and above", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		whetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCoveredDropdown=new PageElement(By.xpath("//td//div[contains(text(),'Whether one Godown location is covered or more than one locations are covered')]/following::select"), "Whether one Godown location is covered or more than one locations are covered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		//divijay lp
		isThePropARenOfBusInterFirePolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is the proposal a renewal of Business Interruption ')]/following::select"), "Is the proposal a renewal of Business Interruption", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	public void fillPolicyAttributeFire(PolAttrFireEntity polAttrFireEntity, CustomAssert assertReference) throws InterruptedException{
		if(polAttrFireEntity.getAction().equalsIgnoreCase("add") || polAttrFireEntity.getAction().equalsIgnoreCase("edit")){
			//FF DHK
			
			if (polAttrFireEntity.getBooleanValueForField("ConfigTypeOfPolicy")) {
				selectValueFromList(typeOfPolicyDropDown, polAttrFireEntity.getStringValueForField("TypeOfPolicy"));
			}
			click(forwardButton);
			
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherlistOfallStorageLocationsIncludingTheirDetailed")) {
				selectValueFromList(whetherlistOfallStorageLocationsIncludingTheirDetailedDropDown, polAttrFireEntity.getStringValueForField("WhetherlistOfallStorageLocationsIncludingTheirDetailed"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOut")) {
				selectValueFromList(whetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOutDropDown, polAttrFireEntity.getStringValueForField("WhetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOut"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				selectValueFromList(coInsuranceApplicableDropDown, polAttrFireEntity.getStringValueForField("CoInsuranceApplicable"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigUnderwritingClassification")) {
				selectValueFromList(underwritingClassificationDropDown, polAttrFireEntity.getStringValueForField("UnderwritingClassification"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTheRiskIsSituatedInSEZ")) {
				selectValueFromList(whetherTheRiskIsSituatedInSEZDropDown, polAttrFireEntity.getStringValueForField("WhetherTheRiskIsSituatedInSEZ"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsItaReshBusinessOrRenewal")) {
				selectValueFromList(isItaReshBusinessOrRenewalDropDown, polAttrFireEntity.getStringValueForField("IsItaReshBusinessOrRenewal"));
			}
			//FP DHK
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				selectValueFromList(isServiceTaxExemptedDropDown, polAttrFireEntity.getStringValueForField("IsServiceTaxExempted"));
			}
			//LR
			if (polAttrFireEntity.getBooleanValueForField("ConfigStatusOfRiskLR")) {
				selectValueFromList(statusOfRiskLRDropDown, polAttrFireEntity.getStringValueForField("StatusOfRiskLR"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigTypeOfPolicyLR")) {
				selectValueFromList(typeOfPolicyLRDropDown, polAttrFireEntity.getStringValueForField("TypeOfPolicyLR"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigRemarks")) {
				clearAndSendKeys(remarksTextArea, polAttrFireEntity.getStringValueForField("Remarks"));;
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				fillInstallmentPercentageListOpenButton(polAttrFireEntity);
			}
			//DIGVIJAY PROD-AR 
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsTheRiskNew")) {
				selectValueFromList(isTheRiskNewDropDown, polAttrFireEntity.getStringValueForField("IsTheRiskNew"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsItAFreshBusinessOrRenewal")) {
				selectValueFromList(isItAFreshBusinessOrRenewalDropDown, polAttrFireEntity.getStringValueForField("IsItAFreshBusinessOrRenewal"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigSinceWhenTheRiskIsInsuredUnderIAR")) {
				clearAndSendKeys(sinceWhenTheRiskIsInsuredUnderIARTextField, polAttrFireEntity.getStringValueForField("SinceWhenTheRiskIsInsuredUnderIAR"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsOfPreviousInsurances")) {
				clearAndSendKeys(detailsOfPreviousInsurancesTextArea, polAttrFireEntity.getStringValueForField("DetailsOfPreviousInsurances"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicy")) {
				selectValueFromList(hasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicDropDown, polAttrFireEntity.getStringValueForField("HasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicy"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicy")) {
				selectValueFromList(hasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicyDropDown, polAttrFireEntity.getStringValueForField("HasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicy"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicy")) {
				clearAndSendKeys(detailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicyTextArea, polAttrFireEntity.getStringValueForField("DetailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicy"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTheInsSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPrem")) {
				selectValueFromList(whetherTheInsuredSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPremropDown, polAttrFireEntity.getStringValueForField("WhtrTheInsSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPrem"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetOfTheAllPrevLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicy")) {
				clearAndSendKeys(detailsOfTheAllPreviousLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicyTextArea, polAttrFireEntity.getStringValueForField("DetOfTheAllPrevLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicy"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPrem")) {
				selectValueFromList(whetherTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPremDropDown, polAttrFireEntity.getStringValueForField("WhtrTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPrem"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsofTheAllPrevLossesDueToMBBEEEIBurglary")) {
				clearAndSendKeys(detailsofTheAllPrevLossesDueToMBBEEEIBurglaryTextArea, polAttrFireEntity.getStringValueForField("DetailsofTheAllPrevLossesDueToMBBEEEIBurglary"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPrem")) {
				selectValueFromList(whetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPremDropDown, polAttrFireEntity.getStringValueForField("WhetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPrem"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTheInsSuffLossesDueToBusiIntMBForTheInsPrem")) {
				selectValueFromList(whetherTheInsuredSufferedLosslossesDueToBusiInterruptMBForTheInsPremDropDown, polAttrFireEntity.getStringValueForField("WhtrTheInsSuffLossesDueToBusiIntMBForTheInsPrem"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsOfTheAllPreviousBIMBLossesTextArea")) {
				clearAndSendKeys(detailsOfTheAllPreviousBIMBLossesTextArea, polAttrFireEntity.getStringValueForField("DetailsOfTheAllPreviousBIMBLossesTextArea"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsu")) {
				selectValueFromList(hasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsuDropDown, polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsu"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPrem")) {
				selectValueFromList(hasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPremDropDown, polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPrem"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsIncrThePremOrImpSpecAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLoc")) {
				selectValueFromList(hasAnyInsIncrThePremOrImpSpecialAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLocDropDown, polAttrFireEntity.getStringValueForField("HasAnyInsIncrThePremOrImpSpecAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLoc"));
			}
			
			if (polAttrFireEntity.getBooleanValueForField("ConfigOpportunityId")) {
				clearAndSendKeys(opportunityIdTextField, polAttrFireEntity.getStringValueForField("OpportunityId"));
			}
			//digvijay prod-df
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrLstOfAllStorLocsInclTheirDetAddWithPINCodeNumAreClearSpeltOut")) {
				selectValueFromList(whtrListOfAllStorLocsInclTheirDetAddWithPINCodeNumbersAreClearlySpeltOutDropDown, polAttrFireEntity.getStringValueForField("WhtrLstOfAllStorLocsInclTheirDetAddWithPINCodeNumAreClearSpeltOut"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremises")) {
				selectValueFromList(whetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremisesDropDown, polAttrFireEntity.getStringValueForField("WhetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremises"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTotSumInsuUnThePolCovOneOrMoreThanOneGodownsIsRs2CroreAndAbove")) {
				selectValueFromList(whetherTotSumInsuUnThePolCoveringOneOrMoreThanOneGodownsIsRs2CroreAndAboveDropDown, polAttrFireEntity.getStringValueForField("WhtrTotSumInsuUnThePolCovOneOrMoreThanOneGodownsIsRs2CroreAndAbove"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsu")) {
				selectValueFromList(whetherSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsuDropDown, polAttrFireEntity.getStringValueForField("WhtrSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsu"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigConWhtrStocksAtRailSidAreNotDesForInsu")) {
				selectValueFromList(confirmWhetherStocksAtRailSidAreNotDesForInsuDropDown, polAttrFireEntity.getStringValueForField("ConWhtrStocksAtRailSidAreNotDesForInsu"));
			}
			/* PE-Rajkumar*/
			/*if (polAttrFireEntity.getBooleanValueForField("ConfigIsTheRiskNew")) {
				selectValueFromList(isTheRiskNewDropDown, polAttrFireEntity.getStringValueForField("IsTheRiskNew"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsItAFreshBusinessOrRenewal")) {
				selectValueFromList(isItAfreshBusinessOrRenewalDropDown, polAttrFireEntity.getStringValueForField("IsItAFreshBusinessOrRenewal"));
			}*/
			if (polAttrFireEntity.getBooleanValueForField("ConfigDoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSame")) {
				selectValueFromList(doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSameDropDown, polAttrFireEntity.getStringValueForField("DoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSame"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTheInsuredSufferedLossDueToFireAndOrAnyOther")) {
				selectValueFromList(whetherTheInsuredSufferedLossDueToFireAndOrAnyOtherDropDown, polAttrFireEntity.getStringValueForField("WhetherTheInsuredSufferedLossDueToFireAndOrAnyOther"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeDeclinedToAccept")) {
				selectValueFromList(hasAnyInsurerAtAnyTimeDeclinedToAcceptDropDown, polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeDeclinedToAccept"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCover")) {
				selectValueFromList(hasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCoverDropDown, polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCover"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerIncreasedThePremiumOrImposedSpecialCondition")) {
				selectValueFromList(hasAnyInsurerIncreasedThePremiumOrImposedSpecialConditionDropDown, polAttrFireEntity.getStringValueForField("HasAnyInsurerIncreasedThePremiumOrImposedSpecialCondition"));
			}
			/* SA-Rajkumar*/
			if (polAttrFireEntity.getBooleanValueForField("ConfigStatusOfRiskSA")) {
				selectValueFromList(statusOfRiskSADropDown, polAttrFireEntity.getStringValueForField("StatusOfRiskSA"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigTypeOfRiskSA")) {
				selectValueFromList(typeOfRiskSADropDown, polAttrFireEntity.getStringValueForField("TypeOfRiskSA"));
			}
			//SE -Rajkumar*/
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerils")) {
				selectValueFromList(hasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerilsDropDown, polAttrFireEntity.getStringValueForField("hasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerils"));
			}
			//FD-Yogesh
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAbove")) {
				selectValueFromList(whetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAboveDropDown, polAttrFireEntity.getStringValueForField("WhetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAbove"));
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCovered")) {
				selectValueFromList(whetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCoveredDropdown, polAttrFireEntity.getStringValueForField("WhetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCovered"));
			}
			//digvijay lp
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsThePropARenOfBusInterFirePolicy")) {
				selectValueFromList(isThePropARenOfBusInterFirePolicyDropDown, polAttrFireEntity.getStringValueForField("IsThePropARenOfBusInterFirePolicy"));
			}
		}
		else if(polAttrFireEntity.getAction().equalsIgnoreCase("verify")){
			
			click(forwardButton);
			
			if (polAttrFireEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			
			//PE
			if (polAttrFireEntity.getBooleanValueForField("ConfigDoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSame")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("DoYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSame"), fetchValueFromList(doYouHaveAnyOtherConcurrentInsuranceInRespectOfTheSameDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTheInsuredSufferedLossDueToFireAndOrAnyOther")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherTheInsuredSufferedLossDueToFireAndOrAnyOther"), fetchValueFromList(whetherTheInsuredSufferedLossDueToFireAndOrAnyOtherDropDown), AssertionType.WARNING);
			}			
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeDeclinedToAccept")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeDeclinedToAccept"), fetchValueFromList(hasAnyInsurerAtAnyTimeDeclinedToAcceptDropDown), AssertionType.WARNING);
			}			
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCover")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCover"), fetchValueFromList(hasAnyInsurerAtAnyTimeRefusedToRenewYourInsuranceCoverDropDown), AssertionType.WARNING);
			}			
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerIncreasedThePremiumOrImposedSpecialCondition")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasAnyInsurerIncreasedThePremiumOrImposedSpecialCondition"), fetchValueFromList(hasAnyInsurerIncreasedThePremiumOrImposedSpecialConditionDropDown), AssertionType.WARNING);
			}
			/* SA-Rajkumar*/
			if (polAttrFireEntity.getBooleanValueForField("ConfigStatusOfRiskSA")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("StatusOfRiskSA"), fetchValueFromList(statusOfRiskSADropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigTypeOfRiskSA")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("TypeOfRiskSA"), fetchValueFromList(typeOfRiskSADropDown), AssertionType.WARNING);
			}
			/* SE-Rajkumar*/
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerils")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerils"), fetchValueFromList(hasthePropertyBeenPreviouslyInsuredAgainstFireAndAlliedPerilsDropDown), AssertionType.WARNING);
			}
			//FF DHK
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsItaReshBusinessOrRenewal")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("IsItaReshBusinessOrRenewal"), fetchValueFromList(isItaReshBusinessOrRenewalDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherlistOfallStorageLocationsIncludingTheirDetailed")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherlistOfallStorageLocationsIncludingTheirDetailed"), fetchValueFromList(whetherlistOfallStorageLocationsIncludingTheirDetailedDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOut")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOut"), fetchValueFromList(whetherDifferentGodownsCoveredUnderThePolicyArelocatedInTheSameCompoundPremisesOutDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigCoInsuranceApplicable")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("CoInsuranceApplicable"), fetchValueFromList(coInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigUnderwritingClassification")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("UnderwritingClassification"), fetchValueFromList(underwritingClassificationDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTheRiskIsSituatedInSEZ")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherTheRiskIsSituatedInSEZ"), fetchValueFromList(whetherTheRiskIsSituatedInSEZDropDown), AssertionType.WARNING);
			}
			//FP DHK
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsServiceTaxExempted")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("IsServiceTaxExempted"), fetchValueFromList(isServiceTaxExemptedDropDown), AssertionType.WARNING);
			}
			//LR DHK
			if (polAttrFireEntity.getBooleanValueForField("ConfigStatusOfRiskLR")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("StatusOfRiskLR"), fetchValueFromList(statusOfRiskLRDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigTypeOfPolicyLR")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("TypeOfPolicyLR"), fetchValueFromList(typeOfPolicyLRDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigRemarks")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("Remarks"), fetchValueFromTextFields(remarksTextArea), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")) {
				verifyInstallmentPercentageListOpenButton(polAttrFireEntity, assertReference);
			}
			//DIGVIJAY PROD-AR 
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsTheRiskNew")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("IsTheRiskNew"), fetchValueFromList(isTheRiskNewDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsItAFreshBusinessOrRenewal")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("IsItAFreshBusinessOrRenewal"), fetchValueFromList(isItAFreshBusinessOrRenewalDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigSinceWhenTheRiskIsInsuredUnderIAR")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("SinceWhenTheRiskIsInsuredUnderIAR"), fetchValueFromTextFields(sinceWhenTheRiskIsInsuredUnderIARTextField), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsOfPreviousInsurances")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("DetailsOfPreviousInsurances"), fetchValueFromTextFields(detailsOfPreviousInsurancesTextArea), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicy")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicy"), fetchValueFromList(hasThePropBePrevInsAgainstFireAndAlliedPerilsOfSFSPPolicDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicy")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicy"), fetchValueFromList(hasThePropeBePrevInsAgainstMBBEEEIAndBurglaryPolicyDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicy")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("DetailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicy"), fetchValueFromTextFields(detailsOfPrevInsAgainstMBBEEEIAndBurglaryPolicyTextArea), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTheInsSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPrem")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhtrTheInsSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPrem"), fetchValueFromList(whetherTheInsuredSuffLossesDueToFireAndAlliedPerilsOfSFSPPolicyAtTheInsPremropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetOfTheAllPrevLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicy")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("DetOfTheAllPrevLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicy"), fetchValueFromTextFields(detailsOfTheAllPreviousLossDueToFireAndOrAnyOtherAlliedPerilToBeCoveUnThePropPolicyTextArea), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPrem")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhtrTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPrem"), fetchValueFromList(whetherTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPremDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsofTheAllPrevLossesDueToMBBEEEIBurglary")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("DetailsofTheAllPrevLossesDueToMBBEEEIBurglary"), fetchValueFromTextFields(detailsofTheAllPrevLossesDueToMBBEEEIBurglaryTextArea), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPrem")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPrem"), fetchValueFromList(whetherTheInsSuffLosslossesDueToBusiInterruptFireForTheInsuredPremDropDown), AssertionType.WARNING);
			}
			//
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTheInsSuffLossesDueToBusiIntMBForTheInsPrem")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhtrTheInsSuffLossDueToMBBEEEIBurglaryPolicyAtTheInsuredPrem"), fetchValueFromList(whetherTheInsuredSufferedLosslossesDueToBusiInterruptMBForTheInsPremDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigDetailsOfTheAllPreviousBIMBLossesTextArea")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("DetailsOfTheAllPreviousBIMBLossesTextArea"), fetchValueFromTextFields(detailsOfTheAllPreviousBIFirelossesTextArea), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsu")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsu"), fetchValueFromList(hasAnyInsurerAtAnyTimeDeclToAcceptAnyInsurPropoFromTheInsuDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPrem")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPrem"), fetchValueFromList(hasAnyInsurerAtAnyTimeRefToRenewTheInsuranceCoverForTheInsPremDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigHasAnyInsIncrThePremOrImpSpecAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLoc")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("HasAnyInsIncrThePremOrImpSpecAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLoc"), fetchValueFromList(hasAnyInsIncrThePremOrImpSpecialAtTheTimeOfRenOrDurTheCurrOfThePoliForTheInsurLocDropDown), AssertionType.WARNING);
			}
		
			//digvijay prod-df
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrLstOfAllStorLocsInclTheirDetAddWithPINCodeNumAreClearSpeltOut")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhtrLstOfAllStorLocsInclTheirDetAddWithPINCodeNumAreClearSpeltOut"), fetchValueFromList(whetherlistOfallStorageLocationsIncludingTheirDetailedDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremises")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremises"), fetchValueFromList(whetherDiffGodownsCovUnThePolicyAreLocInTheSameCompPremisesDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrTotSumInsuUnThePolCovOneOrMoreThanOneGodownsIsRs2CroreAndAbove")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhtrTotSumInsuUnThePolCovOneOrMoreThanOneGodownsIsRs2CroreAndAbove"), fetchValueFromList(whetherTotSumInsuUnThePolCoveringOneOrMoreThanOneGodownsIsRs2CroreAndAboveDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhtrSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsu")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhtrSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsu"), fetchValueFromList(whetherSumInsIsNotLessThanRs25LacsInAtLeastOneLocaOutOfVarLocInsuDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigConWhtrStocksAtRailSidAreNotDesForInsu")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("ConWhtrStocksAtRailSidAreNotDesForInsu"), fetchValueFromList(confirmWhetherStocksAtRailSidAreNotDesForInsuDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigOpportunityId")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("OpportunityId"), fetchValueFromTextFields(opportunityIdTextField), AssertionType.WARNING);
			}
			//FD-Yogesh
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAbove")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAbove"), fetchValueFromList(whetherTotalSumInsuredUnderThePolicyCoveringOneOrMoreThanOneGodownIsIsRs1CroreAndAboveDropDown), AssertionType.WARNING);
			}
			if (polAttrFireEntity.getBooleanValueForField("ConfigWhetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCovered")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("WhetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCovered"), fetchValueFromList(whetherOneGodownLocationIsCoveredOrMoreThanOneLocationsAreCoveredDropdown), AssertionType.WARNING);
			}
			//digvijay lp
			if (polAttrFireEntity.getBooleanValueForField("ConfigIsThePropARenOfBusInterFirePolicy")) {
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("IsThePropARenOfBusInterFirePolicy"), fetchValueFromList(isThePropARenOfBusInterFirePolicyDropDown), AssertionType.WARNING);
			}
			
		}
	}

	public void navigateTobackAttributePage(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			PageElement policyAttributeTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+polAttrFireEntity.getStringValueForField("NextPageTitle")+"')]"), "Policy Attributes Fire Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(policyAttributeTitle);
		}
	}
	public void navigateToPolicy(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolAttrFireEntity polAttrFireEntity){
		if (polAttrFireEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}//Dharmendra

	public void clickToOpenButton(PolAttrFireEntity polAttrFireEntity) throws InterruptedException{
		if(polAttrFireEntity.getBooleanValueForField("ConfigInstallmentPercentageListOpenButton")){
			click(installmentPercentageListOpenButton);
			try{
				switchToWindow("Installment Percentage List");
			}
			catch(Exception e){
				switchToWindow("Installment Percentage List");

			}
		}
	}

	public void fillInstallmentPercentageListOpenButton(PolAttrFireEntity polAttrFireEntity) throws InterruptedException{
		clickToOpenButton(polAttrFireEntity);
		Thread.sleep(3000);
		if(polAttrFireEntity.getBooleanValueForField("ConfigSerialNo")){
			clearAndSendKeys(serialNoTextField,polAttrFireEntity.getStringValueForField("SerialNo"));
		}
		if(polAttrFireEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
			clearAndSendKeys(installmentPercentageTextField,polAttrFireEntity.getStringValueForField("InstallmentPercentage"));
		}

		if(polAttrFireEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polAttrFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			Thread.sleep(3000);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyInstallmentPercentageListOpenButton(PolAttrFireEntity polAttrFireEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polAttrFireEntity);

		if(polAttrFireEntity.getAction().equalsIgnoreCase("verify")){

			if(polAttrFireEntity.getBooleanValueForField("ConfigSerialNo")){
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}
			if(polAttrFireEntity.getBooleanValueForField("ConfigInstallmentPercentage")){
				assertReference.assertEquals(polAttrFireEntity.getStringValueForField("InstallmentPercentage"), fetchValueFromTextFields(installmentPercentageTextField), AssertionType.WARNING);
			}
			if(polAttrFireEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}

	//function name
	public void fillandSubmitPolicyAttributeFire(PolAttrFireEntity polAttrFireEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polAttrFireEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeFire(polAttrFireEntity, assertReference);
			clickNextButtonPolicyAttribute(polAttrFireEntity);
			navigateTobackAttributePage(polAttrFireEntity);
			navigateToPolicy(polAttrFireEntity);
			navigateToAttribute(polAttrFireEntity);
			navigateToInsuredInterest(polAttrFireEntity);
			navigateToCoverage(polAttrFireEntity);
			navigateToLoan(polAttrFireEntity);
			navigateToClientDetails(polAttrFireEntity);
			navigateToRelation(polAttrFireEntity);
			navigateToPayment(polAttrFireEntity);
			navigateToFollowup(polAttrFireEntity);
			navigateToDocument(polAttrFireEntity);
		}
	}
}

