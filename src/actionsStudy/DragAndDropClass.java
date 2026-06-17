package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        WebElement source =driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement destination=driver.findElement(By.id("amt8"));
                Thread.sleep(2000);
       // actions.dragAndDrop(source,destination).perform();

        actions.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
    }
}
