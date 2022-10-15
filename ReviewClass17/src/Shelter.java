public class Shelter {
    public static void main(String[] args) {
        Dog dog1=new Dog();

        //How to access instance variables
        Dog.breed="Husky";
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();
        Dog dog2=new Dog();
        dog2.name="Sharky";
        dog2.weight=10;
        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        float price2 = (float) dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());
    }
}
