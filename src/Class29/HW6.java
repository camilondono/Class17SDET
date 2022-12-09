package Class29;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class HW6 {
    public static void main(String[] args) {
        /*Create the collection that will store single uniques Objects of a
        String type in which order is preserved.
        Write a logic to concatenate all string from the collection.*/


        LinkedList<String> words = new LinkedList<>();

        words.add("Syntax");
        words.add("is");
        words.add("a");
        words.add("very");
        words.add("good");
        words.add("School");

        String concat=" ";
        for(int i=0; i<words.size();i++){
            concat=concat+words.get(i)+" ";

        }
        System.out.println(concat);



    }
}
