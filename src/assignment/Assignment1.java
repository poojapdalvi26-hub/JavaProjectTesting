package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button#tab-admin")).click();
        driver.findElement(By.cssSelector("input#admin-username")).sendKeys("9923478750");
        driver.findElement(By.cssSelector("input#admin-password")).sendKeys("Velocity@123");
        driver.findElement(By.cssSelector("button#btn-admin-signin")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Dashboard Overview')]"))).getText());

        driver.findElement(By.xpath("//a[text()='Products']")).click();
        Thread.sleep(1000);
        System.out.println("===============================");
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-label'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-value'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-label'])[2]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-value'])[2]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-label'])[3]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-value'])[3]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-label'])[4]")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='stat-value'])[4]")).getText());
        System.out.println("===================================");

        Thread.sleep(1000);
        WebElement table=driver.findElement(By.cssSelector("table.admin-table"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        System.out.println("Total number of rows in the table:" +rows.size());
        System.out.println("===================================");
        for (WebElement row:rows)
        {
           List<WebElement> cells =row.findElements(By.tagName("td"));
           if(cells.isEmpty())
           {
               cells=row.findElements(By.tagName("th"));

           }
           for(WebElement cell:cells)
           {
               System.out.print(cell.getText()+ " \t");
           }
            System.out.println();


        }
       
    }
}
