package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Set;

public class ChildWindowPopupClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
         Thread.sleep(2000);

         driver.findElement(By.name("NewWindow")).click();
         String  mainWindowId =driver.getWindowHandle();
        System.out.println(mainWindowId);
         Set<String> allWindowId=driver.getWindowHandles();
        System.out.println(allWindowId);

        ArrayList<String> arrayList = new ArrayList<>(allWindowId);
        String mainWindowId1 =arrayList.get(0);
         String childWindowId=arrayList.get(1);

        System.out.println("Main window id " +mainWindowId1);
        System.out.println("Child window id " +childWindowId);
        //driver.close();
        driver.switchTo().window(childWindowId);
        driver.manage().window().maximize();
       // driver.close();
      //  driver.quit();
         driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Software testing");
    }

}
