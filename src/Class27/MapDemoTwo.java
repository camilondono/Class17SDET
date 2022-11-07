package Class27;

import java.util.LinkedHashMap;

public class MapDemoTwo {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> beatyProduct = new LinkedHashMap<>();
        beatyProduct.put("Foundation", 35.5);
        beatyProduct.put("Blush",20.0);
        beatyProduct.put("Lisptick",3.99);

        LinkedHashMap<String,Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("conditioner",20.4);
        cosmetics.put("Shampoo",18.9);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beatyProduct);
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);

    }
}
