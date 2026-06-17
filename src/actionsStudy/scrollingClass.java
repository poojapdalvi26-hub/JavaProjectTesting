package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vctcpune.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement upcomingBatches=driver.findElement(By.xpath("//div[@class='card batch-card']"));
        Actions actions = new Actions(driver);
        //Thread.sleep(2000);
        actions.scrollToElement(upcomingBatches).perform();
    }
}
