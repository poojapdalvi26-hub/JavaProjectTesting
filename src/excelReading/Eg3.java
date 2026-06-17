package excelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg3 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook = WorkbookFactory.create(myFile);
        Sheet mySheet = workBook.getSheet("Sheet1");
        //read complete column/cell data

        for(int i=0;i<=4;i++)
        {
           String myData=mySheet.getRow(i).getCell(0).getStringCellValue();
            System.out.print(myData + " ");
        }


    }
}
