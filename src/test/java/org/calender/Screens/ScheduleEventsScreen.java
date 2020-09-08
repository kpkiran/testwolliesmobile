package org.calender.Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.calender.base.ScreenBase;
import org.calender.locators.ScheduleEventsScreenLocators;
import org.testng.Assert;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.Assert.assertTrue;

public class ScheduleEventsScreen extends ScreenBase {

    ScheduleEventsScreenLocators scheduleEventsScreenLocators = new ScheduleEventsScreenLocators(driver);

    public ScheduleEventsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void verifyElementsPresent() {
        String pattern = "E, MMM d, yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        assertTrue(scheduleEventsScreenLocators.inviteTitle.isDisplayed());
        Assert.assertEquals(scheduleEventsScreenLocators.startDate.getText(), date);
        assertTrue(scheduleEventsScreenLocators.allDaySwitch.isEnabled());
        assertTrue(scheduleEventsScreenLocators.moreOptions.isDisplayed());
    }

    public void enterMeetingTitle() {
        scheduleEventsScreenLocators.inviteTitle.sendKeys("Team Meeting");
    }

    public void enterStartDate() {
        scheduleEventsScreenLocators.startDate.click();
        scheduleEventsScreenLocators.eleventh.click();
        scheduleEventsScreenLocators.ok.click();

        Assert.assertEquals("Fri, Sep 11, 2020", scheduleEventsScreenLocators.startDate.getText());
    }

    public void enterReccuringDays() {
        scheduleEventsScreenLocators.moreOptions.click();
        scheduleEventsScreenLocators.doesNotRepeat.click();
        scheduleEventsScreenLocators.customOption.click();
        scheduleEventsScreenLocators.monday.click();
        scheduleEventsScreenLocators.wednesday.click();
        scheduleEventsScreenLocators.repeatDaysDone.click();

        Assert.assertEquals("Repeats weekly on Mon, Wed, Fr", scheduleEventsScreenLocators.repeatWeekly.getText());
    }

    public void invitePeople(String data) {
        scheduleEventsScreenLocators.invitePeople.sendKeys(data);
    }

    public void saveInvite() {
        scheduleEventsScreenLocators.save.click();
    }
}
