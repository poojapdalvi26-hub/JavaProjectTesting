package webTable;

import org.apache.batik.svggen.font.table.GsubTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Eg1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
       Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement prodTbl=driver.findElement(By.xpath("//*[@name='courses']"));
      // js.executeScript("arguments[0].scrollIntoView();",prodTbl);
       // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("window.scrollBy(600,700)");

        int numOfRow=driver.findElements(By.xpath("//*[@name='courses']/tbody/tr")).size();
        System.out.println("Number of rows in product table - "+numOfRow);

        int numOfCol=driver.findElements(By.xpath("(//*[@name='courses'])/tbody/tr[1]/th")).size();
        System.out.println("Number of columns in product table- " +numOfCol);

        //read single value from table
      //  String value= driver.findElement(By.xpath("//*[@name='courses']/tbody/tr[7]/td[2]")).getText();
       // System.out.println(value);

        //read whole row using for loop
       /* for(int i=1;i<=numOfCol;i++)
        {
            String value =driver.findElement(By.xpath("//*[@name='courses']/tbody/tr[7]/td["+i+"]")).getText();
            System.out.print(" " +value+ " | ");
        }
        System.out.println();*/

        //read whole row using for each loop
        //List<WebElement> row=driver.findElements(By.xpath("//*[@name='courses']/tbody/tr[7]/td"));

    /*    for(int i=1;i<=numOfCol;i++)
        {
            String value =driver.findElement(By.xpath("//*[@name='courses']/tbody/tr[7]/td["+i+"]")).getText();
            System.out.print(" " +value+ "|");
        }
        System.out.println();*/

        //2nd approach
        List<WebElement> row7=driver.findElements(By.xpath("//*[@name='courses']/tbody/tr[7]/td"));
        for(WebElement r:row7)
        {
            System.out.print(" "+ r.getText()+ "|");
        }
        System.out.println();
    }
}
