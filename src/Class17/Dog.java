package Class17;
//CONSTRUCTOR
public class Dog {
   private String name;
   private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName,String dogBreed, String dogColor, int dogAge, double dogWeight){

        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }
    void printInfo(){
        System.out.println("name "+name+" "+" Breed"+" age "+age);
    }

    public static void main(String[] args) {
       // Dog dog=new Dog();
        //dog.name="Tommy";
        //dog.breed="Huskey";
        //dog.color="Grey";
        //dog.age=10;
        //dog.weight=65;
        Dog dog=new Dog("tommy", "Husky", "Grey", 10,65);

       // Dog dog2=new Dog();
       // dog2.name="Thor";
       // dog2.breed="Bull dog";
        //dog2.color="Brown";
        //dog2.age=12;
       // dog2.weight=78;
       Dog dog2=new Dog("Thor", "Bull dog","Brown", 12, 78);
        dog.printInfo();

    }
}
