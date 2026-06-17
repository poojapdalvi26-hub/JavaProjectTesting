package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.IconUIResource;
import java.util.List;

public class AssignmentUnorderedList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ixigo.com/trains/tatkal-railway-reservation?utm_source=bing&utm_medium=paid_search_bing_trains&utm_campaign=train_search_desktop_bing&msclkid=9fcd36a12bab168432255cb7aab0aaa4&utm_term=https%3A%2F%2Fwww.ixigo.com%2Ftrains%2Ftatkal-railway-reservation&utm_content=DSA_Trains");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement fromField =driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Origin')]"));
          fromField.click();
           fromField.sendKeys("pu");
        Thread.sleep(2000);
        List<WebElement> fromList =driver.findElements(By.xpath("//div[@class='w-full bg-white overflow-auto rounded-20 bg-subbrand pt-15  shadow-500 no-scrollbar']"));
        for(WebElement li:fromList)
        {
            System.out.println(li.getText());
        }
        System.out.println("=================1st method======================");
        //String ExpectedResult= "Pune Jn (PUNE)";
      //  Thread.sleep(1000);
      /*  for( WebElement li:fromList)
        {
            if(li.getText().contains("Pune Jn (PUNE)"))//.equal method can use
            {
                li.click();
                break;
            }
        }*/
        System.out.println("==================2nd method=========================");
        Actions actions= new Actions(driver);
        for(WebElement f :fromList)
        {
            Thread.sleep(1000);
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            if(f.getText().contains("Pune Jn (PUNE)"))
            {
                actions.sendKeys(f,Keys.ENTER).perform();
                break;
            }
        }

    }
}
