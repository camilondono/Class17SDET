package Class14and15;

import java.util.Arrays;

public class JavaClass15 {
    public static void main(String[] args) {
        String str="kjfksfAJDSKJD274362374!@##$";
        str= str.replaceAll("[^a-zA-Z]","");
        System.out.println("str = " + str);

        String sentence="Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));

    }
}
