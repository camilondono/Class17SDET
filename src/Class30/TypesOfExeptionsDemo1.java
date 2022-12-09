package Class30;

import utils.ExcelReader;

import javax.imageio.IIOException;
import javax.swing.*;
import java.io.IOException;

public class TypesOfExeptionsDemo1 {
    public static void main(String[] args) {

        String name=null;
        if(name!=null){
            System.out.println(name.length());
        }

        int[] arr= new int[5];
        int index=10;
        try {
            System.out.println(arr[index]);
        }catch (Exception anyVariable){
            System.out.println("Josh please fix your issues ");
        }
        if(index<arr.length){
            System.out.println(arr[index]);
        }
        try {
            System.out.println(ExcelReader.read("Data/config.properties"));
        }catch (IOException anyVariable){
            throw new RuntimeException(anyVariable);
        }

    }
}
