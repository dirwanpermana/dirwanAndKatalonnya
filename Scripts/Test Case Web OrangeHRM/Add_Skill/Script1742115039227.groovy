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

WebUI.callTestCase(findTestCase('Test Case Web OrangeHRM/ts_reusable/login_screen'), [('Username') : findTestData('dataLogin (1)').getValue(1, 1)
        , ('Password') : findTestData('dataLogin (1)').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/span_Qualifications'))

WebUI.delay(2)

WebUI.click(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/a_Skills'))

WebUI.click(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 'IT SQA')

WebUI.setText(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'), 
    'Test dong')

WebUI.click(findTestObject('repo_web_orangeHRM/AddSkill/Page_OrangeHRM/button_Save'))

WebUI.callTestCase(findTestCase('Test Case Web OrangeHRM/ts_reusable/Logout_screen'), [:], FailureHandling.STOP_ON_FAILURE)

