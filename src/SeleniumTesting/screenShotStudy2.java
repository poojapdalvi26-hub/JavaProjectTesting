package SeleniumTesting;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.xml.stream.XMLInputFactory;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class screenShotStudy2 {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpune.com/");

        driver.manage().window().maximize();
        Thread.sleep(3000);

         String timestamp= new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());

        TakesScreenshot screenshot= (TakesScreenshot)driver;
        File source= screenshot.getScreenshotAs(OutputType.FILE);

     //   File destination= new File("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Take"+ timestamp +".png");
      //  File destination= new File("C:\\Users\\pooja\\IdeaProjects\\24thTestingSelenium\\ScreenShotEvidence\\Take"+timestamp+".png");
        File destination = new File("./ScreenShotEvidence/" + "Test" + timestamp +".png");
        FileHandler.copy(source,destination);



    }
}
