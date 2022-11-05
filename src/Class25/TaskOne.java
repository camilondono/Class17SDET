package Class25;

import java.util.ArrayList;

public class TaskOne {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words =new ArrayList<>();

        words.add("Camilo");
        words.add("lucas");
        words.add("celeste");
        words.add("eliana");
        words.add("medellin");
        words.add("new york");

        var iterator =words.iterator();
        while(iterator.hasNext()){
            var item=iterator.next();
            if(item.endsWith("e")){
                iterator.remove();
            }

        }
        System.out.println(words);
    }
}
