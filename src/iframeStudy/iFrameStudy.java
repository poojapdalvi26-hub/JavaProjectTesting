package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameStudy {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.switchTo().frame("frame1");
        String frameElement =driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
        System.out.println("Text on frame- " +frameElement);

        driver.switchTo().defaultContent();
        String mainpageElement =driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
        System.out.println("Text on main page - " +mainpageElement);



    }
}
