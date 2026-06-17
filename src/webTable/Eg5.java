package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Eg5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        Thread.sleep(200);

        WebElement table =driver.findElement(By.xpath("//table[@class='dataTable']"));
        List<WebElement> rows =table.findElements(By.tagName("tr"));
        System.out.println("Number of rows are " +rows.size());

        for( WebElement row:rows)
        {
           List<WebElement>  cells =row.findElements(By.tagName("td"));
           if(cells.isEmpty())
           {
               cells= row.findElements(By.tagName("th"));
           }
           for(WebElement cell:cells)
           {
               System.out.print(cell.getText() + " \t");
           }
            System.out.println();
        }










    }
}
