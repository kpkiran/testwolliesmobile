package org.calender.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.calender.base.ScreenBase;

public class ScheduleEventsScreenLocators extends ScreenBase {

    public ScheduleEventsScreenLocators(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Switch[@text='OFF']")
    public AndroidElement allDaySwitch;

    @AndroidFindBy(id = "com.google.android.calendar:id/start_date")
    public AndroidElement startDate;

    @AndroidFindBy(id = "com.google.android.calendar:id/more_options")
    public AndroidElement moreOptions;

    @AndroidFindBy(id = "com.google.android.calendar:id/input")
    public AndroidElement inviteTitle;

    @AndroidFindBy(id = "com.google.android.calendar:id/save")
    public AndroidElement save;

    @AndroidFindBy(xpath = "//android.view.View[@text='11']")
    public AndroidElement eleventh;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public AndroidElement ok;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Does not repeat']")
    public AndroidElement doesNotRepeat;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Custom…']")
    public AndroidElement customOption;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='MON']")
    public AndroidElement monday;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='WED']")
    public AndroidElement wednesday;

    @AndroidFindBy(id = "com.google.android.calendar:id/done")
    public AndroidElement repeatDaysDone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Repeats weekly on Mon, Wed, Fri']")
    public AndroidElement repeatWeekly;

    @AndroidFindBy(id = "com.google.android.calendar:id/guest_input")
    public AndroidElement invitePeople;
}
