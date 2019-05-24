package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;


public class Policy_MemberAttributeCoPaymentCommulativeBonus extends com.aqm.staf.framework.core.WebPage {
	private PageElement policycoPaymentCumulativeBonusTitle;
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

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;

	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement nameOfMemberLabel;
	private PageElement sexOfMemberLabel;
	private PageElement relationforMediclaimMemberLabel;
	private PageElement dOBofMemberLabel;
	private PageElement ageYearLabel;
	private PageElement occupationforMediclaimMemberLabel;
	private PageElement detailsforOtherOccupationLabel;
	private PageElement loyaltyDiscountLabel;
	private PageElement hypertensionLabel;
	private PageElement diabetesLabel;
	private PageElement preexistingDiseaseforMediclaimMemberLabel;
	private PageElement natureOfDiseaseLabel;
	private PageElement nameandAddressOfMedicalAttendantSurgeonLabel;
	private PageElement dateFirstTreatedLabel;
	private PageElement firstTreatmentCompletedLabel;
	private PageElement whetherFullyCcuredLabel;
	private PageElement heightOfMemberLabel;
	private PageElement weightOfMemberLabel;
	private PageElement waistLineinInchesLabel;
	private PageElement doYouSmokeCigarettesCigarOrpipeLabel;
	private PageElement doYouChewTobaccoLabel;
	private PageElement doYouDrinkAlcoholLabel;
	private PageElement healthClubMembershipLabel;
	private PageElement sumInsuredForJMLabel;
	private PageElement isFamilyDiscountApplicableLabel;
	private PageElement claimRatioEnableLabel;
	private PageElement claimRatioTLabel;
	private PageElement coPaymentExcessTextFeild;
	private PageElement cumulativeBonusTextFeild;
	private PageElement nextButton;
	private PageElement prevoiusButton;
	private PageElement BackButton;
	
	public Policy_MemberAttributeCoPaymentCommulativeBonus(WebDriver driver,String pageName) {
		super(driver, pageName);
		policycoPaymentCumulativeBonusTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'Co-Payment Cumulative Bonus')]"), "Co-Payment Cumulative Bonus", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		//prevoius page
		nameOfMemberLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Name of Member")), "Name of Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sexOfMemberLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Sex of Member")), "Sex of Membe Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		relationforMediclaimMemberLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Relation for Mediclaim Member")), "Relation for Mediclaim Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dOBofMemberLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("DOB of Member")), "DOB of Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageYearLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Age (Year)")), "Sex of Membe Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		occupationforMediclaimMemberLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Occupation for Mediclaim Member")), "Occupation for Mediclaim Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		detailsforOtherOccupationLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Details for Other Occupation")), "Details for Other Occupation Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		loyaltyDiscountLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Loyalty Discount")), "Loyalty Discount Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		hypertensionLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Hypertension")), "Hypertension Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		diabetesLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Diabetes")), "Diabetes Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		preexistingDiseaseforMediclaimMemberLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Pre-existing Disease for Mediclaim Member")), "Pre-existing Disease for Mediclaim Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		natureOfDiseaseLabel=new PageElement(By.xpath(genericLocatorforPrevPageDetails("Nature of disease")), "Nature of disease Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nameandAddressOfMedicalAttendantSurgeonLabel=new PageElement(By.xpath("//td[contains(text(),'Name and address of medical attendant/surgeon')]/following::td"), "Name and address of medical attendant/surgeon Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateFirstTreatedLabel=new PageElement(By.xpath("//td[contains(text(),'Date first treated')]/following::td"), "Date first treated Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		firstTreatmentCompletedLabel=new PageElement(By.xpath("//td[contains(text(),'First treatment completed')]/following::td"), "First treatment completed Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		whetherFullyCcuredLabel=new PageElement(By.xpath("//td[contains(text(),'Whether Fully cured')]/following::td"), "Date first treated Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		heightOfMemberLabel=new PageElement(By.xpath("//td[contains(text(),'Height of Member')]/following::td"), "Height of Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		weightOfMemberLabel=new PageElement(By.xpath("//td[contains(text(),'Weight of Member')]/following::td"), "Weight of Member Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		waistLineinInchesLabel=new PageElement(By.xpath("//td[contains(text(),'Waist Line (in Inches)')]/following::td"), "Waist Line (in Inches) Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouSmokeCigarettesCigarOrpipeLabel=new PageElement(By.xpath("//td[contains(text(),'Do you smoke cigarettes, cigar or pipe?')]/following::td"), "Do you smoke cigarettes, cigar or pipe?",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouChewTobaccoLabel=new PageElement(By.xpath("//td[contains(text(),'Do you chew tobacco?')]/following::td"), "Do you chew tobacco?",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		doYouDrinkAlcoholLabel=new PageElement(By.xpath("//td[contains(text(),'Do you Drink Alcohol?')]/following::td"), "Do you Drink Alcohol?",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		healthClubMembershipLabel=new PageElement(By.xpath("//td[contains(text(),'Health Club Membership')]/following::td"), "Health Club Membership Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		sumInsuredForJMLabel=new PageElement(By.xpath("//td[contains(text(),'Sum Insured For JM')]/following::td"), " 	Sum Insured For JM Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		isFamilyDiscountApplicableLabel=new PageElement(By.xpath("//td[contains(text(),'Is Family Discount Applicable')]/following::td"), "Is Family Discount Applicable Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimRatioEnableLabel=new PageElement(By.xpath("//td[contains(text(),'Claim Ratio Enable')]/following::td"), "Claim Ratio Enable Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimRatioTLabel=new PageElement(By.xpath("//td[contains(text(),'Claim Ratio(%)')]/following::td"), "Claim Ratio(%) Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		//Current Page
		coPaymentExcessTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Co-Payment(Excess)", "input")), "Co-Payment(Excess) Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		cumulativeBonusTextFeild=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cumulative Bonus", "input")), "Cumulative Bonus Text Feild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		nextButton= new PageElement(By.name("Next"), "Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		prevoiusButton= new PageElement(By.name("btnPrevio	us"), "Previous Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	    BackButton= new PageElement(By.name("Back"), "Back Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

}
