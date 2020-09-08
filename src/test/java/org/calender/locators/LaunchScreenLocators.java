package org.calender.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.calender.base.ScreenBase;
import org.openqa.selenium.WebElement;

public class LaunchScreenLocators extends ScreenBase {

    public LaunchScreenLocators(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.google.android.calendar:id/right_arrow_touch")
    public WebElement moveToNextScreen;

    @AndroidFindBy(id = "com.google.android.calendar:id/done_button")
    public WebElement gotIt;
}
