package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.drivers.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class TestScreenshot extends BaseTest {
    @Test
    public void testHomePage1() {
        DriverManager.getDriver().get("https://anhtester.com/login");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "Login | Anh Tester Blog");
    }

    @Test
    public void testHomePage2(Method method) {
        DriverManager.getDriver().get("https://anhtester.com/login");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "Login");
    }

//    @AfterMethod
//    public void tearDown(ITestResult iTestResult) {
//
//        if (iTestResult.getStatus() == ITestResult.FAILURE) {
//            //Chụp màn hình
//
//            CaptureHelper.captureScreenshot(iTestResult.getName());
//
//        }
//
//    }

}
