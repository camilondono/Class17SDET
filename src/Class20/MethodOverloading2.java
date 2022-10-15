package Class20;

public class MethodOverloading2 {
    static void F1(String name, int number) {
        System.out.println("1");
    }

    // we overloaded the method by changing the number of parameters
    static void F1(String name, int number, int number2) {
        System.out.println("2");
    }

    // we overloaded by changing the data type
    static void F1(int num1, int number) {
        System.out.println("3");
    }

    static void F1(int number, String name) {
        System.out.println("4");
    }

    public static void main(String[] args) {
        MethodOverloading2 md=new MethodOverloading2();
        md.F1("Camilo",20, 45);
    }
}