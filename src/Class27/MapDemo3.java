package Class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2.50);
        fruit.put("Mango",3.99);
        fruit.put("Banana",1.29);
        fruit.put("Orange",5.29);
        fruit.put("Orange",5.99); // when we duplicate the old value will be replace
        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));

        Set<String> keySet=fruit.keySet(); // returns all keys in the form set
        System.out.println(keySet);

        var values=fruit.values(); // returns all values in form of collection
        System.out.println(values);



    }
}
