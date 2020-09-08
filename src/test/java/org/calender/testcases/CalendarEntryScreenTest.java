package org.calender.testcases;

import org.calender.Screens.CalendarEntryScreen;
import org.calender.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalendarEntryScreenTest extends TestBase {

    @BeforeTest
    public void init() {
        calendarEntryScreen = new CalendarEntryScreen(driver);
    }

    @Test
    public void addEventEntry() {
        calendarEntryScreen.addEventEntry();
    }

    @Test
    public void addEvent() {
        calendarEntryScreen.addEvent();
    }
}
