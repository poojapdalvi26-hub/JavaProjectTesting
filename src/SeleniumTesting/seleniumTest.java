package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("span.b3wTlE")).click();
       int allLinks=driver.findElements(By.tagName("a")).size();

        System.out.println(allLinks);





    }

}
