package ReviewClass4;

public abstract class Car {

    String color,make,model;
    public static final int WHEELS=4;

    public Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;

    }
    void drive(){
        System.out.println("All cars can drive");
    }
    abstract void start();

    abstract  void stop();

}
 class Tesla extends Car{

    Tesla(String make, String model, String color){
        super(make,model,color);
    }
    public void start(){
        System.out.println(make +" Starts automatically");
    }
    public void stop(){
        System.out.println(make+" stops when we press the brake");
    }
    public void charge(){
        System.out.println("you need to charge you Car");
    }
}
