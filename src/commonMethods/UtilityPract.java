package commonMethods;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityPract {

    public static String readDataFromPropertiesFile(String key) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\IdeaProjects\\24thTestingSelenium\\test1.properties");
        Properties properties = new Properties();
        properties.load(myFile);
        String value = properties.getProperty(key);
        System.out.println("reading data from properties file " +value);
        return value;


    }
    public static String readDataFromExcelSheet(int row, int cell) throws IOException {
        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        String value = WorkbookFactory.create(myFile).getSheet("Sheet5").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Reading data from excel file " +"row" +row +"cell" +cell);
        return value;
    }
}
