package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccDepartmentForScrollEntity;
import com.aqm.staf.library.databin.AccoScrollEntryEntity;
import com.aqm.staf.library.databin.AccountngCollectnSearcEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;

public class AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll
extends BasePage {
	private PageElement departmentForScrollPageTitle;
	private PageElement departmentDropdown;
	private PageElement productCodeDropdown;
	private PageElement engineNoTextField;
	private PageElement chasisNoTextField;
	private PageElement newVehicleDropdown;
	private PageElement vehicleNumber1TextField;
	private PageElement vehicleNumber2TextField;
	private PageElement vehicleNumber3TextField;
	private PageElement vehicleNumber4TextField;
	
	private PageElement saveButton;
	private PageElement addButton;
	private PageElement deleteButton;
	private PageElement backButton;
	private PageElement scrollEntryScreenPageTitle;
	private PageElement scrollNumberTextField;
	public AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll(
			WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		departmentForScrollPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Department for Scroll')]"),"Department For Scroll Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table - Enter Scroll Specific Department(s)//
		departmentDropdown = new PageElement(By.name("pDepartment"+rowcount+""), "Department Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineNoTextField =  new PageElement(By.name("pEngineNo0"), "Engine No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chasisNoTextField = new PageElement(By.name("pChassisNo0"), "Chasis No TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		newVehicleDropdown = new PageElement(By.name("pNewVehicle0"), "New Vehicle Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vehicleNumber1TextField = new PageElement(By.name("pVehicleNo0"), "Vehicle Number 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleNumber2TextField = new PageElement(By.name("pVehicleNoII0"), "Vehicle Number 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleNumber3TextField = new PageElement(By.name("pVehicleNoIII0"), "Vehicle Number 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vehicleNumber4TextField = new PageElement(By.name("pVehicleNoIV0"), "Vehicle Number 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		saveButton = new PageElement(By.name("Save"),"Save Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		addButton = new PageElement(By.name("btnAdd"),"Add Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton = new PageElement(By.name("btnDelete"),"Delete Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		scrollEntryScreenPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scroll Entry Screen')]"), "Scroll Entry Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		scrollNumberTextField=new PageElement(By.name("pScrollNumber"), "Scroll Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productCodeDropdown= new PageElement(By.name("pProductCode0"), "New Vehicle Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}
	//TABLE - Enter Scroll Specific Department(s)//

	public void fillAccountingScrollDepartmentDetails(AccoScrollEntryEntity accoScrollEntryEntity, CustomAssert assertReference) throws InterruptedException{

		if(accoScrollEntryEntity.getAction().equalsIgnoreCase("add")||accoScrollEntryEntity.getAction().equalsIgnoreCase("edit")){
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigDepartmentDropdown")) {
				selectValueFromList(departmentDropdown, accoScrollEntryEntity.getStringValueForField("DepartmentDropdown"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigProductCode")) {
				selectValueFromList(productCodeDropdown, accoScrollEntryEntity.getStringValueForField("ProductCode"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigEngineNo")) {
				clearAndSendKeys(engineNoTextField, accoScrollEntryEntity.getStringValueForField("EngineNo"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChasisNo")) {
				clearAndSendKeys(chasisNoTextField, accoScrollEntryEntity.getStringValueForField("ChasisNo"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigNewVehicleDropdown")) {
				selectValueFromList(newVehicleDropdown, accoScrollEntryEntity.getStringValueForField("NewVehicleDropdown"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo1")) {
				clearAndSendKeys(vehicleNumber1TextField, accoScrollEntryEntity.getStringValueForField("VehicleNo1"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo2")) {
				clearAndSendKeys(vehicleNumber2TextField, accoScrollEntryEntity.getStringValueForField("VehicleNo2"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo3")) {
				clearAndSendKeys(vehicleNumber3TextField, accoScrollEntryEntity.getStringValueForField("VehicleNo3"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo4")) {
				clearAndSendKeys(vehicleNumber4TextField, accoScrollEntryEntity.getStringValueForField("VehicleNo4"));
			}
		}
		else if(accoScrollEntryEntity.getAction().equalsIgnoreCase("verify")){
			AccDepartmentForScrollEntity actualAccDepartmentForScrollEntity=new AccDepartmentForScrollEntity();

			if (accoScrollEntryEntity.getBooleanValueForField("ConfigDepartmentDropdown")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("DepartmentDropdown", fetchValueFromList(departmentDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("DepartmentDropdown"),actualAccDepartmentForScrollEntity.getStringValueForField("DepartmentDropdown"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigProductCode")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("ProductCode", fetchValueFromList(productCodeDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ProductCode"),actualAccDepartmentForScrollEntity.getStringValueForField("DepartmentDropdown"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigEngineNo")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("EngineNo", fetchValueFromTextFields(engineNoTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("EngineNo"),actualAccDepartmentForScrollEntity.getStringValueForField("EngineNo"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChasisNo")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("ChasisNo", fetchValueFromTextFields(chasisNoTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ChasisNo"),actualAccDepartmentForScrollEntity.getStringValueForField("ChasisNo"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigNewVehicleDropdown")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("NewVehicleDropdown", fetchValueFromList(newVehicleDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("NewVehicleDropdown"),actualAccDepartmentForScrollEntity.getStringValueForField("NewVehicleDropdown"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo1")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("VehicleNo1", fetchValueFromTextFields(vehicleNumber1TextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("VehicleNo1"),actualAccDepartmentForScrollEntity.getStringValueForField("VehicleNo1"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo2")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("VehicleNo2", fetchValueFromTextFields(vehicleNumber2TextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("VehicleNo2"),actualAccDepartmentForScrollEntity.getStringValueForField("VehicleNo2"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo3")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("VehicleNo3", fetchValueFromTextFields(vehicleNumber3TextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("VehicleNo3"),actualAccDepartmentForScrollEntity.getStringValueForField("VehicleNo3"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigVehicleNo4")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("VehicleNo4", fetchValueFromTextFields(vehicleNumber4TextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("VehicleNo4"),actualAccDepartmentForScrollEntity.getStringValueForField("VehicleNo4"), AssertionType.WARNING);
			}
		}
	}

	public void submitAccountingMaintainScrollDepartmentForScrollDetails(AccoScrollEntryEntity accoScrollEntryEntity) {
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			isElementDisplayed(scrollEntryScreenPageTitle);
			switchToFrame("display");
			accoScrollEntryEntity.setStringValueForField("ScrollNumber", fetchValueFromTextFields(scrollNumberTextField));

		}
	}
	public void addAccountingMaintainScrollDepartmentForScrollDetails(AccoScrollEntryEntity accoScrollEntryEntity) {
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
	}
	public void deleteFromAccountingMaintainScrollDepartmentForScroll(AccoScrollEntryEntity accoScrollEntryEntity) {
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	//Only Buttons and Table//
	public void fillAndSubmitAccountingMaintainScrollDepartmentForScroll(AccoScrollEntryEntity accoScrollEntryEntity , CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillAccountingScrollDepartmentDetails(accoScrollEntryEntity,assertReference);
		submitAccountingMaintainScrollDepartmentForScrollDetails(accoScrollEntryEntity);
		addAccountingMaintainScrollDepartmentForScrollDetails(accoScrollEntryEntity);
		deleteFromAccountingMaintainScrollDepartmentForScroll(accoScrollEntryEntity);

	}
}

