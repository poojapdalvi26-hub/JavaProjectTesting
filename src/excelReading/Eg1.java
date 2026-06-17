package excelReading;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg1 {
    public static void main(String[] args) throws IOException {

        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook=WorkbookFactory.create(myFile);

       Sheet mySheet =workBook.getSheet("Sheet1");

       Row myRow=mySheet.getRow(0);
       Cell myCell=myRow.getCell(0);

       CellType cellType=myCell.getCellType();
        System.out.println("Cell type is " +cellType);
    }
}
