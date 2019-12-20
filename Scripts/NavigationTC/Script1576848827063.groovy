import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\kkale\\Desktop\\Katalon Training\\ApiDemos-debug.apk', true)

Mobile.tap(findTestObject('Navigation-TapandHold/android.widget.TextView0 - Views'), 0)

Mobile.tap(findTestObject('Navigation-TapandHold/android.widget.TextView0 - Expandable Lists'), 0)

Mobile.tap(findTestObject('Navigation-TapandHold/android.widget.TextView0 - 1. Custom Adapter'), 0)

Mobile.tapAndHold(findTestObject('Navigation-TapandHold/android.widget.TextView0 - People Names'), 0, 0)

String text= Mobile.getText(findTestObject('Navigation-TapandHold/android.widget.TextView0 - Sample action'), 0, FailureHandling.STOP_ON_FAILURE)

println text

Mobile.tap(findTestObject('Navigation-TapandHold/android.widget.TextView0 - Sample action'), 0)

//text = Mobile.getAttribute(('Navigation-TapandHold/android.widget.TextView0 - Sample action'), 0)

//println text

//String text= Mobile.getText(('Navigation-TapandHold/android.widget.TextView0 - Sample action'), 0)


Mobile.closeApplication()

