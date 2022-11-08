package ReviewClass6;

import java.util.ArrayList;

public class ListDemoWithcustomClass {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("josh","Platin","12345"));
        students.add(new Student("Camilo","Londono","98765"));
        students.add(new Student("Ashgar","Nasir","54637"));
        students.add(new Student("kevin","toreto","978546"));

        //System.out.println(students);

        // comig up next how we can remove elements how we can acces methods from a class

       // for (Student student:students) {
         //   student.printName();

        //}
        Student joshAgain = new Student("josh","Platin","12345");
        System.out.println(students.contains(joshAgain));
        System.out.println(joshAgain);
        System.out.println(students);

    }
}
