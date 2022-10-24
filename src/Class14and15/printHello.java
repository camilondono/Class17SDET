package Class14and15;

public class printHello {

    //method thta does not take any parameters end prints some lines in the console
    void printHello(){

        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    // a method that takes a single parameter of type String and prints it
    void printWord(String word){
        System.out.println(word);
    }


    public static void main(String[] args) {
        printHello obj= new printHello();
        obj.printHello();
        obj.printWord("Camilo dont worry it is Java");
        obj.printWord("This method can print multiple strings");
    }
}
