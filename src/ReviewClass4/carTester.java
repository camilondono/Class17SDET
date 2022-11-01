package ReviewClass4;

public class carTester {
    public static void main(String[] args) {

        Car car=new Tesla("Tesla","ModelX1.0","white");
        car.drive();
        car.start();
        car.stop();
        //car.charge();  // this method can not be called because is only fpr the child class



        Tesla tesla=new Tesla("Tesla","Modelx1.2","black");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();

    }
}
