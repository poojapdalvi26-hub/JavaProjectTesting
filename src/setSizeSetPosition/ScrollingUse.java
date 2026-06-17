package setSizeSetPosition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUse {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://poi.apache.org/");

        driver.manage().window().maximize();
        Thread.sleep(1000);

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(10,1770);");

      //   WebElement refElement = driver.findElement(By.xpath("//h3[contains(text(),'11 November 2024')]"));
        // js.executeScript("arguments[0].scrollIntoView(true);", refElement);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");



    }
}
