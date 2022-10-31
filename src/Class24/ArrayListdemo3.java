package Class24;

import java.util.ArrayList;

public class ArrayListdemo3 {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        System.out.println(chars);

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats =new ArrayList<>();
        floats.add(10.5f);
        floats.add(12.5f);
        floats.add(16.8f);
        System.out.println(floats);



    }
}
