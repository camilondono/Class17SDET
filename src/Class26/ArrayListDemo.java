package Class26;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs= new ArrayList<>();
        dogs.add(new Dog("Taro","Brwon","Shiba"));
        dogs.add(new Dog("toby","black","teacup"));
        dogs.add(new Dog("luna","white","bulldog"));

        System.out.println(dogs);

    }
}
