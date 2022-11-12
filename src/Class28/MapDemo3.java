package Class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {

        HashMap<String,Double> items= new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.00);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        Set<String> Keys =items.keySet(); //key set method retunrs a Set that contains all the keys oa a map
        //Collection<String> keys2 = items.keySet();  // collection is parent there for a set can be store inside of it
        for(String key:Keys){
            System.out.println(key);
        }
    }
}
