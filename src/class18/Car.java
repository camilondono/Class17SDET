package class18;

import Class26.Insurance;

public class Car extends Insurance {     // class should have the same name of file otherwise it won't work.
                       // common class has many names like parent class super class or base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
                        // if a field or method has private access modifier in parent class child claases cant use it
    private String engineClass;

    public Car(String adam, String tesla_model_s) {
        super();
    }

    public Car() {

    }

    void printCarDetails() {
        System.out.println("Model " + model + " Make " + make + " Color " + color);
    }

    @Override
    protected void getQuote() {

    }

    @Override
    public void cancelInsurance() {

    }
}
class BMW extends Car{
   double engineCC;

    public BMW(String adam, String tesla_model_s) {
        super(adam, tesla_model_s);
    }

    public BMW() {
        super();
    }
}
class tesla extends Car{

    public tesla(String adam, String tesla_model_s) {
        super(adam, tesla_model_s);
    }
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

    public Toyota(String adam, String tesla_model_s) {
        super(adam, tesla_model_s);
    }
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