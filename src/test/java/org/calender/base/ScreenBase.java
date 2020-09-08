package org.calender.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ScreenBase {

    public static AndroidDriver<AndroidElement> driver;

    public ScreenBase(AndroidDriver<AndroidElement> driver) {
        ScreenBase.driver = driver;
        loadElements();
    }

    public void loadElements() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
