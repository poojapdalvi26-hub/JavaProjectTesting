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

public class Utility1 {

    public static String readDataFromPropertiesFile(String key) throws IOException {
        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\IdeaProjects\\24thTestingSelenium\\test.properties");
        Properties properties= new Properties();
        properties.load(myFile);
        String value=properties.getProperty(key);
        System.out.println("Reading data from properties file " +key);
        return value;
    }

    public static String readDataFromExcel(int row, int cell) throws IOException {
        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");
        String value =WorkbookFactory.create(myFile).getSheet("Sheet5").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("reading data from excel sheet " + "row" + row + " Cell" +cell);
        return value;

    }

    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        String timeStamp= new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
         File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         File dest= new File("./ScreenShotEvidence/"+ "Test" +timeStamp+".png");
         FileHandler.copy(src,dest);
        System.out.println("Screenshot is taken at" +dest);

    }


}
