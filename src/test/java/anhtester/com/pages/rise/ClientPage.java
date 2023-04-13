package anhtester.com.pages.rise;

import anhtester.com.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static anhtester.com.keywords.WebUI.*;

public class ClientPage {
    //Login object
    private By buttonSignin = By.xpath("//button[normalize-space()='Sign in']"); //

    //Dashboard object
    private By menuClient = By.xpath("//span[normalize-space()='Clients']");

    //Client object
    private By tabClients = By.xpath("//a[contains(text(),'Clients')]");
    private By dropdownClientGroup = By.xpath("//div[@id='client-table_filter']/following-sibling::div[2]");
    private By inputSearch = By.xpath("//div[@id='select2-drop']//div[@class='select2-search']//input");

    public void loginRiseCRM() {
        openURL("https://rise.fairsketch.com/signin");
        clickElement(buttonSignin);
    }

    public void openClientPage() {
        clickElement(menuClient);
        clickElement(tabClients);
    }

    public void filterClientGroup(String value) {
        clickElement(dropdownClientGroup);
        setText(inputSearch, value);
        getWebElement(inputSearch).sendKeys(Keys.ENTER);
    }

    public void checkSearchTableByColumn(int column, String value) {
        filterClientGroup(value);
        waitForPageLoaded();
        sleep(2);

        //Xác định số dòng của table sau khi search
        List<WebElement> row = DriverManager.getDriver().findElements(By.xpath("//table//tbody/tr"));
        int rowTotal = row.size(); //Lấy ra số dòng
        System.out.println("Số dòng tìm thấy: " + rowTotal);

        //Duyệt từng dòng
        for (int i = 1; i <= rowTotal; i++) {
            WebElement elementCheck = DriverManager.getDriver().findElement(By.xpath("//table//tbody/tr[" + i + "]/td[" + column + "]"));

            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", elementCheck);

            System.out.print(value + " - ");
            System.out.println(elementCheck.getText());
            Assert.assertTrue(elementCheck.getText().toUpperCase().contains(value.toUpperCase()), "Dòng số " + i + " không chứa giá trị tìm kiếm.");
        }

    }

}
