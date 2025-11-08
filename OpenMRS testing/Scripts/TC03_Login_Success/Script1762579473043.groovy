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

WebUI.navigateToUrl('https://o2.openmrs.org/openmrs/referenceapplication/login.page')

WebUI.click(findTestObject('Page_Login/Input_Username'))

WebUI.setText(findTestObject('Page_Login/Input_Username'), 'admin')

WebUI.click(findTestObject('Page_Login/Input_Password'))

WebUI.setText(findTestObject('Page_Login/Input_Password'), 'Admin123')

String Location = WebUI.getText(findTestObject('Page_Login/Option_Location1'))

WebUI.click(findTestObject('Page_Login/Option_Location1'))

WebUI.click(findTestObject('Page_Login/Button_Login'))

WebUI.waitForElementPresent(findTestObject('Page_Home/Text_LoginInfo'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Home/Text_LoginInfo'), 0)

WebUI.verifyTextPresent(Location, false)

WebUI.closeBrowser()

