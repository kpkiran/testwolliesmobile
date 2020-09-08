package org.calender.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationUtils {

	private static Properties properties = new Properties();
	public static int EXPLICIT_WAIT_TIME;
	public static int IMPLICIT_WAIT_TIME;
	public static int DEFAULT_WAIT_TIME;
	public static String APPLICATION_PACKAGE;
	public static String APPLICATION_ACTIVITY;
	public static String APPIUM_SERVER_PORT;
	public static String AUTOMATION_INSTRUMENTATION;
	public static String DEVICE_NAME;
	public static String PLATFORM_NAME;
	public static String PLATFORM_VERSION;
	public static String COMMAND_TIMEOUT;
	public static String DEVICE_TIMEOUT;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static URL serverUrl;
	private static AndroidDriver<AndroidElement> driver;

	public static void loadConfigFile(String propertyFileName)
			throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")
						+ "/src/test/java/resources/properties/" + propertyFileName
						+ ".properties");
		
		properties.load(fis);

		EXPLICIT_WAIT_TIME = Integer.parseInt(properties
				.getProperty("explicit.wait"));
		IMPLICIT_WAIT_TIME = Integer.parseInt(properties
				.getProperty("implicit.wait"));
		DEFAULT_WAIT_TIME = Integer.parseInt(properties
				.getProperty("default.wait"));
		APPLICATION_PACKAGE = properties.getProperty("app.package");
		APPLICATION_ACTIVITY = properties.getProperty("app.activity");
		APPIUM_SERVER_PORT = properties.getProperty("appium.server.port");
		AUTOMATION_INSTRUMENTATION = properties
				.getProperty("automation.instrumentation");
		DEVICE_NAME = properties.getProperty("device.name");
		PLATFORM_NAME = properties.getProperty("platform.name");
		PLATFORM_VERSION = properties.getProperty("platform.version");
		COMMAND_TIMEOUT = properties.getProperty("new.command.timeout");
		DEVICE_TIMEOUT = properties.getProperty("device.ready.timeout");
	}

	public static void setAndroidCapabilities() {
//		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
//				"APPIUM");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				ApplicationUtils.DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				ApplicationUtils.PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				ApplicationUtils.PLATFORM_VERSION);
		capabilities.setCapability("appActivity",
				ApplicationUtils.APPLICATION_ACTIVITY);
		capabilities.setCapability("appPackage",
				ApplicationUtils.APPLICATION_PACKAGE);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
	}
	
	public static AndroidDriver<AndroidElement> getDriver() throws MalformedURLException {
		serverUrl = new URL("http://127.0.0.1:"+APPIUM_SERVER_PORT+"/wd/hub");
		driver = new AndroidDriver<AndroidElement>(serverUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(ApplicationUtils.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		return driver;
	}

	public static void getScreenshot(String random) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")
				+ "/reports/" + random + ".png"));
	}
}