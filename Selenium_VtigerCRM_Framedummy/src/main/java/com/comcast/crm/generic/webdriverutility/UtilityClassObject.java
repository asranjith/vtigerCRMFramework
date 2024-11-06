package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class UtilityClassObject {
	
	public static ThreadLocal<ExtentTest>test=new ThreadLocal<ExtentTest>();
	public static ThreadLocal<WebDriver>driver=new ThreadLocal<WebDriver>();
	
	//getters and setters for test
	
	public static ExtentTest getTest() {
		return test.get();
		
	}
	public static void setTest(ExtentTest actTest) {
		test.set(actTest);
		
	}
	
	//getters and setters for driver
	public static WebDriver getDriver() {
		return driver.get();
		
	}
	public static void setDriver(WebDriver actDriver) {
		driver.set(actDriver);
		
	}

}
