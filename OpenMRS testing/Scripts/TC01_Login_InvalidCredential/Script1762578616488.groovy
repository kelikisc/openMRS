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

WebUI.click(findTestObject('Page_Login/Option_Location1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Login/Button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Login/Error_Credential'), 0)

WebUI.verifyElementText(findTestObject('Page_Login/Error_Credential'), 'Invalid username/password. Please try again.')

WebUI.click(findTestObject('Page_Login/Input_Username'))

WebUI.setText(findTestObject('Page_Login/Input_Username'), 'abc')

WebUI.click(findTestObject('Page_Login/Input_Password'))

WebUI.setText(findTestObject('Page_Login/Input_Password'), '123')

WebUI.click(findTestObject('Page_Login/Button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Login/Error_Credential'), 0)

WebUI.verifyElementText(findTestObject('Page_Login/Error_Credential'), 'Invalid username/password. Please try again.')

WebUI.closeBrowser()

