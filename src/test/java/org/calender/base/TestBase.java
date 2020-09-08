package org.calender.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.calender.Screens.CalendarEntryScreen;
import org.calender.Screens.LaunchScreen;
import org.calender.Screens.ScheduleEventsScreen;
import org.calender.utils.ApplicationUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBase {

    public static AndroidDriver<AndroidElement> driver;
    public static LaunchScreen launchScreen;
    public static CalendarEntryScreen calendarEntryScreen;
    public static ScheduleEventsScreen scheduleEventsScreen;

    @BeforeSuite
    public void setUp() throws IOException {
        if (driver == null) {
            ApplicationUtils.loadConfigFile("androidtestapp");
            ApplicationUtils.setAndroidCapabilities();
            driver = ApplicationUtils.getDriver();
        }
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
