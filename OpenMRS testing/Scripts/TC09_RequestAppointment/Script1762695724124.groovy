import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.WebURL)

WebUI.click(findTestObject('Page_Login/Input_Username'))

WebUI.setText(findTestObject('Page_Login/Input_Username'), GlobalVariable.Username)

WebUI.click(findTestObject('Page_Login/Input_Password'))

WebUI.setText(findTestObject('Page_Login/Input_Password'), GlobalVariable.Password)

String Location = WebUI.getText(findTestObject('Page_Login/Option_Location1'))

WebUI.click(findTestObject('Page_Login/Option_Location1'))

WebUI.click(findTestObject('Page_Login/Button_Login'))

WebUI.waitForElementPresent(findTestObject('Page_Home/Text_LoginInfo'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Text_LoginInfo'), 0)

WebUI.click(findTestObject('Page_Home/Menu_ActiveVisit'))

WebUI.click(findTestObject('Page_ActiveVisit/Input_Search'))

WebUI.setText(findTestObject('Page_ActiveVisit/Input_Search'), GlobalVariable.GivenName)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ActiveVisit/Table_SearchResult'))

WebUI.waitForElementPresent(findTestObject('Page_UserDetails/Text_GivenName'), 0)

WebUI.verifyElementPresent(findTestObject('Page_UserDetails/Text_GivenName'), 0)

WebUI.verifyElementText(findTestObject('Page_UserDetails/Text_GivenName'), GlobalVariable.GivenName)

WebUI.verifyElementPresent(findTestObject('Page_UserDetails/Text_FamilyName'), 0)

WebUI.verifyElementText(findTestObject('Page_UserDetails/Text_FamilyName'), GlobalVariable.FamilyName)

WebUI.click(findTestObject('Page_UserDetails/Button_RequestAppointment'))

WebUI.click(findTestObject('Page_AppointmentRequest/Input_AppointmentType'))

WebUI.setText(findTestObject('Page_AppointmentRequest/Input_AppointmentType'), 'General')

WebUI.click(findTestObject('Page_AppointmentRequest/List_Appointment1'))

WebUI.click(findTestObject('Page_AppointmentRequest/Button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Visits/Icon_HomePage'))

WebUI.waitForElementPresent(findTestObject('Page_Home/Text_LoginInfo'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Text_LoginInfo'), 0)

WebUI.click(findTestObject('Page_Home/Menu_Appointment'))

WebUI.click(findTestObject('Page_AppointmentMenu/Menu_AppointmentRequests'))

String FullName = WebUI.getText(findTestObject('Page_AppointmentMenu/Table_AppointmentRequests'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(FullName, GlobalVariable.GivenName + " " + GlobalVariable.FamilyName, false)

WebUI.closeBrowser()

