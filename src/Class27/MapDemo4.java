package Class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2.50);
        fruit.put("Mango",3.99);
        fruit.put("Banana",1.29);
        fruit.put("Orange",5.29);

        Set<String> allKeys = fruit.keySet(); // getting all keys in form of a set
        System.out.println(allKeys);

        Iterator<String> iterator=allKeys.iterator(); // getting an iterator on that set
        while(iterator.hasNext()){
            String item= iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }

    // fruit.kseySet().removeif(x->x.contains("n"));
    // System.out.println(fruit);
    // this is lambda and saves us writting ll the code above
}
