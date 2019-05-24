package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetailsForGroupUnnamedEntity;

public class PolicyInsuredRiskDetailsForGroupUnnamed extends BasePage {
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memebrTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement insureAttachCoverageTab;

	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement memebrTabTitle;	
	private PageElement coverageTabTitle;	

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;	
	private PageElement nextAttributePageTitle;

	private PageElement riskDetailsForGroupUnnamedTitle;
	private PageElement quoteNoLabel;
	private PageElement schemeNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;

	private PageElement backButton;
	private PageElement saveButton;
	private PageElement nextButton;

	//private PageElement policyBreakInsuranceTabTitle;

	//GR InsuredInterestCode GROUP 
	private PageElement numberofInsuredPersonsTextField;
	private PageElement geographicalAreaTextField;
	private PageElement descriptionofPersonsCoveredTextField;
	private PageElement ageGroupTextField;
	private PageElement sumInsuredPerPersonTextField;
	private PageElement assignmentDetailsTextField;
	private PageElement specialConditionsTextField;
	private PageElement nameofOwnerBeneficiaryTextField;
	private PageElement addressofOwnerBeneficiaryTextField;

	//GR InsuredInterestCode GRAMIN
	private PageElement nameOfTheinsuredTextField;
	private PageElement addressOfTheInsuredTextField;
	private PageElement statusoftheInsuredDropdown;
	private PageElement occupationGraminDropdown;
	private PageElement dateOfBirthTextField;
	private PageElement ageYearTextField;
	private PageElement detailsOfExistingPhysicalDisabilitiesTextField;
	private PageElement grossAnnualIncomeTextField;
	private PageElement nomineesNameTextField;
	private PageElement nomineesAddressTextField;
	private PageElement relationshipofthenomineewiththeinsuredDropdown;
	private PageElement dateofBirthofNomineeTextField;
	private PageElement sexoftheInsuredDropdown;
	private PageElement sumInsuredTextField;
	private PageElement excessInDropdown;

	public PolicyInsuredRiskDetailsForGroupUnnamed(WebDriver driver,String pageName) {
		super(driver, pageName);

		riskDetailsForGroupUnnamedTitle = new PageElement(By.xpath("//div/b[contains(text(),'Risk Details For Group Unnamed')]"), "Risk Details For Group Unnamed Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memebrTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insureAttachCoverageTab = new PageElement(By.xpath("//td//div//b[contains(text(),'Attach Coverages')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memebrTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Labels
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote"))," Policy Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		schemeNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Scheme"))," Policy Scheme Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status"))," Policy Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")),"Product Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Question Answer
		numberofInsuredPersonsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		geographicalAreaTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionofPersonsCoveredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageGroupTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredPerPersonTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assignmentDetailsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameofOwnerBeneficiaryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressofOwnerBeneficiaryTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Motor Policy number", "input")), "Motor Policy number Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateOfBirthTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth","input")), "DOB Of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		dateofBirthofNomineeTextField= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Birth","input")), "DOB Of Member TextFeild",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		

		//Buttons
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nextButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillInsuredInterestRiskDetailsForGroupUnnamed(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity, CustomAssert assertReference){
		if(riskDetailsForGroupUnnamedEntity.getAction().equalsIgnoreCase("add") || riskDetailsForGroupUnnamedEntity.getAction().equalsIgnoreCase("edit")){

			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNumberofInsuredPersons")) {
				clearAndSendKeys(numberofInsuredPersonsTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("NumberofInsuredPersons"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigGeographicalArea")) {
				clearAndSendKeys(geographicalAreaTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("GeographicalArea"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDescriptionofPersonsCovered")) {
				clearAndSendKeys(descriptionofPersonsCoveredTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("DescriptionofPersonsCovered"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAgeGroup")) {
				clearAndSendKeys(ageGroupTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("AgeGroup"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAssignmentDetails")) {
				clearAndSendKeys(assignmentDetailsTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("AssignmentDetails"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("SpecialConditions"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNameofOwnerBeneficiary")) {
				clearAndSendKeys(nameofOwnerBeneficiaryTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("NameofOwnerBeneficiary"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAddressofOwnerBeneficiary")) {
				clearAndSendKeys(addressofOwnerBeneficiaryTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("AddressofOwnerBeneficiary"));
			}
			//GR InsuredInterestCode GRAMIN
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNameOfTheinsured")) {
				clearAndSendKeys(nameOfTheinsuredTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("NameOfTheinsured"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAddressOfTheInsured")) {
				clearAndSendKeys(addressOfTheInsuredTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("AddressOfTheInsured"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigStatusoftheInsured")) {
				selectValueFromList(statusoftheInsuredDropdown, riskDetailsForGroupUnnamedEntity.getStringValueForField("StatusoftheInsured"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigOccupationGramin")) {
				selectValueFromList(occupationGraminDropdown, riskDetailsForGroupUnnamedEntity.getStringValueForField("Occupation(Gramin)"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDOBofMember")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(riskDetailsForGroupUnnamedEntity.getStringValueForField("DOBofMember"));
				clearAndEnterDate(dateOfBirthTextField, DOBofMember);
			}

			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDetailsOfExistingPhysicalDisabilities")) {
				clearAndSendKeys(detailsOfExistingPhysicalDisabilitiesTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("DetailsOfExistingPhysicalDisabilities"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigGrossAnnualIncome")) {
				clearAndSendKeys(grossAnnualIncomeTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("GrossAnnualIncome"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNomineesName")) {
				clearAndSendKeys(nomineesNameTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("NomineesName"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNomineesAddress")) {
				clearAndSendKeys(nomineesAddressTextField, riskDetailsForGroupUnnamedEntity.getStringValueForField("NomineesAddress"));
			}

			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigRelationshipofthenomineewiththeinsured")) {
				selectValueFromList(relationshipofthenomineewiththeinsuredDropdown, riskDetailsForGroupUnnamedEntity.getStringValueForField("Relationshipofthenomineewiththeinsured"));
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDOBofNominee")) {
				String DOBofMember=RandomCodeGenerator.dateGenerator(riskDetailsForGroupUnnamedEntity.getStringValueForField("DOBofNominee"));
				clearAndEnterDate(dateOfBirthTextField, DOBofMember);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSexoftheInsured")) {
				selectValueFromList(sexoftheInsuredDropdown, riskDetailsForGroupUnnamedEntity.getStringValueForField("SexoftheInsured"));
			}

			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigExcessIn")) {
				selectValueFromList(excessInDropdown, riskDetailsForGroupUnnamedEntity.getStringValueForField("ExcessIn"));
			}
		}

		else if(riskDetailsForGroupUnnamedEntity.getAction().equalsIgnoreCase("verify")){

			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSchemeNo")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("SchemeNo"), fetchValueFromTextFields(schemeNoLabel), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNumberofInsuredPersons")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("NumberofInsuredPersons"), fetchValueFromTextFields(numberofInsuredPersonsTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigGeographicalArea")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("NumberofInsuredPersons"), fetchValueFromTextFields(geographicalAreaTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDescriptionofPersonsCovered")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("DescriptionofPersonsCovered"), fetchValueFromTextFields(descriptionofPersonsCoveredTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAgeGroup")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("AgeGroup"), fetchValueFromTextFields(ageGroupTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSumInsuredPerPerson")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("SumInsuredPerPerson"), fetchValueFromTextFields(sumInsuredPerPersonTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAssignmentDetails")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("AssignmentDetails"), fetchValueFromTextFields(assignmentDetailsTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNameofOwnerBeneficiary")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("NameofOwnerBeneficiary"), fetchValueFromTextFields(nameofOwnerBeneficiaryTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAddressofOwnerBeneficiary")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("AddressofOwnerBeneficiary"), fetchValueFromTextFields(addressofOwnerBeneficiaryTextField), AssertionType.WARNING);
			}
			//GR InsuredInterestCode GRAMIN
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNameOfTheinsured")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("NameOfTheinsured"), fetchValueFromTextFields(nameOfTheinsuredTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAddressOfTheInsured")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("AddressOfTheInsured"), fetchValueFromTextFields(addressOfTheInsuredTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigStatusoftheInsured")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("StatusoftheInsured"), fetchValueFromList(statusoftheInsuredDropdown), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigOccupationGramin")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("OccupationGramin"), fetchValueFromList(occupationGraminDropdown), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDOBofMember")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsForGroupUnnamedEntity.getStringValueForField("DOBofMember")) ,fetchValueFromTextFields(dateOfBirthTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAgeYear")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("AgeYear"), fetchValueFromTextFields(ageYearTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDetailsOfExistingPhysicalDisabilities")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("DetailsOfExistingPhysicalDisabilities"), fetchValueFromTextFields(detailsOfExistingPhysicalDisabilitiesTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigGrossAnnualIncome")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("GrossAnnualIncome"), fetchValueFromTextFields(grossAnnualIncomeTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNomineesName")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("NomineesName"), fetchValueFromTextFields(nomineesNameTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigNomineesAddress")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("NomineesAddress"), fetchValueFromTextFields(nomineesAddressTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigRelationshipofthenomineewiththeinsured")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("Relationshipofthenomineewiththeinsured"), fetchValueFromList(relationshipofthenomineewiththeinsuredDropdown), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDOBofNominee")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsForGroupUnnamedEntity.getStringValueForField("DOBofNominee")) ,fetchValueFromTextFields(dateofBirthofNomineeTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSexoftheInsured")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("SexoftheInsured"), fetchValueFromList(sexoftheInsuredDropdown), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigExcessIn")) {
				assertReference.assertEquals(riskDetailsForGroupUnnamedEntity.getStringValueForField("ExcessIn"), fetchValueFromList(excessInDropdown), AssertionType.WARNING);
			}
		}
	}

	private void backToMainAttributePage(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity) {
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void nextRiskDetailsForGroupUnnamedPage(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(nextButton);
			switchToFrame("display");		
		}
	}
	public void saveRiskDetailsForGroupUnnamedPage (RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity) {
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void navigateToPolicy(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigPolicyTab")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}

	}
	public void navigateToMember(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigMemberTab")){		
			click(memebrTab);
			switchToFrame("display");
			isElementDisplayed(memebrTabTitle);
		}
	}
	public void navigateToCoverage(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigCoverageTab")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToLoan(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			//		switchToFrame("display");
		}
	}

	public void navigateToClientDetails(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigClientDetailsTab")){		
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigRelationTab")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigPaymentsTab")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigFollowupTab")){		
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);

		}
	}
	public void navigateToInsureAttachCoverageTab(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity){
		if (riskDetailsForGroupUnnamedEntity.getBooleanValueForField("ConfigAttachCoverageTab")){		
			click(insureAttachCoverageTab);
			switchToFrame("display");

		}
	}
	public void fillandSubmitPolicyAttibutesBreakInInsuranceHealth(RiskDetailsForGroupUnnamedEntity riskDetailsForGroupUnnamedEntity, CustomAssert assertReference) {
		if(isConfigTrue(riskDetailsForGroupUnnamedEntity.getConfigExecute())){
			switchToFrame("display");
			fillInsuredInterestRiskDetailsForGroupUnnamed(riskDetailsForGroupUnnamedEntity, assertReference);
			saveRiskDetailsForGroupUnnamedPage(riskDetailsForGroupUnnamedEntity);
			nextRiskDetailsForGroupUnnamedPage(riskDetailsForGroupUnnamedEntity);
			backToMainAttributePage(riskDetailsForGroupUnnamedEntity);
			navigateToPolicy(riskDetailsForGroupUnnamedEntity);
			navigateToAttribute(riskDetailsForGroupUnnamedEntity);
			navigateToMember(riskDetailsForGroupUnnamedEntity);
			navigateToCoverage(riskDetailsForGroupUnnamedEntity);
			navigateToLoan(riskDetailsForGroupUnnamedEntity);
			navigateToClientDetails(riskDetailsForGroupUnnamedEntity);
			navigateToRelation(riskDetailsForGroupUnnamedEntity);
			navigateToPayment(riskDetailsForGroupUnnamedEntity);
			navigateToFollowup(riskDetailsForGroupUnnamedEntity);
			navigateToDocument(riskDetailsForGroupUnnamedEntity);
			navigateToInsureAttachCoverageTab(riskDetailsForGroupUnnamedEntity);
		}
	}
}
