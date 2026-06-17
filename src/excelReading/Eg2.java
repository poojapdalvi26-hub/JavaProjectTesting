package excelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg2 {
    public static void main(String[] args) throws IOException {

        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook = WorkbookFactory.create(myFile);
        //How to read complete row
        Sheet mySheet = workBook.getSheet("Sheet1");

        for (int i = 0; i <= 4; i++) {
            String myData = mySheet.getRow(0).getCell(i).getStringCellValue();
            System.out.print(myData + " ");
        }
    }
}
