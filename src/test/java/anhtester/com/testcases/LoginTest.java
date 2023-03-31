package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.constant.ConstantData;
import anhtester.com.dataproviders.DataLogin;
import anhtester.com.helpers.ExcelHelper;
import anhtester.com.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

//    @BeforeClass
//    public void setupClass() {
//        CaptureHelper.startRecord("LoginTest");
//    }
//
//    @AfterClass
//    public void tearDownClass() {
//        CaptureHelper.stopRecord();
//    }

    @Test
    public void testSetDataToExcel() {
        loginPage = new LoginPage();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/datatest/CRM.xlsx", "Login");
        loginPage.login(excelHelper.getCellData(ConstantData.EMAIL, 1), excelHelper.getCellData("PASSWORD", 1));
        //Chạy tới dòng này nghĩa là Passed
        excelHelper.setCellData("Passed", 1, "RESULT");
    }

    @Test(dataProvider = "dataProviderLoginCRM", dataProviderClass = DataLogin.class)
    public void testDataProviderLoginCRM(String email, String password) {
        loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Test(dataProvider = "data_provider_login_excel", dataProviderClass = DataLogin.class)
    public void loginTestFromDataProviderReadExcel(String email, String password, String result) {
        loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Test(dataProvider = "data_provider_login_excel_custom_row", dataProviderClass = DataLogin.class)
    public void loginTestFromDataProviderReadExcelCustomRow(Hashtable<String, String> data) {
        loginPage = new LoginPage();
        loginPage.login(data.get("EMAIL"), data.get("PASSWORD"));
    }

    @Test
    public void loginTestInvalidEmail() {
        loginPage = new LoginPage();
        loginPage.loginInvalidEmail("admin123@example.com", "123456");
    }

}
