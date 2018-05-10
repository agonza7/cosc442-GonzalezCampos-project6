import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\agonc\\AppData\\Local\\Temp\\Katalon\\Test Cases\\User LogIn and Flight Search\\20180510_124743\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setText(findTestObject('Page_Login (6)/input_username'), 'user@phptravels.com')

WebUI.setText(findTestObject('Page_Login (6)/input_password'), 'demouser')

WebUI.sendKeys(findTestObject('Page_Login (6)/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_My Account (4)/a_Flights'))

WebUI.setText(findTestObject('Page_Flights (5)/input_airports-inline-orig-2fe'), 'bwi')

WebUI.click(findTestObject('Page_Flights (5)/strong_BWI'))

WebUI.setText(findTestObject('Page_Flights (5)/input_airports-inline-dest-2fe'), 'mke')

WebUI.click(findTestObject('Page_Flights (5)/strong_MKE'))

WebUI.click(findTestObject('Page_Flights (5)/button_16'))

WebUI.click(findTestObject('Page_Flights (5)/button_30'))

WebUI.click(findTestObject('Page_Flights (5)/button_Continue with 1 travell'))

WebUI.click(findTestObject('Page_Flights (5)/button_Search'))

WebUI.closeBrowser()

''', 'Test Cases/User LogIn and Flight Search', new TestCaseBinding('Test Cases/User LogIn and Flight Search', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
