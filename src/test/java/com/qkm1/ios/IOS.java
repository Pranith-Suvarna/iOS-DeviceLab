package com.qkm1.ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class IOS {
	
	
	IOSDriver driver;
	
	@BeforeClass
	public void startDriver() throws MalformedURLException {
		
		
	/*		DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("Capability_Username", "pranith.suvarna@qualitykiosk.com");
			capabilities.setCapability("Capability_ApiKey", "qb4jvt423vvsq59x7wqr6myz");
			capabilities.setCapability("Capability_DurationInMinutes", 10);
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("launchTimeout", 90000);
			capabilities.setCapability("Capability_DeviceFullName", "APPLE_iPhone6S_iOS_12.4.0_20441");
			capabilities.setCapability("platformVersion", "12.4.0");
			capabilities.setCapability("platformName", "ios");
			capabilities.setCapability("acceptAlerts", true);
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("Capability_ApplicationName", "Test_Resigned1636635450.ipa");
			capabilities.setCapability("bundleId", "com.pcloudy.TestmunkDemo");
	//		capabilities.setCapability("Capability_ApplicationName", "bitbar-ios-sample_Resigned1637021670.ipa");
	//		capabilities.setCapability("bundleId", "com.bitbar.testdroid.BitbarIOSSample");
			capabilities.setCapability("Capability_WildNet", "false");
			capabilities.setCapability("Capability_EnableVideo", "true");
			capabilities.setCapability("Capability_EnablePerformanceData", "true");
			capabilities.setCapability("Capability_EnableDeviceLogs", "true");
			capabilities.setCapability("appiumVersion", "1.20.2");
			driver = new IOSDriver<WebElement>(new URL("https://qkm1.qualitykiosk.com/appiumcloud/wd/hub"), capabilities);
	*/		
		
		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("Capability_Username", "pranith.suvarna@qualitykiosk.com");
			capabilities.setCapability("Capability_ApiKey", "3wq7qph62473cbmyf4yw5y74");
			capabilities.setCapability("Capability_DurationInMinutes", 10);
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("launchTimeout", 90000);
			capabilities.setCapability("Capability_DeviceFullName", "APPLE_iPhoneX_iOS_14.0.1_ed704");
			capabilities.setCapability("platformVersion", "14.0.1");
			capabilities.setCapability("platformName", "ios");
			capabilities.setCapability("acceptAlerts", true);
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("Capability_ApplicationName", "Test_Resigned1644905162.ipa");
			capabilities.setCapability("bundleId", "com.pcloudy.TestmunkDemo");
			capabilities.setCapability("Capability_WildNet", "false");
			capabilities.setCapability("Capability_EnableVideo", "true");
			capabilities.setCapability("Capability_EnablePerformanceData", "true");
			capabilities.setCapability("Capability_EnableDeviceLogs", "true");
			capabilities.setCapability("appiumVersion", "1.20.2");
			driver = new IOSDriver<WebElement>(new URL("https://qkm1vil.qualitykiosk.com/appiumcloud/wd/hub"), capabilities);
			
			/*
			  APPLE_iPhone5S_iOS_11.4.0_a20ea
              APPLE_iPhoneXS_iOS_13.6.1_d75f7
              APPLE_iPhone8_iOS_14.2.0_f5a0e
              APPLE_iPhone12Pro_iOS_14.6.0_d3970
              APPLE_iPhone11Pro_iOS_15.1.0_1937e
              APPLE_iPhone11_iOS_14.4.2_9158d
              APPLE_iPhone6S_iOS_12.4.0_20441
              APPLE_iPadAir_iOS_14.7.1_846e1
              APPLE_iPad9.7_iOS_13.6.1_7e6a9
              APPLE_iPhone8plus_iOS_13.3.1_136e1
              APPLE_iPhone7plus_iOS_13.3.0_159ad
              APPLE_iPhoneX_iOS_14.6.0_82049
              APPLE_iPhoneSE2020_iOS_13.6.1_f015d
            */
			
		} 
		
	
	@Test
    public void test_01() throws InterruptedException {
    	  
		/*
		   int s=driver.findElements(By.name("Trust")).size();
		   System.out.println(s);
	       List<WebElement>a=driver.findElements(By.name("Trust"));
	       a.get(0).click();
	    */
		   Thread.sleep(5000);	
		   if (driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Trust']")).size() > 0) {
		  		if ( driver.findElementByXPath("//XCUIElementTypeButton[@name='Trust']").isDisplayed()) {
		  				      driver.findElementByXPath("//XCUIElementTypeButton[@name='Trust']").click();
		  				}
		  			}
		   
		    ((WebElement)(new WebDriverWait((WebDriver)driver, 60L)).until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")))).sendKeys("test@testname.com");			
			driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]")).sendKeys("testmunk");
			Thread.sleep(2000);
	    	driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")).click();
	    	
	   /*   
			driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Email']")).sendKeys("test@testname.com");
			System.out.println("Entered email");
			driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@value='Password']")).sendKeys("testmunk");
			System.out.println("Entered pass");
			Thread.sleep(2000);
	    	driver.findElement(By.xpath("//XCUIElementTypeButton[@class='SIGN IN']")).click();
			System.out.println("Clicked SIGN IN");
	   */
    }

	@Test
    public void test_02() throws InterruptedException {
    	
		Thread.sleep(2000);
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"Skip\"")))).click();
		Thread.sleep(2000);
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"iconSlide\"")))).click();
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"Photos\"")))).click();
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"Hot air balloons\"")))).click();
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"Done\"")))).click();
		Thread.sleep(2000);
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"iconSlide\"")))).click();
		Thread.sleep(2000);
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"MapView\"")))).click();
		Thread.sleep(2000);
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"iconSlide\"")))).click();
		Thread.sleep(2000);
        ((WebElement)new WebDriverWait(driver, 90L).until(ExpectedConditions.presenceOfElementLocated(MobileBy.iOSNsPredicateString("label CONTAINS \"Home\"")))).click();
        Thread.sleep(2000);

    }
    
    @AfterClass
    public void quitDriver() {
    	
        driver.quit();
   	}
    
}
