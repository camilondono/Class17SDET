package Class25;

import java.util.ArrayList;

public class HWtaskTwo {
    public static void main(String[] args) {
        //create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.

        ArrayList<String> drinks=new ArrayList<>();

        drinks.add("Coca Cola");
        drinks.add(" juice");
        drinks.add("juice");
        drinks.add("tea");
        drinks.add("milk");
        drinks.add("vodka");
        drinks.add("soda");
        drinks.add("kombucha");

        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");//replace
            }
        }
        System.out.println(drinks);


    }
}
