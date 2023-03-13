package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.helpers.CaptureHelper;
import anhtester.com.pages.DashboardPage;
import anhtester.com.pages.LoginPage;
import anhtester.com.pages.customers.AddNewCustomerPage;
import anhtester.com.pages.customers.CustomerDetailPage;
import anhtester.com.pages.customers.CustomersPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class CustomersTest extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomersPage customersPage;
    AddNewCustomerPage addCustomerPage;
    CustomerDetailPage customerDetailPage;

    @Test
    public void testAddNewCustomer(Method method) {
        CaptureHelper.startRecord(method.getName());

        loginPage = new LoginPage();
        dashboardPage = loginPage.login("admin@example.com", "123456");
        customersPage = dashboardPage.openCustomerPage();

        //Kiểm tra trang Customer Page load được hay chưa và đúng hay chưa
        customersPage.verifyCustomersPage();
        //Click vào nút New Customer
        addCustomerPage = customersPage.clickNewCustomerButton();

        //Addison, Joseph, Adorno, Theodor, Keiko, Bailey, Philip James
        String CUSTOMER_NAME = "Theodor";
        addCustomerPage.AddDataNewCustomer(CUSTOMER_NAME);

        //Mở lại trang Customer
        dashboardPage.openCustomerPage();
        //Search giá trị Customer vừa Add
        customersPage.searchCustomer(CUSTOMER_NAME);
        //Click vào giá trị Customer Name dòng đầu tiên
        customerDetailPage = customersPage.clickOnFirstRowCustomerName();
        //Check Customer Detail
        customerDetailPage.checkCustomerDetail("Theodor");

    }

}
