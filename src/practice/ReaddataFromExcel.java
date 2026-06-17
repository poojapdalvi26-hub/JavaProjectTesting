package practice;

import org.apache.poi.ss.usermodel.*;
import org.bouncycastle.oer.its.IValue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaddataFromExcel {
    public static void main(String[] args) throws IOException {

        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        //String excelValue=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

       // System.out.println(excelValue);
        Workbook workbook=WorkbookFactory.create(myFile);
         Sheet mySheet=workbook.getSheet("Sheet1");
      //  Row myRow=mySheet.getRow(0);
       // Cell myCell=myRow.getCell(2);
       // System.out.println(myCell.getStringCellValue());
         //     CellType value =myCell.getCellType();
        //System.out.println(value);

        //read complete row
   /*     for(int i=0;i<=3;i++)
        {
           String value =mySheet.getRow(0).getCell(i).getStringCellValue();
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("==========================================");
        //read complete column
        for(int i=0;i<=1;i++)
        {
           String value=mySheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println(value);
        }*/
        //read whole data
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=3;j++)
            {
                String value=mySheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(value + " ");
            }
            System.out.println();
        }




    }
}
