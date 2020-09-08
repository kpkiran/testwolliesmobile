package org.calender.testcases;

import org.calender.Screens.LaunchScreen;
import org.calender.base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LaunchScreenTest extends TestBase {

    @BeforeTest
    public void init() {
        launchScreen = new LaunchScreen(driver);
    }

    @Test
    public void moveToNextScreen() throws InterruptedException {
        launchScreen.moveToNextScreen();
        launchScreen.moveToNextScreen();
        launchScreen.moveToNextScreen();
    }

    @Test
    public void gotItTest() {
        launchScreen.gotIt();
    }


}
