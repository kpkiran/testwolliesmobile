package org.calender.testcases;

import org.calender.utils.ApplicationUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
//        test = extent.createTest(iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
//        test.log(Status.PASS, "Test Passed");
    }


    @Override
    public void onTestFailure(ITestResult iTestResult) {
//        test.fail(iTestResult.getThrowable());
        String random = iTestResult.getName();
        try {
            ApplicationUtils.getScreenshot(random);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
//        extent.flush();
    }
}
