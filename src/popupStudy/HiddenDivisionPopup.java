package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("iphone17");
        driver.findElement(By.xpath("//button[@class='XFwMiH']")).click();
    }
}
