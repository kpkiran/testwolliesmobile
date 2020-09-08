package org.calender.Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.calender.base.ScreenBase;
import org.calender.locators.CalendarEntryScreenLocators;
import org.testng.Assert;

public class CalendarEntryScreen extends ScreenBase {

    CalendarEntryScreenLocators calendarEntryScreenLocators = new CalendarEntryScreenLocators(driver);

    public CalendarEntryScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void addEventEntry() {
        calendarEntryScreenLocators.addEventEntry.click();
    }

    public ScheduleEventsScreen addEvent() {
        Assert.assertTrue(calendarEntryScreenLocators.addEvent.isDisplayed());
        calendarEntryScreenLocators.addEvent.click();
        return new ScheduleEventsScreen(driver);
    }
}
