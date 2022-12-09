package Class30;

public class finallyBlockDemo {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }catch (ArithmeticException anyVariable){
            System.out.println("operation not allowed");
        }finally {
            System.out.println("This block is always executed no matter what");
        }

    }
}
