package Class28;
import java.util.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double> items= new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.00);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        // I want to remove the items if their price is more than 10
        items.values().removeIf(price->price>10);

        Iterator<Double> values= items.values().iterator(); // first we are getting a collection of values than the iterator

//        while (iterator.hasNext()){
//            Double price=itertor.next();
//            if(price>10){
//                iterator.remove();
//            }
//        }
        System.out.println(items);

    }
}
