package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.MemberAttributesEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;

import java.awt.*;
import java.awt.event.KeyEvent;
public class PolicyMemberAttributes  extends BasePage {
	private PageElement policyMemberAttibutesTitle;
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement memberTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
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
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;
	private PageElement applicationEventCodeDropdown;
	private PageElement proceedButton;
	private PageElement nextButton;
	private PageElement viewButton;
	private PageElement backButton;
	//navigations
	private PageElement policyPageTitle;
	private PageElement attributePageTitle;
	private PageElement memberPageTitle;
	private PageElement coveragePageTitle;
	//private PageElement loanPageTitle;
	private PageElement clientDetailsPageTitle;
	private PageElement relationsPageTitle;
	private PageElement paymentsPageTitle;
	private PageElement followupPageTitle;
	private PageElement documentPageTitle;
	private PageElement memberDetailsCXPageTitle;
	private PageElement memberAttributesPageTitle;
	private PageElement policyMemberDetailsPageTitle;
	private PageElement memberAttachCoveragePageTitle;
	private PageElement memberRelationsPageTitle;
	private PageElement memberPaymentPageTitle;

	private PageElement memberattributeTitle;
	//EP
	private PageElement riskDetailsForPoultryTitle;
	private PageElement riskDetailsTitle;
	private PageElement insuredInterestTab;
	private String memberCode;
	private WebElement isCloseErrorWindowExist;
	private PageElement closeErrorWindow;
	private PageElement findbutton;
	private PageElement searchbutton;
	private PageElement list;


	public PolicyMemberAttributes(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyMemberAttibutesTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Attributes')]"), "Policy Member Attibutes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), " Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Member')]"), "Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberDetailTitle = new PageElement(By.linkText("Detail"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), " Member Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttachCoveragesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Member Attach Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberRelationsTitle = new PageElement(By.xpath("//div[@title='Relation']/b"), "Member Relations Coverages Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberPaymentsTitle = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Member Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberFundTitle = new PageElement(By.linkText("Fund"), " MemberFund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyNoLabel  = new PageElement(By.xpath(genericLocatorforLabel("S0040", "No")), "Policy Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Quote")), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Member Code")), "Member Code Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0040", "Member Serial No")), "Member Serial No Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		applicationEventCodeDropdown=new PageElement(By.name("pEventCode"), "Select Application Event Code DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		proceedButton=new PageElement(By.name("Proceed"), "Proceed Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		nextButton=new PageElement(By.name("Next"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		viewButton=new PageElement(By.name("View"), "View Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy/Quote Details')]"), "Policy Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Attribute Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Member Home Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scheme Detail')]"), "Policy Client Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Relations')]"), "Policy Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy Followup Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberDetailsCXPageTitle=new PageElement(By.xpath("//b//font[contains(text(),'Member Details CX T1-PLR')]"), "Member Details CX Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Policy Member Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Policy Member Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member Relations')]"), "Policy Member Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Policy Member Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//EP
		riskDetailsForPoultryTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details For Poultry')]"), "Risk Details For Poultry", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskDetailsTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Risk Details')]"), "Risk Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTab=new PageElement(By.linkText("Insured Interest"), "Insured Interest Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		findbutton=new PageElement(By.xpath("//div[@id='Vessel Code']//following::img[1]"), "Vessel Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchbutton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		list=new PageElement(By.cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(2) td.TEXTFONT:nth-child(1) > a:nth-child(1)"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


	}

	public void fillPolicyMemberAttribute(MemberAttributesEntity memberAttributesEntity, CustomAssert assertReference)throws InterruptedException{
		if(memberAttributesEntity.getAction().equalsIgnoreCase("add") || memberAttributesEntity.getAction().equalsIgnoreCase("edit")){
			if (memberAttributesEntity.getBooleanValueForField("ConfigApplicationEventCode")) {
				selectValueFromList(applicationEventCodeDropdown, memberAttributesEntity.getStringValueForField("ApplicationEventCode"));
			}
		}
		else if(memberAttributesEntity.getAction().equalsIgnoreCase("verify")){

			if (memberAttributesEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyholderLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigMemberCode")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("MemberSerialNo"), fetchValueFromTextFields(memberSerialNoLabel), AssertionType.WARNING);
			}
			if (memberAttributesEntity.getBooleanValueForField("ConfigApplicationEventCode")) {
				assertReference.assertEquals(memberAttributesEntity.getStringValueForField("ApplicationEventCode"), fetchValueFromTextFields(applicationEventCodeDropdown), AssertionType.WARNING);
			}
		}
	}

	public void navigateToPolicyTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyPageTitle);
		}
	}
	public void navigateToAttributeTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributePageTitle);
		}
	}
	public void navigateToMemberTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTab);
			switchToFrame("display");
			isElementDisplayed(memberPageTitle);
		}
	}
	public void navigateToCoverageTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coveragePageTitle);
		}
	}
	public void navigateToClientDetailTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsPageTitle);
		}
	}
	public void navigateToRelationsTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsPageTitle);
		}
	}
	public void navigateToPaymentsTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsPageTitle);
		}
	}
	public void navigateToFollowupTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupPageTitle);
		}
	}
	public void navigateToDocumentTab(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentPageTitle);
		}
	}
	public void proceedButtonPolicyMemberAttributes(MemberAttributesEntity memberAttributesEntity) throws InterruptedException{
		if (memberAttributesEntity.getBooleanValueForField("ConfigProceedButton")) {
			Thread.sleep(1000);
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(getWebElement(proceedButton)));
			click(proceedButton);
			Thread.sleep(1000);
			if(memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("CI")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("FF")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("PL")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("BPPI")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("EV")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("EX")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("HH")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("SH")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("SK")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("YK")){
				try{
					acceptAlertAndReturnConfirmationMessage();
				}catch(Exception e){}
			}
			if(memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("EV")||memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("EX")||memberAttributesEntity.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){
				try{
					acceptAlertAndReturnConfirmationMessage();
					//handleAlert();
				}catch(Exception e){}
			}
			switchToFrame("display");
			/*memberattributeTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+memberAttributesEntity.getStringValueForField("MemberAttributesTitle")+"')]"), "Policy Member Attributes Health Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(memberattributeTitle);*/
		}
	}

	public void proceedButtonPolicyInsuredIntrestAviationAttributes(MemberAttributesEntity memberAttributesEntity) throws InterruptedException{
		if (memberAttributesEntity.getBooleanValueForField("ConfigProceedButtonForAviation")) {
			click(proceedButton);
			if (memberAttributesEntity.getBooleanValueForField("ConfigForAviationpopup")) {

				if(!memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("PN")||(memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("AG"))){
					if(memberAttributesEntity.getAction().equalsIgnoreCase("add") || memberAttributesEntity.getAction().equalsIgnoreCase("edit")||(!memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("AG"))){
						try{
							switchToWindow("Error Window");
							acceptAlertAndReturnConfirmationMessage();
						}catch(Exception e){}
						Thread.sleep(2000);
						isCloseErrorWindowExist = driver.findElement(By.name("CloseWin"));
						Thread.sleep(2000);
						if (isCloseErrorWindowExist.isDisplayed()) {
							closeErrorWindow= new PageElement(By.name("CloseWin"), "Close Error Win Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
							click(closeErrorWindow);
							switchToWindow("Integrated Insurance Management System");
							switchToFrame("display");
							Thread.sleep(2000);
							workaround(memberAttributesEntity);	
						}

					}
				}
			}
		}
	}
	public void workaround(MemberAttributesEntity memberAttributesEntity) throws InterruptedException{
		click(insuredInterestTab);
		navigateToSearchMemberCode(memberAttributesEntity);
		if(memberAttributesEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Hull")  && (!memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("AB"))) {
					
			String insuredInterestCode = memberAttributesEntity.getStringValueForField("MemberCode") ;
			PageElement insuredInterestCodeLinkTextField = new PageElement(By.xpath("//form[@name='FormPolicyRiskList']//td//a[contains(text(),'"+insuredInterestCode+"')]"), "Insured Interest Code in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(insuredInterestCodeLinkTextField);
			switchToFrame("display");
		}
		
			if(memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("AB"))
		{
			click(findbutton);
			switchToWindow("Vessel List");
			click(searchbutton);
			click(list);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
			click(nextButton);		
		
		}
		click(memberAttributesTitle);
		if(memberAttributesEntity.getStringValueForField("Product").equalsIgnoreCase("AB")) {
			click(nextButton);
		}else
		{
			click(proceedButton);
		}
	}
	public void nextButtonPolicyMemberAttributes(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigNextButton")) {
			click(nextButton);
			switchToFrame("display");
			//memberattributeTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'"+memberAttributesEntity.getStringValueForField("MemberAttributesTitle")+"')]"), "Policy Member Attributes Health Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//isElementDisplayed(memberattributeTitle);
		}
	}
	public void backButtonPolicyMemberAttributes(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void viewButtonPolicyMemberAttributes(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigViewButton")) {
			click(viewButton);
			switchToFrame("display");
			if(isElementDisplayed(memberAttributesPageTitle));
		}
	}
	public void navigateToPolicyMemberDetails(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(memberDetailTitle);
			switchToFrame("display");
			isElementDisplayed(policyMemberDetailsPageTitle);
		}
	}
	public void navigateToPolicyMemberAttributes(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(memberAttributesTitle);
			switchToFrame("display");
			//isElementDisplayed(memberAttributesPageTitle);
		}
	}
	public void navigateToPolicyMemberAttachCoverages(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(memberAttachCoveragesTitle);
			switchToFrame("display");
			isElementDisplayed(memberAttachCoveragePageTitle);
		}
	}
	public void navigateToPolicyMemberRelations(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(memberRelationsTitle);
			switchToFrame("display");
			isElementDisplayed(memberRelationsPageTitle);
		}
	}
	public void navigateToPolicyMemberPayments(MemberAttributesEntity memberAttributesEntity){
		if (memberAttributesEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(memberPaymentsTitle);
			switchToFrame("display");
			isElementDisplayed(memberPaymentPageTitle);
		}
	}
	public void navigateToSearchMemberCode(MemberAttributesEntity memberAttributesEntity) throws InterruptedException{
		if (memberAttributesEntity.getBooleanValueForField("ConfigSearchMemberCode")){
			memberCode=memberAttributesEntity.getStringValueForField("MemberCode");
			PageElement memberCodeLinkTextField = new PageElement(By.linkText(memberCode), "Member Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			Thread.sleep(1000);
			click(memberCodeLinkTextField);
			switchToFrame("display");
		}
	}
	public void fillAndProceedPolicyMemberAttributes(MemberAttributesEntity memberAttributesEntity,CustomAssert assertReference)throws InterruptedException {
		if(isConfigTrue(memberAttributesEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyMemberAttribute(memberAttributesEntity, assertReference);
			proceedButtonPolicyInsuredIntrestAviationAttributes(memberAttributesEntity);
			proceedButtonPolicyMemberAttributes(memberAttributesEntity);
			nextButtonPolicyMemberAttributes(memberAttributesEntity);
			navigateToPolicyTab(memberAttributesEntity);
			navigateToAttributeTab(memberAttributesEntity);
			navigateToMemberTab(memberAttributesEntity);
			navigateToCoverageTab(memberAttributesEntity);
			navigateToClientDetailTab(memberAttributesEntity);
			navigateToRelationsTab(memberAttributesEntity);
			navigateToPaymentsTab(memberAttributesEntity);
			navigateToFollowupTab(memberAttributesEntity);
			navigateToDocumentTab(memberAttributesEntity);
			navigateToPolicyMemberDetails(memberAttributesEntity);
			navigateToPolicyMemberAttributes(memberAttributesEntity);
			navigateToPolicyMemberAttachCoverages(memberAttributesEntity);
			navigateToPolicyMemberRelations(memberAttributesEntity);
			navigateToPolicyMemberPayments(memberAttributesEntity);
		}

	}
}
