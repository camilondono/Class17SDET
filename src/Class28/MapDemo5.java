package Class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
   // var last name; does not work with instance variables as java cant figure out the data type
    public static void main(String[] args) {

        HashMap<String,Double> items= new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.00);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        // will return a set of entries
        //Set<Map.Entry<String,Double>> entrySet=items.entrySet();
        var entrySet =items.entrySet();

        System.out.println(items.entrySet());
        for(var item:entrySet){
            System.out.println(item.getKey()+" "+item.getValue());
        }

    }
}
