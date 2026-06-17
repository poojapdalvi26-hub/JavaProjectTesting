package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupclass2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice-automation.com/popups/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("confirm")).click();
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
      //  alt.accept();
        alt.dismiss();
        System.out.println(driver.findElement(By.xpath("//h1[text()='Popups']")).getText());
    }
}
