package Class28;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {

        // we need to know path of the file
        // right click-> copy path references use root preferebaly
        var path="Data/Excel Workbook.xlsx";
        // navigate to this path
        FileInputStream fileInputStream= new FileInputStream(path);
        // that special that can handle the xlsx files

        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);
        //getting to the sheet inside the ecxcel file where data is stored

        XSSFSheet sheet = excelFile.getSheet("Sheet1");
        //getting the row that contains the data rows are i dex based, so they will start from zero

        Row row0=sheet.getRow(0);
        // get the that contains the data cells are also index based

        System.out.println(row0.getCell(0));
        // get the data form row 1

        Row row1= sheet.getRow(1);
        System.out.println(row1.getCell(0));





    }
}
