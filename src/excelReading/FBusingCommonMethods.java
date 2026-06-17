package excelReading;

import commonMethods.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FBusingCommonMethods {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get(Utility1.readDataFromPropertiesFile("url"));
        driver.manage().window().maximize();

        WebElement firstNameField=driver.findElement(By.cssSelector("#_R_1cl2p4jikacppb6amH1_"));
        WebElement surNameField=driver.findElement(By.cssSelector("#_R_1kl2p4jikacppb6amH1_"));
        WebElement mobileField=driver.findElement(By.cssSelector("#_R_6ad8p4jikacppb6amH1_"));

        firstNameField.sendKeys(Utility1.readDataFromExcel(0,0));
        surNameField.sendKeys(Utility1.readDataFromExcel(1,0));
        mobileField.sendKeys(Utility1.readDataFromExcel(2,0));

        Utility1.takeScreenshot(driver,"FbSignUp");

    }


}
