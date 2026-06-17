package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ixigo.com/trains?utm_source=bing&utm_medium=paid_search_bing_trains&utm_campaign=train_search_desktop_bing&msclkid=6f9c3e4bf3c61426ed89546d761c9db0&utm_term=irctc%20online%20reservation&utm_content=Ad%20group%201");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement fromField=driver.findElement(By.xpath("//*[@placeholder='Enter Origin']"));
        fromField.click();
        fromField.sendKeys("st");

        Thread.sleep(1000);
        List<WebElement> dropdownField =driver.findElements(By.xpath("//*[@class='w-full bg-white overflow-auto rounded-20 bg-subbrand pt-15  shadow-500 no-scrollbar']/div"));

        for(WebElement d :dropdownField)
        {
            System.out.println(d.getText());
        }
        System.out.println("================================");
        for(WebElement d:dropdownField)
        {
            if(d.getText().contains("Sitarampur (STN)"))
            {
                d.click();
                break;
            }
        }
        System.out.println("==========================================");
         driver.findElement(By.xpath("//*[@placeholder='Enter Destination']")).sendKeys("pu");
         Thread.sleep(1000);
           List<WebElement> toFieldList  =driver.findElements(By.xpath("//*[@class='w-full bg-white overflow-auto rounded-20 bg-subbrand pt-15  shadow-500 no-scrollbar']/div"));
           for(WebElement t:toFieldList)
           {
               System.out.println(t.getText());
           }

           Actions actions = new Actions(driver);
           for(WebElement t:toFieldList)
           {
               actions.sendKeys(Keys.ARROW_DOWN).perform();
               if(t.getText().contains("Pudukad (PUK)"))
               {
                   actions.sendKeys(t,Keys.ENTER).perform();
                   break;
               }
           }
    }
}
