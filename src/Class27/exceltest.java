package Class27;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class exceltest {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Camilo E Londono\\Downloads\\poi-bin-5.2.3-20220909\\test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
         XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        Sheet sheet = (Sheet) xssfWorkbook.getSheet("Sheet1");





    }
}
