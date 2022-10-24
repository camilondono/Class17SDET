package ReviewClassOct20;

public class Apple extends Fruit{
    String size;
    String taste;
    double price;
    Apple(String name, String shape, String color,String size) {
        super(name, shape, color);
        //super(name);          // this is not possible bc this.keyword and super can not be together
        this.size=size;         // unless you initialized a variable and use it in the same class
    }
    Apple(String name, String shape, String color,String size,String taste,double price){
        this(name,shape,color,size);
        this.taste=taste;
        this.price=price;
    }

    //overloading - methods with same name within same class

    //how to achive overloading:
    //1.change number of parameters
    //2. type of parameters

    //in overloading method signature must be different

    void makeJuice(){
        System.out.println("from"+name+" we can make "+taste+"Juice");
    }
    void makeJuice(String fruit){
        System.out.println("We can make juice from "+name+" mix with "+fruit);
    }
    //this is not overloading --> signature is the same
    // String makeJuice(){      }

    public static void main(String[] args) {
        Apple app=new Apple("apple","circle","red","big");
        // app.color; not visible since access modifier is PRIVATE
        System.out.println(app.name);
        System.out.println(app.shape);

        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();//fruit class
        app.haveBenefits();




    }
}
