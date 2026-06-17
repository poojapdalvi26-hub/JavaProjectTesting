package excelReading;

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

public class FacebookSignUpTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");
       Workbook workbook =WorkbookFactory.create(myFile);
       Sheet mySheet=workbook.getSheet("Sheet5");

       WebElement firstNameField=driver.findElement(By.cssSelector("#_R_1cl2p4jikacppb6amH1_"));
       WebElement surNameField=driver.findElement(By.cssSelector("#_R_1kl2p4jikacppb6amH1_"));
       WebElement mobileField=driver.findElement(By.cssSelector("#_R_6ad8p4jikacppb6amH1_"));

       firstNameField.sendKeys(mySheet.getRow(0).getCell(0).getStringCellValue());
       surNameField.sendKeys(mySheet.getRow(1).getCell(0).getStringCellValue());
       mobileField.sendKeys(mySheet.getRow(2).getCell(0).getStringCellValue());
    }
}
