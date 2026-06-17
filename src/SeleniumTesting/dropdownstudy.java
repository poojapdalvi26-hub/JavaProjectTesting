package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownstudy {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement dayDropdown=driver.findElement(By.xpath("//select[@class='day']"));
        Select selectDay= new Select(dayDropdown);
        selectDay.selectByValue("05");
        Thread.sleep(2000);

        WebElement monthDropdown=driver.findElement(By.xpath("//select[@class='middle month']"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("MAY");
        Thread.sleep(2000);


        Boolean selectMonthStatus =selectMonth.isMultiple();
        System.out.println("Month dropdown is multiselected - " +selectMonthStatus);

        System.out.println("=================================");
        List<WebElement> allOptions=selectMonth.getOptions();
        for(WebElement a:allOptions)
        {
            System.out.println(a.getText());
        }

        WebElement yearDropdown =driver.findElement(By.cssSelector("select.year"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByIndex(9);
        Thread.sleep(2000);





    }
}
