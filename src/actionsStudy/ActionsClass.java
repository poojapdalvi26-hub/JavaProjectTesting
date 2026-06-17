package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // WebElement seleniumButton=driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));

        Actions actions = new Actions(driver);

        //single click actions
        //actions.moveToElement(seleniumButton).perform();
        //actions.click().perform();

        //  actions.moveToElement(seleniumButton).click().build().perform();

        // actions.click(seleniumButton).perform();

        //double click actions
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
         actions.moveToElement(doubleClickButton).doubleClick().build().perform();

        //actions.doubleClick(doubleClickButton).perform();

        //context click-right click
       // WebElement contextClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
         //actions.moveToElement(contextClickButton).contextClick().perform();
        //actions.contextClick(contextClickButton).perform();



    }
}
