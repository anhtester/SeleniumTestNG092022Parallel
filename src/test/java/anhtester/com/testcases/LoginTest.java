package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.constant.ConstantData;
import anhtester.com.helpers.ExcelHelper;
import anhtester.com.helpers.PropertiesHelper;
import anhtester.com.keywords.WebUI;
import anhtester.com.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

//    @AfterMethod
//    public void getStatusTestCases(ITestResult result) {
//        if (result.getStatus() == ITestResult.FAILURE && result.getTestName() == "loginTestSuccess2") {
//            //Screenshot
//            //Ghi logs
//            //Set result to Excel
//            ExcelHelper excelHelper = new ExcelHelper();
//            excelHelper.setExcelFile("src/test/resources/datatest/CRM.xlsx", "Login");
//            excelHelper.setCellData("Failed", , "RESULT");
//        }
//    }

    @Test
    public void loginTestSuccess1() {
        //Khởi tạo đối tượng trang LoginPage
        //Truyền driver từ BaseTest
        loginPage = new LoginPage();

        //Gọi hàm "login" từ LoginPage để dùng
        loginPage.login(PropertiesHelper.getValue("email"), PropertiesHelper.getValue("password"));

        PropertiesHelper.setFile("src/test/resources/configs/data.properties");
        PropertiesHelper.setValue("label", WebUI.getTextElement(By.xpath("//span[normalize-space()='Invoice overview']")));
    }

    @Test
    public void loginTestSuccess2() {
        //Khởi tạo đối tượng trang LoginPage
        //Truyền driver từ BaseTest
        loginPage = new LoginPage();

        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/datatest/CRM.xlsx", "Login");

        //Gọi hàm "login" từ LoginPage để dùng
        loginPage.login(excelHelper.getCellData(ConstantData.EMAIL, 1), excelHelper.getCellData("PASSWORD", 1));

        //Chạy tới dòng này nghĩa là Passed
        excelHelper.setCellData("Passed", 1, "RESULT");

    }

    @Test
    public void loginTestInvalidEmail1() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail2() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail3() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail4() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail5() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail6() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail7() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }

    @Test
    public void loginTestInvalidEmail8() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin@example.com123", "123456");
    }


}
