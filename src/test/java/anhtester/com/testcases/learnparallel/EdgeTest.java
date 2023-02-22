package anhtester.com.testcases.learnparallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class EdgeTest {

      @Test
      public void EdgeTest1() throws InterruptedException {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();
            driver.quit();
      }

      @Test
      public void EdgeTest2() throws InterruptedException {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();
            driver.quit();
      }

      @Test
      public void EdgeTest3() throws InterruptedException {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://anhtester.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();
            driver.quit();
      }


}