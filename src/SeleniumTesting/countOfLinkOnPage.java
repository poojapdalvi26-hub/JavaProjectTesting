package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class countOfLinkOnPage {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> linkAll =driver.findElements(By.tagName("a"));
        for(WebElement li :linkAll)
        {
            System.out.println(li.getText());
        }
        System.out.println("====================");
        System.out.println(linkAll.size());
    }
}
