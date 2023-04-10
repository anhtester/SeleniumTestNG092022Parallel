package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.drivers.DriverManager;
import anhtester.com.helpers.SystemsHelper;
import anhtester.com.keywords.WebUI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class HandleUploadFile extends BaseTest {

    @Test
    public void testUploadFileWithSendKeys() throws InterruptedException {
        DriverManager.getDriver().get("https://cgi-lib.berkeley.edu/ex/fup.html");

        Thread.sleep(2000);

        By inputFileUpload = By.xpath("//input[@name='upfile']");

        //DriverManager.getDriver().findElement(inputFileUpload).sendKeys("D:\\EmailFetch.txt");
        //WebUI.setText(inputFileUpload, System.getProperty("user.dir") + "/src/test/resources/datatest/Sample_File_Word.docx");
        WebUI.setText(inputFileUpload, SystemsHelper.getCurrentDir() + "src/test/resources/datatest/Sample_File_Word.docx");

        Thread.sleep(4000);
    }

    @Test
    public void testUploadFile1() throws InterruptedException {
        DriverManager.getDriver().get("https://files.fm/");

        Thread.sleep(2000);

        By inputFile = By.xpath("//input[@id='file_upload']");
        //Không thể dùng sendKeys để uplaod trong trường hợp này (đặc biệt)
        WebUI.setText(inputFile, SystemsHelper.getCurrentDir() + "src/test/resources/datatest/Sample_File_Word.docx");

        Thread.sleep(2000);
    }

    @Test
    public void testUploadFile2() throws InterruptedException {
        DriverManager.getDriver().get("https://files.fm/");

        Thread.sleep(2000);

        By textOnPage = By.xpath("//div[@id='file_select_dragndrop_text']");
        By divFileUpload = By.xpath("//div[@id='uploadifive-file_upload']");
        By inputFileUpload = By.xpath("//div[@id='file_select_button']//input[@id='file_upload']");

        //Dùng dấu \\ để phân cách folder nếu link trực tiếp trong ổ đĩa máy tính Windows
        String filePath = SystemsHelper.getCurrentDir() + "src\\test\\resources\\datatest\\Sample_File_Word.docx";

        //Click để mở form upload
        DriverManager.getDriver().findElement(divFileUpload).click();
        Thread.sleep(3);

        // Khởi tạo Robot class
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Copy File path vào Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        Thread.sleep(1000);

        // Nhấn Control+V để dán
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // Xác nhận Control V trên
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        Thread.sleep(1000);

        // Nhấn Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(4000);
        String statusText = WebUI.getTextElement(By.xpath("//div[@id='upload_stats_text']"));
        Assert.assertTrue(statusText.contains("Selected files 1"), "Fail. Can not upload file.");

    }

}
