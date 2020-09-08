package org.calender.Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.calender.base.ScreenBase;
import org.calender.locators.LaunchScreenLocators;

public class LaunchScreen extends ScreenBase {

    LaunchScreenLocators launchScreenLocators = new LaunchScreenLocators(driver);

    public LaunchScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void moveToNextScreen() {
        launchScreenLocators.moveToNextScreen.click();
    }

    public CalendarEntryScreen gotIt() {
        launchScreenLocators.gotIt.click();
        return new CalendarEntryScreen(driver);
    }
}
