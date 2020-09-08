package org.calender.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.calender.base.ScreenBase;

public class CalendarEntryScreenLocators extends ScreenBase {

    public CalendarEntryScreenLocators(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.google.android.calendar:id/floating_action_button")
    public AndroidElement addEventEntry;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Event']")
    public AndroidElement addEvent;




}
