package Class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("Eyeliner");
        makeUpItem.add("Lipstick");


        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        ArrayList<String> beautyProducts = new ArrayList<>();
       // adds everything from makeUpItem and beautyProducts together
        beautyProducts.addAll(makeUpItem);                      // to add both arrays
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("Lotion");                     // to remove one item
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics);                    // removes all products in cosmetics
        System.out.println(beautyProducts);
        beautyProducts.clear();                                 //clears everything
        System.out.println(beautyProducts);


    }
}
