package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Eg3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        int numOfRows=driver.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr")).size();
        int numOfCol=driver.findElements(By.xpath("//*[@class='tableFixHead']/table/thead/tr[1]/th")).size();
        System.out.println(numOfRows);
        System.out.println(numOfCol);

        //driver.findElement(By.xpath("//*[@class='tableFixHead']/table/thead/tr/th"))
        List<WebElement> row4=driver.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr[5]/td"));
        for(  WebElement r:row4)
        {
            System.out.print(" " +r.getText()+ "|");
        }

        System.out.println("=======================================");
        //read whole column
        System.out.println(driver.findElement(By.xpath("//*[@class='tableFixHead']/table/thead/tr/th[1]")).getText());
        List<WebElement> col1 =driver.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr/td[1]"));
        for( WebElement c :col1)
        {
            System.out.println(c.getText());
        }










    }

}
