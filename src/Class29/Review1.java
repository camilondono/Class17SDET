package Class29;

import utils.ExcelReader;

import java.io.IOException;

public class Review1 {
    //we want to read data from files

    public static void main(String[] args) throws IOException {

        String path="Data/Excel Workbook.xlsx";
        var data=  ExcelReader.read(path);

       /* Map<String ,String> row1=data.get(0);
        System.out.println(row1.get("Name"));*/

   /*     for (var row:data
             ) {
            System.out.println(row);
        }*/
        System.out.println(data);

    }

}
