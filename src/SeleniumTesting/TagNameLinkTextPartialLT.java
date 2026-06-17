package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class TagNameLinkTextPartialLT {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpune.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

      //  driver.findElement(By.linkText("Courses")).click();
        driver.findElement(By.partialLinkText("Refund Policy")).click();

    }
}
