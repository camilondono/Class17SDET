package ReviewClass6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListsDemo {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add("dog"); // when we use the simple add method that takes one parameter elements are added
        animals.add("cat"); //at the end of the list
        animals.add("lion");
        animals.add("monkey");
        animals.add("tiger");
        animals.add("panda");
        animals.add("horse");
        System.out.println(animals);
        // how to print the size of each word from this list?
        for(String element:animals){
            System.out.println(element.length());
        }

        //how can we remove words which have more than 4 letters?
        //animals.removeIf(x->x.length()>4);  // lambdas
        //System.out.println(animals);

        //  if element is more than 4 letters we want to replace it with camel
        //1. we should not use iterator bc we are not performing any operation that can change the size of the list
        // we should not use enhanced forloop here as we are not printing the data we are updating the data
        // as we need the index to update the data we should use simple for loop

        for(int i=0; i< animals.size(); i++){
            if(animals.get(i).length()>4){
                animals.set(i,"Camel"); //set method replaces the element
            }

        }
        System.out.println(animals);

        System.out.println(animals.subList(0,3)); // will print dog,cat,lion includes 1st index but excludes the last1

        ListIterator<String> stringListIterator = animals.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }


    }
}
