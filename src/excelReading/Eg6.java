package excelReading;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg6 {
    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook = WorkbookFactory.create(myFile);
        Sheet mySheet = workBook.getSheet("Sheet2");

        for(int i=0 ;i<=1;i++)
        {
            for(int j=0;j<=3;j++)
            {
                Cell myCell=mySheet.getRow(i).getCell(j);
                if(myCell==null)
                {
                    System.out.print("* ");
                    continue;
                }
                CellType myCellType=myCell.getCellType();
                if(myCellType==CellType.STRING)
                {
                    System.out.print(myCell.getStringCellValue()+ " ");
                } else if (myCellType==CellType.NUMERIC) {
                    System.out.print(myCell.getNumericCellValue()+ " ");
                } else if (myCellType==CellType.BOOLEAN) {
                    System.out.print(myCell.getBooleanCellValue()+ " ");
                }
                else
                {
                    System.out.print("Unknown Cell type");
                }
            }
            System.out.println();

        }
    }
}
