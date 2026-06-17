package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class MultipleWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[contains(@class,'btn btn-info')])[1]")).click();

          Set<String> allwindows=driver.getWindowHandles();

        ArrayList<String> arrayList= new ArrayList<>(allwindows);
         String mainWindowID =arrayList.get(0);
         String childWinId=arrayList.get(1);

         driver.switchTo().window(childWinId);
         driver.findElement(By.xpath("//span[text()='Documentation']")).click();
         driver.close();
//         Thread.sleep(200);
        driver.switchTo().window(mainWindowID);
          String mainPageText=driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).getText();
        System.out.println("Main page text is " +mainPageText);

    }
}
