package iframeStudy;

import commonMethods.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Utility1.readDataFromPropertiesFile("url"));
        driver.manage().window().maximize();

        driver.switchTo().frame("pact1");
        driver.findElement(By.id("inp_val")).sendKeys("Testing");
        driver.findElement(By.id("lost")).click();

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[contains(text(),'Courses')]\t\t")).click();


    }


}
