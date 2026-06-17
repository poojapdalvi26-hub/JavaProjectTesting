package practice;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class execlPractice {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(200);

        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Sheet mySheet=WorkbookFactory.create(myFile).getSheet("Sheet5");
        WebElement nameField=driver.findElement(By.id("name"));
        WebElement emailField=driver.findElement(By.id("email"));
        WebElement mobileField=driver.findElement(By.id("mobile"));

        nameField.sendKeys(mySheet.getRow(0).getCell(0).getStringCellValue());
        emailField.sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue());
        mobileField.sendKeys(mySheet.getRow(0).getCell(2).getStringCellValue()    );


    }
}
