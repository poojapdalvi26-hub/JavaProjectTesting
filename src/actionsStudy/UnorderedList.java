package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UnorderedList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.irctc.co.in/nget/train-search");
      //  driver.get("https://in.bookmyshow.com/explore/home/pune");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("mic");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//input[contains(@class,'sc-10a0gyl-4 caTwDa')]")).sendKeys("pu ");
        List<WebElement> searchList = driver.findElements(By.xpath("(//ul[@class='G43f7e' and @jsname='bw4e9b'])[1]"));
         for( WebElement s :searchList)
         {
             System.out.println(s.getText());
         }

         String ExpectedResult= "michael movie";
         for(WebElement s:searchList)
         {
             if(s.getText().equals(ExpectedResult))
             {
                 s.click();
                 break;
             }
         }
    }


}
