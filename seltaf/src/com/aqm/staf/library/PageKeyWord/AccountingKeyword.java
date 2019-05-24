package com.aqm.staf.library.PageKeyWord;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.AccChequeDishonourEntity;
import com.aqm.staf.library.databin.AccDepartmentForScrollEntity;
import com.aqm.staf.library.databin.AccMaintainTransactionEntity;
import com.aqm.staf.library.databin.AccScrollSearchEntity;
import com.aqm.staf.library.databin.AccoScrollEntryEntity;
import com.aqm.staf.library.databin.AccountDistributionEntity;
import com.aqm.staf.library.databin.AccountingAccDetailsEntity;
import com.aqm.staf.library.databin.AccountingAccSearchEntity;
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.AccountingEntity;
import com.aqm.staf.library.databin.AccountngCollectnSearcEntity;
import com.aqm.staf.library.databin.AcctCoinsuranceVoucherEntity;
import com.aqm.staf.library.databin.ClonePolicySchemeEntity;
import com.aqm.staf.library.databin.CreditingDebitingAccTable;
import com.aqm.staf.library.databin.DebitCreditNoteEntity;
import com.aqm.staf.library.databin.ForeignExchangeDetailEntity;
import com.aqm.staf.library.databin.InstrumentDetailsEntity;
import com.aqm.staf.library.databin.PolInsIntAttCarDetMCEntity;
import com.aqm.staf.library.databin.PolTransferToAPEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;
import com.aqm.staf.library.pages.common.AccountingAccountDetails;
import com.aqm.staf.library.pages.common.AccountingAccountSearchPage;
import com.aqm.staf.library.pages.common.AccountingAccountingDistributionPage;
import com.aqm.staf.library.pages.common.AccountingAccountingTransactionDetailsPage;
import com.aqm.staf.library.pages.common.AccountingAccountingTransactionSearchPage;
import com.aqm.staf.library.pages.common.AccountingBankGuaranteeMasterCreationScreenPage;
import com.aqm.staf.library.pages.common.AccountingBankGuranteeCashDepositSearchPage;
import com.aqm.staf.library.pages.common.AccountingChequeDishonour;
import com.aqm.staf.library.pages.common.AccountingCoinsuranceVoucherConsolidationPage;
import com.aqm.staf.library.pages.common.AccountingCollectionSearchCollection;
import com.aqm.staf.library.pages.common.AccountingDebitCreditNoteDetailsPage;
import com.aqm.staf.library.pages.common.AccountingDebitCreditNoteSearchPage;
import com.aqm.staf.library.pages.common.AccountingExchangeRateForeignExchangeDetail;
import com.aqm.staf.library.pages.common.AccountingExchangeRateForeignExchangeRatePage;
import com.aqm.staf.library.pages.common.AccountingFrontPage;
import com.aqm.staf.library.pages.common.AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll;
import com.aqm.staf.library.pages.common.AccountingScrollEntryScreenPage;
import com.aqm.staf.library.pages.common.AccountingScrollSearchPage;
import com.aqm.staf.library.pages.common.MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage;
import com.aqm.staf.library.pages.common.MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage;
//import com.aqm.staf.library.pages.common.AccountingTransactionSearchPage;
import com.aqm.staf.library.pages.common.PolicyPremiumCollectionPage;

public class AccountingKeyword extends FunctionalKeywords {
	private static  String keyword;
	private static 	String configData;
	private static String stepGroup;

	public void createAccounting(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		List<AccountingEntity> accountingEntityList=testData.getAccountingEntityRecords();
		for(AccountingEntity accountingEntity:accountingEntityList)
		{
			if(accountingEntity.getAction().equalsIgnoreCase("add") && accountingEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				AccountingFrontPage accountingFrontPage=new AccountingFrontPage(driver, "Company Selection");
				accountingFrontPage.navigateToAccountingFrontPage();
				accountingFrontPage.fillandSubmitAccountingFrontPage(accountingEntity, assertReference);
				if(isConfigTrue(accountingEntity.getConfigExecute())){
					maintainScrollCreateHelper(testData, executionTestStep, assertReference, driver, stepGroup, accountingEntity);

				}

			}
		}
	}

	public void  editAccounting(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		List<AccountingEntity> accountingEntityList=testData.getAccountingEntityRecords();
		for(AccountingEntity accountingEntity:accountingEntityList){
			if(accountingEntity.getAction().equalsIgnoreCase("edit") && accountingEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				AccountingFrontPage accountingFrontPage=new AccountingFrontPage(driver, "Company Selection");
				accountingFrontPage.navigateToAccountingFrontPage();
				accountingFrontPage.fillandSubmitAccountingFrontPage(accountingEntity, assertReference);

				if(accountingEntity.getBooleanValueForField("ConfigMaintainTrasactionType")){
					maintainTrasactionTypeEditHelper(testData, executionTestStep, assertReference, driver,stepGroup);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainGLSLAccount")){
					maintainGLSLAccountEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainTxnRule")){
					maintainTxnRuleEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainTrasaction")){
					maintainTrasactionEditHelper(testData, executionTestStep, assertReference, driver,stepGroup);
				}
				if(accountingEntity.getBooleanValueForField("ConfigExchangeRate")){
					exchangeRateEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigDebitCreditNotes")){
					debitCreditNotesEditHelper(testData, executionTestStep, assertReference, driver,stepGroup);
				}
				if(accountingEntity.getBooleanValueForField("ConfigCollection")){
					collectionEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainBGCD")){
					maintainBGCDEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainScroll")){
					maintainScrollCreateHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);

				}
				if(accountingEntity.getBooleanValueForField("ConfigChequeDishonour")){
					chequeDishonourEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigCoinsuranceVoucherConsolidation")){
					coinsuranceVoucherConsolidationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
			}
		}
	}

	public void verifyAccounting(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		List<AccountingEntity> accountingEntityList=testData.getAccountingEntityRecords();
		for(AccountingEntity accountingEntity:accountingEntityList){
			if(accountingEntity.getAction().equalsIgnoreCase("verify") && accountingEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				AccountingFrontPage accountingFrontPage=new AccountingFrontPage(driver, "Company Selection");
				accountingFrontPage.navigateToAccountingFrontPage();
				accountingFrontPage.fillandSubmitAccountingFrontPage(accountingEntity, assertReference);

				/*accountingFrontPage.navigateToAccountingFrontPage();
				accountingFrontPage.clickOnProceedButton(accountingEntity);
				accountingFrontPage.navigateToMaintainTrasactionType(accountingEntity);
				accountingFrontPage.navigateToMaintainGLSLAccountLink(accountingEntity);
				accountingFrontPage.navigateTomaintainTxnRuleLink(accountingEntity);
				accountingFrontPage.navigateToExchangeRateLink(accountingEntity);
				accountingFrontPage.navigateToDebitCreditNotesLink(accountingEntity);
				accountingFrontPage.navigateToCollectionLink(accountingEntity);
				accountingFrontPage.navigateToMaintainBGCDLink(accountingEntity);
				accountingFrontPage.navigateToChequeDishonourLink(accountingEntity);
				accountingFrontPage.navigateToCoinsuranceVoucherConsolidationLink(accountingEntity);
				accountingFrontPage.navigateTohelpLink(accountingEntity);*/


				/*if(accountingEntity.getBooleanValueForField("ConfigMaintainTrasactionType")){
					maintainTrasactionTypeVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup);
				}*/
				if(accountingEntity.getBooleanValueForField("ConfigMaintainGLSLAccount")){
					maintainGLSLAccountVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainTxnRule")){
					maintainTxnRuleVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainTrasaction")){
					maintainTrasactionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup);
				}
				if(accountingEntity.getBooleanValueForField("ConfigExchangeRate")){
					exchangeRateVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigDebitCreditNotes")){
					debitCreditNotesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup);
				}
				if(accountingEntity.getBooleanValueForField("ConfigCollection")){
					collectionVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainBGCD")){
					maintainBGCDVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
				if(accountingEntity.getBooleanValueForField("ConfigMaintainScroll")){
					maintainScrollVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, accountingEntity);
				}
			}
		}
	}


	public void maintainTrasactionTypeEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup){
		// Not Applicable
	}

	public void maintainGLSLAccountEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccountingAccSearchEntity> accountingAccSeachEntityList = testData.getaccountingAccSearchEntityRecords();
		for(AccountingAccSearchEntity accountingAccSearchEntityData : accountingAccSeachEntityList ){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingAccSearchEntityData.getParentKey())){
				if((accountingAccSearchEntityData.getAction().equalsIgnoreCase("add")||accountingAccSearchEntityData.getAction().equalsIgnoreCase("edit")) && accountingAccSearchEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingAccountSearchPage accountingAccountSearchPage=new AccountingAccountSearchPage(driver, "Account Search");
					accountingAccountSearchPage.navigateToMaintainGLSLAccountLink(accountingAccSearchEntityData);
					accountingAccountSearchPage.fillandSearchAccountDetails(accountingAccSearchEntityData);
					accountingAccountSearchPage.selectSearchGLCodeNo(accountingAccSearchEntityData);
					AccountingAccountDetails accountingAccountDetails=new AccountingAccountDetails(driver, "Account Details");
					accountingAccountDetails.fillandsubmitAccountDetails(accountingAccSearchEntityData, assertReference);
					accountingAccountDetails.navigateToBackButton(accountingAccSearchEntityData);
				}
			}
		}

	}

	public void maintainTxnRuleEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		// Not Applicable
	}
	public void maintainTrasactionEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		List<AccMaintainTransactionEntity> accountingTransactionDetailsList=testData.getAccountingMaintainTransactionDetailsRecords();
		for(AccMaintainTransactionEntity accountingTransactionDetailsData:accountingTransactionDetailsList){
			if((accountingTransactionDetailsData.getAction().equalsIgnoreCase("add") || accountingTransactionDetailsData.getAction().equalsIgnoreCase("edit")) && accountingTransactionDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
				AccountingAccountingTransactionSearchPage accountingTransactionSearchPage= new AccountingAccountingTransactionSearchPage(driver, "Accounting Transaction Search");
				accountingTransactionSearchPage.fillAndSearchAccountingTransactionDetails(accountingTransactionDetailsData);
				if(accountingTransactionDetailsData.getBooleanValueForField("ConfigNewButton")){
					AccountingAccountingTransactionDetailsPage accountingAccountingTransactionDetailsPage=new AccountingAccountingTransactionDetailsPage(driver, "Accounting Transaction Details");
					accountingAccountingTransactionDetailsPage.fillandSubmitAccountingTransactionDetails(accountingTransactionDetailsData, assertReference);
					/**********Accounting Distribution Page**************/
					List<AccountDistributionEntity> accountDistributionEntityList=testData.getAccountDistributionEntityRecords();
					int rowcount=1;
					for(AccountDistributionEntity accountDistributionEntityListData:accountDistributionEntityList){
						if(accountDistributionEntityListData.getAction().equalsIgnoreCase("edit") && accountDistributionEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
							AccountingAccountingDistributionPage accountingAccountingDistributionPage =new AccountingAccountingDistributionPage(driver, "Accounting Distribution",rowcount);
							accountingAccountingDistributionPage.fillandSubmitAccountingDistributionDetails(accountDistributionEntityListData, assertReference,testData);
							testData.updateRecordsForCriteria(accountDistributionEntityListData);
							rowcount++;
							setDependencyForReferenceNumber(accountDistributionEntityListData, testData);
						}
					}
				}
				//Abhijit
				if(accountingTransactionDetailsData.getBooleanValueForField("ConfigSearchVoucherNumber")){
					AccountingAccountingTransactionDetailsPage accountingAccountingTransactionDetailsPage=new AccountingAccountingTransactionDetailsPage(driver, "Accounting Transaction Details");
					accountingAccountingTransactionDetailsPage.fillandSubmitAccountingTransactionDetails(accountingTransactionDetailsData, assertReference);
					List<AccountDistributionEntity> accountDistributionEntityList=testData.getAccountDistributionEntityRecords();
					int rowcount=1;
					for(AccountDistributionEntity accountDistributionEntityListData:accountDistributionEntityList){
						if(accountDistributionEntityListData.getAction().equalsIgnoreCase("edit") && accountDistributionEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
							AccountingAccountingDistributionPage accountingAccountingDistributionPage =new AccountingAccountingDistributionPage(driver, "Accounting Distribution",rowcount);
							accountingAccountingDistributionPage.fillandSubmitAccountingDistributionDetails(accountDistributionEntityListData, assertReference,testData);
							testData.updateRecordsForCriteria(accountDistributionEntityListData);
							setDependencyGLDescriptionCode(accountDistributionEntityListData,testData);
							rowcount++;
							if(accountDistributionEntityListData.getBooleanValueForField("ConfigInstrumentDetailTab")){
								List<InstrumentDetailsEntity> instrumentDetailsEntityList=testData.getInstrumentDetailsEntity();
								for(InstrumentDetailsEntity instrumentDetailsEntityListData:instrumentDetailsEntityList){
									if(instrumentDetailsEntityListData.getAction().equalsIgnoreCase("edit") && instrumentDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage maintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage =new MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage(driver, "Maintain Transaction Accounting Transaction Search Accounting Transaction Details InstrumentList Page");
										maintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentListPage.fillAndSubmitInstrumentListDetails(instrumentDetailsEntityListData, assertReference);
										MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage maintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage =new MaintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage(driver, "Maintain TransactionAccounting Transaction Search Accounting Transaction Details InstrumentDetailsPage");
										maintainTransactionAccountingTransactionSearchAccountingTransactionDetailsInstrumentDetailsPage.fillAndSubmitInstrumentDetails(instrumentDetailsEntityListData, assertReference);
									}
								}
							}
						}
					}
				}
			}
		}

	}



	public void exchangeRateEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<ForeignExchangeDetailEntity> foreignExchangeDetailEntityList=testData.getForeignExchangeDetailEntity();
		for(ForeignExchangeDetailEntity foreignExchangeDetailEntity:foreignExchangeDetailEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if(foreignExchangeDetailEntity.getAction().equalsIgnoreCase("add") || foreignExchangeDetailEntity.getAction().equalsIgnoreCase("edit") && foreignExchangeDetailEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingExchangeRateForeignExchangeRatePage accountingExchangeRateForeignExchangeRatePage=new AccountingExchangeRateForeignExchangeRatePage(driver, "Foreign Exchange Rate");
					accountingExchangeRateForeignExchangeRatePage.navigateToCreateForeignExchangeDetail(foreignExchangeDetailEntity);
					AccountingExchangeRateForeignExchangeDetail accountingExchangeRateForeignExchangeDetail =new AccountingExchangeRateForeignExchangeDetail(driver, "Foreign Exchange Detail");
					accountingExchangeRateForeignExchangeDetail.fillAndSubmitForeignExchangeDetail(foreignExchangeDetailEntity, assertReference);

				}
			}
		}
	}

	public void debitCreditNotesEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		//
	}

	public void collectionEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccountngCollectnSearcEntity> accountngCollectnSearcEntityList=testData.getAccountngCollectnSearcEntity();
		for(AccountngCollectnSearcEntity accountngCollectnSearcEntityListData:accountngCollectnSearcEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if(accountngCollectnSearcEntityListData.getAction().equalsIgnoreCase("add")|| accountngCollectnSearcEntityListData.getAction().equalsIgnoreCase("edit") && accountngCollectnSearcEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingCollectionSearchCollection accountingCollectionSearchCollection=new AccountingCollectionSearchCollection(driver, "Search Collection");
					accountingCollectionSearchCollection.navigateToCollectionCumAdjustmentPage(accountngCollectnSearcEntityListData);
					if(accountngCollectnSearcEntityListData.getBooleanValueForField("ConfigNewButton")){
						List<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getPolicyPremCollectionEntityRecords();
						int rowcount=0;
						for(PolicyPremCollectionEntity policyPremCollectionEntitydata:policyPremCollectionEntityList){
							if(accountingEntity.getParentKey().equalsIgnoreCase(policyPremCollectionEntitydata.getParentKey())){
								if((policyPremCollectionEntitydata.getAction().equalsIgnoreCase("add") || policyPremCollectionEntitydata.getAction().equalsIgnoreCase("edit"))&& policyPremCollectionEntitydata.getStepGroup().equalsIgnoreCase(stepGroup)){
									PolicyPremiumCollectionPage policyPremiumCollectionPage=new PolicyPremiumCollectionPage(driver, "Policy Premium Collection page",rowcount);
									policyPremiumCollectionPage.fillandSubmitPolicyCollectionDetails(policyPremCollectionEntitydata, assertReference,rowcount);
									testData.updateRecordsForCriteria(policyPremCollectionEntitydata);
									rowcount++;
								}
								testData.updateRecordsForCriteria(policyPremCollectionEntitydata);
								setDependencyCollectionNumber(policyPremCollectionEntitydata, testData);
							}
						}
					}
				}
			}
		}
	}

	public void setDependencyCollectionNumber(PolicyPremCollectionEntity policyPremCollectionEntity,ScenarioTestData testData){
		if(policyPremCollectionEntity.getStringValueForField("DependencyForCollectionNumber")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(),policyPremCollectionEntity.getStringValueForField("DependencyForCollectionNumber"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
				policyPremCollectionEntityData.setStringValueForField("CollectionNumber", policyPremCollectionEntityData.getStringValueForField("policyPremCollectionEntityData"));
			}
		}
		//@PKP
		if(policyPremCollectionEntity.getStringValueForField("DependencyForAccountingCollectionSearch")!=null){
			ArrayList<AccountngCollectnSearcEntity> accountingCollectionSearchCollectionList=testData.getObjectByReference(testData.getAccountngCollectnSearcEntity(),policyPremCollectionEntity.getStringValueForField("DependencyForAccountingCollectionSearch"));
			for(AccountngCollectnSearcEntity accountngCollectnSearcEntityData:accountingCollectionSearchCollectionList){
				accountngCollectnSearcEntityData.setStringValueForField("CollectionNo", policyPremCollectionEntity.getStringValueForField("CollectionNumber"));
				testData.updateRecordsForCriteria(accountngCollectnSearcEntityData);
			}
		}
	}

	public void maintainBGCDEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccountingBGOrCDSearchEntity> acountingBGOrCDSearchEntityList=testData.getAccountingBGOrCDSearchEntity();
		for(AccountingBGOrCDSearchEntity acountingBGOrCDSearchEntityListData:acountingBGOrCDSearchEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(acountingBGOrCDSearchEntityListData.getChildKey())){
				if((acountingBGOrCDSearchEntityListData.getAction().equalsIgnoreCase("add") || acountingBGOrCDSearchEntityListData.getAction().equalsIgnoreCase("edit")) &&  acountingBGOrCDSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingBankGuranteeCashDepositSearchPage accountingBankGuranteeCashDepositSearchPage =new AccountingBankGuranteeCashDepositSearchPage(driver, "Bank Gurantee/Cash Deposit Search");
					accountingBankGuranteeCashDepositSearchPage.fillAndSearchAccountingBGOrCdDetails(acountingBGOrCDSearchEntityListData);
					if(acountingBGOrCDSearchEntityListData.getBooleanValueForField("ConfigNewButton")){
						AccountingBankGuaranteeMasterCreationScreenPage accountingBankGuaranteeMasterCreationScreenPage=new AccountingBankGuaranteeMasterCreationScreenPage(driver,"Bank Guarantee Master Creation Screen");
						accountingBankGuaranteeMasterCreationScreenPage.fillAndSubmitCourtMasterForAllProductDetails(acountingBGOrCDSearchEntityListData, assertReference);
						testData.updateRecordsForCriteria(acountingBGOrCDSearchEntityListData);	
						setDependencyForCDAccountNumber(acountingBGOrCDSearchEntityListData, testData);
					}
				}
			}
		}
	}

	public void maintainScrollCreateHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccScrollSearchEntity> accScrollSearchEntityList=testData.getAccScrollSearchEntities();
		for(AccScrollSearchEntity accScrollSearchEntityListData:accScrollSearchEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accScrollSearchEntityListData.getChildKey())){
				if(accScrollSearchEntityListData.getAction().equalsIgnoreCase("add") || accScrollSearchEntityListData.getAction().equalsIgnoreCase("edit") && accScrollSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingScrollSearchPage accountingScrollSearchPage=new AccountingScrollSearchPage(driver, "Scroll Search");
					accountingScrollSearchPage.fillAndSubmitAccountingScrollSearchDetails(accScrollSearchEntityListData, assertReference);
					if (accScrollSearchEntityListData.getBooleanValueForField("ConfigNextButton")) {
						List<AccoScrollEntryEntity> accoScrollEntryEntityList=testData.getAccoScrollEntryEntities();
						int rowcount=0;
						for(AccoScrollEntryEntity accoScrollEntryEntityListData:accoScrollEntryEntityList){
							if(accountingEntity.getParentKey().equalsIgnoreCase(accoScrollEntryEntityListData.getChildKey())){
								if(accoScrollEntryEntityListData.getAction().equalsIgnoreCase("add") || accScrollSearchEntityListData.getAction().equalsIgnoreCase("edit")&& accoScrollEntryEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									AccountingScrollEntryScreenPage accountingScrollEntryScreenPage=new AccountingScrollEntryScreenPage(driver, "Scroll Entry Screen");
									accountingScrollEntryScreenPage.fillAndSubmitAccountingScrollEntryScreenDetails(accoScrollEntryEntityListData, assertReference);
									testData.updateRecordsForCriteria(accoScrollEntryEntityListData);
									if (accoScrollEntryEntityListData.getBooleanValueForField("ConfigForwardButton")) {
										if(accountingEntity.getParentKey().equalsIgnoreCase(accoScrollEntryEntityListData.getChildKey())){
											AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll accountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll =new AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll(driver, "Department for Scroll",rowcount);
											accountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll.fillAndSubmitAccountingMaintainScrollDepartmentForScroll(accoScrollEntryEntityListData, assertReference);
											testData.updateRecordsForCriteria(accoScrollEntryEntityListData);
											rowcount=++rowcount;
										}

									}
									setDependencyForScroll(accoScrollEntryEntityListData,testData);
								}

							}
						}

					}
				}
			}
		}
	}


	public void chequeDishonourEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccChequeDishonourEntity> accChequeDishonourEntityList=testData.getaccChequeDishonourEntityRecords();
		for(AccChequeDishonourEntity accChequeDishonourEntityListData:accChequeDishonourEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if((accChequeDishonourEntityListData.getAction().equalsIgnoreCase("add") || accChequeDishonourEntityListData.getAction().equalsIgnoreCase("edit")) && accChequeDishonourEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingChequeDishonour accountingChequeDishonour =new AccountingChequeDishonour(driver, "Cheque Dishonour");
					accountingChequeDishonour.fillandSubmitAccountDetails(accChequeDishonourEntityListData, assertReference);
				}
			}
		}
	}

	public void coinsuranceVoucherConsolidationEditHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity){
		List<AcctCoinsuranceVoucherEntity> acctCoinsuranceVoucherEntityList=testData.getAcctCoinsuranceVoucherEntity();
		for(AcctCoinsuranceVoucherEntity acctCoinsuranceVoucherEntityListData:acctCoinsuranceVoucherEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if(acctCoinsuranceVoucherEntityListData.getAction().equalsIgnoreCase("add") || acctCoinsuranceVoucherEntityListData.getAction().equalsIgnoreCase("edit") && acctCoinsuranceVoucherEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					if(acctCoinsuranceVoucherEntityListData.getStringValueForField("SelectEventCode").equalsIgnoreCase("NewRequest") || acctCoinsuranceVoucherEntityListData.getStringValueForField("SelectEventCode").equalsIgnoreCase("RequestSearch")){
						AccountingCoinsuranceVoucherConsolidationPage accountingCoinsuranceVoucherConsolidationPage=new AccountingCoinsuranceVoucherConsolidationPage(driver, "Coinsurance Voucher Consolidation");
						accountingCoinsuranceVoucherConsolidationPage.fillCoinsuranceVoucherConsoDetails(acctCoinsuranceVoucherEntityListData, assertReference);
					}
				}
			}
		}
	}
	/**************************************verify***********************************************/ 

	/************* not applicable*************/
	public void maintainTrasactionTypeVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{

		//Not applicable
	}
	/******************Accounting GL SL verify *******************/
	public void maintainGLSLAccountVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: maintainGLSLAccountVerifyHelper </i></B>");
		List<AccountingAccSearchEntity> accountingAccSeachEntityList=testData.getaccountingAccSearchEntityRecords();
		for(AccountingAccSearchEntity accountingAccSearchEntityData : accountingAccSeachEntityList ){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingAccSearchEntityData.getParentKey())){
				if((accountingAccSearchEntityData.getAction().equalsIgnoreCase("verify") && accountingAccSearchEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
					AccountingAccountSearchPage accountingAccountSearchPage=new AccountingAccountSearchPage(driver, "Account Search");
					accountingAccountSearchPage.navigateToMaintainGLSLAccountLink(accountingAccSearchEntityData);
					accountingAccountSearchPage.fillandSearchAccountDetails(accountingAccSearchEntityData);
					accountingAccountSearchPage.selectSearchGLCodeNo(accountingAccSearchEntityData);
					AccountingAccountDetails accountingAccountDetails=new AccountingAccountDetails(driver, "Account Details");
					accountingAccountDetails.fillandsubmitAccountDetails(accountingAccSearchEntityData, assertReference);
					accountingAccountDetails.navigateToBackButton(accountingAccSearchEntityData);
				}
			}
		}
	}
	/********* Not applicable *************/
	public void maintainTxnRuleVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{

		//Not applicable
	}
	/******************MaintainTrasactionVerifyHelper
	 * @throws Exception ****************/

	public void maintainTrasactionVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		FrameworkServices.logMessage("<B><i> Executing:: maintainTrasactionVerifyHelper </i></B>");
		int rowcount=1;
		/**********Accounting Transaction Details Page**************/
		List<AccMaintainTransactionEntity> accountingTransactionDetailsList=testData.getAccountingMaintainTransactionDetailsRecords();
		for(AccMaintainTransactionEntity accountingTransactionDetailsListData:accountingTransactionDetailsList){

			if(accountingTransactionDetailsListData.getAction().equalsIgnoreCase("verify") && accountingTransactionDetailsListData.getStepGroup().equalsIgnoreCase(stepGroup)){
				AccountingAccountingTransactionDetailsPage accountingAccountingTransactionDetailsPage=new AccountingAccountingTransactionDetailsPage(driver, "Accounting Transaction Details");
				AccountingAccountingTransactionSearchPage accountingTransactionSearchPage= new AccountingAccountingTransactionSearchPage(driver, "Accounting Transaction Search");
 				accountingTransactionSearchPage.fillAndSearchAccountingTransactionDetails(accountingTransactionDetailsListData);
				accountingAccountingTransactionDetailsPage.fillandSubmitAccountingTransactionDetails(accountingTransactionDetailsListData, assertReference);
				if(accountingTransactionDetailsListData.getBooleanValueForField("ConfigAccDistributionButton")){

					/**********Accounting Distribution Page**************/
					List<AccountDistributionEntity> accountDistributionEntityList=testData.getAccountDistributionEntityRecords();
					for(AccountDistributionEntity accountDistributionEntityListData:accountDistributionEntityList){
						if(accountDistributionEntityListData.getChildKey().equalsIgnoreCase(accountingTransactionDetailsListData.getParentKey())){
							if(accountDistributionEntityListData.getAction().equalsIgnoreCase("verify") && accountDistributionEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								if (accountDistributionEntityListData.getBooleanValueForField("ConfigAccountingDistributionTable")) {
									AccountingAccountingDistributionPage accountingAccountingDistributionPage =new AccountingAccountingDistributionPage(driver, "Accounting Distribution",rowcount);
									accountingAccountingDistributionPage.fillandSubmitAccountingDistributionDetails(accountDistributionEntityListData, assertReference,testData);
									rowcount++;
									break;
								}
							}
						}
					}
				}
			}
		}
	}


	/********* pending *************/
	public void exchangeRateVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		//pending
	}	
	/********* pending *************/
	public void debitCreditNotesVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Debit Credit Note Verify </i></B>");
		List<DebitCreditNoteEntity> debitCreditNoteEntityList=testData.getDebitCreditNoteEntityRecords();
		for(DebitCreditNoteEntity debitCreditNoteEntity:debitCreditNoteEntityList){
			if(debitCreditNoteEntity.getParentKey().equalsIgnoreCase(debitCreditNoteEntity.getParentKey())){
				if(debitCreditNoteEntity.getAction().equalsIgnoreCase("verify") && debitCreditNoteEntity.getStepGroup().equalsIgnoreCase(stepGroup)){

					AccountingDebitCreditNoteSearchPage accountingDebitCreditNoteSearchPage= new AccountingDebitCreditNoteSearchPage(driver, "Accounting Debit Credit Search Page");
					accountingDebitCreditNoteSearchPage.fillAndSearchDebitCreditNoteDetails(debitCreditNoteEntity);
					accountingDebitCreditNoteSearchPage.selectDebitCreditNumber(debitCreditNoteEntity);
					/**********Debit Credit Note Details Page**************/
					if(debitCreditNoteEntity.getAction().equalsIgnoreCase("verify") && debitCreditNoteEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
						AccountingDebitCreditNoteDetailsPage accountingDebitCreditNoteDetailsPage=new AccountingDebitCreditNoteDetailsPage(driver, "Accounting DebitCreditNote Details Page");
						accountingDebitCreditNoteDetailsPage.fillAndVerifyDebitCreditNoteDetails(debitCreditNoteEntity, assertReference);
						if(debitCreditNoteEntity.getBooleanValueForField("ConfigCreditingDebitingAccountsTable")){
							/**********Crediting Debiting Accounts Table**************/
							AccountingDebitCreditNoteDetailsPage accountingDebitCreditNoteDetailsTablePage =new AccountingDebitCreditNoteDetailsPage(driver, "Accounting DebitCreditNoteDetails Table");
							accountingDebitCreditNoteDetailsTablePage.fillAndVerifyCreditDebitAccountingTable(assertReference,testData,debitCreditNoteEntity);
							testData.updateRecordsForCriteria(debitCreditNoteEntity);
						}
					}
				}
			}
		}
	}



	/******************************collectionVerifyHelper**************/

	public void collectionVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccountngCollectnSearcEntity> accountngCollectnSearcEntityList=testData.getAccountngCollectnSearcEntity();
		for(AccountngCollectnSearcEntity accountngCollectnSearcEntityListData:accountngCollectnSearcEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if(accountngCollectnSearcEntityListData.getAction().equalsIgnoreCase("verify") && accountngCollectnSearcEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingCollectionSearchCollection accountingCollectionSearchCollection=new AccountingCollectionSearchCollection(driver, "Search Collection");
					accountingCollectionSearchCollection.fillAndSearchFromAccountingCollectionSearchDetails(accountngCollectnSearcEntityListData,assertReference);
					accountingCollectionSearchCollection.selectproposalPolicyNo(accountngCollectnSearcEntityListData);
					accountingCollectionSearchCollection.selectCollectionNumber(accountngCollectnSearcEntityListData);
					List<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getPolicyPremCollectionEntityRecords();
					int rowcount=0;
					for(PolicyPremCollectionEntity policyPremCollectionEntitydata:policyPremCollectionEntityList){
						if(accountingEntity.getParentKey().equalsIgnoreCase(policyPremCollectionEntitydata.getParentKey())){
							if((policyPremCollectionEntitydata.getAction().equalsIgnoreCase("verify")&& policyPremCollectionEntitydata.getStepGroup().equalsIgnoreCase(stepGroup))){
								PolicyPremiumCollectionPage policyPremiumCollectionPage=new PolicyPremiumCollectionPage(driver, "Policy Premium Collection page",rowcount);
								policyPremiumCollectionPage.fillandSubmitPolicyCollectionDetails(policyPremCollectionEntitydata, assertReference,rowcount);
								testData.updateRecordsForCriteria(policyPremCollectionEntitydata);
								rowcount++;
							}
							testData.updateRecordsForCriteria(policyPremCollectionEntitydata);
						}
					}
				}
			}
		}
	}
	/*********************maintainBGCDVerifyHelper****************/

	public void maintainBGCDVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccountingBGOrCDSearchEntity> acountingBGOrCDSearchEntityList=testData.getAccountingBGOrCDSearchEntity();
		for(AccountingBGOrCDSearchEntity acountingBGOrCDSearchEntityListData:acountingBGOrCDSearchEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if(acountingBGOrCDSearchEntityListData.getAction().equalsIgnoreCase("verify") && acountingBGOrCDSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingBankGuranteeCashDepositSearchPage accountingBankGuranteeCashDepositSearchPage =new AccountingBankGuranteeCashDepositSearchPage(driver, "Bank Gurantee/Cash Deposit Search");
					accountingBankGuranteeCashDepositSearchPage.fillAndSearchAccountingBGOrCdDetails(acountingBGOrCDSearchEntityListData);
					accountingBankGuranteeCashDepositSearchPage.selectSearchAccountCode(acountingBGOrCDSearchEntityListData);
					AccountingBankGuaranteeMasterCreationScreenPage accountingBankGuaranteeMasterCreationScreenPage=new AccountingBankGuaranteeMasterCreationScreenPage(driver,"Bank Guarantee Master Creation Screen");
					accountingBankGuaranteeMasterCreationScreenPage.fillAndSubmitCourtMasterForAllProductDetails(acountingBGOrCDSearchEntityListData, assertReference);
				}
			}
		}
	}


	public void maintainScrollVerifyHelper(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,AccountingEntity accountingEntity) throws InterruptedException{
		List<AccScrollSearchEntity> accScrollSearchEntityList=testData.getAccScrollSearchEntities();
		for(AccScrollSearchEntity accScrollSearchEntityListData:accScrollSearchEntityList){
			if(accountingEntity.getParentKey().equalsIgnoreCase(accountingEntity.getParentKey())){
				if(accScrollSearchEntityListData.getAction().equalsIgnoreCase("verify") && accScrollSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					AccountingScrollSearchPage accountingScrollSearchPage=new AccountingScrollSearchPage(driver, "Scroll Search");
					accountingScrollSearchPage.fillAndSubmitAccountingScrollSearchDetails(accScrollSearchEntityListData, assertReference);
					if (accScrollSearchEntityListData.getBooleanValueForField("ConfigNextButton")) {
						List<AccoScrollEntryEntity> accoScrollEntryEntityList=testData.getAccoScrollEntryEntities();
						for(AccoScrollEntryEntity accoScrollEntryEntityListData:accoScrollEntryEntityList){
							if(accoScrollEntryEntityListData.getAction().equalsIgnoreCase("verify") && accoScrollEntryEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								AccountingScrollEntryScreenPage accountingScrollEntryScreenPage=new AccountingScrollEntryScreenPage(driver, "Scroll Entry Screen");
								accountingScrollEntryScreenPage.fetchScrollNumber(accoScrollEntryEntityListData);
								accountingScrollEntryScreenPage.clickOnSearchButton(accoScrollEntryEntityListData);
								accountingScrollEntryScreenPage.fillAndSubmitAccountingScrollEntryScreenDetails(accoScrollEntryEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}

	public void setDependencyForScroll(AccoScrollEntryEntity accoScrollEntryEntity,ScenarioTestData testData){
		if (accoScrollEntryEntity.getStringValueForField("DependencyForPolicyCollection")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), accoScrollEntryEntity.getStringValueForField("DependencyForPolicyCollection"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityData:policyPremCollectionEntityList){
				policyPremCollectionEntityData.setStringValueForField("ReferenceNoAccountingTransaction",accoScrollEntryEntity.getStringValueForField("ScrollNumber"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityData);
			}
		}
	}
	//@Rasika- Dependency For Collection Cum Adjustment
	public void setDependencyForCDAccountNumber(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntity,ScenarioTestData testData){
		if(accountingBGOrCDSearchEntity.getStringValueForField("DependencyForCDAccountNumber")!=null){
			ArrayList<AccountDistributionEntity> accountDistributionEntityList =testData.getObjectByReference(testData.getAccountDistributionEntityRecords(), accountingBGOrCDSearchEntity.getStringValueForField("DependencyForCDAccountNumber"));
			for (AccountDistributionEntity accountDistributionEntityData : accountDistributionEntityList) {
				accountDistributionEntityData.setStringValueForField("GLCode2", accountingBGOrCDSearchEntity.getStringValueForField("BankGuaranteeACCode"));
				testData.updateRecordsForCriteria(accountDistributionEntityData);
			}
		}

		if(accountingBGOrCDSearchEntity.getStringValueForField("DependencyForSubCode")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList =testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), accountingBGOrCDSearchEntity.getStringValueForField("DependencyForSubCode"));
			for (PolicyPremCollectionEntity policyPremCollectionEntityData : policyPremCollectionEntityList) {
				policyPremCollectionEntityData.setStringValueForField("SubCode", accountingBGOrCDSearchEntity.getStringValueForField("BankGuaranteeACCode"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityData);
			}
		}
		if(accountingBGOrCDSearchEntity.getStringValueForField("DependencyForAPDNo")!=null){
			ArrayList<PolInsIntAttCarDetMCEntity> polInsIntAttCarDetMCEntityList =testData.getObjectByReference(testData.getPolInsIntAttrAttCarDetMCEntityRecords(), accountingBGOrCDSearchEntity.getStringValueForField("DependencyForAPDNo"));
			for (PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntityData : polInsIntAttCarDetMCEntityList) {
				polInsIntAttCarDetMCEntityData.setStringValueForField("APDAccNO", accountingBGOrCDSearchEntity.getStringValueForField("BankGuaranteeACCode"));
				testData.updateRecordsForCriteria(polInsIntAttCarDetMCEntityData);
			}
		}
		if(accountingBGOrCDSearchEntity.getStringValueForField("DependencyForCCAccNo")!=null){
			ArrayList<PolInsIntAttCarDetMCEntity> polInsIntAttCarDetMCEntityList =testData.getObjectByReference(testData.getPolInsIntAttrAttCarDetMCEntityRecords(), accountingBGOrCDSearchEntity.getStringValueForField("DependencyForCCAccNo"));
			for (PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntityData : polInsIntAttCarDetMCEntityList) {
				polInsIntAttCarDetMCEntityData.setStringValueForField("AccNO", accountingBGOrCDSearchEntity.getStringValueForField("BankGuaranteeACCode"));
				testData.updateRecordsForCriteria(polInsIntAttCarDetMCEntityData);
			}
		}
	}

	public void setDependencyForReferenceNumber(AccountDistributionEntity accountDistributionEntity,ScenarioTestData testData){
		if(accountDistributionEntity.getStringValueForField("DependencyForVoucherNumber")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList =testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), accountDistributionEntity.getStringValueForField("DependencyForVoucherNumber"));
			for (PolicyPremCollectionEntity policyPremCollectionEntityData : policyPremCollectionEntityList) {
				policyPremCollectionEntityData.setStringValueForField("VoucherNumber", accountDistributionEntity.getStringValueForField("VoucherNumber"));
				policyPremCollectionEntityData.setStringValueForField("ReferenceNo", accountDistributionEntity.getStringValueForField("VoucherNumber"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityData);
			}
		}
	}

	public void setDependencyGLDescriptionCode(AccountDistributionEntity accountDistributionEntityListData,ScenarioTestData testData){
		if(accountDistributionEntityListData.getStringValueForField("DependencyGLDescriptionCode")!=null){
			ArrayList<PolicyPremCollectionEntity>policyPremCollectionEntityList=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), accountDistributionEntityListData.getStringValueForField("DependencyGLDescriptionCode"));
			for(PolicyPremCollectionEntity policyPremCollectionEntityListData:policyPremCollectionEntityList){
				policyPremCollectionEntityListData.setStringValueForField("SubCode",accountDistributionEntityListData.getStringValueForField("GLDescriptionCode"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityListData);
			}
		}
	}


}
