package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Eg4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

         WebElement table=driver.findElement(By.name("courses"));

         List<WebElement> rows=table.findElements(By.tagName("tr"));
        System.out.println("Number of rows in tables are " + rows.size());

        for(WebElement row:rows)
        {
            List<WebElement> cells=row.findElements(By.tagName("td"));
            if(cells.isEmpty())
            {
                  cells=row.findElements(By.tagName("th"));
            }
            for( WebElement cell:cells)
            {
                System.out.print(cell.getText() + " \t");
            }
            System.out.println();
        }

    }
}
