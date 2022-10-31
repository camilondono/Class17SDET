package Class24;

import java.util.ArrayList;

public class ArrayListDemoOne {
    public static void main(String[] args) {

        ArrayList<String> colors=new ArrayList<>();
        // use add method to insert elements in an Arraylist
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        //prints all the elements
        System.out.println(colors);
        //get method prints individual elements in an Arraylist
        System.out.println(colors.get(0));  // this is how to print color in certain index
        System.out.println(colors.get(5));
        System.out.println(colors.size()); // this is how you get the size of the ArrayList

        //getting all the elements through normal loop
        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println("-------------------");

        //getting all the elements through enhanced loop
        for(String color:colors){
            System.out.println(color);
        }



    }
}
