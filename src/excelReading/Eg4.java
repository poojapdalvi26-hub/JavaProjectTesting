package excelReading;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg4 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook = WorkbookFactory.create(myFile);
        Sheet mySheet = workBook.getSheet("Sheet1");

        //read whole data
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=3;j++)
            {
               String myData= mySheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(myData + " ");
            }
            System.out.println();
        }

    }
}
