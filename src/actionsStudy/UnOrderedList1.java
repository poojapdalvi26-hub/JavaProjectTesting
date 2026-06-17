package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UnOrderedList1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement searchfield = driver.findElement(By.cssSelector("input#myInput"));
        searchfield.sendKeys("Be");
        Thread.sleep(2000);
        List<WebElement> listAll=driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
        for(WebElement l : listAll)
        {
            System.out.println(l.getText());
        }
             Thread.sleep(2000);
      // String expectedResult= "Benin";
       Actions actions = new Actions(driver);

        for(WebElement l:listAll)
        {
           // Thread.sleep(3000);
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            if(l.getText().contains("Benin"))
            {
                actions.sendKeys(Keys.ENTER).perform();
                break;
            }
        }

    }
}
