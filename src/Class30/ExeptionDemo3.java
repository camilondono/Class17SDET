package Class30;

public class ExeptionDemo3 {
    public static void main(String[] args) {

        try{
            String name=null;
            System.out.println(name.length());
        }catch (Exception anyVariable){
            System.out.println("back up code");
        }
        System.out.println("some important lines of of code 1");
        System.out.println("some important lines of of code 2");
        System.out.println("some important lines of of code 3");
        System.out.println("some important lines of of code 4");

        //  String name=null;
        //  System.out.println(name.length());  will not show lines below "moved to line 5 & 6
        System.out.println("some important lines of of code 5");
        System.out.println("some important lines of of code 6");
        System.out.println("some important lines of of code 7");

    }
}
