package actionsStudy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UnorderedList2 {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); //allow and block notifications
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);



        driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("nft");
        Thread.sleep(2000);
        List<WebElement> allList=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for(WebElement al : allList)
        {
            System.out.println(al.getText());
        }
        System.out.println("=============================");
        for(WebElement a:allList)
        {
            Thread.sleep(1000);
            if(a.getText().contains("nft games"))
            {
                a.click();
                break;
            }
        }
     /* Actions actions = new Actions(driver);
      for(WebElement a:allList)
      {
          Thread.sleep(1000);
          actions.sendKeys(Keys.ARROW_DOWN).perform();

          if(a.getText().contains("nft art"))
          {
              actions.sendKeys(a,Keys.ENTER).perform();
              break;
          }
      }*/

        //assertEquals("Nigeria", searchBox.getAttribute("value"));


    }
}
