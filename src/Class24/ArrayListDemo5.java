package Class24;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);

        colors.remove(2);
        System.out.println(colors);
    }
}
