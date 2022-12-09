package ReviewClass8;

import utils.ExcelReader;

import java.io.IOException;

public class exceptionDemo2 {
    public static void main(String[] args) {

        try {
            ExcelReader.read("aknbrujwhdnkjbs");

        } catch (IOException Celeste) {
            System.out.println("Please contact our support team");
        }
    }
}
