package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimPropertyFireEntity;


public class ClaimPropertyFire extends BasePage {
	private PageElement claimPropertyTitlePage;
	private PageElement policyAttributesTitlePage;
	private PageElement claimTitle;
	private PageElement claimDetailsTitlePage;
	//private PageElement insuredItemTitle;
	private PageElement memberTitle;
	private PageElement claimMemberDamageTitlePage;
	private PageElement documentTitle;
	private PageElement claimDocumentsTitlePage;
	private PageElement partiesTitle;
	private PageElement claimAssociatedPartiesTitlePage;
	private PageElement reserveTitle;
	private PageElement claimReserveTitlePage;
	private PageElement paymentTitle;
	private PageElement claimPaymentsTitlePage;
	private PageElement attributesTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement totalFeesForSpotSurveyTextField;
	private PageElement totalFeesForFinalSurveyTextField;
	private PageElement totalFeesForReInspectionSurveyTextField;
	private PageElement totalFeesForInvestigationTextField;
	private PageElement totalEstimatedAmountTextField;
	private PageElement assessedAmountTextField;
	private PageElement policyExcessRsTextField;
	private PageElement totalSITextField;
	private PageElement proceedButton;
	private PageElement courtMasterForAllProductTitlePage;
	private PageElement backButton;
	private PageElement claimPropertyTitle;
	
	
	//MiscNon
	private PageElement dateofaccidentTextField;
	private PageElement dateOfAccidentFindButton;	
	private PageElement saveButton;
	
	private PageElement serialNumberOfTheEquipmentTextField;
	private PageElement equipmentSerialProvidedDuringClaimTextField;
	private PageElement amountClaimedTextField;
	private PageElement amountPaidTextField;
	private PageElement balanceSumInsuredBeforeTheCurrentClaimTextField;
	private PageElement courtCodeTextField;
	private PageElement caseNumberTextField;
	private PageElement claimSubStatusTextField;
	private PageElement isReinstatementRequiredDropDown;
	private PageElement reinstatementPremiumTextField;
	private PageElement UniqueCoinsuranceDocumentscodeTextField;

	public ClaimPropertyFire(WebDriver driver, String pageName) {
		super(driver, pageName);
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyAttributesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//insuredItemTitle = new PageElement(By.xpath("//b//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberTitle = new PageElement(By.xpath("//b//div[contains(text(),'Member')]"),"Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		claimMemberDamageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimDocumentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Parties')]"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimAssociatedPartiesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTitle = new PageElement(By.xpath("//b//div[contains(text(),'Reserve')]"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimReserveTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTitle = new PageElement(By.xpath("//b//div[contains(text(),'Payment')]"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimPaymentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTitle = new PageElement(By.xpath("//b//div[contains(text(),'Attributes')]"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim")),"Claim Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy")),"Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")),"Claim Date Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")),"Claim Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Product")),"Product Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")),"Cause Of Loss Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		totalFeesForSpotSurveyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Spot Survey')]/following::input"), "Total Fees for Spot Survey Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalFeesForFinalSurveyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Final Survey')]/following::input"), "Total Fees for Final Survey Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalFeesForReInspectionSurveyTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Re-inspection Survey')]/following::input"), "Total Fees for Re-inspection Survey Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalFeesForInvestigationTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Fees for Investigation')]/following::input"), "Total Fees for Investigation Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalEstimatedAmountTextField = new PageElement(By.xpath("//td//div[contains(text(),'Total Estimated Amount')]/following::input"), "Total Estimated Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		assessedAmountTextField = new PageElement(By.xpath("//td//div[contains(text(),'Assessed Amount')]/following::input"), "Assessed Amount Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		policyExcessRsTextField = new PageElement(By.xpath("//td//div[contains(text(),'Policy Excess (Rs)')]/following::input"), "Policy Excess (Rs) Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		totalSITextField = new PageElement(By.xpath("//td//div[contains(text(),'Total SI')]/following::input"), "Total SI Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		proceedButton = new PageElement(By.name("Next1"),"Proceed Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		courtMasterForAllProductTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Court Master For All Product')]"), " Court Master For All Product Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		
		//MiscNon
		dateofaccidentTextField=  new PageElement(By.xpath("//td//div[contains(text(),'Date of accident')]/following::input"), "Date of accident", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateOfAccidentFindButton= new PageElement(By.xpath("//td//div[contains(text(),'Date of accident')]/following::input/following::a[@name='firstFocus']"), "Date of accident Find Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton = new PageElement(By.name("btnSave"),"Save Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		
		serialNumberOfTheEquipmentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Serial number of the Equipment')]/following::input"), "Serial number of the Equipment", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		equipmentSerialProvidedDuringClaimTextField=new PageElement(By.xpath("//td//div[contains(text(),'Equipment Serial provided during claim')]/following::input"), "Equipment Serial provided during claim", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountClaimedTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount Claimed')]/following::input"), "Amount Claimed", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountPaidTextField=new PageElement(By.xpath("//td//div[contains(text(),'Amount Paid')]/following::input"), "Amount Paid", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		balanceSumInsuredBeforeTheCurrentClaimTextField=new PageElement(By.xpath("//td//div[contains(text(),'Balance Sum Insured before the Current Claim')]/following::input"), "Balance Sum Insured before the Current Claim", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		courtCodeTextField=new PageElement(By.xpath("//form[@name='S0201']//td/div[contains(text(),'Court Code')]/following::input[1]"), "Court CodeTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		caseNumberTextField=new PageElement(By.xpath("//form[@name='S0201']//td/div[contains(text(),'Case Number')]/following::input[1]"), "Case Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimSubStatusTextField=new PageElement(By.xpath("//form[@name='S0201']//td/div[contains(text(),'Claim Sub Status')]/following::textarea[1]"), "Claim Sub Status TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isReinstatementRequiredDropDown=new PageElement(By.xpath("//form[@name='S0201']//td/div[contains(text(),'Is Reinstatement Required?')]/following::select[1]"), "Is Reinstatement Required? TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		reinstatementPremiumTextField=new PageElement(By.xpath("//form[@name='S0201']//td/div[contains(text(),'Reinstatement Premium')]/following::input[1]"), "Reinstatement Premium TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		UniqueCoinsuranceDocumentscodeTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Unique Co-insurance Documents code", "input")), "Unique Co-insurance Documents code extField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	

	public void fillClaimPropertyDetails(ClaimPropertyFireEntity claimPropertyFireEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimPropertyFireEntity.getAction().equalsIgnoreCase("add") || claimPropertyFireEntity.getAction().equalsIgnoreCase("edit")){
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForSpotSurvey")) {
				clearAndSendKeys(totalFeesForSpotSurveyTextField, claimPropertyFireEntity.getStringValueForField("TotalFeesForSpotSurvey"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForFinalSurvey")) {
				clearAndSendKeys(totalFeesForFinalSurveyTextField, claimPropertyFireEntity.getStringValueForField("TotalFeesForFinalSurvey"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForReInspectionSurvey")) {
				clearAndSendKeys(totalFeesForReInspectionSurveyTextField, claimPropertyFireEntity.getStringValueForField("TotalFeesForReInspectionSurvey"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForInvestigation")) {
				clearAndSendKeys(totalFeesForInvestigationTextField, claimPropertyFireEntity.getStringValueForField("TotalFeesForInvestigation"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalEstimatedAmount")) {
				clearAndSendKeys(totalEstimatedAmountTextField, claimPropertyFireEntity.getStringValueForField("TotalEstimatedAmount"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigAssessedAmount")) {
				clearAndSendKeys(assessedAmountTextField, claimPropertyFireEntity.getStringValueForField("AssessedAmount"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigPolicyExcessRs")) {
				clearAndSendKeys(policyExcessRsTextField, claimPropertyFireEntity.getStringValueForField("PolicyExcessRs"));
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalSI")) {
				clearAndSendKeys(totalSITextField, claimPropertyFireEntity.getStringValueForField("TotalSI"));
			}
			//MiscNon			
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigDateOfAccident")) {
				click(dateOfAccidentFindButton);
				Thread.sleep(1000);
				selectDateFromCalender(dateofaccidentTextField, claimPropertyFireEntity.getStringValueForField("DateOfAccident"));
				switchToFrame("display");		
			}
			
			//MiscNonLiability-Extra fields
			
			if(claimPropertyFireEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigAmountClaimed")) {
					clearAndSendKeys(amountClaimedTextField, claimPropertyFireEntity.getStringValueForField("AmountClaimed"));
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigAmountPaid")) {
					clearAndSendKeys(amountPaidTextField, claimPropertyFireEntity.getStringValueForField("AmountPaid"));
					if(claimPropertyFireEntity.getStringValueForField("Product").equalsIgnoreCase("MI")){
						click(proceedButton);
						}
					
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigIsReinstatementRequired")) {
					selectValueFromList(isReinstatementRequiredDropDown, claimPropertyFireEntity.getStringValueForField("ReinstatementRequired"));
					
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigReinstatementPremium")) {
					clearAndSendKeys(reinstatementPremiumTextField, claimPropertyFireEntity.getStringValueForField("ReinstatementPremium"));
					if(claimPropertyFireEntity.getStringValueForField("Product").equalsIgnoreCase("MI")){
					click(proceedButton);
					Thread.sleep(1000);
					selectValueFromList(isReinstatementRequiredDropDown, claimPropertyFireEntity.getStringValueForField("ReinstatementRequired"));
					}
					
					
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigCourtCode")) {
					clearAndSendKeys(courtCodeTextField, claimPropertyFireEntity.getStringValueForField("CourtCode"));
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigCaseNumber")) {
					clearAndSendKeys(caseNumberTextField, claimPropertyFireEntity.getStringValueForField("CaseNumber"));
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigClaimSubStatus")) {
					clearAndSendKeys(claimSubStatusTextField, claimPropertyFireEntity.getStringValueForField("ClaimSubStatus"));
				}
				
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigUniqueCoinsuranceDocumentscode")) {
					clearAndSendKeys(UniqueCoinsuranceDocumentscodeTextField, claimPropertyFireEntity.getStringValueForField("UniqueCoinsuranceDocumentscode"));
				}
				
			}
		}
		
		
		
		else if(claimPropertyFireEntity.getAction().equalsIgnoreCase("verify")){
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("PolicyNumber"), fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigClaimDate")) {
				String Date = RandomCodeGenerator.dateGenerator(claimPropertyFireEntity.getStringValueForField("ClaimDate"));
				assertReference.assertEquals(Date, fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("ClaimStatus"), fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("ProductCode"), fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("CauseOfLoss"), fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForSpotSurvey")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("TotalFeesForSpotSurvey"), fetchValueFromTextFields(totalFeesForSpotSurveyTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForFinalSurvey")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("TotalFeesForFinalSurvey"), fetchValueFromTextFields(totalFeesForFinalSurveyTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForReInspectionSurvey")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("TotalFeesForReInspectionSurvey"), fetchValueFromTextFields(totalFeesForReInspectionSurveyTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalFeesForInvestigation")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("TotalFeesForInvestigation"), fetchValueFromTextFields(totalFeesForInvestigationTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalEstimatedAmount")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("TotalEstimatedAmount"), fetchValueFromTextFields(totalEstimatedAmountTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigAssessedAmount")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("AssessedAmount"), fetchValueFromTextFields(assessedAmountTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigPolicyExcessRs")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("PolicyExcessRs"), fetchValueFromTextFields(policyExcessRsTextField), AssertionType.WARNING);
			}
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigTotalSI")) {
				assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("TotalSI"), fetchValueFromTextFields(totalSITextField), AssertionType.WARNING);
			}	
			
			if (claimPropertyFireEntity.getBooleanValueForField("ConfigDateOfAccident")) {
				String Date = RandomCodeGenerator.dateGenerator(claimPropertyFireEntity.getStringValueForField("DateOfAccident"));
				assertReference.assertEquals(Date,fetchValueFromTextFields(dateofaccidentTextField), AssertionType.WARNING);
			}
			
			if(claimPropertyFireEntity.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigSerialNoOfTheEquipment")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("SerialNoOfTheEquipment"), fetchValueFromTextFields(serialNumberOfTheEquipmentTextField), AssertionType.WARNING);
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigEquipmentSerialProvidedDuringClaim")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("EquipmentSerialProvidedDuringClaim"), fetchValueFromTextFields(equipmentSerialProvidedDuringClaimTextField), AssertionType.WARNING);
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigAmountClaimed")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("AmountClaimed"), fetchValueFromTextFields(amountClaimedTextField), AssertionType.WARNING);
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigAmountPaid")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("AmountPaid"), fetchValueFromTextFields(amountPaidTextField), AssertionType.WARNING);
					
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigBalanceSumInsuredBeforeTheCurrentClaim")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("BalanceSumInsuredBeforeTheCurrentClaim"), fetchValueFromTextFields(balanceSumInsuredBeforeTheCurrentClaimTextField), AssertionType.WARNING);
					if(claimPropertyFireEntity.getStringValueForField("Product").equalsIgnoreCase("MI")){
						click(proceedButton);
						}
				}
				
				
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigIsReinstatementRequired")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("ReinstatementRequired"), fetchValueFromList(isReinstatementRequiredDropDown), AssertionType.WARNING);
					
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigReinstatementPremium")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("ReinstatementPremium"), fetchValueFromTextFields(reinstatementPremiumTextField), AssertionType.WARNING);
					
					if(!claimPropertyFireEntity.getStringValueForField("Product").equalsIgnoreCase("MI")){
						click(proceedButton);
						}
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigCourtCode")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("CourtCode"), fetchValueFromTextFields(courtCodeTextField), AssertionType.WARNING);
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigCaseNumber")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("CaseNumber"), fetchValueFromTextFields(caseNumberTextField), AssertionType.WARNING);
				}
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigClaimSubStatus")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("ClaimSubStatus"), fetchValueFromTextFields(claimSubStatusTextField), AssertionType.WARNING);
				}
				
				if (claimPropertyFireEntity.getBooleanValueForField("ConfigUniqueCoinsuranceDocumentscode")) {
					assertReference.assertEquals(claimPropertyFireEntity.getStringValueForField("UniqueCoinsuranceDocumentscode"), fetchValueFromTextFields(UniqueCoinsuranceDocumentscodeTextField), AssertionType.WARNING);
				}
				
			}

		}
	}	
	public void navigateToClaim(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitlePage);
		}
	}
	public void navigateToMember(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitlePage);
		}
	}
	public void navigateToDocument(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitlePage);
		}
	}
	public void navigateToParties(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitlePage);
		}
	}
	public void navigateToReserve(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitlePage);
		}
	}
	public void navigateToPayment(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitlePage);
		}
	}
	public void navigateToAttributes(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitlePage);
		}	
	}
	public void proceedToNextPage(ClaimPropertyFireEntity claimPropertyFireEntity){
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigProceedButton")){
			click(proceedButton);
			switchToFrame("display");
			claimPropertyTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimPropertyFireEntity.getStringValueForField("ClaimPropertyTitle")+"')]"), "Claim Property Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimPropertyTitle);
		}
	}

	public void backFromClaimAttributesDetails(ClaimPropertyFireEntity claimPropertyFireEntity) {
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void saveClaimAttributesDetails(ClaimPropertyFireEntity claimPropertyFireEntity) {
		if (claimPropertyFireEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void fillAndSubmitClaimPropertyDetails(ClaimPropertyFireEntity claimPropertyFireEntity, CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillClaimPropertyDetails(claimPropertyFireEntity, assertReference);
		proceedToNextPage(claimPropertyFireEntity);
		saveClaimAttributesDetails( claimPropertyFireEntity);
		navigateToClaim(claimPropertyFireEntity);
		navigateToMember(claimPropertyFireEntity);
		navigateToDocument(claimPropertyFireEntity);
		navigateToParties(claimPropertyFireEntity);
		navigateToReserve(claimPropertyFireEntity);
		navigateToPayment(claimPropertyFireEntity);
		navigateToAttributes(claimPropertyFireEntity);
	}
}	

