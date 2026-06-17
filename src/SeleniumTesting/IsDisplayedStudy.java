package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

         WebElement textboxField=driver.findElement(By.cssSelector("input#displayed-text"));

         Boolean textboxFieldStatus =textboxField.isDisplayed();

        System.out.println(" textbox status is " +textboxFieldStatus);

        driver.findElement(By.cssSelector("input#hide-textbox")).click();

        Boolean textboxFieldStatus1 =textboxField.isDisplayed();


        System.out.println(" textbox status is " +textboxFieldStatus1);
    }
}
