package Class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2.50);
        fruit.put("Mango",3.99);
        fruit.put("Banana",1.29);
        fruit.put("Orange",5.29);

        Set<Map .Entry<String,Double>> entrySet=fruit.entrySet();


    }
}
