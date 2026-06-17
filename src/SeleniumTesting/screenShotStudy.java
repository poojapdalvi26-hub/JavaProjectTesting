package SeleniumTesting;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class screenShotStudy {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpune.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        File destination =  new File("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\test.png");
        FileHandler.copy(source,destination);
    }
}
