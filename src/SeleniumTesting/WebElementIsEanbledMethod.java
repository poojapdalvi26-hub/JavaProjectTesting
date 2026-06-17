package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsEanbledMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement yesButton=driver.findElement(By.xpath("//input[@value='igottwo']"));
         Boolean yesStatus=yesButton.isEnabled();

        System.out.println("Yes button in enabled " +yesStatus);
         if(yesStatus)
         {
             yesButton.click();
             System.out.println("yes button is clicked");

         }
         else {
             System.out.println("Unable to click on yes button ");
         }

    }
}
