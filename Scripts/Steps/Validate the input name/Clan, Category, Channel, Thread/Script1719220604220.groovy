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

WebUI.navigateToUrl('https://mezon.vn/chat/clans/1779484504377790464/channels/1780415042869530624')

WebUI.switchToWindowTitle('Mezon')

WebUI.setText(findTestObject('Object Repository/Page_Mezon/input_WELCOME BACK_userEmail (1)'), '')

WebUI.click(findTestObject('Object Repository/Page_Mezon/div_WELCOME BACKSo glad to meet you againCo_a266bd (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Mezon/input_WELCOME BACK_userEmail (1)'), 'E2E1762357@ncc.asia')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mezon/input_WELCOME BACK_password (1)'), '9biZmnmyTHYoxEgCZK4szw==')

WebUI.click(findTestObject('Object Repository/Page_Mezon/button_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/p_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/span_Add Clan (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Mezon/input_CLAN NAME_darkbg-bgTertiary bg-F0F0F0_55ae1b'), 'tét')

WebUI.click(findTestObject('Object Repository/Page_Mezon/button_Create (1)'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/path_PUBLIC CHANNELS_Vector'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/input_concat(Choose channel, , s type)_drone (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Mezon/input_concat(What is channel, , s name)_Inp_6cdfb2'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Mezon/span_Create Channel (1)'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/svg_PUBLIC CHANNELS_w-4 h-4 darktext-CBD5E0_69c2e0'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/input_concat(Choose channel, , s type)_drone_1'))

WebUI.setText(findTestObject('Object Repository/Page_Mezon/input_concat(What is channel, , s name)_Inp_6cdfb2'), 'tetssdf')

WebUI.click(findTestObject('Object Repository/Page_Mezon/span_Create Channel (1)'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/svg_Settings_hovertext-black darkhovertext-_4ea53a'))

WebUI.click(findTestObject('Object Repository/Page_Mezon/span_Create Thread'))

WebUI.setText(findTestObject('Object Repository/Page_Mezon/input_Thread Name_h-10 p-10px darkbg-bgTert_95d095'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Mezon/textarea_h'), 'h')

WebUI.setText(findTestObject('Object Repository/Page_Mezon/textarea_hi'), 'hi')

