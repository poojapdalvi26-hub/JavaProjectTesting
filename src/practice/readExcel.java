package practice;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readExcel {
    public static void main(String[] args) throws IOException {


        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook = WorkbookFactory.create(myFile);
         Sheet mySheet=workBook.getSheet("Sheet4");
         int lastRowNum=mySheet.getLastRowNum();
         for( int i=0;i<=lastRowNum;i++)
         {
             Row myRow=mySheet.getRow(i);
             if(myRow==null)
             {
                 System.out.println("Blank row");
                 continue;
             }
              int lastCellNum=myRow.getLastCellNum()-1;
              for(int j=0;j<=lastRowNum;j++)
              {
                  Cell myCell=myRow.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                  CellType myCellType=myCell.getCellType();
                  if(myCellType==CellType.STRING)
                  {
                      System.out.print(myCell.getStringCellValue()+ " ");
                  } else if (myCellType==CellType.NUMERIC) {
                      System.out.print(myCell.getNumericCellValue()+ " ");
                  } else if (myCellType==CellType.BOOLEAN) {
                      System.out.println(myCell.getBooleanCellValue()+" ");
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
