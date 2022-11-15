package Class29;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelDemo3 {
    public static void main(String[] args) throws IOException {

        var excelData=   ExcelReader.read("Data/config.properties");
        System.out.println(excelData);

    }
}
