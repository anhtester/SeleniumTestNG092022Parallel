package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.constant.ConstantGlobal;
import anhtester.com.dataproviders.DataLogin;
import anhtester.com.helpers.ExcelHelper;
import anhtester.com.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class LoginTest extends BaseTest {

    @Test
    public void testSetDataToExcel() {
        LoginPage loginPage = new LoginPage();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/datatest/CRM.xlsx", "Login");
        loginPage.login(excelHelper.getCellData("EMAIL", 1), excelHelper.getCellData("PASSWORD", 1));
        //Chạy tới dòng này nghĩa là Passed
        excelHelper.setCellData("Passed", 1, "RESULT");
    }

    @Test(dataProvider = "dataProviderLoginCRM", dataProviderClass = DataLogin.class)
    public void testDataProviderLoginCRM(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Test(dataProvider = "data_provider_login_excel", dataProviderClass = DataLogin.class)
    public void loginTestFromDataProviderReadExcel(String email, String password, String result) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Test(dataProvider = "data_provider_login_excel_custom_row", dataProviderClass = DataLogin.class)
    public void loginTestFromDataProviderReadExcelCustomRow(Hashtable<String, String> data) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(data.get("EMAIL"), data.get("PASSWORD"));
    }

    @Test
    public void loginTestInvalidEmail() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin123@example.com", "123456");
    }

}
