package Class29;

import java.util.LinkedHashMap;

public class HW1 {
    public static void main(String[] args) {
        /* Create a map of a building. Store floor number and its associated company name.
       (Example: 1= Google, 2=Syntax etc..).Insert 7 entries with duplicate keys and values.
       Check how many entries you have?Update company on a 4th floor.
       Remove company on the 7th floor.Print your map.
     */
        LinkedHashMap<Integer,String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Amazon");
        building.put(4,"Amazon");
        building.put(5,"Facebook");
        building.put(6,"Facebook");
        building.put(7,"Indeed");

        System.out.println("Total Number of entries: "+building.size());
        building.replace(4,"Tesla");
        building.remove(7,"Indeed");
        System.out.println(building);



    }
}
