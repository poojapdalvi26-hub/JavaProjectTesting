package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsEnabledIsSelected {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(3000);

         String text =driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText();
        System.out.println(text);
        Thread.sleep(3000);

        WebElement checkBoxOption1=driver.findElement(By.cssSelector("input#checkBoxOption1"));
        checkBoxOption1.click();
        if(checkBoxOption1.isSelected())
        {
            System.out.println("Checkbox1 is already selected");
        }
        else{
            if(checkBoxOption1.isSelected())
            {
        //        checkBoxOption1.click();
                System.out.println("checkbox1 is now selected ");
            }
            else {
                System.out.println("checkbox1 is still not selected");
            }
        }



        /*WebElement radioButton =driver.findElement(By.cssSelector("input[value='radio2']"));

        Boolean radioStatus=radioButton.isSelected();
        Thread.sleep(3000);
            System.out.println(" 2nd Radio button is selected" +radioStatus);

            radioButton.click();

        Thread.sleep(3000);
        WebElement showHideField=driver.findElement(By.xpath("//input[@name='show-hide']"));
        Boolean showHideStatus =showHideField.isDisplayed();
        if(showHideStatus)
        {
            Thread.sleep(3000);
            showHideField.sendKeys("Testing");
            //showHideField.clear();
        }
        else
        {
            driver.findElement(By.xpath("//input[@value='Show']")).click();
        }
*/




    }
}
