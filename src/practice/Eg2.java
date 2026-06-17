package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Eg2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        Set<String> allwindows=driver.getWindowHandles();

        ArrayList<String> arrayList = new ArrayList<>();
         String mainWinId=arrayList.get(0);
         String childWin=arrayList.get(1);
         String childWin1=arrayList.get(2);

        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("(//button[contains(@class,'btn btn-info')])[2]")).click();

        driver.switchTo().window(childWin);
        driver.findElement(By.cssSelector("input#email")).sendKeys("Testing@email.com");
        driver.findElement(By.cssSelector("img#enterimg")).click();

        driver.switchTo().window(childWin1);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("test");

    }
}
