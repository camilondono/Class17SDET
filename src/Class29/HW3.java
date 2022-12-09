package Class29;

import java.util.HashMap;

public class HW3 {
    public static void main(String[] args) {

        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/

        HashMap<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(123456,"Xbox");
        bestBuy.put(234567,"playStation");
        bestBuy.put(345678,"samsungTV");
        bestBuy.put(456789,"HPlapTop");
        bestBuy.put(567890,"Drone");

        for(var element:bestBuy.entrySet()) {
            System.out.println(element.getKey()+" "+element.getValue());
        }

    }
}
