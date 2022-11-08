package ReviewClass6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        /*if we Do not override equals metdod in our custome classes most of the collections framework
         will not work properly for those classes*/

        Set<Student> students = new HashSet<>(); // upcasting
        students.add(new Student("Josh","Platin","12345"));
        students.add(new Student("Juan","Trabuco","98765"));
        students.add(new Student("Diego","Ruiz","24680"));
        students.add(new Student("Carlos","Gonzales","36963"));
        System.out.println(students);

        List<Student> setStudents = new ArrayList<>(students);
        System.out.println(setStudents.get(1));



    }
}
