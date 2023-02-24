package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.helpers.PropertiesHelper;
import anhtester.com.keywords.WebUI;
import anhtester.com.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

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

        //Gọi hàm "login" từ LoginPage để dùng
        loginPage.login("admin@example.com", "123456");
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
