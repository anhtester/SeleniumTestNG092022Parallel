package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.drivers.DriverManager;
import anhtester.com.helpers.CaptureHelper;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestScreenshotOLD extends BaseTest {

    @BeforeClass
    public void setupClass() {
        CaptureHelper.startRecord("TestScreenshotOLD");
    }

    @Test
    public void testHomePage1(Method method) {
        DriverManager.getDriver().get("https://anhtester.com");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "Anh Tester Automation Testing");
    }

    @Test
    public void testHomePage2(Method method) {
        DriverManager.getDriver().get("https://anhtester.com");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "Anh Tester Automation Test");
    }

    @AfterMethod
    public void takeScreenshot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            CaptureHelper.captureScreenshot(result.getName());
        }
    }

    @AfterClass
    public void tearDownClass() {
        CaptureHelper.stopRecord();
    }
}
