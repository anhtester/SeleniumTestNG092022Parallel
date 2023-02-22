package anhtester.com.testcases.learnparallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTest {

//      @Test
//      public void FirefoxTest() throws InterruptedException {
//            WebDriverManager.firefoxdriver().setup();
//            WebDriver driver = new FirefoxDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            driver.get("https://anhtester.com");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();
//            driver.quit();
//      }
//
//      @Test
//      public void EdgeTest() throws InterruptedException {
//            WebDriverManager.edgedriver().setup();
//            WebDriver driver = new EdgeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            driver.get("https://anhtester.com");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();
//            driver.quit();
//      }

      @Test
      public void ChromeTest1() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='API Testing']")).click();
            driver.quit();
      }

      @Test
      public void ChromeTest2() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='API Testing']")).click();
            driver.quit();
      }

      @Test
      public void ChromeTest3() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='API Testing']")).click();
            driver.quit();
      }

      @Test
      public void ChromeTest4() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='API Testing']")).click();
            driver.quit();
      }

      @Test
      public void ChromeTest5() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='API Testing']")).click();
            driver.quit();
      }


}