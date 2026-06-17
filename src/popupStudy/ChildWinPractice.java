package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class ChildWinPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

         Set<String> allWindows=driver.getWindowHandles();
         for(String a:allWindows)
         {
             System.out.println(a);
         }

        ArrayList<String> al= new ArrayList<>(allWindows);
        String mainwindowId = al.get(0);
        String childWindowId =al.get(1);

        driver.switchTo().window(childWindowId);
        driver.manage().window().maximize();
         String text=driver.findElement(By.xpath("//h1[text()='Oops! That page can’t be found.']")).getText();
        System.out.println("Text present on child window - "+text);
        driver.close();

        driver.switchTo().window(mainwindowId);
        System.out.println(driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText());


    }
}
