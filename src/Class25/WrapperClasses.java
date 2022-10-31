package Class25;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
        // Integer wrappedNum=Integer.valueOf(num);
        //Integer wrappedNum=num;
       // AutoBoxing or automatic conversion of a primitive to a wrapper type

        Integer wrappedNum=num;
        System.out.println(wrappedNum);
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        //unboxing converting a wrapper type to a corresponding primitive type
        // int num2=wrappedNum.intValue();


    }
}
