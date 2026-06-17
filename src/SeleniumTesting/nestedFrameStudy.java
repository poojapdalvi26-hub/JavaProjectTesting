package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class nestedFrameStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.switchTo().frame("frame1");
       String parentFrameText = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();
        System.out.println("Parent frame text -" +parentFrameText);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        String childFrameText=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println("Child frame text -" +childFrameText);

      //  driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();//switch to parent frame
        driver.switchTo().parentFrame();//switch to main page
       String mainPageText= driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
        System.out.println("Main page text is -"+mainPageText);

    }
}
