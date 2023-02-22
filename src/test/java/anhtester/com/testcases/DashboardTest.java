package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.pages.customers.CustomersPage;
import anhtester.com.pages.DashboardPage;
import anhtester.com.pages.LoginPage;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomersPage customersPage;

    @Test
    public void testOpenMenuOnDashboard() {
        loginPage = new LoginPage();

        //Liên kết trang được xảy ra nhờ hàm login trả về là sự khởi tạo của trang Dashboard
        dashboardPage = loginPage.login("admin@example.com", "123456");

        //Kiểm tra trang Dashboard là đúng
        dashboardPage.verifyDashboardPage();

        //Kiểm tra menu Customers click vào mở được trang
        customersPage = dashboardPage.openCustomerPage();

        customersPage.verifyCustomersPage();
    }

    @Test
    public void testFilterWidgetsOnDashboard() {
        loginPage = new LoginPage();

        //Liên kết trang rồi
        dashboardPage = loginPage.login("admin@example.com", "123456");

        dashboardPage.verifyDashboardPage();
        //Check Filter Widgets on Dashboard
        dashboardPage.verifyFilterStatistics();

    }

}
