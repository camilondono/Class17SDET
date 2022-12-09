package Class30;

import org.apache.poi.ss.usermodel.Workbook;
import utils.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {
    public static void main(String[] args) throws IOException {

    method();

    }
    public  static void method() throws IOException {
        System.out.println(ExcelReader.read("Data/Excel Workbook.xlsx"));
    }
}
