package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ChromOptionsClass {

        public static void main(String[] args) throws InterruptedException {

            ChromeOptions options = new ChromeOptions();
          //  options.addArguments("start-maximized");

            ArrayList<String> al= new ArrayList<>();
            al.add("start-maximized");
            al.add("incognito");
            al.add("disable-infobars");
            options.addArguments(al);
            WebDriver driver = new ChromeDriver(options);

            driver.get("https://vinothqaacademy.com/alert-and-popup/");
          //  driver.manage().window().maximize();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//button[@name='alertbox']")).click();
            Thread.sleep(2000);
            Alert alt=driver.switchTo().alert();
            alt.accept();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.xpath("//h2[text()='Alert and PopUp']")).getText());
        }
    }


