package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.ListIterator;

public class dropdownmultiple {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Thread.sleep(5000);
       WebElement multidropdown = driver.findElement(By.xpath("//select[@id='cars']"));

       Select selectmultidropdown= new Select(multidropdown);

       Boolean multiSelectStatus =selectmultidropdown.isMultiple();
        System.out.println("Drop down is multiselected - " +multiSelectStatus);

        Thread.sleep(3000);

        selectmultidropdown.selectByValue("saab");
        selectmultidropdown.selectByIndex(3);
        selectmultidropdown.selectByVisibleText("Volvo");

        System.out.println(selectmultidropdown.getFirstSelectedOption().getText());

        System.out.println("========================");

       List<WebElement> getAllSelectedoption =selectmultidropdown.getAllSelectedOptions();
      // for(WebElement a : getAllSelectedoption)
       //{
        //   System.out.println(a.getText());
       //}
        ListIterator<WebElement> li = getAllSelectedoption.listIterator();
       while(li.hasNext())
       {
           System.out.println(li.next().getText());
       }

        System.out.println("======================");
       selectmultidropdown.deselectByVisibleText("Volvo");

    }
}
