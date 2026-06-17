package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Eg2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

         JavascriptExecutor js=(JavascriptExecutor)driver;
     int numOfRow = driver.findElements(By.xpath("//*[@name='courses']/tbody/tr")).size();
     int numofCol= driver.findElements(By.xpath("//*[@name='courses']/tbody/tr[1]/th")).size();

        System.out.println(numOfRow);
        System.out.println(numofCol);

        //read whole column
     /*   for(int i=1;i<=numOfRow;i++)
        {
            if(i==1)
            {
                String value =driver.findElement(By.xpath("//*[@name='courses']/tbody/tr[1]/th[2]")).getText();
                System.out.println(" " + value);
                continue;
            }
            String value =driver.findElement(By.xpath("//*[@name='courses']/tbody/tr["+i+"]/td[2]")).getText();
            System.out.println(" " + value);
        }
        System.out.println();*/
        System.out.println("===============================");
        //2nd approach
        System.out.println(driver.findElement(By.xpath("//*[@name='courses']/tbody/tr/th[3]")).getText());
         List<WebElement> col3=driver.findElements(By.xpath("//*[@name='courses']/tbody/tr/td[3]"));
        //System.out.println(col3);
       for( WebElement c:col3)
        {
            System.out.println(c.getText());
        }

    }
}
