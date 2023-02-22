package anhtester.com.pages.customers;

import anhtester.com.keywords.WebUI;
import static anhtester.com.keywords.WebUI.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerDetailPage extends AddNewCustomerPage {

    //Object in Customer Detail page
    //Không phải khai báo lại Object vì đã kế thừa từ AddNewCustomerPage
    //Không bị duplicated
    //Tiết kiệm thời gian
    //Lỡ có thay đổi thì chỉ cần sửa ở 1 nơi => AddNewCustomerPage

    public void checkCustomerDetail(String customerName) {
        WebUI.waitForPageLoaded();
        System.out.println(getAttributeElement(company, "value"));
        System.out.println(getAttributeElement(vat, "value"));
        System.out.println(getAttributeElement(phoneNumber, "value"));

        //Kiểm tra thì phải dùng Assert
        //Phải dùng Equals chứ không nên dùng Contains vì giá trị phải đúng chính xác
        Assert.assertEquals(getAttributeElement(company, "value"), customerName, "Company Name not match.");
        Assert.assertEquals(getAttributeElement(vat, "value"), "10", "VAT not match.");
        Assert.assertEquals(getAttributeElement(phoneNumber, "value"), "0123456789", "Phone Number not match.");

    }

}
