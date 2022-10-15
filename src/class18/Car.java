package class18;

public class Car {     // class should have the same name of file otherwise it won't work.
                       // common class has many names like parent class super class or base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
                        // if a field or method has private access modifier in parent class child claases cant use it
    private String engineClass;

    void printCarDetails() {
        System.out.println("Model " + model + " Make " + make + " Color " + color);
    }
}
class BMW extends Car{
   double engineCC;

}
class tesla extends Car{

}
class Toyota extends Car {
                              //String model;  \
                              // String make;    \
                              //int year;          \
                              //String color;       example of what it looks like without using extends Car
                              //double engineCC;   /
                              //int topSpeed;     /
                              //double price;    /
    double engineCC;
}
class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x8";
        bmw.engineCC=500;
        bmw.printCarDetails();


    }


}