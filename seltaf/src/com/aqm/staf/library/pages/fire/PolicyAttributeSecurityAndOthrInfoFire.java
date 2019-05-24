package com.aqm.staf.library.pages.fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.SecurityAndOthrInfoEntity;

public class PolicyAttributeSecurityAndOthrInfoFire extends BasePage {

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
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement forwardButton;
	private PageElement backButton;
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
	private PageElement previousButton;

	//SA-Shruti

	private PageElement detailsOfBusinessActivitycarriedTextArea;	
	private PageElement detailsOfSurroundingPropertyTextArea;	
	private PageElement detailsOfPipeLinesBelongingTextArea	;
	private PageElement detailsOfTransmissionDistributionTextArea	;
	private PageElement detailsOfSecurityAgencyListlocationWiseTextArea;	
	private PageElement detailsOfSecurityGuardslistlocationwiseTextArea	;
	private PageElement whetherSecurityGuardsAreArmedTextArea	;
	private PageElement whetherPropertyIssurroundedbyBoundaryWallsTextArea;
	private PageElement locationWiseDetailsOfEntryExitpointsForvehiclesTextArea;
	private PageElement locationWiseDetailsOfEntryExitpointsForworkersTextArea;
	private PageElement locationWiseDetailsOfWatchTowersTextField;
	private PageElement detailsofanyArmyPoliceorSecurityTextArea ;
	private PageElement whetherVehiclesAreParkedInsideTextArea	;
	private PageElement detailsOfAnyPastIncidentsOfTerroristNaxalTextArea 	;
	private PageElement detailsOfAnyPastCivilCommotionTextArea;
	private PageElement securityAndOthrInfoTitle;

	public PolicyAttributeSecurityAndOthrInfoFire(WebDriver driver, String pageName){
		super(driver,pageName);

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
		previousButton=new PageElement(By.name("btnPrevious"), "Previous Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		//SA-Shruti
		detailsOfBusinessActivitycarriedTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Business Activity carried out by the Insured in the insured locations", "textarea")), "Details of Business Activity carried out by the Insured in the insured locations Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsOfSurroundingPropertyTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Surrounding Property", "textarea")), "Details of Surrounding Property", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsOfPipeLinesBelongingTextArea	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Pipelines belonging to the Insured covered(Length,breadth,whether underground,depth underground etc..)", "textarea")), "Details of Pipelines belonging to the Insured covered(Length,breadth,whether underground,depth underground etc..)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfTransmissionDistributionTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Transmission & Distribution lines covered(owned and operated by the Insured)", "textarea")), "Details of Transmission & Distribution lines covered(owned and operated by the Insured)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfSecurityAgencyListlocationWiseTextArea	=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Security Agency(List location wise)", "textarea")), "Details of Security Agency(List location wise)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfSecurityGuardslistlocationwiseTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Security Guards(list location wise,number)", "textarea")), "Details of Security Guards(list location wise,number)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		whetherSecurityGuardsAreArmedTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Security Guards are Armed? Please enter the number of Armed guards(location wise)", "textarea")), "Whether Security Guards are Armed? Please enter the number of Armed guards(location wise)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		whetherPropertyIssurroundedbyBoundaryWallsTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Property is surrounded by Boundary Walls,Perimeter Fences?If yes,please enter height and other details location wise", "textarea")), "Whether Property is surrounded by Boundary Walls,Perimeter Fences?If yes,please enter height and other details location wise", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationWiseDetailsOfEntryExitpointsForvehiclesTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location wise details of Entry/Exit points for vehicles(please enter number of points,whether manned,mode of regulation and checking,searching,etc..)", "textarea")), "Location wise details of Entry/Exit points for vehicles(please enter number of points,whether manned,mode of regulation and checking,searching,etc..)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationWiseDetailsOfEntryExitpointsForworkersTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location wise details of Entry/Exit points for workers and visitors(please enter number of points,whether manned,mode of regulation and checking,scanning,frisking etc..)", "textarea")), "Location wise details of Entry/Exit points for workers and visitors(please enter number of points,whether manned,mode of regulation and checking,scanning,frisking etc..)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		locationWiseDetailsOfWatchTowersTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Location wise details of Watch Towers,Surveillance Systems(including CCTV s etc..)", "input")), "Location wise details of Watch Towers,Surveillance Systems(including CCTV s etc..)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsofanyArmyPoliceorSecurityTextArea =new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of any Army/Police or Security Establishment Post nearby(location wise)", "textarea")), "Details of any Army/Police or Security Establishment Post nearby(location wise)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		whetherVehiclesAreParkedInsideTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether vehicles are parked inside the Insured premises?If yes,please enter whether vehicles are checked,searched", "textarea")), "Whether vehicles are parked inside the Insured premises?If yes,please enter whether vehicles are checked,searched", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsOfAnyPastIncidentsOfTerroristNaxalTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of any Past incidents of terrorist,naxal or other attacks on the Insured premises or vicinity of the Insured premises", "textarea")), "Details of any Past incidents of terrorist,naxal or other attacks on the Insured premises or vicinity of the Insured premises", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		detailsOfAnyPastCivilCommotionTextArea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of any past Civil commotion,Violent worker unrest", "textarea")), "Details of any past Civil commotion,Violent worker unrest", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillPolicyAttributeSecurityAndOthrInfoFire(SecurityAndOthrInfoEntity securityAndOthrInfoEntity, CustomAssert assertReference) throws InterruptedException{
		if(securityAndOthrInfoEntity.getAction().equalsIgnoreCase("add") || securityAndOthrInfoEntity.getAction().equalsIgnoreCase("edit")){

			//SA-Shruti
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfBusinessActivitycarried")) {
				clearAndSendKeys(detailsOfBusinessActivitycarriedTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfBusinessActivitycarried"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfSurroundingProperty")) {
				clearAndSendKeys(detailsOfSurroundingPropertyTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfSurroundingProperty"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfPipeLinesBelonging")) {
				clearAndSendKeys(detailsOfPipeLinesBelongingTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfPipeLinesBelonging"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfTransmissionDistribution")) {
				clearAndSendKeys(detailsOfTransmissionDistributionTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfTransmissionDistribution"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfSecurityAgencyListlocationWise")) {
				clearAndSendKeys(detailsOfSecurityAgencyListlocationWiseTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfSecurityAgencyListlocationWise"));
			}	
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfSecurityGuardslistlocationwise")) {
				clearAndSendKeys(detailsOfSecurityGuardslistlocationwiseTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfSecurityGuardslistlocationwise"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigWhetherSecurityGuardsAreArmed")) {
				clearAndSendKeys(whetherSecurityGuardsAreArmedTextArea, securityAndOthrInfoEntity.getStringValueForField("WhetherSecurityGuardsAreArmed"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigWhetherPropertyIssurroundedbyBoundaryWalls")) {
				clearAndSendKeys(whetherPropertyIssurroundedbyBoundaryWallsTextArea, securityAndOthrInfoEntity.getStringValueForField("WhetherPropertyIssurroundedbyBoundaryWalls"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLocationWiseDetailsOfEntryExitpointsForvehicles")) {
				clearAndSendKeys(locationWiseDetailsOfEntryExitpointsForvehiclesTextArea, securityAndOthrInfoEntity.getStringValueForField("LocationWiseDetailsOfEntryExitpointsForvehicles"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLocationWiseDetailsOfEntryExitpointsForworkers")) {
				clearAndSendKeys(locationWiseDetailsOfEntryExitpointsForworkersTextArea, securityAndOthrInfoEntity.getStringValueForField("LocationWiseDetailsOfEntryExitpointsForworkers"));
			}	
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLocationWiseDetailsOfWatchTowers")) {
				clearAndSendKeys(locationWiseDetailsOfWatchTowersTextField, securityAndOthrInfoEntity.getStringValueForField("LocationWiseDetailsOfWatchTowers"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsofanyArmyPoliceorSecurity")) {
				clearAndSendKeys(detailsofanyArmyPoliceorSecurityTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsofanyArmyPoliceorSecurity"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigWhetherVehiclesAreParkedInside")) {
				clearAndSendKeys(whetherVehiclesAreParkedInsideTextArea, securityAndOthrInfoEntity.getStringValueForField("WhetherVehiclesAreParkedInside"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfAnyPastIncidentsOfTerroristNaxal")) {
				clearAndSendKeys(detailsOfAnyPastIncidentsOfTerroristNaxalTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfAnyPastIncidentsOfTerroristNaxal"));
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfAnyPastCivilCommotion")) {
				clearAndSendKeys(detailsOfAnyPastCivilCommotionTextArea, securityAndOthrInfoEntity.getStringValueForField("DetailsOfAnyPastCivilCommotion"));
			}
		}


		else if(securityAndOthrInfoEntity.getAction().equalsIgnoreCase("verify")){
			//SA-Shruti
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigQuoteNoLabel")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("QuoteNoLabel"), fetchValueFromFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigStatusLabel")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("StatusLabel"), fetchValueFromFields(statusLabel), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigPolicyholderLabel")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("PolicyholderLabel"), fetchValueFromFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigProductLabel")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("ProductLabel"), fetchValueFromFields(productLabel), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfBusinessActivitycarried")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfBusinessActivitycarried"), fetchValueFromTextFields(detailsOfBusinessActivitycarriedTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfSurroundingProperty")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfSurroundingProperty"), fetchValueFromTextFields(detailsOfSurroundingPropertyTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfPipeLinesBelonging")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("detailsOfPipeLinesBelonging"), fetchValueFromTextFields(detailsOfPipeLinesBelongingTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfTransmissionDistribution")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfTransmissionDistribution"), fetchValueFromTextFields(detailsOfTransmissionDistributionTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfSecurityAgencyListlocationWise")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfSecurityAgencyListlocationWise"), fetchValueFromTextFields(detailsOfSecurityAgencyListlocationWiseTextArea), AssertionType.WARNING);
			}

			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfSecurityGuardslistlocationwise")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfSecurityGuardslistlocationwise"), fetchValueFromTextFields(detailsOfSecurityGuardslistlocationwiseTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigWhetherSecurityGuardsAreArmed")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("WhetherSecurityGuardsAreArmed"), fetchValueFromTextFields(whetherSecurityGuardsAreArmedTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigWhetherPropertyIssurroundedbyBoundaryWalls")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("WhetherPropertyIssurroundedbyBoundaryWalls"), fetchValueFromTextFields(whetherPropertyIssurroundedbyBoundaryWallsTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLocationWiseDetailsOfEntryExitpointsForvehicles")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("LocationWiseDetailsOfEntryExitpointsForvehicles"), fetchValueFromTextFields(locationWiseDetailsOfEntryExitpointsForvehiclesTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLocationWiseDetailsOfEntryExitpointsForworkers")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("LocationWiseDetailsOfEntryExitpointsForworkers"), fetchValueFromTextFields(locationWiseDetailsOfEntryExitpointsForworkersTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLocationWiseDetailsOfWatchTowers")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("LocationWiseDetailsOfWatchTowers"), fetchValueFromTextFields(locationWiseDetailsOfWatchTowersTextField), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsofanyArmyPoliceorSecurity")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsofanyArmyPoliceorSecurity"), fetchValueFromTextFields(detailsofanyArmyPoliceorSecurityTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigWhetherVehiclesAreParkedInside")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("WhetherVehiclesAreParkedInside"), fetchValueFromTextFields(whetherVehiclesAreParkedInsideTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfAnyPastIncidentsOfTerroristNaxal")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfAnyPastIncidentsOfTerroristNaxal"), fetchValueFromTextFields(detailsOfAnyPastIncidentsOfTerroristNaxalTextArea), AssertionType.WARNING);
			}
			if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDetailsOfAnyPastCivilCommotion")) {
				assertReference.assertEquals(securityAndOthrInfoEntity.getStringValueForField("DetailsOfAnyPastCivilCommotion"), fetchValueFromTextFields(detailsOfAnyPastCivilCommotionTextArea), AssertionType.WARNING);
			}
		}
	}
	private void navigateToPreviousAttributePage(SecurityAndOthrInfoEntity securityAndOthrInfoEntity) {
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigPreviousButton")){		
			click(previousButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttribute(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);switchToFrame("display");
			securityAndOthrInfoTitle = new PageElement(By.xpath("//div//b[contains(text(),'"+securityAndOthrInfoEntity.getStringValueForField("NextPageTitle")+"')]"), "Security And Other Information Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(securityAndOthrInfoTitle);
		}
	}
	public void navigateToPolicy(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(SecurityAndOthrInfoEntity securityAndOthrInfoEntity){
		if (securityAndOthrInfoEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			isElementDisplayed(loanTabTitle);
		}
	}
	public void fillAndSubmitPolicyAttributeSecurityAndOthrInfoFire(SecurityAndOthrInfoEntity securityAndOthrInfoEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(securityAndOthrInfoEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyAttributeSecurityAndOthrInfoFire(securityAndOthrInfoEntity, assertReference);
			clickNextButtonPolicyAttribute(securityAndOthrInfoEntity);
			navigateTobackAttributePage(securityAndOthrInfoEntity);
			navigateToPolicy(securityAndOthrInfoEntity);
			navigateToAttribute(securityAndOthrInfoEntity);
			navigateToInsuredInterest(securityAndOthrInfoEntity);
			navigateToCoverage(securityAndOthrInfoEntity);
			navigateToLoan(securityAndOthrInfoEntity);
			navigateToClientDetails(securityAndOthrInfoEntity);
			navigateToRelation(securityAndOthrInfoEntity);
			navigateToPayment(securityAndOthrInfoEntity);
			navigateToFollowup(securityAndOthrInfoEntity);
			navigateToDocument(securityAndOthrInfoEntity);
			navigateToPreviousAttributePage(securityAndOthrInfoEntity);
		}
	}
}
