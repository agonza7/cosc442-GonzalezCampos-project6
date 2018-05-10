import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

'Tested with Chrome\r\nIve attempted all browsers and some of the buttons are unrecognizable\r\nDespite me attempting each task several times\r\n'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('Page_Administator Login (2)/input_email'), 'admin@phptravels.com')

WebUI.setText(findTestObject('Page_Administator Login (2)/input_password'), 'demoadmin')

WebUI.sendKeys(findTestObject('Page_Administator Login (2)/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Dashboard (4)/button_Quick Booking'))

WebUI.selectOptionByValue(findTestObject('Page_Dashboard (4)/select_Select'), 'Tours', true)

WebUI.click(findTestObject('Page_Dashboard (4)/button_Next'))

WebUI.click(findTestObject('Page_Quick booking (2)/td_25'))

WebUI.click(findTestObject('Page_Quick booking (2)/div_General                App'))

WebUI.click(findTestObject('Page_Quick booking (2)/div_select2-drop-mask'))

WebUI.click(findTestObject('Page_Quick booking (2)/div_6 Days Around Thailand'))

WebUI.selectOptionByValue(findTestObject('Page_Quick booking (2)/select_Select'), 'payonarrival', true)

WebUI.click(findTestObject('Page_Quick booking (2)/input_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Page_Booking Management (1)/a_Log Out'))

WebUI.closeBrowser()

