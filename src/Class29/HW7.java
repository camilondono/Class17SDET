package Class29;

import java.util.ArrayList;

public class HW7 {
    public static void main(String[] args) {

        /*Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers*/

        ArrayList<Integer> number= new ArrayList<>();
        number.add(5);
        number.add(11);
        number.add(16);
        number.add(20);
        number.add(23);
        number.add(24);
       var sum=0;
        for(var num:number ){
            sum+=num;

        }
        System.out.println(sum);


    }
}
