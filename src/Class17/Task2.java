package Class17;

public class Task2 {

    public static String reverseStr(String str) {
        // String newStr;
        //StringBuilder sb = new StringBuilder(str);
        //sb.reverse();
        //newStr = sb.toString();
        // return newStr;
        // we can also use return new StringBuilder(str).reverse().toString();
    return new StringBuilder(str).reverse().toString();

    }
      public static void main(String[]args){
            System.out.println(Task2.reverseStr("Sunday"));



    }
}