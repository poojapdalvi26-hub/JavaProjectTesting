package excelReading;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Eg5 {

    public static void main(String[] args) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\pooja\\OneDrive\\Documents\\Software tesing Course\\Automation\\Book1.xlsx");

        Workbook workBook = WorkbookFactory.create(myFile);
        Sheet mySheet = workBook.getSheet("Sheet2");
        //read whole all type data
        Cell myCell;
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=3;j++) {
                myCell = mySheet.getRow(i).getCell(j);
                CellType myCellType = myCell.getCellType();

                if (myCellType == CellType.STRING) {
                  String  myValue = myCell.getStringCellValue();
                    System.out.print(myValue + " ");
                } else if (myCellType == CellType.NUMERIC) {
                   double myValue = myCell.getNumericCellValue();
                    System.out.print(myValue + " ");
                } else if (myCellType==CellType.BOOLEAN) {
                   Boolean myValue = myCell.getBooleanCellValue();
                    System.out.print(myValue+ " ");
                } else if (myCellType==CellType.BLANK) {
                    System.out.print("#");
                }else {
                    System.out.print("Unknown Cell type ");
                }

            }
            System.out.println();
        }
    }
}
