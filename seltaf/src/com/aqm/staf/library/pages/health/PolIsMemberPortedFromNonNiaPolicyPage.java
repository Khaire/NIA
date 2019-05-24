package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.IsMemPortNonNIAPolEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;



public class PolIsMemberPortedFromNonNiaPolicyPage extends BasePage {

	//PageTabs
	private PageElement policyTab;
	private PageElement attributesTab;
	private PageElement memberTab;
	private PageElement coverageTab;
	private PageElement loanTab;
	private PageElement clientDetailsTab;
	private PageElement relationsTab;
	private PageElement paymentsTab;
	private PageElement followupTab;
	private PageElement documentTab;
	private PageElement memberDetailsTab;
	private PageElement memberAttributesTab;
	private PageElement memberAttachCoveragesTab;
	private PageElement memberRelationsTab;
	private PageElement memberPaymentsTab;

	//Page Titles
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyMemberTitle;
	private PageElement policyCoverageListTitle;
	private PageElement policyLoanTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement followupPageTitle;
	private PageElement policyDocumentTitle;
	private PageElement memberDetailTitle;
	private PageElement memberAttributesTitle;
	private PageElement memberAttachCoveragesTitle;
	private PageElement memberRelationsTitle;
	private PageElement memberPaymentsTitle;

	//Labels
	private PageElement quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;

	//Buttons
	private PageElement forwardButton;
	private PageElement saveButton;

	//Page Content
	private PageElement isTheMemberPortedFromNonNIAPolicydropdown;



	public PolIsMemberPortedFromNonNiaPolicyPage(WebDriver driver,String pageName) {
		super(driver, pageName);

		//PageTabs
		policyTab = new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTab = new PageElement(By.linkText("Member"), "Member Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab = new PageElement(By.linkText("Coverage"), "Coverage Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab = new PageElement(By.xpath("//div//b[contains(text(),'Client Tab')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailsTab = new PageElement(By.linkText("Detail"), "Member Details Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTab=new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"),"Member Attributes Tab",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberAttachCoveragesTab=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Member Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberRelationsTab= new PageElement(By.xpath("//div[@title='Relation']"), "Member Relations Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);		
		memberPaymentsTab=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Member Payments Tab", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Page Titles
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyCoverageList')]"), "Policy Coverage List", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'ClientDetail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'PolicyRelations')]"), "Policy Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy PaymentList", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "PolicyDocument", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Details')]"), " MemberDetail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), " MemberAttributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), " Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), " Member Payments Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//Labels

		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No"))," Quate Number Feild Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyholderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		//Buttons
		forwardButton=new PageElement(By.name("Next"),  "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		isTheMemberPortedFromNonNIAPolicydropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is the member ported from non NIA Policy", "select")), "Enter Is The Member Ported From Non NIA Policydropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

	}
	public void fillPolicyMemberIsTheMemberPortedFromNonNIAPolicy(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity, CustomAssert assertReference) throws InterruptedException{
		if(isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(isMemPortNonNIAPolEntity.getAction().equalsIgnoreCase("add") || isMemPortNonNIAPolEntity.getAction().equalsIgnoreCase("edit")){
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigIsMemPortFromNonNIAPolicy")) {
					selectValueFromList(isTheMemberPortedFromNonNIAPolicydropdown, isMemPortNonNIAPolEntity.getStringValueForField("IsMemPortFromNonNIAPolicy"));
				}
			}
			else if(isMemPortNonNIAPolEntity.getAction().equalsIgnoreCase("verify")){
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyholderLabel),AssertionType.WARNING);
				}
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigProduct")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("Product"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigMemberCode")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
				}
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("MemberSerialNo"), fetchValueFromTextFields(memberSerialNoLabel), AssertionType.WARNING);
				}
				if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigIsMemPortFromNonNIAPolicy")) {
					assertReference.assertEquals(isMemPortNonNIAPolEntity.getStringValueForField("IsMemPortFromNonNIAPolicy"), fetchValueFromList(isTheMemberPortedFromNonNIAPolicydropdown), AssertionType.WARNING);
				}

			}
		}
	}
	
	public void navigateToPolicyTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigPolicyButton")){		
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigAttributeButton")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToMemberTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigMemberButton")){		
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(policyMemberTitle);
		}
	}
	public void navigateToCoverageTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigCoverageButton")){		
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(policyCoverageListTitle);
		}
	}

	public void navigateToClientDetailsTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigClientDetailsButton")){		
            click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigRelationsButton")){		
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigPaymentsButton")){		
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigFollowupButton")){	
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigDocumentButton")){	
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToMemberDetailTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigDetailButton")){	
			click(memberDetailsTab);
			switchToFrame("display");
			isElementDisplayed(memberDetailTitle);
		}
	}
	public void navigateToMemberAttributesTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigMemberAttributesButton")){	
			click(memberAttributesTab);
			switchToFrame("display");
			isElementDisplayed(memberAttributesTitle);
		}
	}
	public void navigateToMemberAttachCoverageTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigAttachCoveragesButtton")){	
			click(memberAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragesTitle);
		}
	}
	public void navigateToMemberRelationsTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigMemberRelationsButton")){	
			click(memberRelationsTab);
			switchToFrame("display");
			isElementDisplayed(memberRelationsTitle);
		}
	}
	public void navigateToMemberPaymentsTab(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigMemberPaymentsButton")){	
			click(memberPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(memberPaymentsTitle);
		}
	}
	
	public void nextButtonIsMemberPortedFromNonNiaPolicyPage(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void saveButtonIsMemberPortedFromNonNiaPolicyPage(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity){
		if (isMemPortNonNIAPolEntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}

	public void fillandSubmitPolicyMemberIsTheMemberPortedFromNonNIAPolicy(IsMemPortNonNIAPolEntity isMemPortNonNIAPolEntity, CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(isMemPortNonNIAPolEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemberIsTheMemberPortedFromNonNIAPolicy(isMemPortNonNIAPolEntity, assertReference);
			nextButtonIsMemberPortedFromNonNiaPolicyPage(isMemPortNonNIAPolEntity);
			saveButtonIsMemberPortedFromNonNiaPolicyPage(isMemPortNonNIAPolEntity);
			navigateToPolicyTab(isMemPortNonNIAPolEntity);
			navigateToAttributeTab(isMemPortNonNIAPolEntity);
			navigateToMemberTab(isMemPortNonNIAPolEntity);
			navigateToCoverageTab(isMemPortNonNIAPolEntity);
			navigateToClientDetailsTab(isMemPortNonNIAPolEntity);
			navigateToRelationsTab(isMemPortNonNIAPolEntity);
			navigateToPaymentsTab(isMemPortNonNIAPolEntity);
			navigateToFollowupTab(isMemPortNonNIAPolEntity);
			navigateToDocumentTab(isMemPortNonNIAPolEntity);
			navigateToMemberDetailTab(isMemPortNonNIAPolEntity);
			navigateToMemberAttributesTab(isMemPortNonNIAPolEntity);
			navigateToMemberAttachCoverageTab(isMemPortNonNIAPolEntity);
			navigateToMemberRelationsTab(isMemPortNonNIAPolEntity);
			navigateToMemberPaymentsTab(isMemPortNonNIAPolEntity);
		}
	}
}
