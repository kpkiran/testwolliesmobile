package org.calender.testcases;

import org.calender.Screens.ScheduleEventsScreen;
import org.calender.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScheduleEventsScreenTest extends TestBase {

    @BeforeTest
    public void init() {
        scheduleEventsScreen = new ScheduleEventsScreen(driver);
    }

    @Test
    public void verifyElementsPresent() {
        scheduleEventsScreen.verifyElementsPresent();
    }

    @Test
    public void enterMeetingTitle() {
        scheduleEventsScreen.enterMeetingTitle();
    }

    @Test
    public void setRecurringDate() {
        scheduleEventsScreen.enterStartDate();
        scheduleEventsScreen.enterReccuringDays();
    }

    @Test(dataProvider = "data-provider")
    public void invitePeople(String data) {
        scheduleEventsScreen.invitePeople(data);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "testone@gmail.com" }, { "testtwo@gmail.com" } };
    }

    @Test
    public void saveInvite() {
        scheduleEventsScreen.saveInvite();
    }

}
