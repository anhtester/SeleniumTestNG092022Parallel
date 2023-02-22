package anhtester.com.pages.customers;

import anhtester.com.keywords.WebUI;
import static anhtester.com.keywords.WebUI.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddNewCustomerPage {

    private String PAGE_URL = "https://crm.anhtester.com/admin/clients/client";
    private String PAGE_TEXT = "Customer Details";

    public By tabCustomerDetail = By.xpath("//a[@aria-controls='contact_info']");
    public By company = By.xpath("//input[@id='company']");
    public By vat = By.xpath("//input[@id='vat']");
    public By phoneNumber = By.xpath("//input[@id='phonenumber']");
    public By website = By.xpath("//input[@id='website']");
    public By dropdownGroups = By.xpath("//label[@for='groups_in[]']/following-sibling::div");
    public By inputGroups = By.xpath("//label[@for='groups_in[]']/following-sibling::div//input[@type='search']");
    private By currency = By.xpath("//button[@data-id='default_currency']");
    private By language = By.xpath("//button[@data-id='default_language']");
    private By address = By.xpath("//textarea[@id='address']");
    private By city = By.xpath("//input[@id='city']");
    private By state = By.xpath("//input[@id='state']");
    private By zipcode = By.xpath("//input[@id='zip']");
    private By dropdownCountry = By.xpath("//label[@for='country']/following-sibling::div");
    private By inputCountry = By.xpath("//label[@for='country']/following-sibling::div//input[@type='search']");
    private By buttonSave = By.xpath("//div[@id='profile-save-section']//button[normalize-space()='Save']");

    public void selectGroups(String groupName){
        clickElement(dropdownGroups);
        getWebElement(inputGroups).sendKeys(groupName, Keys.ENTER);
        clickElement(dropdownGroups);
    }

    public void AddDataNewCustomer(String CUSTOMER_NAME) {
        waitForPageLoaded();

        setText(company, CUSTOMER_NAME);
        setText(vat, "10");
        setText(phoneNumber, "0123456789");
        setText(website, "https://anhtester.com");
        selectGroups("Gold");
        setText(address, "Vietnam");
        setText(city, "Can Tho");
        setText(state, "Can Tho");
        setText(zipcode, "92000");
        clickElement(dropdownCountry);
        getWebElement(inputCountry).sendKeys("Vietnam", Keys.ENTER);
        clickElement(buttonSave);

        waitForPageLoaded();
    }

}
