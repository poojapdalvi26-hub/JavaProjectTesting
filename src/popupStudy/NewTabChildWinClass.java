package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class NewTabChildWinClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("NewTab")).click();
        //handle the new tab

        Set<String> allWindowId=driver.getWindowHandles();
        Iterator<String> it=allWindowId.iterator();
        String mainWindowId= it.next();
        String newTabID = it.next();
       // String newTabID1 =it.next();

        System.out.println("Get main page title" + driver.getTitle());
        driver.switchTo().window(newTabID);
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@title='Contact me'])[2]")).click();
        System.out.println("Get new tab1 page title" + driver.getTitle());

         String newTabID1 =it.next();
       driver.switchTo().window(newTabID1);
        System.out.println(newTabID1);
       // Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#the7-search")).sendKeys("Software testing");
        System.out.println("Get new tab2 page title" + driver.getTitle());

    }
}
