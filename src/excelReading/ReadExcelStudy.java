package excelReading;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelStudy {
    public static void main(String[] args) throws IOException {

        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        //read string value from excel
       // String myData=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        //System.out.println("Data from Sheet 1 - " +myData);

        //read numeric value from excel sheet
      // Double myData =WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(5).getCell(3).getNumericCellValue();
       // System.out.println("Data from Sheet 2 - " +myData);

        //read boolean value from excel sheet
        Boolean myData=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(7).getCell(1).getBooleanCellValue();
        System.out.println("Data From Sheet 1 - "+myData);
    }
}
