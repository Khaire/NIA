package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntINDRiskDetPUEntity;
import com.aqm.staf.library.databin.PolicyAttrCDPolDetailsEntity;

public class PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident  extends BasePage  {
	
	
	private PageElement iNDIVIDUALRiskDetailsTitle;
	private PageElement riskDetailsNextPageTitle;
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
	private PageElement tAILORMADERiskDetailsTitle;
	private PageElement gROUPRiskDetailsTitle;
	private PageElement mEMBERRiskDetailsTitle;
	private PageElement sTANDARDRiskDetailsTitle;


	private PageElement	insuredInterestDetailTab;
	private PageElement	insuredInterestAttributesTab;
	private PageElement	insuredInterestAttachCoveragesTab;
	private PageElement	insuredInterestRelationsTab;
	private PageElement	insuredInterestPaymentsTab;
	private PageElement	insuredInterestScheduleTab;
	
	private PageElement	insuredInterestDetailTabTitle;
	private PageElement	insuredInterestAttributesTabTitle;
	private PageElement	insuredInterestAttachCoveragesTabTitle;
	private PageElement	insuredInterestRelationsTabTitle;
	private PageElement	insuredInterestPaymentsTabTitle;
	private PageElement	insuredInterestScheduleTabTitle;
	
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	
	private PageElement nameoftheInsuredPersonTextField;
	private PageElement nameoftheMemberTextField;
	private PageElement ageTextField;
	private PageElement sexDropDown;
	private PageElement relationshipwiththePolicyholderofPUDropDown;
	private PageElement relationshipwiththeEmployeeDropDown;
	private PageElement occupationoftheMemberofPUDropDown;
	private PageElement dateofBirthoftheMemberTextField;
	private PageElement cadreTextField;
	private PageElement capitalSumInsuredTextField;
	private PageElement monthlyIncomeofthememberTextField;
	private PageElement nomineeNameTextField;
	private PageElement relationshipwithNomineeTextField;
	private PageElement anyPreviousClaimDropDown;
	private PageElement anyPhysicalDefectsDropDown;
	private PageElement riskGroupforPUDropDown;
	private PageElement descriptionoftheRiskGroupTextField;
	private PageElement serialNoTextField;
	private PageElement employeeIDNumberPUTextField;
	private PageElement medicalextensionRequiredDropDown;
	private PageElement occupationoftheMemberofPUIndividualDropDown;
	private PageElement cadreDetailsListOpenButton;
	private PageElement premiumForMemberListOpenButton;
	private PageElement strengthoftheGroupUnnamedDropDown;
	private PageElement groupDiscountPercentageTextField;
	private PageElement riskCoveredTextField;
	private PageElement locationdetailsTextField;
	private PageElement specialPerilsTextField;
	private PageElement specialExclusionTextField;
	private PageElement subjecttoClauseTextField;
	private PageElement specialExcessTextField;
	private PageElement specialConditionsTextField;
	private PageElement noOfPersonsCoveredTextField;
	private PageElement increaseinPermanentTotalDisabilityDropDown;
	
	private PageElement cadreDetailsWindowAddButton;
	private PageElement cadreDetailsWindowSaveButton;
	private PageElement cadreDetailsWindowCloseButton;
	private PageElement cadreDetailsWindowDeleteButton;
	private PageElement cadreDetailsWindowCadreTextField;
	private PageElement cadreDetailsWindowNoofpersonpercadreTextField;
	private PageElement cadreDetailsWindowSuminsuredperpersonTextField;
	private PageElement cadreDetailsWindowSIforcadreTextField;
	private PageElement cadreDetailsWindowSerialNoTextField;
	
	private PageElement premiumForMemberWindowAddButton;
	private PageElement premiumForMemberWindowSaveButton;
	private PageElement premiumForMemberWindowCloseButton;
	private PageElement premiumForMemberWindowDeleteButton;
	private PageElement premiumForMemberWindowAdditionDeletionDropDown;
	private PageElement premiumForMemberWindowNoofpersonsTextField;
	private PageElement premiumForMemberWindowSerialNoTextField;
	private PageElement premiumForMemberWindowDescriptionofCategoryTextField;
	private PageElement premiumForMemberWindowTotalPremiumTextField;
	private PageElement cadreDetailsWindowSIforcadre;
	
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement	saveButton;
	
	public PolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);

		iNDIVIDUALRiskDetailsTitle=new PageElement(By.xpath("//div/b//font[contains(text(),'INDIVIDUAL Risk Details')]"), "INDIVIDUAL Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskDetailsNextPageTitle=new PageElement(By.xpath("//div/b//font[contains(text(),'Xcess, Loading & Disc Details')]"), "GROUP Risk Details Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		tAILORMADERiskDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'TAILORMADE Risk Details')]"), "TAILORMADE Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		gROUPRiskDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'GROUP Risk Details')]"), "GROUP Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		mEMBERRiskDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'MEMBER Risk Details')]"), "MEMBER Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sTANDARDRiskDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'PU STD PLR RULE1')]"), "STANDARD Risk Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		insuredInterestDetailTabTitle	=new PageElement(By.xpath("//div//b[contains(text(),'Interest Details')]"), "Policy  Insured Interest Details Tab Title", false,  WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTabTitle	=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Attributes')]"), "Insured Interest Attributes Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragesTabTitle	=new PageElement(By.xpath("//td//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Relations Tab", false,  WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Relations')]"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentsTabTitle=new PageElement(By.xpath("//div//b//b[contains(text(),'Payment List')]"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
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
		
		insuredInterestDetailTab	=	new PageElement(By.linkText("Detail"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"), "Insured	Interest	Attributes	Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
		insuredInterestRelationsTab=new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab=new PageElement(By.xpath("//div[@title='Payments']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10)	;
				
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "No.")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0042", "InterestCode")), "Insured Interest Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel=new PageElement(By.xpath("//td/div/input[@name='propValues13']"), "Insured Interest Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameoftheInsuredPersonTextField	=new PageElement(By.xpath("//td//div[contains(text(),'Name of the Insured Person')]/following::input"), "Name of the Insured Person Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nameoftheMemberTextField=new PageElement(By.xpath("//td/div/input[@name='propValues1']"), "Name of the Member Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ageTextField=new PageElement(By.xpath("//td//div[contains(text(),'Age')]/following::input"), "Name of the Insured Person Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sexDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sex')]/following::select"), "Sex DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipwiththePolicyholderofPUDropDown	=new PageElement(By.xpath("//td/div/select[@name='propValues2']"), "Relationship with the Policy holder of PU DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipwiththeEmployeeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Relationship with Nominee')]/following::input[1]"), "Relationship with the Employee DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationoftheMemberofPUDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Occupation of the Member of PU')]/following::select"), "Occupation of the Member of PU DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cadreTextField=new PageElement(By.xpath("//td//div[contains(text(),'Cadre')]/following::textarea"), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		capitalSumInsuredTextField = new PageElement(By.xpath("//td//div[contains(text(),'Capital Sum Insured')]/following::input"), "Capital Sum Insured Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dateofBirthoftheMemberTextField = new PageElement(By.name("propValues3"), "Date of Birth of the Member TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		monthlyIncomeofthememberTextField =new PageElement(By.xpath("//td//div[contains(text(),'Monthly Income of the member')]/following::input"), "Monthly Income of the member TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nomineeNameTextField = new PageElement(By.xpath("//td/div/input[@name='propValues6']"), "Nominee Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationshipwithNomineeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Relationship with Nominee')]/following::input"), "Relationship with Nominee TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyPreviousClaimDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Any Previous Claim')]/following::select"), "Any Previous Claim? DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyPhysicalDefectsDropDown = new PageElement(By.xpath("//td//div[contains(text(),'Any Physical Defects')]/following::select"), "Any Physical Defects DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskGroupforPUDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Risk Group for PU')]/following::select"), "Risk Group for PU DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		descriptionoftheRiskGroupTextField= new PageElement(By.xpath("//td//div[contains(text(),'Description of the Risk Group')]/following::textarea"), "Description of the Risk Group TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoTextField = new PageElement(By.xpath("//td//div/input[@name='propValues13']"), "Serial No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		medicalextensionRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Medical extension Required')]/following::select"), "Medical extension Required DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		occupationoftheMemberofPUIndividualDropDown=new PageElement(By.xpath("//td/div/select[@name='propValues16']"), "Medical extension Required DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cadreDetailsListOpenButton=new PageElement(By.xpath("//td//div[contains(text(),'Cadre Details')]/following::input"), "Cadre Details List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//strengthoftheGroupUnnamedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Strength of the Group (Unnamed)')]/following::select"), "Strength of the Group (Unnamed) DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		strengthoftheGroupUnnamedDropDown=new PageElement(By.xpath("//tr[5]/td[2]/div/select"), "Strength of the Group (Unnamed) DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		groupDiscountPercentageTextField= new PageElement(By.xpath("//td//div[contains(text(),'Group Discount (%)')]/following::input"), "Group Discount Percentage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		employeeIDNumberPUTextField = new PageElement(By.xpath("//td//div[contains(text(),'Employee ID Number PU')]/following::input"), "Employee ID Number PU TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskCoveredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Risk Covered')]/following::textarea"), "Risk Covered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationdetailsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Location details')]/following::textarea"), "Location details TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialPerilsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Special Perils')]/following::textarea"), "Special Perils TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialExclusionTextField= new PageElement(By.xpath("//td//div[contains(text(),'Special Exclusion')]/following::textarea"), "Special Exclusion TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		subjecttoClauseTextField= new PageElement(By.xpath("//td//div[contains(text(),'Subject to Clause')]/following::textarea"), "Subject to Clause TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialExcessTextField= new PageElement(By.xpath("//td//div[contains(text(),'Special Excess')]/following::textarea"), "Special Excess TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextField= new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfPersonsCoveredTextField= new PageElement(By.xpath("//td//div[contains(text(),'No of Persons Covered')]/following::input"), "No of Persons Covered TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		increaseinPermanentTotalDisabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Increase in Permanent Total Disability')]/following::select"), "Increase in Permanent Total Disability DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		cadreDetailsListOpenButton=new PageElement(By.xpath("//td//div[contains(text(),'Cadre Details')]/following::input"), "Cadre Details List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cadreDetailsWindowAddButton 				= new PageElement(By.name("btnAdd"), "Cadre Details Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cadreDetailsWindowSaveButton				= new PageElement(By.name("btnSave"), "Cadre Details Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cadreDetailsWindowCloseButton			= new PageElement(By.name("btnClose"), "Cadre Details Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cadreDetailsWindowDeleteButton 			= new PageElement(By.name("btnDel"), "Cadre Details Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cadreDetailsWindowCadreTextField=	new PageElement(By.name("Data_226891502072010_"+rowcount+""), "Cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	cadreDetailsWindowNoofpersonpercadreTextField =new PageElement(By.name("Data_226903002072010_"+rowcount+""), "No of person per cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cadreDetailsWindowSuminsuredperpersonTextField =new PageElement(By.name("Data_210723227092009_"+rowcount+""), "Sum insured per person Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cadreDetailsWindowSIforcadreTextField =new PageElement(By.name("Data_226903102072010_"+rowcount+""), "SI for cadre Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//pu
		cadreDetailsWindowSIforcadre=new PageElement(By.xpath("//tr//td//b[contains(text(),'SI for cadre')]"), "Cadre Details List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		cadreDetailsWindowSerialNoTextField =new PageElement(By.name("Data_226891502072010_"+rowcount+""), "Serial No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
				
		premiumForMemberListOpenButton=new PageElement(By.xpath("//td//div[contains(text(),'Premium for Member')]/following::input"), "Premium for Member List Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumForMemberWindowAddButton 				= new PageElement(By.name("btnAdd"), "Premium Window Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumForMemberWindowSaveButton				= new PageElement(By.name("btnSave"), "Premium Window Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumForMemberWindowCloseButton			= new PageElement(By.name("btnClose"), "Premium Window Close Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumForMemberWindowDeleteButton 			= new PageElement(By.name("btnDel"), "Premium Window Delete Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumForMemberWindowAdditionDeletionDropDown=new PageElement(By.name("Data_983951225092013_"+rowcount+""), "Premium Window Addition Deletion DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumForMemberWindowNoofpersonsTextField=new PageElement(By.name("Data_983933325092013_"+rowcount+""), "Premium Window No of persons  Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumForMemberWindowDescriptionofCategoryTextField=new PageElement(By.name("Data_983933225092013_"+rowcount+""), "Premium Window Description of Category Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumForMemberWindowSerialNoTextField=new PageElement(By.name("slNo0"), "Premium Window Serial No Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		premiumForMemberWindowTotalPremiumTextField=new PageElement(By.name("Data_35783704012005_"+rowcount+""), "Premium Window Total Premium Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		forwardButton=new PageElement(By.name("Next"), "forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	
	
	public void fillPolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity, CustomAssert assertReference) throws InterruptedException {
		if(polInsIntINDRiskDetPUEntity.getAction().equalsIgnoreCase("add") || polInsIntINDRiskDetPUEntity.getAction().equalsIgnoreCase("edit")){
		
			//Group
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsListOpenButton")) {
				
				fillCadreDetails(polInsIntINDRiskDetPUEntity);								
			}	
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRiskGroupforPU")) {
				
				selectValueFromList(riskGroupforPUDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("RiskGroupforPU"));
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigDescriptionoftheRiskGroup")){
				clearAndSendKeys(descriptionoftheRiskGroupTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("DescriptionoftheRiskGroup") );
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigStrengthoftheGroupUnnamed")) {
				selectValueFromList(strengthoftheGroupUnnamedDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("StrengthoftheGroupUnnamed"));
			}
			
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigMedicalExtensionRequired")) {
				selectValueFromList(medicalextensionRequiredDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("MedicalExtensionRequired"));
			}	
		//individual
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNameoftheInsuredPerson")){
				clearAndSendKeys(nameoftheInsuredPersonTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("NameoftheInsuredPerson") );
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationshipWiththePolicyholderofPU")) {
				selectValueFromList(relationshipwiththePolicyholderofPUDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("RelationshipWiththePolicyholderofPU"));
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigDateofBirthoftheMember")){
				
				String DateofBirth=RandomCodeGenerator.dateGenerator(polInsIntINDRiskDetPUEntity.getStringValueForField("DateofBirthoftheMember"));
				clearAndEnterDate(dateofBirthoftheMemberTextField, DateofBirth);
				//clearAndSendKeys(dateofBirthoftheMemberTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("DateofBirthoftheMember") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigMonthlyIncomeoftheMember")){
				clearAndSendKeys(monthlyIncomeofthememberTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("MonthlyIncomeoftheMember") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNomineeName")){
				clearAndSendKeys(nomineeNameTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("NomineeName") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationshipWithNominee")){
				clearAndSendKeys(relationshipwithNomineeTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("RelationshipWithNominee") );
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAnyPreviousClaim")) {
				selectValueFromList(anyPreviousClaimDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("AnyPreviousClaim"));
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAnyPhysicalDefects")) {
				selectValueFromList(anyPhysicalDefectsDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("AnyPhysicalDefects"));
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRiskGroupforPU")) {
				selectValueFromList(riskGroupforPUDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("RiskGroupforPU"));
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSerialNo")){
				clearAndSendKeys(serialNoTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("SerialNo") );
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigOccupationoftheMemberofPUIndividual")) {
				selectValueFromList(occupationoftheMemberofPUIndividualDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("OccupationoftheMemberofPUIndividual"));
			}
			//Member
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNameoftheMember")){
				clearAndSendKeys(nameoftheMemberTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("NameoftheMember") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAge")){
				clearAndSendKeys(ageTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("Age") );
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSex")) {
				selectValueFromList(sexDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("Sex"));
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationshipWiththeEmployee")) {
				clearAndSendKeys(relationshipwiththeEmployeeDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("RelationshipWiththeEmployee"));
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigOccupationoftheMemberofPU")) {
				selectValueFromList(occupationoftheMemberofPUDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("OccupationoftheMemberofPU"));
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadre")){
				clearAndSendKeys(cadreTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("Cadre") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigMonthlyIncomeoftheMember")){
				clearAndSendKeys(monthlyIncomeofthememberTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("MonthlyIncomeoftheMember") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCapitalSumInsured")){
				clearAndSendKeys(capitalSumInsuredTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("CapitalSumInsured") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigEmployeeIDNumberPU")){
				clearAndSendKeys(employeeIDNumberPUTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("EmployeeIDNumberPU") );
			}	
			//TilorMade
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRiskCovered")){
				clearAndSendKeys(riskCoveredTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("RiskCovered") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigLocationDetails")){
				clearAndSendKeys(locationdetailsTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("LocationDetails") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialPerils")){
				clearAndSendKeys(specialPerilsTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialPerils") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialExclusion")){
				clearAndSendKeys(specialExclusionTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialExclusion") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSubjectToClause")){
				clearAndSendKeys(subjecttoClauseTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("SubjectToClause") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialExcess")){
				clearAndSendKeys(specialExcessTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialExcess") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialConditions")){
				clearAndSendKeys(specialConditionsTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialConditions") );
			}
			if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNoOfPersonsCovered")){
				clearAndSendKeys(noOfPersonsCoveredTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("NoOfPersonsCovered") );
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigIncreaseinPermanentTotalDisability")) {
				selectValueFromList(increaseinPermanentTotalDisabilityDropDown, polInsIntINDRiskDetPUEntity.getStringValueForField("IncreaseinPermanentTotalDisability"));
			}
			//STDRisk
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberListOpenButton")) {
				fillPremiumForMemberDetails(polInsIntINDRiskDetPUEntity);								
			}	
			
		}else if(polInsIntINDRiskDetPUEntity.getAction().equalsIgnoreCase("verify")){ 
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigpolicyHolder")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("policyHolder"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromFields(insuredInterestSerialNoLabel), AssertionType.WARNING);
			}
			//Group
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsListOpenButton")) {
				verifyCadreDetailsList(polInsIntINDRiskDetPUEntity,assertReference);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigStrengthoftheGroupUnnamed")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("StrengthoftheGroupUnnamed"), fetchValueFromList(strengthoftheGroupUnnamedDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigGroupDiscountPercentage")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("GroupDiscountPercentage"), fetchValueFromTextFields(groupDiscountPercentageTextField), AssertionType.WARNING);
			}			
			//individual
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNameoftheInsuredPerson")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("NameoftheInsuredPerson"), fetchValueFromTextFields(nameoftheInsuredPersonTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationshipWiththePolicyholderofPU")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("RelationshipWiththePolicyholderofPU"), fetchValueFromList(relationshipwiththePolicyholderofPUDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigDateofBirthoftheMember")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("DateofBirthoftheMember"), fetchValueFromTextFields(dateofBirthoftheMemberTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigMonthlyIncomeoftheMember")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("MonthlyIncomeoftheMember"), fetchValueFromTextFields(monthlyIncomeofthememberTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNomineeName")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("NomineeName"), fetchValueFromTextFields(nomineeNameTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("RelationshipWithNominee"), fetchValueFromTextFields(relationshipwithNomineeTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAnyPreviousClaim")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("AnyPreviousClaim"), fetchValueFromList(anyPreviousClaimDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAnyPhysicalDefects")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("AnyPhysicalDefects"), fetchValueFromList(anyPhysicalDefectsDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRiskGroupforPU")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("RiskGroupforPU"), fetchValueFromList(riskGroupforPUDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigDescriptionoftheRiskGroup")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("DescriptionoftheRiskGroup"), fetchValueFromTextFields(descriptionoftheRiskGroupTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSerialNo")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("SerialNo"), fetchValueFromTextFields(serialNoTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigMedicalExtensionRequired")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("MedicalExtensionRequired"), fetchValueFromList(medicalextensionRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigOccupationoftheMemberofPUIndividual")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("OccupationoftheMemberofPUIndividual"), fetchValueFromList(occupationoftheMemberofPUIndividualDropDown), AssertionType.WARNING);
			}
			//Member
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNameoftheMember")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("NameoftheMember"), fetchValueFromTextFields(nameoftheMemberTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAge")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("Age"), fetchValueFromTextFields(ageTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSex")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("Sex"), fetchValueFromList(sexDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationshipWiththeEmployee")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("RelationshipWiththeEmployee"), fetchValueFromList(relationshipwiththeEmployeeDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigOccupationoftheMemberofPU")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("OccupationoftheMemberofPU"), fetchValueFromList(occupationoftheMemberofPUDropDown), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadre")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("Cadre"), fetchValueFromTextFields(cadreTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("CapitalSumInsured"), fetchValueFromTextFields(capitalSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigEmployeeIDNumberPU")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("EmployeeIDNumberPU"), fetchValueFromTextFields(employeeIDNumberPUTextField), AssertionType.WARNING);
			}
			//TilorMade
		
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRiskCovered")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("RiskCovered"), fetchValueFromTextFields(riskCoveredTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigLocationDetails")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("LocationDetails"), fetchValueFromTextFields(locationdetailsTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialPerils")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialPerils"), fetchValueFromTextFields(specialPerilsTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialExclusion")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialExclusion"), fetchValueFromTextFields(specialExclusionTextField), AssertionType.WARNING);
			}			
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSubjectToClause")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("SubjectToClause"), fetchValueFromTextFields(subjecttoClauseTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialExcess")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("SubjectToClause"), fetchValueFromTextFields(specialExcessTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigNoOfPersonsCovered")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("NoOfPersonsCovered"), fetchValueFromTextFields(noOfPersonsCoveredTextField), AssertionType.WARNING);
			}
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigIncreaseinPermanentTotalDisability")) {
				assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("IncreaseinPermanentTotalDisability"), fetchValueFromList(increaseinPermanentTotalDisabilityDropDown), AssertionType.WARNING);
			}
			//STDRisk 
			if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberListOpenButton")) {
				verifyPremiumForMemberWindowDetailsList(polInsIntINDRiskDetPUEntity,assertReference);
			}
			
			
		}
	}
	public void fillCadreDetails(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity) throws InterruptedException{
		clickOnCadreOpenButton(polInsIntINDRiskDetPUEntity);
		switchToWindow("'Cadre Details' Details");
		//Table - Parameter List for Installment Percentage List
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowAddButton")){
			click(cadreDetailsWindowAddButton);
		}		
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowCadre")){
			clearAndSendKeys(cadreDetailsWindowCadreTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowCadre") );
		}
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowNoofpersonpercadre")){
			clearAndSendKeys(cadreDetailsWindowNoofpersonpercadreTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowNoofpersonpercadre") );
		}		
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSuminsuredPerPerson")){
			clearAndSendKeys(cadreDetailsWindowSuminsuredperpersonTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowSuminsuredPerPerson") );
			click(cadreDetailsWindowSIforcadre);
			click(cadreDetailsWindowSIforcadre);
			click(cadreDetailsWindowSaveButton);
		}
		
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSIforcadre")){
			clearAndSendKeys(cadreDetailsWindowSIforcadreTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowSIforcadre") );
			
		}	
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsDelete")){
			click(cadreDetailsWindowDeleteButton);
		}		
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSaveButton")){	
			click(cadreDetailsWindowSIforcadre);
			click(cadreDetailsWindowSaveButton);
			Thread.sleep(3000);
			click(cadreDetailsWindowCloseButton);
			switchToWindow();
			switchToFrame("display");
			//isElementDisplayed(gROUPRiskDetailsTitle);
		}
	}
	
	public void fillPremiumForMemberDetails(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity) throws InterruptedException{
		clickOnPremiumForMemberListOpenButton(polInsIntINDRiskDetPUEntity);
		switchToWindow("'Premium for Member' Details");
		//Table - Parameter List for Premium For Member Detailst
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowAddButton")){
			click(premiumForMemberWindowAddButton);
		}		
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowAdditionDeletion")){
			clearAndSendKeys(premiumForMemberWindowAdditionDeletionDropDown,polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowAdditionDeletion") );
		}
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowNoofpersons")){
			clearAndSendKeys(premiumForMemberWindowNoofpersonsTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("NoofPersons") );
		}		
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowTotalPremium")){
			clearAndSendKeys(premiumForMemberWindowTotalPremiumTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowTotalPremium") );
		}		
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowDescriptionofCategory")){
			clearAndSendKeys(premiumForMemberWindowDescriptionofCategoryTextField,polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowDescriptionofCategory") );
		}	
		if(polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowDelete")){
			click(premiumForMemberWindowDeleteButton);
		}		
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowSave")){	
			click(premiumForMemberWindowSaveButton);
			click(premiumForMemberWindowCloseButton);
			switchToWindow();
			switchToFrame("display");
			isElementDisplayed(sTANDARDRiskDetailsTitle);
		}
	}
	public void clickOnCadreOpenButton(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity) throws InterruptedException  {
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsListOpenButton")){
			click(cadreDetailsListOpenButton);
			switchToWindow("'Cadre Details' Details");
		}
	}
	
	public void clickOnPremiumForMemberListOpenButton(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity) throws InterruptedException  {
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberListOpenButton")){
			click(premiumForMemberListOpenButton);
			//switchToWindow("'Premium for Member' Details");
		}
	}
	
	public void verifyCadreDetailsList(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity ,CustomAssert assertReference) throws InterruptedException{
		
		clickOnCadreOpenButton(polInsIntINDRiskDetPUEntity);
		//Table - Parameter List for Cadre Details List
		/*if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSerialNo")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowSerialNo"), fetchValueFromTextFields(cadreDetailsWindowSerialNoTextField), AssertionType.WARNING);
		}*/
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadre")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("Cadre"), fetchValueFromTextFields(cadreDetailsWindowCadreTextField), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowNoofpersonpercadre")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowNoofpersonpercadre"), fetchValueFromTextFields(cadreDetailsWindowNoofpersonpercadreTextField), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSuminsuredPerPerson")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowSuminsuredPerPerson"), fetchValueFromTextFields(cadreDetailsWindowSuminsuredperpersonTextField), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSIforcadre")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("CadreDetailsWindowSIforcadre"), fetchValueFromTextFields(cadreDetailsWindowSIforcadreTextField), AssertionType.WARNING);
		}		
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCadreDetailsWindowSaveButton")){	
			click(cadreDetailsWindowCloseButton);
		}		
	}
	
	public void verifyPremiumForMemberWindowDetailsList(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity ,CustomAssert assertReference) throws InterruptedException{
		clickOnPremiumForMemberListOpenButton(polInsIntINDRiskDetPUEntity);
		//Table - Parameter List for Premium For Member Window Details List
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowSerialNo")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowSerialNo"), fetchValueFromTextFields(premiumForMemberWindowSerialNoTextField), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowAdditionDeletion")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowAdditionDeletion"), fetchValueFromList(premiumForMemberWindowAdditionDeletionDropDown), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowNoofpersons")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("CadrePremiumForMemberWindowNoofpersons"), fetchValueFromTextFields(premiumForMemberWindowNoofpersonsTextField), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowTotalPremium")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowTotalPremium"), fetchValueFromTextFields(premiumForMemberWindowTotalPremiumTextField), AssertionType.WARNING);
		}
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowDescriptionofCategory")) {
			assertReference.assertEquals(polInsIntINDRiskDetPUEntity.getStringValueForField("PremiumForMemberWindowDescriptionofCategory"), fetchValueFromTextFields(premiumForMemberWindowDescriptionofCategoryTextField), AssertionType.WARNING);
		}		
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPremiumForMemberWindowSaveButton")){	
			click(premiumForMemberWindowCloseButton);
		}		
	}
	
	public void clickBackButton(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButton(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			
			
			//isElementDisplayed(riskDetailsNextPageTitle);
		}
	}
	
	public void clickSaveButton(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			switchToFrame("display");
		}
	}
	
	public void navigateToPolicy(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}

	public void navigateToCoverage(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}

	public void navigateToClientDetails(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigRelationsTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	
	public void navigateToInsuredInterestDetailTab(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestDetailsTab")){			
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailTabTitle);
		}
	}
	public void navigateToInsuredInterestAttributesTab(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesTabTitle);
		}
	}
	
	public void navigateToInsuredInterestAttachCoveragesTab(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestAttributesTab")){			
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragesTabTitle);
		}
	}
	public void navigateToInsuredInterestRelationsTab(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestRelationsTab")){			
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsTabTitle);
		}
	}	
	public void navigateToInsuredInterestPaymentsTab(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestPaymentsTab")){			
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentsTabTitle);
		}
	}
	public void navigateToInsuredInterestScheduleTab(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity){
		if (polInsIntINDRiskDetPUEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")){			
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestScheduleTabTitle);
		}
	}
	public void fillandSubmitPolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(PolInsIntINDRiskDetPUEntity polInsIntINDRiskDetPUEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntINDRiskDetPUEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInterestINDIVIDUALRiskDetailsPUPersonalAccident(polInsIntINDRiskDetPUEntity, assertReference);
			clickNextButton(polInsIntINDRiskDetPUEntity);
			clickBackButton(polInsIntINDRiskDetPUEntity);
			navigateToPolicy(polInsIntINDRiskDetPUEntity);
			navigateToAttribute(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterest(polInsIntINDRiskDetPUEntity);
			navigateToCoverage(polInsIntINDRiskDetPUEntity);
			navigateToClientDetails(polInsIntINDRiskDetPUEntity);
			navigateToRelation(polInsIntINDRiskDetPUEntity);
			navigateToPayment(polInsIntINDRiskDetPUEntity);
			navigateToFollowup(polInsIntINDRiskDetPUEntity);
			navigateToDocument(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterestDetailTab(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterestAttributesTab(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterestAttachCoveragesTab(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterestRelationsTab(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterestPaymentsTab(polInsIntINDRiskDetPUEntity);
			navigateToInsuredInterestScheduleTab(polInsIntINDRiskDetPUEntity);
		}
	}
}
