package Class21;

public class Animal {
    String name;
    String color;
    String breed;

    void sleep(){
        System.out.println("Animals Normally sleep for 6 hours");
    }
    void eat(){
        System.out.println("Grass and meet");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("I like to sleep for 20 hours");
    }
    void eat(){
        System.out.println("i like to eat fish");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println("I like to sleep for 10 hours");
    }
    void eat(){
        System.out.println("dogs like to eat meat");
    }
}