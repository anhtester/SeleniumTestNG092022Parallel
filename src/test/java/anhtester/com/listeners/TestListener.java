package anhtester.com.listeners;

import anhtester.com.helpers.CaptureHelper;
import anhtester.com.helpers.PropertiesHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext result) {
        PropertiesHelper.loadAllFiles();
        //Khởi tạo report (Extent và Allure)
    }

    @Override
    public void onFinish(ITestContext result) {
        //Đóng report
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case " + result.getName() + " is passed.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case " + result.getName() + " is failed.");
        //Screenshot khi fail
        CaptureHelper.captureScreenshot(result.getName());
        System.out.println(result.getThrowable().toString());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case " + result.getName() + " is skipped.");
        System.out.println(result.getThrowable().toString());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Đây là test case bị Fail nhưng có phần Success: " + result.getName());
        System.out.println(result.getThrowable().toString());
    }
}
