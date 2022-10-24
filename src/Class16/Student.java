package Class16;

public class Student {

    private static int numberOfStudent;
    private String id;
    private String name;

    public static void main(String[] args) {
       String name;
       String id;
       int numberOfStudent;


        Student roman=new Student();
        roman.id="1";
       roman.name="Ivan";
        Student.numberOfStudent++;

        Student camilo=new Student();
        roman.id="2";
        Student.numberOfStudent++;
        System.out.println(roman.numberOfStudent);
        System.out.println(Student.numberOfStudent);
    }
}
