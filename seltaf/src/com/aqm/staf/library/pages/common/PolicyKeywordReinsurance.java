package com.aqm.staf.library.pages.common;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.CessionDetailsEntity;
import com.aqm.staf.library.databin.MaintainCreateEntity;
import com.aqm.staf.library.databin.MaintainPolicyRiskEntity;
import com.aqm.staf.library.databin.MaintainPolicyRiskReinsuranceEntity;
import com.aqm.staf.library.databin.PolicyAttributeEntity;
import com.aqm.staf.library.databin.ProgramCreateEntity;
import com.aqm.staf.library.databin.ReinsuranceHomeEntity;
import com.aqm.staf.library.databin.RiContractEntityReinsurance;
import com.aqm.staf.library.databin.TreatyCreateEntity;
import com.aqm.staf.library.databin.UnderSearchEntity;
import com.aqm.staf.library.pages.reinsurance.CessionDetailsCreatePageReinsurence;
import com.aqm.staf.library.pages.reinsurance.MaintainPolicy;
import com.aqm.staf.library.pages.reinsurance.MaintainPolicyRiskReinsurancePage;
import com.aqm.staf.library.pages.reinsurance.ProgramDetailsCreatePageReinsureance;
import com.aqm.staf.library.pages.reinsurance.RIcontractDetailsCreatePageReinsurance;
import com.aqm.staf.library.pages.reinsurance.ReinsuranceCreateandeditTreaty;
import com.aqm.staf.library.pages.reinsurance.ReinsuranceHomepage;
import com.aqm.staf.library.pages.reinsurance.ReinsuranceUnderwritingSearchPage;

public class PolicyKeywordReinsurance extends FunctionalKeywords {

	public void createReinsurancePolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException, ParseException{
		List<ReinsuranceHomeEntity> ReinsuranceHomeEntitiesList=testData.getReinsuranceHomeRecords();
		for(ReinsuranceHomeEntity reinsuranceHomeEntity:ReinsuranceHomeEntitiesList) {
			if(reinsuranceHomeEntity.getAction().equalsIgnoreCase("edit") && reinsuranceHomeEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSystemAdministration")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigUnderwriting")){
					underwritingEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);

				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccountingTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigBatchTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigReportTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPlaningTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSecurityTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
			}
		}

	}

	public void VerifyReinsurancePolicy(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException, ParseException{
		List<ReinsuranceHomeEntity> ReinsuranceHomeEntitiesList=testData.getReinsuranceHomeRecords();
		for(ReinsuranceHomeEntity reinsuranceHomeEntity:ReinsuranceHomeEntitiesList) {
			if(reinsuranceHomeEntity.getAction().equalsIgnoreCase("verify") && reinsuranceHomeEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSystemAdministration")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigUnderwriting")){
					underwritingVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigAccountingTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigBatchTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigReportTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigPlaningTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}
				if(reinsuranceHomeEntity.getBooleanValueForField("ConfigSecurityTab")){
					systemAdministrationHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
				}

			}
		}

	}


	private void systemAdministrationHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<ReinsuranceHomeEntity>  reinsuranceHomeEntityList=testData.getReinsuranceHomeRecords();
		for(ReinsuranceHomeEntity reinsuranceHomeEntityListData :reinsuranceHomeEntityList ){
			if(reinsuranceHomeEntity.getParentKey().equalsIgnoreCase(reinsuranceHomeEntityListData.getChildKey())){
				if((reinsuranceHomeEntityListData.getAction().equalsIgnoreCase("add")||reinsuranceHomeEntityListData.getAction().equalsIgnoreCase("edit")) && reinsuranceHomeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceHomepage reinsuranceHomepage=new ReinsuranceHomepage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceHomepage.fillandSubmiReinsuranceHomeDetails(reinsuranceHomeEntityListData);

				}
			}
		}
	}

	private void underwritingEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<ReinsuranceHomeEntity>  reinsuranceHomeEntityList=testData.getReinsuranceHomeRecords();
		for(ReinsuranceHomeEntity reinsuranceHomeEntityListData :reinsuranceHomeEntityList ){
			if(reinsuranceHomeEntity.getParentKey().equalsIgnoreCase(reinsuranceHomeEntityListData.getChildKey())){
				if((reinsuranceHomeEntityListData.getAction().equalsIgnoreCase("add")||reinsuranceHomeEntityListData.getAction().equalsIgnoreCase("edit")) && reinsuranceHomeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceHomepage reinsuranceHomepage=new ReinsuranceHomepage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceHomepage.fillandSubmiReinsuranceHomeDetails(reinsuranceHomeEntityListData);
					if(	reinsuranceHomeEntityListData.getBooleanValueForField("ConfigRIContract")) {
						EditRIContract(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					//Treety
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigTreaty")){
						treatyEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					//Programe
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigPrograme")){
						programeEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					//cession
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigCession")){
						cessionEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigPolicyTab")){
						policyEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
				}
			}
		}
	}
	private void EditRIContract(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("add")||UnderSearchEntityListData.getAction().equalsIgnoreCase("edit")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigCreate")){
						List<RiContractEntityReinsurance>  riContractEntityReinsuranceList=testData.getRiContractRecords();
						for(RiContractEntityReinsurance RiContractEntityReinsuranceData :riContractEntityReinsuranceList ){
							if(RiContractEntityReinsuranceData.getParentKey().equalsIgnoreCase(RiContractEntityReinsuranceData.getChildKey())){
								if((RiContractEntityReinsuranceData.getAction().equalsIgnoreCase("add")||RiContractEntityReinsuranceData.getAction().equalsIgnoreCase("edit")) && RiContractEntityReinsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
									RIcontractDetailsCreatePageReinsurance rIcontractDetailsCreatePageReinsurance=new RIcontractDetailsCreatePageReinsurance(driver, "Reinsurance Accounting And Management System Page");
									rIcontractDetailsCreatePageReinsurance.fillandSubmitRIContractDetails(RiContractEntityReinsuranceData, assertReference);

								}
							}


						}
					}
				}
			}
		}
	}








	private void underwritingVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<ReinsuranceHomeEntity>  reinsuranceHomeEntityList=testData.getReinsuranceHomeRecords();
		for(ReinsuranceHomeEntity reinsuranceHomeEntityListData :reinsuranceHomeEntityList ){
			if(reinsuranceHomeEntity.getParentKey().equalsIgnoreCase(reinsuranceHomeEntityListData.getChildKey())){
				if((reinsuranceHomeEntityListData.getAction().equalsIgnoreCase("verify")) && reinsuranceHomeEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceHomepage reinsuranceHomepage=new ReinsuranceHomepage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceHomepage.fillandSubmiReinsuranceHomeDetails(reinsuranceHomeEntityListData);
					if(	reinsuranceHomeEntityListData.getBooleanValueForField("ConfigRIContract")) {
						VerifyRIContract(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					//Treety
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigTreaty")){
						//treatyEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					//Programe
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigPrograme")){
						//programeEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					//cession
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigCession")){
						//cessionEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}
					if(reinsuranceHomeEntityListData.getBooleanValueForField("ConfigPolicyTab")){
						policyVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,reinsuranceHomeEntity);
					}

				}
			}
		}
	}
	private void VerifyRIContract(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("verify")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigCreate")){
						List<RiContractEntityReinsurance>  riContractEntityReinsuranceList=testData.getRiContractRecords();
						for(RiContractEntityReinsurance RiContractEntityReinsuranceData :riContractEntityReinsuranceList ){
							if(RiContractEntityReinsuranceData.getParentKey().equalsIgnoreCase(RiContractEntityReinsuranceData.getChildKey())){
								if((RiContractEntityReinsuranceData.getAction().equalsIgnoreCase("verify")) && RiContractEntityReinsuranceData.getStepGroup().equalsIgnoreCase(stepGroup)){
									RIcontractDetailsCreatePageReinsurance rIcontractDetailsCreatePageReinsurance=new RIcontractDetailsCreatePageReinsurance(driver, "Reinsurance Accounting And Management System Page");
									rIcontractDetailsCreatePageReinsurance.fillandSubmitRIContractDetails(RiContractEntityReinsuranceData, assertReference);

								}
							}


						}
					}
				}
			}
		}
	}


	private void cessionEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("add")||UnderSearchEntityListData.getAction().equalsIgnoreCase("edit")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigCreate")){
						List<TreatyCreateEntity>  treatyCreateEntityList=testData.getRiTreatyPolicy();
						for(TreatyCreateEntity TreatyCreateEntityData :treatyCreateEntityList ){
							if(TreatyCreateEntityData.getParentKey().equalsIgnoreCase(TreatyCreateEntityData.getChildKey())){
								if((TreatyCreateEntityData.getAction().equalsIgnoreCase("add")||TreatyCreateEntityData.getAction().equalsIgnoreCase("edit")) && TreatyCreateEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ReinsuranceCreateandeditTreaty ReinsuranceCreateandeditTreaty=new ReinsuranceCreateandeditTreaty(driver, "Reinsurance Accounting And Management System Page");
									ReinsuranceCreateandeditTreaty.fillandSubmitTreatyDetails(TreatyCreateEntityData, assertReference);

								}
							}
						}
					}
				}
			}
		}
	}

	private void policyEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("add")||UnderSearchEntityListData.getAction().equalsIgnoreCase("edit")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigPolicyNoSearch")){
						List<MaintainCreateEntity>  maintainCreateEntityList=testData.getRimaintainRecords();
						for(MaintainCreateEntity maintainCreateEntityData :maintainCreateEntityList ){
							if(maintainCreateEntityData.getParentKey().equalsIgnoreCase(maintainCreateEntityData.getChildKey())){
								if((maintainCreateEntityData.getAction().equalsIgnoreCase("add")||maintainCreateEntityData.getAction().equalsIgnoreCase("edit")) && maintainCreateEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									MaintainPolicy maintainPolicy=new MaintainPolicy(driver, "Maintain Policy Page");
									maintainPolicy.fillandSubmitMaintainPolicyDetails(maintainCreateEntityData, assertReference);
									if(	maintainCreateEntityData.getBooleanValueForField("ConfigPolicyItemNumber")){
										List<MaintainPolicyRiskEntity>  maintainPolicyRiskReinsuranceEntityList=testData.getMaintainPolicyRiskReinsuranceRecords();
										for(MaintainPolicyRiskEntity maintainPolicyRiskReinsuranceEntityData :maintainPolicyRiskReinsuranceEntityList ){
											if(maintainPolicyRiskReinsuranceEntityData.getParentKey().equalsIgnoreCase(maintainPolicyRiskReinsuranceEntityData.getChildKey())){
												if((maintainPolicyRiskReinsuranceEntityData.getAction().equalsIgnoreCase("add")||maintainPolicyRiskReinsuranceEntityData.getAction().equalsIgnoreCase("edit")) && maintainPolicyRiskReinsuranceEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													MaintainPolicyRiskReinsurancePage maintainPolicyRiskReinsurance=new MaintainPolicyRiskReinsurancePage(driver, "Maintain Policy Risk Reinsurance Page");
													maintainPolicyRiskReinsurance.fillandSubmitMaintainPolicyRiskDetails(maintainPolicyRiskReinsuranceEntityData, assertReference);

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void policyVerifyHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("verify")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigPolicyNoSearch")){
						List<MaintainCreateEntity>  maintainCreateEntityList=testData.getRimaintainRecords();
						for(MaintainCreateEntity maintainCreateEntityData :maintainCreateEntityList ){
							if(maintainCreateEntityData.getParentKey().equalsIgnoreCase(maintainCreateEntityData.getChildKey())){
								if((maintainCreateEntityData.getAction().equalsIgnoreCase("verify")) && maintainCreateEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									MaintainPolicy maintainPolicy=new MaintainPolicy(driver, "Maintain Policy Page");
									maintainPolicy.fillandSubmitMaintainPolicyDetails(maintainCreateEntityData, assertReference);
									if(	maintainCreateEntityData.getBooleanValueForField("ConfigPolicyItemNumber")){
										List<MaintainPolicyRiskEntity>  maintainPolicyRiskReinsuranceEntityList=testData.getMaintainPolicyRiskReinsuranceRecords();
										for(MaintainPolicyRiskEntity maintainPolicyRiskReinsuranceEntityData :maintainPolicyRiskReinsuranceEntityList ){
											if(maintainPolicyRiskReinsuranceEntityData.getParentKey().equalsIgnoreCase(maintainPolicyRiskReinsuranceEntityData.getChildKey())){
												if((maintainPolicyRiskReinsuranceEntityData.getAction().equalsIgnoreCase("verify")) && maintainPolicyRiskReinsuranceEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
													MaintainPolicyRiskReinsurancePage maintainPolicyRiskReinsurance=new MaintainPolicyRiskReinsurancePage(driver, "Maintain Policy Risk Reinsurance Page");
													maintainPolicyRiskReinsurance.fillandSubmitMaintainPolicyRiskDetails(maintainPolicyRiskReinsuranceEntityData, assertReference);
													List<CessionDetailsEntity>  cessionDetailsEntityList=testData.getCessionReinsurenceRecords();
													for(CessionDetailsEntity cessionDetailsEntityData :cessionDetailsEntityList ){
														if(cessionDetailsEntityData.getParentKey().equalsIgnoreCase(cessionDetailsEntityData.getChildKey())){
															if((cessionDetailsEntityData.getAction().equalsIgnoreCase("verify")) && cessionDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
																CessionDetailsCreatePageReinsurence cessionDetailsReinsurance=new CessionDetailsCreatePageReinsurence(driver, "Cession Details Create Reinsurence Page");
																cessionDetailsReinsurance.fillandSubmitCessionDetails(cessionDetailsEntityData, assertReference);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void programeEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("add")||UnderSearchEntityListData.getAction().equalsIgnoreCase("edit")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigCreate")){
						List<ProgramCreateEntity>  programCreateEntityList=testData.getProgramReinsurenceRecords();
						for(ProgramCreateEntity ProgramCreateEntityData :programCreateEntityList ){
							if(ProgramCreateEntityData.getParentKey().equalsIgnoreCase(ProgramCreateEntityData.getChildKey())){
								if((ProgramCreateEntityData.getAction().equalsIgnoreCase("add")||ProgramCreateEntityData.getAction().equalsIgnoreCase("edit")) && ProgramCreateEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ProgramDetailsCreatePageReinsureance programDetailsCreatePageReinsureance=new ProgramDetailsCreatePageReinsureance(driver, "Reinsurance Accounting And Management System Page");
									programDetailsCreatePageReinsureance.fillandSubmitPartyDetails(ProgramCreateEntityData, assertReference);






								}
							}
						}
					}
				}
			}
		}
	}

	private void treatyEditHelper(ScenarioTestData testData, ExecutionTestSteps executionTestStep,CustomAssert assertReference, WebDriver driver, String stepGroup,ReinsuranceHomeEntity reinsuranceHomeEntity) throws InterruptedException {
		List<UnderSearchEntity>  underSearchEntityEntityList=testData.getUndrSeachEntityRecords();
		for(UnderSearchEntity UnderSearchEntityListData :underSearchEntityEntityList ){
			if(UnderSearchEntityListData.getParentKey().equalsIgnoreCase(UnderSearchEntityListData.getChildKey())){
				if((UnderSearchEntityListData.getAction().equalsIgnoreCase("add")||UnderSearchEntityListData.getAction().equalsIgnoreCase("edit")) && UnderSearchEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ReinsuranceUnderwritingSearchPage reinsuranceUnderwritingSearchPage=new ReinsuranceUnderwritingSearchPage(driver, "Reinsurance Accounting And Management System Page");
					reinsuranceUnderwritingSearchPage.fillandSubmitUnderwritingSearchDetails(UnderSearchEntityListData, assertReference);
					if(	UnderSearchEntityListData.getBooleanValueForField("ConfigCreate")){
						List<TreatyCreateEntity>  treatyCreateEntityList=testData.getRiTreatyPolicy();
						for(TreatyCreateEntity TreatyCreateEntityData :treatyCreateEntityList ){
							if(TreatyCreateEntityData.getParentKey().equalsIgnoreCase(TreatyCreateEntityData.getChildKey())){
								if((TreatyCreateEntityData.getAction().equalsIgnoreCase("add")||TreatyCreateEntityData.getAction().equalsIgnoreCase("edit")) && TreatyCreateEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ReinsuranceCreateandeditTreaty ReinsuranceCreateandeditTreaty=new ReinsuranceCreateandeditTreaty(driver, "Reinsurance Accounting And Management System Page");
									ReinsuranceCreateandeditTreaty.fillandSubmitTreatyDetails(TreatyCreateEntityData, assertReference);



								}
							}
						}
					}
				}
			}
		}
	}
}

