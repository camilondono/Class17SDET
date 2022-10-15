package Class19;

public class student {
    // write a student class that has instance variables name and address.
    // create a constructor that will initialize those variables. print name & address
    // of given student using displayInfo Method().

    private String name;
    private String address;

    public student (String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("My name is "+name+" i live in "+address);
    }

    public static void main(String[] args) {
        new student("Camilo","123 Syntax Boulevard, Technologies USA").displayInfo();
    }
}

