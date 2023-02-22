package anhtester.com.pages;

import anhtester.com.keywords.WebUI;

import static anhtester.com.keywords.WebUI.*;

import anhtester.com.pages.customers.CustomersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {

    //Data trong nội bộ trang Dashboard
    private String PAGE_URL = "https://crm.anhtester.com/admin/";
    private String PAGE_TEXT = "Dashboard Options";

    //Các Object
    By menuCustomer = By.xpath("//span[normalize-space()='Customers']");
    By buttonOptionDashboard = By.xpath("//div[@class='screen-options-btn']");

    By widgetStatistics = By.xpath("//div[@id='widget-top_stats']");

    By checkboxQuickStatistics = By.xpath("//label[normalize-space()='Quick Statistics']");


    public void verifyDashboardPage() {
        //Kiểm tra URL chứa phần thuộc trang DB
        //Kiểm tra Text hoặc Object chỉ có trang DB có
        Assert.assertEquals(getCurrentUrl(), PAGE_URL, "URL chưa đúng trang Dashboard.");
        Assert.assertTrue(checkElementExist(buttonOptionDashboard), "Dashboard Options not existing.");
    }

    //Hàm xử lý
    public CustomersPage openCustomerPage() {
        waitForPageLoaded();
        clickElement(menuCustomer);
        return new CustomersPage();
    }

    public void clickCheckboxQuickStatistics() {
        clickElement(buttonOptionDashboard);
        clickElement(checkboxQuickStatistics);
    }

    public void verifyFilterStatistics() {
        //Kiểm tra widget này đang hiển thị (visible)
        Assert.assertTrue(verifyElementVisible(widgetStatistics, 5), "The Widget Statistics default does not visible.");
        //Nhấn uncheck this widget
        clickCheckboxQuickStatistics();
        //Kiểm tra widget trên đã bị ẩn (not visible)
        Assert.assertTrue(verifyElementNotVisible(widgetStatistics, 5), "The Widget Statistics is visible.");

    }

}
