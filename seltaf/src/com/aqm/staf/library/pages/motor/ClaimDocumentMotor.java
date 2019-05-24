package com.aqm.staf.library.pages.motor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.WebPage;
import com.aqm.staf.library.databin.ClaimDocumentMotorEntity;
import com.google.inject.Key;

public class ClaimDocumentMotor extends WebPage{

	private PageElement newButton;
	private PageElement renewalNoticeDocumentButton;
	private PageElement documentNameTextField;
	private PageElement templateRequiredDropDownList;
	private PageElement documentTypeDropDownList;
	private PageElement keywordTextField;
	private PageElement uploadFileButton;
	private PageElement saveButton; 
	private PageElement closeButton;

	public ClaimDocumentMotor(WebDriver driver, String pageName) {
		super(driver, pageName);
		newButton= new PageElement(By.xpath("//input[@name=('New')]"), "New", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		renewalNoticeDocumentButton= new PageElement(By.xpath("//input[@name=('RenewalNotice')]"), "Renewal Notice Document", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentNameTextField= new PageElement(By.xpath("//input[@name=('txtDocName')]"), "Document Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		templateRequiredDropDownList= new PageElement(By.xpath("//select[@name=('cboTmpltReqd')]"), "Template Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		documentTypeDropDownList= new PageElement(By.xpath("//select[@name=('cboDocType')]"), "Document Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		keywordTextField= new PageElement(By.xpath("//input[@name=('txtKeyword')]"), "Keyword", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		uploadFileButton= new PageElement(By.xpath("//input[@name=('txtUpload')]"), "Upload", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton= new PageElement(By.xpath("//input[@name=('Save')]"), "Save", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButton= new PageElement(By.xpath("//input[@name=('Close')]"), "Close", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}
	public void fillDocumentDetails(ClaimDocumentMotorEntity claimDocumentMotorEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimDocumentMotorEntity.getAction().equalsIgnoreCase("add") || claimDocumentMotorEntity.getAction().equalsIgnoreCase("edit")){
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigDocumentName")) {
				String claimDocName=RandomCodeGenerator.autoNameGenerator();
				clearAndSendKeys(documentNameTextField,claimDocName);
				claimDocumentMotorEntity.setStringValueForField("DocumentName",claimDocName );
				//clearAndSendKeys(documentNameTextField, claimDocumentMotorEntity.getStringValueForField("DocumentName"));
			}
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigTemplateRequired")) {
				selectValueFromList(templateRequiredDropDownList,claimDocumentMotorEntity.getStringValueForField("TemplateRequired"));
			}
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigDocumentType")) {
				Thread.sleep(3000);
				selectValueFromList(documentTypeDropDownList,claimDocumentMotorEntity.getStringValueForField("DocumentType"));
			}
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigKeyword")) {
				clearAndSendKeys(keywordTextField, claimDocumentMotorEntity.getStringValueForField("Keyword"));
			}
		}
		else if(claimDocumentMotorEntity.getAction().equalsIgnoreCase("verify")){
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigDocumentName")) {
				assertReference.assertEquals(claimDocumentMotorEntity.getStringValueForField("DocumentName"), fetchValueFromTextFields(documentNameTextField), AssertionType.WARNING);
			}
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigTemplateRequired")) {
				assertReference.assertEquals(claimDocumentMotorEntity.getStringValueForField("TemplateRequired"), fetchValueFromList(templateRequiredDropDownList), AssertionType.WARNING);
			}
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigDocumentType")) {
				assertReference.assertEquals(claimDocumentMotorEntity.getStringValueForField("DocumentType"), fetchValueFromList(documentTypeDropDownList), AssertionType.WARNING);
			}
			if (claimDocumentMotorEntity.getBooleanValueForField("ConfigKeyword")) {
				assertReference.assertEquals(claimDocumentMotorEntity.getStringValueForField("Keyword"), fetchValueFromTextFields(keywordTextField), AssertionType.WARNING);
			}
		}
	}
	public void clickOnNewButton(ClaimDocumentMotorEntity claimDocumentMotorEntity)  {
		if (claimDocumentMotorEntity.getBooleanValueForField("ConfigNew")){			
			click(newButton);
		}
	}
	public void clickOnRenewalNoticeButtonButton(ClaimDocumentMotorEntity claimDocumentMotorEntity)  {
		if (claimDocumentMotorEntity.getBooleanValueForField("ConfigRenewalNotice")){			
			click(renewalNoticeDocumentButton);
		}
	}
	public void clickOnUploadFileButtonButton(ClaimDocumentMotorEntity claimDocumentMotorEntity) throws IOException, InterruptedException, AWTException  {
		if (claimDocumentMotorEntity.getBooleanValueForField("ConfigUploadFile")){
			Thread.sleep(2000);
			doubleClick(uploadFileButton);
			//click(uploadFileButton);
			Thread.sleep(7000);
			//For Chrome Browser
			//Runtime.getRuntime().exec("D:\\NIATestAutomation\\AutoIT\\TestAuto.exe");
			//Thread.sleep(2000);
		  //  System.out.println("File Uploded Successfully");
		    
		    /*//For IE Browser
			WebElement path =driver.findElement(By.name("txtUpload"));
			path.sendKeys("‪D:\\NIATestAutomation\\AutoIT");
			path.sendKeys("axis.pdf");
			path.sendKeys(Keys.ENTER);*/
		    
		    ClipboardOwner owner=null;
		    String claim=("D:\\NIATestAutomation\\AutoIT\\TestAuto.exe");
		    Robot r= new Robot();
		    StringSelection Attachment_path=new StringSelection(claim);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Attachment_path, owner);
		    r.setAutoDelay(5000);
		    r.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		    Thread.sleep(5000);
		    r.keyPress(java.awt.event.KeyEvent.VK_V);
		    Thread.sleep(5000);
		    r.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		    r.setAutoDelay(5000);
		    r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		    Thread.sleep(5000);
		    r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		    
		    
		}
	}
	public void clickOnSaveButton(ClaimDocumentMotorEntity claimDocumentMotorEntity) throws InterruptedException  {
		if (claimDocumentMotorEntity.getBooleanValueForField("ConfigSave")){			
			click(saveButton);
			Thread.sleep(3000);
		}
	}
	
	public void clickOnCloseButton(ClaimDocumentMotorEntity claimDocumentMotorEntity)  {
		if (claimDocumentMotorEntity.getBooleanValueForField("ConfigClose")){			
			click(closeButton);
		}
	}
	public void fillandSubmitClaimDocumentsMotorDetails(ClaimDocumentMotorEntity claimDocumentMotorEntity, CustomAssert assertReference) throws InterruptedException, IOException, AWTException {
		if(isConfigTrue(claimDocumentMotorEntity.getConfigExecute())){
			clickOnNewButton(claimDocumentMotorEntity);
			clickOnRenewalNoticeButtonButton(claimDocumentMotorEntity);
			fillDocumentDetails(claimDocumentMotorEntity, assertReference);
			clickOnUploadFileButtonButton(claimDocumentMotorEntity);
			clickOnSaveButton(claimDocumentMotorEntity);
			clickOnCloseButton(claimDocumentMotorEntity);

		}
	}
}