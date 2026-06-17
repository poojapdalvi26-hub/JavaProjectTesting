package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeHiddenDivision {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@class,'xkp9Hl ZvCKfk')]")).sendKeys("Velocity");
        driver.findElement(By.cssSelector("span.b3wTlE")).click();
        driver.findElement(By.xpath("//input[contains(@class,'nw1UBF v1zwn25')]")).sendKeys("mobiles");
    }
}
