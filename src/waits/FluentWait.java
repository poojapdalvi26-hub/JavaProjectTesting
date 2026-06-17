package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.discoveryplus.in/");


        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[contains(text(),'Sign In')])[2]")));

        driver.findElement(By.xpath("(//h6[contains(text(),'Sign In')])[2]")).click();


    }
}
