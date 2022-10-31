package Class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Camilo");
        names.add("Viviana");
        names.add("Celeste");
        names.add("Lukas");
        names.add(2,"Lukas Again");
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(1,100);
        numbers.set(0,12000); // this replaces the value of the indexes

        System.out.println(numbers);

    }
}
