package Class29;

import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

        TreeMap<String,String> countries = new TreeMap<>();
        countries.put("Colombia","Bogota");
        countries.put("United States","Washington DC");
        countries.put("Espana","Madrid");
        countries.put("England","London");

        var country= countries.entrySet();

        for(var element:country){
            System.out.println(element.getKey()+" "+element.getValue());
        }

        var iterator = countries.entrySet().iterator();

        while(iterator.hasNext()) {
            var country1 = iterator.next();
            var key = country1.getKey();
            var value = country1.getValue();
            System.out.println(country1);

        }
        var country2 = countries.values().iterator();


    }

}
