package commonMethods;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;



public class Utility {

    //common method to read data from properties file
    public static String readDataFromPropertiesFile(String key) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\IdeaProjects\\24thTestingSelenium\\application.properties");

        Properties properties = new Properties();
        properties.load(myFile);
        System.out.println("Reading data from properties file " +key);
        String value=properties.getProperty(key);
        return value ;

    }

    //read data from excel
    public static String readDataFromExcel(int row, int cell) throws IOException {
        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");
        String value =WorkbookFactory.create(myFile).getSheet("Sheet3").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Reading data from excel sheet " + row + " cell " +cell);
       return value;
    }

    //take screenshot
    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
       String timeStamp= new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
       File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File( "./ScreenShotEvidence/"+ "Test"+ timeStamp + ".png");
        System.out.println("Screenshot saved at" + dest);
        FileHandler.copy(src,dest);

    }
}
