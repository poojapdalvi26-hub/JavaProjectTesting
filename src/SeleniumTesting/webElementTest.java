package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Velocity");

        WebElement emailField =driver.findElement(By.id("email"));

        emailField.sendKeys("test@test.com");
        Thread.sleep(3000);
        emailField.clear();
        Thread.sleep(2000);
        emailField.sendKeys("testing@test.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        Thread.sleep(2000);

        WebElement mobileField=driver.findElement(By.cssSelector("input#mobile"));
        mobileField.sendKeys("9978773838");

        Thread.sleep(3000);

        driver.findElement(By.name("subjects")).sendKeys("Software testing");
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        Thread.sleep(3000);
            driver.close();
    }
}
