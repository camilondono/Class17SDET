package Class19;

public class Task1 {

    // write a student class that have instance variables name and adrress. create a constructor that will
    //initialize those variables name & address of given student using displayInfo method.
    public static void main(String[] args) {
      Student Josh=new Student("Naughty josh", "123 camelot");
    }

}
class Student {
    String name;
    String address;
    public Student(String name, String address){
        this.name=name;
        this.address=address;

    }
    void displayInfo(){
        System.out.println("name "+name+" Address"+address);
    }
}