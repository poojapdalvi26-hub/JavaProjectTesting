package readDataFromPropertiesFile;

import commonMethods.UtilityPract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class practice {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(UtilityPract.readDataFromPropertiesFile("url"));

        WebElement firstNameField=driver.findElement(By.cssSelector("input#_R_1cl2p4jikacppb6amH1_"));
        WebElement surNameField=driver.findElement(By.cssSelector("input#_R_1kl2p4jikacppb6amH1_"));
        WebElement mobileField=driver.findElement(By.cssSelector("input#_R_6ad8p4jikacppb6amH1_"));

       firstNameField.sendKeys(UtilityPract.readDataFromExcelSheet(0,0));
       surNameField.sendKeys(UtilityPract.readDataFromExcelSheet(0,1));
     //

      WebElement dropdown=driver.findElement(By.xpath("//div[@id='_r_3_']"));

      dropdown.click();

      List<WebElement> dropdownValues =driver.findElements(By.xpath("//div[@id='_r_4_']/div"));
        Thread.sleep(1000);
      for(WebElement d:dropdownValues)
      {
          System.out.println(d.getText());
      }

    /*  for(WebElement d : dropdownValues)
      {
          Thread.sleep(1000);
          if(d.getText().contains(UtilityPract.readDataFromExcelSheet(0,2)))
          {
              d.click();
          }
      }*/

        mobileField.sendKeys(UtilityPract.readDataFromExcelSheet(0,3));
    }
}
