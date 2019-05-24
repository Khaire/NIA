Dim oFS
Dim sPFSpec

strPattern = "[^A-Za-z 0-9 \.,\?'""!@#\$%\^\*\(\)-_=\+;:<>\/\\\|\}\{\[\]`~]*" 'Remove Ampersand to be ignored from the RegEx
strReplace = ""
'businessFunction_ID = RegExpReplace(businessFunction_ID, strPattern, strReplace)

Do While True 
	Set oFS = CreateObject( "Scripting.FileSystemObject" )

	sPFSpec = ".\config.properties"
	currDir = oFS.GetAbsolutePathName(".")
	
	Dim loggerFile
	Set loggerFile = oFS.CreateTextFile(currDir & "/logger.txt", True)
	
	loggerFile.WriteLine ("Starting to Upload Test Scenarios in TestScenario DB")
	loggerFile.WriteLine ("====================================================================================== ")

	Dim hbmFolder
	'hbmFolder = Replace(currDir & "\hbmsTempForVBSUpload", "\", "\\") 'Remove the folder from framework directory as well.
	hbmFolder = Replace(currDir & "\hbms", "\", "\\")

	Dim dicProps
	Set dicProps = getPropertiesDictionary(oFS, sPFSpec)

	uploadTestManagementTables = CBool (dicProps( "UploadTestManagementTables" ))
	uploadAllDataTables = CBool (dicProps( "UploadAllDataTables" ))
	uploadAutomationTestDataTables = CBool (dicProps( "UploadAutomationTestDataTables" ))
	
	testScenarioDBServerName = trim(dicProps( "TestScenarioDBServer" ))
	testScenarioDBSchemaName = trim(dicProps( "TestScenarioDBSchemaName" ))
	testScenarioDBUserName = trim(dicProps( "TestScenarioDBUsername" ))
	testScenarioDBPassword = trim(dicProps( "TestScenarioDBPassword" ))
	
	'Creating DBConnection Object to connect the Test Automation Execution Repository
	Dim testScenarioDBConnectionObject
	Set testScenarioDBConnectionObject = CreateObject("ADODB.Connection")

	'Creating Connection String for the Config Parameters
	Dim testScenarioDBConnectionString
	testScenarioDBConnectionString = "Provider=SQLOLEDB; Data Source=" & testScenarioDBServerName & ";"
	testScenarioDBConnectionString = testScenarioDBConnectionString & "Initial Catalog=" & testScenarioDBSchemaName &";Integrated Security=SSPI;"

	'Connecting the Config Parameters File
	testScenarioDBConnectionObject.Open testScenarioDBConnectionString
	If Err Then
		msgBox "Critical Error: 001. testScenarioDBConnectionObject could not be connected." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Do
	End If
	
	baseMasterTestSuiteFolderForExecution = dicProps("BaseMasterTestSuiteFolderForExecution")
	baseMasterTestSuiteFileForExecution = dicProps("BaseMasterTestSuiteFileForExecution")

	masterTestSuiteExcelFilePath = baseMasterTestSuiteFolderForExecution + "\\" + baseMasterTestSuiteFileForExecution

	'Creating DBConnection Object to read the Config Parameters
	Dim masterTestSuitesExcelDBConnectionObject
	Set masterTestSuitesExcelDBConnectionObject = CreateObject("ADODB.Connection")

	'Creating Connection String for the Config Parameters
	Dim masterTestSuiteExcelDBConnectionString
	masterTestSuiteExcelDBConnectionString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" & masterTestSuiteExcelFilePath & ";"
	masterTestSuiteExcelDBConnectionString = masterTestSuiteExcelDBConnectionString & "Extended Properties=""Excel 12.0;ReadOnly=False;HDR=YES"";"

	'Connecting the Config Parameters File
	masterTestSuitesExcelDBConnectionObject.Open masterTestSuiteExcelDBConnectionString
	If Err Then
		msgBox "Critical Error: 001. masterTestSuitesExcelDBConnectionObject could not be connected." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Do
	End If

	'uploadTestSuiteExecutionDataUserSelection = MsgBox ("Do you wish to refresh the Test Automation Suite Execution Data?", 4, "AQM - Test Automation Framework")
	'If uploadTestSuiteExecutionDataUserSelection = 6 Then	
	If uploadTestManagementTables Then	
	
		Dim projectSelectSQLString
		projectSelectSQLString = "Select * from [ProjectDetails$]"

		Dim projectRecordSetObject
		Set projectRecordSetObject = CreateObject("ADODB.RecordSet")
		projectRecordSetObject.LockType = 3
		
		projectRecordSetObject.Open projectSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the ProjectDetails Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
			Exit Do
		End If

		loggerFile.WriteLine ("Creating Project Records in Database.. ")
		
		Do While NOT projectRecordSetObject.EOF 
			project_Reference = projectRecordSetObject("Reference")
			project_Description = projectRecordSetObject("Description")
			project_Description = RegExpReplace(project_Description, strPattern, strReplace)
			project_SerialNumber = cInt(projectRecordSetObject("SerialNumber"))
			project_DateCreated = convertDateTimeToString(Now())
			project_DateUpdated = convertDateTimeToString(Now())
			project_Deleted = 0

			loggerFile.WriteLine ("Adding Project " & project_Reference & " in added in Database.. ")
			
			addUpdateProject testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, project_Reference, project_Description, project_SerialNumber, project_DateCreated, project_DateUpdated, project_Deleted

			loggerFile.WriteLine ("Added Project " & project_Reference & " Successfully.. ")
			
			projectRecordSetObject.MoveNext
		Loop
		
		projectRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. projectRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set projectRecordSetObject = Nothing

		loggerFile.WriteLine ("All Project Records in added in Database.. ")
		
		Dim applicationSelectSQLString
		applicationSelectSQLString = "Select * from [Applications$]"

		Dim applicationRecordSetObject
		Set applicationRecordSetObject = CreateObject("ADODB.RecordSet")
		applicationRecordSetObject.LockType = 3
		
		applicationRecordSetObject.Open applicationSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the Applications Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
			Exit Do
		End If
		
		loggerFile.WriteLine ("Creating Application Records in Database.. ")
		
		Do While NOT applicationRecordSetObject.EOF 
			application_Reference = applicationRecordSetObject("Reference")
			application_ProjectReference = applicationRecordSetObject("ProjectReference")
			application_Description = applicationRecordSetObject("Description")
			application_Description = RegExpReplace(application_Description, strPattern, strReplace)
			application_SerialNumber = cInt(applicationRecordSetObject("SerialNumber"))
			application_DateCreated = convertDateTimeToString(Now())
			application_DateUpdated = convertDateTimeToString(Now())
			application_Deleted = 0

			loggerFile.WriteLine ("Adding Application " & application_Reference & " in added in Database.. ")
			
			addUpdateApplication testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, application_Reference, application_ProjectReference, application_Description, application_SerialNumber, application_DateCreated, application_DateUpdated, application_Deleted

			loggerFile.WriteLine ("Added Application " & application_Reference & " Successfully.. ")
			
			applicationRecordSetObject.MoveNext
		Loop
		
		loggerFile.WriteLine ("All Application Records in added in Database.. ")

		applicationRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. applicationRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set applicationRecordSetObject = Nothing

		
		Dim moduleSelectSQLString
		moduleSelectSQLString = "Select * from [Modules$]"

		Dim moduleRecordSetObject
		Set moduleRecordSetObject = CreateObject("ADODB.RecordSet")
		moduleRecordSetObject.LockType = 3
		
		moduleRecordSetObject.Open moduleSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the Modules Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
		End If

		loggerFile.WriteLine ("Creating Module Records in Database.. ")
		
		Do While NOT moduleRecordSetObject.EOF 
			module_Reference = moduleRecordSetObject("Reference")
			module_ApplicationReference = moduleRecordSetObject("ApplicationReference")
			module_Description = moduleRecordSetObject("Description")
			module_Description = RegExpReplace(module_Description, strPattern, strReplace)
			module_SerialNumber = cInt(moduleRecordSetObject("SerialNumber"))
			module_DateCreated = convertDateTimeToString(Now())
			module_DateUpdated = convertDateTimeToString(Now())
			module_Deleted = 0
			
			loggerFile.WriteLine ("Adding Module " & module_Reference & " in added in Database.. ")

			addUpdateModule testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, module_Reference, module_ApplicationReference, module_Description, module_SerialNumber, module_DateCreated, module_DateUpdated, module_Deleted
			
			loggerFile.WriteLine ("Added Module " & module_Reference & " Successfully.. ")

			moduleRecordSetObject.MoveNext
		Loop
		
		loggerFile.WriteLine ("All Module Records in added in Database.. ")

		moduleRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. moduleRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set moduleRecordSetObject = Nothing

		
		Dim masterAutomationScriptSelectSQLString
		masterAutomationScriptSelectSQLString = "Select * from [MasterAutomationScripts$]"

		Dim masterAutomationScriptRecordSetObject
		Set masterAutomationScriptRecordSetObject = CreateObject("ADODB.RecordSet")
		masterAutomationScriptRecordSetObject.LockType = 3
		
		masterAutomationScriptRecordSetObject.Open masterAutomationScriptSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the MasterAutomationScripts Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
			Exit Do
		End If
		
		loggerFile.WriteLine ("Creating Master Automation Script Records in Database.. ")

		Do While NOT masterAutomationScriptRecordSetObject.EOF 
			masterAutomationScript_Reference = masterAutomationScriptRecordSetObject("Reference")
			masterAutomationScript_Description = masterAutomationScriptRecordSetObject("Description")
			masterAutomationScript_Description = RegExpReplace(masterAutomationScript_Description, strPattern, strReplace)
			masterAutomationScript_SerialNumber = cInt(masterAutomationScriptRecordSetObject("SerialNumber"))
			masterAutomationScript_DateCreated = convertDateTimeToString(Now())
			masterAutomationScript_DateUpdated = convertDateTimeToString(Now())
			masterAutomationScript_Deleted = 0
			
			loggerFile.WriteLine ("Adding Master Automation Script " & masterAutomationScript_Reference & " in added in Database.. ")

			addUpdateMasterAutomationScript testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScript_Reference, masterAutomationScript_Description, masterAutomationScript_SerialNumber, masterAutomationScript_DateCreated, masterAutomationScript_DateUpdated, masterAutomationScript_Deleted

			loggerFile.WriteLine ("Added Master Automation Script " & masterAutomationScript_Reference & " Successfully.. ")
			
			masterAutomationScriptRecordSetObject.MoveNext
		Loop

		loggerFile.WriteLine ("All Master Automation Script Records in added in Database.. ")
		
		masterAutomationScriptRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. masterAutomationScriptRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set masterAutomationScriptRecordSetObject = Nothing

		Dim masterAutomationScriptStepSelectSQLString
		masterAutomationScriptStepSelectSQLString = "Select * from [MasterAutomationScriptSteps$]"

		Dim masterAutomationScriptStepRecordSetObject
		Set masterAutomationScriptStepRecordSetObject = CreateObject("ADODB.RecordSet")
		masterAutomationScriptStepRecordSetObject.LockType = 3
		
		masterAutomationScriptStepRecordSetObject.Open masterAutomationScriptStepSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the masterAutomationScriptStep Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
			Exit Do
		End If
		
		loggerFile.WriteLine ("Creating Master Automation Script Step Records in Database.. ")
		
		Do While NOT masterAutomationScriptStepRecordSetObject.EOF 
			masterAutomationScriptStep_Reference = masterAutomationScriptStepRecordSetObject("Reference")

			masterAutomationScriptStep_AutomationScriptReference = masterAutomationScriptStepRecordSetObject("AutomationScriptReference")
			masterAutomationScriptStep_StepKeyword = masterAutomationScriptStepRecordSetObject("StepKeyword")
			
			masterAutomationScriptStep_ConfigData = masterAutomationScriptStepRecordSetObject("ConfigData")

			masterAutomationScriptStep_StepGroup = masterAutomationScriptStepRecordSetObject("StepGroup")
			
			masterAutomationScriptStep_SerialNumber = cInt(masterAutomationScriptStepRecordSetObject("SerialNumber"))
			masterAutomationScriptStep_ExecutionSequence = cInt(masterAutomationScriptStepRecordSetObject("ExecutionSequence"))

			masterAutomationScriptStep_SkipStep = masterAutomationScriptStepRecordSetObject("SkipStep")
			masterAutomationScriptStep_ToBeExecutedByMachine = masterAutomationScriptStepRecordSetObject("ToBeExecutedByMachine")

			masterAutomationScriptStep_DateCreated = convertDateTimeToString(Now())
			masterAutomationScriptStep_DateUpdated = convertDateTimeToString(Now())
			masterAutomationScriptStep_Deleted = 0
			
			loggerFile.WriteLine ("Adding Master Automation Script Step " & masterAutomationScriptStep_Reference & " in added in Database.. ")

			addUpdateMasterAutomationScriptStep testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScriptStep_Reference, _
				masterAutomationScriptStep_AutomationScriptReference, masterAutomationScriptStep_StepKeyword, _
				masterAutomationScriptStep_ConfigData, masterAutomationScriptStep_StepGroup, masterAutomationScriptStep_SerialNumber, _
				masterAutomationScriptStep_ExecutionSequence, masterAutomationScriptStep_SkipStep, masterAutomationScriptStep_ToBeExecutedByMachine, _
				masterAutomationScriptStep_DateCreated, masterAutomationScriptStep_DateUpdated, masterAutomationScriptStep_Deleted
			
			loggerFile.WriteLine ("Added Master Automation Script Step " & masterAutomationScriptStep_Reference & " Successfully.. ")

			masterAutomationScriptStepRecordSetObject.MoveNext
		Loop
		
		loggerFile.WriteLine ("All Master Automation Script Step Records in added in Database.. ")
		
		masterAutomationScriptStepRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. masterAutomationScriptStepRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set masterAutomationScriptStepRecordSetObject = Nothing
		
		
		
		Dim masterTestSuiteSelectSQLString
		masterTestSuiteSelectSQLString = "Select * from [MasterTestSuites$]"

		Dim masterTestSuiteRecordSetObject
		Set masterTestSuiteRecordSetObject = CreateObject("ADODB.RecordSet")
		masterTestSuiteRecordSetObject.LockType = 3
		
		masterTestSuiteRecordSetObject.Open masterTestSuiteSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the masterTestSuite Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
		End If

		loggerFile.WriteLine ("Creating Master Test Suite Records in Database.. ")
		
		Do While NOT masterTestSuiteRecordSetObject.EOF 
			masterTestSuite_Reference = masterTestSuiteRecordSetObject("Reference")
			masterTestSuite_ApplicationReference = masterTestSuiteRecordSetObject("ApplicationReference")
			masterTestSuite_Description = masterTestSuiteRecordSetObject("Description")
			masterTestSuite_Description = RegExpReplace(masterTestSuite_Description, strPattern, strReplace)
			masterTestSuite_SerialNumber = masterTestSuiteRecordSetObject("SerialNumber")
			masterTestSuite_DateCreated = convertDateTimeToString(Now())
			masterTestSuite_DateUpdated = convertDateTimeToString(Now())
			masterTestSuite_Deleted = 0
			
			loggerFile.WriteLine ("Adding Master Test Suite " & masterTestSuite_Reference & " in added in Database.. ")
			
			addUpdateMasterTestSuite testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterTestSuite_Reference, _
				masterTestSuite_ApplicationReference, masterTestSuite_Description, masterTestSuite_SerialNumber, _
				masterTestSuite_DateCreated, masterTestSuite_DateUpdated, masterTestSuite_Deleted
			
			loggerFile.WriteLine ("Added Master Test Suite " & masterTestSuite_Reference & " Successfully.. ")

			masterTestSuiteRecordSetObject.MoveNext
		Loop
		
		loggerFile.WriteLine ("All Master Test Suite Records in added in Database.. ")

		masterTestSuiteRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. masterTestSuiteRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set masterTestSuiteRecordSetObject = Nothing
		
		
		Dim testSuiteSelectSQLString
		testSuiteSelectSQLString = "Select * from [TestSuites$]"

		Dim testSuiteRecordSetObject
		Set testSuiteRecordSetObject = CreateObject("ADODB.RecordSet")
		testSuiteRecordSetObject.LockType = 3
		
		testSuiteRecordSetObject.Open testSuiteSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the masterTestSuite Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
		End If
		
		loggerFile.WriteLine ("Creating Test Suite Records in Database.. ")
		
		Do While NOT testSuiteRecordSetObject.EOF 
			testSuite_Reference = testSuiteRecordSetObject("Reference")
			testSuite_MasterTestSuiteReference = testSuiteRecordSetObject("MasterTestSuiteReference")
			testSuite_ModuleReference = testSuiteRecordSetObject("ModuleReference")
			testSuite_Description = testSuiteRecordSetObject("Description")
			testSuite_Description = RegExpReplace(testSuite_Description, strPattern, strReplace)
			testSuite_RepositoryFile = testSuiteRecordSetObject("RepositoryFile")
			testSuite_ExecutionPriority = cInt(testSuiteRecordSetObject("ExecutionPriority"))
			testSuite_ExecutionMode = testSuiteRecordSetObject("ExecutionMode")
			testSuite_SerialNumber = testSuiteRecordSetObject("SerialNumber")
			testSuite_ExecuteTestSuite = testSuiteRecordSetObject("ExecuteTestSuite")
			testSuite_DateCreated = convertDateTimeToString(Now())
			testSuite_DateUpdated = convertDateTimeToString(Now())
			testSuite_Deleted = 0
			
			testSuite_RepositoryAbsoluteFolderPath = Replace(testSuite_RepositoryFile, "\", "\\")
				
			testSuiteExcelFileReference = baseMasterTestSuiteFolderForExecution & testSuite_RepositoryAbsoluteFolderPath
			
			If strComp(uCase(testSuite_ExecuteTestSuite),  "YES") = 0 Then
			
				loggerFile.WriteLine ("Adding Test Suite " & testSuite_Reference & " in added in Database.. ")
			
				addUpdateTestSuite testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, _
					testSuite_Reference, testSuite_MasterTestSuiteReference, testSuite_ModuleReference, testSuite_Description, testSuite_RepositoryFile, testSuite_RepositoryAbsoluteFolderPath, _
					testSuite_ExecutionPriority, testSuite_ExecutionMode, testSuite_SerialNumber, testSuite_DateCreated, testSuite_DateUpdated, testSuite_Deleted

				loggerFile.WriteLine ("Added Test Suite " & testSuite_Reference & " Successfully.. ")
			
				'Creating DBConnection Object to read the Config Parameters
				Dim testSuitesExcelDBConnectionObject
				Set testSuitesExcelDBConnectionObject = CreateObject("ADODB.Connection")

				'Creating Connection String for the Config Parameters
				Dim testSuiteExcelDBConnectionString
				testSuiteExcelDBConnectionString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" & testSuiteExcelFileReference & ";"
				testSuiteExcelDBConnectionString = testSuiteExcelDBConnectionString & "Extended Properties=""Excel 12.0;ReadOnly=False;HDR=YES"";"

				'Connecting the Config Parameters File
				testSuitesExcelDBConnectionObject.Open testSuiteExcelDBConnectionString
				If Err Then
					msgBox "Critical Error: 001. testSuitesExcelDBConnectionObject could not be connected." & Chr(13) & "Error Description: " & Err.Description
					Err.Clear
					Exit Do
				End If
				
				Dim testScenarioSelectSQLString
				testScenarioSelectSQLString = "Select * from [TestScenarios$]"

				Dim testScenarioRecordSetObject
				Set testScenarioRecordSetObject = CreateObject("ADODB.RecordSet")
				testScenarioRecordSetObject.LockType = 3
				
				testScenarioRecordSetObject.Open testScenarioSelectSQLString, testSuiteExcelDBConnectionString, 1, 3
				If Err Then
					msgBox "Unable to read the masterTestSuite Table. "& Chr(13) & "Additional Details: " & Err.Description
					Err.Clear
				End If
					
				loggerFile.WriteLine ("Creating Test Scenarios Records for Test Suite " & testSuite_Reference & " in Database.. ")
				
				Do While NOT testScenarioRecordSetObject.EOF 
					testScenario_Reference = testScenarioRecordSetObject("Reference")
					testScenario_PrerequisiteTestSuiteReference = testScenarioRecordSetObject("PrerequisiteTestSuiteReference")
					testScenario_PrerequisiteTestScenarioReference = testScenarioRecordSetObject("PrerequisiteTestScenarioReference")
					testScenario_Description = testScenarioRecordSetObject("Description")
					testScenario_AutomationScriptReference = testScenarioRecordSetObject("AutomationScriptReference")
					testScenario_AutomationScriptReference = RegExpReplace(testScenario_AutomationScriptReference, strPattern, strReplace)
					testScenario_SerialNumber = testScenarioRecordSetObject("SerialNumber")
					testScenario_DateCreated = convertDateTimeToString(Now())
					testScenario_DateUpdated = convertDateTimeToString(Now())
					testScenario_Deleted = 0
					
					loggerFile.WriteLine ("Adding Test Scenario " & testScenario_Reference & " added in Database.. ")

					addUpdateTestScenario testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testSuitesExcelDBConnectionObject, testSuite_Reference, _
						testScenario_Reference, testScenario_PrerequisiteTestSuiteReference, testScenario_PrerequisiteTestScenarioReference, testScenario_Description, _
						testScenario_AutomationScriptReference, testScenario_SerialNumber, testScenario_DateCreated, testScenario_DateUpdated, testScenario_Deleted

					loggerFile.WriteLine ("Added Test Scenario " & testScenario_Reference & " Successfully.. ")
						
					testScenarioRecordSetObject.MoveNext
				Loop

				loggerFile.WriteLine ("All Test Scenarios Records for Test Suite " & testSuite_Reference & " added in Database.. ")
				
				testScenarioRecordSetObject.Close
				If Err Then
					msgBox "Critical Error: 001. testScenarioRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
					Err.Clear
					Exit Do
				End If
				Set testScenarioRecordSetObject = Nothing
				
				testSuitesExcelDBConnectionObject.Close
				If Err Then
					msgBox "Critical Error: 001. testSuitesExcelDBConnectionObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
					Err.Clear
					Exit Do
				End If
				Set testSuitesExcelDBConnectionObject = Nothing
			Else
				'Skipped uploading the file for which the execution is also marked as NO
			End If

			testSuiteRecordSetObject.MoveNext
		Loop
		
		loggerFile.WriteLine ("All Test Suite Records in added in Database.. ")

		testSuiteRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. testSuiteRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set testSuiteRecordSetObject = Nothing
	End If
	
	loggerFile.WriteLine ("====================================================================================== ")
	loggerFile.WriteLine ("")
	loggerFile.WriteLine ("")
	loggerFile.WriteLine ("")
	loggerFile.WriteLine ("")
	loggerFile.WriteLine ("Starting to Upload Test Data in TestData DB")
	loggerFile.WriteLine ("====================================================================================== ")

	testDataDBServerName = trim(dicProps( "TestDataDBServer" ))
	jenkinsTestDataDBServerName = trim(dicProps( "JenkinsTestDataDBServer" ))
	testDataDBSchemaName = trim(dicProps( "TestDataDBSchemaName" ))
	testDataDBUserName = trim(dicProps( "TestDataDBUsername" ))
	testDataDBPassword = trim(dicProps( "TestDataDBPassword" ))	

	'uploadTestDataUserSelection =  MsgBox ("Do you wish to refresh the Test Data?", 4, "ING Vysya Bank - Test Automation Framework")
	'If uploadTestDataUserSelection = 6 Then
	If uploadAutomationTestDataTables Or uploadAllDataTables Then
		'Commented by PKP on 30-09-2015. Dont want hbm Folder to be flushed everytime before execution
		'oFS.DeleteFile(hbmFolder & "\*"), True
		'oFS.DeleteFolder(hbmFolder & "\*"), True
		
		'Creating DBConnection Object to connect the Test Automation Execution Repository
		Dim testDataDBConnectionObject
		Set testDataDBConnectionObject = CreateObject("ADODB.Connection")
		
		jenkinsExecution = cBool( dicProps( "JenkinsExecution" ))

		'Creating Connection String for the Config Parameters
		Dim testDataDBConnectionString
		If Not jenkinsExecution Then
			testDataDBConnectionString = "Provider=SQLOLEDB; Data Source=" & testDataDBServerName & ";"
			testDataDBConnectionString = testDataDBConnectionString & "Initial Catalog=" & testDataDBSchemaName &";Integrated Security=SSPI;"
		Else
			testDataDBConnectionString = "Provider=SQLOLEDB; Data Source=" & jenkinsTestDataDBServerName & ";"
			testDataDBConnectionString = testDataDBConnectionString & "Initial Catalog=" & testDataDBSchemaName &";Integrated Security=SSPI;"
		End If
		
		'Connecting the Config Parameters File
		testDataDBConnectionObject.Open testDataDBConnectionString
		If Err Then
			msgBox "Critical Error: 001. testDataDBConnectionObject could not be connected." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		
		Dim testDataSelectSQLString
		testDataSelectSQLString = "Select * from [TestDataUploads$]"

		Dim testDataRecordSetObject
		Set testDataRecordSetObject = CreateObject("ADODB.RecordSet")
		testDataRecordSetObject.LockType = 3
		
		testDataRecordSetObject.Open testDataSelectSQLString, masterTestSuiteExcelDBConnectionString, 1, 3
		If Err Then
			msgBox "Unable to read the testDataRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
			Err.Clear
		End If
		
		Do While NOT testDataRecordSetObject.EOF 
			testData_Reference = testDataRecordSetObject("Reference")
			testData_TestDataFileNames = testDataRecordSetObject("TestDataFileNames")
			testData_UploadTestDataFilePath = baseMasterTestSuiteFolderForExecution & Replace (testData_TestDataFileNames, "\", "\\")
			testData_SerialNumber = testDataRecordSetObject("SerialNumber")
			testData_UploadFreshDataTableFile = testDataRecordSetObject("UploadFreshDataTableFile")
			
			loggerFile.WriteLine ("****************************************************************************************************")
			loggerFile.WriteLine ("****************************************************************************************************")
			loggerFile.WriteLine ("Uploading Test Data File Reference - " & testData_Reference)
			loggerFile.WriteLine ("Test Data File Name - " & testData_TestDataFileNames)
			loggerFile.WriteLine ("Test Data File Path - " & testData_UploadTestDataFilePath)
			loggerFile.WriteLine ("")
			loggerFile.WriteLine ("****************************************************************************************************")

			If strComp(uCase(testData_UploadFreshDataTableFile), "YES") = 0 Then
				Call uploadTestDataFile (testData_UploadTestDataFilePath, testDataDBConnectionObject, uploadAllDataTables, testData_UploadFreshDataTableFile, oFS, hbmFolder, loggerFile)
			Else
				'WScript.Echo "==============================================================================="
				'WScript.Echo "Skipped Test Data File : " + testData_UploadTestDataFilePath
				'WScript.Echo "==============================================================================="
			End If
			
			loggerFile.WriteLine ("Test Data File Reference - " & testData_Reference & " uploaded successfully")
			loggerFile.WriteLine ("****************************************************************************************************")
			loggerFile.WriteLine ("****************************************************************************************************")
			testDataRecordSetObject.MoveNext
		Loop
		
		testDataRecordSetObject.Close
		If Err Then
			msgBox "Critical Error: 001. testDataRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Err.Clear
			Exit Do
		End If
		Set testDataRecordSetObject = Nothing
		
		testDataDBConnectionObject.Close
		If Err Then
			msgBox "Critical Error: 005. testDataDBConnectionObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
			Exit Do
		End If
		Set testDataDBConnectionObject = Nothing
	End If
	
	loggerFile.WriteLine ("====================================================================================== ")
	loggerFile.WriteLine ("All Test Data Files Uploaded SUCCESSFULLY in TestData DB")
	loggerFile.WriteLine ("====================================================================================== ")
	
	
	masterTestSuitesExcelDBConnectionObject.Close
	If Err Then
		msgBox "Critical Error: 001. masterTestSuitesExcelDBConnectionObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Do
	End If
	Set masterTestSuitesExcelDBConnectionObject = Nothing
	
	testScenarioDBConnectionObject.Close
	If Err Then
		msgBox "Critical Error: 005. testScenarioDBConnectionObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Exit Do
	End If
	Set testScenarioDBConnectionObject = Nothing
	
	loggerFile.Close
	
	msgbox "All Data Uploaded Successfully."
	
	Exit Do
Loop

Public Function uploadTestDataFile (testData_UploadTestDataFilePath, testDataDBConnectionObject, uploadAllDataTables, testData_UploadFreshDataTableFile, oFS, hbmFolder, loggerFile)
	'Creating DBConnection Object to read the Config Parameters
	Dim testDataFileExcelDBConnectionObject
	Set testDataFileExcelDBConnectionObject = CreateObject("ADODB.Connection")

	'Creating Connection String for the Config Parameters
	Dim testDataFileExcelDBConnectionString
	testDataFileExcelDBConnectionString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" & testData_UploadTestDataFilePath & ";"
	testDataFileExcelDBConnectionString = testDataFileExcelDBConnectionString & "Extended Properties=""Excel 12.0;ReadOnly=False;HDR=YES;IMEX=1"";"

	loggerFile.WriteLine ("...........................................................................................................")
	loggerFile.WriteLine ("Connecting with ADODB to File Path - " & testDataFileExcelDBConnectionString)
	loggerFile.WriteLine ("...........................................................................................................")
	'Connecting the Config Parameters File
	testDataFileExcelDBConnectionObject.Open testDataFileExcelDBConnectionString
	If Err Then
		msgBox "Critical Error: 001. testDataFileExcelDBConnectionObject could not be connected." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Dim tableUploaderSelectSQLString
	tableUploaderSelectSQLString = "Select * from [TableUploadMaster$]"

	Dim tableUploaderRecordSetObject
	Set tableUploaderRecordSetObject = CreateObject("ADODB.RecordSet")
	tableUploaderRecordSetObject.LockType = 3

	tableUploaderRecordSetObject.Open tableUploaderSelectSQLString, testDataFileExcelDBConnectionObject, 1, 3
	If Err Then
		msgBox "Unable to read the tableUploaderRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
	End If

	loggerFile.WriteLine ("Starting Upload.")

	Do While NOT tableUploaderRecordSetObject.EOF 
		table_Reference = tableUploaderRecordSetObject("Reference")
		table_TestDataFileName = tableUploaderRecordSetObject("TestDataFileName")
		table_UploadSheetName = tableUploaderRecordSetObject("UploadSheetName")
		table_UploadOnNextRun = tableUploaderRecordSetObject("UploadOnNextRun")

		loggerFile.WriteLine ("Uploading File Reference - " & table_Reference & ". File Name - " & table_TestDataFileName)
		
		Call uploadDataWorksheet(table_TestDataFileName, table_UploadSheetName, uploadAllDataTables, testData_UploadFreshDataTableFile, table_UploadOnNextRun, testDataFileExcelDBConnectionObject, testDataDBConnectionObject, oFS, hbmFolder, loggerFile)
		
		loggerFile.WriteLine ("Uploading File Reference - " & table_Reference & " Completed Successfully.")

		'tableUploaderRecordSetObject("UploadOnNextRun") = "No"
		tableUploaderRecordSetObject.MoveNext
	Loop

	loggerFile.WriteLine ("Completed Upload.")

	tableUploaderRecordSetObject.Close
	If Err Then
		msgBox "Critical Error: 001. tableUploaderRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If
	Set tableUploaderRecordSetObject = Nothing
	
	testDataFileExcelDBConnectionObject.Close
	If Err Then
		msgBox "Critical Error: 001. testDataFileExcelDBConnectionObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If
	Set testDataFileExcelDBConnectionObject = Nothing
End Function


public Function uploadDataWorksheet(table_TestDataFileName, table_UploadSheetName, uploadAllDataTables, testData_UploadFreshDataTableFile, table_UploadOnNextRun, testDataFileExcelDBConnectionObject, testDataDBConnectionObject, oFS, hbmFolder, loggerFile)
	hbmFilePath = hbmFolder + "\\" + table_TestDataFileName + ".hbm.xml"
	If uploadAllDataTables Or (strComp(uCase(testData_UploadFreshDataTableFile), "YES") = 0 and strComp(uCase(table_UploadOnNextRun), "YES") = 0) Then 
		Call createTableInDB (table_TestDataFileName, table_UploadSheetName, testDataFileExcelDBConnectionObject, testDataDBConnectionObject, loggerFile, oFS)
		Call createHBMFile (table_TestDataFileName, table_UploadSheetName, testDataFileExcelDBConnectionObject, oFS, hbmFilePath, loggerFile)
		Call uploadFileInDB (table_TestDataFileName, table_UploadSheetName, testDataFileExcelDBConnectionObject, testDataDBConnectionObject, loggerFile, oFS)
	Else
		loggerFile.WriteLine ("Skipped HBM Create / Table Create / Table Upload of " & table_TestDataFileName)
	End If
End Function

Public Function createTableInDB (table_TestDataFileName, table_UploadSheetName, testDataFileExcelDBConnectionObject, testDataDBConnectionObject, loggerFile, oFS)
	Dim tableCreatorSelectSQLString
	tableCreatorSelectSQLString = "Select * from [" & table_UploadSheetName & "$] where ColumnType = 1"
	
	'msgbox  tableCreatorSelectSQLString
	loggerFile.WriteLine ("Dropping and Creating Table - " & table_UploadSheetName)
	Dim tableCreatorRecordSetObject
	Set tableCreatorRecordSetObject = CreateObject("ADODB.RecordSet")
	tableCreatorRecordSetObject.LockType = 3

	tableCreatorRecordSetObject.Open tableCreatorSelectSQLString, testDataFileExcelDBConnectionObject, 1, 3
	If Err Then
		msgBox "Unable to read the tableCreatorRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description & chr(13) & tableCreatorSelectSQLString
		Err.Clear
	End If
	
	tableCreateStatementString = "Create Table " & table_TestDataFileName & " ( " & chr(13)
	tableDropStatementString = "Drop Table " & table_TestDataFileName

	Do While NOT tableCreatorRecordSetObject.EOF
		lastColumnName = tableCreatorRecordSetObject.Fields(tableCreatorRecordSetObject.Fields.Count-1).Name
		For Each field In tableCreatorRecordSetObject.Fields
			If NOT strComp(uCase(field.Name), "COLUMNTYPE") = 0 Then
				If InStr (1, field.Name, " ", 1) > 0 Then
					msgbox "Column " & field.Name & " for Table " & table_TestDataFileName & " has Space. Please correct."
					Exit Do
				End If
				tableCreateStatementString = tableCreateStatementString & field.Name & " " & field.Value
				If NOT strComp(field.Name, lastColumnName) = 0 Then
					tableCreateStatementString = tableCreateStatementString & ", "  & chr(13)
				End If
			End If
		Next
		tableCreateStatementString = tableCreateStatementString &  ") "  
		
		On Error Resume Next
		testDataDBConnectionObject.Execute tableDropStatementString
		Err.Clear
		On Error Goto 0
		
		Set fileCreateStatement = oFS.CreateTextFile ("./CreateTableStatement.txt")
		fileCreateStatement.writeLine (tableCreateStatementString)
		fileCreateStatement.close
		
		testDataDBConnectionObject.Execute tableCreateStatementString

		tableCreatorRecordSetObject.MoveNext
	Loop

	loggerFile.WriteLine ("Table Created - " & table_UploadSheetName)

	tableCreatorRecordSetObject.Close
	If Err Then
		msgBox "Critical Error: 001. tableCreatorRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If
	Set tableCreatorRecordSetObject = Nothing
End Function

Public Function uploadFileInDB (table_TestDataFileName, table_UploadSheetName, testDataFileExcelDBConnectionObject, testDataDBConnectionObject, loggerFile, oFS)
	Dim tableColumnDictionarySelectSQLString
	tableColumnDictionarySelectSQLString = "Select * from [" & table_UploadSheetName & "$] where ColumnType = 1"

	Dim tableColumnDictionaryRecordSetObject
	Set tableColumnDictionaryRecordSetObject = CreateObject("ADODB.RecordSet")
	tableColumnDictionaryRecordSetObject.LockType = 3

	tableColumnDictionaryRecordSetObject.Open tableColumnDictionarySelectSQLString, testDataFileExcelDBConnectionObject, 1, 3
	If Err Then
		msgBox "Unable to read the tableColumnDictionaryRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
	End If
	
	Set columnDictionary = CreateObject("Scripting.Dictionary")
	
	Do While NOT tableColumnDictionaryRecordSetObject.EOF
		For Each field In tableColumnDictionaryRecordSetObject.Fields
			fieldName = field.Name
			fieldValue = field.Value
			
			If NOT strComp(uCase(fieldName), "COLUMNTYPE") = 0 Then
				columnDictionary.add fieldName, fieldValue
			End If
		Next
		
		'On Error Resume Next
		'testDataDBConnectionObject.Execute tableDropStatementString
		'Err.Clear
		'On Error Goto 0
		
		tableColumnDictionaryRecordSetObject.MoveNext
	Loop

	tableColumnDictionaryRecordSetObject.Close
	If Err Then
		msgBox "Critical Error: 001. tableColumnDictionaryRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If
	Set tableColumnDictionaryRecordSetObject = Nothing

	loggerFile.WriteLine ("Uploading Data For Table - " & table_UploadSheetName) 
	
	Dim tableRecordUploaderSelectSQLString
	tableRecordUploaderSelectSQLString = "Select * from [" & table_UploadSheetName & "$] where ColumnType = 0"

	Dim tableRecordUploaderRecordSetObject
	Set tableRecordUploaderRecordSetObject = CreateObject("ADODB.RecordSet")
	tableRecordUploaderRecordSetObject.LockType = 3

	tableRecordUploaderRecordSetObject.Open tableRecordUploaderSelectSQLString, testDataFileExcelDBConnectionObject, 1, 3
	If Err Then
		msgBox "Unable to read the tableRecordUploaderRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
	End If

	Dim columnNameListString
	Dim columnValueListString
	
	Do While NOT tableRecordUploaderRecordSetObject.EOF
		lastColumnName = tableRecordUploaderRecordSetObject.Fields(tableRecordUploaderRecordSetObject.Fields.Count-1).Name
		columnNameListString = ""
		columnValueListString = ""
		tempReferenceID = ""
		
		For Each field In tableRecordUploaderRecordSetObject.Fields
			fieldName = field.Name
			fieldValue = field.Value

			If NOT strComp(uCase(fieldName), "COLUMNTYPE") = 0 Then
				columnNameListString = columnNameListString & fieldName

				If strComp(uCase(fieldName), "REFERENCE") = 0 Then
					tempReferenceID = fieldValue
				End If
					
				If (InStr(1, uCase(columnDictionary.item(trim(fieldName))), "INTEGER", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "INT", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "NUMBER", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "LONG", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "SHORT", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "BIT", 1) <> 0 ) Then
					tmpValue = 0
					If NOT (IsNull(fieldValue) Or IsEmpty(fieldValue)) Then
						On Error Resume Next
							tmpValue = cInt(fieldValue)
						On Error Goto 0
					End If
					columnValueListString = columnValueListString & cStr(tmpValue)
				ElseIf ( InStr(1, uCase(columnDictionary.item(trim(fieldName))), "FLOAT", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "DOUBLE", 1) <> 0 ) Then
					tmpValue = 0.0
					If NOT (IsNull(fieldValue) Or IsEmpty(fieldValue)) Then
						On Error Resume Next
							tmpValue = cDbl(fieldValue)
						On Error Goto 0
					End If
					columnValueListString = columnValueListString & cStr(tmpValue)
				ElseIf ( InStr(1, uCase(columnDictionary.item(trim(fieldName))), "VARCHAR", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "VARCHAR2", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "TEXT", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "DATE", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "TIME", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "TIMESTAMP", 1) <> 0 Or _
					InStr(1, uCase(columnDictionary.item(trim(fieldName))), "CHAR", 1) <> 0 ) Then

					tmpValue = fieldValue
					If (IsNull(fieldValue) Or IsEmpty(fieldValue)) Then
						tmpValue = ""
					End If
					columnValueListString = columnValueListString & "'" & tmpValue &"'"
				End If

				If NOT strComp(fieldName, lastColumnName) = 0 Then
					columnNameListString = columnNameListString & ", " 
					columnValueListString = columnValueListString & ", " 
				End If	
			End If
		Next 

		insertStatement = "insert into " & table_TestDataFileName & " (" & columnNameListString & ") values (" & columnValueListString & ")"
		
		loggerFile.Write ("Inserting - " & tempReferenceID & "...... ")

		Set recordCreateStatement = oFS.CreateTextFile ("./RecordCreateStatement.txt")
		recordCreateStatement.writeLine (insertStatement)
		recordCreateStatement.close

		testDataDBConnectionObject.execute insertStatement
		loggerFile.WriteLine (" Successfully. ")
		
		tableRecordUploaderRecordSetObject.MoveNext
	Loop
	
	loggerFile.WriteLine ("Uploaded Data For Table - " & table_UploadSheetName & " successfully.") 

	tableRecordUploaderRecordSetObject.Close
	If Err Then
		msgBox "Critical Error: 001. tableRecordUploaderRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If
	Set tableRecordUploaderRecordSetObject = Nothing
End Function

Public Function createHBMFile (table_TestDataFileName, table_UploadSheetName, testDataFileExcelDBConnectionObject, oFS, hbmFilePath, loggerFile)
	Dim hbmCreatorSelectSQLString
	hbmCreatorSelectSQLString = "Select * from [" & table_UploadSheetName & "$] where ColumnType = 1"

	Dim hbmCreatorRecordSetObject
	Set hbmCreatorRecordSetObject = CreateObject("ADODB.RecordSet")
	hbmCreatorRecordSetObject.LockType = 3

	hbmCreatorRecordSetObject.Open hbmCreatorSelectSQLString, testDataFileExcelDBConnectionObject, 1, 3
	If Err Then
		msgBox "Unable to read the hbmCreatorRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
	End If

	If oFS.FileExists(hbmFilePath) Then
		oFS.DeleteFile hbmFilePath
	End If
	
	loggerFile.WriteLine ("Creating HBM File for - " & table_UploadSheetName)
	
	Set objFile = oFS.OpenTextFile(hbmFilePath, 8, True)

	objFile.WriteLine("<?xml version=""1.0""?>")
	objFile.WriteLine("<!DOCTYPE hibernate-mapping PUBLIC ""-//Hibernate/Hibernate Mapping DTD 3.0//EN"" ""http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd"">")
	objFile.WriteLine("<hibernate-mapping auto-import=""true"" default-access=""property"" default-cascade=""none"" default-lazy=""true"">")
	objFile.WriteLine("<class abstract=""false"" name=""com.aqm.staf.library.databin." & table_TestDataFileName & """ table=""" & table_TestDataFileName & """>")
	objFile.WriteLine("		<id name=""Reference"" column=""Reference"" type=""string"">")
	objFile.WriteLine("		</id>")
	objFile.WriteLine("		<property name=""TestScenario"" column=""TestScenario"" type=""string"" />")
	objFile.WriteLine("		<property name=""RowNumber"" column=""RowNumber"" type=""integer"" />")
	objFile.WriteLine("		<property name=""Action"" column=""Action"" type=""string"" />")
	objFile.WriteLine("		<property name=""StepGroup"" column=""StepGroup"" type=""string"" />")
	objFile.WriteLine("		<property name=""ParentKey"" column=""ParentKey"" type=""string"" />")
	objFile.WriteLine("		<property name=""ChildKey"" column=""ChildKey"" type=""string"" />")
	objFile.WriteLine("		<property name=""ConfigExecute"" column=""ConfigExecute"" type=""string"" />")
	objFile.WriteLine("		<dynamic-component insert=""true"" name=""customProperties"" optimistic-lock=""true"" unique=""false"" update=""true"">")
	
	Do While NOT hbmCreatorRecordSetObject.EOF
		For Each field In hbmCreatorRecordSetObject.Fields
			fieldName = field.Name
			fieldValue = field.Value
			
			If NOT (strComp(uCase(fieldName), "COLUMNTYPE") = 0 and strComp(uCase(fieldName), "REFERENCE") = 0 and strComp(uCase(fieldName), "TESTSCENARIO") = 0 and _
				strComp(uCase(fieldName), "ROWNUMBER") = 0 and strComp(uCase(fieldName), "ACTION") = 0 and strComp(uCase(fieldName), "STEPGROUP") = 0 and _
				strComp(uCase(fieldName), "PARENTKEY") = 0 and strComp(uCase(fieldName), "CHILDKEY") = 0 and strComp(uCase(fieldName), "CONFIGEXECUTE") = 0 ) Then
				
				objFile.Write("			<property name=""" & fieldName & """ column=""" & fieldName & """ ")
				If (strComp(uCase(trim(fieldValue)), "INTEGER") = 0 Or strComp(uCase(trim(fieldValue)), "INT") = 0) Then
					objFile.Write("type=""integer"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "LONG") = 0) Then
					objFile.Write("type=""long"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "SHORT") = 0) Then
					objFile.Write("type=""short"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "CHAR") = 0) Then
					objFile.Write("type=""character"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "NUMBER") = 0) Then
					objFile.Write("type=""big_decimal"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "FLOAT") = 0) Then
					objFile.Write("type=""float"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "DOUBLE") = 0) Then
					objFile.Write("type=""double"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "BIT") = 0) Then
					objFile.Write("type=""boolean"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "VARCHAR") = 0 Or strComp(uCase(trim(fieldValue)), "VARCHAR2") = 0) Then
					objFile.Write("type=""string"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "TEXT") = 0) Then
					objFile.Write("type=""text"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "DATE") = 0) Then
					objFile.Write("type=""date"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "TIME") = 0) Then
					objFile.Write("type=""time"" ")
				ElseIf (strComp(uCase(trim(fieldValue)), "TIMESTAMP") = 0) Then
					objFile.Write("type=""timestamp"" ")
				End If
				
				objFile.WriteLine("/>")
			End If
		Next 

		objFile.WriteLine("		</dynamic-component>")
		objFile.WriteLine("	</class>")
		objFile.WriteLine("</hibernate-mapping>")
		
		hbmCreatorRecordSetObject.MoveNext
	Loop
	objFile.Close

	loggerFile.WriteLine ("HBM File created successfully for - " & table_UploadSheetName)
	
	hbmCreatorRecordSetObject.Close
	If Err Then
		msgBox "Critical Error: 001. hbmCreatorRecordSetObject could not be Closed." & Chr(13) & "Error Description: " & Err.Description
		Err.Clear
		Exit Function
	End If
	Set hbmCreatorRecordSetObject = Nothing
End Function

Public Function addUpdateProject (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, project_Reference, project_Description, project_SerialNumber, project_DateCreated, project_DateUpdated, project_Deleted) 
	Dim projectExistSelectSQLString
	projectExistSelectSQLString = "Select * from app_Projects "
	projectExistSelectSQLString = projectExistSelectSQLString & "Where prj_Reference = '" & project_Reference & "' "
	projectExistSelectSQLString = projectExistSelectSQLString & "and prj_Deleted = 0"
	
	Dim projectExistRecordSetObject
	Set projectExistRecordSetObject = CreateObject("ADODB.RecordSet")
	projectExistRecordSetObject.LockType = 3
	
	projectExistRecordSetObject.Open projectExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the ProjectDetails Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If
	
	If projectExistRecordSetObject.EOF Then
		Dim projectInsertSQLString
		projectInsertSQLString = "Insert into app_Projects (prj_ID, prj_Reference, prj_Description, prj_SerialNumber, "
		projectInsertSQLString = projectInsertSQLString & "prj_DateCreated, prj_DateUpdated, prj_Deleted) Values "
		projectInsertSQLString = projectInsertSQLString & "(newID(), '" & project_Reference & "', '" & project_Description & "', "
		projectInsertSQLString = projectInsertSQLString & project_SerialNumber & ", '" & project_DateCreated & "', "
		projectInsertSQLString = projectInsertSQLString & "'" & project_DateUpdated & "', " & project_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute projectInsertSQLString
		If Err Then
			errMessage = "Inserting Project Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
		'	'Exit Do
			Exit Function
		End If
	Else
		Dim projectUpdateSQLString
		projectUpdateSQLString = "Update app_Projects Set prj_Description = '" & project_Description & "', "
		projectUpdateSQLString = projectUpdateSQLString & "prj_SerialNumber = " & project_SerialNumber & ", "
		projectUpdateSQLString = projectUpdateSQLString & "prj_DateUpdated = '" & project_DateUpdated & "' "
		projectUpdateSQLString = projectUpdateSQLString & "Where Upper(prj_Reference) = upper('" & project_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute projectUpdateSQLString
		If Err Then
			errMessage = "Updating Project Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
		'	'Exit Do
			Exit Function
		End If
	End If

	projectExistRecordSetObject.Close
	Set projectExistRecordSetObject = Nothing
End Function

Public Function getProject (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, project_Reference) 
	Dim projectIDSelectSQLString
	projectIDSelectSQLString = "Select * from app_Projects "
	projectIDSelectSQLString = projectIDSelectSQLString & "Where prj_Reference = '" & project_Reference & "' "
	projectIDSelectSQLString = projectIDSelectSQLString & "and prj_Deleted = 0"
		
	Dim projectIDRecordSetObject
	Set projectIDRecordSetObject = CreateObject("ADODB.RecordSet")
	projectIDRecordSetObject.LockType = 3
	
	projectIDRecordSetObject.Open projectIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the ProjectDetails Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT projectIDRecordSetObject.EOF Then
		prj_ID = projectIDRecordSetObject("prj_ID")
		recordDictionary.Add uCase("prj_ID"), prj_ID
		
		prj_Reference = projectIDRecordSetObject("prj_Reference")
		recordDictionary.Add uCase("prj_Reference"), prj_Reference
		
		prj_Description = projectIDRecordSetObject("prj_Description")
		recordDictionary.Add uCase("prj_Description"), prj_Description
		
		prj_SerialNumber = projectIDRecordSetObject("prj_SerialNumber")
		recordDictionary.Add uCase("prj_SerialNumber"), prj_SerialNumber
		
		prj_Deleted = projectIDRecordSetObject("prj_Deleted")
		recordDictionary.Add uCase("prj_Deleted"), prj_Deleted
	End If

	projectIDRecordSetObject.Close
	Set projectIDRecordSetObject = Nothing
	
	Set getProject = recordDictionary
End Function

Public Function addUpdateApplication (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, application_Reference, application_ProjectReference, application_Description, application_SerialNumber, application_DateCreated, application_DateUpdated, application_Deleted) 
	Dim applicationExistSelectSQLString
	applicationExistSelectSQLString = "Select * from app_Applications "
	applicationExistSelectSQLString = applicationExistSelectSQLString & "Where app_Reference = '" & application_Reference & "' "
	applicationExistSelectSQLString = applicationExistSelectSQLString & "and app_Deleted = 0"
	
	Dim applicationExistRecordSetObject
	Set applicationExistRecordSetObject = CreateObject("ADODB.RecordSet")
	applicationExistRecordSetObject.LockType = 3
	
	applicationExistRecordSetObject.Open applicationExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the Application Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
	End If

	Set projectRecord = getProject(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, application_ProjectReference)
	application_ProjectID = projectRecord.item ("PRJ_ID")
	
	If isEmpty (application_ProjectID) OR isNull(application_ProjectID) Then
		errMessage = "Unable to find Project - " & application_ProjectReference & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If
	
	If applicationExistRecordSetObject.EOF Then
		Dim applicationInsertSQLString
		applicationInsertSQLString = "Insert into app_Applications (app_ID, app_Reference, app_Description, app_ProjectID, app_ProjectReference, "
		applicationInsertSQLString = applicationInsertSQLString & "app_SerialNumber, app_DateCreated, app_DateUpdated, app_Deleted) Values "
		applicationInsertSQLString = applicationInsertSQLString & "(newID(), '" & application_Reference & "', '" & application_Description & "', "
		applicationInsertSQLString = applicationInsertSQLString & "'" & application_ProjectID & "', '" & application_ProjectReference & "', "
		applicationInsertSQLString = applicationInsertSQLString & application_SerialNumber & ", '" & application_DateCreated & "', "
		applicationInsertSQLString = applicationInsertSQLString & "'" & application_DateUpdated & "', " & application_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute applicationInsertSQLString
		If Err Then
			errMessage = "Inserting Application Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	Else
		Dim applicationUpdateSQLString
		applicationUpdateSQLString = "Update app_Applications Set app_Description = '" & application_Description & "', "
		applicationUpdateSQLString = applicationUpdateSQLString & "app_ProjectID = '" & application_ProjectID & "', "
		applicationUpdateSQLString = applicationUpdateSQLString & "app_ProjectReference = '" & application_ProjectReference & "', "
		applicationUpdateSQLString = applicationUpdateSQLString & "app_SerialNumber = " & application_SerialNumber & ", "
		applicationUpdateSQLString = applicationUpdateSQLString & "app_DateUpdated = '" & application_DateUpdated & "' "
		applicationUpdateSQLString = applicationUpdateSQLString & "Where Upper(app_Reference) = upper('" & application_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute applicationUpdateSQLString
		If Err Then
			errMessage = "Updating Application Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If	End If

	applicationExistRecordSetObject.Close
	Set applicationExistRecordSetObject = Nothing
End Function

Public Function getApplication (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, application_Reference) 
	Dim applicationIDSelectSQLString
	applicationIDSelectSQLString = "Select * from app_Applications "
	applicationIDSelectSQLString = applicationIDSelectSQLString & "Where app_Reference = '" & application_Reference & "' "
	applicationIDSelectSQLString = applicationIDSelectSQLString & "and app_Deleted = 0"
		
	Dim applicationIDRecordSetObject
	Set applicationIDRecordSetObject = CreateObject("ADODB.RecordSet")
	applicationIDRecordSetObject.LockType = 3
	
	applicationIDRecordSetObject.Open applicationIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the ProjectDetails Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT applicationIDRecordSetObject.EOF Then
		app_ID = applicationIDRecordSetObject("app_ID")
		recordDictionary.Add uCase("app_ID"), app_ID
		
		app_Reference = applicationIDRecordSetObject("app_Reference")
		recordDictionary.Add uCase("app_Reference"), app_Reference
		
		app_Description = applicationIDRecordSetObject("app_Description")
		recordDictionary.Add uCase("app_Description"), app_Description
		
		app_ProjectID = applicationIDRecordSetObject("app_ProjectID")
		recordDictionary.Add uCase("app_ProjectID"), app_ProjectID
		
		app_ProjectReference = applicationIDRecordSetObject("app_ProjectReference")
		recordDictionary.Add uCase("app_ProjectReference"), app_ProjectReference

		app_SerialNumber = applicationIDRecordSetObject("app_SerialNumber")
		recordDictionary.Add uCase("app_SerialNumber"), app_SerialNumber
		
		app_Deleted = applicationIDRecordSetObject("app_Deleted")
		recordDictionary.Add uCase("app_Deleted"), app_Deleted
	End If

	applicationIDRecordSetObject.Close
	Set applicationIDRecordSetObject = Nothing
	
	Set getApplication = recordDictionary
End Function

Public Function addUpdateModule (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, module_Reference, module_ApplicationReference, module_Description, module_SerialNumber, module_DateCreated, module_DateUpdated, module_Deleted) 
	Dim moduleExistSelectSQLString
	moduleExistSelectSQLString = "Select * from app_Modules "
	moduleExistSelectSQLString = moduleExistSelectSQLString & "Where mod_Reference = '" & module_Reference & "' "
	moduleExistSelectSQLString = moduleExistSelectSQLString & "and mod_Deleted = 0"
	
	Dim moduleExistRecordSetObject
	Set moduleExistRecordSetObject = CreateObject("ADODB.RecordSet")
	moduleExistRecordSetObject.LockType = 3
	
	moduleExistRecordSetObject.Open moduleExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the Module Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
	End If
	
	Set applicationRecord = getApplication(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, module_ApplicationReference)
	module_ApplicationID = applicationRecord.item ("APP_ID")
	module_ProjectID = applicationRecord.item ("APP_PROJECTID")
	module_ProjectReference = applicationRecord.item ("APP_PROJECTREFERENCE")
	
	If isEmpty (module_ApplicationID) OR isNull(module_ApplicationID) Then
		errMessage = "Unable to find Project - " & module_ApplicationReference & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If
		
	If moduleExistRecordSetObject.EOF Then
		Dim moduleInsertSQLString
		moduleInsertSQLString = "Insert into app_Modules (mod_ID, mod_Reference, mod_Description, mod_SerialNumber, mod_ProjectID, mod_ProjectReference, "
		moduleInsertSQLString = moduleInsertSQLString & "mod_ApplicationID, mod_ApplicationReference, mod_DateCreated, mod_DateUpdated, mod_Deleted) Values "
		moduleInsertSQLString = moduleInsertSQLString & "(newID(), '" & module_Reference & "', '" & module_Description & "', "
		moduleInsertSQLString = moduleInsertSQLString & module_SerialNumber & ", '" & module_ProjectID & "', '" & module_ProjectReference & "', "
		moduleInsertSQLString = moduleInsertSQLString & "'" & module_ApplicationID & "', '" & module_ApplicationReference & "', "
		moduleInsertSQLString = moduleInsertSQLString & "'" & module_DateCreated & "', '" & module_DateUpdated & "', " & module_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute moduleInsertSQLString
		If Err Then
			errMessage = "Inserting Module Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	Else
		Dim moduleUpdateSQLString
		moduleUpdateSQLString = "Update app_Modules Set mod_Description = '" & module_Description & "', "
		moduleUpdateSQLString = moduleUpdateSQLString & "mod_SerialNumber = " & module_SerialNumber & ", "
		moduleUpdateSQLString = moduleUpdateSQLString & "mod_ProjectID = '" & module_ProjectID & "', "
		moduleUpdateSQLString = moduleUpdateSQLString & "mod_ProjectReference = '" & module_ProjectReference & "', "
		moduleUpdateSQLString = moduleUpdateSQLString & "mod_ApplicationID = '" & module_ApplicationID & "', "
		moduleUpdateSQLString = moduleUpdateSQLString & "mod_ApplicationReference = '" & module_ApplicationReference & "', "
		moduleUpdateSQLString = moduleUpdateSQLString & "mod_DateUpdated = '" & module_DateUpdated & "' "
		moduleUpdateSQLString = moduleUpdateSQLString & "Where Upper(mod_Reference) = upper('" & module_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute moduleUpdateSQLString
		If Err Then
			errMessage = "Updating Module Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	End If

	moduleExistRecordSetObject.Close
	Set moduleExistRecordSetObject = Nothing
End Function

Public Function getModule (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, module_Reference) 
	Dim moduleIDSelectSQLString
	moduleIDSelectSQLString = "Select * from app_Modules "
	moduleIDSelectSQLString = moduleIDSelectSQLString & "Where mod_Reference = '" & module_Reference & "' "
	moduleIDSelectSQLString = moduleIDSelectSQLString & "and mod_Deleted = 0"
		
	Dim moduleIDRecordSetObject
	Set moduleIDRecordSetObject = CreateObject("ADODB.RecordSet")
	moduleIDRecordSetObject.LockType = 3
	
	moduleIDRecordSetObject.Open moduleIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the ProjectDetails Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT moduleIDRecordSetObject.EOF Then
		mod_ID = moduleIDRecordSetObject("mod_ID")
		recordDictionary.Add uCase("mod_ID"), mod_ID
		
		mod_Reference = moduleIDRecordSetObject("mod_Reference")
		recordDictionary.Add uCase("mod_Reference"), mod_Reference
		
		mod_Description = moduleIDRecordSetObject("mod_Description")
		recordDictionary.Add uCase("mod_Description"), mod_Description
		
		mod_SerialNumber = moduleIDRecordSetObject("mod_SerialNumber")
		recordDictionary.Add uCase("mod_SerialNumber"), mod_SerialNumber
		
		mod_ProjectID = moduleIDRecordSetObject("mod_ProjectID")
		recordDictionary.Add uCase("mod_ProjectID"), mod_ProjectID
		
		mod_ProjectReference = moduleIDRecordSetObject("mod_ProjectReference")
		recordDictionary.Add uCase("mod_ProjectReference"), mod_ProjectReference

		mod_ApplicationID = moduleIDRecordSetObject("mod_ApplicationID")
		recordDictionary.Add uCase("mod_ApplicationID"), mod_ApplicationID
		
		mod_ApplicationReference = moduleIDRecordSetObject("mod_ApplicationReference")
		recordDictionary.Add uCase("mod_ApplicationReference"), mod_ApplicationReference

		mod_Deleted = moduleIDRecordSetObject("mod_Deleted")
		recordDictionary.Add uCase("mod_Deleted"), mod_Deleted
	End If

	moduleIDRecordSetObject.Close
	Set moduleIDRecordSetObject = Nothing
	
	Set getModule = recordDictionary
End Function

Public Function addUpdateMasterAutomationScript (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScript_Reference, masterAutomationScript_Description, masterAutomationScript_SerialNumber, masterAutomationScript_DateCreated, masterAutomationScript_DateUpdated, masterAutomationScript_Deleted) 
	Dim masterAutomationScriptExistSelectSQLString
	masterAutomationScriptExistSelectSQLString = "Select * from app_MasterAutomationScripts "
	masterAutomationScriptExistSelectSQLString = masterAutomationScriptExistSelectSQLString & "Where masterAutomationScript_Reference = '" & masterAutomationScript_Reference & "' "
	masterAutomationScriptExistSelectSQLString = masterAutomationScriptExistSelectSQLString & "and masterAutomationScript_Deleted = 0"
	
	Dim masterAutomationScriptExistRecordSetObject
	Set masterAutomationScriptExistRecordSetObject = CreateObject("ADODB.RecordSet")
	masterAutomationScriptExistRecordSetObject.LockType = 3
	
	masterAutomationScriptExistRecordSetObject.Open masterAutomationScriptExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the MasterAutomationScript Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If
	
	If masterAutomationScriptExistRecordSetObject.EOF Then
		Dim masterAutomationScriptInsertSQLString
		masterAutomationScriptInsertSQLString = "Insert into app_MasterAutomationScripts (masterAutomationScript_ID, masterAutomationScript_Reference, "
		masterAutomationScriptInsertSQLString = masterAutomationScriptInsertSQLString & "masterAutomationScript_Description, masterAutomationScript_SerialNumber, "
		masterAutomationScriptInsertSQLString = masterAutomationScriptInsertSQLString & "masterAutomationScript_DateCreated, masterAutomationScript_DateUpdated, masterAutomationScript_Deleted) Values "
		masterAutomationScriptInsertSQLString = masterAutomationScriptInsertSQLString & "(newID(), '" & masterAutomationScript_Reference & "', '" & masterAutomationScript_Description & "', "
		masterAutomationScriptInsertSQLString = masterAutomationScriptInsertSQLString & masterAutomationScript_SerialNumber & ", "
		masterAutomationScriptInsertSQLString = masterAutomationScriptInsertSQLString & "'" & masterAutomationScript_DateCreated & "', '" & masterAutomationScript_DateUpdated & "', " & masterAutomationScript_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute masterAutomationScriptInsertSQLString
		If Err Then
			errMessage = "Inserting masterAutomationScript Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	Else
		Dim masterAutomationScriptUpdateSQLString
		masterAutomationScriptUpdateSQLString = "Update app_MasterAutomationScripts Set masterAutomationScript_Description = '" & masterAutomationScript_Description & "', "
		masterAutomationScriptUpdateSQLString = masterAutomationScriptUpdateSQLString & "masterAutomationScript_SerialNumber = " & masterAutomationScript_SerialNumber & ", "
		masterAutomationScriptUpdateSQLString = masterAutomationScriptUpdateSQLString & "masterAutomationScript_DateUpdated = '" & masterAutomationScript_DateUpdated & "' "
		masterAutomationScriptUpdateSQLString = masterAutomationScriptUpdateSQLString & "Where Upper(masterAutomationScript_Reference) = upper('" & masterAutomationScript_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute masterAutomationScriptUpdateSQLString
		If Err Then
			errMessage = "Updating masterAutomationScript Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	End If

	masterAutomationScriptExistRecordSetObject.Close
	Set masterAutomationScriptExistRecordSetObject = Nothing
End Function

Public Function getMasterAutomationScript (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScript_Reference) 
	Dim masterAutomationScriptIDSelectSQLString
	masterAutomationScriptIDSelectSQLString = "Select * from app_MasterAutomationScripts "
	masterAutomationScriptIDSelectSQLString = masterAutomationScriptIDSelectSQLString & "Where masterAutomationScript_Reference = '" & masterAutomationScript_Reference & "' "
	masterAutomationScriptIDSelectSQLString = masterAutomationScriptIDSelectSQLString & "and masterAutomationScript_Deleted = 0"
		
	Dim masterAutomationScriptIDRecordSetObject
	Set masterAutomationScriptIDRecordSetObject = CreateObject("ADODB.RecordSet")
	masterAutomationScriptIDRecordSetObject.LockType = 3
	
	masterAutomationScriptIDRecordSetObject.Open masterAutomationScriptIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the ProjectDetails Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT masterAutomationScriptIDRecordSetObject.EOF Then
		masterAutomationScript_ID = masterAutomationScriptIDRecordSetObject("masterAutomationScript_ID")
		recordDictionary.Add uCase("masterAutomationScript_ID"), masterAutomationScript_ID
		
		masterAutomationScript_Reference = masterAutomationScriptIDRecordSetObject("masterAutomationScript_Reference")
		recordDictionary.Add uCase("masterAutomationScript_Reference"), masterAutomationScript_Reference
		
		masterAutomationScript_Description = masterAutomationScriptIDRecordSetObject("masterAutomationScript_Description")
		recordDictionary.Add uCase("masterAutomationScript_Description"), masterAutomationScript_Description
		
		masterAutomationScript_SerialNumber = masterAutomationScriptIDRecordSetObject("masterAutomationScript_SerialNumber")
		recordDictionary.Add uCase("masterAutomationScript_SerialNumber"), masterAutomationScript_SerialNumber

		masterAutomationScript_Deleted = masterAutomationScriptIDRecordSetObject("masterAutomationScript_Deleted")
		recordDictionary.Add uCase("masterAutomationScript_Deleted"), masterAutomationScript_Deleted
	End If

	masterAutomationScriptIDRecordSetObject.Close
	Set masterAutomationScriptIDRecordSetObject = Nothing
	
	Set getMasterAutomationScript = recordDictionary
End Function

Public Function addUpdateMasterAutomationScriptStep (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScriptStep_Reference, _
				masterAutomationScriptStep_AutomationScriptReference, masterAutomationScriptStep_StepKeyword, _
				masterAutomationScriptStep_ConfigData, masterAutomationScriptStep_StepGroup, masterAutomationScriptStep_SerialNumber, _
				masterAutomationScriptStep_ExecutionSequence, masterAutomationScriptStep_SkipStep, masterAutomationScriptStep_ToBeExecutedByMachine, _
				masterAutomationScriptStep_DateCreated, masterAutomationScriptStep_DateUpdated, masterAutomationScriptStep_Deleted) 
				
	Dim masterAutomationScriptStepExistSelectSQLString
	masterAutomationScriptStepExistSelectSQLString = "Select * from app_MasterAutomationScriptSteps "
	masterAutomationScriptStepExistSelectSQLString = masterAutomationScriptStepExistSelectSQLString & "Where masterAutomationScriptStep_Reference = '" & masterAutomationScriptStep_Reference & "' "
	masterAutomationScriptStepExistSelectSQLString = masterAutomationScriptStepExistSelectSQLString & "and masterAutomationScriptStep_Deleted = 0"
	
	Dim masterAutomationScriptStepExistRecordSetObject
	Set masterAutomationScriptStepExistRecordSetObject = CreateObject("ADODB.RecordSet")
	masterAutomationScriptStepExistRecordSetObject.LockType = 3
	
	masterAutomationScriptStepExistRecordSetObject.Open masterAutomationScriptStepExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the MasterAutomationScript Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If
	
	Set masterAutomationScriptRecord = getMasterAutomationScript(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScript_Reference)
	masterAutomationScriptStep_AutomationScriptID = masterAutomationScriptRecord.item ("MASTERAUTOMATIONSCRIPT_ID")
	
	If isEmpty (masterAutomationScriptStep_AutomationScriptID) OR isNull(masterAutomationScriptStep_AutomationScriptID) Then
		errMessage = "Unable to find masterAutomationScript - " & masterAutomationScriptStep_AutomationScriptID & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If
	
	If masterAutomationScriptStepExistRecordSetObject.EOF Then
		Dim masterAutomationScriptStepInsertSQLString
		masterAutomationScriptStepInsertSQLString = "Insert into app_MasterAutomationScriptSteps (masterAutomationScriptStep_ID, masterAutomationScriptStep_Reference, "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "masterAutomationScriptStep_AutomationScriptID, masterAutomationScriptStep_AutomationScriptReference, "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "masterAutomationScriptStep_StepKeyword, masterAutomationScriptStep_ConfigData, masterAutomationScriptStep_StepGroup, "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "masterAutomationScriptStep_SerialNumber, masterAutomationScriptStep_ExecutionSequence, masterAutomationScriptStep_SkipStep, "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "masterAutomationScriptStep_ToBeExecutedByMachine, "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "masterAutomationScriptStep_DateCreated, masterAutomationScriptStep_DateUpdated, masterAutomationScriptStep_Deleted) Values "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "(newID(), '" & masterAutomationScriptStep_Reference & "', "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "'" & masterAutomationScriptStep_AutomationScriptID & "', '" & masterAutomationScriptStep_AutomationScriptReference & "', "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "'" & masterAutomationScriptStep_StepKeyword & "', '" & masterAutomationScriptStep_ConfigData & "', " 
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "'" & masterAutomationScriptStep_StepGroup & "', " & masterAutomationScriptStep_SerialNumber & ", " 
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & masterAutomationScriptStep_ExecutionSequence & ", '" & masterAutomationScriptStep_SkipStep & "', " 
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "'" & masterAutomationScriptStep_ToBeExecutedByMachine & "', "
		masterAutomationScriptStepInsertSQLString = masterAutomationScriptStepInsertSQLString & "'" & masterAutomationScriptStep_DateCreated & "', '" & masterAutomationScriptStep_DateUpdated & "', " & masterAutomationScriptStep_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute masterAutomationScriptStepInsertSQLString
		If Err Then
			errMessage = "Inserting masterAutomationScriptStep Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	Else
		Dim masterAutomationScriptStepUpdateSQLString
		masterAutomationScriptStepUpdateSQLString = "Update app_MasterAutomationScriptSteps Set masterAutomationScriptStep_AutomationScriptID = '" & masterAutomationScriptStep_AutomationScriptID & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_AutomationScriptReference = '" & masterAutomationScriptStep_AutomationScriptReference & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_StepKeyword = '" & masterAutomationScriptStep_StepKeyword & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_ConfigData = '" & masterAutomationScriptStep_ConfigData & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_StepGroup = '" & masterAutomationScriptStep_StepGroup & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_SerialNumber = " & masterAutomationScriptStep_SerialNumber & ", "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_ExecutionSequence = " & masterAutomationScriptStep_ExecutionSequence & ", "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_SkipStep = '" & masterAutomationScriptStep_SkipStep & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_ToBeExecutedByMachine = '" & masterAutomationScriptStep_ToBeExecutedByMachine & "', "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "masterAutomationScriptStep_DateUpdated = '" & masterAutomationScriptStep_DateUpdated & "' "
		masterAutomationScriptStepUpdateSQLString = masterAutomationScriptStepUpdateSQLString & "Where Upper(masterAutomationScriptStep_Reference) = upper('" & masterAutomationScriptStep_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute masterAutomationScriptStepUpdateSQLString
		If Err Then
			errMessage = "Updating masterAutomationScriptStep Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	End If

	masterAutomationScriptStepExistRecordSetObject.Close
	Set masterAutomationScriptStepExistRecordSetObject = Nothing
End Function

Public Function getMasterAutomationScriptStep (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterAutomationScriptStep_Reference) 
	Dim masterAutomationScriptStepIDSelectSQLString
	masterAutomationScriptStepIDSelectSQLString = "Select * from app_MasterAutomationScriptSteps "
	masterAutomationScriptStepIDSelectSQLString = masterAutomationScriptStepIDSelectSQLString & "Where masterAutomationScriptStep_Reference = '" & masterAutomationScriptStep_Reference & "' "
	masterAutomationScriptStepIDSelectSQLString = masterAutomationScriptStepIDSelectSQLString & "and masterAutomationScriptStep_Deleted = 0"
		
	Dim masterAutomationScriptStepIDRecordSetObject
	Set masterAutomationScriptStepIDRecordSetObject = CreateObject("ADODB.RecordSet")
	masterAutomationScriptIDRecordSetObject.LockType = 3
	
	masterAutomationScriptStepIDRecordSetObject.Open masterAutomationScriptStepIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the masterAutomationScriptStep Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT masterAutomationScriptStepIDRecordSetObject.EOF Then
		masterAutomationScriptStep_ID = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_ID")
		recordDictionary.Add uCase("masterAutomationScriptStep_ID"), masterAutomationScriptStep_ID
		
		masterAutomationScriptStep_Reference = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_Reference")
		recordDictionary.Add uCase("masterAutomationScriptStep_Reference"), masterAutomationScriptStep_Reference
		
		masterAutomationScriptStep_AutomationScriptID = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_AutomationScriptID")
		recordDictionary.Add uCase("masterAutomationScriptStep_AutomationScriptID"), masterAutomationScriptStep_AutomationScriptID
		
		masterAutomationScriptStep_AutomationScriptReference = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_AutomationScriptReference")
		recordDictionary.Add uCase("masterAutomationScriptStep_AutomationScriptReference"), masterAutomationScriptStep_AutomationScriptReference
		
		masterAutomationScriptStep_StepKeyword = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_StepKeyword")
		recordDictionary.Add uCase("masterAutomationScriptStep_StepKeyword"), masterAutomationScriptStep_StepKeyword
		
		masterAutomationScriptStep_ConfigData = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_ConfigData")
		recordDictionary.Add uCase("masterAutomationScriptStep_ConfigData"), masterAutomationScriptStep_ConfigData
		
		masterAutomationScriptStep_StepGroup = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_StepGroup")
		recordDictionary.Add uCase("masterAutomationScriptStep_StepGroup"), masterAutomationScriptStep_StepGroup
		
		masterAutomationScriptStep_SerialNumber = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_SerialNumber")
		recordDictionary.Add uCase("masterAutomationScriptStep_SerialNumber"), masterAutomationScriptStep_SerialNumber
		
		masterAutomationScriptStep_ExecutionSequence = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_ExecutionSequence")
		recordDictionary.Add uCase("masterAutomationScriptStep_ExecutionSequence"), masterAutomationScriptStep_ExecutionSequence
		
		masterAutomationScriptStep_SkipStep = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_SkipStep")
		recordDictionary.Add uCase("masterAutomationScriptStep_SkipStep"), masterAutomationScriptStep_SkipStep
		
		masterAutomationScriptStep_ToBeExecutedByMachine = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_ToBeExecutedByMachine")
		recordDictionary.Add uCase("masterAutomationScriptStep_ToBeExecutedByMachine"), masterAutomationScriptStep_ToBeExecutedByMachine
		
		masterAutomationScriptStep_DateCreated = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_DateCreated")
		recordDictionary.Add uCase("masterAutomationScriptStep_DateCreated"), masterAutomationScriptStep_DateCreated
	
		masterAutomationScriptStep_DateUpdated = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_DateUpdated")
		recordDictionary.Add uCase("masterAutomationScriptStep_DateUpdated"), masterAutomationScriptStep_DateUpdated

		masterAutomationScriptStep_Deleted = masterAutomationScriptStepIDRecordSetObject("masterAutomationScriptStep_Deleted")
		recordDictionary.Add uCase("masterAutomationScriptStep_Deleted"), masterAutomationScriptStep_Deleted		
		
	End If

	masterAutomationScriptStepIDRecordSetObject.Close
	Set masterAutomationScriptStepIDRecordSetObject = Nothing
	
	Set getMasterAutomationScriptStep = recordDictionary
End Function

Public Function addUpdateMasterTestSuite (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterTestSuite_Reference, _
				masterTestSuite_ApplicationReference, masterTestSuite_Description, masterTestSuite_SerialNumber, _
				masterTestSuite_DateCreated, masterTestSuite_DateUpdated, masterTestSuite_Deleted) 
				
	Dim masterTestSuiteExistSelectSQLString
	masterTestSuiteExistSelectSQLString = "Select * from app_MasterTestSuites "
	masterTestSuiteExistSelectSQLString = masterTestSuiteExistSelectSQLString & "Where masterTestSuite_Reference = '" & masterTestSuite_Reference & "' "
	masterTestSuiteExistSelectSQLString = masterTestSuiteExistSelectSQLString & "and masterTestSuite_Deleted = 0"
	
	Dim masterTestSuiteExistRecordSetObject
	Set masterTestSuiteExistRecordSetObject = CreateObject("ADODB.RecordSet")
	masterTestSuiteExistRecordSetObject.LockType = 3
	
	masterTestSuiteExistRecordSetObject.Open masterTestSuiteExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the MasterTestSuite Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If
	
	Set applicationRecord = getApplication(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterTestSuite_ApplicationReference)
	masterTestSuite_ApplicationID = applicationRecord.item ("APP_ID")
	masterTestSuite_ProjectID = applicationRecord.item ("APP_PROJECTID")
	masterTestSuite_ProjectReference = applicationRecord.item ("APP_PROJECTREFERENCE")
	
	If isEmpty (masterTestSuite_ApplicationID) OR isNull(masterTestSuite_ApplicationID) Then
		errMessage = "Unable to find masterTestSuite_ApplicationID - " & masterTestSuite_ApplicationID & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If
	
	If masterTestSuiteExistRecordSetObject.EOF Then
		Dim masterTestSuiteInsertSQLString
		masterTestSuiteInsertSQLString = "Insert into app_MasterTestSuites (masterTestSuite_ID, masterTestSuite_Reference, "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "masterTestSuite_ProjectID, masterTestSuite_ProjectReference, "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "masterTestSuite_ApplicationID, masterTestSuite_ApplicationReference, "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "masterTestSuite_Description, "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "masterTestSuite_SerialNumber, masterTestSuite_RepositoryFilePath, masterTestSuite_RepositoryAbsoluteFolderPath, "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "masterTestSuite_DateCreated, masterTestSuite_DateUpdated, masterTestSuite_Deleted) Values "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "(newID(), '" & masterTestSuite_Reference & "', "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "'" & masterTestSuite_ProjectID & "', '" & masterTestSuite_ProjectReference & "', "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "'" & masterTestSuite_ApplicationID & "', '" & masterTestSuite_ApplicationReference & "', " 
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "'" & masterTestSuite_Description & "', "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & masterTestSuite_SerialNumber & ", '" & masterTestSuite_RepositoryFilePath & "', '" & masterTestSuite_RepositoryAbsoluteFolderPath & "', "
		masterTestSuiteInsertSQLString = masterTestSuiteInsertSQLString & "'" & masterTestSuite_DateCreated & "', '" & masterTestSuite_DateUpdated & "', " & masterTestSuite_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute masterTestSuiteInsertSQLString
		If Err Then
			errMessage = "Inserting masterAutomationScriptStep Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
		End If
	Else
		Dim masterTestSuiteUpdateSQLString
		masterTestSuiteUpdateSQLString = "Update app_MasterTestSuites Set masterTestSuite_ProjectID = '" & masterTestSuite_ProjectID & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_ProjectReference = '" & masterTestSuite_ProjectReference & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_ApplicationID = '" & masterTestSuite_ApplicationID & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_ApplicationReference = '" & masterTestSuite_ApplicationReference & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_Description = '" & masterTestSuite_Description & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_SerialNumber = " & masterTestSuite_SerialNumber & ", "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_RepositoryFilePath = '" & masterTestSuite_RepositoryFilePath & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_RepositoryAbsoluteFolderPath = '" & masterTestSuite_RepositoryAbsoluteFolderPath & "', "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "masterTestSuite_DateUpdated = '" & masterTestSuite_DateUpdated & "' "
		masterTestSuiteUpdateSQLString = masterTestSuiteUpdateSQLString & "Where Upper(masterTestSuite_Reference) = upper('" & masterTestSuite_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute masterTestSuiteUpdateSQLString
		If Err Then
			errMessage = "Updating masterAutomationScriptStep Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	End If

	masterTestSuiteExistRecordSetObject.Close
	Set masterTestSuiteExistRecordSetObject = Nothing
End Function

Public Function getMasterTestSuite (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, masterTestSuite_Reference) 
	Dim masterTestSuiteIDSelectSQLString
	masterTestSuiteIDSelectSQLString = "Select * from app_MasterTestSuites "
	masterTestSuiteIDSelectSQLString = masterTestSuiteIDSelectSQLString & "Where masterTestSuite_Reference = '" & masterTestSuite_Reference & "' "
	masterTestSuiteIDSelectSQLString = masterTestSuiteIDSelectSQLString & "and masterTestSuite_Deleted = 0"
		
	Dim masterTestSuiteIDRecordSetObject
	Set masterTestSuiteIDRecordSetObject = CreateObject("ADODB.RecordSet")
	masterTestSuiteIDRecordSetObject.LockType = 3
	
	masterTestSuiteIDRecordSetObject.Open masterTestSuiteIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the masterTestSuiteID Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT masterTestSuiteIDRecordSetObject.EOF Then
		masterTestSuite_ID = masterTestSuiteIDRecordSetObject("masterTestSuite_ID")
		recordDictionary.Add uCase("masterTestSuite_ID"), masterTestSuite_ID
		
		masterTestSuite_Reference = masterTestSuiteIDRecordSetObject("masterTestSuite_Reference")
		recordDictionary.Add uCase("masterTestSuite_Reference"), masterTestSuite_Reference
		
		masterTestSuite_ProjectID = masterTestSuiteIDRecordSetObject("masterTestSuite_ProjectID")
		recordDictionary.Add uCase("masterTestSuite_ProjectID"), masterTestSuite_ProjectID
		
		masterTestSuite_ProjectReference = masterTestSuiteIDRecordSetObject("masterTestSuite_ProjectReference")
		recordDictionary.Add uCase("masterTestSuite_ProjectReference"), masterTestSuite_ProjectReference
		
		masterTestSuite_ApplicationID = masterTestSuiteIDRecordSetObject("masterTestSuite_ApplicationID")
		recordDictionary.Add uCase("masterTestSuite_ApplicationID"), masterTestSuite_ApplicationID
		
		masterTestSuite_ApplicationReference = masterTestSuiteIDRecordSetObject("masterTestSuite_ApplicationReference")
		recordDictionary.Add uCase("masterTestSuite_ApplicationReference"), masterTestSuite_ApplicationReference

		masterTestSuite_Description = masterTestSuiteIDRecordSetObject("masterTestSuite_Description")
		recordDictionary.Add uCase("masterTestSuite_Description"), masterTestSuite_Description
		
		masterTestSuite_SerialNumber = masterTestSuiteIDRecordSetObject("masterTestSuite_SerialNumber")
		recordDictionary.Add uCase("masterTestSuite_SerialNumber"), masterTestSuite_SerialNumber
		
		masterTestSuite_RepositoryFilePath = masterTestSuiteIDRecordSetObject("masterTestSuite_RepositoryFilePath")
		recordDictionary.Add uCase("masterTestSuite_RepositoryFilePath"), masterTestSuite_RepositoryFilePath

		masterTestSuite_RepositoryAbsoluteFolderPath = masterTestSuiteIDRecordSetObject("masterTestSuite_RepositoryAbsoluteFolderPath")
		recordDictionary.Add uCase("masterTestSuite_RepositoryAbsoluteFolderPath"), masterTestSuite_RepositoryAbsoluteFolderPath
		
		masterTestSuite_DateCreated = masterTestSuiteIDRecordSetObject("masterTestSuite_DateCreated")
		recordDictionary.Add uCase("masterTestSuite_DateCreated"), masterTestSuite_DateCreated
		
		masterTestSuite_DateUpdated = masterTestSuiteIDRecordSetObject("masterTestSuite_DateUpdated")
		recordDictionary.Add uCase("masterTestSuite_DateUpdated"), masterTestSuite_DateUpdated		

		masterTestSuite_Deleted = masterTestSuiteIDRecordSetObject("masterTestSuite_Deleted")
		recordDictionary.Add uCase("masterTestSuite_Deleted"), masterTestSuite_Deleted
	End If

	masterTestSuiteIDRecordSetObject.Close
	Set masterTestSuiteIDRecordSetObject = Nothing
	
	Set getMasterTestSuite = recordDictionary
End Function

Public Function addUpdateTestSuite (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, _
				testSuite_Reference, testSuite_MasterTestSuiteReference, testSuite_ModuleReference, testSuite_Description, testSuite_RepositoryFile, _
				testSuite_RepositoryAbsoluteFolderPath, testSuite_ExecutionPriority, testSuite_ExecutionMode, testSuite_SerialNumber, _
				testSuite_DateCreated, testSuite_DateUpdated, testSuite_Deleted) 
				
	Dim testSuiteExistSelectSQLString
	testSuiteExistSelectSQLString = "Select * from app_TestSuites "
	testSuiteExistSelectSQLString = testSuiteExistSelectSQLString & "Where testSuite_Reference = '" & testSuite_Reference & "' "
	testSuiteExistSelectSQLString = testSuiteExistSelectSQLString & "and testSuite_Deleted = 0"
	
	Dim testSuiteExistRecordSetObject
	Set testSuiteExistRecordSetObject = CreateObject("ADODB.RecordSet")
	testSuiteExistRecordSetObject.LockType = 3
	
	testSuiteExistRecordSetObject.Open testSuiteExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the TestSuite Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If
	
	Set masterTestSuiteRecord = getMasterTestSuite(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testSuite_MasterTestSuiteReference)
	testSuite_MasterTestSuiteID = masterTestSuiteRecord("MASTERTESTSUITE_ID")
	testSuite_ProjectID = masterTestSuiteRecord("MASTERTESTSUITE_PROJECTID")
	testSuite_ProjectReference = masterTestSuiteRecord("MASTERTESTSUITE_PROJECTREFERENCE")
	testSuite_ApplicationID = masterTestSuiteRecord("MASTERTESTSUITE_APPLICATIONID")
	testSuite_ApplicationReference = masterTestSuiteRecord("MASTERTESTSUITE_APPLICATIONREFERENCE")
	
	If isEmpty (testSuite_MasterTestSuiteID) OR isNull(testSuite_MasterTestSuiteID) Then
		errMessage = "Unable to find testSuite_MasterTestSuiteID - " & testSuite_MasterTestSuiteID & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If

	Set moduleRecord = getModule(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testSuite_ModuleReference)
	testSuite_ModuleID = moduleRecord.item ("MOD_ID")
	
	If isEmpty (testSuite_ModuleID) OR isNull(testSuite_ModuleID) Then
		errMessage = "Unable to find testSuite_ModuleID - " & testSuite_ModuleID & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If
	
	If testSuiteExistRecordSetObject.EOF Then
		Dim testSuiteInsertSQLString
		testSuiteInsertSQLString = "Insert into app_TestSuites (testSuite_ID, testSuite_Reference, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_ProjectID, testSuite_ProjectReference, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_ApplicationID, testSuite_ApplicationReference, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_ModuleID, testSuite_ModuleReference, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_MasterTestSuiteID, testSuite_MasterTestSuiteReference, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_Description, testSuite_RepositoryFile, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_RepositoryAbsoluteFolderPath, testSuite_ExecutionPriority,"
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_ExecutionMode, testSuite_SerialNumber, "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "testSuite_DateCreated, testSuite_DateUpdated, testSuite_Deleted) Values "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "(newID(), '" & testSuite_Reference & "', "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_ProjectID & "', '" & testSuite_ProjectReference & "', "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_ApplicationID & "', '" & testSuite_ApplicationReference & "', " 
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_ModuleID & "', '" & testSuite_ModuleReference & "', " 
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_MasterTestSuiteID & "', '" & testSuite_MasterTestSuiteReference & "', " 
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_Description & "', '" & testSuite_RepositoryFile & "', "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_RepositoryAbsoluteFolderPath & "', " & testSuite_ExecutionPriority & ", "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_ExecutionMode & "', " & testSuite_SerialNumber & ", "
		testSuiteInsertSQLString = testSuiteInsertSQLString & "'" & testSuite_DateCreated & "', '" & testSuite_DateUpdated & "', " & testSuite_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute testSuiteInsertSQLString
		If Err Then
			errMessage = "Inserting masterAutomationScriptStep Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
		End If
	Else
		Dim testSuiteUpdateSQLString
		testSuiteUpdateSQLString = "Update app_TestSuites Set testSuite_ProjectID = '" & testSuite_ProjectID & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ProjectReference = '" & testSuite_ProjectReference & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ApplicationID = '" & testSuite_ApplicationID & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ApplicationReference = '" & testSuite_ApplicationReference & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ModuleID = '" & testSuite_ModuleID & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ModuleReference = '" & testSuite_ModuleReference & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_MasterTestSuiteID = '" & testSuite_MasterTestSuiteID & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_MasterTestSuiteReference = '" & testSuite_MasterTestSuiteReference & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_Description = '" & testSuite_Description & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_RepositoryFile = '" & testSuite_RepositoryFile & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_RepositoryAbsoluteFolderPath = '" & testSuite_RepositoryAbsoluteFolderPath & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ExecutionPriority = " & testSuite_ExecutionPriority & ", "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_ExecutionMode = '" & testSuite_ExecutionMode & "', "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_SerialNumber = " & testSuite_SerialNumber & ", "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "testSuite_DateUpdated = '" & testSuite_DateUpdated & "' "
		testSuiteUpdateSQLString = testSuiteUpdateSQLString & "Where Upper(testSuite_Reference) = upper('" & testSuite_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute testSuiteUpdateSQLString
		If Err Then
			errMessage = "Updating testSuiteUpdate Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	End If

	testSuiteExistRecordSetObject.Close
	Set testSuiteExistRecordSetObject = Nothing
End Function

Public Function getTestSuite (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testSuite_Reference) 
	Dim testSuiteIDSelectSQLString
	testSuiteIDSelectSQLString = "Select * from app_TestSuites "
	testSuiteIDSelectSQLString = testSuiteIDSelectSQLString & "Where testSuite_Reference = '" & testSuite_Reference & "' "
	testSuiteIDSelectSQLString = testSuiteIDSelectSQLString & "and testSuite_Deleted = 0"
		
	Dim testSuiteIDRecordSetObject
	Set testSuiteIDRecordSetObject = CreateObject("ADODB.RecordSet")
	testSuiteIDRecordSetObject.LockType = 3
	
	testSuiteIDRecordSetObject.Open testSuiteIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the testSuiteIDRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT testSuiteIDRecordSetObject.EOF Then
		testSuite_ID = testSuiteIDRecordSetObject("testSuite_ID")
		recordDictionary.Add uCase("testSuite_ID"), testSuite_ID
		
		testSuite_Reference = testSuiteIDRecordSetObject("testSuite_Reference")
		recordDictionary.Add uCase("testSuite_Reference"), testSuite_Reference
		
		testSuite_ProjectID = testSuiteIDRecordSetObject("testSuite_ProjectID")
		recordDictionary.Add uCase("testSuite_ProjectID"), testSuite_ProjectID
		
		testSuite_ProjectReference = testSuiteIDRecordSetObject("testSuite_ProjectReference")
		recordDictionary.Add uCase("testSuite_ProjectReference"), testSuite_ProjectReference
		
		testSuite_ApplicationID = testSuiteIDRecordSetObject("testSuite_ApplicationID")
		recordDictionary.Add uCase("testSuite_ApplicationID"), testSuite_ApplicationID
		
		testSuite_ApplicationReference = testSuiteIDRecordSetObject("testSuite_ApplicationReference")
		recordDictionary.Add uCase("testSuite_ApplicationReference"), testSuite_ApplicationReference

		testSuite_ModuleID = testSuiteIDRecordSetObject("testSuite_ModuleID")
		recordDictionary.Add uCase("testSuite_ModuleID"), testSuite_ModuleID
		
		testSuite_ModuleReference = testSuiteIDRecordSetObject("testSuite_ModuleReference")
		recordDictionary.Add uCase("testSuite_ModuleReference"), testSuite_ModuleReference
		
		testSuite_MasterTestSuiteID = testSuiteIDRecordSetObject("testSuite_MasterTestSuiteID")
		recordDictionary.Add uCase("testSuite_MasterTestSuiteID"), testSuite_MasterTestSuiteID

		testSuite_MasterTestSuiteReference = testSuiteIDRecordSetObject("testSuite_MasterTestSuiteReference")
		recordDictionary.Add uCase("testSuite_MasterTestSuiteReference"), testSuite_MasterTestSuiteReference
		
		testSuite_Description = testSuiteIDRecordSetObject("testSuite_Description")
		recordDictionary.Add uCase("testSuite_Description"), testSuite_Description
		
		testSuite_RepositoryFile = testSuiteIDRecordSetObject("testSuite_RepositoryFile")
		recordDictionary.Add uCase("testSuite_RepositoryFile"), testSuite_RepositoryFile
		
		testSuite_RepositoryAbsoluteFolderPath = testSuiteIDRecordSetObject("testSuite_RepositoryAbsoluteFolderPath")
		recordDictionary.Add uCase("testSuite_RepositoryAbsoluteFolderPath"), testSuite_RepositoryAbsoluteFolderPath
		
		testSuite_ExecutionPriority = testSuiteIDRecordSetObject("testSuite_ExecutionPriority")
		recordDictionary.Add uCase("testSuite_ExecutionPriority"), testSuite_ExecutionPriority

		testSuite_ExecutionMode = testSuiteIDRecordSetObject("testSuite_ExecutionMode")
		recordDictionary.Add uCase("testSuite_ExecutionMode"), testSuite_ExecutionMode
		
		testSuite_SerialNumber = testSuiteIDRecordSetObject("testSuite_SerialNumber")
		recordDictionary.Add uCase("testSuite_SerialNumber"), testSuite_SerialNumber
		
		testSuite_DateCreated = testSuiteIDRecordSetObject("testSuite_DateCreated")
		recordDictionary.Add uCase("testSuite_DateCreated"), testSuite_DateCreated
		
		testSuite_DateUpdated = testSuiteIDRecordSetObject("testSuite_DateUpdated")
		recordDictionary.Add uCase("testSuite_DateUpdated"), testSuite_DateUpdated		

		testSuite_Deleted = testSuiteIDRecordSetObject("testSuite_Deleted")
		recordDictionary.Add uCase("testSuite_Deleted"), testSuite_Deleted
	End If

	testSuiteIDRecordSetObject.Close
	Set testSuiteIDRecordSetObject = Nothing
	
	Set getTestSuite = recordDictionary
End Function

Public Function addUpdateTestScenario (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testSuitesExcelDBConnectionObject, testScenario_TestSuiteReference, _
					testScenario_Reference, testScenario_PrerequisiteTestSuiteReference, testScenario_PrerequisiteTestScenarioReference, testScenario_Description, _
					testScenario_MasterAutomationScriptReference, testScenario_SerialNumber, testScenario_DateCreated, testScenario_DateUpdated, testScenario_Deleted) 
				
	Dim testScenarioExistSelectSQLString
	testScenarioExistSelectSQLString = "Select * from app_TestScenarios "
	testScenarioExistSelectSQLString = testScenarioExistSelectSQLString & "Where testScenario_Reference = '" & testScenario_Reference & "' "
	testScenarioExistSelectSQLString = testScenarioExistSelectSQLString & "and testScenario_Deleted = 0"
	
	Dim testScenarioExistRecordSetObject
	Set testScenarioExistRecordSetObject = CreateObject("ADODB.RecordSet")
	testScenarioExistRecordSetObject.LockType = 3
	
	testScenarioExistRecordSetObject.Open testScenarioExistSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the TestScenario Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If
	
	Set testSuiteRecord = getTestSuite(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testScenario_TestSuiteReference)
	testScenario_ProjectID = testSuiteRecord.item ("TESTSUITE_PROJECTID")
	testScenario_ProjectReference = testSuiteRecord.item ("TESTSUITE_PROJECTREFERENCE")
	testScenario_ApplicationID = testSuiteRecord.item ("TESTSUITE_APPLICATIONID")
	testScenario_ApplicationReference = testSuiteRecord.item ("TESTSUITE_APPLICATIONREFERENCE")
	testScenario_MasterTestSuiteID = testSuiteRecord.item ("TESTSUITE_MASTERTESTSUITEID")
	testScenario_MasterTestSuiteReference = testSuiteRecord.item ("TESTSUITE_MASTERTESTSUITEREFERENCE")
	testScenario_TestSuiteID = testSuiteRecord.item ("TESTSUITE_ID")

	Set masterTestAutomationScriptObject = getMasterAutomationScript(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testScenario_MasterAutomationScriptReference) 
	testScenario_MasterAutomationScriptID = masterTestAutomationScriptObject.item ("MASTERAUTOMATIONSCRIPT_ID")
	If isEmpty (testScenario_MasterAutomationScriptID) OR isNull(testScenario_MasterAutomationScriptID) Then
		errMessage = "Unable to find testScenario_MasterAutomationScriptID - " & testScenario_MasterAutomationScriptID & ". Please check the Excel File."
		msgbox errMessage
		Exit Function
	End If
	
	If testScenarioExistRecordSetObject.EOF Then
		Dim testScenarioInsertSQLString
		testScenarioInsertSQLString = "Insert into app_TestScenarios (testScenario_ID, testScenario_Reference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_ProjectID, testScenario_ProjectReference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_ApplicationID, testScenario_ApplicationReference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_MasterTestSuiteID, testScenario_MasterTestSuiteReference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_TestSuiteID, testScenario_TestSuiteReference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_PrerequisiteTestSuiteID, testScenario_PrerequisiteTestSuiteReference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_PrerequisiteTestScenarioID, testScenario_PrerequisiteTestScenarioReference, "
		'testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_Description, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_MasterAutomationScriptID, testScenario_MasterAutomationScriptReference, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_SerialNumber, "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "testScenario_DateCreated, testScenario_DateUpdated, testScenario_Deleted) Values "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "(newID(), '" & testScenario_Reference & "', "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_ProjectID & "', '" & testScenario_ProjectReference & "', "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_ApplicationID & "', '" & testScenario_ApplicationReference & "', " 
		testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_MasterTestSuiteID & "', '" & testScenario_MasterTestSuiteReference & "', " 
		testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_TestSuiteID & "', '" & testScenario_TestSuiteReference & "', " 
		
		If isEmpty (testScenario_PrerequisiteTestSuiteReference) OR isNull(testScenario_PrerequisiteTestSuiteReference) Then
			testScenarioInsertSQLString = testScenarioInsertSQLString & "null, null, " 
		Else
			Set prerequisiteTestSuiteReferenceObject = getTestSuite(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testScenario_PrerequisiteTestSuiteReference)
			testScenario_PrerequisiteTestSuiteID = prerequisiteTestSuiteReferenceObject.item ("TESTSUITE_ID")
			If isEmpty (testScenario_PrerequisiteTestSuiteID) OR isNull(testScenario_PrerequisiteTestSuiteID) Then
				errMessage = "Unable to find testScenario_PrerequisiteTestSuiteID - " & testScenario_PrerequisiteTestSuiteID & ". Please check the Excel File."
				msgbox errMessage
				Exit Function
			End If
			testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_PrerequisiteTestSuiteID & "', '" & testScenario_PrerequisiteTestSuiteReference & "', " 
		End If

		If isEmpty (testScenario_PrerequisiteTestScenarioReference) OR isNull(testScenario_PrerequisiteTestScenarioReference) Then
			testScenarioInsertSQLString = testScenarioInsertSQLString & "null, null, " 
		Else
			Set testScenario_PrerequisiteTestScenarioReferenceObject = getTestScenario(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testScenario_PrerequisiteTestScenarioReference)
			testScenario_PrerequisiteTestScenarioID = testScenario_PrerequisiteTestScenarioReferenceObject.item ("TESTSCENARIO_ID")
			If isEmpty (testScenario_PrerequisiteTestScenarioID) OR isNull(testScenario_PrerequisiteTestScenarioID) Then
				errMessage = "Unable to find testScenario_PrerequisiteTestScenarioID - " & testScenario_PrerequisiteTestScenarioID & ". Please check the Excel File."
				msgbox errMessage
				Exit Function
			End If
			testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_PrerequisiteTestScenarioID & "', '" & testScenario_PrerequisiteTestScenarioReference & "', " 
		End If

		'testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_Description & "', "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_MasterAutomationScriptID & "', '" & testScenario_MasterAutomationScriptReference & "', " 
		testScenarioInsertSQLString = testScenarioInsertSQLString & testScenario_SerialNumber & ", "
		testScenarioInsertSQLString = testScenarioInsertSQLString & "'" & testScenario_DateCreated & "', '" & testScenario_DateUpdated & "', " & testScenario_Deleted & ")"
		
		'Insert the Master Test Suite Record
		testScenarioDBConnectionObject.Execute testScenarioInsertSQLString
		If Err Then
			errMessage = "Inserting testScenarioInsertSQLString Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
		End If
	Else
		Dim testScenarioUpdateSQLString
		testScenarioUpdateSQLString = "Update app_TestScenarios Set testScenario_ProjectID = '" & testScenario_ProjectID & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_ProjectReference = '" & testScenario_ProjectReference & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_ApplicationID = '" & testScenario_ApplicationID & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_ApplicationReference = '" & testScenario_ApplicationReference & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_MasterTestSuiteID = '" & testScenario_MasterTestSuiteID & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_MasterTestSuiteReference  = '" & testScenario_MasterTestSuiteReference  & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_TestSuiteID   = '" & testScenario_TestSuiteID   & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_TestSuiteReference   = '" & testScenario_TestSuiteReference   & "', "

		If isEmpty (testScenario_PrerequisiteTestSuiteReference) OR isNull(testScenario_PrerequisiteTestSuiteReference) Then
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestSuiteID  = null, "
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestSuiteReference  = null, "
		Else
			Set prerequisiteTestSuiteReferenceObject = getTestSuite(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testScenario_PrerequisiteTestSuiteReference)
			testScenario_PrerequisiteTestSuiteID = prerequisiteTestSuiteReferenceObject.item ("TESTSUITE_ID")
			If isEmpty (testScenario_PrerequisiteTestSuiteID) OR isNull(testScenario_PrerequisiteTestSuiteID) Then
				errMessage = "Unable to find testScenario_PrerequisiteTestSuiteID - " & testScenario_PrerequisiteTestSuiteID & ". Please check the Excel File."
				msgbox errMessage
				Exit Function
			End If
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestSuiteID   = '" & testScenario_PrerequisiteTestSuiteID   & "', "
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestSuiteReference = '" & testScenario_PrerequisiteTestSuiteReference & "', "
		End If

		If isEmpty (testScenario_PrerequisiteTestScenarioReference) OR isNull(testScenario_PrerequisiteTestScenarioReference) Then
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestScenarioID  = null, "
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestScenarioReference  = null, "
		Else
			Set testScenario_PrerequisiteTestScenarioReferenceObject = getTestScenario(testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testScenario_PrerequisiteTestScenarioReference)
			testScenario_PrerequisiteTestScenarioID = testScenario_PrerequisiteTestScenarioReferenceObject.item ("TESTSCENARIO_ID")
			If isEmpty (testScenario_PrerequisiteTestScenarioID) OR isNull(testScenario_PrerequisiteTestScenarioID) Then
				errMessage = "Unable to find testScenario_PrerequisiteTestScenarioID - " & testScenario_PrerequisiteTestScenarioID & ". Please check the Excel File."
				msgbox errMessage
				Exit Function
			End If
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestScenarioID   = '" & testScenario_PrerequisiteTestScenarioID   & "', "
			testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_PrerequisiteTestScenarioReference = '" & testScenario_PrerequisiteTestScenarioReference & "', "
		End If
		
		'testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_Description  = '" & testScenario_Description  & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_MasterAutomationScriptID  = '" & testScenario_MasterAutomationScriptID  & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_MasterAutomationScriptReference  = '" & testScenario_MasterAutomationScriptReference  & "', "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_SerialNumber  = " & testScenario_SerialNumber  & ", "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "testScenario_DateUpdated  = '" & testScenario_DateUpdated  & "' "
		testScenarioUpdateSQLString = testScenarioUpdateSQLString & "Where Upper(testScenario_Reference) = upper('" & testScenario_Reference & "')"

		'Update the Master Test Suite Record
		testScenarioDBConnectionObject.Execute testScenarioUpdateSQLString
		If Err Then
			errMessage = "Updating testSuiteUpdate Record failed. "& Chr(13) & "Additional Details: " & Err.Description
			msgbox errMessage
			'Exit Do
			Exit Function
		End If
	End If

	testScenarioExistRecordSetObject.Close
	Set testScenarioExistRecordSetObject = Nothing
End Function

Public Function getTestScenario (testScenarioDBConnectionObject, masterTestSuitesExcelDBConnectionObject, testSuitesExcelDBConnectionObject, testScenario_Reference) 
	Dim testScenarioIDSelectSQLString
	testScenarioIDSelectSQLString = "Select * from app_TestScenarios "
	testScenarioIDSelectSQLString = testScenarioIDSelectSQLString & "Where testScenario_Reference = '" & testScenario_Reference & "' "
	testScenarioIDSelectSQLString = testScenarioIDSelectSQLString & "and testScenario_Deleted = 0"
		
	Dim testScenarioIDRecordSetObject
	Set testScenarioIDRecordSetObject = CreateObject("ADODB.RecordSet")
	testScenarioIDRecordSetObject.LockType = 3
	
	testScenarioIDRecordSetObject.Open testScenarioIDSelectSQLString, testScenarioDBConnectionObject
	If Err Then
		msgBox "Unable to read the testScenarioIDRecordSetObject Table. "& Chr(13) & "Additional Details: " & Err.Description
		Err.Clear
		Exit Function
	End If

	Set recordDictionary = CreateObject("Scripting.Dictionary")
		
	If NOT testScenarioIDRecordSetObject.EOF Then
		testScenario_ID = testScenarioIDRecordSetObject("testScenario_ID")
		recordDictionary.Add uCase("testScenario_ID"), testScenario_ID
		
		testScenario_Reference = testScenarioIDRecordSetObject("testScenario_Reference")
		recordDictionary.Add uCase("testScenario_Reference"), testScenario_Reference
		
		testScenario_ProjectID = testScenarioIDRecordSetObject("testScenario_ProjectID")
		recordDictionary.Add uCase("testScenario_ProjectID"), testScenario_ProjectID
		
		testScenario_ProjectReference = testScenarioIDRecordSetObject("testScenario_ProjectReference")
		recordDictionary.Add uCase("testScenario_ProjectReference"), testScenario_ProjectReference
		
		testScenario_ApplicationID = testScenarioIDRecordSetObject("testScenario_ApplicationID")
		recordDictionary.Add uCase("testScenario_ApplicationID"), testScenario_ApplicationID
		
		testScenario_ApplicationReference = testScenarioIDRecordSetObject("testScenario_ApplicationReference")
		recordDictionary.Add uCase("testScenario_ApplicationReference"), testScenario_ApplicationReference

		testScenario_MasterTestSuiteID = testScenarioIDRecordSetObject("testScenario_MasterTestSuiteID")
		recordDictionary.Add uCase("testScenario_MasterTestSuiteID"), testScenario_MasterTestSuiteID
		
		testScenario_MasterTestSuiteReference = testScenarioIDRecordSetObject("testScenario_MasterTestSuiteReference")
		recordDictionary.Add uCase("testScenario_MasterTestSuiteReference"), testScenario_MasterTestSuiteReference
		
		testScenario_TestSuiteID = testScenarioIDRecordSetObject("testScenario_TestSuiteID")
		recordDictionary.Add uCase("testScenario_TestSuiteID"), testScenario_TestSuiteID

		testScenario_TestSuiteReference = testScenarioIDRecordSetObject("testScenario_TestSuiteReference")
		recordDictionary.Add uCase("testScenario_TestSuiteReference"), testScenario_TestSuiteReference
		
		testScenario_PrerequisiteTestSuiteID = testScenarioIDRecordSetObject("testScenario_PrerequisiteTestSuiteID")
		recordDictionary.Add uCase("testScenario_PrerequisiteTestSuiteID"), testScenario_PrerequisiteTestSuiteID
		
		testScenario_PrerequisiteTestSuiteReference = testScenarioIDRecordSetObject("testScenario_PrerequisiteTestSuiteReference")
		recordDictionary.Add uCase("testScenario_PrerequisiteTestSuiteReference"), testScenario_PrerequisiteTestSuiteReference

		testScenario_PrerequisiteTestScenarioID = testScenarioIDRecordSetObject("testScenario_PrerequisiteTestScenarioID")
		recordDictionary.Add uCase("testScenario_PrerequisiteTestScenarioID"), testScenario_PrerequisiteTestScenarioID
		
		testScenario_PrerequisiteTestScenarioReference = testScenarioIDRecordSetObject("testScenario_PrerequisiteTestScenarioReference")
		recordDictionary.Add uCase("testScenario_PrerequisiteTestScenarioReference"), testScenario_PrerequisiteTestScenarioReference
		
		testScenario_Description = testScenarioIDRecordSetObject("testScenario_Description")
		recordDictionary.Add uCase("testScenario_Description"), testScenario_Description

		testScenario_MasterAutomationScriptID = testScenarioIDRecordSetObject("testScenario_MasterAutomationScriptID")
		recordDictionary.Add uCase("testScenario_MasterAutomationScriptID"), testScenario_MasterAutomationScriptID
		
		testScenario_MasterAutomationScriptReference = testScenarioIDRecordSetObject("testScenario_MasterAutomationScriptReference")
		recordDictionary.Add uCase("testScenario_MasterAutomationScriptReference"), testScenario_MasterAutomationScriptReference
		
		testScenario_SerialNumber = testScenarioIDRecordSetObject("testScenario_SerialNumber")
		recordDictionary.Add uCase("testScenario_SerialNumber"), testScenario_SerialNumber
		
		testScenario_DateCreated = testScenarioIDRecordSetObject("testScenario_DateCreated")
		recordDictionary.Add uCase("testScenario_DateCreated"), testScenario_DateCreated
		
		testScenario_DateUpdated = testScenarioIDRecordSetObject("testScenario_DateUpdated")
		recordDictionary.Add uCase("testScenario_DateUpdated"), testScenario_DateUpdated		

		testScenario_Deleted = testScenarioIDRecordSetObject("testScenario_Deleted")
		recordDictionary.Add uCase("testScenario_Deleted"), testScenario_Deleted
	End If

	testScenarioIDRecordSetObject.Close
	Set testScenarioIDRecordSetObject = Nothing
	
	Set getTestScenario = recordDictionary
End Function

Public Function convertDateTimeToString(dateValue)
	dayString = right ("0" & datePart("d", dateValue), 2) 
	monthString = monthname(datePart("m", dateValue), true)
	yearString = datePart("yyyy", dateValue)
	hrString = right ("0" & datePart("h", dateValue), 2) 
	minString = right ("0" & datePart("n", dateValue), 2) 
	secString = right ("0" & datePart("s", dateValue), 2) 
	
	convertDateTimeToString = dayString & "/" & monthString & "/" & yearString & " " & hrString & ":" & minString & ":" & secString
End Function 

Public Function getPropertiesDictionary(oFS, sPFSpec) 
	Dim dicProps
	Set dicProps = CreateObject( "Scripting.Dictionary" )

	Dim oTS
	Set oTS = oFS.OpenTextFile( sPFSpec )

	Dim sSect
	sSect = ""

	Do Until oTS.AtEndOfStream
		Dim sLine
		sLine = Trim( oTS.ReadLine )
		
		If "" <> sLine Then
			If "#" = Left( sLine, 1 ) Then
				sSect = sLine
				'WScript.Echo oTS.Line, "starting section", sSect
			Else
				If "" = sSect Then
					'WScript.Echo oTS.Line, "no section", sLine
				Else
					Dim aParts
					aParts = Split( sLine, "=" )
					
					If 1 <> UBound( aParts ) Then
						WScript.Echo oTS.Line, "bad property line", sLine
					Else
						'dicProps( sSect & "." & Trim( aParts( 0 ) ) ) = Trim( aParts( 1 ) )
						'WScript.Echo oTS.Line, "good property line", sSect, sLine
						dicProps( Trim( aParts( 0 ) ) ) = Trim( aParts( 1 ) )
					End If
				End If
			End If
		End If
	Loop
	oTS.Close
	
	Set getPropertiesDictionary = dicProps

End Function


Public Function RegExpReplace(Str, Pattern, Replacement)
	Set objRegExp = New RegExp
	objRegExp.Pattern = Pattern
	objRegExp.Global = True
	RegExpReplace = objRegExp.Replace(Str, Replacement)
	Set objRegExp = Nothing
End Function
