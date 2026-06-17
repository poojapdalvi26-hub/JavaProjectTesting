package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class aasignment2UnorderedList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=22513880550&gclid=Cj0KCQjwz9_QBhD_ARIsADnSCfDVmEPV2vQ0wB2ys-5c1vke_FWKMEnfx_SJDySIMW8Lp-Dz2y3FhgsaAgCsEALw_wcB");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#srcinput")).sendKeys("sa");
        Thread.sleep(2000);
        List<WebElement> allList=driver.findElements(By.xpath("//div[@class='searchSuggestionWrapper___71fd01']/div/div"));
        for(WebElement al :allList)
        {
            System.out.println(al.getText());
        }

     /*   for(WebElement al:allList)
        {
            Thread.sleep(1000);
            if(al.getText().contains("Chatrapati Sambhajinagar"))
            {
                al.click();
                break;
            }
        }*/

        Actions actions= new Actions(driver);
        for(WebElement al :allList)
        {
            Thread.sleep(1000);
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            if(al.getText().contains("Chatrapati Sambhajinagar"))
            {
                actions.sendKeys(al,Keys.ENTER).perform();
                break;
            }
        }
    }
}
