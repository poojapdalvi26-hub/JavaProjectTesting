package readDataFromPropertiesFile;

import commonMethods.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TutorialPointTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Utility.readDataFromPropertiesFile("url"));
        driver.manage().window().maximize();

      WebElement name= driver.findElement(By.cssSelector("#name"));
       WebElement email=driver.findElement(By.cssSelector("#email"));
       WebElement mobile=driver.findElement(By.cssSelector("#mobile"));

       name.sendKeys(Utility.readDataFromExcel(0,0));
       email.sendKeys(Utility.readDataFromExcel(1,0));
       mobile.sendKeys(Utility.readDataFromExcel(2,0));

          Utility.takeScreenshot(driver,"TutorialPoint");
    }
}
