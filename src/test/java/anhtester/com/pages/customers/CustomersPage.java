package anhtester.com.pages.customers;

import anhtester.com.keywords.WebUI;
import static anhtester.com.keywords.WebUI.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomersPage {
    //Các thuộc tính xác thực Customers Page
    private String PAGE_URL = "https://crm.anhtester.com/admin/clients";
    private String PAGE_TEXT = "Customers Summary";

    //Objects thuộc Customers Page
    private By headerPageCustomers = By.xpath("(//div[@class='panel-body']//h4)[1]");
    private By buttonAddCustomer = By.xpath("//a[normalize-space()='New Customer']");
    private By buttonImportCustomer = By.xpath("//a[normalize-space()='Import Customers']");
    private By buttonContacts = By.xpath("//div[@class='_buttons']//a[normalize-space()='Contacts']");
    private By inputSearch = By.xpath("//div[@id='DataTables_Table_0_filter']//input");
    private By tdCustomerName = By.xpath("//table[@id='DataTables_Table_0']//tbody/tr[1]/td[3]/a");

    //Các hàm xử lý cho chức năng thuộc Customers Page
    public void verifyCustomersPage() {
        Assert.assertEquals(getCurrentUrl(), PAGE_URL, "URL chưa đúng trang Customers.");
        Assert.assertTrue(checkElementExist(headerPageCustomers), "Header Page Customers not existing.");
        Assert.assertEquals(getTextElement(headerPageCustomers), PAGE_TEXT, "Header Page of Customers page not match.");

    }

    public AddNewCustomerPage clickNewCustomerButton(){
        clickElement(buttonAddCustomer);
        return new AddNewCustomerPage();
    }

    public void searchCustomer(String companyName){
        waitForPageLoaded();
        setText(inputSearch, companyName);
        sleep(2);
    }

    public CustomerDetailPage clickOnFirstRowCustomerName(){
        waitForPageLoaded();
        clickElement(tdCustomerName);

        return new CustomerDetailPage();
    }


}
