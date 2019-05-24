package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.InstallementFacilityEntity;
import com.aqm.staf.library.databin.InsuredMemberDetailEntity;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;

public class PolicyMemberInsuredMemberDetailBH extends BasePage{

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
	private PageElement detailTitle;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement fundTitle;

	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;
	private PageElement memberFundTitle;

	//Label
	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;

	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	private PageElement policyMemberDetailTitle;

	private PageElement insuredMemberDetailBHTitlePage;

	private PageElement heightOfMemberTextField;
	private PageElement weightOfMemberTextfield;
	private PageElement waistLineInInchesTextField;
	private PageElement doYouChewTobaccoDropDown;
	private PageElement doYouDrinkAlcoholDropDown;
	private PageElement doYouSmokeCigarettesCigarOrPipeDropDown;
	private PageElement preExistingDiseaseForMediclaimMemberDropDown;
	private PageElement detailsOfPreExistingDiseasesButton;
	private PageElement sumInsuredInUSDTextField;
	private PageElement goodHealthDeclarationDropDown;
	private PageElement listOfDiseasesDropDown;
	private PageElement detailsOfOtherDiseasesTextArea;
	private PageElement passportDeatilsVerifiedDropDown;
	private PageElement nextButton;
	private PageElement saveButton;
	private PageElement openButton;

	//Window Fields
	private PageElement serialNo;
	private PageElement diseaseSufferedOrSufferingTextArea;
	private PageElement medicalReportTextArea;
	private PageElement deleteWindowButton;
	private PageElement addWindowButton;
	private PageElement saveWindowButton;
	private PageElement closeWindowButton;

	public PolicyMemberInsuredMemberDetailBH(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);

		policyTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.linkText("Coverage"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

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

		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttributesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyRelationsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"),"PremiumScheduleTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//BH
		insuredMemberDetailBHTitlePage=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		heightOfMemberTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Height of Member","input")),"Height of Member Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		weightOfMemberTextfield  = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Weight of Member","input")),"Weight of Member Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		waistLineInInchesTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Waist Line (in Inches)","input")),"Waist Line (in Inches) Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		doYouChewTobaccoDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you chew tobacco?","select")),"Do you chew tobacco DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		doYouDrinkAlcoholDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you Drink Alcohol?","select")),"Do you Drink Alcohol DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		doYouSmokeCigarettesCigarOrPipeDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Do you smoke cigarettes, cigar or pipe?","select")),"Do you smoke cigarettes, cigar or pipe DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		preExistingDiseaseForMediclaimMemberDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Pre-existing Disease for Mediclaim Member","select")),"Pre-existing Disease for Mediclaim Member DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		//detailsOfPreExistingDiseasesButton
		openButton=new PageElement(By.name("propValues8"),"Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		sumInsuredInUSDTextField = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in USD","input")),"Sum Insured in USD Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 

		//Window Fields
		serialNo = new PageElement(By.name("slNo"+rowcount+""),"Serial No Text Field",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		diseaseSufferedOrSufferingTextArea=new PageElement(By.name("Data_232566427082010_"+rowcount+""),"Disease Suffered Or Sufferinf Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		medicalReportTextArea=new PageElement(By.name("Data_232566527082010_"+rowcount+""),"Medical Report Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		deleteWindowButton=new PageElement(By.name("btnDel"), "Delete Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		addWindowButton=new PageElement(By.name("btnAdd"), "Add Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveWindowButton=new PageElement(By.name("btnSave"), "Save Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		closeWindowButton=new PageElement(By.name("btnClose"), "Close Window Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		//After Endorse Alteration  
		goodHealthDeclarationDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("Good Health Declaration","select")),"Good Health Declaration DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		listOfDiseasesDropDown = new PageElement(By.xpath(locatorforQuestionAnswerPanel("List Of Diseases","select")),"List Of Diseases DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 
		detailsOfOtherDiseasesTextArea= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Other Diseases","textarea")),"Details of Other Diseases Text Area",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10); 
		passportDeatilsVerifiedDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Passport Deatils Verified","select")),"Passport Deatils Verified DropDown",false,WaitType.WAITFORELEMENTTOBEEENABLED,10); 

		nextButton=new PageElement(By.name("Next"),"Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPolicyMemberInsuredMemberDetailBH(InsuredMemberDetailEntity insuredMemberDetailEntity, CustomAssert assertReference) throws InterruptedException{
		if(insuredMemberDetailEntity.getAction().equalsIgnoreCase("add") || insuredMemberDetailEntity.getAction().equalsIgnoreCase("edit")){

			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigHeightOfMember")) {
				clearAndSendKeys(heightOfMemberTextField, insuredMemberDetailEntity.getStringValueForField("HeightOfMember"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigWeightOfMember")) {
				clearAndSendKeys(weightOfMemberTextfield, insuredMemberDetailEntity.getStringValueForField("WeightOfMember"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigWaistLineInInches")) {
				clearAndSendKeys(waistLineInInchesTextField, insuredMemberDetailEntity.getStringValueForField("WaistLineInInches"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDoYouChewTobacco")) {
				selectValueFromList(doYouChewTobaccoDropDown, insuredMemberDetailEntity.getStringValueForField("DoYouChewTobacco"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDoYouDrinkAlcohol")) {
				selectValueFromList(doYouDrinkAlcoholDropDown, insuredMemberDetailEntity.getStringValueForField("DoYouDrinkAlcohol"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDoYouSmokeCigarettesCigarOrPipe")) {
				selectValueFromList(doYouSmokeCigarettesCigarOrPipeDropDown, insuredMemberDetailEntity.getStringValueForField("DoYouSmokeCigarettesCigarOrPipe"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPreExistingDieseaseForMediclaimMember")) {
				selectValueFromList(preExistingDiseaseForMediclaimMemberDropDown, insuredMemberDetailEntity.getStringValueForField("PreExistingDieseaseForMediclaimMember"));
			}
			//After click On Button New Window Open
			
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDieseasesButton")) {
				fillDetailsOfPreExistingDiseases(insuredMemberDetailEntity);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigSumInsuredInUSD")) {
				clearAndSendKeys(sumInsuredInUSDTextField, insuredMemberDetailEntity.getStringValueForField("SumInsuredInUSD"));
			}
			//med reports
			if(insuredMemberDetailEntity.getBooleanValueForField("ConfigMedicalReport")){
				clearAndSendKeys(medicalReportTextArea,insuredMemberDetailEntity.getStringValueForField("MedicalReport") );	
			}

			//After Endorse Alteration  
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigGoodHealthDeclaration")) {
				selectValueFromList(goodHealthDeclarationDropDown, insuredMemberDetailEntity.getStringValueForField("GoodHealthDeclaration"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigListOfDiseases")) {
				selectValueFromList(listOfDiseasesDropDown, insuredMemberDetailEntity.getStringValueForField("ListOfDiseases"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDetailsOfOtherDiseases")) {
				clearAndSendKeys(detailsOfOtherDiseasesTextArea, insuredMemberDetailEntity.getStringValueForField("DetailsOfOtherDiseases"));
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPassportDetailsVerified")) {
				selectValueFromList(passportDeatilsVerifiedDropDown, insuredMemberDetailEntity.getStringValueForField("PassportDetailsVerified"));
			}
		}

		else if(insuredMemberDetailEntity.getAction().equalsIgnoreCase("verify")){

			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPolicyholder")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel),AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("MemberSerialNo"), fetchValueFromFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("MemberCode"), fetchValueFromFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigHeightOfMember")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("HeightOfMember"), fetchValueFromTextFields(heightOfMemberTextField), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigWeightOfMember")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("WeightOfMember"), fetchValueFromTextFields(weightOfMemberTextfield), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigWaistLineInInches")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("WaistLineInInches"), fetchValueFromTextFields(waistLineInInchesTextField), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDoYouChewTobacco")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("DoYouChewTobacco"), fetchValueFromList(doYouChewTobaccoDropDown), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDoYouDrinkAlcohol")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("DoYouDrinkAlcohol"), fetchValueFromList(doYouDrinkAlcoholDropDown), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDoYouSmokeCigarettesCigarOrPipe")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("DoYouSmokeCigarettesCigarOrPipe"), fetchValueFromList(doYouSmokeCigarettesCigarOrPipeDropDown), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPreExistingDieseaseForMediclaimMember")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("PreExistingDieseaseForMediclaimMember"), fetchValueFromList(preExistingDiseaseForMediclaimMemberDropDown), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDetailsOfPreExistingDieseasesButton")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("DetailsOfPreExistingDieseasesButton"), fetchValueFromTextFields(detailsOfPreExistingDiseasesButton), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigSumInsuredInUSD")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("SumInsuredInUSD"), fetchValueFromTextFields(sumInsuredInUSDTextField), AssertionType.WARNING);
			}
			//After Endorse Alteration  
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigGoodHealthDeclaration")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("GoodHealthDeclaration"), fetchValueFromList(goodHealthDeclarationDropDown), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigListOfDiseases")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("ListOfDiseases"), fetchValueFromList(listOfDiseasesDropDown), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDetailsOfOtherDiseases")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("DetailsOfOtherDiseases"), fetchValueFromTextFields(detailsOfOtherDiseasesTextArea), AssertionType.WARNING);
			}
			if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPassportDetailsVerified")) {
				assertReference.assertEquals(insuredMemberDetailEntity.getStringValueForField("PassportDetailsVerified"), fetchValueFromList(passportDeatilsVerifiedDropDown), AssertionType.WARNING);
			}
		}
	}


	//Parameter List for Details of Pre Existing Diseases
	public void clickOnOpenButton(InsuredMemberDetailEntity insuredMemberDetailEntity) throws InterruptedException{
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigOpenButton")){
			click(openButton);
			switchToWindow("'Details of Pre Existing Diseases' Details");
		}
	}

	public void fillDetailsOfPreExistingDiseases(InsuredMemberDetailEntity insuredMemberDetailEntity) throws InterruptedException{
		clickOnOpenButton(insuredMemberDetailEntity);
		click(addWindowButton);

		//Table - Parameter List for Installment Percentage List

		if(insuredMemberDetailEntity.getBooleanValueForField("ConfigDiseaseSufferedOrSuffering")){
			clearAndSendKeys(diseaseSufferedOrSufferingTextArea,insuredMemberDetailEntity.getStringValueForField("DiseaseSufferedOrSuffering") );	
		}
		//if(insuredMemberDetailEntity.getBooleanValueForField("ConfigMedicalReport")){
			//clearAndSendKeys(medicalReportTextArea,insuredMemberDetailEntity.getStringValueForField("MedicalReport") );	
	//	}
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigSaveWindowButton")){	
			click(saveWindowButton);
			click(closeWindowButton);
			switchToFrame("display");
			isElementDisplayed(insuredMemberDetailBHTitlePage);
		}
	}


	public void navigateToPolicyTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTitle);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigAttributeTab")){		
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToMemberTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberTitle);
		}
	}
	public void navigateToCoverageTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTitle);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToLoanTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTitle);
			switchToFrame("display");
			isElementDisplayed(policyLoanTitle);
		}
	}
	public void navigateToClientDetailsTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTitle);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigRelationsTab")){		
			click(relationsTitle);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTitle);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigFollowupTab")){	
			click(followupTitle);
			switchToFrame("display");
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDocumentTab")){	
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetailTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigDetailTab")){	
			click(detailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigMemberAttributesTab")){	
			click(attributes1Title);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToAttachCoverageTab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigAttachCoveragesTab")){	
			click(attachCoverageTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToRelations1Tab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigMemberRelationTab")){	
			click(relations1Title);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToPayments1Tab(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigMemberPaymentsTab")){	
			click(payments1Title);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}

	public void nextButtonPolicyMemberAttributehealth(InsuredMemberDetailEntity insuredMemberDetailEntity){
		if (insuredMemberDetailEntity.getBooleanValueForField("ConfigNextButton")){		
			click(nextButton);
			click(saveWindowButton);
			switchToFrame("display");
			isElementDisplayed(insuredMemberDetailBHTitlePage);
		}
	}

	public void fillandSubmitPolicyMemberInsuredMemberDetailBH(InsuredMemberDetailEntity insuredMemberDetailEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(insuredMemberDetailEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemberInsuredMemberDetailBH(insuredMemberDetailEntity, assertReference);
			nextButtonPolicyMemberAttributehealth(insuredMemberDetailEntity);
			navigateToPolicyTab(insuredMemberDetailEntity);
			navigateToAttributeTab(insuredMemberDetailEntity);
			navigateToMemberTab(insuredMemberDetailEntity);
			navigateToCoverageTab(insuredMemberDetailEntity);
			navigateToLoanTab(insuredMemberDetailEntity);
			navigateToClientDetailsTab(insuredMemberDetailEntity);
			navigateToRelationsTab(insuredMemberDetailEntity);
			navigateToPaymentsTab(insuredMemberDetailEntity);
			navigateToFollowupTab(insuredMemberDetailEntity);
			navigateToDocumentTab(insuredMemberDetailEntity);
			navigateToDetailTab(insuredMemberDetailEntity);
			navigateToMemberAttributesTab(insuredMemberDetailEntity);
			navigateToAttachCoverageTab(insuredMemberDetailEntity);
			navigateToRelations1Tab(insuredMemberDetailEntity);
			navigateToPayments1Tab(insuredMemberDetailEntity);
		}
	}
}