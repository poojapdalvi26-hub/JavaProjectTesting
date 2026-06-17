package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopupPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vinothqaacademy.com/alert-and-popup/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.name("alertbox")).click();
        Alert alt =driver.switchTo().alert();
        System.out.println("Alert text - " +alt.getText());
        alt.dismiss();

    }
}
