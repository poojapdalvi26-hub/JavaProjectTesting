package excelReading;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException, IOException {


        FileInputStream myFile= new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");
        Workbook workbook= WorkbookFactory.create(myFile);
        Sheet mySheet=workbook.getSheet("Sheet4");

       int mylastRowNum = mySheet.getLastRowNum();
       for(int i=0;i<=mylastRowNum;i++)
       {
         Row myRow = mySheet.getRow(i);
         if(myRow==null)
         {
             System.out.println("Blank row");
             continue;
         }
         int myLastCellNum = myRow.getLastCellNum()-1;
         for(int j=0;j<=myLastCellNum;j++)
         {
            Cell myCell=myRow.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            CellType myCellType=myCell.getCellType();

            if(myCellType==CellType.STRING)
            {
                System.out.print(myCell.getStringCellValue()+ " ");
            } else if (myCellType==CellType.NUMERIC) {
                System.out.print(myCell.getNumericCellValue()+ " ");
            }else if(myCellType==CellType.BOOLEAN) {
                System.out.print(myCell.getBooleanCellValue()+ " ");
            } else if (myCellType==CellType.BLANK) {
                System.out.print("* ");
            }else {
                System.out.print("Unknown type");
            }
         }
           System.out.println();
       }
    }
}
