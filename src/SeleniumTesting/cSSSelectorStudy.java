package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSSSelectorStudy {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://secure.facebook.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("test@test.com");



        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("9923478750");
        driver.findElement(By.cssSelector("button[name='login']")).click();
    }
}
