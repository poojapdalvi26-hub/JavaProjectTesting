package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class BasicSelenium {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the browser to open out of chrome, firefox  or edge");
         String browserName=scanner.next();

         if(browserName.equals("chrome")) {
             driver = new ChromeDriver();
         } else if ((browserName.equals("firefox"))) {
             driver = new FirefoxDriver();
         } else if (browserName.equals("edge")) {
             driver = new EdgeDriver();
         }
         driver.get("https://vctcpune.com/");
         Thread.sleep(1000);

         driver.manage().window().maximize();

         driver.navigate().to("https://www.google.com/");

         driver.navigate().back();
         Thread.sleep(2000);
         driver.navigate().forward();
        Thread.sleep(2000);
         driver.navigate().refresh();
         Thread.sleep(1000);
         driver.close();
    }
}
