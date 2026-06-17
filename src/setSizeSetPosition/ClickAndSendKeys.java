package setSizeSetPosition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);

          WebElement firstNmeField =driver.findElement(By.cssSelector("#name"));
          WebElement femaleRadioBt=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='Velocity';",firstNmeField);

        js.executeScript("arguments[0].click()",femaleRadioBt);

    }
}
