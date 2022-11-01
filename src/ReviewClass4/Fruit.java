package ReviewClass4;

public class Fruit {
   protected String name;
    String shape;
   private String color;

    public static boolean fresh;

    public Fruit(String name){
        this.name=name;
    }
    Fruit(String name,String shape,String color){
        this(name); // must be the first in this line otherwise error will come up
        this.shape=shape;
        this.color=color;
    }
    void grow(){  //constructor can also have access modifiers
        System.out.println("All fruits grow fresh "+fresh);
    }
    public static void havepeel(){
        System.out.println("All fruits need to be peeled");
    }
    protected void haveBenefits(){     //constructor can also have access modifiers
        System.out.println("All fruits are good for your health");
    }
}
