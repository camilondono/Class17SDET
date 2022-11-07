package Class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2.50);
        fruit.put("Mango",3.99);
        fruit.put("Banana",1.29);
        fruit.put("Orange",5.29);

       /* Collection<Double> values=fruit.values(); // retuns all the values from a map

        Iterator<Double> iterator= values.iterator();
        while(iterator.hasNext()){
            Double value = iterator.next();
            if(value>2){
                iterator.remove();
            }
        }
        System.out.println(fruit); */
        fruit.values().removeIf(x->x>2);  // this is the same as code above but in two lines
       System.out.println();


    }
}
