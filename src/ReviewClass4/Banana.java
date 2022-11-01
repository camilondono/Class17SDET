package ReviewClass4;

public class Banana extends Fruit {

    String origin;

    Banana(String name,String shape,String color){
        super(name,shape,color);
        this.origin=origin;
    }
    void makeSmoothie(){
        System.out.println("from "+name+" we get a good smoothie");
    }
    void makepie(){
        System.out.println("Banana pie is delicious");
    }
    //when child class have same method name as super class
    //overriding 2-methods with same name but inside different classes
    // how to override
    //1. method signature must be the same
    //2.return type must be the same
    //3. access modifier can be same or higher "bigger scope"
    public void grow(){
        System.out.println(name+" grow fast and fresh");

    }

    public static void main(String[] args) {
        Banana banana=new Banana("Banana","curved shape","yellow");

        banana.haveBenefits();//fruit
        banana.makeSmoothie();//banana
        banana.grow();

        Banana.havepeel();
        System.out.println("---------------------------");
        //runtime polymorphism
        Fruit fruit=new Banana("banana","banana shape","green");
        fruit.grow();
        fruit.haveBenefits();

        fruit.havepeel();// executed the method from the parent class "fruit"
    }
}
