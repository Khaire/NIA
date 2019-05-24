package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;

public class PolicyInsuredIntrestAttributeSIForCalfRural extends BasePage {

	private PageElement sIforCalfTitle;
	
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement insuredInterestTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	
	private PageElement insuredInterestDetailTitle;
	private PageElement insuredInterestAttributesTitle;
	private PageElement insuredInterestrAttachCoveragesTitle;
	private PageElement insuredInterestRelationsTitle;
	private PageElement insuredInterestPaymentsTitle;
	private PageElement insuredInterestScheduleTitle;
	
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestrAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;
	
	private PageElement	quoteNoLabel;
	private PageElement statusLabel;
	private PageElement policyholderLabel;
	private PageElement productLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;	
	
	private PageElement previousPageLabel;

	private PageElement tagNumberLabel;
	private PageElement typeofCalfLabel;
	private PageElement originOfRiskLabel;
	private PageElement breedspecificationLabel;	
	private PageElement sexLabel;
	private PageElement breedColorOtherMarksLabel;
	private PageElement ageMonthLabel;
	private PageElement ageDaysLabel;	
	private PageElement purposeOfUseNewLabel;
	private PageElement marketValueLabel;
	
	private PageElement currentPageLabel;

	private PageElement exceesInPercentageDropdown;
	private PageElement sumInsuredTextField;
	
	private PageElement saveButton;
	private PageElement backButton;
	private PageElement previousButton;
	
	public PolicyInsuredIntrestAttributeSIForCalfRural(WebDriver driver, String pageName){
		super(driver, pageName);
		sIforCalfTitle = new PageElement(By.xpath("//div//b//font[contains(text(),'SI for Calf')]"), "SI for Calf Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTitle = new PageElement(By.xpath("//div[@title='Policy']"), "Policy Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributesTitle = new PageElement(By.xpath("//div//b[contains(text(),'Attribute')]"), "Attribute Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTitle = new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"), "Client Details Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTitle = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTitle = new PageElement(By.xpath("//div//b[contains(text(),'Followup')]"), "Followup Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTitle = new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		insuredInterestDetailTab			=new PageElement(By.xpath("//table[2]//tbody//td//div//b[contains(text(),'Detail')]"), "Insured Interest Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab		=new PageElement(By.xpath("//td//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestrAttachCoveragesTab	=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab			=new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab			=new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab			=new PageElement(By.xpath("//div[@title='Schedule']"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		insuredInterestDetailTitle = new PageElement(By.xpath("//div//b//b[contains(text(),'Details')]"), " Member Detail Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttributesTitle = new PageElement(By.xpath("//div/b/font[contains(text(),'Risk Details For Calf')]"), " Insured Interest Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestrAttachCoveragesTitle = new PageElement(By.xpath("//div/b/b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTitle = new PageElement(By.xpath("//div/b/b[contains(text(),'Insured Interest Relations')]"), " Insured Interest Relations Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTitle = new PageElement(By.xpath("//div/b/b[contains(text(),'Payment List')]"), " Insured Interest Payments Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTitle = new PageElement(By.linkText("Schedule"), " Insured Interest Schedule Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		quoteNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Quote")), "Quote No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		statusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Status")), "Status Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyholderLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Policyholder")), "Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Product")), "Product Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured InterestCode")), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel = new PageElement(By.xpath(genericLocatorforLabel("S0042","Insured Interest Serial No.")), "Insured Interest Serial No. Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		currentPageLabel = new PageElement(By.xpath("//tr//td[contains(text(),'Current Page')]"), "Insured InterestCode Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		tagNumberLabel = new PageElement(By.xpath("//tr/td[@id='Tag Number']/following::td"), "Tag Number Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		typeofCalfLabel = new PageElement(By.xpath("//tr/td[@id='Type of Calf']/following::td"), "Tag Number Label", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		originOfRiskLabel = new PageElement(By.xpath("//tr/td[@id='Origin of risk']/following::td"), "Origin Of Risk Label", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		sexLabel = new PageElement(By.xpath("//tr/td[@id='Sex']/following::td"), "Sex Label", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		breedspecificationLabel = new PageElement(By.xpath("//tr/td[@id='Breed specification']/following::td"), "Breed specification Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED ,10);
		ageDaysLabel = new PageElement(By.xpath("//tr/td[@id='Age (Days)']/following::td"), "Age Days Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		ageMonthLabel = new PageElement(By.xpath("//tr/td[@id='Age (Months)']/following::td"), "Age Month Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		purposeOfUseNewLabel = new PageElement(By.xpath("//tr/td[@id='Purpose of Use(New)']/following::td"), "Purpose Of Use New Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		marketValueLabel = new PageElement(By.xpath("//tr/td[@id='Market Value(Rs)']/following::td"), "Market Value Label", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		sumInsuredTextField = new PageElement(By.xpath("//td//div[@id='Sum Insured(Rs)']/following::input"), "Sum Insured Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		exceesInPercentageDropdown = new PageElement(By.xpath("//td//div[@id='Excess in (%)']/following::select[1]"), "Excees In Percentage Dropdown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		saveButton = new PageElement(By.name("Save"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		previousButton = new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
		
	}
	

}
