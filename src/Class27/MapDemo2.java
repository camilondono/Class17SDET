package Class27;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2.50);
        fruit.put("Mango",3.99);
        fruit.put("Banana",1.29);
        fruit.put("Orange",5.29);

        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Mango"); // deletes this key and its value from the map
        System.out.println(fruit);

        System.out.println(fruit.containsKey("Apple")); // to check if Apple is present
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(5.29)); // searches the map for this value
        System.out.println(fruit.isEmpty());

        fruit.replace("Apple",3.99);
        System.out.println(fruit);





    }

}
